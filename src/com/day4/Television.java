package com.day4;

public class Television {
	private int channel;
	private int volume;
	private boolean state;

	public Television() {

	}

	public Television(boolean state, int channel, int volume) {
		this.state = state;
		this.channel = channel;
		this.volume = volume;
	}

	public boolean changeState() {
		if (state == false)
			return true;
		else
			return false;
	}

	
	
	
	public void display() {
		System.out.println("current channel:" +channel +"current volume:" +volume);
	}

	public int changeVolume(int volume) {
		// TODO Auto-generated method stub
		this.volume=volume;
		System.out.println(this.volume);
		return this.volume;
	}

	public int changeChannel(int channel) {
		// TODO Auto-generated method stub
		this.channel=channel;
		return this.channel;
	}
}
	