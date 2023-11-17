package application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.List;


public class ExerciseCodeContainer {

    public static String lireExercice(int numeroExo) {
        String cheminFichier = "/src/textesExos/Exercice" + numeroExo + ".txt";

        try {
            List<String> lignes = Files.readAllLines(Paths.get(System.getProperty("user.dir"), cheminFichier));


            StringBuilder sb = new StringBuilder();
            for (String s : lignes){
                sb.append(s + "\n");
            }
            return sb.toString();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String lireCorrection(int numeroCorr){
        return lireExercice(numeroCorr);
    }
}
