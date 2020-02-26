package com.hms.kafka.springbootkafkaconsumersample.model;

public class Shipment {
	
	private String shipmentId;
	private String shipmentName;
	private String transportMode;
	private String srcLocation;
	private String destLocation;
	
	
	public String getShipmentId() {
		return shipmentId;
	}
	public void setShipmentId(String shipmentId) {
		this.shipmentId = shipmentId;
	}
	public String getShipmentName() {
		return shipmentName;
	}
	public void setShipmentName(String shipmentName) {
		this.shipmentName = shipmentName;
	}
	public String getTransportMode() {
		return transportMode;
	}
	public void setTransportMode(String transportMode) {
		this.transportMode = transportMode;
	}
	public String getSrcLocation() {
		return srcLocation;
	}
	public void setSrcLocation(String srcLocation) {
		this.srcLocation = srcLocation;
	}
	public String getDestLocation() {
		return destLocation;
	}
	public void setDestLocation(String destLocation) {
		this.destLocation = destLocation;
	}
	
	
	@Override
	public String toString() {
		return "Shipment [shipmentId=" + shipmentId + ", shipmentName=" + shipmentName + ", transportMode="
				+ transportMode + ", srcLocation=" + srcLocation + ", destLocation=" + destLocation + "]";
	}

}
