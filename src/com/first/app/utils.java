package com.first.app;

public class utils {
	public enum fileTypes {
		DOC,TXT,PNG
	}
	
	public static void Printer (String url, fileTypes type) {
		if(type == type.DOC) {
			System.out.println(url + " file is printing");
		}
		
		
	}

}
