package jp.learningdesign.javastudy;

class Computer {
	public String os;
	public int memory;
	public int storage;
}

public class ComputerInfo {
	public static void main(String[] args) {
		Computer desktop = new Computer();
		desktop.os = "Windows10";
		desktop.memory = 10;
		desktop.storage = 256;
		
		System.out.println("\nOS: " + desktop.os);
		System.out.println("Memory: " + desktop.memory + "GB");
		System.out.println("Storage: " + desktop.storage + "GB");
		
		Computer desktop2 = desktop;
		desktop2.os = "Ubuntu";
		
		System.out.println("\nOS: " + desktop2.os);
		System.out.println("Memory: " + desktop2.memory + "GB");
		System.out.println("Storage: " + desktop2.storage + "GB");
		
		System.out.println("\nOS: " + desktop.os);
		System.out.println("Memory: " + desktop.memory + "GB");
		System.out.println("Storage: " + desktop.storage + "GB");
	}
}
