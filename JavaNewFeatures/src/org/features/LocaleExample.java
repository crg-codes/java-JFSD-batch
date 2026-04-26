package org.features;

import java.util.Locale;

public class LocaleExample {

	public static void main(String[] args) {
		
		Locale locale=Locale.getDefault();
		
		System.out.println(locale.getDisplayCountry());
		System.out.println(locale.getDisplayLanguage());
		System.out.println(locale.getDisplayName());
		System.out.println(locale.getLanguage());
		System.out.println(locale.getCountry());
		
		Locale enLocale=new Locale("en", "US");
		Locale frLocale=new Locale("fr", "FR");
		Locale esLocale=new Locale("es", "ES");


		System.out.println(enLocale.getDisplayLanguage());
		System.out.println(enLocale.getDisplayLanguage(frLocale));
		System.out.println(enLocale.getDisplayLanguage(esLocale));
	}

}
