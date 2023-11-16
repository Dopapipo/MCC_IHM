package application;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciseCodeContainer {
	List<String> exerciseTexts;
	public ExerciseCodeContainer() {
		exerciseTexts = new ArrayList<>();
		//initialiser tous les textes à afficher par défaut dans la console
		String exo1="public class BlockCode {\r\n"
				+ "  public static void main(String...args) {\r\n"
				+ "\r\n"
				+ "    int i;\r\n"
				+ "\r\n"
				+ "    for (int i = 5; i < 12; i++) {\r\n"
				+ "      int j = i;\r\n"
				+ "    }\r\n"
				+ "\r\n"
				+ "    System.out.println(j);\r\n"
				+ "\r\n"
				+ "    int i;\r\n"
				+ "    int j = 0;\r\n"
				+ "    while (i > 10) {\r\n"
				+ "      j += i;\r\n"
				+ "      i++;\r\n"
				+ "    }\r\n"
				+ "\r\n"
				+ "    System.out.println(j);\r\n"
				+ "\r\n"
				+ "  }\r\n"
				+ "}";		
		this.exerciseTexts.add(exo1);
		//faire pareil pour tous les exos
	}
	public String get(int i) {
		return this.exerciseTexts.get(i);
	}
}
