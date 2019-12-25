package by.tc.task01.main;

import java.util.List;

import by.tc.task01.entity.Appliance;

public class PrintApplianceInfo {
	
	public static void print(List<Appliance> appliances) {
		if(appliances != null) {
			for(Appliance appliance : appliances) {
				System.out.println(appliance.toString());
			}
		}
	}
}
