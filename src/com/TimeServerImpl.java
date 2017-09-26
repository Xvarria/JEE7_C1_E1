package com;

import java.util.Date;

import javax.jws.WebService;

@WebService(endpointInterface = "com.TimeServer")
public class TimeServerImpl implements TimeServer {

	@Override
	public String getTimeAsString() {
		return new Date().toString();
	}

	@Override
	public long getTimeElapsed() {
		return new Date().getTime();
	}

}

//SIB
