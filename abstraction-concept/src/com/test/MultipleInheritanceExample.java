package com.test;
interface Camera
{
	void click();
	default void show()
	{
		System.out.println("A");
	}
}


interface MusicPlayer
{
	void playMusic();
	
	default void show()
	{
		System.out.println("B");
	}
}


class SmartPhone implements Camera, MusicPlayer
{

	@Override
	public void playMusic() {

		System.out.println("Photo clicked");
	}

	@Override
	public void click() {

		System.out.println("Playing music");
	}

	@Override
	public void show() {
		Camera.super.show();//resolving conflict
	}
	
}


public class MultipleInheritanceExample {

	public static void main(String[] args) {
		
		SmartPhone phone=new SmartPhone();
		
		phone.click();
		phone.playMusic();

	}

}
