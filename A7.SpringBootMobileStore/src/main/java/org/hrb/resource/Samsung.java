package org.hrb.resource;

import java.util.ArrayList;
import java.util.List;

import org.hrb.model.Device;
import org.hrb.model.Devices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// We should always return a object , so it can be represented using json , should not return any list or another data type.
// bcz working with object is convinient and application can become scalable.
@RestController
@RequestMapping("/samsung")
public class Samsung {
	
	@RequestMapping("/devices")
	public Devices getDevices(){
		
		List<Device> list = new ArrayList<>();
		list.add(new Device("Note9", "Smartphone"));
		list.add(new Device("S10", "Smartphone"));
		
		
		Devices devices= new Devices(list);
		
		return devices;
	}

}
