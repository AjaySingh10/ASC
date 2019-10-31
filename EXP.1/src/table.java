

import com.sun.rowset.internal.Row;
import java.awt.Color;
import java.text.DecimalFormat;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

/**
 *
 * @author Alien's Ajjuu
 */
public class table extends javax.swing.JFrame {

int mst;
    /**
     * Creates new form table
     */
    public table() {
        initComponents();
    }

    public void mtable(float[] arr)
    {

        DefaultTableModel model = (DefaultTableModel)jTable1.getModel() ;


        Object[] row=new Object[7];
        float r1s=0,r2s=0,r3s=0,r4s=0,r5s=0,r6s=0,r7s=0;
          int len=(arr.length+1)/2;
        DecimalFormat df4 = new DecimalFormat("#.####");


        if(len==8){

            float[] r1=Arrays.copyOfRange(arr,0,len);

            float[] r2=Arrays.copyOfRange(arr,len,len+4);

            float[] r3=Arrays.copyOfRange(arr,len+4,len+6);

            float[] r4=Arrays.copyOfRange(arr,len+6,arr.length);

            for (int i = 0; i <len; i++)
            {
                row[0]="  ("+(i+1)+")";
                row[1]=r1[i];

                r1s=r1s+r1[i];

                if(i<4)
                { row[2]=r2[i];

                    r2s=r2s+r2[i];

                    if(i<2)
                    {
                        row[3]=r3[i];

                        r3s=r3s+r3[i];

                    }
                    else
                    {
                        row[3]="";
                    }
                    if(i<1)
                    {
                        row[4]=r4[i];

                        r4s=r4s+r4[i];

                    }
                    else
                    {
                        row[4]="";
                    }
                }

                else
                {
                    row[2]="";
                    row[3]="";
                    row[4]="";
                }
                model.addRow(row);}

            row[0]="";
            row[1]="";
            model.addRow(row);


            row[0]="  AVG";
            row[1]=df4.format(r1s/8);
            row[2]=df4.format(r2s/4);
            row[3]=r3s/2;
            row[4]=r4s;
            model.addRow(row);


        }


        else if(len==16)
        {
            float[] r1=Arrays.copyOfRange(arr,0,len);

            float[] r2=Arrays.copyOfRange(arr,len,len+8);

            float[] r3=Arrays.copyOfRange(arr,len+8,len+12);

            float[] r4=Arrays.copyOfRange(arr,len+12,len+14);

            float[] r5=Arrays.copyOfRange(arr,len+14,arr.length);

            for (int i = 0; i <len; i++)
            {
                row[0]="  ("+(i+1)+")";

                row[1]=r1[i];
                r1s=r1s+r1[i];
                if(i<8)
                {
                    row[2]=r2[i];
                    r2s=r2s+r2[i];
                    if(i<4)
                    {
                        row[3]=r3[i];
                        r3s=r3s+r3[i];
                    }
                    else
                    {
                        row[3]="";
                    }


                    if(i<2)
                    {
                        row[4]=r4[i];
                        r4s=r4s+r4[i];
                    }
                    else
                    {
                        row[4]="";
                    }

                    if(i<1)
                    {
                        row[5]=r5[i];
                        r5s=r5s+r5[i];
                    }
                    else
                    {
                        row[5]="";}
                }

                else
                {
                    row[2]="";
                    row[3]="";
                    row[4]="";
                    row[4]="";
                }
                model.addRow(row);}

            row[0]="";
            row[1]="";
            model.addRow(row);


            row[0]="  AVG";
            row[1]=r1s/16;
            row[2]=r2s/8;
            row[3]=r3s/4;
            row[4]=r4s/2;
            row[5]=r5s;
            model.addRow(row);

        }



        else if(len==32)
        {


            float[] r1=Arrays.copyOfRange(arr,0,len);

            float[] r2=Arrays.copyOfRange(arr,len,len+16);

            float[] r3=Arrays.copyOfRange(arr,len+16,len+24);

            float[] r4=Arrays.copyOfRange(arr,len+24,len+28);

            float[] r5=Arrays.copyOfRange(arr,len+28,len+30);

            float[] r6=Arrays.copyOfRange(arr,len+30,arr.length);

            for (int i = 0; i <len; i++)
            {
                row[0]="  ("+(i+1)+")";

                row[1]=r1[i];

                r1s=r1s+r1[i];

                if(i<16)
                {
                    row[2]=r2[i];
                    if(i<8)
                    {
                        row[3]=r3[i];}
                    else
                    {
                        row[3]="";
                    }

                    if(i<4)
                    {
                        row[4]=r4[i];
                    }
                    else
                    {
                        row[4]="";
                    }


                    if(i<2)
                    {
                        row[5]=r5[i];
                    }
                    else
                    {
                        row[5]="";
                    }

                    if(i<1)
                    {
                        row[6]=r6[i];
                    }
                    else
                    {
                        row[6]="";
                    }
                }

                else
                {
                    row[2]="";
                    row[3]="";
                    row[4]="";
                    row[5]="";
                    row[6]="";
                }

                model.addRow(row);

            }



        }


    }



    public void itable(float[] arr)
    {

        DefaultTableModel model = (DefaultTableModel)jTable3.getModel() ;

        Object[] row=new Object[7];
        float r1s=0,r2s=0,r3s=0,r4s=0,r5s=0,r6s=0,r7s=0;
        int len=(arr.length+1)/2;
        DecimalFormat df4 = new DecimalFormat("#.####");


        if(len==8){

            float[] r1=Arrays.copyOfRange(arr,0,len);

            float[] r2=Arrays.copyOfRange(arr,len,len+4);

            float[] r3=Arrays.copyOfRange(arr,len+4,len+6);

            float[] r4=Arrays.copyOfRange(arr,len+6,arr.length);

            for (int i = 0; i <len; i++)
            {
                row[0]="  ("+(i+1)+")";
                row[1]=r1[i];

                r1s=r1s+r1[i];

                if(i<4)
                { row[2]=r2[i];

                    r2s=r2s+r2[i];

                    if(i<2)
                    {
                        row[3]=r3[i];

                        r3s=r3s+r3[i];

                    }
                    else
                    {
                        row[3]="";
                    }
                    if(i<1)
                    {
                        row[4]=r4[i];

                        r4s=r4s+r4[i];

                    }
                    else
                    {
                        row[4]="";
                    }
                }

                else
                {
                    row[2]="";
                    row[3]="";
                    row[4]="";
                }
                model.addRow(row);}

            row[0]="";
            row[1]="";
            model.addRow(row);


            row[0]="  AVG";
            row[1]=df4.format(r1s/8);
            row[2]=df4.format(r2s/4);
            row[3]=r3s/2;
            row[4]=r4s;
            model.addRow(row);


        }


        else if(len==16)
        {
            float[] r1=Arrays.copyOfRange(arr,0,len);

            float[] r2=Arrays.copyOfRange(arr,len,len+8);

            float[] r3=Arrays.copyOfRange(arr,len+8,len+12);

            float[] r4=Arrays.copyOfRange(arr,len+12,len+14);

            float[] r5=Arrays.copyOfRange(arr,len+14,arr.length);

            for (int i = 0; i <len; i++)
            {
                row[0]="  ("+(i+1)+")";

                row[1]=r1[i];
                r1s=r1s+r1[i];
                if(i<8)
                {
                    row[2]=r2[i];
                    r2s=r2s+r2[i];
                    if(i<4)
                    {
                        row[3]=r3[i];
                        r3s=r3s+r3[i];
                    }
                    else
                    {
                        row[3]="";
                    }


                    if(i<2)
                    {
                        row[4]=r4[i];
                        r4s=r4s+r4[i];
                    }
                    else
                    {
                        row[4]="";
                    }

                    if(i<1)
                    {
                        row[5]=r5[i];
                        r5s=r5s+r5[i];
                    }
                    else
                    {
                        row[5]="";}
                }

                else
                {
                    row[2]="";
                    row[3]="";
                    row[4]="";
                    row[4]="";
                }
                model.addRow(row);}

            row[0]="";
            row[1]="";
            model.addRow(row);


            row[0]="  AVG";
            row[1]=r1s/16;
            row[2]=r2s/8;
            row[3]=r3s/4;
            row[4]=r4s/2;
            row[5]=r5s;
            model.addRow(row);

        }



        else if(len==32)
        {


            float[] r1=Arrays.copyOfRange(arr,0,len);

            float[] r2=Arrays.copyOfRange(arr,len,len+16);

            float[] r3=Arrays.copyOfRange(arr,len+16,len+24);

            float[] r4=Arrays.copyOfRange(arr,len+24,len+28);

            float[] r5=Arrays.copyOfRange(arr,len+28,len+30);

            float[] r6=Arrays.copyOfRange(arr,len+30,arr.length);

            for (int i = 0; i <len; i++)
            {
                row[0]="  ("+(i+1)+")";

                row[1]=r1[i];

                r1s=r1s+r1[i];

                if(i<16)
                {
                    row[2]=r2[i];
                    if(i<8)
                    {
                        row[3]=r3[i];}
                    else
                    {
                        row[3]="";
                    }

                    if(i<4)
                    {
                        row[4]=r4[i];
                    }
                    else
                    {
                        row[4]="";
                    }


                    if(i<2)
                    {
                        row[5]=r5[i];
                    }
                    else
                    {
                        row[5]="";
                    }

                    if(i<1)
                    {
                        row[6]=r6[i];
                    }
                    else
                    {
                        row[6]="";
                    }
                }

                else
                {
                    row[2]="";
                    row[3]="";
                    row[4]="";
                    row[5]="";
                    row[6]="";
                }

                model.addRow(row);

            }



        }



    }


    public void qtable(float[] arr)
    {

        DefaultTableModel model = (DefaultTableModel)jTable5.getModel() ;


        Object[] row=new Object[7];
        float r1s=0,r2s=0,r3s=0,r4s=0,r5s=0,r6s=0,r7s=0;
        int len=(arr.length+1)/2;
        DecimalFormat df4 = new DecimalFormat("#.####");


        if(len==8){

            float[] r1=Arrays.copyOfRange(arr,0,len);

            float[] r2=Arrays.copyOfRange(arr,len,len+4);

            float[] r3=Arrays.copyOfRange(arr,len+4,len+6);

            float[] r4=Arrays.copyOfRange(arr,len+6,arr.length);

            for (int i = 0; i <len; i++)
            {
                row[0]="  ("+(i+1)+")";
                row[1]=r1[i];

                r1s=r1s+r1[i];

                if(i<4)
                { row[2]=r2[i];

                    r2s=r2s+r2[i];

                    if(i<2)
                    {
                        row[3]=r3[i];

                        r3s=r3s+r3[i];

                    }
                    else
                    {
                        row[3]="";
                    }
                    if(i<1)
                    {
                        row[4]=r4[i];

                        r4s=r4s+r4[i];

                    }
                    else
                    {
                        row[4]="";
                    }
                }

                else
                {
                    row[2]="";
                    row[3]="";
                    row[4]="";
                }
                model.addRow(row);}

            row[0]="";
            row[1]="";
            model.addRow(row);


            row[0]="  AVG";
            row[1]=df4.format(r1s/8);
            row[2]=df4.format(r2s/4);
            row[3]=r3s/2;
            row[4]=r4s;
            model.addRow(row);


        }


        else if(len==16)
        {
            float[] r1=Arrays.copyOfRange(arr,0,len);

            float[] r2=Arrays.copyOfRange(arr,len,len+8);

            float[] r3=Arrays.copyOfRange(arr,len+8,len+12);

            float[] r4=Arrays.copyOfRange(arr,len+12,len+14);

            float[] r5=Arrays.copyOfRange(arr,len+14,arr.length);

            for (int i = 0; i <len; i++)
            {
                row[0]="  ("+(i+1)+")";

                row[1]=r1[i];
                r1s=r1s+r1[i];
                if(i<8)
                {
                    row[2]=r2[i];
                    r2s=r2s+r2[i];
                    if(i<4)
                    {
                        row[3]=r3[i];
                        r3s=r3s+r3[i];
                    }
                    else
                    {
                        row[3]="";
                    }


                    if(i<2)
                    {
                        row[4]=r4[i];
                        r4s=r4s+r4[i];
                    }
                    else
                    {
                        row[4]="";
                    }

                    if(i<1)
                    {
                        row[5]=r5[i];
                        r5s=r5s+r5[i];
                    }
                    else
                    {
                        row[5]="";}
                }

                else
                {
                    row[2]="";
                    row[3]="";
                    row[4]="";
                    row[4]="";
                }
                model.addRow(row);}

            row[0]="";
            row[1]="";
            model.addRow(row);


            row[0]="  AVG";
            row[1]=r1s/16;
            row[2]=r2s/8;
            row[3]=r3s/4;
            row[4]=r4s/2;
            row[5]=r5s;
            model.addRow(row);

        }



        else if(len==32)
        {


            float[] r1=Arrays.copyOfRange(arr,0,len);

            float[] r2=Arrays.copyOfRange(arr,len,len+16);

            float[] r3=Arrays.copyOfRange(arr,len+16,len+24);

            float[] r4=Arrays.copyOfRange(arr,len+24,len+28);

            float[] r5=Arrays.copyOfRange(arr,len+28,len+30);

            float[] r6=Arrays.copyOfRange(arr,len+30,arr.length);

            for (int i = 0; i <len; i++)
            {
                row[0]="  ("+(i+1)+")";

                row[1]=r1[i];

                r1s=r1s+r1[i];

                if(i<16)
                {
                    row[2]=r2[i];
                    if(i<8)
                    {
                        row[3]=r3[i];}
                    else
                    {
                        row[3]="";
                    }

                    if(i<4)
                    {
                        row[4]=r4[i];
                    }
                    else
                    {
                        row[4]="";
                    }


                    if(i<2)
                    {
                        row[5]=r5[i];
                    }
                    else
                    {
                        row[5]="";
                    }

                    if(i<1)
                    {
                        row[6]=r6[i];
                    }
                    else
                    {
                        row[6]="";
                    }
                }

                else
                {
                    row[2]="";
                    row[3]="";
                    row[4]="";
                    row[5]="";
                    row[6]="";
                }

                model.addRow(row);

            }



        }



    }

    public void htable(float[] arr)
    {

        DefaultTableModel model = (DefaultTableModel)jTable2.getModel() ;


        Object[] row=new Object[7];
        float r1s=0,r2s=0,r3s=0,r4s=0,r5s=0,r6s=0,r7s=0;
        int len=(arr.length+1)/2;
        DecimalFormat df4 = new DecimalFormat("#.####");


        if(len==8){

            float[] r1=Arrays.copyOfRange(arr,0,len);

            float[] r2=Arrays.copyOfRange(arr,len,len+4);

            float[] r3=Arrays.copyOfRange(arr,len+4,len+6);

            float[] r4=Arrays.copyOfRange(arr,len+6,arr.length);

            for (int i = 0; i <len; i++)
            {
                row[0]="  ("+(i+1)+")";
                row[1]=r1[i];

                r1s=r1s+r1[i];

                if(i<4)
                { row[2]=r2[i];

                    r2s=r2s+r2[i];

                    if(i<2)
                    {
                        row[3]=r3[i];

                        r3s=r3s+r3[i];

                    }
                    else
                    {
                        row[3]="";
                    }
                    if(i<1)
                    {
                        row[4]=r4[i];

                        r4s=r4s+r4[i];

                    }
                    else
                    {
                        row[4]="";
                    }
                }

                else
                {
                    row[2]="";
                    row[3]="";
                    row[4]="";
                }
                model.addRow(row);}

            row[0]="";
            row[1]="";
            model.addRow(row);


            row[0]="  AVG";
            row[1]=df4.format(r1s/8);
            row[2]=df4.format(r2s/4);
            row[3]=r3s/2;
            row[4]=r4s;
            model.addRow(row);


        }


        else if(len==16)
        {
            float[] r1=Arrays.copyOfRange(arr,0,len);

            float[] r2=Arrays.copyOfRange(arr,len,len+8);

            float[] r3=Arrays.copyOfRange(arr,len+8,len+12);

            float[] r4=Arrays.copyOfRange(arr,len+12,len+14);

            float[] r5=Arrays.copyOfRange(arr,len+14,arr.length);

            for (int i = 0; i <len; i++)
            {
                row[0]="  ("+(i+1)+")";

                row[1]=r1[i];
                r1s=r1s+r1[i];
                if(i<8)
                {
                    row[2]=r2[i];
                    r2s=r2s+r2[i];
                    if(i<4)
                    {
                        row[3]=r3[i];
                        r3s=r3s+r3[i];
                    }
                    else
                    {
                        row[3]="";
                    }


                    if(i<2)
                    {
                        row[4]=r4[i];
                        r4s=r4s+r4[i];
                    }
                    else
                    {
                        row[4]="";
                    }

                    if(i<1)
                    {
                        row[5]=r5[i];
                        r5s=r5s+r5[i];
                    }
                    else
                    {
                        row[5]="";}
                }

                else
                {
                    row[2]="";
                    row[3]="";
                    row[4]="";
                    row[4]="";
                }
                model.addRow(row);}

            row[0]="";
            row[1]="";
            model.addRow(row);


            row[0]="  AVG";
            row[1]=r1s/16;
            row[2]=r2s/8;
            row[3]=r3s/4;
            row[4]=r4s/2;
            row[5]=r5s;
            model.addRow(row);

        }



        else if(len==32)
        {


            float[] r1=Arrays.copyOfRange(arr,0,len);

            float[] r2=Arrays.copyOfRange(arr,len,len+16);

            float[] r3=Arrays.copyOfRange(arr,len+16,len+24);

            float[] r4=Arrays.copyOfRange(arr,len+24,len+28);

            float[] r5=Arrays.copyOfRange(arr,len+28,len+30);

            float[] r6=Arrays.copyOfRange(arr,len+30,arr.length);

            for (int i = 0; i <len; i++)
            {
                row[0]="  ("+(i+1)+")";

                row[1]=r1[i];

                r1s=r1s+r1[i];

                if(i<16)
                {
                    row[2]=r2[i];
                    if(i<8)
                    {
                        row[3]=r3[i];}
                    else
                    {
                        row[3]="";
                    }

                    if(i<4)
                    {
                        row[4]=r4[i];
                    }
                    else
                    {
                        row[4]="";
                    }


                    if(i<2)
                    {
                        row[5]=r5[i];
                    }
                    else
                    {
                        row[5]="";
                    }

                    if(i<1)
                    {
                        row[6]=r6[i];
                    }
                    else
                    {
                        row[6]="";
                    }
                }

                else
                {
                    row[2]="";
                    row[3]="";
                    row[4]="";
                    row[5]="";
                    row[6]="";
                }

                model.addRow(row);

            }



        }


    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        setTitle("Time Analysis");
        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Splits", "50k", "100k", "200k", "400k", "800k", "1600k"
                }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Merge");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Insertion");

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Splits", "50k", "100k", "200k", "400k", "800k", "1600k"
                }
        ));
        jTable5.setAutoscrolls(false);
        jScrollPane5.setViewportView(jTable5);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Splits", "50k", "100k", "200k", "400k", "800k", "1600k"
                }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Splits", "50k", "100k", "200k", "400k", "800k", "1600k"
                }
        ));
        jScrollPane3.setViewportView(jTable3);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quick");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Heap");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Time in (s)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(146, 146, 146)
                                .addComponent(jLabel5)
                                .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(203, 203, 203))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel1))
                                                .addGap(1, 1, 1)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>



    public static void Table_design() {
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
            java.util.logging.Logger.getLogger(table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new table().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable5;
    // End of variables declaration
}
