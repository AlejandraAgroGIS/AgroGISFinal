/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas_Viaje;

import java.awt.*;
import java.text.*;
import java.util.*;
import javax.swing.*;


/**
 *
 * @author Carolina
 */
public class frmRegistrarViaje extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmRegistrarViaje
     */
    public frmRegistrarViaje() {
        initComponents();
        
        
        txtFecha.setEditable(false);
        txtFecha.setEnabled(false);
        txtHora.setEditable(false);
        txtHora.setEnabled(false);
        txtNumViaje.setEditable(false);
        txtNumViaje.setEnabled(false);
        txtEstado.setEnabled(false);
        txtEstado.setEditable(false);
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
        panelPuerto.setVisible(true);
        panelEstablecimiento.setVisible(false);
        
        //borrar el icono del InternalFrame
        this.setFrameIcon(new ImageIcon("Imagenes/Aceptar.png"));
        
        
        //Las siguientes lineas son para dar a la pantalla el tamaño requerido y luego centrarla en la pantalla.
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension tamanioPantalla = kit.getScreenSize();
        int ancho = 725;
        int alto = 530;
        int posX = (int) ((tamanioPantalla.width - ancho) / 2);
//        int posY = (int) ((tamanioPantalla.height - alto) / 2);
        this.setSize(ancho, alto);
        this.setLocation(posX, 0);
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
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNumViaje = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        cmbTipoViaje = new javax.swing.JComboBox();
        txtSolicitante = new javax.swing.JTextField();
        calendarioSolicitud = new datechooser.beans.DateChooserCombo();
        jPanel2 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAgenda = new javax.swing.JButton();
        panelPuerto = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPuerto = new javax.swing.JTable();
        btnAgregarPuerto = new javax.swing.JButton();
        txtToneladas = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtLocalidad = new javax.swing.JTextField();
        txtProvincia = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtPuerto = new javax.swing.JTextField();
        txtProductor = new javax.swing.JTextField();
        cmbCereal = new javax.swing.JComboBox();
        panelEstablecimiento = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductor = new javax.swing.JTable();
        btnAgregarLote = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtLocalidadEst = new javax.swing.JTextField();
        txtDepto = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtProductorEst = new javax.swing.JTextField();
        cmbEstablecimiento = new javax.swing.JComboBox();
        cmbCerealEst = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        txtHas = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        cmbLote = new javax.swing.JComboBox();
        btnAgregarProductor = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblLote = new javax.swing.JTable();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Viaje");

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
        jLabel3.setBounds(551, 0, 50, 40);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UsuarioLogueado.png"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(600, 0, 30, 30);
        jPanel1.add(txtFecha);
        txtFecha.setBounds(50, 10, 70, 20);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Viaje", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        jPanel9.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Número Viaje");
        jPanel9.add(jLabel4);
        jLabel4.setBounds(20, 30, 100, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Estado");
        jPanel9.add(jLabel5);
        jLabel5.setBounds(240, 30, 70, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Tipo Viaje");
        jPanel9.add(jLabel6);
        jLabel6.setBounds(470, 30, 90, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Solicitante");
        jPanel9.add(jLabel7);
        jLabel7.setBounds(40, 60, 90, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Fecha Solicitud");
        jPanel9.add(jLabel8);
        jLabel8.setBounds(370, 60, 110, 20);

        txtNumViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumViajeActionPerformed(evt);
            }
        });
        jPanel9.add(txtNumViaje);
        txtNumViaje.setBounds(100, 30, 82, 20);
        jPanel9.add(txtEstado);
        txtEstado.setBounds(290, 30, 140, 20);

        jPanel9.add(cmbTipoViaje);
        cmbTipoViaje.setBounds(530, 30, 140, 20);
        jPanel9.add(txtSolicitante);
        txtSolicitante.setBounds(100, 60, 190, 20);
        jPanel9.add(calendarioSolicitud);
        calendarioSolicitud.setBounds(460, 60, 90, 20);

        btnGuardar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");

        btnCancelar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");

        btnAgenda.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calendar.png"))); // NOI18N
        btnAgenda.setText("Agenda");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgenda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Destino Puerto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        panelPuerto.setLayout(null);

        tblPuerto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Puerto", "Localidad", "Provincia"
            }
        ));
        jScrollPane1.setViewportView(tblPuerto);

        panelPuerto.add(jScrollPane1);
        jScrollPane1.setBounds(90, 30, 492, 92);

        btnAgregarPuerto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        panelPuerto.add(btnAgregarPuerto);
        btnAgregarPuerto.setBounds(590, 60, 40, 30);
        panelPuerto.add(txtToneladas);
        txtToneladas.setBounds(450, 200, 110, 20);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Puerto");
        panelPuerto.add(jLabel9);
        jLabel9.setBounds(40, 140, 70, 20);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Localidad");
        panelPuerto.add(jLabel10);
        jLabel10.setBounds(20, 170, 90, 20);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Provincia");
        panelPuerto.add(jLabel11);
        jLabel11.setBounds(20, 200, 90, 20);
        panelPuerto.add(txtLocalidad);
        txtLocalidad.setBounds(90, 170, 180, 20);
        panelPuerto.add(txtProvincia);
        txtProvincia.setBounds(90, 200, 180, 20);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Productor");
        panelPuerto.add(jLabel12);
        jLabel12.setBounds(380, 140, 90, 20);

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setText("Cereal");
        panelPuerto.add(jLabel14);
        jLabel14.setBounds(400, 170, 70, 20);

        jLabel15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel15.setText("Toneladas a Extraer");
        panelPuerto.add(jLabel15);
        jLabel15.setBounds(330, 200, 150, 20);
        panelPuerto.add(txtPuerto);
        txtPuerto.setBounds(90, 140, 180, 20);
        panelPuerto.add(txtProductor);
        txtProductor.setBounds(450, 140, 180, 20);

        panelPuerto.add(cmbCereal);
        cmbCereal.setBounds(450, 170, 110, 20);

        panelEstablecimiento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Destino Establecimiento", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        panelEstablecimiento.setLayout(null);

        tblProductor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Productor", "Número de Documento"
            }
        ));
        jScrollPane2.setViewportView(tblProductor);

        panelEstablecimiento.add(jScrollPane2);
        jScrollPane2.setBounds(88, 22, 492, 92);

        btnAgregarLote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.png"))); // NOI18N
        panelEstablecimiento.add(btnAgregarLote);
        btnAgregarLote.setBounds(230, 210, 40, 30);

        jLabel16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel16.setText("Establecimiento");
        panelEstablecimiento.add(jLabel16);
        jLabel16.setBounds(10, 130, 120, 20);

        jLabel17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel17.setText("Localidad");
        panelEstablecimiento.add(jLabel17);
        jLabel17.setBounds(40, 160, 100, 20);

        jLabel18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel18.setText("Departamento");
        panelEstablecimiento.add(jLabel18);
        jLabel18.setBounds(360, 160, 110, 20);

        txtLocalidadEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocalidadEstActionPerformed(evt);
            }
        });
        panelEstablecimiento.add(txtLocalidadEst);
        txtLocalidadEst.setBounds(110, 160, 180, 20);
        panelEstablecimiento.add(txtDepto);
        txtDepto.setBounds(450, 160, 180, 20);

        jLabel19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel19.setText("Productor");
        panelEstablecimiento.add(jLabel19);
        jLabel19.setBounds(390, 130, 90, 20);

        jLabel20.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel20.setText("Cereal");
        panelEstablecimiento.add(jLabel20);
        jLabel20.setBounds(60, 190, 80, 20);
        panelEstablecimiento.add(txtProductorEst);
        txtProductorEst.setBounds(450, 130, 180, 20);

        panelEstablecimiento.add(cmbEstablecimiento);
        cmbEstablecimiento.setBounds(110, 130, 180, 20);

        panelEstablecimiento.add(cmbCerealEst);
        cmbCerealEst.setBounds(110, 190, 100, 20);

        jLabel21.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel21.setText("Hectáreas");
        panelEstablecimiento.add(jLabel21);
        jLabel21.setBounds(40, 250, 80, 20);
        panelEstablecimiento.add(txtHas);
        txtHas.setBounds(110, 250, 100, 20);

        jLabel22.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel22.setText("Lote ");
        panelEstablecimiento.add(jLabel22);
        jLabel22.setBounds(70, 220, 30, 20);

        panelEstablecimiento.add(cmbLote);
        cmbLote.setBounds(110, 220, 100, 20);

        btnAgregarProductor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        panelEstablecimiento.add(btnAgregarProductor);
        btnAgregarProductor.setBounds(590, 60, 40, 30);

        tblLote.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lote", "Hectáreas", "Latitud", "Longitud"
            }
        ));
        jScrollPane3.setViewportView(tblLote);

        panelEstablecimiento.add(jScrollPane3);
        jScrollPane3.setBounds(290, 200, 380, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelPuerto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelEstablecimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 194, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(panelPuerto, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEstablecimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumViajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumViajeActionPerformed

    private void txtLocalidadEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocalidadEstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocalidadEstActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgenda;
    private javax.swing.JButton btnAgregarLote;
    private javax.swing.JButton btnAgregarProductor;
    private javax.swing.JButton btnAgregarPuerto;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private datechooser.beans.DateChooserCombo calendarioSolicitud;
    private javax.swing.JComboBox cmbCereal;
    private javax.swing.JComboBox cmbCerealEst;
    private javax.swing.JComboBox cmbEstablecimiento;
    private javax.swing.JComboBox cmbLote;
    private javax.swing.JComboBox cmbTipoViaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panelEstablecimiento;
    private javax.swing.JPanel panelPuerto;
    private javax.swing.JTable tblLote;
    private javax.swing.JTable tblProductor;
    private javax.swing.JTable tblPuerto;
    private javax.swing.JTextField txtDepto;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHas;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtLocalidad;
    private javax.swing.JTextField txtLocalidadEst;
    private javax.swing.JTextField txtNumViaje;
    private javax.swing.JTextField txtProductor;
    private javax.swing.JTextField txtProductorEst;
    private javax.swing.JTextField txtProvincia;
    private javax.swing.JTextField txtPuerto;
    private javax.swing.JTextField txtSolicitante;
    private javax.swing.JTextField txtToneladas;
    // End of variables declaration//GEN-END:variables
}
