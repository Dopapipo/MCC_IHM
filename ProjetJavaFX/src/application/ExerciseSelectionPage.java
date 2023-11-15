package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class ExerciseSelectionPage extends Application {

	@Override
	public void start(Stage arg0) throws Exception {

		BorderPane root = new BorderPane();
		VBox exercices = new VBox(30);
		exercices.setPadding(new Insets(100,20,150,20));
		exercices.setStyle("-fx-background-color: #0E336A;");
		Label[] labelsListeExos = new Label[8];
		//--------------------Labels liste exos-------------------\\
		
		/*
		VBox exercices1 = new VBox(10); // 10 est l'espace vertical entre les éléments
		exercices1.setPadding(new Insets(100, 20, 150, 20));
		exercices1.setStyle("-fx-background-color: #0E336A;");
		

		for (int i = 0; i < labelsListeExos.length; i++) {
		    labelsListeExos[i] = new Label();
		    labelsListeExos[i].setFont(Font.font("Verdana", 13));
		    exercices1.getChildren().add(labelsListeExos[i]);
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

		root.setLeft(exercices1);

		for (Label label : labelsListeExos) {
		    label.setTextFill(Color.WHITE);
		} */
		/*
		Line verticalLine = new Line();
		verticalLine.setStyle("-fx-stroke: #C19233;"); // Couleur de la ligne
		exercices1.getChildren().add(verticalLine);
		*/ //ca marche pas 
		
		VBox exercices1 = new VBox(10); // 10 est l'espace vertical entre les éléments
		exercices1.setPadding(new Insets(100, 20, 150, 20));
		exercices1.setStyle("-fx-background-color: #0E336A;");

		for (int i = 0; i < labelsListeExos.length; i++) {
		    labelsListeExos[i] = new Label();
		    labelsListeExos[i].setFont(Font.font("Verdana", 13));
		    exercices1.getChildren().add(labelsListeExos[i]);

		    // Ajoutez une ligne Separator après chaque Label, sauf après le dernier
		    if (i < labelsListeExos.length - 1) {
		        Separator separator = new Separator();
		        separator.setPadding(new Insets(5, 0, 5, 0)); // Ajustez l'espacement comme vous le souhaitez
		        exercices1.getChildren().add(separator);
		    }

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

		root.setLeft(exercices1);

		for (Label label : labelsListeExos) {
		    label.setTextFill(Color.WHITE);
		}

		//---------------------------------------------------------------------------
					//ENTETE

        
        GridPane structure = new GridPane();

        GridPane entete = new GridPane();
        entete.setStyle("-fx-background-color: #C19233;");
        structure.add(entete, 0, 0, 3, 1); // Utilisez trois colonnes

        HBox logo = new HBox();
        Label logoText = new Label("Miage Code Crafting");
        logo.getChildren().addAll(logoText);
        logo.setPadding(new Insets(20, 20, 20, 20));
        entete.add(logo, 0, 0);
        
        TextFlow titre = new TextFlow();
        titre.setTextAlignment(TextAlignment.CENTER);
        titre.setPadding(new Insets(20, 150, 20, 150));

        Text poo = new Text("INF2 - Programmation Orientée Objet \n");
        poo.setFont(Font.font("Arial Narrow", FontWeight.BOLD, 30));
        poo.setFill(Color.WHITE);

        Text miage = new Text("L3 - MIAGE Classique \n");
        miage.setFont(Font.font("Arial Narrow", FontWeight.BOLD, FontPosture.ITALIC, 20));
        miage.setFill(Color.WHITE);
        
        Text universite = new Text("Université Paris 1 Panthéon-Sorbonne");
        universite.setFont(Font.font("Arial", 10));
        universite.setFill(Color.WHITE);


        titre.getChildren().addAll(poo, miage, universite);

        entete.add(titre, 1, 0); // Utilisez la deuxième colonne

        VBox connexion = new VBox();
        Label connexionText = new Label("Connexion");
        connexion.getChildren().addAll(connexionText);
        connexion.setPadding(new Insets(20));
        entete.add(connexion, 2, 0); 
        GridPane corps = new GridPane();
        structure.add(corps, 0, 1, 5, 5);  // Ajoutez le corps sous l'en-tête dans la grille

        logoText.setTextFill(Color.BLACK);
        poo.setFill(Color.BLACK);
        miage.setFill(Color.BLACK);
        universite.setFill(Color.BLACK);
        connexionText.setTextFill(Color.BLACK);

        Separator ligneSeparator = new Separator();
        ligneSeparator.setPrefWidth(1300);
        ligneSeparator.setPrefHeight(1);
        ligneSeparator.setStyle("-fx-background-color: #C19233;");
        entete.add(ligneSeparator, 0, 1, 5, 1);
        
      
		//-----------------------------------------------------------------
							//Page Centrale
        
        
		Label titrePage = new Label("Exercices d'application");
		titrePage.setFont(Font.font("Arial Narrow",FontWeight.BOLD,25));
		Label sousTitre1 = new Label("STRUCTURE FONDAMENTALE DU LANGAGE");
		sousTitre1.setFont(Font.font("Arial Narrow",FontWeight.BOLD,18));
		Label sousTitre2 = new Label("DEMARRAGE");
		Label sousTitre3 = new Label("ALGORITHME DE CESAR");
		Label sousTitre4 = new Label("RECONNAISSANCE DE MAINS DANS UN JEU DE POKER");
		Label sousTitre5 = new Label("POKER FERME");
		Label sousTitre6 = new Label("LES METHODES");
		Label sousTitre7 = new Label("LAMBDA");
		sousTitre7.setFont(Font.font("Arial Narrow",FontWeight.BOLD,18));
		sousTitre6.setFont(Font.font("Arial Narrow",FontWeight.BOLD,18));
		sousTitre5.setFont(Font.font("Arial Narrow",FontWeight.BOLD,18));
		sousTitre4.setFont(Font.font("Arial Narrow",FontWeight.BOLD,18));
		sousTitre3.setFont(Font.font("Arial Narrow",FontWeight.BOLD,18));
		sousTitre2.setFont(Font.font("Arial Narrow",FontWeight.BOLD,18));
		
		VBox pane = new VBox(9);
		pane.setStyle("-fx-background-color: #0E336A;");
		pane.setPadding(new Insets(50));
		pane.getChildren().addAll(titrePage, sousTitre1);
		addSeparatorLine(pane);
		pane.getChildren().addAll(sousTitre2);
		addSeparatorLine(pane);
		pane.getChildren().addAll(sousTitre3);
		addSeparatorLine(pane);
		pane.getChildren().addAll(sousTitre4);
		addSeparatorLine(pane);
		pane.getChildren().addAll(sousTitre5);
		addSeparatorLine(pane);
		pane.getChildren().addAll(sousTitre6);
		addSeparatorLine(pane);
		pane.getChildren().addAll(sousTitre7);

		titrePage.setTextFill(Color.WHITE);
		sousTitre1.setTextFill(Color.WHITE);
		sousTitre2.setTextFill(Color.WHITE);
		sousTitre3.setTextFill(Color.WHITE);
		sousTitre4.setTextFill(Color.WHITE);
		sousTitre5.setTextFill(Color.WHITE);
		sousTitre6.setTextFill(Color.WHITE);
		sousTitre7.setTextFill(Color.WHITE);
		
		

		
				//------------Boutons------------\\
		
		
		Button[] boutonsExos = new Button[20];
		HBox[] hBoxExos = new HBox[10];

		for (int i1 = 0; i1 < hBoxExos.length; i1++) {
		    hBoxExos[i1] = new HBox(); // ligne pour initialiser les HBox
		    hBoxExos[i1].setSpacing(10);
		    for (int j = 0; j < 2; j++) {
		        int index = i1 * 2 + j;
		        boutonsExos[index] = new Button();
		        boutonsExos[index].setPrefSize(120, 30);
		        hBoxExos[i1].getChildren().add(boutonsExos[index]);
		    }
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
		
		for (Button bouton : boutonsExos) {
		    bouton.setTextFill(Color.web("#F4E1B9"));
		}
		/*
		VBox pane1 = new VBox(9);
		pane1.setStyle("-fx-background-color: #0E336A;");
		pane1.setPadding(new Insets(50));
		pane1.getChildren().addAll(titrePage,sousTitre1,hBoxExos[0],sousTitre2,hBoxExos[1],hBoxExos[2],hBoxExos[3],sousTitre3,hBoxExos[4],sousTitre4,hBoxExos[5],sousTitre5,hBoxExos[6],sousTitre6,hBoxExos[7],sousTitre7,hBoxExos[8],hBoxExos[9]);
		*/
		VBox pane11 = new VBox(9);
		pane11.setStyle("-fx-background-color: #0E336A;");
		pane11.setPadding(new Insets(50));
		pane11.getChildren().addAll(titrePage, sousTitre1);
		addSeparatorLine(pane11);
		pane11.getChildren().addAll(hBoxExos[0]);
		addSeparatorLine(pane11);
		pane11.getChildren().addAll(hBoxExos[1], hBoxExos[2]);
		addSeparatorLine(pane11);
		pane11.getChildren().addAll(hBoxExos[3], sousTitre2);
		addSeparatorLine(pane11);
		pane11.getChildren().addAll(hBoxExos[4]);
		addSeparatorLine(pane11);
		pane11.getChildren().addAll(sousTitre3, hBoxExos[5]);
		addSeparatorLine(pane11);
		pane11.getChildren().addAll(sousTitre4, hBoxExos[6]);
		addSeparatorLine(pane11);
		pane11.getChildren().addAll(sousTitre5, hBoxExos[7]);
		addSeparatorLine(pane11);
		pane11.getChildren().addAll(sousTitre6, hBoxExos[8]);
		addSeparatorLine(pane11);
		pane11.getChildren().addAll(sousTitre7, hBoxExos[9]);
		
		
		//---------------------------------------------------------------\\
								// Stage & Scene
		root.setLeft(exercices1);
		root.setCenter(pane11);
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
		arg0.show();}

		
	private static void addSeparatorLine(VBox container) {
	    Separator separator = new Separator();
	    separator.setPrefWidth(1300);
	    separator.setPrefHeight(1);
	    separator.setStyle("-fx-background-color: #C19233;");
	    container.getChildren().add(separator);
	}
	
	
	public static void main(String...args) {
		launch(args);
	}
}