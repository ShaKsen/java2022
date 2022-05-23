package ru.gb.shavshina.homework8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestOXGame {
    public static void main(String[] args) {
        MyOXGame myoxgame=new MyOXGame();
    }
}

class MyOXGame extends JFrame implements ActionListener {

    JButton[] button;
    ChessPanel[] chessPanel;
    JButton restart;
    JLabel judgement;
    JPanel chessboard,basicPanel;
    int player=0;
    boolean gameOverFlag=false;
    MyOXGame(){
        setTitle("Крестики-нолики");
        setBounds(400,400,340,360);
        button=new JButton[10];
        chessPanel=new ChessPanel[10];
        restart=new JButton("Restart");
        chessboard=new JPanel();
        basicPanel=new JPanel();
        judgement=new JLabel("");
        chessboard.setLayout(new GridLayout(3,3));
        basicPanel.setLayout(new FlowLayout());

        add(chessboard,BorderLayout.CENTER);
        add(basicPanel,BorderLayout.SOUTH);
        basicPanel.add(restart);
        basicPanel.add(judgement);

        initChessboard();
        addChessToChessboard(chessboard);
        restart.addActionListener(this);

        buttonListener();
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

   private void addChessToChessboard(JPanel chessboard){
              for(int i=1;i<=9;i++) {
            chessboard.add(chessPanel[i]);
        }
    }

    private void initChessboard(){
            for(int i=1;i<=9;i++){
            button[i]=new JButton(  ""+i);
            button[i].setSize(45,45);
            chessPanel[i]=new ChessPanel();
            chessPanel[i].setLayout(null);
            chessPanel[i].setBorder(BorderFactory.createLineBorder(Color.black, 1));
            chessPanel[i].add(button[i]);
        }
    }

    private void buttonListener(){
         for(int i=1;i<=9;i++)   {
            button[i].addActionListener(this);
        }
    }

    private void restartTheGame(){
       chessboard.removeAll();
       chessboard.setLayout(new GridLayout(3,3));
        initChessboard();
        addChessToChessboard(chessboard);
        buttonListener();
        chessboard.updateUI();
        chessboard.repaint();
        judgement.setText("");
        gameOverFlag=false;
    }
    private boolean checkDogfall(char[] chess){
            for(int i=1;i<chess.length;i++){
            if (chess[i]>='1'&&chess[i]<='9')
                return false;
        }
        return true;
    }

    private int checkWinner(int playerNow) {
        char[] chess=new char[10];
        for(int i=1;i<=9;i++){
            chess[i]=button[i].getLabel().charAt(0);
        }
        if(     (chess[1]==chess[2]&&chess[2]==chess[3])||
                (chess[4]==chess[5]&&chess[5]==chess[6])||
                (chess[7]==chess[8]&&chess[8]==chess[9])||
                (chess[1]==chess[5]&&chess[5]==chess[9])||
                (chess[7]==chess[5]&&chess[5]==chess[3])||
                (chess[1]==chess[4]&&chess[4]==chess[7])||
                (chess[2]==chess[5]&&chess[5]==chess[8])||
                (chess[3]==chess[6]&&chess[6]==chess[9])){

            return playerNow;
        }
        else if(checkDogfall(chess))
            return -1;
        return -2;
    }
    public class ChessPanel extends JPanel{

        int paintCode=-1;

        public void paint(Graphics g) {
            super.paint(g);
            if(paintCode==0){
                Graphics2D g_2D=(Graphics2D)g;
                g_2D.setStroke(new BasicStroke(6.0f));
                g.drawOval(43,43,23,23);


            }
            else if(paintCode==1){
                Image xx = new ImageIcon("src/xx.png").getImage();
                g.drawImage(xx,43,43,25,25,this);

            }
        }
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        int statueCode;
        int id;
        JButton buttonSource=(JButton)actionEvent.getSource();
        if(buttonSource==restart){
            restartTheGame();
        }
        if (gameOverFlag==true) return;
        String buttonMark=buttonSource.getLabel();
        id=(int)(buttonMark.charAt(0)-'0');
        if(buttonMark.matches("[0-9]")){
            if(player==0){
                buttonSource.setLabel("O");
                chessPanel[id].paintCode=0;
                repaint();
            }
            else{

                buttonSource.setLabel("X");
                chessPanel[id].paintCode=1;
                repaint();
            }
            statueCode=checkWinner(player);
            if(statueCode==0){
                judgement.setText("Player O wins the game! ");
                gameOverFlag=true;
            }
            else if(statueCode==1){
                judgement.setText("Player X wins the game!");
                gameOverFlag=true;
            }
            else if(statueCode==-1){
                judgement.setText("The game a draw!");
            }
            player=(player+1)%2;
        }
    }

}