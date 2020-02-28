public class SimpleArray {
    public static void main(String[] args) {
    String[] u2Albums = new String[5];
    u2Albums[0] = "Unforgetable Fire / 1984";
    u2Albums[1] = "Achtung Baby / 1991";
    u2Albums[2] = "Zooropa / 1993";
    u2Albums[3] = "Pop / 1997";
    u2Albums[4] = "Songs Of Experience / 2017";

    String album = u2Albums[3];
    System.out.println(album);

    int numberOfAlbums = u2Albums.length;

    System.out.println("Lista wybranych albumów U2 zawiera" + " " + numberOfAlbums + " " + "pozycji.");
    }
}