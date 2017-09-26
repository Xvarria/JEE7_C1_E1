package com;

import java.util.Date;

import javax.jws.WebService;

@WebService(endpointInterface = "com.TimeServer")
public class TimeServerImp implements TimeServer {

	@Override
	public String getTimeAsString() {
		return new Date().toString();
	}

	@Override
	public long getTimeSlapsed() {
		return new Date().getTime();
	}

}

//SIB
