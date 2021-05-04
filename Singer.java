
//** Main singer class
public class Singer  {

   int singer_id;
   String singer_name;
   String singer_address;
   String singer_date;
   int singer_albums;


  // Constructors
  public Singer() {

  }

  public Singer(int singer_id) {

  }

  public Singer(int singer_id, String singer_name) {

  }

  public Singer(int singer_id, String singer_name, String singer_address) {

  }

  public Singer(int singer_id, String singer_name, String singer_address, String singer_date) {

  }

  public Singer(int singer_id, String singer_name, String singer_address, String singer_date, int albums) {

  }

  //** Getters
  public int getSingerId() {
    return singer_id;
  }

  public String getSingerName() {
    return singer_name;
  }

  public String getSingerAddress() {
    return singer_address;
  }

  public String getSingerDate() {
    return singer_date;
  }

  public int getSingerAlbums() {
    return singer_albums;
  }

  //** Setters
  public void setSingerId(int id) {
    this.singer_id = id;
  }

  public void setSingerName(String name) {
    this.singer_name = name;
  }

  public void setSingerAddress(String address) {
    this.singer_address = address;
  }

  public void setSingerDate(String date) {
    this.singer_date = date;
  }

  public void setSingerAlbums(int albums) {
    this.singer_albums = albums;
  }

}


//** Singers Driver class
class SingDriver {


  public static void main(String[] args) {

    Singer newSinger = new Singer();

    // Setting values
    newSinger.singer_id = 1;
    newSinger.singer_name = "Thom";
    newSinger.singer_address = "175 Stone House Lane";
    newSinger.singer_date = "01/20/2021";
    newSinger.singer_albums = 7;

    System.out.println(newSinger);

    // Printing values
    System.out.println(newSinger.singer_id);
    System.out.println(newSinger.singer_name);
    System.out.println(newSinger.singer_address);
    System.out.println(newSinger.singer_date);
    System.out.println(newSinger.singer_albums);


  }


}
