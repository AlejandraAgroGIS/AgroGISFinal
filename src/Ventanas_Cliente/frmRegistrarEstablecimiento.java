/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas_Cliente;

import Clases_Modulo_Cliente.Establecimiento;
import Clases_Modulo_Cliente.Productor;
import Clases_Modulo_Transporte.Localidad;
import Gestores_Clases.gestorPais;
import Gestores_Vista.gestorRegistroBarrio;
import Hibernate.GestorHibernate;
import Ventanas_Transporte.*;
import javax.swing.JOptionPane;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Carolina
 */
public class frmRegistrarEstablecimiento extends javax.swing.JInternalFrame {
GestorHibernate gestorH = new GestorHibernate();
gestorRegistroBarrio gRBarrio = new gestorRegistroBarrio();
gestorPais gPais = new gestorPais();
    /**
     * Creates new form frmRegistrarEstablecimiento
     */
    public frmRegistrarEstablecimiento() {
        initComponents();
        gestorH.actualizarUsuario(labelusuario);
        txtFecha.setEnabled(false);
        txtFecha.setEditable(false);
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
        int ancho = 640;
        int alto = 560;
        int posX = (int) ((tamanioPantalla.width - ancho) / 2);
        int posY = (int) ((tamanioPantalla.height - alto) / 2);
        this.setSize(ancho, alto);
        this.setLocation(330, 40);
        
        
        //redimensionar columnas de la tabla
        tblProductor.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblProductor.getColumnModel().getColumn(1).setPreferredWidth(100);  
        
        
        //centrar cabecera jtable
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) tblProductor.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(0);
       
        //habilitar y deshabilitar paneles
        panelContenedor.setVisible(true);
        panelEdicion.setVisible(false);
        panelProductor.setVisible(true);
        panelEdicionEstab.setVisible(true);
        panelEdicionLote.setVisible(false);
        btnLotes.setEnabled(false);
        btnGuardar.setVisible(true);
        DefaultTableModel modeloT = (DefaultTableModel) tblProductor.getModel();
        Iterator ite = gestorH.listarClase(Productor.class).iterator();
        while(ite.hasNext()){
            Productor p = (Productor) ite.next();
            Object fila[] = {p.getNombre(), p.getNumeroDocumento()};
            modeloT.addRow(fila);
            tblProductor.setModel(modeloT);
        }
        cmbProvincia.setModel(gPais.getComboModelProvincia());
         cmbProvincia.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                cmbDepartamento.setModel(gRBarrio.rellenaComboDepartamento(cmbProvincia.getSelectedItem().toString()));
            }
        });
        cmbDepartamento.setModel(gRBarrio.rellenaComboDepartamento(cmbProvincia.getSelectedItem().toString()));
       
        //Relleno Localidad de acuerdo al Departamento
        cmbDepartamento.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                cmbLocalidad.setModel(gRBarrio.rellenaComboLocalidad(cmbDepartamento.getSelectedItem().toString()));
            }
        });
        cmbLocalidad.setModel(gRBarrio.rellenaComboLocalidad(cmbDepartamento.getSelectedItem().toString()));
    
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
        jLabel9 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        labelusuario = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panelContenedor = new javax.swing.JPanel();
        panelProductor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductor = new javax.swing.JTable();
        btnAceptar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        labelProductor = new javax.swing.JLabel();
        panelEdicionEstab = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEstablecimiento = new javax.swing.JTextField();
        cmbLocalidad = new javax.swing.JComboBox();
        cmbProvincia = new javax.swing.JComboBox();
        cmbDepartamento = new javax.swing.JComboBox();
        panelEdicionLote = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtEstab = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDetalleLote = new javax.swing.JTable();
        btnNuevoTaller = new javax.swing.JButton();
        panelEdicion = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductorEdicion = new javax.swing.JTable();
        btnAceptar1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnLotes = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Establecimiento");

        jPanel1.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Fecha");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 10, 70, 20);
        jPanel1.add(txtFecha);
        txtFecha.setBounds(50, 10, 80, 20);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Hora");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(180, 10, 40, 20);
        jPanel1.add(txtHora);
        txtHora.setBounds(210, 10, 80, 20);

        labelusuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelusuario.setText("Usuario");
        jPanel1.add(labelusuario);
        labelusuario.setBounds(510, 10, 50, 15);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UsuarioLogueado.png"))); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(560, 0, 30, 30);

        panelContenedor.setLayout(null);

        panelProductor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Productor", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        panelProductor.setLayout(null);

        tblProductor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Productor", "DNI "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProductor);

        panelProductor.add(jScrollPane1);
        jScrollPane1.setBounds(90, 30, 430, 110);

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        panelProductor.add(btnAceptar);
        btnAceptar.setBounds(530, 70, 40, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Productor:");
        panelProductor.add(jLabel2);
        jLabel2.setBounds(90, 150, 100, 20);

        labelProductor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        panelProductor.add(labelProductor);
        labelProductor.setBounds(170, 150, 220, 20);

        panelContenedor.add(panelProductor);
        panelProductor.setBounds(10, 10, 600, 200);

        panelEdicionEstab.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Establecimiento", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        panelEdicionEstab.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Establecimiento");
        panelEdicionEstab.add(jLabel1);
        jLabel1.setBounds(90, 30, 130, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Localidad");
        panelEdicionEstab.add(jLabel4);
        jLabel4.setBounds(120, 150, 100, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Provincia");
        panelEdicionEstab.add(jLabel5);
        jLabel5.setBounds(130, 70, 100, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Departamento");
        panelEdicionEstab.add(jLabel6);
        jLabel6.setBounds(100, 110, 130, 20);
        panelEdicionEstab.add(txtEstablecimiento);
        txtEstablecimiento.setBounds(190, 30, 260, 20);

        panelEdicionEstab.add(cmbLocalidad);
        cmbLocalidad.setBounds(190, 150, 210, 20);

        panelEdicionEstab.add(cmbProvincia);
        cmbProvincia.setBounds(190, 70, 210, 20);

        panelEdicionEstab.add(cmbDepartamento);
        cmbDepartamento.setBounds(190, 110, 210, 20);

        panelContenedor.add(panelEdicionEstab);
        panelEdicionEstab.setBounds(10, 220, 600, 200);

        panelEdicionLote.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Establecimiento", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        panelEdicionLote.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Establecimiento");
        panelEdicionLote.add(jLabel3);
        jLabel3.setBounds(10, 40, 130, 20);
        panelEdicionLote.add(txtEstab);
        txtEstab.setBounds(110, 40, 230, 20);

        tblDetalleLote.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Lote", "Hectáreas"
            }
        ));
        jScrollPane3.setViewportView(tblDetalleLote);

        panelEdicionLote.add(jScrollPane3);
        jScrollPane3.setBounds(110, 90, 370, 90);

        btnNuevoTaller.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnNuevoTaller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pin_verde.png"))); // NOI18N
        btnNuevoTaller.setText("Ver Lote");
        panelEdicionLote.add(btnNuevoTaller);
        btnNuevoTaller.setBounds(485, 130, 100, 30);

        panelContenedor.add(panelEdicionLote);
        panelEdicionLote.setBounds(10, 220, 600, 200);

        panelEdicion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelEdicion.setLayout(null);

        tblProductorEdicion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Establecimiento", "Productor "
            }
        ));
        jScrollPane2.setViewportView(tblProductorEdicion);

        panelEdicion.add(jScrollPane2);
        jScrollPane2.setBounds(80, 30, 430, 150);

        btnAceptar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        panelEdicion.add(btnAceptar1);
        btnAceptar1.setBounds(520, 90, 40, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Establecimientos");
        panelEdicion.add(jLabel7);
        jLabel7.setBounds(230, 10, 130, 17);

        panelContenedor.add(panelEdicion);
        panelEdicion.setBounds(10, 10, 600, 200);

        btnNuevo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icononuevo.PNG"))); // NOI18N
        btnNuevo.setText("Nuevo");
        panelContenedor.add(btnNuevo);
        btnNuevo.setBounds(120, 440, 100, 30);

        btnLotes.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnLotes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pin_verde.png"))); // NOI18N
        btnLotes.setText("Lotes");
        btnLotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLotesActionPerformed(evt);
            }
        });
        panelContenedor.add(btnLotes);
        btnLotes.setBounds(320, 440, 100, 30);

        btnGuardar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        panelContenedor.add(btnGuardar);
        btnGuardar.setBounds(220, 440, 100, 30);

        btnSalir.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        panelContenedor.add(btnSalir);
        btnSalir.setBounds(420, 440, 100, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Confirma que desea salir?");
        if (respuesta == 0) {
            dispose();
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
      DefaultTableModel modeloT = (DefaultTableModel) tblProductor.getModel();
      int fila= tblProductor.getSelectedRow();
      labelProductor.setText(modeloT.getValueAt(fila, 0).toString());
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnLotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLotesActionPerformed
     if(java.awt.Desktop.isDesktopSupported()){
    try{
      Desktop dk = Desktop.getDesktop();
      dk.browse(new URI("http://localhost:800/agrogis/nuevoLote.php"));
    }catch(Exception e){
     System.out.println("Error al abrir URL: "+e.getMessage());
    }
}
        
    }//GEN-LAST:event_btnLotesActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    Establecimiento e = new Establecimiento();
    e.setNombreEstablecimiento(txtEstablecimiento.getText());
    Iterator ite1 = gestorH.listarClase(Productor.class).iterator();
    while(ite1.hasNext()){
        Productor p = (Productor) ite1.next();
        if(p.getNombre().equalsIgnoreCase(labelProductor.getText())){
            e.setProductor(p);
        }
    }
    Iterator ite2 = gestorH.listarClase(Localidad.class).iterator();
    while(ite2.hasNext()){
        Localidad l = (Localidad) ite2.next();
        if(l.getNombreLocalidad().equalsIgnoreCase(cmbLocalidad.getSelectedItem().toString())){
            e.setLocalidad(l);
        }
    }   
    gestorH.guardarObjeto(e);
    JOptionPane.showMessageDialog(null, "Los datos se han guardado correctamente");
    btnLotes.setEnabled(true);
    }//GEN-LAST:event_btnGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAceptar1;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLotes;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnNuevoTaller;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cmbDepartamento;
    private javax.swing.JComboBox cmbLocalidad;
    private javax.swing.JComboBox cmbProvincia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelProductor;
    private javax.swing.JLabel labelusuario;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JPanel panelEdicion;
    private javax.swing.JPanel panelEdicionEstab;
    private javax.swing.JPanel panelEdicionLote;
    private javax.swing.JPanel panelProductor;
    private javax.swing.JTable tblDetalleLote;
    private javax.swing.JTable tblProductor;
    private javax.swing.JTable tblProductorEdicion;
    private javax.swing.JTextField txtEstab;
    private javax.swing.JTextField txtEstablecimiento;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    // End of variables declaration//GEN-END:variables
}
