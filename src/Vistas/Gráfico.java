package Vistas;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Gráfico extends javax.swing.JPanel {

    float X1, Y1, X2, Y2, m;
    float[][] coordenadas = new float[10][2];
    
    int [][] coordenadas_round = new int[10][2];
    //https://www.youtube.com/watch?v=Co4S7n-9SgE
    //https://github.com/Cholele/Equipo4_DDA.git
    
    public Gráfico() 
    {
        initComponents();
    }   
    
    //Obtenemos los datos del JPanel anterior
    public void setDatos(int x1, int y1, int x2, int y2) 
    {
       X1 = x1; X2 = x2; 
       Y1 = y1; Y2 = y2;
       JTable_Data.setValueAt(x1, 0, 1); //X1
       JTable_Data.setValueAt(x2, 1, 1); //X2
       
       JTable_Data.setValueAt(y1, 0, 2); //Y1
       JTable_Data.setValueAt(y2, 1, 2); //Y2
       start();
    }
    
     public void start()
    {
       
        getPendiente();
        coordenadas[0][0] = (int) X1;                           coordenadas[0][1] = (int) Y1;
        coordenadas_round[0][0] = (int) X1;                     coordenadas_round[0][1] = (int) Y1;
        JTable_coordenadas.setValueAt(  (int) X1, 0, 1 );       JTable_coordenadas.setValueAt(  (int) Y1, 0, 2 ); 
        
        
        for (int i = 1; i < 10; i++) {
            getXk( i );
            JTable_coordenadas.setValueAt(  Math.round ( coordenadas[i][0] ), i, 1 ); //Value, row, column
            coordenadas_round[i][0] =  Math.round ( coordenadas[i][0] );
            
            getYk( i  );
            JTable_coordenadas.setValueAt(  Math.round ( coordenadas[i][1] ), i, 2 ); //Value, row, column
            coordenadas_round[i][1] =  Math.round ( coordenadas[i][1] );
         }
        
        align_column( JTable_coordenadas );
        align_column( JTable_Data );
        
        generate_grafico();
    }
     
    //Calculo de pendiente
    public void getPendiente()
    {
        m = ( (Y2-Y1) / (X2-X1) );  
    }
     
    public void getXk(int i)
    {
         if( m > 1 ){
             coordenadas[i][0] =  coordenadas[i-1][0] + (1/m) ;
         }else{
             coordenadas[i][0] =  coordenadas[i-1][0] + 1 ;
         }
    }
     
    public void getYk(int i)
    {
         if( m < 1  || m == 1 ){
             coordenadas[i][1] = coordenadas[i-1][1] + m ;
         }else{
             coordenadas[i][1] =  coordenadas[i-1][1] + 1 ;
         }
    }

    public void align_column( JTable table )
    {
        for (int i = 0; i < table.getColumnCount(); i++) {
            TableColumn tableColumn = table.getColumnModel().getColumn(i);
            DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
            cellRenderer.setHorizontalAlignment(JLabel.CENTER);
            table.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
        }
    }
    
    public void generate_grafico()
    {
        XYSeries series = new XYSeries("Gráfico");

       for (int i = 0; i < 10; i++) {
           series.add( coordenadas_round[i][0], coordenadas_round[i][1]);
       }

       XYSeriesCollection dataset = new XYSeriesCollection();
       dataset.addSeries(series);

       JFreeChart chart = ChartFactory.createXYLineChart("Prueba", "X", "Y", dataset, PlotOrientation.VERTICAL, 
               true, false, false);
       
        // Etiquetas de coordenadas
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        chart.getXYPlot().setRenderer(renderer);
    
        //ChartPanel frame = new ChartPanel(chart);
        ChartFrame frame = new ChartFrame("Gráfico", chart);
        frame.setPreferredSize(new Dimension(800, 800));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Obtener la pantalla y su tamaño
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Dimension screenSize = env.getMaximumWindowBounds().getSize();
        
        // Establecer la posición del ChartFrame
        int frameWidth = frame.getWidth();
        int frameHeight = frame.getHeight();
        int x = 1100;
        int y = 100;
        Point location = new Point(x, y);
        frame.setLocation(location);
        
        frame.pack();
        frame.setVisible(true);
        //this.add(frame);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Btn_Back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable_coordenadas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTable_Data = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        Btn_Back.setText("Regresar");
        Btn_Back.setFocusPainted(false);
        Btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BackActionPerformed(evt);
            }
        });

        JTable_coordenadas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JTable_coordenadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(0), null, null},
                { new Integer(1), null, null},
                { new Integer(2), null, null},
                { new Integer(3), null, null},
                { new Integer(4), null, null},
                { new Integer(5), null, null},
                { new Integer(6), null, null},
                { new Integer(7), null, null},
                { new Integer(8), null, null},
                { new Integer(9), null, null}
            },
            new String [] {
                "K", "Xk", "Yk"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        JTable_coordenadas.setSelectionBackground(new java.awt.Color(255, 153, 153));
        jScrollPane1.setViewportView(JTable_coordenadas);

        JTable_Data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"A(x1,y1)", null, null},
                {"B(x2,y2)", null, null}
            },
            new String [] {
                "PUNTO", "X", "Y"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(JTable_Data);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(402, 402, 402)
                        .addComponent(Btn_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(374, 374, 374)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(366, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(Btn_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BackActionPerformed
        Inicio.ShowContent( Inicio.datos );
    }//GEN-LAST:event_Btn_BackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Back;
    private javax.swing.JTable JTable_Data;
    private javax.swing.JTable JTable_coordenadas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
