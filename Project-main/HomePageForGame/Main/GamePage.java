package Main;

import javax.swing.JButton;

import Inputs.ButtonInputs;

import java.awt.Color;

public class GamePage {
    private GameWindow window;
    private GamePanel panel;
    private ButtonInputs buttonInputs;
    public GamePage (GameWindow window,GamePanel panel, ButtonInputs buttonInputs)  {
        this.window = window;
        this.panel = panel;
        this.buttonInputs = buttonInputs;
        //set up a button for each game
        setUpButtons ();
    }
    private void setUpButtons () {
        Button buttonFormat = new Button();
        JButton game1Button = buttonFormat.setButton(50,250,200,200,"Game 1",Color.RED,Color.BLACK,true);
        JButton game2Button = buttonFormat.setButton(300,250,200,200,"Game 2",Color.RED,Color.BLACK,true);

        buttonInputs.addButtonToList(game1Button);
        buttonInputs.addButtonToList(game2Button);

        panel.add(game1Button);
        panel.add(game2Button);
        panel.repaint();
    }
}
