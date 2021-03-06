/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas_Viaje;

import Clases_Modulo_Carga.*;
import Clases_Modulo_Cliente.Productor;
import Clases_Modulo_Cliente.Establecimiento;
import Clases_Modulo_Seguridad.Bitacora;
import Clases_Modulo_Seguridad.Operacion;
import Clases_Modulo_Transporte.Barrio;
import Clases_Modulo_Viaje.EstablecimientoPorViaje;
import Clases_Modulo_Viaje.PuertoPorViaje;
import Clases_Modulo_Viaje.TipoViaje;
import Clases_Modulo_Viaje.Viaje;
import Gestores_Clases.gestorBitacora;
import Gestores_Vista.gestorEnvioMuestras;
import Gestores_Vista.gestorRegistrarViaje;
import Hibernate.GestorHibernate;
import Ventanas_Transporte.frmPrincipal;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.Desktop;
import java.net.URI;

/**
 *
 * @author Carolina
 */
public class frmRegistrarViaje extends javax.swing.JInternalFrame {
gestorRegistrarViaje gViaje = new gestorRegistrarViaje();
GestorHibernate gestorH = new GestorHibernate();
    /**
     * Creates new form frmRegistrarViaje
     */
    public frmRegistrarViaje() {
        initComponents();
        gestorH.actualizarUsuario(labelusuario);
        txtFecha.setEditable(false);
        txtFecha.setEnabled(false);
        txtHora.setEditable(false);
        txtHora.setEnabled(false);
        txtNumViaje.setEditable(false);
        txtNumViaje.setEnabled(false);
        cmbLote.setEnabled(false);
        btnAgregarLote.setEnabled(false);
        tblLote.setEnabled(false);
        btnAsignarVeh.setEnabled(false);
        
//        tblEstablecimiento.getTableHeader().setVisible(false);

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

        //1) datos de puerto - 2) datos de establecimiento
   
        labelLocalidad.setVisible(true); //1 y 2
        txtLocalidad.setVisible(true); //1 y 2
        labelProductor.setVisible(true); //1 y 2
        txtProductor.setVisible(true); //1 y 2
        labelCereal.setVisible(true); //1 y 2
//        cmbCereal.setVisible(true); //1 y 2
        btnAgregarLote.setEnabled(false);
        tblLote.setEnabled(false);
        cmbLote.setEnabled(false);
 
        //borrar el icono del InternalFrame
        this.setFrameIcon(new ImageIcon("Imagenes/Aceptar.png"));
        
        
        //Las siguientes lineas son para dar a la pantalla el tamaño requerido y luego centrarla en la pantalla.
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension tamanioPantalla = kit.getScreenSize();
        int ancho = 730;
        int alto = 540;
//        int posX = (int) ((tamanioPantalla.width - ancho) / 2);
//        int posY = (int) ((tamanioPantalla.height - alto) / 2);
        this.setSize(ancho, alto);
        this.setLocation(250, 40);
        
        
        tblEstablecimiento.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblEstablecimiento.getColumnModel().getColumn(1).setPreferredWidth(100);
        tblEstablecimiento.getColumnModel().getColumn(2).setPreferredWidth(50);
        tblProductor.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblProductor.getColumnModel().getColumn(1).setPreferredWidth(100);
        tblProductor.getColumnModel().getColumn(2).setPreferredWidth(50);
        
        //centrar cabecera jtable
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) tblEstablecimiento.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(0);
        DefaultTableCellRenderer renderer2 = (DefaultTableCellRenderer) tblLote.getTableHeader().getDefaultRenderer();
        renderer2.setHorizontalAlignment(0);
        DefaultTableCellRenderer renderer3 = (DefaultTableCellRenderer) tblProductor.getTableHeader().getDefaultRenderer();
        renderer3.setHorizontalAlignment(0);



        
        
                
        final int banderaP = gViaje.ContarPuerto();
        final int banderaE= gViaje.ContarEst();
        
        cmbTipoViaje.setModel(gViaje.AgregarTipoViaje());
        cmbTipoViaje.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent arg0){
           gViaje.ActualizarDatos(cmbTipoViaje.getSelectedItem().toString(), panelPuerto, panelEstablecimiento, labelPuerto, labelEstablecimiento, labelProvincia, labelDepto, tblEstablecimiento,scpEstablecimiento,tblProductor, banderaE, banderaP);
           }
        }
        );
          gViaje.ActualizarDatos(cmbTipoViaje.getSelectedItem().toString(), panelPuerto, panelEstablecimiento, labelPuerto, labelEstablecimiento, labelProvincia, labelDepto, tblEstablecimiento,scpEstablecimiento, tblProductor, banderaE, banderaP);
        
   
//        
      
    
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
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNumViaje = new javax.swing.JTextField();
        cmbTipoViaje = new javax.swing.JComboBox();
        txtSolicitante = new javax.swing.JTextField();
        calendarioViaje = new datechooser.beans.DateChooserCombo();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmbHora = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnNuevoViaje = new javax.swing.JButton();
        btnAsignarVeh = new javax.swing.JButton();
        panelPuerto = new javax.swing.JPanel();
        txtProductor = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        txtProvinciaT = new javax.swing.JTextField();
        txtToneladasE = new javax.swing.JTextField();
        labelLocalidad = new javax.swing.JLabel();
        labelDepto = new javax.swing.JLabel();
        txtLocalidad = new javax.swing.JTextField();
        labelProductor = new javax.swing.JLabel();
        labelCereal = new javax.swing.JLabel();
        scpEstablecimiento = new javax.swing.JScrollPane();
        tblEstablecimiento = new javax.swing.JTable();
        labelPuerto = new javax.swing.JLabel();
        labelEstablecimiento = new javax.swing.JLabel();
        labelProvincia = new javax.swing.JLabel();
        labelToneladasE = new javax.swing.JLabel();
        txtCerealT = new javax.swing.JTextField();
        txtTraslado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtSilo = new javax.swing.JTextField();
        panelEstablecimiento = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductor = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtProductorEst = new javax.swing.JTextField();
        txtDepto = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtLocalidadEst = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtHas = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        cmbLote = new javax.swing.JComboBox();
        btnAgregarProductor = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblLote = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnAgregarLote = new javax.swing.JButton();
        txtCerealR = new javax.swing.JTextField();
        txtRetiro = new javax.swing.JTextField();

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
        txtHora.setBounds(230, 10, 80, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Hora");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(200, 10, 51, 20);

        labelusuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelusuario.setText("Carolina");
        jPanel1.add(labelusuario);
        labelusuario.setBounds(600, 0, 50, 30);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UsuarioLogueado.png"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(650, 0, 30, 30);
        jPanel1.add(txtFecha);
        txtFecha.setBounds(50, 10, 80, 20);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Viaje", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        jPanel9.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Número Viaje");
        jPanel9.add(jLabel4);
        jLabel4.setBounds(20, 30, 100, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Estado");
        jPanel9.add(jLabel5);
        jLabel5.setBounds(230, 30, 80, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Tipo Viaje");
        jPanel9.add(jLabel6);
        jLabel6.setBounds(430, 30, 90, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Solicitante");
        jPanel9.add(jLabel7);
        jLabel7.setBounds(10, 60, 90, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Fecha Realización");
        jPanel9.add(jLabel8);
        jLabel8.setBounds(280, 60, 130, 20);
        jPanel9.add(txtNumViaje);
        txtNumViaje.setBounds(100, 30, 82, 20);

        jPanel9.add(cmbTipoViaje);
        cmbTipoViaje.setBounds(490, 30, 200, 20);
        jPanel9.add(txtSolicitante);
        txtSolicitante.setBounds(70, 60, 190, 20);
        jPanel9.add(calendarioViaje);
        calendarioViaje.setBounds(390, 60, 90, 20);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("PENDIENTE");
        jPanel9.add(jLabel9);
        jLabel9.setBounds(280, 30, 100, 20);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Hora Realización");
        jPanel9.add(jLabel11);
        jLabel11.setBounds(500, 60, 120, 20);

        cmbHora.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00" }));
        jPanel9.add(cmbHora);
        cmbHora.setBounds(600, 60, 90, 20);

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

        btnNuevoViaje.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnNuevoViaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icononuevo.PNG"))); // NOI18N
        btnNuevoViaje.setText("Nuevo");
        btnNuevoViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoViajeActionPerformed(evt);
            }
        });

        btnAsignarVeh.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnAsignarVeh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/proveedor.png"))); // NOI18N
        btnAsignarVeh.setText("Asignar Vehículo");
        btnAsignarVeh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarVehActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnNuevoViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAsignarVeh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAsignarVeh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Traslado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        panelPuerto.setLayout(null);
        panelPuerto.add(txtProductor);
        txtProductor.setBounds(110, 150, 180, 20);

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        panelPuerto.add(btnAgregar);
        btnAgregar.setBounds(630, 70, 40, 30);
        panelPuerto.add(txtProvinciaT);
        txtProvinciaT.setBounds(110, 180, 180, 20);
        panelPuerto.add(txtToneladasE);
        txtToneladasE.setBounds(370, 210, 110, 20);

        labelLocalidad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelLocalidad.setText("Localidad");
        panelPuerto.add(labelLocalidad);
        labelLocalidad.setBounds(400, 180, 90, 20);

        labelDepto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelDepto.setText("Departamento");
        panelPuerto.add(labelDepto);
        labelDepto.setBounds(20, 180, 100, 20);
        panelPuerto.add(txtLocalidad);
        txtLocalidad.setBounds(470, 180, 180, 20);

        labelProductor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelProductor.setText("Productor");
        panelPuerto.add(labelProductor);
        labelProductor.setBounds(40, 150, 100, 20);

        labelCereal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelCereal.setText("Tipo de Cereal");
        panelPuerto.add(labelCereal);
        labelCereal.setBounds(20, 210, 110, 20);

        tblEstablecimiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº Solicitud", "Productor", "Número de Documento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scpEstablecimiento.setViewportView(tblEstablecimiento);

        panelPuerto.add(scpEstablecimiento);
        scpEstablecimiento.setBounds(60, 30, 560, 100);

        labelPuerto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelPuerto.setText("Puerto");
        panelPuerto.add(labelPuerto);
        labelPuerto.setBounds(420, 150, 70, 20);

        labelEstablecimiento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelEstablecimiento.setText("Establecimiento");
        panelPuerto.add(labelEstablecimiento);
        labelEstablecimiento.setBounds(370, 150, 110, 20);

        labelProvincia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelProvincia.setText("Provincia");
        panelPuerto.add(labelProvincia);
        labelProvincia.setBounds(50, 180, 80, 20);

        labelToneladasE.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelToneladasE.setText("Toneladas a Extraer");
        panelPuerto.add(labelToneladasE);
        labelToneladasE.setBounds(250, 210, 150, 20);
        panelPuerto.add(txtCerealT);
        txtCerealT.setBounds(110, 210, 110, 20);
        panelPuerto.add(txtTraslado);
        txtTraslado.setBounds(470, 150, 180, 20);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Silo Nº");
        panelPuerto.add(jLabel10);
        jLabel10.setBounds(520, 210, 70, 20);
        panelPuerto.add(txtSilo);
        txtSilo.setBounds(570, 210, 80, 20);

        panelEstablecimiento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Retiro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        panelEstablecimiento.setLayout(null);

        tblProductor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº Solicitud", "Productor", "Número de Documento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblProductor);

        panelEstablecimiento.add(jScrollPane2);
        jScrollPane2.setBounds(70, 30, 560, 90);

        jLabel16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel16.setText("Establecimiento");
        panelEstablecimiento.add(jLabel16);
        jLabel16.setBounds(350, 130, 120, 20);

        jLabel17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel17.setText("Localidad");
        panelEstablecimiento.add(jLabel17);
        jLabel17.setBounds(380, 160, 100, 20);

        jLabel18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel18.setText("Departamento");
        panelEstablecimiento.add(jLabel18);
        jLabel18.setBounds(30, 160, 110, 20);
        panelEstablecimiento.add(txtProductorEst);
        txtProductorEst.setBounds(120, 130, 180, 20);
        panelEstablecimiento.add(txtDepto);
        txtDepto.setBounds(120, 160, 180, 20);

        jLabel19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel19.setText("Productor");
        panelEstablecimiento.add(jLabel19);
        jLabel19.setBounds(50, 130, 90, 20);

        jLabel20.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel20.setText("Tipo Cereal");
        panelEstablecimiento.add(jLabel20);
        jLabel20.setBounds(40, 190, 80, 20);
        panelEstablecimiento.add(txtLocalidadEst);
        txtLocalidadEst.setBounds(450, 160, 180, 20);

        jLabel21.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel21.setText("Hectáreas a Trillar");
        panelEstablecimiento.add(jLabel21);
        jLabel21.setBounds(10, 220, 130, 20);
        panelEstablecimiento.add(txtHas);
        txtHas.setBounds(120, 220, 100, 20);

        jLabel22.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel22.setText("Lote ");
        panelEstablecimiento.add(jLabel22);
        jLabel22.setBounds(80, 250, 70, 20);

        panelEstablecimiento.add(cmbLote);
        cmbLote.setBounds(120, 250, 100, 20);

        btnAgregarProductor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        btnAgregarProductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductorActionPerformed(evt);
            }
        });
        panelEstablecimiento.add(btnAgregarProductor);
        btnAgregarProductor.setBounds(640, 60, 40, 30);

        tblLote.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lote", "Latitud", "Longitud"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblLote);

        panelEstablecimiento.add(jScrollPane3);
        jScrollPane3.setBounds(280, 210, 410, 80);

        btnAgregarLote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_mas.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregarLote, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(btnAgregarLote, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        panelEstablecimiento.add(jPanel3);
        jPanel3.setBounds(220, 220, 60, 80);
        panelEstablecimiento.add(txtCerealR);
        txtCerealR.setBounds(120, 190, 100, 20);
        panelEstablecimiento.add(txtRetiro);
        txtRetiro.setBounds(450, 130, 180, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelEstablecimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelPuerto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPuerto, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEstablecimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
    DefaultTableModel modeloT = (DefaultTableModel) tblEstablecimiento.getModel();
    int fila = tblEstablecimiento.getSelectedRow();
    txtProductor.setText(modeloT.getValueAt(fila, 1).toString());
    SolicitudRetiro sol = new SolicitudRetiro();
    if(cmbTipoViaje.getSelectedItem().toString().equalsIgnoreCase("Traslado a Establecimiento")){
        labelEstablecimiento.setVisible(true);
        labelPuerto.setVisible(false);
        labelDepto.setVisible(true);
        labelProvincia.setVisible(false);
        Iterator ite= gestorH.listarClase(SolicitudRetiro.class).iterator();
        while(ite.hasNext()){
            SolicitudRetiro solicitud = (SolicitudRetiro) ite.next();
            if(solicitud.getNumeroSolicitud()== Double.parseDouble(modeloT.getValueAt(fila, 0).toString())){
                sol = solicitud; 
            }
        }
            Iterator ite1= gestorH.listarClase(EstablecimientoPorSolicitud.class).iterator();
            while(ite1.hasNext()){
                EstablecimientoPorSolicitud est = (EstablecimientoPorSolicitud) ite1.next();
                if(est.getSolicitud()== sol){
                    txtCerealT.setText(sol.getTipoCereal().toString());
                    txtTraslado.setText(est.getEstablecimiento().toString());
                    txtProvinciaT.setText(est.getEstablecimiento().getLocalidad().getDepartamento().toString());
                    txtLocalidad.setText(est.getEstablecimiento().getLocalidad().toString());
                    txtToneladasE.setText(String.valueOf(est.getToneladasAExtraer()));
                    txtSilo.setText(est.getSilo().toString());
                            
                }
            }
        
    
    }
    
    
    if(cmbTipoViaje.getSelectedItem().toString().equalsIgnoreCase("Traslado a Puerto")){
        labelEstablecimiento.setVisible(false);
        labelPuerto.setVisible(true);
        labelDepto.setVisible(false);
        labelProvincia.setVisible(true);
        Iterator ite= gestorH.listarClase(SolicitudRetiro.class).iterator();
        while(ite.hasNext()){
            SolicitudRetiro solicitud = (SolicitudRetiro) ite.next();
            if(solicitud.getNumeroSolicitud()== Double.parseDouble(modeloT.getValueAt(fila, 0).toString())){
                sol = solicitud; 
            }
        }
            
//            if(sol.getNumeroSolicitud() == modeloT.getValueAt(fila, 0)){
//                    txtCerealT.setText(sol.getTipoCereal().toString());
//                    
//            }
            Iterator ite1= gestorH.listarClase(PuertoPorSolicitud.class).iterator();
            while(ite1.hasNext()){
                PuertoPorSolicitud puerto = (PuertoPorSolicitud) ite1.next();
                if(puerto.getSolicitud()== sol){
                    txtCerealT.setText(sol.getTipoCereal().toString());
                    txtTraslado.setText(puerto.getPuerto().toString());
                    txtProvinciaT.setText(puerto.getPuerto().getLocalidad().getDepartamento().getProvincia().toString());
                    txtLocalidad.setText(puerto.getPuerto().getLocalidad().toString());
                    txtToneladasE.setText(String.valueOf(puerto.getToneladasAExtraer()));  
                    txtSilo.setText(puerto.getSilo().toString());
                }
            }
        
    
    }
 
    
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAgregarProductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductorActionPerformed
    DefaultTableModel modeloT = (DefaultTableModel) tblProductor.getModel();
    int fila = tblProductor.getSelectedRow();
    txtProductorEst.setText(modeloT.getValueAt(fila, 1).toString());
        Iterator ite= gestorH.listarClase(SolicitudRetiro.class).iterator();
        while(ite.hasNext()){
            SolicitudRetiro sol = (SolicitudRetiro) ite.next();
            if(sol.getNumeroSolicitud() == Double.parseDouble(modeloT.getValueAt(fila, 0).toString())){
                    txtCerealR.setText(sol.getTipoCereal().toString());
                    Iterator ite1= gestorH.listarClase(EstablecimientoPorSolicitud.class).iterator();
                    while(ite1.hasNext()){
                    EstablecimientoPorSolicitud est = (EstablecimientoPorSolicitud) ite1.next();
                    if(est.getSolicitud()== sol){
                    txtRetiro.setText(est.getEstablecimiento().toString());
                    txtDepto.setText(est.getEstablecimiento().getLocalidad().getDepartamento().toString());
                    txtLocalidadEst.setText(est.getEstablecimiento().getLocalidad().toString());
                    txtHas.setText(String.valueOf(est.getHectareasATrillar()));                            
                }
            }
                    
            }
            
        }
    
    
    }//GEN-LAST:event_btnAgregarProductorActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //VER GUARDAR SOLICITUD
       //int campo = gViaje.campoObligatorio(txtProductor, txtProductorEst);
       //if(campo==0){
       gestorBitacora gestorB = new gestorBitacora();
       int filaE = tblEstablecimiento.getSelectedRow(); 
       int filaP = tblProductor.getSelectedRow();
       Viaje viaje = new Viaje();
       viaje.setFecha(calendarioViaje.getText());
       viaje.setHora(cmbHora.getSelectedItem().toString());
       viaje.setTipoViaje((TipoViaje)cmbTipoViaje.getSelectedItem());
       viaje.setEstado("Pendiente");
       viaje.setSolicitante(txtSolicitante.getText());
       Iterator iteC = gestorH.listarClase(TipoCereal.class).iterator();
       while(iteC.hasNext()){
           TipoCereal t = (TipoCereal) iteC.next();
           if(panelPuerto.isVisible() && t.getNombreCereal().equalsIgnoreCase(txtCerealT.getText())){
               viaje.setCerealATransportar(t);
           
           }
           if(panelEstablecimiento.isVisible() && t.getNombreCereal().equalsIgnoreCase(txtCerealR.getText())){
               viaje.setCerealATransportar(t);
           }
       }
       Iterator iteP = gestorH.listarClase(Productor.class).iterator();
       while(iteP.hasNext()){
           Productor p = (Productor) iteP.next();
           if(panelPuerto.isVisible() && p.getNumeroDocumento().equalsIgnoreCase(tblEstablecimiento.getValueAt(filaE, 2).toString())){
               viaje.setProductor(p);
           }
           if(panelEstablecimiento.isVisible() && p.getNumeroDocumento().equalsIgnoreCase(tblProductor.getValueAt(filaP, 2).toString())){
               viaje.setProductor(p);
           }
       }
       Iterator iteS = gestorH.listarClase(SolicitudRetiro.class).iterator();
       while(iteS.hasNext()){
           SolicitudRetiro sol = (SolicitudRetiro) iteS.next();
           if((panelPuerto.isVisible()) && sol.getNumeroSolicitud()==(Double.parseDouble(tblEstablecimiento.getValueAt(filaE, 0).toString()))){
               viaje.setSolicitud(sol);
           }
           if((panelEstablecimiento.isVisible()) && sol.getNumeroSolicitud() == (Double.parseDouble(tblProductor.getValueAt(filaP, 0).toString()))){
               viaje.setSolicitud(sol);
           }
       }
       gestorH.guardarObjeto(viaje);
       JOptionPane.showMessageDialog(null, "Se genero correctamente el viaje Nº" + " " + viaje.getIdViaje());
       txtNumViaje.setText(String.valueOf(viaje.getIdViaje()));
       
       gestorB.cargarBitacora(String.valueOf(viaje.getIdViaje()), txtFecha.getText(), 1 , labelusuario.getText(),"");
       if(cmbTipoViaje.getSelectedItem().toString().equalsIgnoreCase("Traslado a Puerto")){
           PuertoPorViaje puerto = new PuertoPorViaje();
           Iterator ite = gestorH.listarClase(Puerto.class).iterator();
           while(ite.hasNext()){
               Puerto p = (Puerto) ite.next();
               if (p.getNombrePuerto().equalsIgnoreCase(txtTraslado.getText())){
                   puerto.setPuerto(p);
                   puerto.setViaje(viaje);
                   gestorH.guardarObjeto(puerto);
               }
           }
       }
       
         if(cmbTipoViaje.getSelectedItem().toString().equalsIgnoreCase("Traslado a Establecimiento")){
           EstablecimientoPorViaje est = new EstablecimientoPorViaje();
           Iterator ite = gestorH.listarClase(Establecimiento.class).iterator();
           while(ite.hasNext()){
               Establecimiento p = (Establecimiento) ite.next();
               if (p.getNombreEstablecimiento().equalsIgnoreCase(txtTraslado.getText())){
                   est.setEstablecimiento(p);
                   est.setViaje(viaje);
                   gestorH.guardarObjeto(est);
               }
           }
       }
         
         if(cmbTipoViaje.getSelectedItem().toString().equalsIgnoreCase("Retiro de Establecimiento")){
           EstablecimientoPorViaje est = new EstablecimientoPorViaje();
           Iterator ite = gestorH.listarClase(Establecimiento.class).iterator();
           while(ite.hasNext()){
               Establecimiento p = (Establecimiento) ite.next();
               if (p.getNombreEstablecimiento().equalsIgnoreCase(txtRetiro.getText())){
                   est.setEstablecimiento(p);
                   est.setViaje(viaje);
                   gestorH.guardarObjeto(est);
               }
           }
       } 
      // }else{
    //JOptionPane.showMessageDialog(null,"Campos Obligatorios");
    //}
         txtCerealR.setText("");
         txtCerealT.setText("");
         txtDepto.setText("");
         txtHas.setText("");
         txtLocalidad.setText("");
         txtLocalidadEst.setText("");
         txtProductor.setText("");
         txtProductorEst.setText("");
         txtProvinciaT.setText("");
         txtRetiro.setText("");
         txtSilo.setText("");
         txtSolicitante.setText("");
         txtToneladasE.setText("0.0");
         txtTraslado.setText("");        
         DefaultTableModel modelot = (DefaultTableModel) tblProductor.getModel();
         modelot.setRowCount(0);
         tblProductor.setModel(modelot);
         DefaultTableModel modelot1 = (DefaultTableModel) tblEstablecimiento.getModel();
         modelot1.setRowCount(0);
         tblEstablecimiento.setModel(modelot1);
        final int banderaP = gViaje.ContarPuerto();
        final int banderaE= gViaje.ContarEst();
        cmbTipoViaje.setModel(gViaje.AgregarTipoViaje());
        cmbTipoViaje.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent arg0){
           gViaje.ActualizarDatos(cmbTipoViaje.getSelectedItem().toString(), panelPuerto, panelEstablecimiento, labelPuerto, labelEstablecimiento, labelProvincia, labelDepto, tblEstablecimiento,scpEstablecimiento,tblProductor, banderaE, banderaP);
           }
        }
        );
          gViaje.ActualizarDatos(cmbTipoViaje.getSelectedItem().toString(), panelPuerto, panelEstablecimiento, labelPuerto, labelEstablecimiento, labelProvincia, labelDepto, tblEstablecimiento,scpEstablecimiento, tblProductor, banderaE, banderaP);
        btnAsignarVeh.setEnabled(true);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Confirma que desea salir?");
        if (respuesta==0){
            dispose();
    }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNuevoViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoViajeActionPerformed
        txtNumViaje.setText("");
        txtCerealR.setText("");
        txtCerealT.setText("");
        txtDepto.setText("");
        txtHas.setText("");
        txtLocalidad.setText("");
        txtLocalidadEst.setText("");
        txtProductor.setText("");
        txtProductorEst.setText("");
        txtProvinciaT.setText("");
        txtRetiro.setText("");
        txtSilo.setText("");
        txtSolicitante.setText("");
        txtToneladasE.setText("");
        txtTraslado.setText("");
        btnGuardar.setEnabled(true);
        btnAsignarVeh.setEnabled(false);
    }//GEN-LAST:event_btnNuevoViajeActionPerformed

    private void btnAsignarVehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarVehActionPerformed
        frmAsignarTransporte asignar= new frmAsignarTransporte();
        frmPrincipal.Escritorio.add(asignar);
        asignar.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAsignarVehActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarLote;
    private javax.swing.JButton btnAgregarProductor;
    private javax.swing.JButton btnAsignarVeh;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevoViaje;
    private javax.swing.JButton btnSalir;
    private datechooser.beans.DateChooserCombo calendarioViaje;
    private javax.swing.JComboBox cmbHora;
    private javax.swing.JComboBox cmbLote;
    private javax.swing.JComboBox cmbTipoViaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelCereal;
    private javax.swing.JLabel labelDepto;
    private javax.swing.JLabel labelEstablecimiento;
    private javax.swing.JLabel labelLocalidad;
    private javax.swing.JLabel labelProductor;
    private javax.swing.JLabel labelProvincia;
    private javax.swing.JLabel labelPuerto;
    private javax.swing.JLabel labelToneladasE;
    private javax.swing.JLabel labelusuario;
    private javax.swing.JPanel panelEstablecimiento;
    private javax.swing.JPanel panelPuerto;
    private javax.swing.JScrollPane scpEstablecimiento;
    private javax.swing.JTable tblEstablecimiento;
    private javax.swing.JTable tblLote;
    private javax.swing.JTable tblProductor;
    private javax.swing.JTextField txtCerealR;
    private javax.swing.JTextField txtCerealT;
    private javax.swing.JTextField txtDepto;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHas;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtLocalidad;
    private javax.swing.JTextField txtLocalidadEst;
    private javax.swing.JTextField txtNumViaje;
    private javax.swing.JTextField txtProductor;
    private javax.swing.JTextField txtProductorEst;
    private javax.swing.JTextField txtProvinciaT;
    private javax.swing.JTextField txtRetiro;
    private javax.swing.JTextField txtSilo;
    private javax.swing.JTextField txtSolicitante;
    private javax.swing.JTextField txtToneladasE;
    private javax.swing.JTextField txtTraslado;
    // End of variables declaration//GEN-END:variables
}
