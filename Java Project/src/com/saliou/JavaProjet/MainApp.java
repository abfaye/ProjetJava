package com.saliou.JavaProjet;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class MainApp extends Application{
	private Random rnd = new Random();
   Group root;
   private Scene scene;
   private Thread thread;
   private Pane playfieldlayer;
   private AnimationTimer gameLoop;

	private Image chNo1;
	private Image chNo2;
	private Image chNo3;
	private Image chNo4;
	private Image chNe1;
	private Image chNe2;
	private Image chNe3;
	private Image chNe4;
	private Input input;
	private Scene player;
	private Image chMe1;
	private Image chMe2;
	private Image chMe3;
	private Image chMe4;
	
	//Les SOLDATS
	private ArrayList<Troupes> listeSoldats = new ArrayList<Troupes>();
	private ArrayList<Chateaux> listeChateaux = new ArrayList<Chateaux>();
	private Image image;
	private double tresor;
	private int niveau;
	private Production unitProd;
	
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub

		primaryStage.setTitle("Java Projet");
		
        root = new Group();
        scene = new Scene(root,Settings.SCENE_WIDTH, Settings.SCENE_HEIGHT + Settings.STATUS_BAR_HEIGHT, Color.BLUE);
        scene.getStylesheets().add(getClass().getResource("/css/application.css").toExternalForm());
        primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		
		// create layers
        playfieldlayer = new Pane();
        
        root.getChildren().addAll(playfieldlayer);
        
        loadGame();
        
        gameLoop = new AnimationTimer() {
			
			@Override
			public void handle(long now) {
				// TODO Auto-generated method stub
				
				// player input
				//player.processInput();
				
				
				update();
			}
			
			private void processInput(Input input, long now) {
				
			}
		};
		gameLoop.stop();

	}
	
	protected void update() {
		// TODO Auto-generated method stub
		
	}

	private void loadGame() {
		// TODO Auto-generated method stub
		//Chateau Normal
		chNo1 = new Image(getClass().getResource("/images/imgNo1.jpg").toExternalForm(), 70, 70, true, true);
		chNo2 = new Image(getClass().getResource("/images/imgNo2.jpg").toExternalForm(), 70, 70, true, true);
		chNo3 = new Image(getClass().getResource("/images/imgNo3.jpg").toExternalForm(), 70, 70, true, true);
		chNo4 = new Image(getClass().getResource("/images/imgNo4.jpg").toExternalForm(), 70, 70, true, true);

		//Chateau neutre
		chNe1 = new Image(getClass().getResource("/images/imgNe1.jpg").toExternalForm(), 70, 70, true, true);
		chNe2 = new Image(getClass().getResource("/images/imgNe2.jpg").toExternalForm(), 70, 70, true, true);
		chNe3 = new Image(getClass().getResource("/images/imgNe3.jpg").toExternalForm(), 70, 70, true, true);
		chNe4 = new Image(getClass().getResource("/images/imgNe4.jpg").toExternalForm(), 70, 70, true, true);
		
		//Chateau Joueur
		chMe1 = new Image(getClass().getResource("/images/imgMe1.jpg").toExternalForm(), 70, 70, true, true);
		chMe2 = new Image(getClass().getResource("/images/imgMe2.jpg").toExternalForm(), 70, 70, true, true);
		chMe3 = new Image(getClass().getResource("/images/imgMe3.jpg").toExternalForm(), 70, 70, true, true);
		chMe4 = new Image(getClass().getResource("/images/imgMe4.jpg").toExternalForm(), 70, 70, true, true);
		
		
		input = new Input(scene);
		input.addListeners();

		createChateaux();
		createPlayer();
		createStatusBar();
		
		/*scene.setOnMousePressed(e -> {
			player.setX(e.getX() - (player.getWidth() / 2));
			player.setY(e.getY() - (player.getHeight() / 2));
		});*/
	}
    
   private void createChateaux() {
		// TODO Auto-generated method stub
	   
	   double X = 0, Y = 0;
	   boolean status = true;
	   boolean me = true;
	   boolean neutre = false;
	   
	   for (int i = 0; i < Settings.NB_CHATEAUX; i++) {
		   status = true;
		   while(status) {
			   X = ThreadLocalRandom.current().nextDouble(Settings.SCENE_WIDTH*0.05,Settings.SCENE_WIDTH*0.95-chNo1.getWidth());
			   Y = ThreadLocalRandom.current().nextDouble((Settings.SCENE_HEIGHT-Settings.STATUS_BAR_HEIGHT)*0.05,(Settings.SCENE_HEIGHT));
			   
			   if(i==0) {
				   status = false;
			   }else {
				   for (int j = 0; j < listeChateaux.size(); j++) {
					double x = listeChateaux.get(j).getX();
					double y = listeChateaux.get(j).getY();
					
					if((Math.abs(x-X) < Settings.DISTANCE_CHATEAUX) && (Math.abs(y-Y) < Settings.DISTANCE_CHATEAUX)){
						break;
					}else {
						if(j == listeChateaux.size()-1) {
							status = false;
						}
					}
				}
			   }
		   }
		   
	   
	   int health = 10;
	   int a = rnd.nextInt(2);
		if (a == 1) neutre = false;
		else neutre = true;
		//genere chateaux
		int i1 = rnd.nextInt(4);
		if(i1==0) {
			
			if(me) listeChateaux.add(new Chateaux(playfieldlayer, chMe1, X, Y, health, tresor, niveau, unitProd));
			else if(!neutre) listeChateaux.add(new Chateaux(playfieldlayer, chNe1, X, Y, health, tresor, niveau, unitProd));
			else listeChateaux.add(new Chateaux(playfieldlayer, chNo1, X, Y, health, tresor, niveau, unitProd));
		}else if(i1==1) {
			if(me) listeChateaux.add(new Chateaux(playfieldlayer, chMe2, X, Y, health, tresor, niveau, unitProd));
			else if(!neutre) listeChateaux.add(new Chateaux(playfieldlayer, chNe2, X, Y, health, tresor, niveau, unitProd));
			else listeChateaux.add(new Chateaux(playfieldlayer, chNo2, X, Y, health, tresor, niveau, unitProd));
		}else if(i1==2) {
			if(me) listeChateaux.add(new Chateaux(playfieldlayer, chMe3, X, Y, health, tresor, niveau, unitProd));
			else if(!neutre) listeChateaux.add(new Chateaux(playfieldlayer, chNe3, X, Y, health, tresor, niveau, unitProd));
			else listeChateaux.add(new Chateaux(playfieldlayer, chNo3, X, Y, health, tresor, niveau, unitProd));
		}else if(i1==3) {
			if(me) listeChateaux.add(new Chateaux(playfieldlayer, chMe4, X, Y, health, tresor, niveau, unitProd));
			else if(!neutre) listeChateaux.add(new Chateaux(playfieldlayer, chNe4, X, Y, health, tresor, niveau, unitProd));
			else listeChateaux.add(new Chateaux(playfieldlayer, chNo4, X, Y, health, tresor, niveau, unitProd));
		}
		me = false;
	}
   }
	private void createStatusBar() {
		// TODO Auto-generated method stub
		
	}

	private void createPlayer() {
		// TODO Auto-generated method stub
		
	}
	

	public static void main(String[] args) {
		launch(args);
	}

}
