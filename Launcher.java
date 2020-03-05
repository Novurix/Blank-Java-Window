public class Launcher {

    static int WIDTH = 1000, HEIGHT = WIDTH/12 * 9; /* Gives a 16:9 ratio */
    public static void main(String[] args) {
        new WindowDisplay("Example Title", WIDTH, HEIGHT);
    }
}