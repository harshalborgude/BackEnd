package org.hrb.resource;

import java.util.ArrayList;
import java.util.List;

import org.hrb.model.Device;
import org.hrb.model.Devices;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apple")
public class Apple {

	@RequestMapping("/devices")
	public Devices getDevices(){
		List<Device> list = new ArrayList<>();
		list.add(new Device("iphone 1", "Smartphone"));
		list.add(new Device("iphone s", "Smartphone"));
		
		
		Devices devices= new Devices(list);
		return devices;
	}
	
}
