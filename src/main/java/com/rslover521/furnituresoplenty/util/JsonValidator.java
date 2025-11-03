package com.rslover521.furnituresoplenty.util;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class JsonValidator {
    public static void main(String[] args) {
		boolean allValid = true;
		String[] allDirectories = {
			"src/main/resources/assets/furnituresoplenty/models/item",
			"src/main/resources/assets/furnituresoplenty/blockstates",
			"src/main/resources/assets/furnituresoplenty/models/block"
		};

		ArrayList<String> invalidFiles = new ArrayList<>();

		for(String fileDir : allDirectories) {
			System.out.println("Checking: " + fileDir + "......");
			File dir = new File(fileDir);
        	for (File file : dir.listFiles((d, name) -> name.endsWith(".json"))) {
            	try (FileReader reader = new FileReader(file)) {
                	JsonParser.parseReader(reader);
                	System.out.println(file.getName() + " ✅ valid");
            	} catch (JsonSyntaxException | IOException e) {
                	System.err.println(file.getName() + " ❌ invalid");
					allValid = false;
					invalidFiles.add(file.getName());
                	e.printStackTrace();
            	}
       		}
		}

		if(allValid) { 
			System.out.println("✅ All valid. Good to go!"); 
		} else { 
			System.out.println("❌ Not all valid. Please check the console for any file errors.\nHere is a list of invalid files: ");
			for(String dir : invalidFiles) {
				System.out.println(dir);
			} 
		}
    }
}

