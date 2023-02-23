package com.cumorahcenter.month_01.weel_03;

import java.util.HashMap;

/**
 * Created by Gabriel Aguilera on 2/23/23
 */
public class Welcome {
	
	private static HashMap<String, String> database;
	
	static void init() {
		database = new HashMap<>();
		database.put("english" , "Welcome");
		database.put("czech" , "Vitejte");
		database.put("danish" , "Velkomst");
		database.put("dutch" , "Welkom");
		database.put("estonian" , "Tere tulemast");
		database.put("finnish" , "Tervetuloa");
		database.put("flemish" , "Welgekomen");
		database.put("french" , "Bienvenue");
		database.put("german" , "Willkommen");
		database.put("irish" , "Failte");
		database.put("italian" , "Benvenuto");
		database.put("latvian" , "Gaidits");
		database.put("lithuanian" , "Laukiamas");
		database.put("polish" , "Witamy");
		database.put("spanish" , "Bienvenido");
		database.put("swedish" , "Valkommen");
		database.put("welsh" , "Croeso");
		
		
	}
	
	public static String greet(String language) {
		init();
		return database.containsKey(language) ? database.get(language) : database.get("english");
	}
}
