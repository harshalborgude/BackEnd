package org.drc.model;

import java.util.Date;

public class OrderData {
	
	private String sOrderId;
	private String sTime;    // "hh:mm"
	private String sProduce;
	private int iPricePerKg;
	private int iQuantityInKg;
	
	
	public OrderData(String sOrderId, String sTime, String sProduce, int iPrice, int iQuantityInKg) {
		this.sOrderId = sOrderId;
		this.sTime = sTime;
		this.sProduce = sProduce;
		this.iPricePerKg = iPrice;
		this.iQuantityInKg = iQuantityInKg;
	}

	public String getsOrderId() {
		return sOrderId;
	}

	public void setsOrderId(String sOrderId) {
		this.sOrderId = sOrderId;
	}

	public String getsTime() {
		return sTime;
	}

	public void setsTime(String sTime) {
		this.sTime = sTime;
	}

	public String getsProduce() {
		return sProduce;
	}

	public void setsProduce(String sProduce) {
		this.sProduce = sProduce;
	}

	public int getiPrice() {
		return iPricePerKg;
	}

	public void setiPrice(int iPrice) {
		this.iPricePerKg = iPrice;
	}

	public int getiQuantityInKg() {
		return iQuantityInKg;
	}

	public void setiQuantityInKg(int iQuantityInKg) {
		this.iQuantityInKg = iQuantityInKg;
	}

	@Override
	public String toString() {
		return "OrderData [sOrderId=" + sOrderId + ", sTime=" + sTime + ", sProduce=" + sProduce + ", iPricePerKg="
				+ iPricePerKg + ", iQuantityInKg=" + iQuantityInKg + "]";
	}

}

