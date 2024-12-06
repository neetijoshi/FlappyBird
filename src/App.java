import javax.swing.*;
public class App {
    public static void main(String[] args) throws Exception {
        int boardwidth=360;
        int boardheight=640;
        JFrame frame=new JFrame("Flappy Bird");
        frame.setSize(boardwidth,boardheight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlappyBird flappyBird=new FlappyBird();
        frame.add(flappyBird);
        frame.pack();//since we want 360x340 but not including the title bar
        flappyBird.requestFocus();
        frame.setVisible(true);
    }
}
