package com;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class TimeClient {

	public static void main (String[] args) throws Exception{
		URL url = new URL("http://localhost:8080/ts?wsdl");
		
		// 
		QName qname = new QName("http://com/","TimeServerImplService");
		
		// Factory del servicio
		Service service = Service.create(url, qname);
		
		TimeServer eif = service.getPort(TimeServer.class);//Obtiene la interfce del web service
		
		System.out.println(eif.getTimeAsString());
		System.out.println(eif.getTimeElapsed());
	}
}
