package com;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface TimeServer {
	
	@WebMethod
	@WebResult(partName = "time_response") //esta anotación cambia el WSDL el tag part name cambia de "return" (default) a los que se indique aquí
	String getTimeAsString();
	
	
	@WebMethod
	@WebResult(partName = "time_response")
	long getTimeElapsed();
}

//SEI
