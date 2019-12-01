package edu.psu.ist261.Views;

import edu.psu.ist261.Controllers.GameController;

import javax.swing.*;
import java.awt.*;

public class GameView extends javax.swing.JFrame{

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JTextPane JTextPaneCurrentPlayer;
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Button button5;
    private java.awt.Button button6;
    private java.awt.Button button7;
    private java.awt.Button buttonStart;
    private javax.swing.JLabel jLabelBoard;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextPane jTextPanePlayerOne;
    private javax.swing.JTextPane jTextPanePlayerTwo;

    private javax.swing.JPanel gridPanel;
    private java.awt.GridLayout gridLayout;
    private javax.swing.JLayeredPane jLayeredPane;
    private GameController game_controller;
    private boolean game_started;
    private boolean turn;

    private javax.swing.JLabel[][] labelHolder;
    // End of variables declaration


    public GameView() {
        this.game_started = false;
        this.turn = true;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        // Contains: JLabel and Grid
        jLayeredPane = new javax.swing.JLayeredPane();
        jLayeredPane.setPreferredSize(new Dimension(716,620));
        jLayeredPane.setBackground(Color.blue);

        // Set gridPanel Layout
        gridPanel = new javax.swing.JPanel();
        gridPanel.setLayout(new GridLayout(6, 7));
        gridPanel.setPreferredSize(new Dimension(716,615));
        gridPanel.setBounds(0,0,716,615);
        //gridLayout = new java.awt.GridLayout(6, 7);






        // Create obj that holds references to Grid Objects
        labelHolder = new JLabel[6][7];
        for(int x = 5; x >= 0; x--){

            for(int y = 0; y < 7; y++){
                labelHolder[x][y] = new JLabel();
                labelHolder[x][y].setOpaque(true);
                labelHolder[x][y].setBackground(Color.white);
                labelHolder[x][y].setMinimumSize(new Dimension(102, 102));
                labelHolder[x][y].setPreferredSize(new Dimension(102, 102));
                labelHolder[x][y].setMaximumSize(new Dimension(102, 102));
                gridPanel.add(labelHolder[x][y]);
            }
        }


//        // Add jLabel and Grid to Layered Pane
//        jLayeredPane.add(jLabelBoard, 2);
//        jLayeredPane.add(gridPanel, 1);


        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPanePlayerOne = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPanePlayerTwo = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTextPaneCurrentPlayer = new javax.swing.JTextPane();
        jLabelBoard = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        button4 = new java.awt.Button();
        button5 = new java.awt.Button();
        button6 = new java.awt.Button();
        button7 = new java.awt.Button();
        buttonStart = new java.awt.Button();
        buttonStart.setLabel("Start Game");
        buttonStart.setFont(new Font("Arial", Font.PLAIN, 40));
        buttonStart.setForeground(Color.white);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Connect Four!");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setForeground(new java.awt.Color(100, 100, 100));

        jTextPanePlayerOne.setBackground(new java.awt.Color(225, 200, 0));
        jTextPanePlayerOne.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextPanePlayerOne.setFont(new java.awt.Font("Lucida Grande", 1, 25)); // NOI18N
        jTextPanePlayerOne.setForeground(new java.awt.Color(0, 0, 0));
        jTextPanePlayerOne.setText("Enter Player One Name");
        jScrollPane3.setViewportView(jTextPanePlayerOne);
        jTextPanePlayerTwo.setBackground(new java.awt.Color(200, 0, 0));
        jTextPanePlayerTwo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextPanePlayerTwo.setFont(new java.awt.Font("Lucida Grande", 1, 25)); // NOI18N
        jTextPanePlayerTwo.setForeground(new java.awt.Color(0, 0, 0));
        jTextPanePlayerTwo.setText("Enter Player Two Name");
        jScrollPane4.setViewportView(jTextPanePlayerTwo);
        JTextPaneCurrentPlayer.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        JTextPaneCurrentPlayer.setText("Enter players then press start");
        JTextPaneCurrentPlayer.setToolTipText("");
        JTextPaneCurrentPlayer.setEditable(false);
        jScrollPane1.setViewportView(JTextPaneCurrentPlayer);

        button1.setBackground(new java.awt.Color(0, 200, 0));
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processTurn(evt, 0);
            }
        });
        button2.setBackground(new java.awt.Color(0, 200, 0));
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processTurn(evt, 1);
            }
        });
        button3.setBackground(new java.awt.Color(0, 200, 0));
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processTurn(evt, 2);
            }
        });
        button4.setBackground(new java.awt.Color(0, 200, 0));
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processTurn(evt, 3);
            }
        });
        button5.setBackground(new java.awt.Color(0, 200, 0));
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processTurn(evt, 4);
            }
        });
        button6.setBackground(new java.awt.Color(0, 200, 0));
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processTurn(evt, 5);
            }
        });
        button7.setBackground(new java.awt.Color(0, 200, 0));
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processTurn(evt, 6);
            }
        });
        buttonStart.setBackground(new java.awt.Color(0, 100, 0));
        buttonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStartActionPerformed(evt);
            }
        });


        // Add jLabel and Grid to Layered Pane
        jLabelBoard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4Template.png"))); // NOI18N
        jLabelBoard.setBounds(0,0,716,632);
        jLayeredPane.add(jLabelBoard, new Integer(2), 0);
        jLayeredPane.add(gridPanel, new Integer(1), 0);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(buttonStart, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()
                        )
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()
                        )
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(75, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                        .addComponent(jLabelBoard) // BOARD
                                        .addComponent(jLayeredPane) // BOARD
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        ))
                                .addGap(65, 65, 65)
                        )
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
//                                                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                .addGap(18, 18, 18))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
//                                                .addGap(8, 8, 8)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                )
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
//                                .addComponent(jLabelBoard) // BOARD
                                .addComponent(jLayeredPane) // BOARD
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(buttonStart, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>


    private void processTurn(java.awt.event.ActionEvent evt, int column){
        System.out.print(jLayeredPane.getSize().toString());
        if(!this.game_started){
            System.out.print("\nGame has not started yet!");
            return;
        }
        int message = this.game_controller.processTurn(column);
        if(message == -1){
            System.out.print("\n Player one wins");
            int row = this.game_controller.get_last_row_added();
            if(turn){
                addPiece(column, row, Color.yellow);
            }
            else{
                addPiece(column, row, Color.red);
            }
            String info_text = this.game_controller.get_player_one_name() + " wins!";
            JTextPaneCurrentPlayer.setText(info_text);
            disableButtons();
        }
        else if(message == -2){
            System.out.print("\n Player two wins");
            int row = this.game_controller.get_last_row_added();
            if(turn){
                addPiece(column, row, Color.yellow);
            }
            else{
                addPiece(column, row, Color.red);
            }
            String info_text = this.game_controller.get_player_two_name() + " wins!";
            JTextPaneCurrentPlayer.setText(info_text);
            disableButtons();
        }
        else if(message == -3){
            JTextPaneCurrentPlayer.setText("DRAW");
            if(turn){
                addPiece(column, 5, Color.yellow);
            }
            else{
                addPiece(column, 5, Color.red);
            }
            disableButtons();
        }
        else if(message == -4){
            System.out.print("\n Column Full, do nothing");
            JTextPaneCurrentPlayer.setText("Column Full!");
        }
        else if(message >= 0){
            System.out.print("\n No winner yet");
            if(turn){
                addPiece(column, message, Color.yellow);
                String info_text = "Turn: " + this.game_controller.get_player_two_name();
                JTextPaneCurrentPlayer.setText(info_text);
            }
            else{
                addPiece(column, message, Color.red);
                String info_text = "Turn: " + this.game_controller.get_player_one_name();
                JTextPaneCurrentPlayer.setText(info_text);
            }
            this.turn = !this.turn;
        }
    }


    private void addPiece(int column, int row, java.awt.Color color){
        labelHolder[row][column].setBackground(color);
    }

    private void disableButtons(){
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
    }

    private void buttonStartActionPerformed(java.awt.event.ActionEvent evt) {
        if(this.game_started){return;}
        jTextPanePlayerOne.setEditable(false);
        jTextPanePlayerTwo.setEditable(false);
        buttonStart.setEnabled(false);
        this.game_started = true;
        this.game_controller = new GameController(this.jTextPanePlayerOne.getText(), this.jTextPanePlayerTwo.getText());
        String info_text = "Turn: " + this.game_controller.get_player_one_name();
        JTextPaneCurrentPlayer.setText(info_text);
        System.out.println("\nController Created");
    }
}
