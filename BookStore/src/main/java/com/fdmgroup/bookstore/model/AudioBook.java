package com.fdmgroup.bookstore.model;

public class AudioBook {
   
	private int timeLengthSongs;

	public AudioBook(int timeLengthSongs) {
		super();
		this.timeLengthSongs = timeLengthSongs;
	}

	public AudioBook() {
		super();
	}

	public int getTimeLengthSongs() {
		return timeLengthSongs;
	}

	public void setTimeLengthSongs(int timeLengthSongs) {
		this.timeLengthSongs = timeLengthSongs;
	}

	@Override
	public String toString() {
		return "AudioBook [timeLengthSongs=" + timeLengthSongs + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + timeLengthSongs;
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
		AudioBook other = (AudioBook) obj;
		if (timeLengthSongs != other.timeLengthSongs)
			return false;
		return true;
	}
}
