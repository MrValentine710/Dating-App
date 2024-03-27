package Content;

public class Main {

public static void main(String[] args) {
    DatingAppMenu menu = new DatingAppMenu();
    menu.setVisible(true);

    String filepath = "src/Content/Swervin.wav";
    musicStuff musicObject = new musicStuff();
musicObject.playMusic(filepath);
}
}