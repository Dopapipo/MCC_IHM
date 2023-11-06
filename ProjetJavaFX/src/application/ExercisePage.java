package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class ExercisePage extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		BorderPane root = new BorderPane();
		VBox exercices = new VBox(30);
		exercices.setPadding(new Insets(100,20,150,20));
		Label[] labelsListeExos = new Label[8];
		//--------------------Labels liste exos-------------------\\
		for (int i = 0;i<labelsListeExos.length;i++) {
			labelsListeExos[i]= new Label();
			labelsListeExos[i].setFont(Font.font("Verdana",13));
			exercices.getChildren().add(labelsListeExos[i]);
			labelsListeExos[i].setTextAlignment(TextAlignment.JUSTIFY);
			labelsListeExos[i].setWrapText(true);
			labelsListeExos[i].setPrefWidth(170);
		}
		
		labelsListeExos[0].setText("Sujets d'exercices :");
		labelsListeExos[1].setText("Structure fondamentale du langage");
		labelsListeExos[2].setText("Démarrage");
		labelsListeExos[3].setText("Algorithme de César");
		labelsListeExos[4].setText("Reconnaissance de mains dans un jeu de poker");
		labelsListeExos[5].setText("Poker Fermé");
		labelsListeExos[6].setText("Les Méthodes");
		labelsListeExos[7].setText("Lambda");
		
		//---------------------------------------------------------------------------
					//ENTETE

		GridPane structure = new GridPane();
		
		
		GridPane entete = new GridPane();
		
		HBox logo = new HBox();
		Label logoText = new Label("Miage Code Crafting");
		//on va supprimer logoText après l'insertion de l'image
		logo.getChildren().addAll(logoText);
		logo.setPadding(new Insets(20));
		entete.add(logo, 0, 0);
		logoText.setTextFill(Color.WHITE);
		
		TextFlow titre = new TextFlow();
		titre.setTextAlignment(TextAlignment.CENTER);
		titre.setPadding(new Insets(20));
		Text poo = new Text("INF2 - Programmation Orientée Objet \n");
		poo.setFont(Font.font("Arial", 30));
		poo.setFill(Color.WHITE);
		Text miage = new Text("L3 - MIAGE Classique \n");
		miage.setFont(Font.font("Arial", FontPosture.ITALIC, 20));
		miage.setFill(Color.WHITE);
		Text universite = new Text("Université Paris 1 Panthéon-Sorbonne");
		universite.setFont(Font.font("Arial", 10));
		universite.setFill(Color.WHITE);
		titre.getChildren().addAll(poo, miage, universite);
		entete.add(titre, 1, 0, 3, 1);
		
		VBox connexion = new VBox();
		Label connexionText = new Label("Connexion");
		//il faut aussi inserer le logo discord
		connexion.getChildren().addAll(connexionText);
		connexion.setPadding(new Insets(20));
		entete.add(connexion, 4, 0);
		
		GridPane corps = new GridPane();
		
		structure.add(entete, 0, 0, 5, 1);
		structure.add(corps, 0, 1, 5, 5);
		structure.setPadding(new Insets(0,20,0,50));
		//-----------------------------------------------------------------
							//Page Centrale
		Label titrePage = new Label("Exercices d'application");
		titrePage.setFont(Font.font("Verdana",FontWeight.BOLD,25));
		Label sousTitre1 = new Label("STRUCTURE FONDAMENTALE DU LANGAGE");
		sousTitre1.setFont(Font.font("Verdana",FontWeight.BOLD,18));
		Label sousTitre2 = new Label("DEMARRAGE");
		Label sousTitre3 = new Label("ALGORITHME DE CESAR");
		Label sousTitre4 = new Label("RECONNAISSANCE DE MAINS DANS UN JEU DE POKER");
		Label sousTitre5 = new Label("POKER FERME");
		Label sousTitre6 = new Label("LES METHODES");
		Label sousTitre7 = new Label("LAMBDA");
		sousTitre7.setFont(Font.font("Verdana",FontWeight.BOLD,18));
		sousTitre6.setFont(Font.font("Verdana",FontWeight.BOLD,18));
		sousTitre5.setFont(Font.font("Verdana",FontWeight.BOLD,18));
		sousTitre4.setFont(Font.font("Verdana",FontWeight.BOLD,18));
		sousTitre3.setFont(Font.font("Verdana",FontWeight.BOLD,18));
		sousTitre2.setFont(Font.font("Verdana",FontWeight.BOLD,18));
		
		
				//------------Boutons------------\\
		Button[] boutonsExos = new Button[20];
		HBox[] hBoxExos = new HBox[10];
		for (int i = 0;i<hBoxExos.length;i++) {
			hBoxExos[i] = new HBox(25);
		}
		for (int i = 0;i<boutonsExos.length;i++) {
			boutonsExos[i]=new Button();
			boutonsExos[i].setPrefSize(120, 30);
			hBoxExos[i/2].getChildren().add(boutonsExos[i]);
		}
		
		boutonsExos[0].setText("Exercice 1");
		boutonsExos[1].setText("Correction 1");
		boutonsExos[2].setText("Exercice 2");
		boutonsExos[3].setText("Correction 2");
		boutonsExos[4].setText("Exercice 3");
		boutonsExos[5].setText("Correction 3");
		boutonsExos[6].setText("Exercice 4");
		boutonsExos[7].setText("Correction 4");
		boutonsExos[8].setText("Exercice 5");
		boutonsExos[9].setText("Correction 5");
		boutonsExos[10].setText("Exercice 6");
		boutonsExos[11].setText("Correction 6");
		boutonsExos[12].setText("Exercice 7");
		boutonsExos[13].setText("Correction 7");
		boutonsExos[14].setText("Exercice 8");
		boutonsExos[15].setText("Correction 8");
		boutonsExos[16].setText("Exercice 9");
		boutonsExos[17].setText("Correction 9");
		boutonsExos[18].setText("Exercice 10");
		boutonsExos[19].setText("Correction 10");
		/*exo1.setStyle( "-fx-background-color: beige;");
		correction1.setStyle( "-fx-background-color: beige;");
		exo1.setFont(Font.font("Verdana",FontWeight.BOLD,16));
		correction1.setFont(Font.font("Verdana",FontWeight.BOLD,16));*/
		
		//
		
		VBox pane = new VBox(9);
		pane.setPadding(new Insets(50));
		pane.getChildren().addAll(titrePage,sousTitre1,hBoxExos[0],sousTitre2,hBoxExos[1],hBoxExos[2],hBoxExos[3],sousTitre3,hBoxExos[4],sousTitre4,hBoxExos[5],sousTitre5,hBoxExos[6],sousTitre6,hBoxExos[7],sousTitre7,hBoxExos[8],hBoxExos[9]);
		
		
		
		//---------------------------------------------------------------\\
								// Stage & Scene
		root.setLeft(exercices);
		root.setCenter(pane);
		root.setTop(structure);
		Scene scene = new Scene(root,1000,800);
		scene.getStylesheets().add("application/application.css");
		/*Button justForFocus = new Button();
		justForFocus.setPrefHeight(0);
		justForFocus.setPrefWidth(0);
		justForFocus.setStyle("-fx-background-color: white;");
		pane.getChildren().add(justForFocus);
		justForFocus.requestFocus();*/
		arg0.setScene(scene);
		arg0.show();
		
	}
	
	public static void main(String...args) {
		launch(args);
	}
}
