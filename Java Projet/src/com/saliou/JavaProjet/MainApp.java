package com.saliou.JavaProjet;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.*;
import javafx.util.*;
import javafx.scene.paint.Color;
import javafx.stage.*;
import javafx.scene.shape.*;
import javafx.animation.RotateTransition;
import javafx.util.Duration;
import javafx.animation.TranslateTransition;


public class MainApp extends Application{
    Group root;
   private Scene scene;
   private Thread thread;

	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		primaryStage.setTitle("java Projet");
		//DUration de deplacement
		/**
		 * Creation de la scene
		 */
		
        root = new Group();
        scene = new Scene(root,Settings.SCENE_WIDTH, Settings.SCENE_HEIGHT +Settings.STATUS_BAR_HEIGHT, Color.BLUE);
        primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
        
	/**
	 * Dans cette partie on creer et initialise deux type de rectangle neutre et occupé 
	 * Les couleur noir represente les rectangle de type couleur
	 * les autre de type occupé
	 */
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle();
		Rectangle rect3 = new Rectangle();
		Rectangle rect4 = new Rectangle();
		Rectangle rect5 = new Rectangle();
		Rectangle rect6 = new Rectangle();
		Rectangle rect9 = new Rectangle();
		Rectangle rectNeutre2 = new Rectangle();
		Rectangle rectNeutre1 = new Rectangle();
		CreateRectangle(rect1 ,primaryStage, 70,  50, Color.ANTIQUEWHITE, Color.BLACK);
		CreateRectangle(rectNeutre2 ,primaryStage, 100,  250, Color.BLACK, Color.BLACK);
		CreateRectangle(rect3 ,primaryStage, 200,  550, Color.ANTIQUEWHITE, Color.BLACK);
		
		CreateRectangle(rect4 ,primaryStage, 400,  150, Color.AZURE, Color.BLACK);
		CreateRectangle(rectNeutre1 ,primaryStage, 500,  350, Color.BLACK, Color.BLACK);
		CreateRectangle(rect6 ,primaryStage, 600,  550, Color.AZURE, Color.BLACK);
		
		CreateRectangle(rect5 ,primaryStage, 800,  350, Color.AZURE, Color.BLACK);
		CreateRectangle(rect2 ,primaryStage, 600,  550, Color.ANTIQUEWHITE, Color.BLACK);


		/*
		 * Creation des premier soldat
		 */
=======
		primaryStage.setTitle("Java Projet");
		primaryStage.setWidth(1000);
		primaryStage.setHeight(700);
		primaryStage.show();
>>>>>>> 69c4e1fa9ca51e99b5c17ed50b3941620c5a7cfc
		
		Circle soldat1 = new Circle();
		Circle soldat2 = new Circle();
		Circle soldat3 = new Circle();
		Circle soldat4 = new Circle();
		Circle soldat5 = new Circle();
		Circle soldat6 = new Circle();

		CreationTroupe(soldat1, primaryStage, 690, 590, Color.RED);
		CreationTroupe(soldat2, primaryStage, 680, 580, Color.RED);
		CreationTroupe(soldat3, primaryStage, 670, 530, Color.RED);
		CreationTroupe(soldat4, primaryStage, 730, 560, Color.RED);
		CreationTroupe(soldat5, primaryStage, 740, 520, Color.RED);
		CreationTroupe(soldat6, primaryStage, 750, 570, Color.RED);
		thread=new Thread();
     for(int i=0;i<100;i++) {
    		 soldat2.setCenterX(soldat2.getCenterX()+1);
    		 soldat2.setCenterY(soldat2.getCenterY()+1);

    		 
    			primaryStage.setResizable(true);
    			
    
     }

	     	
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	/**
	 * 
	 * @param rect : type Rectangle déja creer
	 * @param primaryStage : le fenetre
	 * @param x : coordonné x du rectangle
	 * @param y : coordonne y du rectangle
	 * @param colorFill : la couleur du rectangle
	 * @param colorStrock : la couleur des bordure du rectangle
	 */
	public void CreateRectangle(Rectangle rect ,Stage primaryStage,int x, int y, Color colorFill, Color colorStrock) {
		
		rect.setX(x);
		rect.setY(y);
		rect.setWidth(120);
		rect.setHeight(80);
		rect.setFill(colorFill);
		rect.setStroke(colorStrock);
		rect.setStrokeWidth(5);
		rect.setArcHeight(10);
		rect.setArcWidth(30);
		
		root.getChildren().add(rect);
		primaryStage.setResizable(true);
	}
	/**
	 * 
	 * @param cercle : une cercle de rayon 1 represente les troupes
	 * @param primaryStage :fenetre
	 * @param centerX : centre du soldat
	 * @param centerY : coordonnee du soldat
	 * @param color : pour differancer les soldats
	 */
	public void CreationTroupe(Circle  cercle, Stage primaryStage, int centerX, int centerY, Color color) {
		cercle.setCenterX(centerY);
		cercle.setCenterY(centerY);
		cercle.setFill(color);
		cercle.setRadius(5);
		cercle.setStrokeWidth(5);
		root.getChildren().add(cercle);
		primaryStage.setResizable(true);
	}
<<<<<<< HEAD
=======

>>>>>>> 69c4e1fa9ca51e99b5c17ed50b3941620c5a7cfc
}









