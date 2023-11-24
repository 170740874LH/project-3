package Main;
import Inputs.ButtonInputs;

import java.awt.Color;

import javax.swing.JButton;

public class Leaderboard {
    private GameWindow window;
    private GamePanel panel;
    private ButtonInputs buttonInputs;
    public Leaderboard (GameWindow window,GamePanel panel, ButtonInputs buttonInputs)  {
        this.window = window;
        this.panel = panel;
        this.buttonInputs = buttonInputs;
        //set up a button for each game
        setUpButtons ();
    }
    private void setUpButtons () {
        System.out.println("moo");
        Button buttonFormat = new Button();
        JButton game1LeaderBoard = buttonFormat.setButton(50,250,200,200,"Game 1 LB",Color.RED,Color.BLACK,true);
        JButton game2LeaderBoard = buttonFormat.setButton(300,250,200,200,"Game 2 LB",Color.RED,Color.BLACK,true);

        buttonInputs.addButtonToList(game1LeaderBoard);
        buttonInputs.addButtonToList(game2LeaderBoard);

        panel.add(game1LeaderBoard);
        panel.add(game2LeaderBoard);

        panel.repaint();
    }
}
