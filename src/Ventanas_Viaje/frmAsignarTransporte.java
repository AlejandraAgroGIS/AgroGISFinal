/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas_Viaje;

import Clases_Modulo_Transporte.*;
import Clases_Modulo_Viaje.EstablecimientoPorViaje;
import Clases_Modulo_Viaje.PuertoPorViaje;
import Clases_Modulo_Viaje.Viaje;
import Gestores_Clases.gestorBitacora;
import Gestores_Vista.gestorAsignarTransporte;
import Hibernate.GestorHibernate;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Carolina
 */
public class frmAsignarTransporte extends javax.swing.JInternalFrame {
gestorAsignarTransporte gestorA = new gestorAsignarTransporte();
GestorHibernate gestorH = new GestorHibernate();
    /**
     * Creates new form frmAsignarTransporte
     */
    public frmAsignarTransporte() {
        initComponents();
        gestorH.actualizarUsuario(labelusuario);
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
        SimpleDateFormat formateadorHora=new SimpleDateFormat("HH:mm");
        txtHora.setText(formateadorHora.format(calendario.getTime()));
        
        //Las siguientes lineas son para dar a la pantalla el tamaño requerido y luego centrarla en la pantalla.
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension tamanioPantalla = kit.getScreenSize();
        int ancho = 820;
        int alto = 570;
//        int posX = (int) ((tamanioPantalla.width - ancho) / 2);
//        int posY = (int) ((tamanioPantalla.height - alto) / 2);
        this.setSize(ancho, alto);
        this.setLocation(260, 30);
        
        //redimensionar columnas tabla
        tblViaje.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblViaje.getColumnModel().getColumn(1).setPreferredWidth(50);
        tblViaje.getColumnModel().getColumn(2).setPreferredWidth(100);
        tblVehiculo.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblVehiculo.getColumnModel().getColumn(1).setPreferredWidth(100);
        //centrar cabecera jtable
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) tblVehiculo.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(0);
        DefaultTableCellRenderer renderer2 = (DefaultTableCellRenderer) tblViaje.getTableHeader().getDefaultRenderer();
        renderer2.setHorizontalAlignment(0);


        
        gestorA.RellenarTablaViajes(tblViaje);
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
        labelusuario = new javax.swing.JLabel();
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
        jLabel18 = new javax.swing.JLabel();
        txtNumeroSolicitud = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        txtTara = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblVehiculo = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        txtTransportista = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtVehiculo = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        btnAceptarVehiculo = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDominio = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTipoVehiculo = new javax.swing.JTextField();

        setIconifiable(true);
        setMaximizable(true);
        setTitle("Asignar Transporte");

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Fecha");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 60, 20);
        jPanel1.add(txtHora);
        txtHora.setBounds(240, 10, 80, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Hora");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(210, 10, 51, 20);

        labelusuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelusuario.setText("Carolina");
        jPanel1.add(labelusuario);
        labelusuario.setBounds(660, 0, 50, 40);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UsuarioLogueado.png"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(710, 0, 30, 30);
        jPanel1.add(txtFecha);
        txtFecha.setBounds(50, 10, 80, 20);

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
        jScrollPane1.setBounds(80, 30, 560, 89);

        btnAgregarViaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        btnAgregarViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarViajeActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregarViaje);
        btnAgregarViaje.setBounds(650, 60, 40, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Nº Viaje");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(270, 130, 67, 20);
        jPanel2.add(txtTipoViaje);
        txtTipoViaje.setBounds(130, 160, 160, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Tipo Viaje");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(70, 160, 80, 20);
        jPanel2.add(txtNumViaje);
        txtNumViaje.setBounds(320, 130, 104, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Fecha Realización");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(440, 130, 130, 20);
        jPanel2.add(txtFechaRealizacion);
        txtFechaRealizacion.setBounds(550, 130, 110, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Destino");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(370, 160, 70, 20);
        jPanel2.add(txtDestino);
        txtDestino.setBounds(420, 160, 110, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Productor");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(360, 190, 90, 20);
        jPanel2.add(txtProductor);
        txtProductor.setBounds(420, 190, 180, 20);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Tipo de Cereal");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(40, 190, 120, 20);
        jPanel2.add(txtCereal);
        txtCereal.setBounds(130, 190, 100, 20);

        jLabel18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel18.setText("Solicitud N°");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(60, 130, 80, 20);
        jPanel2.add(txtNumeroSolicitud);
        txtNumeroSolicitud.setBounds(130, 130, 110, 20);

        btnGuardar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos VehÍculo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        jPanel5.setLayout(null);
        jPanel5.add(txtTara);
        txtTara.setBounds(580, 130, 120, 20);

        tblVehiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vehículo", "Capacidad de Vehículo (Tn)", "Transportista"
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
        jScrollPane3.setBounds(60, 30, 660, 90);

        jLabel20.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel20.setText("Vehículo");
        jPanel5.add(jLabel20);
        jLabel20.setBounds(30, 130, 90, 20);
        jPanel5.add(txtTransportista);
        txtTransportista.setBounds(460, 160, 240, 20);

        jLabel21.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel21.setText("Transportista");
        jPanel5.add(jLabel21);
        jLabel21.setBounds(380, 160, 100, 20);
        jPanel5.add(txtVehiculo);
        txtVehiculo.setBounds(90, 130, 220, 20);

        jLabel22.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel22.setText("Tara ");
        jPanel5.add(jLabel22);
        jLabel22.setBounds(550, 130, 50, 20);

        btnAceptarVehiculo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnAceptarVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        btnAceptarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarVehiculoActionPerformed(evt);
            }
        });
        jPanel5.add(btnAceptarVehiculo);
        btnAceptarVehiculo.setBounds(730, 60, 49, 30);

        jLabel16.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel16.setText("Tn.");
        jPanel5.add(jLabel16);
        jLabel16.setBounds(700, 130, 30, 20);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Dominio");
        jPanel5.add(jLabel10);
        jLabel10.setBounds(360, 130, 90, 20);
        jPanel5.add(txtDominio);
        txtDominio.setBounds(410, 130, 100, 20);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Tipo de Vehículo");
        jPanel5.add(jLabel11);
        jLabel11.setBounds(20, 160, 120, 20);
        jPanel5.add(txtTipoVehiculo);
        txtTipoVehiculo.setBounds(120, 160, 190, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 38, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
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
            if (vehiculo.getDominio().equals(modeloTabla.getValueAt(fila, 0))) {
                txtVehiculo.setText(vehiculo.getModelo().toString());
                txtDominio.setText(vehiculo.getDominio());
                txtTransportista.setText(vehiculo.getTransportista().toString());
                txtTara.setText(String.valueOf(vehiculo.getTara()));
                txtTipoVehiculo.setText(vehiculo.getTipoVehiculo().toString());
            }
        }
    }//GEN-LAST:event_btnAceptarVehiculoActionPerformed

    private void btnAgregarViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarViajeActionPerformed
       DefaultTableModel modelo = (DefaultTableModel) tblViaje.getModel();
       int fila = tblViaje.getSelectedRow();
       Iterator ite = gestorH.listarClase(Viaje.class).iterator();
       while(ite.hasNext()){
           Viaje viaje = (Viaje) ite.next();
           if(viaje.getIdViaje()==modelo.getValueAt(fila, 0)){
               txtNumeroSolicitud.setText(viaje.getSolicitud().toString());
               txtNumViaje.setText(String.valueOf(viaje.getIdViaje()));
               txtFechaRealizacion.setText(viaje.getFecha());
               txtTipoViaje.setText(viaje.getTipoViaje().toString());
               txtCereal.setText(viaje.getSolicitud().getTipoCereal().toString());
               txtProductor.setText(viaje.getProductor().toString());
               Iterator ite1 = gestorH.listarClase(EstablecimientoPorViaje.class).iterator();
               while(ite1.hasNext()){
                   EstablecimientoPorViaje est = (EstablecimientoPorViaje) ite1.next();
                   if(est.getViaje().equals(viaje)){
                       txtDestino.setText(est.getEstablecimiento().getNombreEstablecimiento());
                   }
               }
               Iterator ite2 = gestorH.listarClase(PuertoPorViaje.class).iterator();
               while(ite1.hasNext()){
                   EstablecimientoPorViaje est = (EstablecimientoPorViaje) ite1.next();
                   if(est.getViaje().equals(viaje)){
                       txtDestino.setText(est.getEstablecimiento().getNombreEstablecimiento());
                   }
               }
               gestorA.RellenarTablaVehiculo(tblVehiculo, viaje);
           }
       }
       
    }//GEN-LAST:event_btnAgregarViajeActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       gestorBitacora gestorB = new gestorBitacora();
       Iterator ite = gestorH.listarClase(Viaje.class).iterator();
       while(ite.hasNext()){
           Viaje viaje = (Viaje) ite.next();
           if(viaje.getIdViaje()== Long.parseLong(txtNumViaje.getText())){
               Iterator ite1 = gestorH.listarClase(Vehiculo.class).iterator();
               while(ite1.hasNext()){
                   Vehiculo vehiculo = (Vehiculo) ite1.next();
                   if(vehiculo.getDominio().equalsIgnoreCase(txtDominio.getText())){
                       viaje.setVehiculo(vehiculo);
                       viaje.setEstado("Con vehiculo asignado");
                       gestorH.actualizarObjeto(viaje);
                       vehiculo.setEstado("Asignado");
                       gestorH.actualizarObjeto(vehiculo);
                       gestorB.cargarBitacora(String.valueOf(viaje.getIdViaje()), txtFecha.getText(), 3, labelusuario.getText());
                   }
               }
           
           }
       }
       DefaultTableModel modeloT = (DefaultTableModel) tblViaje.getModel();
       modeloT.setRowCount(0);
       gestorA.RellenarTablaViajes(tblViaje);
       txtNumeroSolicitud.setText("");
       txtDestino.setText("");
       txtCereal.setText("");
       txtFechaRealizacion.setText("");
       txtTipoViaje.setText("");
       txtNumViaje.setText("");
       txtProductor.setText("");
       DefaultTableModel modelo = (DefaultTableModel) tblVehiculo.getModel();
       modelo.setRowCount(0);
       txtVehiculo.setText("");
       txtTara.setText("");
       txtTipoVehiculo.setText("");
       txtTransportista.setText("");
       txtDominio.setText("");
       JOptionPane.showMessageDialog(null, "Se asigno correctamente el vehiculo");
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       int respuesta = JOptionPane.showConfirmDialog(null, "¿Confirma que desea salir?");
        if (respuesta==0){
            dispose();
    }
    }//GEN-LAST:event_btnSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarVehiculo;
    private javax.swing.JButton btnAgregarViaje;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
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
    private javax.swing.JLabel labelusuario;
    private javax.swing.JTable tblVehiculo;
    private javax.swing.JTable tblViaje;
    private javax.swing.JTextField txtCereal;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtDominio;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFechaRealizacion;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtNumViaje;
    private javax.swing.JTextField txtNumeroSolicitud;
    private javax.swing.JTextField txtProductor;
    private javax.swing.JTextField txtTara;
    private javax.swing.JTextField txtTipoVehiculo;
    private javax.swing.JTextField txtTipoViaje;
    private javax.swing.JTextField txtTransportista;
    private javax.swing.JTextField txtVehiculo;
    // End of variables declaration//GEN-END:variables
}
