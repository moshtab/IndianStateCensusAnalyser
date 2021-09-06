package com.day29.IndianStateCensusAnalyser;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.opencsv.CSVReader;

public class StateCensusAnalyser {
	private static final String File_Name = "src/main/java/resources/censusStateData.csv";

	public static void main(String[] args) {
		System.out.println("Welcome to Indian State census Analyser Program");
		readCensusData();

	}

	private static void readCensusData() {
		try (Reader reader = Files.newBufferedReader(Paths.get(File_Name));
				CSVReader csvReader = new CSVReader(reader);) {
			String[] arr;
			while ((arr = csvReader.readNext()) != null) {
				System.out.println("StateName :" + arr[0]);
				System.out.println("CensusCounts :" + arr[1]);

				System.out.println("====================");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
