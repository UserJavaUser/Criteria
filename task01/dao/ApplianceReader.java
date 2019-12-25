package by.tc.task01.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ApplianceReader {
	
	private String filename;
	
	public ApplianceReader(String fileName) {
		this.filename = fileName;
	}
	
	public List<String> readApplianceType(String applianceType) throws Exception{
		if(applianceType == null) {
			return readAll();
		}else {
			return readWithType(applianceType);
		}
	}

	private List<String> readWithType(String applianceType) throws Exception{
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		try {
			List<String> appliancesByType = new ArrayList<>();
			String s;
			while((s = br.readLine())!= null) {
				if(s.contains(applianceType)) {
					appliancesByType.add(s);
				}	
			}
			return appliancesByType;
		}catch(Exception e) {
			
		}
		finally {
			fr.close();
		}
		return null;
	}

	private List<String> readAll() throws Exception{
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		try {
			List<String> allAppliances = new ArrayList<>();
			String s;
			while((s = br.readLine())!= null) {
					allAppliances.add(s);
			}
			return allAppliances;
		}catch(Exception e) {
			
		}
		finally {
			fr.close();
		}
		return null;
	}
	
}
