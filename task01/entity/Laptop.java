package by.tc.task01.entity;

public class Laptop extends Appliance{

	private int batteryCapacity;
	private String os;
	private int memoryRom;
	private int systemMemory;
	private double cpu;
	private int displayInch;
	
	public Laptop() {
		
	}
	
	public Laptop(int batteryCapacity, String os, int memoryRom, int systemMemory, double cpu, int displayInch) {
		this.batteryCapacity = batteryCapacity;
		this.os = os;
		this.memoryRom = memoryRom;
		this.systemMemory = systemMemory;
		this.cpu = cpu;
		this.displayInch = displayInch;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	public String getOs() {
		return os;
	}
	
	public void setOs(String os) {
		this.os = os;
	}
	
	public int getMemoryRom() {
		return memoryRom;
	}
	
	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}
	
	public int getSystemMemory() {
		return systemMemory;
	}
	
	public void setSystemMemory(int systemMemory) {
		this.systemMemory = systemMemory;
	}
	
	public double getCpu() {
		return cpu;
	}
	
	public void setCpu(double cpu) {
		this.cpu = cpu;
	}
	
	public int getDisplayInch() {
		return displayInch;
	}
	
	public void setDisplayInch(int displayInch) {
		this.displayInch = displayInch;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + batteryCapacity;
		long temp;
		temp = Double.doubleToLongBits(cpu);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + displayInch;
		result = prime * result + memoryRom;
		result = prime * result + ((os == null) ? 0 : os.hashCode());
		result = prime * result + systemMemory;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (batteryCapacity != other.batteryCapacity)
			return false;
		if (Double.doubleToLongBits(cpu) != Double.doubleToLongBits(other.cpu))
			return false;
		if (displayInch != other.displayInch)
			return false;
		if (memoryRom != other.memoryRom)
			return false;
		if (os == null) {
			if (other.os != null)
				return false;
		} else if (!os.equals(other.os))
			return false;
		if (systemMemory != other.systemMemory)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Laptop: batteryCapacity = " + batteryCapacity + ", os = " + os + ", memoryRom = " + memoryRom
				+ ", systemMemory = " + systemMemory + ", cpu = " + cpu + ", displayInch = " + displayInch;
	}
	
}
