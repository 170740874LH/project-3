package Main;
import java.util.Scanner;

import javax.swing.JButton;

import Inputs.ButtonInputs;

import java.awt.Color;


public class HomePage {
    private Scanner keyboard = new Scanner(System.in);
    private GameWindow window;
    private GamePanel panel;
    private JButton gamePageButton;
    private JButton leaderBoardPageButton;
    private ButtonInputs buttonInputs;
    

    public HomePage (GameWindow window, GamePanel panel, ButtonInputs buttonInputs) {
        this.window = window;
        this.panel = panel;
        this.buttonInputs = buttonInputs;
        buttonInputs.addHomePageClass(this);

        panel.requestFocus();
        setUpButtons(buttonInputs);
    }
    private void setUpButtons (ButtonInputs buttonInputs) {
        Button buttonFormat = new Button();
        //x,y,width,height,textInButton,textColour,backgroundColour,visible
        gamePageButton = buttonFormat.setButton(50,250,200,200,"Games",Color.RED,Color.BLACK,true);
        leaderBoardPageButton = buttonFormat.setButton(300,250,200,200,"Leaderboard",Color.RED,Color.BLACK,true);
        buttonInputs.addButtonToList(gamePageButton);
        buttonInputs.addButtonToList(leaderBoardPageButton);

        panel.add(gamePageButton);
        panel.add(leaderBoardPageButton);
        panel.repaint();

    }

    public void gamePageButtonPressed () {
        gamePageButton.setVisible(false);
        leaderBoardPageButton.setVisible(false);
        
        GamePage gamePage = new GamePage(window,panel,buttonInputs);
    }
    public void leaderboardButtonPressed () {
        
        gamePageButton.setVisible(false);
        leaderBoardPageButton.setVisible(false);

        Leaderboard leaderboard = new Leaderboard(window,panel,buttonInputs);
    }

   
}
