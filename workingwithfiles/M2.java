package fileAssignments;

import java.util.Map;

public class M2 {
	   public static void main(String[] args) {
	       String filePath = "D:\\samplefile.csv"; 
	       Map<String, String> countryCapitalMap = Countrymap.loadCsvFileToMap(filePath);
	       for (Map.Entry<String, String> entry : countryCapitalMap.entrySet()) {
	           System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
	       }
	   }}
	