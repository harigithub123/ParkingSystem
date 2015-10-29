package com.c42.parking;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;

public class ParkingSystem {
	private int noOfSlots;
	private HashMap<Integer,Vehical> parking;
	private LinkedList<Integer> freeParkingSlots;
	public ParkingSystem() {
		this.noOfSlots = 0;
		this.parking = new HashMap<Integer, Vehical>(this.noOfSlots);
		freeParkingSlots = new LinkedList<Integer>();
	}
	
	public ParkingSystem(int noOfSlots) {
		this.noOfSlots = noOfSlots;
		this.parking = new HashMap<Integer, Vehical>(this.noOfSlots);
		freeParkingSlots = new LinkedList<Integer>();
	}
	
	public boolean isParkingFull() { 
		return freeParkingSlots.size() == 0;
	}
	
	public static void main(String[] args) throws IOException {
		ParkingSystem parkSytem = new ParkingSystem();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String command="";
        if (br != null) {
           command = br.readLine();
           parkSytem.processInputCommand(command);
        }
        System.out.println("name = "+command);
	}
	
	void processInputCommand(String command) {
		
	}

}
