package org.drc.model;

import java.util.Objects;

public class MatchedOrder {
	
	private String sDemandOrderId;
	private String sSupplyOrderId;
	private int iSupplyPrice;
	private int iSupplyQuantity;

	public MatchedOrder(String sDemandOrderId, String sSupplyOrderId, int iSupplyPrice, int iSupplyQuantity) {
	
		this.sDemandOrderId = sDemandOrderId;
		this.sSupplyOrderId = sSupplyOrderId;
		this.iSupplyPrice = iSupplyPrice;
		this.iSupplyQuantity = iSupplyQuantity;
	
	}

	public String getsDemandOrderId() {
		return sDemandOrderId;
	}

	public void setsDemandOrderId(String sDemandOrderId) {
		this.sDemandOrderId = sDemandOrderId;
	}

	public String getsSupplyOrderId() {
		return sSupplyOrderId;
	}

	public void setsSupplyOrderId(String sSupplyOrderId) {
		this.sSupplyOrderId = sSupplyOrderId;
	}

	public int getiSupplyPrice() {
		return iSupplyPrice;
	}

	public void setiSupplyPrice(int iSupplyPrice) {
		this.iSupplyPrice = iSupplyPrice;
	}

	public int getiSupplyQuantity() {
		return iSupplyQuantity;
	}

	public void setiSupplyQuantity(int iSupplyQuantity) {
		this.iSupplyQuantity = iSupplyQuantity;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(iSupplyPrice, iSupplyQuantity, sDemandOrderId, sSupplyOrderId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MatchedOrder other = (MatchedOrder) obj;
		return iSupplyPrice == other.iSupplyPrice && iSupplyQuantity == other.iSupplyQuantity
				&& Objects.equals(sDemandOrderId, other.sDemandOrderId)
				&& Objects.equals(sSupplyOrderId, other.sSupplyOrderId);
	}

	@Override
	public String toString() {
		return sDemandOrderId + " " + sSupplyOrderId + " " + iSupplyPrice + "/kg "
				+  iSupplyQuantity + "kg";
	}
	
	

}
