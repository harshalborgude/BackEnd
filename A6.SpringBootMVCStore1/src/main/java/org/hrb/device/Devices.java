package org.hrb.device;

import java.util.List;

public class Devices {
	
	List<Device> devices;

	public Devices() {
		
	}

	public Devices(List<Device> devices) {
		
		this.devices = devices;
	}

	public List<Device> getDevices() {
		return devices;
	}

	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}

	@Override
	public String toString() {
		return "Devices [devices=" + devices + "]";
	}
	
	

}
