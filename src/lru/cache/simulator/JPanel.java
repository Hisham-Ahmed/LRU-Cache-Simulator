package lru.cache.simulator;

import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author HishamAhmed
 */
public class JPanel extends javax.swing.JPanel {
    int NoOfFrames = 6;
    Queue que;
    Hash has;
    float request = 0;
    float hit = 0;
    float miss = 0;
    int value = 1;
    DecimalFormat df = new DecimalFormat("#.##");
    float missrate = 0;
    public JPanel() {
        que = new Queue(NoOfFrames);
        has = new Hash(10);
        initComponents();
        noOfFrames.setText("Cache of Frames: " + NoOfFrames);
        Req.setText("Total Requests: " + request);
        update();
    }
    public void update(){
        if(request!=0){
            missrate = (miss/request)*100;
            missrate= Float.valueOf(df.format(missrate));
        }
        Req.setText("Total Requests: " + request);
        Hit.setText("Hits: " + hit);
        Miss.setText("Misses: " + miss);
        Missrate.setText("Miss Rate: " + missrate + "%");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        Pages = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Cache = new javax.swing.JTextField();
        noOfFrames = new javax.swing.JLabel();
        Req = new javax.swing.JLabel();
        Hit = new javax.swing.JLabel();
        Miss = new javax.swing.JLabel();
        Missrate = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        indicator = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(56, 56, 58));
        setToolTipText("");
        setMinimumSize(new java.awt.Dimension(400, 300));
        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(250, 250, 250));
        jLabel2.setText("Request Page: (0-9)");
        jLabel2.setVerifyInputWhenFocusTarget(false);
        add(jLabel2);
        jLabel2.setBounds(130, 100, 140, 20);

        Pages.setVerifyInputWhenFocusTarget(false);
        Pages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagesActionPerformed(evt);
            }
        });
        add(Pages);
        Pages.setBounds(170, 130, 60, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(250, 250, 250));
        jLabel3.setText("Current Cache Queue:");
        add(jLabel3);
        jLabel3.setBounds(10, 170, 140, 20);

        Cache.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Cache.setDisabledTextColor(new java.awt.Color(10, 10, 10));
        Cache.setEnabled(false);
        Cache.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CacheActionPerformed(evt);
            }
        });
        add(Cache);
        Cache.setBounds(150, 170, 100, 20);

        noOfFrames.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        noOfFrames.setForeground(new java.awt.Color(250, 250, 250));
        noOfFrames.setText("Number of Frames:");
        add(noOfFrames);
        noOfFrames.setBounds(10, 20, 130, 20);

        Req.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Req.setForeground(new java.awt.Color(250, 250, 250));
        Req.setText("Total Requests:");
        add(Req);
        Req.setBounds(10, 200, 140, 15);

        Hit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Hit.setForeground(new java.awt.Color(250, 250, 250));
        Hit.setText("Hits:");
        add(Hit);
        Hit.setBounds(10, 220, 110, 15);

        Miss.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Miss.setForeground(new java.awt.Color(250, 250, 250));
        Miss.setText("Misses:");
        add(Miss);
        Miss.setBounds(10, 240, 110, 15);

        Missrate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Missrate.setForeground(new java.awt.Color(250, 250, 250));
        Missrate.setText("Miss Rate:");
        add(Missrate);
        Missrate.setBounds(10, 260, 140, 15);

        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(310, 300, 80, 23);

        jButton2.setText("Credits");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(10, 300, 90, 23);

        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(170, 340, 73, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(250, 250, 250));
        jLabel4.setText("Select Type:");
        jLabel4.setToolTipText("");
        add(jLabel4);
        jLabel4.setBounds(10, 50, 90, 15);

        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("LRU Cache");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        add(jRadioButton1);
        jRadioButton1.setBounds(40, 70, 100, 23);

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setText("MRU Cache");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        add(jRadioButton2);
        jRadioButton2.setBounds(260, 70, 100, 23);

        indicator.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        indicator.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(indicator);
        indicator.setBounds(260, 170, 50, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void PagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagesActionPerformed
        int page = -1;
        String s = Pages.getText().toString();
        if(Pages.getText().isEmpty() || Pages.getText() == " "){
            JOptionPane.showMessageDialog(this, "Please Enter Something!",
                    "Invalid Input!", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            page = Integer.parseInt(s);
            if(page > 9 || page < 0){
                JOptionPane.showMessageDialog(this, "Please Enter Pages from (0-9) only.", 
                        "Invalid Input!", JOptionPane.INFORMATION_MESSAGE);    
            }else if(page != -1){
                LRUCacheSimulator object = new LRUCacheSimulator();
                request++;
                if (object.getPage(que, has, page, value, NoOfFrames)){
                    //JOptionPane.showMessageDialog(this, "HIT!!!");
                    indicator.setBackground(Color.green);
                    indicator.setText("Hit!");
                    hit++;
                }else{
                    //JOptionPane.showMessageDialog(this, "MISS!!!");
                    indicator.setBackground(Color.red);
                    indicator.setText("Miss!");
                    miss++;
                }
                String cache = que.printQueue();
                Cache.setText(cache);
            }else if(page == -1){
                JOptionPane.showMessageDialog(this, "Invalid Input!!!",
                        "Alert", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        Pages.setText("");
        update();
    }//GEN-LAST:event_PagesActionPerformed

    private void CacheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CacheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CacheActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(this,          
              "\n(K14-2069)\t      MUZNA AKHTAR"
            + "\n(K14-2120)\t      HAFSAH NAEEM"
            + "\n(K14-2341)\t      SARA AKHTAR"
            + "\n(K14-2095)\t      SHAHERYAR RASHID"
            + "\n(K14-2081)\t      HISHAM AHMED",
                "Group Members", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        que.deleteQueue();
        indicator.setBackground(Color.LIGHT_GRAY);
        indicator.setText("");
        que = new Queue(NoOfFrames);
        has = new Hash(10);
        Cache.setText("");
        Pages.setText("");
        request = 0;
        missrate = 0;
        miss = 0;
        hit = 0;
        update();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        value = 1;
        System.out.println("In LRU");
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        value = 0;
        System.out.println("In MRU");
    }//GEN-LAST:event_jRadioButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cache;
    private javax.swing.JLabel Hit;
    private javax.swing.JLabel Miss;
    private javax.swing.JLabel Missrate;
    private javax.swing.JTextField Pages;
    private javax.swing.JLabel Req;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton indicator;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel noOfFrames;
    // End of variables declaration//GEN-END:variables
}