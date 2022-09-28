package com.training.assignment09.Task2;
public class Playlist {
	  private int SIZE = 0;
	  private Song songs[];
	  private int front, rear, count;

	  public Playlist(int size) {
		  SIZE = size;
		  songs = new Song[SIZE];
		  front = -1;
		  rear = -1;
		  count = 0;
	  }

	  public boolean isFull() {
		    if (front == 0 && rear == SIZE - 1) {
		    	return true;
		    }
		    return false;
	  }

	  public boolean isEmpty() {
		    if (count == 0)
		    	return true;
		    else
		    	return false;
	  }

	  public void enqueue(Song song) {

		    if (isFull()) {
		    	System.out.println("---Playlist is full---");
		    }
		    else {
			     if (front == -1) {
			    	 front = 0;
			     }
	
			     rear++;
			     songs[rear] = song;
			     count++;
			     System.out.println("Added " + song.getTitle());
		    }
	  }
	  
	  public Song dequeue() {
		  if(isEmpty()) {
			  System.out.println("---Playlist is empty---");
		  }
		  else {
			  Song s = songs[front];
			  System.out.println("Playing "+s.getTitle()+" by "+s.getSinger());
			  front = (front+1)%SIZE;
			  count--;
			  return s;
		  }
		  
		  return null;
	  }
	  
	  public int getRemainingSong() {
		  return count;
	  }
}