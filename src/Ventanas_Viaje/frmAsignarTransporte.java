/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas_Viaje;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.*;
import java.util.*;


/**
 *
 * @author Carolina
 */
public class frmAsignarTransporte extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmAsignarTransporte
     */
    public frmAsignarTransporte() {
        initComponents();
        
        txtFecha.setEditable(false);
        txtFecha.setEnabled(false);
        txtHora.setEditable(false);
        txtHora.setEnabled(false);
         //setear el campo de fecha con la del sistema
        GregorianCalendar gc=new GregorianCalendar();
        GregorianCalendar.getInstance();
        gc.setTimeZone(TimeZone.getTimeZone("GMT-3"));
        gc.get(Calendar.DAY_OF_WEEK);
        gc.get(Calendar.MONTH);
        gc.get(Calendar.YEAR);
        SimpleDateFormat formateador= new SimpleDateFormat("dd-MM-yyyy");
        txtFecha.setText(formateador.format(gc.getTime()));
        //setear el campo de hora con la del sistema
        GregorianCalendar calendario=new GregorianCalendar();
        GregorianCalendar.getInstance();
        gc.setTimeZone(TimeZone.getTimeZone("GMT-3"));
        calendario.get(Calendar.HOUR);
        calendario.get(Calendar.MINUTE);
        SimpleDateFormat formateadorHora=new SimpleDateFormat("hh:mm");
        txtHora.setText(formateadorHora.format(calendario.getTime()));
        
        //Las siguientes lineas son para dar a la pantalla el tamaño requerido y luego centrarla en la pantalla.
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension tamanioPantalla = kit.getScreenSize();
        int ancho = 750;
        int alto = 570;
//        int posX = (int) ((tamanioPantalla.width - ancho) / 2);
//        int posY = (int) ((tamanioPantalla.height - alto) / 2);
        this.setSize(ancho, alto);
        this.setLocation(270, 10);
        
        tblViaje.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblViaje.getColumnModel().getColumn(1).setPreferredWidth(50);
        tblViaje.getColumnModel().getColumn(2).setPreferredWidth(100);
        tblVehiculo.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblVehiculo.getColumnModel().getColumn(1).setPreferredWidth(100);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblViaje = new javax.swing.JTable();
        btnAgregarViaje = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtTipoViaje = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNumViaje = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFechaRealizacion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtProductor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCereal = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnOrden = new javax.swing.JButton();
        btnAgenda = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtTara = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblVehiculo = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        txtTransportista = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtVehiculo = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtNumeroSolicitud = new javax.swing.JTextField();
        txtToneladas = new javax.swing.JTextField();
        txtFechaSolicitud = new javax.swing.JTextField();
        txtPesoNeto = new javax.swing.JTextField();
        txtPesoTotal = new javax.swing.JTextField();
        btnAceptarVehiculo = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        setIconifiable(true);
        setMaximizable(true);
        setTitle("Asignar Transporte");

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Fecha");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 60, 20);
        jPanel1.add(txtHora);
        txtHora.setBounds(190, 10, 70, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Hora");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(155, 10, 51, 20);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Carolina");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(600, 0, 50, 40);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UsuarioLogueado.png"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(650, 0, 30, 30);
        jPanel1.add(txtFecha);
        txtFecha.setBounds(50, 10, 70, 20);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Viaje", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        jPanel2.setLayout(null);

        tblViaje.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº Viaje", "Fecha", "Productor"
            }
        ));
        jScrollPane1.setViewportView(tblViaje);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(90, 30, 550, 89);

        btnAgregarViaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        jPanel2.add(btnAgregarViaje);
        btnAgregarViaje.setBounds(650, 60, 40, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Nº Viaje");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(40, 140, 67, 20);
        jPanel2.add(txtTipoViaje);
        txtTipoViaje.setBounds(90, 170, 104, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Tipo Viaje");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(30, 170, 80, 20);
        jPanel2.add(txtNumViaje);
        txtNumViaje.setBounds(90, 140, 104, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Fecha Realización");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(220, 140, 130, 20);
        jPanel2.add(txtFechaRealizacion);
        txtFechaRealizacion.setBounds(330, 140, 110, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Destino");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(280, 170, 70, 20);
        jPanel2.add(txtDestino);
        txtDestino.setBounds(330, 170, 110, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Productor");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(500, 140, 90, 20);
        jPanel2.add(txtProductor);
        txtProductor.setBounds(560, 140, 180, 20);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Cereal");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(510, 170, 70, 20);
        jPanel2.add(txtCereal);
        txtCereal.setBounds(560, 170, 100, 20);

        btnGuardar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");

        btnSalir.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        btnSalir.setText("Salir");

        btnOrden.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IrDetalle.png"))); // NOI18N
        btnOrden.setText("Ver Orden");

        btnAgenda.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calendar.png"))); // NOI18N
        btnAgenda.setText("Agenda");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOrden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Vehiculo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        jPanel5.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel17.setText("Toneladas");
        jPanel5.add(jLabel17);
        jLabel17.setBounds(240, 30, 100, 20);

        jLabel18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel18.setText("Solicitud N°");
        jPanel5.add(jLabel18);
        jLabel18.setBounds(20, 30, 80, 20);
        jPanel5.add(txtTara);
        txtTara.setBounds(70, 190, 120, 20);

        jLabel19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel19.setText("Fecha Solicitud");
        jPanel5.add(jLabel19);
        jLabel19.setBounds(470, 30, 110, 20);

        tblVehiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vehiculo", "Capacidad de Vehiculo (Tn)", "Transportista"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVehiculo.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tblVehiculo);

        jPanel5.add(jScrollPane3);
        jScrollPane3.setBounds(20, 60, 690, 90);

        jLabel20.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel20.setText("Vehiculo");
        jPanel5.add(jLabel20);
        jLabel20.setBounds(20, 160, 70, 20);
        jPanel5.add(txtTransportista);
        txtTransportista.setBounds(460, 160, 250, 20);

        jLabel21.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel21.setText("Transportista");
        jPanel5.add(jLabel21);
        jLabel21.setBounds(380, 160, 100, 20);
        jPanel5.add(txtVehiculo);
        txtVehiculo.setBounds(70, 160, 220, 20);

        jLabel22.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel22.setText("Tara ");
        jPanel5.add(jLabel22);
        jLabel22.setBounds(40, 190, 50, 20);

        jLabel23.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel23.setText("Peso Total");
        jPanel5.add(jLabel23);
        jLabel23.setBounds(270, 190, 90, 20);

        jLabel24.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel24.setText("Peso Neto");
        jPanel5.add(jLabel24);
        jLabel24.setBounds(530, 190, 90, 20);
        jPanel5.add(txtNumeroSolicitud);
        txtNumeroSolicitud.setBounds(90, 30, 110, 20);

        txtToneladas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtToneladasActionPerformed(evt);
            }
        });
        jPanel5.add(txtToneladas);
        txtToneladas.setBounds(300, 30, 140, 20);
        jPanel5.add(txtFechaSolicitud);
        txtFechaSolicitud.setBounds(560, 30, 150, 20);
        jPanel5.add(txtPesoNeto);
        txtPesoNeto.setBounds(590, 190, 120, 20);
        jPanel5.add(txtPesoTotal);
        txtPesoTotal.setBounds(330, 190, 120, 20);

        btnAceptarVehiculo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnAceptarVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        btnAceptarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarVehiculoActionPerformed(evt);
            }
        });
        jPanel5.add(btnAceptarVehiculo);
        btnAceptarVehiculo.setBounds(720, 100, 49, 30);

        jLabel15.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel15.setText("Kgs.");
        jPanel5.add(jLabel15);
        jLabel15.setBounds(710, 190, 30, 20);

        jLabel16.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel16.setText("Kgs.");
        jPanel5.add(jLabel16);
        jLabel16.setBounds(190, 190, 30, 20);

        jLabel25.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel25.setText("Kgs.");
        jPanel5.add(jLabel25);
        jLabel25.setBounds(450, 190, 30, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarVehiculoActionPerformed
        DefaultTableModel modeloTabla = (DefaultTableModel) tblVehiculo.getModel();
        GestorHibernate gestorH = new GestorHibernate();
        int fila = tblVehiculo.getSelectedRow();
        Iterator ite = gestorH.listarClase(Vehiculo.class).iterator();
        while (ite.hasNext()) {
            Vehiculo vehiculo = (Vehiculo) ite.next();
            if (vehiculo.getDominio().equals(modeloTabla.getValueAt(fila, 0)) && vehiculo.getCarga() >= Double.parseDouble(txtToneladas.getText())) {
                txtVehiculo.setText(vehiculo.getDominio());
                txtTransportista.setText(vehiculo.getTransportista().toString());
                txtTara.setText(String.valueOf(vehiculo.getTara()));
            }
        }
    }//GEN-LAST:event_btnAceptarVehiculoActionPerformed

    private void txtToneladasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToneladasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtToneladasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarVehiculo;
    private javax.swing.JButton btnAgenda;
    private javax.swing.JButton btnAgregarViaje;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnOrden;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblVehiculo;
    private javax.swing.JTable tblViaje;
    private javax.swing.JTextField txtCereal;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFechaRealizacion;
    private javax.swing.JTextField txtFechaSolicitud;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtNumViaje;
    private javax.swing.JTextField txtNumeroSolicitud;
    private javax.swing.JTextField txtPesoNeto;
    private javax.swing.JTextField txtPesoTotal;
    private javax.swing.JTextField txtProductor;
    private javax.swing.JTextField txtTara;
    private javax.swing.JTextField txtTipoViaje;
    private javax.swing.JTextField txtToneladas;
    private javax.swing.JTextField txtTransportista;
    private javax.swing.JTextField txtVehiculo;
    // End of variables declaration//GEN-END:variables
}
