package com.deanveloper.plugdj;

public class JSONStorage {

	private int id;  
	private String DJDisplayName;  
	private String songName;
	private String author;

	// getters and setters  
	public int getDJId() {  
		return id;
	}  
	public void setDJId(int id) {
		this.id = id;
	}  
	public String getDJDisplayName() {
		return DJDisplayName;
	}
	public void setDJDisplayName(String DJDisplayName) {
		this.DJDisplayName = DJDisplayName;
	}
	
	public String getSongName(){
		return songName;
	}
	
	public void setSongName(String songName){
		this.songName = songName;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public void setAuthor(String author){
		this.author = author;
	}
}  