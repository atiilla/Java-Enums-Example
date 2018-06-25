package com.first.app;

import com.first.app.utils.fileTypes;

public class App {

	public static void main(String[] args) {

		utils x = new utils();
		String url = "http://127.0.0.1/java/java.doc";

		x.Printer(url, fileTypes.DOC);

	}

}
