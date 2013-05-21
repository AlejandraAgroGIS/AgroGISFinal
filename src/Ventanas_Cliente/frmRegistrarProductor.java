/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas_Cliente;

import Clases_Modulo_Cliente.Productor;
import Clases_Modulo_Transporte.Barrio;
import Clases_Modulo_Transporte.Domicilio;
import Gestores_Vista.gestorRegistroTransportista;
import Ventanas_Transporte.frmPrincipal;
import Ventanas_Transporte.frmRegistrarProvincia;
import groovy.model.DefaultTableModel;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import Gestores_Clases.*;
import Gestores_Vista.*;
import Hibernate.GestorHibernate;

/**
 *
 * @author Carolina
 */
public class frmRegistrarProductor extends javax.swing.JInternalFrame {
  gestorRegistroTransportista gRegistro = new gestorRegistroTransportista();
  gestorBarrio gBarrio = new gestorBarrio();
  gestorDepartamento gdepto = new gestorDepartamento();
  gestorLocalidad gLocalidad = new gestorLocalidad();
  gestorPais gPais = new gestorPais();
  gestorProvincia gProvincia = new gestorProvincia();
  gestorTipoDocumento gtipoDoc = new gestorTipoDocumento();
  gestorTipoTelefono gTipoTel = new gestorTipoTelefono();
  gestorRegistrarProductor gProductor = new gestorRegistrarProductor();
  GestorHibernate gHibernate = new GestorHibernate();
  
    /**
     * Creates new form frmRegistrarProductor
     */
    public frmRegistrarProductor() {
        initComponents();
        gBarrio.actualizarUsuario(labelusuario);
        cmbPais.setModel(gPais.getComboModelPais());
        
        
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
        int ancho = 760;
        int alto = 570;
        int posX = (int) ((tamanioPantalla.width - ancho) / 2);
//        int posY = (int) ((tamanioPantalla.height - alto) / 2);
        this.setSize(ancho, alto);
        this.setLocation(posX, 20);        
        
         //Carga Tipo Documento
        cmbTipoDoc.setModel(gRegistro.rellenaComboTipoDoc());
        
        //Carga Provincia de acuerdo al Pais
        cmbPais.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent arg0){
            cmbProvincia.setModel(gRegistro.rellenaCombo(cmbPais.getSelectedItem().toString()));
        }
        }
        );
        cmbProvincia.setModel(gRegistro.rellenaCombo(cmbPais.getSelectedItem().toString()));
        //Relleno Departamento de acuerdo a la Provincia
        cmbProvincia.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                cmbDepto.setModel(gRegistro.rellenaComboDepartamento(cmbProvincia.getSelectedItem().toString()));
            }
        });
        cmbDepto.setModel(gRegistro.rellenaComboDepartamento(cmbProvincia.getSelectedItem().toString()));
       
        //Relleno Localidad de acuerdo al Departamento
        cmbDepto.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                cmbLocalidad.setModel(gRegistro.rellenaComboLocalidad(cmbDepto.getSelectedItem().toString()));
            }
        });
        cmbLocalidad.setModel(gRegistro.rellenaComboLocalidad(cmbDepto.getSelectedItem().toString()));
        //Carga Barrio de acuerdo a Localidad
        cmbLocalidad.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent arg0){
            cmbBarrio.setModel(gRegistro.rellenaComboBarrio(cmbLocalidad.getSelectedItem().toString()));
        }
        }
        );
         cmbBarrio.setModel(gRegistro.rellenaComboBarrio(cmbLocalidad.getSelectedItem().toString()));
                
                      
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmbTipoDoc = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cmbEstadoCivil = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        cmbTipoTel = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTelefono = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        btnEliminarTel = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        btnAgregarTel = new javax.swing.JButton();
        calendarioNacimiento = new datechooser.beans.DateChooserCombo();
        jLabel1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbCategoria = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCuit = new javax.swing.JTextField();
        cmbCondicionIva = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtDepto = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtPiso = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        cmbProvincia = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        cmbLocalidad = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        cmbPais = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        cmbBarrio = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        cmbDepto = new javax.swing.JComboBox();
        jPanel18 = new javax.swing.JPanel();
        btnAgregarDepartamento = new javax.swing.JButton();
        btnAgregarPais = new javax.swing.JButton();
        btnAgregarBarrio = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        btnAgregarProvincia = new javax.swing.JButton();
        btnAgregarLocalidad = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEstablecimiento = new javax.swing.JButton();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Productor");

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
        labelusuario.setBounds(610, 10, 50, 15);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UsuarioLogueado.png"))); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(660, 0, 30, 30);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Personales", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        jPanel2.setLayout(null);

        jPanel3.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Apellido");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(10, 10, 100, 20);

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        jPanel3.add(txtApellido);
        txtApellido.setBounds(130, 10, 240, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Nombres");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(390, 10, 70, 20);

        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });
        jPanel3.add(txtNombres);
        txtNombres.setBounds(450, 10, 240, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Tipo Documento");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(10, 40, 100, 20);

        jPanel3.add(cmbTipoDoc);
        cmbTipoDoc.setBounds(130, 40, 120, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Numero Documento");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(330, 40, 120, 20);

        txtDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDocumentoKeyTyped(evt);
            }
        });
        jPanel3.add(txtDocumento);
        txtDocumento.setBounds(450, 40, 120, 20);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Fecha de Nacimiento");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(10, 70, 120, 20);

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("Estado Civil");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(380, 70, 70, 20);

        cmbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Soltero", "Casado", "Viudo" }));
        jPanel3.add(cmbEstadoCivil);
        cmbEstadoCivil.setBounds(450, 70, 120, 20);

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setText("Tipo Teléfono");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(10, 100, 80, 20);

        jPanel3.add(cmbTipoTel);
        cmbTipoTel.setBounds(130, 100, 120, 20);

        jLabel15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel15.setText("Número Teléfono");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(350, 100, 100, 20);

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel3.add(txtTelefono);
        txtTelefono.setBounds(450, 100, 170, 20);

        tblTelefono.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo Teléfono", "Número Teléfono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTelefono.getTableHeader().setResizingAllowed(false);
        tblTelefono.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblTelefono);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(200, 140, 320, 60);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel7);
        jPanel7.setBounds(-20, -50, 700, 40);

        btnEliminarTel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete.png"))); // NOI18N
        btnEliminarTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTelActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminarTel);
        btnEliminarTel.setBounds(530, 160, 40, 30);

        btnAgregarTel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_mas.png"))); // NOI18N
        btnAgregarTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(btnAgregarTel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnAgregarTel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel10);
        jPanel10.setBounds(580, 70, 100, 70);
        jPanel3.add(calendarioNacimiento);
        calendarioNacimiento.setBounds(130, 70, 120, 20);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("E-Mail");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(80, 210, 70, 20);
        jPanel3.add(txtEmail);
        txtEmail.setBounds(130, 210, 240, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Condición IVA");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(380, 210, 150, 20);

        jPanel3.add(cmbCategoria);
        cmbCategoria.setBounds(470, 240, 150, 20);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("CUIT/CUIL");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(60, 240, 100, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Categoría Productor");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(350, 240, 170, 20);
        jPanel3.add(txtCuit);
        txtCuit.setBounds(130, 240, 160, 20);

        jPanel3.add(cmbCondicionIva);
        cmbCondicionIva.setBounds(470, 210, 150, 20);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(10, 20, 720, 270);

        jPanel4.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel16.setText("Calle");
        jPanel4.add(jLabel16);
        jLabel16.setBounds(10, 10, 40, 20);

        txtCalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCalleKeyTyped(evt);
            }
        });
        jPanel4.add(txtCalle);
        txtCalle.setBounds(50, 10, 240, 20);

        jLabel17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel17.setText("Número");
        jPanel4.add(jLabel17);
        jLabel17.setBounds(330, 10, 50, 20);

        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });
        jPanel4.add(txtNumero);
        txtNumero.setBounds(380, 10, 60, 20);

        jLabel18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel18.setText("Piso");
        jPanel4.add(jLabel18);
        jLabel18.setBounds(475, 10, 30, 20);
        jPanel4.add(txtDepto);
        txtDepto.setBounds(630, 10, 50, 20);

        jLabel19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel19.setText("Depto");
        jPanel4.add(jLabel19);
        jLabel19.setBounds(590, 10, 40, 20);

        txtPiso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPisoKeyTyped(evt);
            }
        });
        jPanel4.add(txtPiso);
        txtPiso.setBounds(510, 10, 50, 20);

        jLabel20.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel20.setText("País");
        jPanel4.add(jLabel20);
        jLabel20.setBounds(70, 40, 40, 20);

        jPanel4.add(cmbProvincia);
        cmbProvincia.setBounds(440, 50, 190, 20);

        jLabel21.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel21.setText("Provincia");
        jPanel4.add(jLabel21);
        jLabel21.setBounds(380, 50, 60, 20);

        jPanel4.add(cmbLocalidad);
        cmbLocalidad.setBounds(440, 90, 190, 20);

        jLabel22.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel22.setText("Departamento");
        jPanel4.add(jLabel22);
        jLabel22.setBounds(20, 80, 100, 20);

        jPanel4.add(cmbPais);
        cmbPais.setBounds(100, 40, 190, 20);

        jLabel23.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel23.setText("Localidad");
        jPanel4.add(jLabel23);
        jLabel23.setBounds(380, 90, 60, 20);

        jPanel4.add(cmbBarrio);
        cmbBarrio.setBounds(100, 120, 190, 20);

        jLabel24.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel24.setText("Barrio");
        jPanel4.add(jLabel24);
        jLabel24.setBounds(60, 120, 50, 20);

        jPanel4.add(cmbDepto);
        cmbDepto.setBounds(100, 80, 190, 20);

        btnAgregarDepartamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_mas.png"))); // NOI18N
        btnAgregarDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDepartamentoActionPerformed(evt);
            }
        });

        btnAgregarPais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_mas.png"))); // NOI18N
        btnAgregarPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPaisActionPerformed(evt);
            }
        });

        btnAgregarBarrio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_mas.png"))); // NOI18N
        btnAgregarBarrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarBarrioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarPais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarDepartamento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarBarrio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(btnAgregarPais, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregarDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregarBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jPanel4.add(jPanel18);
        jPanel18.setBounds(250, 30, 100, 120);

        btnAgregarProvincia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_mas.png"))); // NOI18N
        btnAgregarProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProvinciaActionPerformed(evt);
            }
        });

        btnAgregarLocalidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_mas.png"))); // NOI18N
        btnAgregarLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarLocalidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarProvincia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarLocalidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnAgregarProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregarLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel20);
        jPanel20.setBounds(590, 20, 100, 110);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(10, 300, 720, 150);

        btnNuevo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icononuevo.PNG"))); // NOI18N
        btnNuevo.setText("Nuevo");

        btnGuardar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEstablecimiento.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnEstablecimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/map.png"))); // NOI18N
        btnEstablecimiento.setText("Establecimiento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 195, Short.MAX_VALUE)
                        .addComponent(btnEstablecimiento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevo)
                        .addGap(229, 229, 229))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEstablecimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c) == false) {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c) == false) {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombresKeyTyped

    private void txtDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDocumentoKeyTyped
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if (((caracter < '0')
                || (caracter > '9'))
                && (caracter != '\b' /*
                 * corresponde a BACK_SPACE
                 */)) {
            evt.consume();  // ignorar el evento de teclado
        }
    }//GEN-LAST:event_txtDocumentoKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if (((caracter < '0')
                || (caracter > '9'))
                && (caracter != '\b' /*
                 * corresponde a BACK_SPACE
                 */)) {
            evt.consume();  // ignorar el evento de teclado
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void btnEliminarTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTelActionPerformed
        DefaultTableModel modeloT = (DefaultTableModel) tblTelefono.getModel();
//        modeloT.removeRow(tblTelefono.getSelectedRow());
    }//GEN-LAST:event_btnEliminarTelActionPerformed

    private void btnAgregarTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTelActionPerformed
        DefaultTableModel modeloTabla = (DefaultTableModel) tblTelefono.getModel();
        Object fila[] = {cmbTipoTel.getSelectedItem(), txtTelefono.getText()};
//        modeloTabla.addRow(fila);
        tblTelefono.setModel(modeloTabla);
        txtTelefono.setText("");
    }//GEN-LAST:event_btnAgregarTelActionPerformed

    private void txtCalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCalleKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c) == false) {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtCalleKeyTyped

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if (((caracter < '0')
                || (caracter > '9'))
                && (caracter != '\b' /*
                 * corresponde a BACK_SPACE
                 */)) {
            evt.consume();  // ignorar el evento de teclado
        }
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void txtPisoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPisoKeyTyped
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if (((caracter < '0')
                || (caracter > '9'))
                && (caracter != '\b' /*
                 * corresponde a BACK_SPACE
                 */)) {
            evt.consume();  // ignorar el evento de teclado
        }
    }//GEN-LAST:event_txtPisoKeyTyped

    private void btnAgregarDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDepartamentoActionPerformed
        frmRegistrarProvincia provincia = new frmRegistrarProvincia();
        frmPrincipal.Escritorio.add(provincia);
        provincia.toFront();
        provincia.setVisible(true);
    }//GEN-LAST:event_btnAgregarDepartamentoActionPerformed

    private void btnAgregarPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarPaisActionPerformed

    private void btnAgregarBarrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarBarrioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarBarrioActionPerformed

    private void btnAgregarProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProvinciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarProvinciaActionPerformed

    private void btnAgregarLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLocalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarLocalidadActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    Productor productor = new Productor();
    Domicilio domicilio = gProductor.guardarDomicilio(cmbBarrio.getSelectedItem().toString(), txtCalle.getText(),txtDepto.getText(), txtNumero.getText(), txtPiso.getText());
    gProductor.guardarCondicionIva(cmbCondicionIva.getSelectedItem().toString(), productor);
    productor.setApellido(txtApellido.getText());
    productor.setNombre(txtNombres.getText());
    productor.setNumeroDocumento(txtNombres.getText());
    productor.seteMail(txtEmail.getText());
    gHibernate.guardarObjeto(productor);
    
    }//GEN-LAST:event_btnGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarBarrio;
    private javax.swing.JButton btnAgregarDepartamento;
    private javax.swing.JButton btnAgregarLocalidad;
    private javax.swing.JButton btnAgregarPais;
    private javax.swing.JButton btnAgregarProvincia;
    private javax.swing.JButton btnAgregarTel;
    private javax.swing.JButton btnEliminarTel;
    private javax.swing.JButton btnEstablecimiento;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private datechooser.beans.DateChooserCombo calendarioNacimiento;
    private javax.swing.JComboBox cmbBarrio;
    private javax.swing.JComboBox cmbCategoria;
    private javax.swing.JComboBox cmbCondicionIva;
    private javax.swing.JComboBox cmbDepto;
    private javax.swing.JComboBox cmbEstadoCivil;
    private javax.swing.JComboBox cmbLocalidad;
    private javax.swing.JComboBox cmbPais;
    private javax.swing.JComboBox cmbProvincia;
    private javax.swing.JComboBox cmbTipoDoc;
    private javax.swing.JComboBox cmbTipoTel;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelusuario;
    private javax.swing.JTable tblTelefono;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCuit;
    private javax.swing.JTextField txtDepto;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPiso;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
