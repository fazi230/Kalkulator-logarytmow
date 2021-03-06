/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logarytm;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Konrad
 */
public class LogarytmJFrame extends javax.swing.JFrame {

    /**
     * Creates new form LogarytmJFrame
     */
    double basedb;
    double exponentdb;
    double resultdb;
    String basest;
    String exponentst;
    String resultst;
    public LogarytmJFrame() {
        initComponents();
        errorLabel.setVisible(false);
        ImageIcon img = new ImageIcon("files.png");
        this.setIconImage(img.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        Info = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        exponent = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        base = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        result = new javax.swing.JTextField();
        calcButtons = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Start_menu = new javax.swing.JMenu();
        clear_manu = new javax.swing.JMenuItem();
        clear_history_menu = new javax.swing.JMenuItem();
        exit_menu_item = new javax.swing.JMenuItem();
        Pomoc_menu = new javax.swing.JMenu();
        Info_menu = new javax.swing.JMenu();
        History_manu = new javax.swing.JMenu();

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        Info.setTitle("Info");

        javax.swing.GroupLayout InfoLayout = new javax.swing.GroupLayout(Info.getContentPane());
        Info.getContentPane().setLayout(InfoLayout);
        InfoLayout.setHorizontalGroup(
            InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        InfoLayout.setVerticalGroup(
            InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Liczenie logarytmów");
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Policz swój logarytm");

        exponent.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        exponent.setText("8");
        exponent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exponentActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("log");

        base.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        base.setText("2");
        base.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baseActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setText("=");

        result.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultActionPerformed(evt);
            }
        });

        calcButtons.setText("Oblicz!");
        calcButtons.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calcButtonsMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Wstaw dane w rubryki i kliknij Oblicz!");

        errorLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(255, 51, 51));
        errorLabel.setText("Błąd:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Wpisując w podstawie e, liczysz logarytm naturalny.");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Zasady odnośnie wprowadzania danych są w pomoc.");

        Start_menu.setText("Start");

        clear_manu.setText("Wyczyść");
        clear_manu.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                clear_manuMenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        clear_manu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_manuActionPerformed(evt);
            }
        });
        Start_menu.add(clear_manu);

        clear_history_menu.setText("Wyczyść historię");
        Start_menu.add(clear_history_menu);

        exit_menu_item.setText("Wyjdź");
        Start_menu.add(exit_menu_item);

        jMenuBar1.add(Start_menu);

        Pomoc_menu.setText("Pomoc");
        Pomoc_menu.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                Pomoc_menuMenuSelected(evt);
            }
        });
        jMenuBar1.add(Pomoc_menu);

        Info_menu.setText("O Autorze");
        Info_menu.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                Info_menuMenuSelected(evt);
            }
        });
        jMenuBar1.add(Info_menu);

        History_manu.setText("Historia");
        History_manu.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                History_manuMenuSelected(evt);
            }
        });
        jMenuBar1.add(History_manu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(calcButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(errorLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(base, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(exponent, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(86, 86, 86)
                        .addComponent(base, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(exponent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8)
                .addComponent(errorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calcButtons)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exponentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exponentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exponentActionPerformed

    private void baseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_baseActionPerformed

    private void resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultActionPerformed

    private void calcButtonsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcButtonsMouseClicked
        errorLabel.setVisible(false);
        switch(checkfields())
        {
            //podstawa pusta
            case 1:
                convertresult();
                if(convertexponent()!=0)
                {
                    calcbase();
                }
                break;
            //wykładnik
            case 2:
                convertresult();
               if(convertbase()!=1)
                {
                    calcexponent();
                }
                break;
            //wynik logarytmu pusty
            case 3:
                if(convertbase()!=1 && convertexponent()!=0)
                {
                    calcresult();
                }
                break;
            default: 
                errorLabel.setText("Błąd: Zbyt mało lub zbyt dużo danych!");
                errorLabel.setVisible(true);
                break;
        }
    }//GEN-LAST:event_calcButtonsMouseClicked

    private void clear_manuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_manuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clear_manuActionPerformed

    private void Pomoc_menuMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_Pomoc_menuMenuSelected
    Pomoc pomoc = new Pomoc();
    pomoc.setVisible(true);
    
    }//GEN-LAST:event_Pomoc_menuMenuSelected

    private void Info_menuMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_Info_menuMenuSelected
    JOptionPane info = new JOptionPane();
    info.setName("Info");// TODO add your handling code here:
    JOptionPane.showMessageDialog(this,
    "Konrad Mazur \n Politechnika Lubelska \n 2020r.");
    }//GEN-LAST:event_Info_menuMenuSelected

    private void History_manuMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_History_manuMenuSelected
    Historia his = new Historia();
    his.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_History_manuMenuSelected

    private void clear_manuMenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_clear_manuMenuKeyPressed
        base.setText("");
        exponent.setText("");
        result.setText("");
    }//GEN-LAST:event_clear_manuMenuKeyPressed
    private int checkfields()
    {
        basest = base.getText();
        exponentst = exponent.getText();
        resultst = result.getText();
        int blankcount=0;
        //sprawdź puste
        if(basest.equals(""))
        {
            blankcount++;
        }
        if(exponentst.equals(""))
        {
            blankcount++;
        }
        if(resultst.equals(""))
        {
            blankcount++;
        }
        if(blankcount > 1)
        {
            return 9;
        }
        if(basest.equals("") || basest.equals("x") || basest.equals("X"))
        {
            return 1;
        }
        else if(exponentst.equals("") || exponentst.equals("x") || exponentst.equals("X"))
        {
            return 2;
        }
        else if(resultst.equals("") || resultst.equals("x") || resultst.equals("X"))
        {
            return 3;
        }
        return 0;
    }
    private double convertbase()
    {
        try
        {
            basedb = Double.parseDouble(basest);
            if(basedb<=0||basedb==1)
            {
                errorLabel.setText("Błąd: zła podstawa!");
                errorLabel.setVisible(true);
                return 1;
            }
        }
        catch(NumberFormatException e)
        {
            errorLabel.setText("Błąd: zła podstawa!");
            errorLabel.setVisible(true);
            return 1;
        }
        return basedb;
    }
    private double convertexponent()
    {
        try
        {
            exponentdb =  Double.parseDouble(exponentst);
            if(exponentdb<=0)
            {
                errorLabel.setText("Błąd: zły wykładnik!");
                errorLabel.setVisible(true);
                return 0;
            }
        }
        catch(NumberFormatException e)
        {
            errorLabel.setText("Błąd: złe dane!");
            errorLabel.setVisible(true);
            return 0;
        }
            
        return exponentdb;
    }
    private double convertresult()
    {
        try
        {
            resultdb = Double.parseDouble(resultst);
           
        }
        catch(NumberFormatException e)
        {
            errorLabel.setText("Błąd: złe dane!");
            errorLabel.setVisible(true);
            return 0;
        }
            
         return resultdb;
    }
    private void calcbase()
    {
        Double div = 1/resultdb;
        Double var = pow(exponentdb,div);
        base.setText(var.toString());
    }
    private void calcexponent()
    {
        Double var = pow(basedb,resultdb);
        System.out.println(resultdb);
        if(resultdb == 0.0)
        {
            var = 1.0;
        }
        exponent.setText(var.toString());
    }
    private void calcresult()
    {
        Double myresult = new Double(1);
        Double step = new Double(1);
        if(exponentdb==1)
        {
           result.setText("0");
           return;
        }
        else if(exponentdb>basedb)
        {
            while(abs(pow(basedb,myresult)-exponentdb)>0.01)
            {
                if(pow(basedb,myresult)>exponentdb)
                {
                    myresult -= step;
                    step = step/2;
                }
                myresult += step;
                System.out.println(pow(basedb,myresult));
            }
        }
        else if(exponentdb<basedb && exponentdb>1)
        {
            myresult = 0.0;
            step = 0.1;
            while(abs(pow(basedb,myresult)-exponentdb)>0.0000001)
            {
                if(pow(basedb,myresult)>exponentdb)
                {
                    myresult -= step;
                    step = step/10;
                }
                myresult += step;
                System.out.println(pow(basedb,myresult));
            }
        }
        else if(exponentdb<basedb && exponentdb<1)
        {
            myresult = -1.0;
            step = 1.0;
             while(abs(pow(basedb,myresult)-exponentdb)>0)
            {
                if(pow(basedb,myresult)<exponentdb)
                {
                    myresult += step;
                    step = step/2;
                }
                else
                {
                     myresult -= step;
                }
                System.out.println(pow(basedb,myresult));
            }
        }
        result.setText(myresult.toString());
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogarytmJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogarytmJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogarytmJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogarytmJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogarytmJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu History_manu;
    private javax.swing.JDialog Info;
    private javax.swing.JMenu Info_menu;
    private javax.swing.JMenu Pomoc_menu;
    private javax.swing.JMenu Start_menu;
    private javax.swing.JTextField base;
    private javax.swing.JButton calcButtons;
    private javax.swing.JMenuItem clear_history_menu;
    private javax.swing.JMenuItem clear_manu;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JMenuItem exit_menu_item;
    private javax.swing.JTextField exponent;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField result;
    // End of variables declaration//GEN-END:variables
}
