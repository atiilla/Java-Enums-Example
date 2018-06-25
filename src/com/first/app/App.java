package com.first.app;

import com.first.app.utils.fileTypes;

public class App {

	public static void main(String[] args) {

		utils x = new utils();
		String url = "http://127.0.0.1/java/java.DOC";

		x.Printer(url, fileTypes.DOC);

		System.out.println(url.length());

		switch (url.substring(url.length() - 3).toLowerCase()) {
		case "doc":
			System.out.println("DOC File");
		}

	}

}
