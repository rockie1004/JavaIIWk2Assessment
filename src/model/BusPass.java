//bus pass information
package model;

public class BusPass {
String type;
String category;
double price;
boolean isReducedFare;
boolean isParatransit;

public BusPass() {};

public BusPass(String type, String category, double price, boolean isReducedFare, boolean isParatransit) {
	this.type = type;
	this.category = category;
	this.price = price;
	this.isReducedFare= isReducedFare;
	this.isParatransit = isParatransit;
}

public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

public boolean isReducedFare() {
	return isReducedFare;
}

public void setReducedFare(boolean isReducedFare) {
	this.isReducedFare = isReducedFare;
}

public boolean isParatransit() {
	return isParatransit;
}

public void setParatransit(boolean isParatransit) {
	this.isParatransit = isParatransit;
}

}
