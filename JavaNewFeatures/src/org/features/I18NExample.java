package org.features;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class I18NExample {

	public static void main(String[] args) {
		
		Locale us=new Locale("en","US");
		Locale india=new Locale("hi", "IN");
		
	   ResourceBundle usBundle=ResourceBundle.getBundle("messages",us);
	   ResourceBundle indiaBundle=ResourceBundle.getBundle("messages",india);
	   
	   
	   System.out.println(usBundle.getString("welcome"));
	   System.out.println(indiaBundle.getString("welcome"));
	   
	   
	   System.out.println(usBundle.getString("logout"));
	   System.out.println(indiaBundle.getString("logout"));
	   
	   NumberFormat nf=NumberFormat.getInstance(Locale.FRANCE);
	   System.out.println(nf.format(12345678.56));
	   
	   NumberFormat cf=NumberFormat.getCurrencyInstance(india);
	   System.out.println(cf.format(1000));

	   
	   DateFormat df=DateFormat.getDateInstance(DateFormat.FULL,india);
	   System.out.println(df.format(new Date()));

	}

}
