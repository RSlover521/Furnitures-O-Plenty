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

		int count = 0;

		ArrayList<String> invalidFiles = new ArrayList<>();

		for(String fileDir : allDirectories) {
			System.out.println("Checking: " + fileDir + "......");
			File dir = new File(fileDir);
        	for (File file : dir.listFiles((d, name) -> name.endsWith(".json"))) {
            	try (FileReader reader = new FileReader(file)) {
                	JsonParser.parseReader(reader);
                	System.out.println(file.getName() + " ✅ Valid");
					count ++;
            	} catch (JsonSyntaxException | IOException e) {
                	System.err.println(file.getName() + " ❌ Invalid");
					allValid = false;
					invalidFiles.add(file.getName());
					count ++;
                	e.printStackTrace();
            	}
       		}
		}

		System.out.println("-----------------------------------\nSummary:");

		if(allValid) { 
			System.out.println("✅ All valid. Good to go! \nScanned " + count + " files in total."); 
		} else { 
			System.out.println("❌ Not all valid. Please check the console for any file errors. " + 
			"\nScanned " + count + " files in total." +
				"\nHere is a list of invalid files: ");
			for(String dir : invalidFiles) {
				System.out.println(dir);
			} 
		}
    }
}

