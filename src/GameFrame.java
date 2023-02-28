import javax.swing.*;

public class GameFrame extends JFrame {

    GameFrame()
    {
        GamePanel panel= new GamePanel();
        JButton button=new JButton("Start");
        this.add(panel);
        this.setTitle("Snake -_-_-_->");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}
