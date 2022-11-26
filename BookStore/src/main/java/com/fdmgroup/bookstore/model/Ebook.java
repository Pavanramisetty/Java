package com.fdmgroup.bookstore.model;

public class Ebook {
   private double SizeMegaBytes;

public double getSizeMegaBytes() {
	return SizeMegaBytes;
}

public void setSizeMegaBytes(double sizeMegaBytes) {
	SizeMegaBytes = sizeMegaBytes;
}

public Ebook() {
	super();
}

public Ebook(double sizeMegaBytes) {
	super();
	SizeMegaBytes = sizeMegaBytes;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	long temp;
	temp = Double.doubleToLongBits(SizeMegaBytes);
	result = prime * result + (int) (temp ^ (temp >>> 32));
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
	Ebook other = (Ebook) obj;
	if (Double.doubleToLongBits(SizeMegaBytes) != Double.doubleToLongBits(other.SizeMegaBytes))
		return false;
	return true;
}
   
   
}
