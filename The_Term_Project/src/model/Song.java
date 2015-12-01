package model;
public class Song {
	private String artist;
	private String title;
	private String tags;
	private String mood;
	
	public Song(String artist, String title, String tags, String mood){
		this.setArtist(artist);
		this.setTitle(title);
		this.setTags(tags);
		this.setMood(mood);
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMood() {
		return mood;
	}

	public void setMood(String mood) {
		this.mood = mood;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}
	
	
}
