package com.c42.controller;

import java.awt.im.InputContext;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import com.c42.constant.ParkingConstant;
import com.c42.dao.ParkingDAO;


public class ParkingSystem {
	public static HashMap<String,Integer> inputCommandMap;
	ParkingDAO parkingDao = null;
	static 
	{
		inputCommandMap = new HashMap<String, Integer>();
		inputCommandMap.put("create_parking_lot", ParkingConstant.CREATE_PARKING);
		inputCommandMap.put("park", ParkingConstant.PARK);
		inputCommandMap.put("leave", ParkingConstant.LEAVE);
		inputCommandMap.put("status", ParkingConstant.STATUS);
		inputCommandMap.put("registration_numbers_for_cars_with_colour", ParkingConstant.REGISTRATION_NUMBERS_WITH_COLOR);
		inputCommandMap.put("slot_number_for_registration_number", ParkingConstant.SLOT_NUMBER_FOR_REGISTRATION);
		inputCommandMap.put("slot_numbers_for_cars_with_colour", ParkingConstant.SLOT_NUMBERS_WITH_COLOR);
	}
	
	public static void main(String[] args) throws IOException {
		ParkingSystem parkSytem = new ParkingSystem();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input="";
        if (br != null) {
			while (true) {
				input = br.readLine();
				parkSytem.processInputCommand(input);
			}
        }
	}
	
	public void processInputCommand(String input) {
		String[] temp = input.split(" ");
		if (parkingDao == null
				&& inputCommandMap.get(temp[0]) != ParkingConstant.CREATE_PARKING) {
			System.out
					.println("Parking is not created till now. Please first create parking..");
			return;
		}
		
		String command = temp[0];
		String value = temp.length == 2 ? temp[1] : "";
		
		switch(inputCommandMap.get(command)) {
			case ParkingConstant.CREATE_PARKING :
				parkingDao = new ParkingDAO(Integer.parseInt(value));
				break;
			case ParkingConstant.PARK : 
				break;
			case ParkingConstant.LEAVE : 
				break;
			case ParkingConstant.STATUS :
				break;
			case ParkingConstant.REGISTRATION_NUMBERS_WITH_COLOR :
				break;
			case ParkingConstant.SLOT_NUMBERS_WITH_COLOR :
				break;
			case ParkingConstant.SLOT_NUMBER_FOR_REGISTRATION : 
				break;
		}
	}

}
