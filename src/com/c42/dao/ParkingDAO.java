package com.c42.dao;

import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

import com.c42.model.Vehical;

public class ParkingDAO {
	
	private int noOfSlots;
	private HashMap<Integer,Vehical> parking;
	private PriorityQueue<Integer> freeParkingSlots;
	
	public ParkingDAO() {
		this.noOfSlots = 0;
		this.parking = new HashMap<Integer, Vehical>(this.noOfSlots);
		freeParkingSlots = new PriorityQueue<Integer>();
	}
	
	public ParkingDAO(int noOfSlots) {
		this.noOfSlots = noOfSlots;
		this.parking = new HashMap<Integer, Vehical>(this.noOfSlots);
		freeParkingSlots = new PriorityQueue<Integer>();
		initialize();
	}
	
	public void initialize() {
		for(int i = 0; i<noOfSlots; i++) {
			freeParkingSlots.add(i);
		}
	}
	
	public int parkVehical(Vehical vehical) {
		return -1;
	}
	
	public void leaveParking() {
		
	}
	
	public void parkingStatus() {
		
	}
	
	public List<Vehical> getRegistrationNumbersWithColor(String color) {
		return null;
	}
	
	public List<Integer> getSlotNumbersWithColor(String color) {
		return null;
	}
	
	public int getSlotNumberForVehical(String registrationNumber) {
		return -1;
	}
}
