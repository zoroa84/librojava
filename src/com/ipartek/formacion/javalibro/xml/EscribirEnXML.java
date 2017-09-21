package com.ipartek.formacion.javalibro.xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;

public class EscribirEnXML {
	static final String CANCIONES_XML = "data\\canciones.xml";

	public static void main(String[] args) {
		File file = new File(CANCIONES_XML);

		try {
			File file1 = new File(CANCIONES_XML);
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = factory.newDocumentBuilder();
			Document doc = dBuilder.parse(file1);
			doc.getDocumentElement().normalize();

			dBuilder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		doc.getDocumentElement().normalize();
	}

}
