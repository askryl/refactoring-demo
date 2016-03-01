package com.scrumtrek.simplestore.model;

import com.scrumtrek.simplestore.Report;
import com.scrumtrek.simplestore.ReportCalculator;
import com.scrumtrek.simplestore.formatter.ReportFormatter;
import com.scrumtrek.simplestore.formatter.StringReportFormatter;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String m_Name;
	private List<Rental> m_Rentals = new ArrayList<Rental>();

	public Customer(String name) {
		m_Name = name;
	}

	public String getName() {
		return m_Name;
	}

	public String getM_Name() {
		return m_Name;
	}

	public List<Rental> getM_Rentals() {
		return m_Rentals;
	}

	public void addRental(Rental arg){
		m_Rentals.add(arg);
	}

}

