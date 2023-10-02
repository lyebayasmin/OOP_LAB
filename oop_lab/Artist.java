public class Artist {
    private String name;
    private String nationality;
    private double rating;
    Artist(String name,String nationality,double rating){
        this.name=name;
        this.nationality=nationality;
        this.rating=rating;

    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setNationality(String nationality){
        this.nationality=nationality;
    }
    public String getNationality(){
        return nationality;
    }
    public void setRating(double rating){
        this.rating=rating;
    }
    public double getRating(){
        return rating;
    }
   public String toString(){
        String artist_details=String.format("%s\t%s\t%f",name,nationality,rating);
        return artist_details;
   }
}
