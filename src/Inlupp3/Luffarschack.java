package Inlupp3;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Luffarschack extends JFrame implements ActionListener {

    JPanel panel = new JPanel(new BorderLayout());
    JPanel panelGrid = new JPanel(new GridLayout(3, 3, 4, 4));
    JPanel southPanel = new JPanel();
    int p1Score = 0;
    int p2Score = 0;
    int player = 1;
    int moves = 9;
    JButton[] buttons = new JButton[9];
    JLabel p1Label = new JLabel("Player 1 wins: " + p1Score);
    JLabel p2Label = new JLabel("Player 2 wins: " + p2Score);


    public Luffarschack() {

        add(panel);
        panel.add(panelGrid, BorderLayout.CENTER);
        panelGrid.setBackground(Color.BLACK);
        southPanel.setBackground(Color.ORANGE);
        southPanel.add(p1Label);
        southPanel.add(p2Label);
        panel.add(southPanel, BorderLayout.SOUTH);

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttons[i].addActionListener(this);
            buttons[i].setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            panelGrid.add(buttons[i]);
        }

        setSize(300, 300);
        setTitle("Luffarschack");
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (player == 1) {
            for (int i = 0; i < buttons.length; i++) {
                if (e.getSource() == buttons[i]) {
                    buttons[i].setFont(buttons[i].getFont().deriveFont(30f));
                    buttons[i].setText("X");
                    buttons[i].setForeground(Color.RED);

                }
            }
            player = 2;
            moves--;
            gameOver();
        } else if (player == 2) {
            for (int i = 0; i < buttons.length; i++) {
                if (e.getSource() == buttons[i]) {
                    buttons[i].setFont(buttons[i].getFont().deriveFont(30f));
                    buttons[i].setText("O");
                    buttons[i].setForeground(Color.BLUE);
                }
            }
            player = 1;
            moves--;
            gameOver();
        }

    }

    public void gameOver() {

        if (buttons[0].getText().equalsIgnoreCase("x") && buttons[1].getText().equalsIgnoreCase("x")
                && buttons[2].getText().equalsIgnoreCase("x")) {
            winMessage1();
            restartGame();
            p1Label.setText("Player 1 wins: " + ++p1Score);
        }
        if (buttons[0].getText().equalsIgnoreCase("x") && buttons[3].getText().equalsIgnoreCase("x")
                && buttons[6].getText().equalsIgnoreCase("x")) {
            winMessage1();
            restartGame();
            p1Label.setText("Player 1 wins: " + ++p1Score);
        }
        if (buttons[0].getText().equalsIgnoreCase("x") && buttons[4].getText().equalsIgnoreCase("x")
                && buttons[8].getText().equalsIgnoreCase("x")) {
            winMessage1();
            restartGame();
            p1Label.setText("Player 1 wins: " + ++p1Score);
        }
        if (buttons[0].getText().equalsIgnoreCase("x") && buttons[1].getText().equalsIgnoreCase("x")
                && buttons[2].getText().equalsIgnoreCase("x")) {
            winMessage1();
            restartGame();
            p1Label.setText("Player 1 wins: " + ++p1Score);
        }
        if (buttons[1].getText().equalsIgnoreCase("x") && buttons[4].getText().equalsIgnoreCase("x")
                && buttons[7].getText().equalsIgnoreCase("x")) {
            winMessage1();
            restartGame();
            p1Label.setText("Player 1 wins: " + ++p1Score);
        }
        if (buttons[2].getText().equalsIgnoreCase("x") && buttons[4].getText().equalsIgnoreCase("x")
                && buttons[6].getText().equalsIgnoreCase("x")) {
            winMessage1();
            restartGame();
            p1Label.setText("Player 1 wins: " + ++p1Score);
        }
        if (buttons[2].getText().equalsIgnoreCase("x") && buttons[5].getText().equalsIgnoreCase("x")
                && buttons[8].getText().equalsIgnoreCase("x")) {
            winMessage1();
            restartGame();
            p1Label.setText("Player 1 wins: " + ++p1Score);
        }
        if (buttons[3].getText().equalsIgnoreCase("x") && buttons[4].getText().equalsIgnoreCase("x")
                && buttons[5].getText().equalsIgnoreCase("x")) {
            winMessage1();
            restartGame();
            p1Label.setText("Player 1 wins: " + ++p1Score);
        }
        if (buttons[6].getText().equalsIgnoreCase("x") && buttons[7].getText().equalsIgnoreCase("x")
                && buttons[8].getText().equalsIgnoreCase("x")) {
            winMessage1();
            restartGame();
            p1Label.setText("Player 1 wins: " + ++p1Score);

        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////////

        if (buttons[0].getText().equalsIgnoreCase("o") && buttons[1].getText().equalsIgnoreCase("o")
                && buttons[2].getText().equalsIgnoreCase("o")) {
            winMessage2();
            restartGame();
            p2Label.setText("Player 2 wins: " + ++p2Score);
        }
        if (buttons[0].getText().equalsIgnoreCase("o") && buttons[3].getText().equalsIgnoreCase("o")
                && buttons[6].getText().equalsIgnoreCase("o")) {
            winMessage2();
            restartGame();
            p2Label.setText("Player 2 wins: " + ++p2Score);
        }
        if (buttons[0].getText().equalsIgnoreCase("o") && buttons[4].getText().equalsIgnoreCase("o")
                && buttons[8].getText().equalsIgnoreCase("o")) {
            winMessage2();
            restartGame();
            p2Label.setText("Player 2 wins: " + ++p2Score);
        }
        if (buttons[0].getText().equalsIgnoreCase("o") && buttons[1].getText().equalsIgnoreCase("o")
                && buttons[2].getText().equalsIgnoreCase("o")) {
            winMessage2();
            restartGame();
            p2Label.setText("Player 2 wins: " + ++p2Score);
        }
        if (buttons[1].getText().equalsIgnoreCase("o") && buttons[4].getText().equalsIgnoreCase("o")
                && buttons[7].getText().equalsIgnoreCase("o")) {
            winMessage2();
            restartGame();
            p2Label.setText("Player 2 wins: " + ++p2Score);
        }
        if (buttons[2].getText().equalsIgnoreCase("o") && buttons[4].getText().equalsIgnoreCase("o")
                && buttons[6].getText().equalsIgnoreCase("o")) {
            winMessage2();
            restartGame();
            p2Label.setText("Player 2 wins: " + ++p2Score);
        }
        if (buttons[2].getText().equalsIgnoreCase("o") && buttons[5].getText().equalsIgnoreCase("o")
                && buttons[8].getText().equalsIgnoreCase("o")) {
            winMessage2();
            restartGame();
            p2Label.setText("Player 2 wins: " + ++p2Score);
        }
        if (buttons[3].getText().equalsIgnoreCase("o") && buttons[4].getText().equalsIgnoreCase("o")
                && buttons[5].getText().equalsIgnoreCase("o")) {
            winMessage2();
            restartGame();
            p2Label.setText("Player 2 wins: " + ++p2Score);
        }
        if (buttons[6].getText().equalsIgnoreCase("o") && buttons[7].getText().equalsIgnoreCase("o")
                && buttons[8].getText().equalsIgnoreCase("o")) {
            winMessage2();
            restartGame();
            p2Label.setText("Player 2 wins: " + ++p2Score);
        } else if (moves == 0) {
            JOptionPane.showMessageDialog(null, "         Det blev oavgjort!");
            restartGame();
        }

    }

    public void winMessage1() {

        JOptionPane.showMessageDialog(null, "Grattis spelare 1, du har vunnit!");
    }

    public void winMessage2() {

        JOptionPane.showMessageDialog(null, "Grattis spelare 2, du har vunnit!");
    }

    public void restartGame() {

        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setText("");
        }
        player = 1;
        moves = 9;
    }

    public static void main(String[] args) {
        Luffarschack l = new Luffarschack();
    }
}
