package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextArea;
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
/*
 * This class will be inherited by different exercise/correction pages
 */
public class ExercisePage extends Application{
	
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
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
        VBox pane11 = new VBox(5);
        TextArea codeArea = new TextArea();
		Label executionSuccess =new Label();
		TextArea terminal = new TextArea();
		String terminalStyle="-fx-control-inner-background:#000000; -fx-font-family: Consolas; -fx-highlight-fill: #00ff00; -fx-highlight-text-fill: #000000; -fx-text-fill: #00ff00; ";
		String codeAreaStyle="-fx-control-inner-background:#000000; -fx-font-family: Consolas; -fx-highlight-fill: #00ff00; -fx-highlight-text-fill: #000000; -fx-text-fill: white; ";

		terminal.setStyle(terminalStyle);
		codeArea.setStyle(codeAreaStyle);
		ExerciseCodeContainer allExos = new ExerciseCodeContainer();
		codeArea.setText(allExos.get(0));
		codeArea.setPrefHeight(450);
		pane11.getChildren().addAll(codeArea,executionSuccess,terminal);
		

		
		
		
		

		
		
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
	public static void main(String...args) {
		launch(args);
	}
}


