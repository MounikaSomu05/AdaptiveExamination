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
import static com.adaptive.view.TestFrame.indexQuestion;
import static com.adaptive.view.TestFrame.totalTime;
import java.awt.Color;
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
public class SpellingTest extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form A
     */
    
    @Autowired
    StudentManager manager;
    
    @Autowired
    Writing writing;
    
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
    
    
    
    public SpellingTest() {
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
        buttonCategory2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        totalTimeLabel = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headingLabel.setText("Adaptive Test");

        questionLabel.setText("jLabel2");

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

        buttonCategory2.setText("SPELLING");

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        totalTimeLabel.setText("jLabel1");

        jButton4.setText("Writing");
        jButton4.setEnabled(false);

        jButton5.setText("Listening");
        jButton5.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(mathsButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(headingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(126, 126, 126))
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(buttonCategory2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton5))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(questionLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(totalTimeLabel)
                        .addComponent(timeLabel)))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(totalTimeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timeLabel)
                .addGap(35, 35, 35)
                .addComponent(headingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCategory2)
                    .addComponent(mathsButton)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(20, 20, 20)
                .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(91, 91, 91))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        indexQuestion = indexQuestion + 1;    
        this.showQuestion(indexQuestion);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       // submit Answer
       this.questionList.get(indexQuestion).setSelectedOption(textArea.getText());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //submit test
        try{
         testDetail = new TestDetail();
        testDetail.setQuestionWithAnswer(this.questionList);
        testDetail.setCategory(testCategory);
        testDetail.setMinutes(String.valueOf(getMinutesTaken()));
        testDetail.setSecond(String.valueOf(getSecondTaken()));
        manager.submitTest(testDetail);
        timer.stop();
        JOptionPane.showMessageDialog(this, "Test Submitted Successfully");
        askForNextCategoryTest();
        }catch(Exception e)
        {
        e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SpellingTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SpellingTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SpellingTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SpellingTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SpellingTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCategory2;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel headingLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton mathsButton;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JTextArea textArea;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel totalTimeLabel;
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
            List<Question> questionList = manager.getTestPaper("3");
            writing.setQuestionList(questionList);
            writing.showQuestion(writing.indexQuestion);
            writing.setVisible(true);
            writing.startTime();
            writing.spellButton.setToolTipText(testDetail.getMinutes() + ":" + testDetail.getSecond());
            this.dispose();
            
        } catch (Exception ex) {
            Logger.getLogger(SpellingTest.class.getName()).log(Level.SEVERE, null, ex);
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
