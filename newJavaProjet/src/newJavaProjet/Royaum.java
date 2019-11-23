package newJavaProjet;

import java.util.ArrayList;

public class Royaum {
	private ArrayList<ChateauNormal> tableauChateauNormal = new ArrayList<ChateauNormal>();
	private ArrayList<ChateauNeutre> tableuChateau = new ArrayList<ChateauNeutre>();
	private ArrayList<Campagnes> tableauCampagnes = new ArrayList<Campagnes>();

	public Royaum(ArrayList<ChateauNormal> tableauChateauNormal, ArrayList<ChateauNeutre> tableuChateau,
			ArrayList<Campagnes> tableauCampagnes) {
		super();
		this.tableauChateauNormal = tableauChateauNormal;
		this.tableuChateau = tableuChateau;
		this.tableauCampagnes = tableauCampagnes;
	}

}
