package fileAssignments;

import java.util.Map;

public class M1 {
	 public static void main(String[] args) {
	       String filePath = "D:\\samplefile.csv"; 
	       Map<String, String> countryCapitalMap = Countrymap.loadCsvFileToMap(filePath);
	       char startsWith = 'M'; 
	        String outputFile = "D:\\filteredCountries.txt"; 
	        Countrymap.writeFilteredCountries(outputFile, countryCapitalMap, startsWith);
	        System.out.println("Filtered countries have been written to the file.");
	 
}}
	


