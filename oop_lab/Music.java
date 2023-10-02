public class Music {
    private String title;
    private Artist artist;
    private String duration;
    private String genre;
    private String albumName;
    private Date release_date;
    Music(String title,Artist artist,String duration,String genre,String albumName,Date release_date){
        this.title=title;
        this.artist=artist;
        this.duration=duration;
        this.genre=genre;
        this.albumName=albumName;
        this.release_date=release_date;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }
    public void serArtist(Artist artist){
        this.artist=artist;
    }
    public Artist getArtist(){
        return artist;
    }
    public void setDuration(String duration){
        this.duration=duration;
    }
    public String getDuration(){
        return duration;
    }
    public void setGenre(String genre){
        this.genre=genre;
    }
    public String getGenre(){
        return genre;
    }
    public void setAlbumName(String albumName){
        this.albumName=albumName;
    }
    public String getAlbumName(){
        return albumName;
    }
    public void setReleaseDate(Date release_date){
        this.release_date=release_date;
    }
    public Date getReleaseDate(){
        return release_date;
    }
    public String toString(){
        String music_details=String.format("%s\t%s\t%s\t%s\t%s\t%s",title,artist,duration,genre,albumName,release_date);
        return music_details;
    }


}
