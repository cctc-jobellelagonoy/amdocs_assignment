package com.training.assignment07.Task2;

public class Main {

	public static void main(String[] args) {
		Playlist playlist = new Playlist(5);

		playlist.enqueue(new Song("Willows", "Taylor Swift"));
		playlist.enqueue(new Song("Dandelions", "Ruth B."));
		playlist.enqueue(new Song("Rainbow", "Kacey Musgraves"));
		playlist.enqueue(new Song("Nothing", "Bruno Major"));
		playlist.enqueue(new Song("Pancakes for Dinner", "Lizzy McAlpine"));
		playlist.enqueue(new Song("Pancakes for Dinner", "Lizzy McAlpine"));
		
		System.out.println("\nRemaining songs: "+playlist.getRemainingSong()+"\n");
		
		while(!playlist.isEmpty()) {
			playlist.dequeue();
		}
		
		playlist.dequeue();
		
		System.out.println("\nRemaining songs: "+playlist.getRemainingSong());
	}

}
