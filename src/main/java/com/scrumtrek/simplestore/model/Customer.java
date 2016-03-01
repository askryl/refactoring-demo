package com.scrumtrek.simplestore.model;

import com.scrumtrek.simplestore.Report;
import com.scrumtrek.simplestore.ReportCalculator;

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


	public void addRental(Rental arg){
		m_Rentals.add(arg);
	}

	public String Statement()
	{
		Report report = new ReportCalculator().calculate(m_Rentals);
				
		String result = "Rental record for " + m_Name + "\n";
		for (Report.RentalReport rentalReport: report.getRentalReports()) {
			for (Report.MovieReport movieReport: rentalReport.getMovieReports()) {
				result += "\t" + movieReport.getMovieTitle() + "\t" + movieReport.getAmount() + "\n";
			}
		}

//		for (Report.RentalReport movieReport: report.getRentalReports()) {
//			result += "\t" + movieReport.getMovieTitle() + "\t" + movieReport.getAmount() + "\n";
//		}
		result += "Amount owed is " + report.getTotalAmount() + "\n";
		result += "You earned " + report.getFrequentRenterPoints() + " frequent renter points.";
		return result;
	}
}

