/**
 *
 * @author mounika,hari
 */
package com.adaptive.view;

import com.adaptive.entities.MainClass;
import com.adaptive.entities.OneTimePassword;
import com.adaptive.entities.Question;
import com.adaptive.manager.StudentManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import org.springframework.stereotype.Component;
import com.adaptive.entities.Student;
import com.adaptive.entities.TestDetail;
import com.adaptive.utility.PlaySound;
import com.adaptive.utility.SpellChecker;
import static com.adaptive.view.TestFrame.indexQuestion;
import static com.adaptive.view.TestFrame.totalTime;
import java.awt.Color;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListCellRenderer;
import javax.swing.Timer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;



/**
 *
 * @author mounika,hari
 */

@Component
public class Listening extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form A
     */
    
    @Autowired
    StudentManager manager;
    
    public TestDetail testDetail = null;
   public List<Question> questionList = new ArrayList<>();
   public static int indexQuestion = 0;
   public String testCategory = null;
   public int minutes = 2;
   public int second = 60;
   Timer timer = new Timer(1000, this);
   
   
   
    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }
    
    
    
    public Listening() {
        initComponents();
           }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        headingLabel = new javax.swing.JLabel();
        questionLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        timeLabel = new javax.swing.JLabel();
        mathsButton = new javax.swing.JButton();
        spellButton = new javax.swing.JButton();
        totalTimeLabel = new javax.swing.JLabel();
        writingButton = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headingLabel.setText("Adaptive Test");

        questionLabel.setText("Play the voice file below");

        jButton1.setText("Submit Test");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Next Question");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Submit Answer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        timeLabel.setText("jLabel1");

        mathsButton.setText("MATHS");
        mathsButton.setToolTipText("");
        mathsButton.setEnabled(false);

        spellButton.setText("SPELLING");
        spellButton.setEnabled(false);

        totalTimeLabel.setText("jLabel1");

        writingButton.setText("Writing");
        writingButton.setEnabled(false);

        jRadioButton1.setText("One Sentence Voice");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        jButton5.setText("Listening");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mathsButton)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(headingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(134, 134, 134))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(spellButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(writingButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton5))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton1)
                                    .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)))))
                .addContainerGap(213, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalTimeLabel)
                    .addComponent(timeLabel))
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(totalTimeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timeLabel)
                .addGap(7, 7, 7)
                .addComponent(headingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spellButton)
                    .addComponent(mathsButton)
                    .addComponent(writingButton)
                    .addComponent(jButton5))
                .addGap(20, 20, 20)
                .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton1)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // submit Answer
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        indexQuestion = indexQuestion + 1;
        this.showQuestion(indexQuestion);
        if(indexQuestion ==1)
        questionLabel.setText("Play the below audio file");
        if(indexQuestion ==2)
        questionLabel.setText("Play the below recording file");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //submit test
        try{
            testDetail = new TestDetail();
            testDetail.setQuestionWithAnswer(this.questionList);
            testDetail.setCategory(testCategory);
            testDetail.setMinutes(String.valueOf(getMinutesTaken()));
            testDetail.setSecond(String.valueOf(getSecondTaken()));
            //manager.submitListeningTest(testDetail);
            timer.stop();
            JOptionPane.showMessageDialog(this, "Test Submitted Successfully");
           // askForNextCategoryTest();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if(indexQuestion == 0)
        {
            PlaySound.play(PlaySound.one_sentence_file);
        }
        if(indexQuestion == 1)
        {
             PlaySound.play(PlaySound.next_sentence_file);
        }
        if(indexQuestion == 2)
        {
             PlaySound.play(PlaySound.third_sentence_file);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Listening.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Listening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listening().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel headingLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton mathsButton;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JButton spellButton;
    private javax.swing.JTextArea textArea;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel totalTimeLabel;
    public javax.swing.JButton writingButton;
    // End of variables declaration//GEN-END:variables
    ButtonGroup group = new ButtonGroup();
  
    public JLabel getHeadingLabel() {
        return headingLabel;
    }

    public void setHeadingLabel(JLabel headingLabel) {
        this.headingLabel = headingLabel;
    }

     public void showQuestion(int index) {
         try{
       this.questionLabel.setText(this.questionList.get(index).getQuestion());
       this.testCategory = this.questionList.get(index).getCategory();
       }catch(IndexOutOfBoundsException excp)
         {
                excp.printStackTrace();
         }
    }

    public void startTime(){
        timer.setInitialDelay(0);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            second = second - 1;
            if(second <= 0)
            {
                if(minutes <= 0)
                {
                    PlaySound.stop();
                    JOptionPane.showMessageDialog(this, "Test time is over!! Test will submit automatically ");
                    jButton1ActionPerformed(null);
                    this.timer.stop();
                }
                minutes = minutes -1 ; 
                totalTime = totalTime -1;
                second = 60;
            }
             if(minutes == 0)
                {
                   timeLabel.setForeground(Color.red);
                    PlaySound.play(PlaySound.alert_file);
                }
            timeLabel.setText("00:"+minutes+":"+second);
            totalTimeLabel.setText("00:"+totalTime+":"+second);
    }

 

    private void askForNextCategoryTest() {
    int status =  JOptionPane.showConfirmDialog(this, "Do you want to start next test ?");
    System.out.print(status);
    if(status == 0)
    {
        try {
            questionList = manager.getTestPaper("2");
           // showQuestion(0);
            timer.start();
            
        } catch (Exception ex) {
            Logger.getLogger(Listening.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }else
    {
        this.dispose();
    }
    

    }

     public int getMinutesTaken() {
            return 2 - this.minutes;
    }

    public int getSecondTaken() {
            return 60 - this.second;
    }
    
   
}