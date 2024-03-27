package Content;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GameWindow extends JFrame {
    private JPanel panel1;
    private JButton awkwardBtn;
    private JButton talkBtn;
    private JButton numberBtn;
    private JButton flirtBtn;
    private JButton aggressiveBtn;
    private JLabel comfortLabel;
    private JLabel awkwardLabel;
    private JLabel engagementLabel;
    private JLabel numberLabel;
    private JTextField comfortTF;
    private JTextField awkwardTF;
    private JTextField engagementTF;
    private JTextField phoneTF;

    int comfort = 1;
    int awkward = 0;
    int engaged = 0;
    int number = 0;


    private void setTextFieldText() {
        comfortTF.setText(String.valueOf(comfort));
        awkwardTF.setText(String.valueOf(awkward));
        engagementTF.setText(String.valueOf(engaged));
        phoneTF.setText(String.valueOf(number));
    }

    public GameWindow() {

        setTitle("Dating Sim");
        setContentPane(panel1);
        setMinimumSize(new Dimension(1000, 650));
        setVisible(true);

        String filepath2 = "src/Content/Click.wav";
        buttonClickSound clickSound = new buttonClickSound();

        talkBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickSound.playButtonClick(filepath2);

                Random rand = new Random();
                try {
                    System.out.println("!");
                    Thread.sleep(500);
                    System.out.println("...");
                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                }
                    if (rand.nextDouble() < 0.7) {
                        comfort++;
                        if (comfort > 0) {
                            JOptionPane.showMessageDialog(new JFrame(), "She talks back with you",
                                    "Dialog",
                                    JOptionPane.INFORMATION_MESSAGE);
                            setTextFieldText();
                        }
                    } else {
                        comfort--;
                        if (comfort > 0) {
                            JOptionPane.showMessageDialog(new JFrame(), "She gets uncomfortble...",
                                    "Dialog",
                                    JOptionPane.ERROR_MESSAGE);
                            setTextFieldText();
                        } else if (comfort < 1 && engaged < 1) {
                            JOptionPane.showMessageDialog(new JFrame(), "Sorry I have to go...",
                                    "Dialog",
                                    JOptionPane.ERROR_MESSAGE);
                            setTextFieldText();
                            dispose();
                            System.exit(0);
                        }
                    }
            }
        });
        flirtBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickSound.playButtonClick(filepath2);

                Random rand = new Random();
                try {
                    System.out.println("!");
                    Thread.sleep(500);
                    System.out.println("...");
                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                }
                if (rand.nextDouble() < 0.5 && comfort > 3 && awkward < 1) {
                    comfort++;
                    engaged++;
                    if (comfort > 0) {
                        JOptionPane.showMessageDialog(new JFrame(), "She flirts back with you",
                                "Dialog",
                                JOptionPane.INFORMATION_MESSAGE);
                        setTextFieldText();
                    }
                } else {
                    comfort = comfort - 2;
                    engaged = engaged - 1;
                    if(comfort > 0) {
                        JOptionPane.showMessageDialog(new JFrame(), "She gets uncomfortble...",
                                "Dialog",
                                JOptionPane.ERROR_MESSAGE);
                        setTextFieldText();
                    }
                    else if (comfort < 1 && engaged < 1)
                    {
                        JOptionPane.showMessageDialog(new JFrame(), "Sorry I have to go...",
                                "Dialog",
                                JOptionPane.ERROR_MESSAGE);
                        setTextFieldText();
                        dispose();
                        System. exit(0);
                    }
                }
            }
        });
        aggressiveBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickSound.playButtonClick(filepath2);

                Random rand = new Random();
                try {
                    System.out.println("!");
                    Thread.sleep(500);
                    System.out.println("...");
                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                }
                if (rand.nextDouble() < 0.4 && comfort > 4 && awkward < 1) {
                    comfort++;
                    engaged = engaged + 3;
                    if (comfort > 0) {
                        JOptionPane.showMessageDialog(new JFrame(), "She likes your moves!",
                                "Dialog",
                                JOptionPane.INFORMATION_MESSAGE);
                        setTextFieldText();
                    }
                } else {
                    comfort = comfort - 3;
                    engaged = engaged - 2;
                    if(comfort > 0) {
                        JOptionPane.showMessageDialog(new JFrame(), "She gets uncomfortble...",
                                "Dialog",
                                JOptionPane.ERROR_MESSAGE);
                        setTextFieldText();
                    }
                    else if (comfort < 1)
                    {
                        JOptionPane.showMessageDialog(new JFrame(), "Sorry I have to go...",
                                "Dialog",
                                JOptionPane.ERROR_MESSAGE);
                        setTextFieldText();
                        dispose();
                        System. exit(0);
                    }
                }
            }
        });
        numberBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickSound.playButtonClick(filepath2);

                Random rand = new Random();
                try {
                    System.out.println("!");
                    Thread.sleep(500);
                    System.out.println("...");
                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                }
                if (rand.nextDouble() < 0.5 && comfort > 5 && awkward < 1) {
                    comfort++;
                    number++;
                    if (comfort > 0) {
                        JOptionPane.showMessageDialog(new JFrame(), "She gives you her number!",
                                "Dialog",
                                JOptionPane.INFORMATION_MESSAGE);
                        setTextFieldText();
                        dispose();
                        System.exit(0);
                    }
                } else {
                    comfort = comfort - 5;
                    awkward++;
                    if (comfort < 1) {
                        JOptionPane.showMessageDialog(new JFrame(), "Sorry I have to go...",
                                "Dialog",
                                JOptionPane.ERROR_MESSAGE);
                        setTextFieldText();
                        dispose();
                        System. exit(0);
                    } else {
                        JOptionPane.showMessageDialog(new JFrame(), "She feels awkward...",
                                "Dialog",
                                JOptionPane.ERROR_MESSAGE);
                        setTextFieldText();
                    }

                }
            }
        });
        awkwardBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickSound.playButtonClick(filepath2);

                Random rand = new Random();
                try {
                    System.out.println("!");
                    Thread.sleep(500);
                    System.out.println("...");
                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                }
                if (rand.nextDouble() < 0.7 && comfort > 3 && awkward >= 1) {
                    comfort++;
                    awkward = 0;
                    if (comfort > 0) {
                        JOptionPane.showMessageDialog(new JFrame(), "She starts to feel comfortable again.",
                                "Dialog",
                                JOptionPane.INFORMATION_MESSAGE);
                        setTextFieldText();
                    }
                } else if (rand.nextDouble() > 0.7) {
                    comfort = comfort - 2;
                    if (comfort < 1)
                    {
                        JOptionPane.showMessageDialog(new JFrame(), "Sorry I have to go...",
                                "Dialog",
                                JOptionPane.ERROR_MESSAGE);
                        setTextFieldText();
                        dispose();
                    }
                }
                else {
                    comfort = comfort - 2;
                    awkward = awkward + 1;
                    JOptionPane.showMessageDialog(new JFrame(), "She feels even more uncomfortable...",
                                "Dialog",
                                JOptionPane.ERROR_MESSAGE);
                    setTextFieldText();
                    dispose();
                }
            }
        });
    }
}

