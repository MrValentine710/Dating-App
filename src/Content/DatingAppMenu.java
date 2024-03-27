package Content;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DatingAppMenu extends JFrame{
    public JButton startBtn;
    public JButton quitButton;
    public JPanel datingPanel;
    public GameWindow newGameWindow;

    public DatingAppMenu() {

        setTitle("Dating Sim");
        setContentPane(datingPanel);
        setMinimumSize(new Dimension(730, 650));
        setVisible(true);

        String filepath2 = "src/Content/Click.wav";
        buttonClickSound clickSound = new buttonClickSound();

        startBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickSound.playButtonClick(filepath2);

                newGameWindow = new GameWindow();
                newGameWindow.setVisible(true);
                dispose();
            }
        });
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickSound.playButtonClick(filepath2);
                dispose();
                System. exit(0);
            }
        });
    }
}
