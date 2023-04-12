import java.awt.*;
import java.awt.event.*;
import java.io.Serial;
import java.util.*;

import javax.swing.*;
import javax.swing.border.*;

public class Find_Green_Button_Game extends JFrame {

    /**
     *
     */
    @Serial
    private static final long serialVersionUID = 1L;

    public Find_Green_Button_Game() {

        this.setTitle("Find Green Button");
        this.setSize(600, 660);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        JFrame frame = this;

        //Create custom color
        Color blueLight = new Color(72, 128, 185);

        //Main Panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(Color.WHITE);
        LineBorder roundedLineBorder = new LineBorder(Color.BLACK, 2, true);
        TitledBorder roundedTitleBorder = new TitledBorder(roundedLineBorder);
        mainPanel.setBorder(roundedTitleBorder);

        JButton nameButton = new JButton("ENTER NAME");
        nameButton.setFont(new Font("Tahoma", Font.BOLD, 18));
        nameButton.setForeground(Color.WHITE);
        nameButton.setBackground(blueLight);
        nameButton.setBounds(30, 11, 189, 41);
        mainPanel.add(nameButton);

        JSeparator separator1 = new JSeparator();
        separator1.setBounds(0, 100, 588, 2);
        separator1.setForeground(Color.BLACK);
        separator1.setBackground(Color.BLACK);
        mainPanel.add(separator1);

        JSeparator separator2 = new JSeparator();
        separator2.setForeground(Color.BLACK);
        separator2.setBackground(Color.BLACK);
        separator2.setBounds(0, 485, 588, 2);
        mainPanel.add(separator2);

        JLabel gamesPlayedLabel = new JLabel("GAME PLAYED:");
        gamesPlayedLabel.setHorizontalAlignment(SwingConstants.CENTER);
        gamesPlayedLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        gamesPlayedLabel.setBounds(30, 498, 110, 23);
        mainPanel.add(gamesPlayedLabel);

        JLabel gamesWonLabel = new JLabel("GAME WON:");
        gamesWonLabel.setHorizontalAlignment(SwingConstants.CENTER);
        gamesWonLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        gamesWonLabel.setBounds(30, 532, 92, 23);
        mainPanel.add(gamesWonLabel);

        JLabel gamesLostLabel = new JLabel("GAME LOST:");
        gamesLostLabel.setHorizontalAlignment(SwingConstants.CENTER);
        gamesLostLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        gamesLostLabel.setBounds(30, 566, 92, 23);
        mainPanel.add(gamesLostLabel);

        JTextField gamesPlayedField = new JTextField();
        gamesPlayedField.setBackground(Color.WHITE);
        gamesPlayedField.setEditable(false);
        gamesPlayedField.setText("0");
        gamesPlayedField.setFont(new Font("Tahoma", Font.PLAIN, 18));
        gamesPlayedField.setBounds(139, 495, 39, 26);
        gamesPlayedField.setBorder(new LineBorder(Color.black));
        mainPanel.add(gamesPlayedField);
        gamesPlayedField.setColumns(10);

        JTextField gamesWonField = new JTextField();
        gamesWonField.setBackground(Color.WHITE);
        gamesWonField.setEditable(false);
        gamesWonField.setText("0");
        gamesWonField.setFont(new Font("Tahoma", Font.PLAIN, 18));
        gamesWonField.setColumns(10);
        gamesWonField.setBounds(139, 529, 39, 26);
        gamesWonField.setBorder(new LineBorder(Color.black));
        mainPanel.add(gamesWonField);

        JTextField gamesLostField = new JTextField();
        gamesLostField.setBackground(Color.WHITE);
        gamesLostField.setEditable(false);
        gamesLostField.setText("0");
        gamesLostField.setFont(new Font("Tahoma", Font.PLAIN, 18));
        gamesLostField.setColumns(10);
        gamesLostField.setBounds(139, 563, 39, 26);
        gamesLostField.setBorder(new LineBorder(Color.black));
        mainPanel.add(gamesLostField);

        JTextField nameDisplayField = new JTextField();
        nameDisplayField.setBackground(Color.WHITE);
        nameDisplayField.setEditable(false);
        nameDisplayField.setFont(new Font("Tahoma", Font.PLAIN, 35));
        nameDisplayField.setHorizontalAlignment(SwingConstants.CENTER);
        nameDisplayField.setBounds(300, 498, 250, 49);
        nameDisplayField.setBorder(new LineBorder(Color.black));
        mainPanel.add(nameDisplayField);
        nameDisplayField.setColumns(10);

        JTextField looseWinField = new JTextField();
        looseWinField.setBackground(Color.WHITE);
        looseWinField.setEditable(false);
        looseWinField.setVisible(false);
        looseWinField.setFont(new Font("Tahoma", Font.PLAIN, 25));
        looseWinField.setHorizontalAlignment(SwingConstants.CENTER);
        looseWinField.setColumns(10);
        looseWinField.setBounds(379, 548, 92, 29);
        looseWinField.setBorder(new LineBorder(Color.white));
        mainPanel.add(looseWinField);

        JLabel levelLabel = new JLabel("LEVEL:");
        levelLabel.setHorizontalAlignment(SwingConstants.CENTER);
        levelLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        levelLabel.setBounds(30, 113, 69, 29);
        mainPanel.add(levelLabel);

        JLabel triesLabel = new JLabel("TRIES:");
        triesLabel.setHorizontalAlignment(SwingConstants.CENTER);
        triesLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        triesLabel.setBounds(432, 113, 69, 29);
        mainPanel.add(triesLabel);

        JTextField levelField = new JTextField();
        levelField.setBackground(Color.white);
        levelField.setEditable(false);
        levelField.setFont(new Font("Tahoma", Font.PLAIN, 18));
        levelField.setColumns(10);
        levelField.setBounds(107, 113, 112, 29);
        levelField.setBorder(new LineBorder(Color.black));
        mainPanel.add(levelField);

        JTextField triesField = new JTextField();
        triesField.setBackground(Color.WHITE);
        triesField.setEditable(false);
        triesField.setFont(new Font("Tahoma", Font.PLAIN, 18));
        triesField.setColumns(10);
        triesField.setBounds(511, 113, 39, 29);
        triesField.setBorder(new LineBorder(Color.black));
        mainPanel.add(triesField);

        JButton startButton = new JButton("START");
        startButton.setVisible(false);
        startButton.setForeground(Color.WHITE);
        startButton.setBackground(blueLight);
        startButton.setFont(new Font("Tahoma", Font.BOLD, 30));
        startButton.setBounds(303, 20, 247, 60);
        mainPanel.add(startButton);

        JLabel levelLabelForComboBox = new JLabel("LEVEL:");
        levelLabelForComboBox.setHorizontalAlignment(SwingConstants.CENTER);
        levelLabelForComboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
        levelLabelForComboBox.setBounds(30, 62, 52, 29);
        mainPanel.add(levelLabelForComboBox);

        String[] comboBoxDifficulties = {"EASY", "MEDIUM", "HARD"};
        JComboBox<String> levelComboBox = new JComboBox<>(comboBoxDifficulties);
        levelComboBox.setVisible(false);
        levelComboBox.setBounds(107, 60, 110, 29);
        levelComboBox.setBackground(Color.WHITE);
        levelComboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
        mainPanel.add(levelComboBox);

        JComboBox<String> userComboBox = new JComboBox<>();
        userComboBox.addItem("New User");
        userComboBox.addItem("Elon Musk");
        userComboBox.addItem("Jeff Bezos");
        userComboBox.addItem("Justin Beiber");
        userComboBox.addItem("Oprah Winfrey");
        userComboBox.addItem("Kylie Jenner");


        // Action to the Button Name
        nameButton.addActionListener(e -> {
            UIManager.put("OptionPane.background", Color.lightGray);
            UIManager.put("Panel.background", Color.lightGray);
            UIManager.put("Button.background", blueLight);
            UIManager.put("Button.foreground", Color.white);
            String message = "<html><body><div width='120px' align='center'>New User?</div></body></html>";
            int name = JOptionPane.showConfirmDialog(frame, message, "", JOptionPane.YES_NO_OPTION);

            if(name == JOptionPane.YES_OPTION) {
                UIManager.put("OptionPane.background", Color.lightGray);
                UIManager.put("Panel.background", Color.lightGray);
                UIManager.put("Button.background", blueLight);
                UIManager.put("Button.foreground", Color.white);
                String message2 = "<html><body><div width='200px' align='center'>ENTER YOUR NAME</div></body></html>";
                String name2 = JOptionPane.showInputDialog(frame, message2, "", JOptionPane.PLAIN_MESSAGE);

                if(name2 != null) {
                    nameButton.setEnabled(false);
                    levelComboBox.setVisible(true);
                    startButton.setVisible(true);
                    nameDisplayField.setText(nameDisplayField.getText() + name2);
                    userComboBox.addItem(name2);
                }

            }else if(name == JOptionPane.NO_OPTION) {
                UIManager.put("OptionPane.background", Color.lightGray);
                UIManager.put("Panel.background", Color.lightGray);
                UIManager.put("Button.background", blueLight);
                UIManager.put("Button.foreground", Color.white);
                int name3 = JOptionPane.showConfirmDialog(frame, userComboBox, "CHOOSE YOUR NAME:", JOptionPane.DEFAULT_OPTION);

                if(name3 == JOptionPane.OK_OPTION) {
                    String s = (String) userComboBox.getSelectedItem();

                    assert s != null;
                    if (s.equals("New User")) {
                        UIManager.put("OptionPane.background", Color.lightGray);
                        UIManager.put("Panel.background", Color.lightGray);
                        UIManager.put("Button.background", blueLight);
                        UIManager.put("Button.foreground", Color.white);
                        String message3 = "<html><body><div width='200px' align='center'>ENTER YOUR NAME</div></body></html>";
                        String name4 = JOptionPane.showInputDialog(frame, message3, "", JOptionPane.PLAIN_MESSAGE);
                        if (name4 != null) {
                            nameButton.setEnabled(false);
                            levelComboBox.setVisible(true);
                            startButton.setVisible(true);
                            nameDisplayField.setText(nameDisplayField.getText() + name4);
                            userComboBox.addItem(name4);
                        }
                    } else {
                        nameDisplayField.setText((String) userComboBox.getSelectedItem());
                        nameButton.setEnabled(false);
                        levelComboBox.setVisible(true);
                        startButton.setVisible(true);
                    }
                }
            }
        });


        //Creating Panel 3x3
        JPanel easyPanel = new JPanel();
        easyPanel.setVisible(false);
        easyPanel.setBackground(Color.WHITE);
        easyPanel.setBounds(64, 160, 467, 314);
        mainPanel.add(easyPanel);


        //Creating Panel 5x5
        JPanel mediumPanel = new JPanel();
        mediumPanel.setVisible(false);
        mediumPanel.setBackground(Color.WHITE);
        mediumPanel.setBounds(64, 160, 467, 314);
        mainPanel.add(mediumPanel);


        //Creating Panel 10x10
        JPanel hardPanel = new JPanel();
        hardPanel.setVisible(false);
        hardPanel.setBounds(64, 160, 467, 314);
        hardPanel.setBackground(Color.WHITE);
        mainPanel.add(hardPanel);


        //Add ActionListener to choose Level of difficulty and make invisible comboBox and Start Button
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = (String) levelComboBox.getSelectedItem();

                switch (Objects.requireNonNull(s)) { //check for a match
                    case "EASY" -> {
                        easyPanel.setVisible(true);
                        triesField.setText("3");
                        difficulty();
                        startGameEasy();
                    }
                    case "MEDIUM" -> {
                        mediumPanel.setVisible(true);
                        triesField.setText("5");
                        difficulty();
                        startGameMedium();
                    }
                    case "HARD" -> {
                        hardPanel.setVisible(true);
                        triesField.setText("10");
                        difficulty();
                        startGameHard();
                    }
                }
                startButton.setEnabled(false);
                levelField.setText((String) levelComboBox.getSelectedItem());
                levelComboBox.setEnabled(false);
            }


            //Method for Games Payed counter
            public void difficulty() {
                int count;

                count = Integer.parseInt(gamesPlayedField.getText());
                count++;
                gamesPlayedField.setText(String.valueOf(count));
            }


            //Method to Add buttons to easyPanel
            public void startGameEasy() {

                easyPanel.removeAll();
                JButton[] btns = new JButton[9];
                int greenBtn = new Random().nextInt(btns.length);

                for (int i = 0; i < 9; i++) {
                    btns[i] = new JButton("    ");
                    btns[i].setBackground(new Color(70, 130, 180));
                    btns[i].setFont(new Font("Tahoma", Font.PLAIN, 72));
                    easyPanel.add(btns[i]);

                    if(greenBtn == i) {

                        btns[i].addActionListener(e -> {
                            ((JButton) e.getSource()).setBackground(Color.green);

                            int value = Integer.parseInt(gamesWonField.getText());
                            value++;
                            gamesWonField.setText(String.valueOf(value));

                            easyPanel.setVisible(false);
                            looseWinField.setVisible(true);
                            looseWinField.setText("WIN");
                            looseWinField.setForeground(Color.green);

                            UIManager.put("OptionPane.background", Color.lightGray);
                            UIManager.put("Panel.background", Color.lightGray);
                            UIManager.put("Button.background", blueLight);
                            UIManager.put("Button.foreground", Color.white);
                            String message = "<html><body><div width='200px' align='center'>START OVER?</div></body></html>";
                            int name = JOptionPane.showConfirmDialog(frame, message, "", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);

                            if(name == JOptionPane.OK_OPTION) {
                                looseWinField.setVisible(false);

                                startButton.setEnabled(true);
                                levelComboBox.setEnabled(true);
                            }else if(name == JOptionPane.NO_OPTION){
                                System.exit(0);
                            }
                        });

                    }else {

                        btns[i].addActionListener(e -> {
                            ((JButton) e.getSource()).setBackground(Color.red);
                            ((JButton) e.getSource()).setEnabled(false);

                            int value = Integer.parseInt(triesField.getText());
                            value--;
                            triesField.setText(String.valueOf(value));

                            if(value == 0) {
                                value = Integer.parseInt(gamesLostField.getText());
                                value++;
                                gamesLostField.setText(String.valueOf(value));

                                easyPanel.setVisible(false);
                                looseWinField.setVisible(true);
                                looseWinField.setText("LOOSE");
                                looseWinField.setForeground(Color.red);

                                UIManager.put("OptionPane.background", Color.lightGray);
                                UIManager.put("Panel.background", Color.lightGray);
                                UIManager.put("Button.background", blueLight);
                                UIManager.put("Button.foreground", Color.white);
                                String message = "<html><body><div width='200px' align='center'>START OVER?</div></body></html>";
                                int name = JOptionPane.showConfirmDialog(frame, message, "", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);

                                if(name == JOptionPane.OK_OPTION) {
                                    looseWinField.setVisible(false);

                                    startButton.setEnabled(true);
                                    levelComboBox.setEnabled(true);

                                }else if(name == JOptionPane.NO_OPTION){
                                    System.exit(0);
                                }
                            }
                        });
                    }
                }
            }


            //Method to Add buttons to mediumPanel
            public void startGameMedium() {

                mediumPanel.removeAll();
                JButton[] easyBtns = new JButton[25];
                int greenBtn = new Random().nextInt(easyBtns.length);

                for (int i = 0; i < 25; i++) {
                    easyBtns[i] = new JButton("    ");
                    easyBtns[i].setBackground(new Color(70, 130, 180));
                    easyBtns[i].setFont(new Font("Tahoma", Font.PLAIN, 38));
                    mediumPanel.add(easyBtns[i]);

                    if(greenBtn == i) {

                        easyBtns[i].addActionListener(e -> {
                            ((JButton) e.getSource()).setBackground(Color.green);

                            int value = Integer.parseInt(gamesWonField.getText());
                            value++;
                            gamesWonField.setText(String.valueOf(value));

                            mediumPanel.setVisible(false);
                            looseWinField.setVisible(true);
                            looseWinField.setText("WIN");
                            looseWinField.setForeground(Color.green);

                            UIManager.put("OptionPane.background", Color.lightGray);
                            UIManager.put("Panel.background", Color.lightGray);
                            UIManager.put("Button.background", blueLight);
                            UIManager.put("Button.foreground", Color.white);
                            String message = "<html><body><div width='200px' align='center'>START OVER?</div></body></html>";
                            int name = JOptionPane.showConfirmDialog(frame, message, "", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);

                            if(name == JOptionPane.OK_OPTION) {
                                looseWinField.setVisible(false);

                                startButton.setEnabled(true);
                                levelComboBox.setEnabled(true);

                            }else if(name == JOptionPane.NO_OPTION){
                                System.exit(0);
                            }
                        });

                    }else {

                        easyBtns[i].addActionListener(e -> {
                            ((JButton) e.getSource()).setBackground(Color.red);
                            ((JButton) e.getSource()).setEnabled(false);

                            int value = Integer.parseInt(triesField.getText());
                            value--;
                            triesField.setText(String.valueOf(value));

                            if(value == 0) {
                                value = Integer.parseInt(gamesLostField.getText());
                                value++;
                                gamesLostField.setText(String.valueOf(value));

                                mediumPanel.setVisible(false);
                                looseWinField.setVisible(true);
                                looseWinField.setText("LOOSE");
                                looseWinField.setForeground(Color.red);

                                UIManager.put("OptionPane.background", Color.lightGray);
                                UIManager.put("Panel.background", Color.lightGray);
                                UIManager.put("Button.background", blueLight);
                                UIManager.put("Button.foreground", Color.white);
                                String message = "<html><body><div width='200px' align='center'>START OVER?</div></body></html>";
                                int name = JOptionPane.showConfirmDialog(frame, message, "", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);

                                if(name == JOptionPane.OK_OPTION) {
                                    looseWinField.setVisible(false);

                                    startButton.setEnabled(true);
                                    levelComboBox.setEnabled(true);

                                }else if(name == JOptionPane.NO_OPTION){
                                    System.exit(0);
                                }
                            }
                        });
                    }
                }
            }


            //Method to Add buttons to hardPanel
            public void startGameHard() {

                hardPanel.removeAll();
                JButton[] easyBtns = new JButton[100];
                int greenBtn = new Random().nextInt(easyBtns.length);

                for (int i = 0; i < 100; i++) {
                    easyBtns[i] = new JButton("  ");
                    easyBtns[i].setBackground(new Color(70, 130, 180));
                    easyBtns[i].setFont(new Font("Tahoma", Font.PLAIN, 11));
                    hardPanel.add(easyBtns[i]);

                    if(greenBtn == i) {

                        easyBtns[i].addActionListener(e -> {
                            ((JButton) e.getSource()).setBackground(Color.green);

                            int value = Integer.parseInt(gamesWonField.getText());
                            value++;
                            gamesWonField.setText(String.valueOf(value));

                            hardPanel.setVisible(false);
                            looseWinField.setVisible(true);
                            looseWinField.setText("WIN");
                            looseWinField.setForeground(Color.green);

                            UIManager.put("OptionPane.background", Color.lightGray);
                            UIManager.put("Panel.background", Color.lightGray);
                            UIManager.put("Button.background", blueLight);
                            UIManager.put("Button.foreground", Color.white);
                            String message = "<html><body><div width='200px' align='center'>START OVER?</div></body></html>";
                            int name = JOptionPane.showConfirmDialog(frame, message, "", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);

                            if(name == JOptionPane.OK_OPTION) {
                                looseWinField.setVisible(false);

                                startButton.setEnabled(true);
                                levelComboBox.setEnabled(true);

                            }else if(name == JOptionPane.NO_OPTION){
                                System.exit(0);
                            }
                        });

                    }else {

                        easyBtns[i].addActionListener(e -> {
                            ((JButton) e.getSource()).setBackground(Color.red);
                            ((JButton) e.getSource()).setEnabled(false);

                            int value = Integer.parseInt(triesField.getText());
                            value--;
                            triesField.setText(String.valueOf(value));

                            if(value == 0) {
                                value = Integer.parseInt(gamesLostField.getText());
                                value++;
                                gamesLostField.setText(String.valueOf(value));

                                hardPanel.setVisible(false);
                                looseWinField.setVisible(true);
                                looseWinField.setText("LOOSE");
                                looseWinField.setForeground(Color.red);

                                UIManager.put("OptionPane.background", Color.lightGray);
                                UIManager.put("Panel.background", Color.lightGray);
                                UIManager.put("Button.background", blueLight);
                                UIManager.put("Button.foreground", Color.white);
                                String message = "<html><body><div width='200px' align='center'>START OVER?</div></body></html>";
                                int name = JOptionPane.showConfirmDialog(frame, message, "", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);

                                if(name == JOptionPane.OK_OPTION) {
                                    looseWinField.setVisible(false);

                                    startButton.setEnabled(true);
                                    levelComboBox.setEnabled(true);

                                }else if(name == JOptionPane.NO_OPTION){
                                    System.exit(0);
                                }
                            }
                        });
                    }
                }
            }

        });

        //Creating Menu Bar for the Frame
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(Color.white);

        //Adding File Menu to the Bar
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        //Adding Start/Restart Item to the File Menu
        JMenuItem restartMenuItem = new JMenuItem("Restart");
        restartMenuItem.setBackground(Color.white);
        fileMenu.add(restartMenuItem);

        restartMenuItem.addActionListener(e -> {
            nameButton.setEnabled(true);

            startButton.setVisible(false);
            startButton.setEnabled(true);

            levelComboBox.setVisible(false);
            levelComboBox.setEnabled(true);

            easyPanel.setVisible(false);
            easyPanel.removeAll();

            mediumPanel.setVisible(false);
            mediumPanel.removeAll();

            hardPanel.setVisible(false);
            hardPanel.removeAll();

            levelField.setText("");
            triesField.setText("");
            gamesPlayedField.setText("0");
            gamesWonField.setText("0");
            gamesLostField.setText("0");
        });

        //Adding Level Item to the File Menu
        JMenuItem levelMenuItem = new JMenuItem("Level");
        levelMenuItem.setBackground(Color.white);
        fileMenu.add(levelMenuItem);

        levelMenuItem.addActionListener(e -> {
            startButton.setEnabled(true);
            levelComboBox.setEnabled(true);

            easyPanel.setVisible(false);
            easyPanel.removeAll();

            mediumPanel.setVisible(false);
            mediumPanel.removeAll();

            hardPanel.setVisible(false);
            hardPanel.removeAll();

            levelField.setText("");
            triesField.setText("");
        });

        //Adding Close Item to the File Menu
        JMenuItem closeMenuItem = new JMenuItem("Close");
        closeMenuItem.setBackground(Color.white);
        fileMenu.add(closeMenuItem);

        closeMenuItem.addActionListener(e -> System.exit(0));

        //Adding Help Menu to the Bar
        JMenu helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);

        //Adding Version Item to the Help Menu
        JMenuItem versionMenuItem = new JMenuItem("Version");
        versionMenuItem.setBackground(Color.white);
        helpMenu.add(versionMenuItem);

        versionMenuItem.addActionListener(e -> {
            UIManager.put("OptionPane.background", Color.lightGray);
            UIManager.put("Panel.background", Color.lightGray);
            UIManager.put("Button.background", blueLight);
            UIManager.put("Button.foreground", Color.white);
            String message = "<html><body><div width='190px' align='center'>Version 0.3.7 (beta)</div></body></html>";
            JOptionPane.showMessageDialog(frame, message, "", JOptionPane.PLAIN_MESSAGE);
        });

        //Adding About Item to the Help Menu
        JMenuItem aboutMenuItem = new JMenuItem("About");
        aboutMenuItem.setBackground(Color.white);
        helpMenu.add(aboutMenuItem);

        aboutMenuItem.addActionListener(e -> {
            UIManager.put("OptionPane.background", Color.lightGray);
            UIManager.put("Panel.background", Color.lightGray);
            UIManager.put("Button.background", blueLight);
            UIManager.put("Button.foreground", Color.white);
            String message = "<html><body><div width='190px' align='center'>Author: Oleksandr Shyryayev<br>LaSalle College student</div></body></html>";
            JOptionPane.showMessageDialog(frame, message, "", JOptionPane.PLAIN_MESSAGE);
        });

        //Creating Popup Menu
        JPopupMenu contextMenu = new JPopupMenu();
        mainPanel.setComponentPopupMenu(contextMenu);

        //Adding nightThemeMenuItem to the Popup Menu
        JMenuItem nightThemeMenuItem = new JMenuItem("Night");
        nightThemeMenuItem.setBackground(Color.white);
        contextMenu.add(nightThemeMenuItem);

        //Night theme
        nightThemeMenuItem.addActionListener(e -> {
            mainPanel.setBackground(Color.black);

            easyPanel.setBackground(Color.black);
            mediumPanel.setBackground(Color.black);
            hardPanel.setBackground(Color.black);

            levelLabelForComboBox.setForeground(Color.white);
            levelComboBox.setBackground(Color.black);
            levelComboBox.setForeground(Color.white);
            levelComboBox.setBorder(new LineBorder(Color.white));

            levelLabel.setForeground(Color.white);
            gamesPlayedField.setBackground(Color.black);
            gamesPlayedField.setForeground(Color.white);
            gamesPlayedField.setBorder(new LineBorder(Color.white));

            triesLabel.setForeground(Color.white);
            triesField.setBackground(Color.black);
            triesField.setForeground(Color.white);
            triesField.setBorder(new LineBorder(Color.white));

            gamesPlayedLabel.setForeground(Color.white);
            levelField.setBackground(Color.black);
            levelField.setForeground(Color.white);
            levelField.setBorder(new LineBorder(Color.white));

            gamesWonLabel.setForeground(Color.white);
            gamesWonField.setBackground(Color.black);
            gamesWonField.setForeground(Color.white);
            gamesWonField.setBorder(new LineBorder(Color.white));

            gamesLostLabel.setForeground(Color.white);
            gamesLostField.setBackground(Color.black);
            gamesLostField.setForeground(Color.white);
            gamesLostField.setBorder(new LineBorder(Color.white));

            nameDisplayField.setBackground(Color.black);
            nameDisplayField.setForeground(Color.white);
            nameDisplayField.setBorder(new LineBorder(Color.white));

            looseWinField.setBackground(Color.black);
            looseWinField.setBorder(new LineBorder(Color.black));
        });

        //Adding dayThemeMenuItem to the Popup Menu
        JMenuItem dayThemeMenuItem = new JMenuItem("Day");
        dayThemeMenuItem.setBackground(Color.white);
        contextMenu.add(dayThemeMenuItem);

        //Day theme
        dayThemeMenuItem.addActionListener(e -> {
            mainPanel.setBackground(Color.white);

            easyPanel.setBackground(Color.white);
            mediumPanel.setBackground(Color.white);
            hardPanel.setBackground(Color.white);

            levelLabelForComboBox.setForeground(Color.black);
            levelComboBox.setBackground(Color.white);
            levelComboBox.setForeground(Color.black);
            levelComboBox.setBorder(new LineBorder(Color.black));

            levelLabel.setForeground(Color.black);
            gamesPlayedField.setBackground(Color.white);
            gamesPlayedField.setForeground(Color.black);
            gamesPlayedField.setBorder(new LineBorder(Color.black));

            triesLabel.setForeground(Color.black);
            triesField.setBackground(Color.white);
            triesField.setForeground(Color.black);
            triesField.setBorder(new LineBorder(Color.black));

            gamesPlayedLabel.setForeground(Color.black);
            levelField.setBackground(Color.white);
            levelField.setForeground(Color.black);
            levelField.setBorder(new LineBorder(Color.black));

            gamesWonLabel.setForeground(Color.black);
            gamesWonField.setBackground(Color.white);
            gamesWonField.setForeground(Color.black);
            gamesWonField.setBorder(new LineBorder(Color.black));

            gamesLostLabel.setForeground(Color.black);
            gamesLostField.setBackground(Color.white);
            gamesLostField.setForeground(Color.black);
            gamesLostField.setBorder(new LineBorder(Color.black));

            nameDisplayField.setBackground(Color.white);
            nameDisplayField.setForeground(Color.black);
            nameDisplayField.setBorder(new LineBorder(Color.black));

            looseWinField.setBackground(Color.white);
            looseWinField.setBorder(new LineBorder(Color.white));
        });

        //Adding cyanThemeMenuItem to the Popup Menu
        JMenuItem cyanThemeMenuItem = new JMenuItem("Cyan");
        cyanThemeMenuItem.setBackground(Color.white);
        contextMenu.add(cyanThemeMenuItem);

        //Cyan theme
        cyanThemeMenuItem.addActionListener(e -> {
            mainPanel.setBackground(Color.cyan);

            easyPanel.setBackground(Color.cyan);
            mediumPanel.setBackground(Color.cyan);
            hardPanel.setBackground(Color.cyan);

            levelLabelForComboBox.setForeground(Color.black);
            levelComboBox.setBackground(Color.cyan);
            levelComboBox.setForeground(Color.black);
            levelComboBox.setBorder(new LineBorder(Color.white));

            levelLabel.setForeground(Color.black);
            gamesPlayedField.setBackground(Color.cyan);
            gamesPlayedField.setForeground(Color.black);
            gamesPlayedField.setBorder(new LineBorder(Color.white));

            triesLabel.setForeground(Color.black);
            triesField.setBackground(Color.cyan);
            triesField.setForeground(Color.black);
            triesField.setBorder(new LineBorder(Color.white));

            gamesPlayedLabel.setForeground(Color.black);
            levelField.setBackground(Color.cyan);
            levelField.setForeground(Color.black);
            levelField.setBorder(new LineBorder(Color.white));

            gamesWonLabel.setForeground(Color.black);
            gamesWonField.setBackground(Color.cyan);
            gamesWonField.setForeground(Color.black);
            gamesWonField.setBorder(new LineBorder(Color.white));

            gamesLostLabel.setForeground(Color.black);
            gamesLostField.setBackground(Color.cyan);
            gamesLostField.setForeground(Color.black);
            gamesLostField.setBorder(new LineBorder(Color.white));

            nameDisplayField.setBackground(Color.cyan);
            nameDisplayField.setForeground(Color.black);
            nameDisplayField.setBorder(new LineBorder(Color.white));

            looseWinField.setBackground(Color.cyan);
            looseWinField.setBorder(new LineBorder(Color.cyan));
        });


        this.setJMenuBar(menuBar);
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Find_Green_Button_Game();
    }

}
