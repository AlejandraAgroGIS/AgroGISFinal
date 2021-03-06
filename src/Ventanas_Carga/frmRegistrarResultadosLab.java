/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas_Carga;

import Clases_Modulo_Carga.*;
import Clases_Modulo_Transporte.Estado;
import Clases_Modulo_Viaje.Viaje;
import Gestores_Vista.gestorRegistrarResultado;
import Hibernate.GestorHibernate;
import java.awt.*;
import java.text.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Carolina
 */
public class frmRegistrarResultadosLab extends javax.swing.JInternalFrame {
GestorHibernate gestorH = new GestorHibernate();
gestorRegistrarResultado gestorE = new gestorRegistrarResultado();
    /**
     * Creates new form frmRegistrarResultadosLab
     */
    public frmRegistrarResultadosLab() {
        initComponents();
        gestorH.actualizarUsuario(labelusuario);
        txtHora.setEditable(false);
        txtHora.setEnabled(false);
        txtHora.setEnabled(false);
        txtHora.setEditable(false);
        txtFecha.setEditable(false);
        txtFecha.setEnabled(false);
        txtFecha.setEditable(false);
        txtFecha.setEnabled(false);
        
        calendarioDViaje.setEnabled(false);
        calendarioHViaje.setEnabled(false);
        txtNumMuestra.setEnabled(false);
        cmbProductor.setEnabled(false);
 
        
        txtHumedadSojaN.setEnabled(false);
        txtPHectTrigoN.setEnabled(false);
        txtMatExtTrigoN.setEnabled(false);
        txtGDaniadosTrigoN.setEnabled(false);
        txtGDaniadosTrigoN.setText("1.0");
        txtGDaniadosMaizN.setEnabled(false);
        txtGDaniadosMaizN.setText("5.33");
        txtGDaniadosSojaN.setEnabled(false);
        txtGDaniadosSojaN.setText("5.0");
        txtGQuebradosMaizN.setEnabled(false);
        txtGQuebradosMaizN.setText("3.33");
        txtGQuebradosSojaN.setEnabled(false);
        txtGQuebradosSojaN.setText("25.0");
        txtGQuebradosTrigoN.setEnabled(false);
        txtGQuebradosTrigoN.setText("1.23");
        txtHumedadMaizN.setEnabled(false);
        txtHumedadMaizN.setText("14.5");
        txtHumedadSojaN.setEnabled(false);
        txtHumedadSojaN.setText("13.5");
        txtHumedadTrigoN.setEnabled(false);
        txtHumedadTrigoN.setText("14.0");
        txtMatExtMaizN.setEnabled(false);
        txtMatExtMaizN.setText("1.50");
        txtMatExtSojaN.setEnabled(false);
        txtMatExtSojaN.setText("2.0");
        txtMatExtTrigoN.setEnabled(false);
        txtMatExtTrigoN.setText("0.83");
        txtGranosVerdesN.setEnabled(false);
        txtGranosVerdesN.setText("7.5");
        txtPHectMaizN.setEnabled(false);
        txtPHectMaizN.setText("72.0");
        txtPHectTrigoN.setEnabled(false);
        txtPHectTrigoN.setText("76.0");
        //setear el campo de fecha con la del sistema
        GregorianCalendar gc=new GregorianCalendar();
        GregorianCalendar.getInstance();
        gc.setTimeZone(TimeZone.getTimeZone("GMT-3"));
        gc.get(Calendar.DAY_OF_WEEK);
        gc.get(Calendar.MONTH);
        gc.get(Calendar.YEAR);
        SimpleDateFormat formateador= new SimpleDateFormat("dd-MM-yyyy");
        txtFecha.setText(formateador.format(gc.getTime()));
        txtFecha.setText(formateador.format(gc.getTime()));
        //setear el campo de hora con la del sistema
        GregorianCalendar calendario=new GregorianCalendar();
        GregorianCalendar.getInstance();
        gc.setTimeZone(TimeZone.getTimeZone("GMT-3"));
        calendario.get(Calendar.HOUR);
        calendario.get(Calendar.MINUTE);
        SimpleDateFormat formateadorHora=new SimpleDateFormat("HH:mm");
        txtHora.setText(formateadorHora.format(calendario.getTime()));
        txtHora.setText(formateadorHora.format(calendario.getTime()));
        
        
        //Las siguientes lineas son para dar a la pantalla el tamaño requerido y luego centrarla en la pantalla.
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension tamanioPantalla = kit.getScreenSize();
        int ancho = 935;
        int alto = 630;
        int posX = (int) ((tamanioPantalla.width - ancho) / 2);
//        int posY = (int) ((tamanioPantalla.height - alto) / 2);
        this.setSize(ancho, alto);
        this.setLocation(posX, 0);
        
        //redimensionar columnas tabla
        tblMuestras.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblMuestras.getColumnModel().getColumn(1).setPreferredWidth(50);
        tblMuestras.getColumnModel().getColumn(2).setPreferredWidth(50);
        //centrar cabecera jtable
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) tblMuestras.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(0);

       
        //deshabilitar campos de texto de la pestaña Datos analisis
        txtEspecialidad.setEnabled(false);
        txtLaboratorio.setEnabled(false);
        txtDomicilioLab.setEnabled(false);
        txtLocalidadLab.setEnabled(false);
        txtProvinciaLab.setEnabled(false);
        txtTelefonoLab.setEnabled(false);
        txtMuestraLab.setEnabled(false);
        txtFEnvio.setEnabled(false);
        txtCerealMuestra.setEnabled(false);
        txtHumedadMensis.setEnabled(false);
        txtMatExtMensis.setEnabled(false);
        
        
        
        
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
        txtFecha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        labelusuario = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        btnAceptarViaje = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        ckFecha = new javax.swing.JCheckBox();
        ckNumMuestra = new javax.swing.JCheckBox();
        ckProductor = new javax.swing.JCheckBox();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        calendarioHViaje = new datechooser.beans.DateChooserCombo();
        calendarioDViaje = new datechooser.beans.DateChooserCombo();
        jPanel12 = new javax.swing.JPanel();
        txtNumMuestra = new javax.swing.JTextField();
        cmbNroMuestra = new javax.swing.JComboBox();
        jPanel13 = new javax.swing.JPanel();
        cmbProductor = new javax.swing.JComboBox();
        btnBuscarViaje = new javax.swing.JButton();
        btnAceptarTodos = new javax.swing.JButton();
        btnBorrarTodos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMuestras = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtProductor = new javax.swing.JTextField();
        txtMuestra = new javax.swing.JTextField();
        txtEstablecimiento = new javax.swing.JTextField();
        txtCereal = new javax.swing.JTextField();
        txtFechaEnvio = new javax.swing.JTextField();
        txtEnviadoPor = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtDomicilioLab = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtLocalidadLab = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtTelefonoLab = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtProvinciaLab = new javax.swing.JTextField();
        txtEspecialidad = new javax.swing.JTextField();
        txtLaboratorio = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        calendarioRecep = new datechooser.beans.DateChooserCombo();
        jLabel32 = new javax.swing.JLabel();
        txtMuestraLab = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        txtCerealMuestra = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        labelPesoH = new javax.swing.JLabel();
        labelHumedad = new javax.swing.JLabel();
        labelGQuebrados = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txtMatExtTrigoN = new javax.swing.JTextField();
        txtPHectTrigoN = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtFEnvio = new javax.swing.JTextField();
        txtHumedadSojaN = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txtHumedadMensis = new javax.swing.JTextField();
        txtMatExtMensis = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        labelMatExt = new javax.swing.JLabel();
        labelGDaniados = new javax.swing.JLabel();
        txtGDaniadosTrigoN = new javax.swing.JTextField();
        txtGQuebradosSojaN = new javax.swing.JTextField();
        labelGranosV = new javax.swing.JLabel();
        txtHumedadMaizN = new javax.swing.JTextField();
        txtHumedadTrigoN = new javax.swing.JTextField();
        txtMatExtSojaN = new javax.swing.JTextField();
        txtMatExtMaizN = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        calendarioRecep1 = new datechooser.beans.DateChooserCombo();
        jLabel35 = new javax.swing.JLabel();
        txtMuestraLab1 = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        txtCerealMuestra1 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        labelPesoH1 = new javax.swing.JLabel();
        labelHumedad1 = new javax.swing.JLabel();
        labelGQuebrados1 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txtMatExtTrigo1 = new javax.swing.JTextField();
        txtPHect1 = new javax.swing.JTextField();
        txtHumedadLab1 = new javax.swing.JTextField();
        txtImpurezasLab1 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtFEnvio1 = new javax.swing.JTextField();
        txtHumedadSoja1 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        txtPesoLab1 = new javax.swing.JTextField();
        txtPesoMensis1 = new javax.swing.JTextField();
        txtHumedadMensis1 = new javax.swing.JTextField();
        txtImpurezasMensis1 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        labelMatExt1 = new javax.swing.JLabel();
        labelGDaniados1 = new javax.swing.JLabel();
        txtGDaniados1 = new javax.swing.JTextField();
        txtGQuebrados1 = new javax.swing.JTextField();
        labelGranosV1 = new javax.swing.JLabel();
        txtHumedadMaiz1 = new javax.swing.JTextField();
        txtHumedadTrigo1 = new javax.swing.JTextField();
        txtMatExtSoja1 = new javax.swing.JTextField();
        txtMatExtMaiz1 = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        calendarioRecep2 = new datechooser.beans.DateChooserCombo();
        jLabel38 = new javax.swing.JLabel();
        txtMuestraLab2 = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        txtCerealMuestra2 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        labelPesoH2 = new javax.swing.JLabel();
        labelHumedad2 = new javax.swing.JLabel();
        labelGQuebrados2 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        txtMatExtTrigo2 = new javax.swing.JTextField();
        txtPHect2 = new javax.swing.JTextField();
        txtHumedadLab2 = new javax.swing.JTextField();
        txtImpurezasLab2 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        txtFEnvio2 = new javax.swing.JTextField();
        txtHumedadSoja2 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        txtPesoLab2 = new javax.swing.JTextField();
        txtPesoMensis2 = new javax.swing.JTextField();
        txtHumedadMensis2 = new javax.swing.JTextField();
        txtImpurezasMensis2 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        labelMatExt2 = new javax.swing.JLabel();
        labelGDaniados2 = new javax.swing.JLabel();
        txtGDaniados2 = new javax.swing.JTextField();
        txtGQuebrados2 = new javax.swing.JTextField();
        labelGranosV2 = new javax.swing.JLabel();
        txtHumedadMaiz2 = new javax.swing.JTextField();
        txtHumedadTrigo2 = new javax.swing.JTextField();
        txtMatExtSoja2 = new javax.swing.JTextField();
        txtMatExtMaiz2 = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        calendarioRecep3 = new datechooser.beans.DateChooserCombo();
        jLabel56 = new javax.swing.JLabel();
        txtMuestraLab3 = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        txtCerealMuestra3 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        labelPesoH3 = new javax.swing.JLabel();
        labelHumedad3 = new javax.swing.JLabel();
        labelGQuebrados3 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        txtMatExtTrigo3 = new javax.swing.JTextField();
        txtPHect3 = new javax.swing.JTextField();
        txtHumedadLab3 = new javax.swing.JTextField();
        txtImpurezasLab3 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        txtFEnvio3 = new javax.swing.JTextField();
        txtHumedadSoja3 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        txtPesoLab3 = new javax.swing.JTextField();
        txtPesoMensis3 = new javax.swing.JTextField();
        txtHumedadMensis3 = new javax.swing.JTextField();
        txtImpurezasMensis3 = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        labelMatExt3 = new javax.swing.JLabel();
        labelGDaniados3 = new javax.swing.JLabel();
        txtGDaniados3 = new javax.swing.JTextField();
        txtGQuebrados3 = new javax.swing.JTextField();
        labelGranosV3 = new javax.swing.JLabel();
        txtHumedadMaiz3 = new javax.swing.JTextField();
        txtHumedadTrigo3 = new javax.swing.JTextField();
        txtMatExtSoja3 = new javax.swing.JTextField();
        txtMatExtMaiz3 = new javax.swing.JTextField();
        txtGDaniadosSojaN = new javax.swing.JTextField();
        txtGDaniadosMaizN = new javax.swing.JTextField();
        txtGQuebradosMaizN = new javax.swing.JTextField();
        txtGQuebradosTrigoN = new javax.swing.JTextField();
        txtGranosVerdesN = new javax.swing.JTextField();
        txtPHectMaizN = new javax.swing.JTextField();
        labelPorcentaje = new javax.swing.JLabel();
        labelPorcentaje2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtHumedadLab = new javax.swing.JTextField();
        txtMatExtLab = new javax.swing.JTextField();
        txtGDaniadosLab = new javax.swing.JTextField();
        txtGQuebradosLab = new javax.swing.JTextField();
        txtPHectLab = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        txtResultadoMuestra = new javax.swing.JTextField();
        btnResultado = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Resultados Análisis");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Fecha");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Hora");

        labelusuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelusuario.setText("Usuario");

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UsuarioLogueado.png"))); // NOI18N

        btnAceptarViaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        btnAceptarViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarViajeActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Muestras Enviadas por", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel5.setLayout(null);

        ckFecha.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        ckFecha.setText("Fecha Envío");
        ckFecha.setFocusPainted(false);
        jPanel5.add(ckFecha);
        ckFecha.setBounds(20, 40, 90, 22);

        ckNumMuestra.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        ckNumMuestra.setText("Número Muestra");
        ckNumMuestra.setFocusPainted(false);
        jPanel5.add(ckNumMuestra);
        ckNumMuestra.setBounds(20, 60, 110, 22);

        ckProductor.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        ckProductor.setText("Productor");
        ckProductor.setFocusPainted(false);
        jPanel5.add(ckProductor);
        ckProductor.setBounds(20, 80, 90, 22);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha Envío", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        jPanel10.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Desde");
        jPanel10.add(jLabel7);
        jLabel7.setBounds(10, 20, 60, 20);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Hasta");
        jPanel10.add(jLabel10);
        jLabel10.setBounds(10, 50, 60, 20);
        jPanel10.add(calendarioHViaje);
        calendarioHViaje.setBounds(50, 50, 90, 20);
        jPanel10.add(calendarioDViaje);
        calendarioDViaje.setBounds(50, 20, 90, 20);

        jPanel5.add(jPanel10);
        jPanel10.setBounds(160, 30, 170, 90);

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nº Muestra", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        jPanel12.setLayout(null);
        jPanel12.add(txtNumMuestra);
        txtNumMuestra.setBounds(100, 40, 80, 20);

        cmbNroMuestra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ">=", "<=", "=" }));
        jPanel12.add(cmbNroMuestra);
        cmbNroMuestra.setBounds(10, 40, 80, 20);

        jPanel5.add(jPanel12);
        jPanel12.setBounds(340, 30, 200, 90);

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Productor", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        jPanel13.setLayout(null);

        jPanel13.add(cmbProductor);
        cmbProductor.setBounds(20, 40, 200, 20);

        jPanel5.add(jPanel13);
        jPanel13.setBounds(550, 30, 250, 90);

        btnBuscarViaje.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnBuscarViaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        btnBuscarViaje.setText("Buscar");
        btnBuscarViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarViajeActionPerformed(evt);
            }
        });
        jPanel5.add(btnBuscarViaje);
        btnBuscarViaje.setBounds(380, 130, 100, 30);

        btnAceptarTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_mas.png"))); // NOI18N
        btnAceptarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarTodosActionPerformed(evt);
            }
        });
        jPanel5.add(btnAceptarTodos);
        btnAceptarTodos.setBounds(30, 110, 30, 30);

        btnBorrarTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete.png"))); // NOI18N
        btnBorrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarTodosActionPerformed(evt);
            }
        });
        jPanel5.add(btnBorrarTodos);
        btnBorrarTodos.setBounds(60, 110, 30, 30);

        tblMuestras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha Envío", "Nº Muestra", "Productor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMuestras);

        jPanel8.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Productor");
        jPanel8.add(jLabel6);
        jLabel6.setBounds(580, 10, 90, 20);

        jLabel41.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel41.setText("Establecimiento");
        jPanel8.add(jLabel41);
        jLabel41.setBounds(240, 40, 130, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Enviado por");
        jPanel8.add(jLabel8);
        jLabel8.setBounds(570, 40, 90, 20);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Fecha Envío");
        jPanel8.add(jLabel9);
        jLabel9.setBounds(20, 10, 100, 20);

        jLabel43.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel43.setText("Nº Muestra");
        jPanel8.add(jLabel43);
        jLabel43.setBounds(260, 10, 100, 20);

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("Cereal");
        jPanel8.add(jLabel13);
        jLabel13.setBounds(50, 40, 70, 20);
        jPanel8.add(txtProductor);
        txtProductor.setBounds(640, 10, 200, 20);
        jPanel8.add(txtMuestra);
        txtMuestra.setBounds(330, 10, 100, 20);
        jPanel8.add(txtEstablecimiento);
        txtEstablecimiento.setBounds(640, 40, 210, 20);
        jPanel8.add(txtCereal);
        txtCereal.setBounds(90, 40, 100, 20);
        jPanel8.add(txtFechaEnvio);
        txtFechaEnvio.setBounds(90, 10, 100, 20);
        jPanel8.add(txtEnviadoPor);
        txtEnviadoPor.setBounds(330, 40, 210, 20);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 863, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAceptarViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(204, 204, 204))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnAceptarViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(338, 338, 338))
        );

        jTabbedPane1.addTab("Datos Muestra", jPanel2);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Laboratorio", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        jPanel7.setLayout(null);

        jLabel26.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel26.setText("Especialidad");
        jPanel7.add(jLabel26);
        jLabel26.setBounds(30, 30, 110, 20);

        jLabel27.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel27.setText("Laboratorio");
        jPanel7.add(jLabel27);
        jLabel27.setBounds(400, 30, 110, 20);

        jLabel28.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel28.setText("Domicilio");
        jPanel7.add(jLabel28);
        jLabel28.setBounds(50, 60, 70, 20);
        jPanel7.add(txtDomicilioLab);
        txtDomicilioLab.setBounds(110, 60, 250, 20);

        jLabel29.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel29.setText("Localidad");
        jPanel7.add(jLabel29);
        jLabel29.setBounds(410, 60, 80, 20);
        jPanel7.add(txtLocalidadLab);
        txtLocalidadLab.setBounds(470, 60, 250, 20);

        jLabel30.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel30.setText("Provincia");
        jPanel7.add(jLabel30);
        jLabel30.setBounds(50, 90, 60, 20);
        jPanel7.add(txtTelefonoLab);
        txtTelefonoLab.setBounds(470, 90, 250, 20);

        jLabel31.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel31.setText("Teléfono");
        jPanel7.add(jLabel31);
        jLabel31.setBounds(410, 90, 110, 20);
        jPanel7.add(txtProvinciaLab);
        txtProvinciaLab.setBounds(110, 90, 250, 20);
        jPanel7.add(txtEspecialidad);
        txtEspecialidad.setBounds(110, 30, 250, 20);
        jPanel7.add(txtLaboratorio);
        txtLaboratorio.setBounds(470, 30, 250, 20);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultados Analisis", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        jPanel6.setLayout(null);

        jLabel24.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel24.setText("Fecha Envío");
        jPanel6.add(jLabel24);
        jLabel24.setBounds(330, 30, 100, 20);

        jLabel25.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel25.setText("Fecha Recepción");
        jPanel6.add(jLabel25);
        jLabel25.setBounds(580, 30, 120, 20);
        jPanel6.add(calendarioRecep);
        calendarioRecep.setBounds(680, 30, 110, 20);

        jLabel32.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel32.setText("Muestra Nº");
        jPanel6.add(jLabel32);
        jLabel32.setBounds(60, 30, 100, 20);
        jPanel6.add(txtMuestraLab);
        txtMuestraLab.setBounds(130, 30, 100, 20);

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cereal", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        jPanel11.setLayout(null);
        jPanel11.add(txtCerealMuestra);
        txtCerealMuestra.setBounds(150, 20, 140, 20);

        jPanel6.add(jPanel11);
        jPanel11.setBounds(240, 70, 440, 50);
        jPanel6.add(jSeparator1);
        jSeparator1.setBounds(30, 60, 820, 10);

        labelPesoH.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelPesoH.setText("Peso Hectolitrico");
        jPanel6.add(labelPesoH);
        labelPesoH.setBounds(80, 280, 120, 20);

        labelHumedad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelHumedad.setText("Humedad");
        jPanel6.add(labelHumedad);
        labelHumedad.setBounds(80, 160, 130, 20);

        labelGQuebrados.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelGQuebrados.setText("Granos Quebrados");
        jPanel6.add(labelGQuebrados);
        labelGQuebrados.setBounds(80, 250, 140, 20);

        jLabel39.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel39.setText("Valores Mensis");
        jPanel6.add(jLabel39);
        jLabel39.setBounds(590, 130, 100, 20);

        jLabel40.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel40.setText("Característica");
        jPanel6.add(jLabel40);
        jLabel40.setBounds(80, 130, 90, 20);
        jPanel6.add(txtMatExtTrigoN);
        txtMatExtTrigoN.setBounds(280, 190, 70, 20);
        jPanel6.add(txtPHectTrigoN);
        txtPHectTrigoN.setBounds(280, 280, 70, 20);
        jPanel6.add(jSeparator2);
        jSeparator2.setBounds(30, 150, 820, 10);
        jPanel6.add(txtFEnvio);
        txtFEnvio.setBounds(400, 30, 100, 20);
        jPanel6.add(txtHumedadSojaN);
        txtHumedadSojaN.setBounds(280, 160, 70, 20);

        jLabel42.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel42.setText("Valores Laboratorio");
        jPanel6.add(jLabel42);
        jLabel42.setBounds(430, 130, 120, 20);
        jPanel6.add(txtHumedadMensis);
        txtHumedadMensis.setBounds(600, 160, 70, 20);
        jPanel6.add(txtMatExtMensis);
        txtMatExtMensis.setBounds(600, 190, 70, 20);

        jLabel44.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel44.setText("Valores Normales");
        jPanel6.add(jLabel44);
        jLabel44.setBounds(270, 130, 110, 20);

        labelMatExt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelMatExt.setText("Materias Extrañas");
        jPanel6.add(labelMatExt);
        labelMatExt.setBounds(80, 190, 140, 20);

        labelGDaniados.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelGDaniados.setText("Granos Dañados");
        jPanel6.add(labelGDaniados);
        labelGDaniados.setBounds(80, 220, 140, 20);
        jPanel6.add(txtGDaniadosTrigoN);
        txtGDaniadosTrigoN.setBounds(280, 220, 70, 20);
        jPanel6.add(txtGQuebradosSojaN);
        txtGQuebradosSojaN.setBounds(280, 250, 70, 20);

        labelGranosV.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelGranosV.setText("Granos Verdes");
        jPanel6.add(labelGranosV);
        labelGranosV.setBounds(80, 280, 120, 20);
        jPanel6.add(txtHumedadMaizN);
        txtHumedadMaizN.setBounds(280, 160, 70, 20);
        jPanel6.add(txtHumedadTrigoN);
        txtHumedadTrigoN.setBounds(280, 160, 70, 20);
        jPanel6.add(txtMatExtSojaN);
        txtMatExtSojaN.setBounds(280, 190, 70, 20);
        jPanel6.add(txtMatExtMaizN);
        txtMatExtMaizN.setBounds(280, 190, 70, 20);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultados Analisis", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        jPanel9.setLayout(null);

        jLabel33.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel33.setText("Fecha Envío");
        jPanel9.add(jLabel33);
        jLabel33.setBounds(330, 30, 100, 20);

        jLabel34.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel34.setText("Fecha Recepción");
        jPanel9.add(jLabel34);
        jLabel34.setBounds(580, 30, 120, 20);
        jPanel9.add(calendarioRecep1);
        calendarioRecep1.setBounds(680, 30, 110, 20);

        jLabel35.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel35.setText("Muestra Nº");
        jPanel9.add(jLabel35);
        jLabel35.setBounds(60, 30, 100, 20);
        jPanel9.add(txtMuestraLab1);
        txtMuestraLab1.setBounds(130, 30, 100, 20);

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cereal", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        jPanel14.setLayout(null);
        jPanel14.add(txtCerealMuestra1);
        txtCerealMuestra1.setBounds(150, 20, 140, 20);

        jPanel9.add(jPanel14);
        jPanel14.setBounds(240, 70, 440, 50);
        jPanel9.add(jSeparator3);
        jSeparator3.setBounds(30, 60, 820, 10);

        labelPesoH1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelPesoH1.setText("Peso Hectolitrico");
        jPanel9.add(labelPesoH1);
        labelPesoH1.setBounds(80, 280, 120, 20);

        labelHumedad1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelHumedad1.setText("Humedad");
        jPanel9.add(labelHumedad1);
        labelHumedad1.setBounds(80, 160, 130, 20);

        labelGQuebrados1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelGQuebrados1.setText("Granos Quebrados");
        jPanel9.add(labelGQuebrados1);
        labelGQuebrados1.setBounds(80, 250, 140, 20);

        jLabel45.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel45.setText("Valores Mensis");
        jPanel9.add(jLabel45);
        jLabel45.setBounds(670, 130, 90, 20);

        jLabel46.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel46.setText("Característica");
        jPanel9.add(jLabel46);
        jLabel46.setBounds(80, 130, 90, 20);
        jPanel9.add(txtMatExtTrigo1);
        txtMatExtTrigo1.setBounds(270, 190, 70, 20);
        jPanel9.add(txtPHect1);
        txtPHect1.setBounds(270, 280, 70, 20);
        jPanel9.add(txtHumedadLab1);
        txtHumedadLab1.setBounds(460, 190, 100, 20);
        jPanel9.add(txtImpurezasLab1);
        txtImpurezasLab1.setBounds(460, 220, 100, 20);
        jPanel9.add(jSeparator4);
        jSeparator4.setBounds(30, 150, 820, 10);
        jPanel9.add(txtFEnvio1);
        txtFEnvio1.setBounds(400, 30, 100, 20);
        jPanel9.add(txtHumedadSoja1);
        txtHumedadSoja1.setBounds(270, 160, 70, 20);

        jLabel47.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel47.setText("Valores Laboratorio");
        jPanel9.add(jLabel47);
        jLabel47.setBounds(460, 130, 120, 20);
        jPanel9.add(txtPesoLab1);
        txtPesoLab1.setBounds(460, 160, 100, 20);
        jPanel9.add(txtPesoMensis1);
        txtPesoMensis1.setBounds(660, 160, 100, 20);
        jPanel9.add(txtHumedadMensis1);
        txtHumedadMensis1.setBounds(660, 190, 100, 20);
        jPanel9.add(txtImpurezasMensis1);
        txtImpurezasMensis1.setBounds(660, 220, 100, 20);

        jLabel49.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel49.setText("Valores Normales");
        jPanel9.add(jLabel49);
        jLabel49.setBounds(270, 130, 110, 20);

        labelMatExt1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelMatExt1.setText("Materias Extrañas");
        jPanel9.add(labelMatExt1);
        labelMatExt1.setBounds(80, 190, 140, 20);

        labelGDaniados1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelGDaniados1.setText("Granos Dañados");
        jPanel9.add(labelGDaniados1);
        labelGDaniados1.setBounds(80, 220, 140, 20);
        jPanel9.add(txtGDaniados1);
        txtGDaniados1.setBounds(270, 220, 70, 20);
        jPanel9.add(txtGQuebrados1);
        txtGQuebrados1.setBounds(270, 250, 70, 20);

        labelGranosV1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelGranosV1.setText("Granos Verdes");
        jPanel9.add(labelGranosV1);
        labelGranosV1.setBounds(80, 280, 120, 20);
        jPanel9.add(txtHumedadMaiz1);
        txtHumedadMaiz1.setBounds(270, 160, 70, 20);
        jPanel9.add(txtHumedadTrigo1);
        txtHumedadTrigo1.setBounds(270, 160, 70, 20);
        jPanel9.add(txtMatExtSoja1);
        txtMatExtSoja1.setBounds(270, 190, 70, 20);
        jPanel9.add(txtMatExtMaiz1);
        txtMatExtMaiz1.setBounds(270, 190, 70, 20);

        jPanel6.add(jPanel9);
        jPanel9.setBounds(0, 0, 0, 0);

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultados Analisis", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        jPanel15.setLayout(null);

        jLabel36.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel36.setText("Fecha Envío");
        jPanel15.add(jLabel36);
        jLabel36.setBounds(330, 30, 100, 20);

        jLabel37.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel37.setText("Fecha Recepción");
        jPanel15.add(jLabel37);
        jLabel37.setBounds(580, 30, 120, 20);
        jPanel15.add(calendarioRecep2);
        calendarioRecep2.setBounds(680, 30, 110, 20);

        jLabel38.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel38.setText("Muestra Nº");
        jPanel15.add(jLabel38);
        jLabel38.setBounds(60, 30, 100, 20);
        jPanel15.add(txtMuestraLab2);
        txtMuestraLab2.setBounds(130, 30, 100, 20);

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cereal", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        jPanel16.setLayout(null);
        jPanel16.add(txtCerealMuestra2);
        txtCerealMuestra2.setBounds(150, 20, 140, 20);

        jPanel15.add(jPanel16);
        jPanel16.setBounds(240, 70, 440, 50);
        jPanel15.add(jSeparator5);
        jSeparator5.setBounds(30, 60, 820, 10);

        labelPesoH2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelPesoH2.setText("Peso Hectolitrico");
        jPanel15.add(labelPesoH2);
        labelPesoH2.setBounds(80, 280, 120, 20);

        labelHumedad2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelHumedad2.setText("Humedad");
        jPanel15.add(labelHumedad2);
        labelHumedad2.setBounds(80, 160, 130, 20);

        labelGQuebrados2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelGQuebrados2.setText("Granos Quebrados");
        jPanel15.add(labelGQuebrados2);
        labelGQuebrados2.setBounds(80, 250, 140, 20);

        jLabel50.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel50.setText("Valores Mensis");
        jPanel15.add(jLabel50);
        jLabel50.setBounds(670, 130, 90, 20);

        jLabel51.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel51.setText("Característica");
        jPanel15.add(jLabel51);
        jLabel51.setBounds(80, 130, 90, 20);
        jPanel15.add(txtMatExtTrigo2);
        txtMatExtTrigo2.setBounds(270, 190, 70, 20);
        jPanel15.add(txtPHect2);
        txtPHect2.setBounds(270, 280, 70, 20);
        jPanel15.add(txtHumedadLab2);
        txtHumedadLab2.setBounds(460, 190, 100, 20);
        jPanel15.add(txtImpurezasLab2);
        txtImpurezasLab2.setBounds(460, 220, 100, 20);
        jPanel15.add(jSeparator6);
        jSeparator6.setBounds(30, 150, 820, 10);
        jPanel15.add(txtFEnvio2);
        txtFEnvio2.setBounds(400, 30, 100, 20);
        jPanel15.add(txtHumedadSoja2);
        txtHumedadSoja2.setBounds(270, 160, 70, 20);

        jLabel52.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel52.setText("Valores Laboratorio");
        jPanel15.add(jLabel52);
        jLabel52.setBounds(460, 130, 120, 20);
        jPanel15.add(txtPesoLab2);
        txtPesoLab2.setBounds(460, 160, 100, 20);
        jPanel15.add(txtPesoMensis2);
        txtPesoMensis2.setBounds(660, 160, 100, 20);
        jPanel15.add(txtHumedadMensis2);
        txtHumedadMensis2.setBounds(660, 190, 100, 20);
        jPanel15.add(txtImpurezasMensis2);
        txtImpurezasMensis2.setBounds(660, 220, 100, 20);

        jLabel53.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel53.setText("Valores Normales");
        jPanel15.add(jLabel53);
        jLabel53.setBounds(270, 130, 110, 20);

        labelMatExt2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelMatExt2.setText("Materias Extrañas");
        jPanel15.add(labelMatExt2);
        labelMatExt2.setBounds(80, 190, 140, 20);

        labelGDaniados2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelGDaniados2.setText("Granos Dañados");
        jPanel15.add(labelGDaniados2);
        labelGDaniados2.setBounds(80, 220, 140, 20);
        jPanel15.add(txtGDaniados2);
        txtGDaniados2.setBounds(270, 220, 70, 20);
        jPanel15.add(txtGQuebrados2);
        txtGQuebrados2.setBounds(270, 250, 70, 20);

        labelGranosV2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelGranosV2.setText("Granos Verdes");
        jPanel15.add(labelGranosV2);
        labelGranosV2.setBounds(80, 280, 120, 20);
        jPanel15.add(txtHumedadMaiz2);
        txtHumedadMaiz2.setBounds(270, 160, 70, 20);
        jPanel15.add(txtHumedadTrigo2);
        txtHumedadTrigo2.setBounds(270, 160, 70, 20);
        jPanel15.add(txtMatExtSoja2);
        txtMatExtSoja2.setBounds(270, 190, 70, 20);
        jPanel15.add(txtMatExtMaiz2);
        txtMatExtMaiz2.setBounds(270, 190, 70, 20);

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultados Analisis", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        jPanel17.setLayout(null);

        jLabel54.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel54.setText("Fecha Envío");
        jPanel17.add(jLabel54);
        jLabel54.setBounds(330, 30, 100, 20);

        jLabel55.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel55.setText("Fecha Recepción");
        jPanel17.add(jLabel55);
        jLabel55.setBounds(580, 30, 120, 20);
        jPanel17.add(calendarioRecep3);
        calendarioRecep3.setBounds(680, 30, 110, 20);

        jLabel56.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel56.setText("Muestra Nº");
        jPanel17.add(jLabel56);
        jLabel56.setBounds(60, 30, 100, 20);
        jPanel17.add(txtMuestraLab3);
        txtMuestraLab3.setBounds(130, 30, 100, 20);

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cereal", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        jPanel18.setLayout(null);
        jPanel18.add(txtCerealMuestra3);
        txtCerealMuestra3.setBounds(150, 20, 140, 20);

        jPanel17.add(jPanel18);
        jPanel18.setBounds(240, 70, 440, 50);
        jPanel17.add(jSeparator7);
        jSeparator7.setBounds(30, 60, 820, 10);

        labelPesoH3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelPesoH3.setText("Peso Hectolitrico");
        jPanel17.add(labelPesoH3);
        labelPesoH3.setBounds(80, 280, 120, 20);

        labelHumedad3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelHumedad3.setText("Humedad");
        jPanel17.add(labelHumedad3);
        labelHumedad3.setBounds(80, 160, 130, 20);

        labelGQuebrados3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelGQuebrados3.setText("Granos Quebrados");
        jPanel17.add(labelGQuebrados3);
        labelGQuebrados3.setBounds(80, 250, 140, 20);

        jLabel57.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel57.setText("Valores Mensis");
        jPanel17.add(jLabel57);
        jLabel57.setBounds(670, 130, 90, 20);

        jLabel58.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel58.setText("Característica");
        jPanel17.add(jLabel58);
        jLabel58.setBounds(80, 130, 90, 20);
        jPanel17.add(txtMatExtTrigo3);
        txtMatExtTrigo3.setBounds(270, 190, 70, 20);
        jPanel17.add(txtPHect3);
        txtPHect3.setBounds(270, 280, 70, 20);
        jPanel17.add(txtHumedadLab3);
        txtHumedadLab3.setBounds(460, 190, 100, 20);
        jPanel17.add(txtImpurezasLab3);
        txtImpurezasLab3.setBounds(460, 220, 100, 20);
        jPanel17.add(jSeparator8);
        jSeparator8.setBounds(30, 150, 820, 10);
        jPanel17.add(txtFEnvio3);
        txtFEnvio3.setBounds(400, 30, 100, 20);
        jPanel17.add(txtHumedadSoja3);
        txtHumedadSoja3.setBounds(270, 160, 70, 20);

        jLabel59.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel59.setText("Valores Laboratorio");
        jPanel17.add(jLabel59);
        jLabel59.setBounds(460, 130, 120, 20);
        jPanel17.add(txtPesoLab3);
        txtPesoLab3.setBounds(460, 160, 100, 20);
        jPanel17.add(txtPesoMensis3);
        txtPesoMensis3.setBounds(660, 160, 100, 20);
        jPanel17.add(txtHumedadMensis3);
        txtHumedadMensis3.setBounds(660, 190, 100, 20);
        jPanel17.add(txtImpurezasMensis3);
        txtImpurezasMensis3.setBounds(660, 220, 100, 20);

        jLabel60.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel60.setText("Valores Normales");
        jPanel17.add(jLabel60);
        jLabel60.setBounds(270, 130, 110, 20);

        labelMatExt3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelMatExt3.setText("Materias Extrañas");
        jPanel17.add(labelMatExt3);
        labelMatExt3.setBounds(80, 190, 140, 20);

        labelGDaniados3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelGDaniados3.setText("Granos Dañados");
        jPanel17.add(labelGDaniados3);
        labelGDaniados3.setBounds(80, 220, 140, 20);
        jPanel17.add(txtGDaniados3);
        txtGDaniados3.setBounds(270, 220, 70, 20);
        jPanel17.add(txtGQuebrados3);
        txtGQuebrados3.setBounds(270, 250, 70, 20);

        labelGranosV3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelGranosV3.setText("Granos Verdes");
        jPanel17.add(labelGranosV3);
        labelGranosV3.setBounds(80, 280, 120, 20);
        jPanel17.add(txtHumedadMaiz3);
        txtHumedadMaiz3.setBounds(270, 160, 70, 20);
        jPanel17.add(txtHumedadTrigo3);
        txtHumedadTrigo3.setBounds(270, 160, 70, 20);
        jPanel17.add(txtMatExtSoja3);
        txtMatExtSoja3.setBounds(270, 190, 70, 20);
        jPanel17.add(txtMatExtMaiz3);
        txtMatExtMaiz3.setBounds(270, 190, 70, 20);

        jPanel15.add(jPanel17);
        jPanel17.setBounds(0, 0, 0, 0);

        jPanel6.add(jPanel15);
        jPanel15.setBounds(0, 0, 0, 0);
        jPanel6.add(txtGDaniadosSojaN);
        txtGDaniadosSojaN.setBounds(280, 220, 70, 20);
        jPanel6.add(txtGDaniadosMaizN);
        txtGDaniadosMaizN.setBounds(280, 220, 70, 20);
        jPanel6.add(txtGQuebradosMaizN);
        txtGQuebradosMaizN.setBounds(280, 250, 70, 20);
        jPanel6.add(txtGQuebradosTrigoN);
        txtGQuebradosTrigoN.setBounds(280, 250, 70, 20);
        jPanel6.add(txtGranosVerdesN);
        txtGranosVerdesN.setBounds(280, 280, 70, 20);
        jPanel6.add(txtPHectMaizN);
        txtPHectMaizN.setBounds(280, 280, 70, 20);

        labelPorcentaje.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelPorcentaje.setText("%");
        jPanel6.add(labelPorcentaje);
        labelPorcentaje.setBounds(350, 280, 40, 20);

        labelPorcentaje2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelPorcentaje2.setText("%");
        jPanel6.add(labelPorcentaje2);
        labelPorcentaje2.setBounds(520, 280, 40, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("%");
        jPanel6.add(jLabel5);
        jLabel5.setBounds(350, 190, 40, 20);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("%");
        jPanel6.add(jLabel11);
        jLabel11.setBounds(350, 220, 40, 20);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("%");
        jPanel6.add(jLabel12);
        jLabel12.setBounds(350, 250, 40, 20);
        jPanel6.add(txtHumedadLab);
        txtHumedadLab.setBounds(450, 160, 70, 20);
        jPanel6.add(txtMatExtLab);
        txtMatExtLab.setBounds(450, 190, 70, 20);
        jPanel6.add(txtGDaniadosLab);
        txtGDaniadosLab.setBounds(450, 220, 70, 20);
        jPanel6.add(txtGQuebradosLab);
        txtGQuebradosLab.setBounds(450, 250, 70, 20);
        jPanel6.add(txtPHectLab);
        txtPHectLab.setBounds(450, 280, 70, 20);

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setText("%");
        jPanel6.add(jLabel14);
        jLabel14.setBounds(350, 160, 40, 20);

        jLabel15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel15.setText("%");
        jPanel6.add(jLabel15);
        jLabel15.setBounds(670, 190, 40, 20);

        jLabel16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel16.setText("%");
        jPanel6.add(jLabel16);
        jLabel16.setBounds(520, 190, 40, 20);

        jLabel17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel17.setText("%");
        jPanel6.add(jLabel17);
        jLabel17.setBounds(520, 220, 40, 20);

        jLabel18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel18.setText("%");
        jPanel6.add(jLabel18);
        jLabel18.setBounds(520, 250, 40, 20);

        jLabel19.setText("No se calcula");
        jPanel6.add(jLabel19);
        jLabel19.setBounds(600, 280, 70, 20);

        jLabel20.setText("No se calcula");
        jPanel6.add(jLabel20);
        jLabel20.setBounds(600, 250, 70, 20);

        jLabel21.setText("No se calcula");
        jPanel6.add(jLabel21);
        jLabel21.setBounds(600, 220, 70, 20);

        jLabel22.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel22.setText("%");
        jPanel6.add(jLabel22);
        jLabel22.setBounds(520, 160, 40, 20);

        jLabel23.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel23.setText("%");
        jPanel6.add(jLabel23);
        jLabel23.setBounds(670, 160, 40, 20);

        jLabel61.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel61.setText("Resultado Análisis: ");
        jPanel6.add(jLabel61);
        jLabel61.setBounds(80, 310, 150, 20);
        jPanel6.add(txtResultadoMuestra);
        txtResultadoMuestra.setBounds(280, 310, 110, 20);

        btnResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calculadora2.png"))); // NOI18N
        btnResultado.setText("Resultado");
        btnResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoActionPerformed(evt);
            }
        });
        jPanel6.add(btnResultado);
        btnResultado.setBounds(720, 230, 110, 30);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 81, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Datos Análisis", jPanel3);

        btnNuevo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icononuevo.PNG"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelusuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelusuario)))
                    .addComponent(jLabel48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarTodosActionPerformed
         if (ckFecha.isSelected()) {
            calendarioDViaje.setEnabled(true);
            calendarioHViaje.setEnabled(true);
        }
      
         if (ckNumMuestra.isSelected()) {
           cmbNroMuestra.setEnabled(true);  
           txtNumMuestra.setEnabled(true);
        }
         if (ckProductor.isSelected()) {
            cmbProductor.setEnabled(true);
        }
    
    }//GEN-LAST:event_btnAceptarTodosActionPerformed

    private void btnBorrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarTodosActionPerformed
        ckFecha.setSelected(false);
        ckNumMuestra.setSelected(false);
        ckProductor.setSelected(false);
        calendarioDViaje.setEnabled(false);
        calendarioHViaje.setEnabled(false);
        cmbNroMuestra.setEnabled(false);
        txtNumMuestra.setEnabled(false);
        cmbProductor.setEnabled(false);
       
    }//GEN-LAST:event_btnBorrarTodosActionPerformed

    private void btnBuscarViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarViajeActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha1 = sdf.parse(calendarioDViaje.getText(), new ParsePosition(0));
        Date fecha3 = sdf.parse(calendarioHViaje.getText(), new ParsePosition(0));
        SimpleDateFormat sdfguion = new SimpleDateFormat("dd/MM/yy");
        DefaultTableModel modeloT = (DefaultTableModel) tblMuestras.getModel();
        
        if(fecha1.before(fecha3)|| calendarioDViaje.isEnabled()==false || fecha1.equals(fecha3)){
        
        //FECHA
        if(calendarioDViaje.isEnabled() && calendarioHViaje.isEnabled() && txtNumMuestra.isEnabled()==false && cmbProductor.isEnabled()==false){
         Iterator ite = gestorH.listarClase(MuestraTomada.class).iterator();
         while(ite.hasNext()){
             MuestraTomada d = (MuestraTomada) ite.next();
             int bandera = gestorE.buscarObjeto(tblMuestras, d);
             Date fecha2=null;
                    try {
                    fecha2 = sdf.parse(d.getFechaEnvio());
                    } catch (ParseException ex) {
                    Logger.getLogger(frmRegistrarResultadosLab.class.getName()).log(Level.SEVERE, null, ex);
                    }
                 //comparo el rango de fechas
                  if ((bandera==0) && (fecha2.after(fecha1)) && (fecha2.before(fecha3)) || fecha2.equals(fecha3) || fecha2.equals(fecha1)) {
                  //Guardo el objeto orden en la tabla
                  gestorE.cargarTabla(tblMuestras, d);
                  }
         }        
        }
        //PRODUCTOR
        if(calendarioDViaje.isEnabled()==false && calendarioHViaje.isEnabled()==false && txtNumMuestra.isEnabled()==false && cmbProductor.isEnabled()){
         Iterator ite = gestorH.listarClase(MuestraTomada.class).iterator();
         while(ite.hasNext()){
             MuestraTomada d = (MuestraTomada) ite.next();
             int bandera = gestorE.buscarObjeto(tblMuestras, d);
             Date fecha2=null;
                    try {
                    fecha2 = sdf.parse(d.getFechaEnvio());
                    } catch (ParseException ex) {
                    Logger.getLogger(frmRegistrarResultadosLab.class.getName()).log(Level.SEVERE, null, ex);
                    }
                  if ((bandera==0) && (d.getDescarga().getProductor().getNombre().equalsIgnoreCase(cmbProductor.getSelectedItem().toString()))) {
                  //Guardo el objeto orden en la tabla
                  gestorE.cargarTabla(tblMuestras, d);
                  }
             }
         }        
        
       
        //NRO MUESTRA
        if(calendarioDViaje.isEnabled()==false && calendarioHViaje.isEnabled()==false && txtNumMuestra.isEnabled() && cmbProductor.isEnabled()==false){
         Iterator ite = gestorH.listarClase(MuestraTomada.class).iterator();
         while(ite.hasNext()){
             MuestraTomada d = (MuestraTomada) ite.next();
             int bandera = gestorE.buscarObjeto(tblMuestras, d);
             if(d.getFechaEnvio() != null){
             Date fecha2 = sdf.parse(d.getFechaEnvio(), new ParsePosition(0));
             System.out.println(fecha2);
                  if(cmbNroMuestra.getSelectedItem() == ">="){
                  if ((bandera==0) &&  d.getNumeroMuestra() >= Long.parseLong(txtNumMuestra.getText())) {
                    gestorE.cargarTabla(tblMuestras, d);
                  }
                  }
                  if(cmbNroMuestra.getSelectedItem() == "<="){
                  if ((bandera==0) && d.getNumeroMuestra() <= Long.parseLong(txtNumMuestra.getText())) {
                    gestorE.cargarTabla(tblMuestras, d);
                  }
                  }
                  if(cmbNroMuestra.getSelectedItem() == "="){
                  if ((bandera==0) && d.getNumeroMuestra() == Long.parseLong(txtNumMuestra.getText())) {
                    gestorE.cargarTabla(tblMuestras, d);
                  }
                  }
             }        
        }
        }
        
         //FECHA - PRODUCTOR
        if(calendarioDViaje.isEnabled() && calendarioHViaje.isEnabled() && txtNumMuestra.isEnabled()==false && cmbProductor.isEnabled()){
         Iterator ite = gestorH.listarClase(MuestraTomada.class).iterator();
         while(ite.hasNext()){
              MuestraTomada d = (MuestraTomada) ite.next();
             int bandera = gestorE.buscarObjeto(tblMuestras, d);
             Date fecha2=null;
                    try {
                    fecha2 = sdf.parse(d.getFechaEnvio());
                    } catch (ParseException ex) {
                    Logger.getLogger(frmRegistrarResultadosLab.class.getName()).log(Level.SEVERE, null, ex);
                    }
                  //comparo el rango de fechas
                  if ((bandera==0) && (fecha2.after(fecha1)) && (fecha2.before(fecha3)) && d.getDescarga().getProductor().getNombre().equalsIgnoreCase(cmbProductor.getSelectedItem().toString())) {
                  //Guardo el objeto orden en la tabla
                  gestorE.cargarTabla(tblMuestras, d);
                  }
             }
         }        
        
        
        //FECHA NRO MUESRTRA
        if(calendarioDViaje.isEnabled() && calendarioHViaje.isEnabled() && txtNumMuestra.isEnabled() && cmbProductor.isEnabled()==false){
         Iterator ite = gestorH.listarClase(MuestraTomada.class).iterator();
         while(ite.hasNext()){
             MuestraTomada d = (MuestraTomada) ite.next();
             int bandera = gestorE.buscarObjeto(tblMuestras, d);
             Date fecha2=null;
                    try {
                    fecha2 = sdf.parse(d.getFechaEnvio());
                    } catch (ParseException ex) {
                    Logger.getLogger(frmRegistrarResultadosLab.class.getName()).log(Level.SEVERE, null, ex);
                    }
                  if(cmbNroMuestra.getSelectedItem() == ">="){
                  if ((bandera==0) && d.getNumeroMuestra() >= Long.parseLong(txtNumMuestra.getText()) && (fecha2.after(fecha1)) && (fecha2.before(fecha3))) {
                    gestorE.cargarTabla(tblMuestras, d);
                  }
                  }
                  if(cmbNroMuestra.getSelectedItem() == "<="){
                  if ((bandera==0) && d.getNumeroMuestra() <= Long.parseLong(txtNumMuestra.getText()) && (fecha2.after(fecha1)) && (fecha2.before(fecha3))) {
                    gestorE.cargarTabla(tblMuestras, d);
                  }
                  }
                  if(cmbNroMuestra.getSelectedItem() == "="){
                  if ((bandera==0) && d.getNumeroMuestra() == Long.parseLong(txtNumMuestra.getText()) && (fecha2.after(fecha1)) && (fecha2.before(fecha3))) {
                    gestorE.cargarTabla(tblMuestras, d);
                  }
                  }
             }
         }        
        
        
        //NRO MUESTRA PRODUCTOR
        if(calendarioDViaje.isEnabled()==false && calendarioHViaje.isEnabled()==false && txtNumMuestra.isEnabled() && cmbProductor.isEnabled()){
         Iterator ite = gestorH.listarClase(MuestraTomada.class).iterator();
         while(ite.hasNext()){
             MuestraTomada d = (MuestraTomada) ite.next();
             int bandera = gestorE.buscarObjeto(tblMuestras, d);
             Date fecha2=null;
                    try {
                    fecha2 = sdf.parse(d.getFechaEnvio());
                    } catch (ParseException ex) {
                    Logger.getLogger(frmRegistrarResultadosLab.class.getName()).log(Level.SEVERE, null, ex);
                    }
                  if(cmbNroMuestra.getSelectedItem() == ">="){
                  if ((bandera==0) && d.getNumeroMuestra() >= Long.parseLong(txtNumMuestra.getText()) && d.getDescarga().getProductor().getNombre().equalsIgnoreCase(cmbProductor.getSelectedItem().toString())) {
                    gestorE.cargarTabla(tblMuestras, d);
                  }
                  }
                  if(cmbNroMuestra.getSelectedItem() == "<="){
                  if ((bandera==0) && d.getNumeroMuestra() <= Long.parseLong(txtNumMuestra.getText()) && d.getDescarga().getProductor().getNombre().equalsIgnoreCase(cmbProductor.getSelectedItem().toString())) {
                    gestorE.cargarTabla(tblMuestras, d);
                  }
                  }
                  if(cmbNroMuestra.getSelectedItem() == "="){
                  if ((bandera==0) && d.getNumeroMuestra() == Long.parseLong(txtNumMuestra.getText()) && d.getDescarga().getProductor().getNombre().equalsIgnoreCase(cmbProductor.getSelectedItem().toString())) {
                    gestorE.cargarTabla(tblMuestras, d);
                  }
                  }
             }
         }        
        
        
        //NRO MUESTRA PRODUCTOR FECHA
        if(calendarioDViaje.isEnabled() && calendarioHViaje.isEnabled() && txtNumMuestra.isEnabled() && cmbProductor.isEnabled()){
         Iterator ite = gestorH.listarClase(MuestraTomada.class).iterator();
         while(ite.hasNext()){
             MuestraTomada d = (MuestraTomada) ite.next();
             int bandera = gestorE.buscarObjeto(tblMuestras, d);
             Date fecha2=null;
                    try {
                    fecha2 = sdf.parse(d.getFechaEnvio());
                    } catch (ParseException ex) {
                    Logger.getLogger(frmRegistrarResultadosLab.class.getName()).log(Level.SEVERE, null, ex);
                    }
                  //comparo el rango de fechas
                  if(cmbNroMuestra.getSelectedItem() == ">="){
                  if ((bandera==0)&& (d.getNumeroMuestra() >= Long.parseLong(txtNumMuestra.getText())) && (d.getDescarga().getProductor().getNombre().equalsIgnoreCase(cmbProductor.getSelectedItem().toString())) && ((fecha2.after(fecha1)) && (fecha2.before(fecha3)))) {
                    gestorE.cargarTabla(tblMuestras, d);
                  }
                  }
                  if(cmbNroMuestra.getSelectedItem() == "<="){
                  if ((bandera==0)&& (d.getNumeroMuestra() <= Long.parseLong(txtNumMuestra.getText())) && (d.getDescarga().getProductor().getNombre().equalsIgnoreCase(cmbProductor.getSelectedItem().toString())) && ((fecha2.after(fecha1)) && (fecha2.before(fecha3)))) {
                    gestorE.cargarTabla(tblMuestras, d);
                  }
                  }
                  if(cmbNroMuestra.getSelectedItem() == "="){
                  if ((bandera==0)&& (d.getNumeroMuestra() == Long.parseLong(txtNumMuestra.getText())) && (d.getDescarga().getProductor().getNombre().equalsIgnoreCase(cmbProductor.getSelectedItem().toString())) && ((fecha2.after(fecha1)) && (fecha2.before(fecha3)))) {
                    gestorE.cargarTabla(tblMuestras, d);
                  }
                  }
             }
         }        
        
            
        }
        else{
        JOptionPane.showMessageDialog(null, "Ingrese correctamente el rango de Fechas");
        }
        
    }//GEN-LAST:event_btnBuscarViajeActionPerformed

    private void btnAceptarViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarViajeActionPerformed
   DefaultTableModel modeloTabla = (DefaultTableModel) tblMuestras.getModel();
    int fila = tblMuestras.getSelectedRow();
    txtProductor.setText(modeloTabla.getValueAt(fila,2).toString());
    Iterator ite = gestorH.listarClase(MuestraTomada.class).iterator();
    while(ite.hasNext()){
          MuestraTomada muestra = (MuestraTomada) ite.next();
          if(muestra.getNumeroMuestra()== modeloTabla.getValueAt(fila,1)){
              txtEnviadoPor.setText(muestra.getDescarga().getEstablecimiento().toString());
              txtMuestra.setText(String.valueOf(muestra.getNumeroMuestra()));
              txtCereal.setText(muestra.getDescarga().getCereal().toString());
              txtFechaEnvio.setText(muestra.getFechaEnvio());
              txtEstablecimiento.setText(muestra.getResponsableEnvio());
              txtLaboratorio.setText(muestra.getLaboratorio().toString());
              txtEspecialidad.setText(muestra.getLaboratorio().getEspecialidad().toString());
              txtDomicilioLab.setText(muestra.getLaboratorio().getDomicilio().getCalle().toString());
              txtLocalidadLab.setText(muestra.getLaboratorio().getDomicilio().getBarrio().getLocalidad().toString());
              txtProvinciaLab.setText(muestra.getLaboratorio().getDomicilio().getBarrio().getLocalidad().getDepartamento().getProvincia().toString());
              txtTelefonoLab.setText(muestra.getLaboratorio().getTelefono().toString());
              txtMuestraLab.setText(String.valueOf(muestra.getNumeroMuestra()));
              txtFEnvio.setText(muestra.getFechaEnvio());
              txtCerealMuestra.setText(muestra.getDescarga().getCereal().toString());
              Iterator ite2 = gestorH.listarClase(Mensis.class).iterator();
              while(ite2.hasNext()){
                  Mensis m = (Mensis) ite2.next();
                  if(m.getNumeroMuestra() == muestra.getNumeroMuestra()){
                      txtMatExtMensis.setText(m.getMateriasExt());
                      txtHumedadMensis.setText(m.getHumedad());
                  
                  }
              }
          }
    }
    if(txtCerealMuestra.getText().equalsIgnoreCase("Maiz")){
        labelPesoH.setVisible(true);
        labelGranosV.setVisible(false);
        txtGDaniadosTrigoN.setVisible(false);
        txtGDaniadosMaizN.setVisible(true);
        txtGDaniadosSojaN.setVisible(false);
        txtGQuebradosMaizN.setVisible(true);
        txtGQuebradosSojaN.setVisible(false);
        txtGQuebradosTrigoN.setVisible(false);
        txtHumedadMaizN.setVisible(true);
        txtHumedadSojaN.setVisible(false);
        txtHumedadTrigoN.setVisible(false);
        txtMatExtMaizN.setVisible(true);
        txtMatExtSojaN.setVisible(false);
        txtMatExtTrigoN.setVisible(false);
        txtGranosVerdesN.setVisible(false);
        txtPHectMaizN.setVisible(true);
        txtPHectTrigoN.setVisible(false);
    }
     if(txtCerealMuestra.getText().equalsIgnoreCase("Soja")){
        labelPesoH.setVisible(false);
        labelGranosV.setVisible(true);
        txtGDaniadosTrigoN.setVisible(false);
        txtGDaniadosMaizN.setVisible(false);
        txtGDaniadosSojaN.setVisible(true);
        txtGQuebradosMaizN.setVisible(false);
        txtGQuebradosSojaN.setVisible(true);
        txtGQuebradosTrigoN.setVisible(false);
        txtHumedadMaizN.setVisible(false);
        txtHumedadSojaN.setVisible(true);
        txtHumedadTrigoN.setVisible(false);
        txtMatExtMaizN.setVisible(false);
        txtMatExtSojaN.setVisible(true);
        txtMatExtTrigoN.setVisible(false);
        txtGranosVerdesN.setVisible(true);
        txtPHectMaizN.setVisible(false);
        txtPHectTrigoN.setVisible(false);
    }
      if(txtCerealMuestra.getText().equalsIgnoreCase("Trigo")){
        labelPesoH.setVisible(true);
        labelGranosV.setVisible(false);
        txtGDaniadosTrigoN.setVisible(true);
        txtGDaniadosMaizN.setVisible(false);
        txtGDaniadosSojaN.setVisible(false);
        txtGQuebradosMaizN.setVisible(false);
        txtGQuebradosSojaN.setVisible(false);
        txtGQuebradosTrigoN.setVisible(true);
        txtHumedadMaizN.setVisible(false);
        txtHumedadSojaN.setVisible(false);
        txtHumedadTrigoN.setVisible(true);
        txtMatExtMaizN.setVisible(false);
        txtMatExtSojaN.setVisible(false);
        txtMatExtTrigoN.setVisible(true);
        txtGranosVerdesN.setVisible(false);
        txtPHectMaizN.setVisible(false);
        txtPHectTrigoN.setVisible(true);
    }
    }//GEN-LAST:event_btnAceptarViajeActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       int bandera = 0;
       Iterator ite9 = gestorH.listarClase(MuestraTomada.class).iterator();
       while(ite9.hasNext()){
           MuestraTomada m = (MuestraTomada) ite9.next();
           if(m.getNumeroMuestra() == Long.parseLong(txtMuestra.getText())){
              SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
              Date fecha1 = sdf.parse(m.getFechaEnvio(), new ParsePosition(0)); 
              Date fecha2 = sdf.parse(calendarioRecep.getText(), new ParsePosition(0)); 
              System.out.println("Fecha1" + fecha1);
              System.out.println("Fecha2" + fecha2);
              if(fecha1.before(fecha2) || (fecha1.equals(fecha2)) ){
                  bandera = 1;
              }
           }
       }
        if(bandera == 1) {
        Iterator ite = gestorH.listarClase(CaracteristicasCereal.class).iterator();
        while(ite.hasNext()){
            CaracteristicasCereal caracteristicas = (CaracteristicasCereal) ite.next();
            if(caracteristicas.getNombreCaracteristica().equalsIgnoreCase(labelHumedad.getText())){
                CaracteristicasPorTipoDeCerealPorMuestra car1 = new CaracteristicasPorTipoDeCerealPorMuestra();
                car1.setCaracteristicas(caracteristicas);
                car1.setValor(Double.parseDouble(txtHumedadLab.getText()));
                Iterator ite2 = gestorH.listarClase(MuestraTomada.class).iterator();
                while(ite2.hasNext()){
                    MuestraTomada m = (MuestraTomada) ite2.next();
                    if(m.getNumeroMuestra() == Long.parseLong(txtMuestra.getText())){
                        m.setEstado(2);
                        Iterator ite10 = gestorE.listarClase(Estado.class).iterator();
                        while(ite10.hasNext()){
                        Estado e = (Estado) ite10.next();
                        if(e.getNumeroEstado() == 2){
                        m.setEstadoMuestra(e);
                    }
                    }
                        car1.setMuestra(m);
                        gestorH.actualizarObjeto(m);
                    }
                }
                Iterator ite3 = gestorH.listarClase(TipoCereal.class).iterator();
                while(ite3.hasNext()){
                    TipoCereal t = (TipoCereal) ite3.next();
                    if(t.getNombreCereal().equalsIgnoreCase(txtCereal.getText())){
                        car1.setTipoCereal(t);
                    }
                }
                gestorH.guardarObjeto(car1);
            }
            if(caracteristicas.getNombreCaracteristica().equalsIgnoreCase(labelMatExt.getText())){
                CaracteristicasPorTipoDeCerealPorMuestra car1 = new CaracteristicasPorTipoDeCerealPorMuestra();
                car1.setCaracteristicas(caracteristicas);
                car1.setValor(Double.parseDouble(txtMatExtLab.getText()));
                Iterator ite2 = gestorH.listarClase(MuestraTomada.class).iterator();
                while(ite2.hasNext()){
                    MuestraTomada m = (MuestraTomada) ite2.next();
                    if(m.getNumeroMuestra() == Long.parseLong(txtMuestra.getText())){
                        car1.setMuestra(m);
                    }
                }
                Iterator ite3 = gestorH.listarClase(TipoCereal.class).iterator();
                while(ite3.hasNext()){
                    TipoCereal t = (TipoCereal) ite3.next();
                    if(t.getNombreCereal().equalsIgnoreCase(txtCereal.getText())){
                        car1.setTipoCereal(t);
                    }
                }
                gestorH.guardarObjeto(car1);
            }
            if(caracteristicas.getNombreCaracteristica().equalsIgnoreCase(labelGDaniados.getText())){
                CaracteristicasPorTipoDeCerealPorMuestra car1 = new CaracteristicasPorTipoDeCerealPorMuestra();
                car1.setCaracteristicas(caracteristicas);
               car1.setValor(Double.parseDouble(txtGDaniadosLab.getText()));
                Iterator ite2 = gestorH.listarClase(MuestraTomada.class).iterator();
                while(ite2.hasNext()){
                    MuestraTomada m = (MuestraTomada) ite2.next();
                    if(m.getNumeroMuestra() == Long.parseLong(txtMuestra.getText())){
                        car1.setMuestra(m);
                    }
                }
                Iterator ite3 = gestorH.listarClase(TipoCereal.class).iterator();
                while(ite3.hasNext()){
                    TipoCereal t = (TipoCereal) ite3.next();
                    if(t.getNombreCereal().equalsIgnoreCase(txtCereal.getText())){
                        car1.setTipoCereal(t);
                    }
                }
                gestorH.guardarObjeto(car1);
            }
             if(caracteristicas.getNombreCaracteristica().equalsIgnoreCase(labelGQuebrados.getText())){
                CaracteristicasPorTipoDeCerealPorMuestra car1 = new CaracteristicasPorTipoDeCerealPorMuestra();
                car1.setCaracteristicas(caracteristicas);
                car1.setValor(Double.parseDouble(txtGQuebradosLab.getText()));
                Iterator ite2 = gestorH.listarClase(MuestraTomada.class).iterator();
                while(ite2.hasNext()){
                    MuestraTomada m = (MuestraTomada) ite2.next();
                    if(m.getNumeroMuestra() == Long.parseLong(txtMuestra.getText())){
                        car1.setMuestra(m);
                    }
                }
                Iterator ite3 = gestorH.listarClase(TipoCereal.class).iterator();
                while(ite3.hasNext()){
                    TipoCereal t = (TipoCereal) ite3.next();
                    if(t.getNombreCereal().equalsIgnoreCase(txtCereal.getText())){
                        car1.setTipoCereal(t);
                    }
                }
                gestorH.guardarObjeto(car1);
            }
             if(labelGranosV.isVisible()==true){
              if(caracteristicas.getNombreCaracteristica().equalsIgnoreCase(labelGranosV.getText())){
                CaracteristicasPorTipoDeCerealPorMuestra car1 = new CaracteristicasPorTipoDeCerealPorMuestra();
                car1.setCaracteristicas(caracteristicas);
                car1.setValor(Double.parseDouble(txtGranosVerdesN.getText()));
                Iterator ite2 = gestorH.listarClase(MuestraTomada.class).iterator();
                while(ite2.hasNext()){
                    MuestraTomada m = (MuestraTomada) ite2.next();
                    if(m.getNumeroMuestra() == Long.parseLong(txtMuestra.getText())){
                        car1.setMuestra(m);
                    }
                }
                Iterator ite3 = gestorH.listarClase(TipoCereal.class).iterator();
                while(ite3.hasNext()){
                    TipoCereal t = (TipoCereal) ite3.next();
                    if(t.getNombreCereal().equalsIgnoreCase(txtCereal.getText())){
                        car1.setTipoCereal(t);
                    }
                }
                gestorH.guardarObjeto(car1);
            }
           }else{
             if(caracteristicas.getNombreCaracteristica().equalsIgnoreCase(labelPesoH.getText())){
                CaracteristicasPorTipoDeCerealPorMuestra car1 = new CaracteristicasPorTipoDeCerealPorMuestra();
                car1.setCaracteristicas(caracteristicas);
                car1.setValor(Double.parseDouble(txtPHectLab.getText()));
                Iterator ite2 = gestorH.listarClase(MuestraTomada.class).iterator();
                while(ite2.hasNext()){
                    MuestraTomada m = (MuestraTomada) ite2.next();
                    if(m.getNumeroMuestra() == Long.parseLong(txtMuestra.getText())){
                        car1.setMuestra(m);
                    }
                }
                Iterator ite3 = gestorH.listarClase(TipoCereal.class).iterator();
                while(ite3.hasNext()){
                    TipoCereal t = (TipoCereal) ite3.next();
                    if(t.getNombreCereal().equalsIgnoreCase(txtCereal.getText())){
                        car1.setTipoCereal(t);
                    }
                }
                gestorH.guardarObjeto(car1);
            }
             
             }
        }
        JOptionPane.showMessageDialog(null, "Los cambios se han guardado correctamente");
        }
        else{
            JOptionPane.showMessageDialog(null, "Ingrese correctamente la Fecha de Recepción");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        DefaultTableModel modeloT = (DefaultTableModel) tblMuestras.getModel();
        calendarioDViaje.setEnabled(false);
        calendarioHViaje.setEnabled(false);
        txtNumMuestra.setEnabled(false);
        cmbProductor.setEnabled(false);
        txtCereal.setText("");
        txtEstablecimiento.setText("");
        txtEspecialidad.setText("");
        txtProductor.setText("");
        txtProvinciaLab.setText("");
        txtLaboratorio.setText("");
        txtDomicilioLab.setText("");
        txtEnviadoPor.setText("");
        txtFechaEnvio.setText("");
        txtMuestra.setText("");
        txtTelefonoLab.setText("");
        txtLocalidadLab.setText("");
        txtFEnvio.setText("");
        txtHumedadLab.setText("");
        txtGDaniadosLab.setText("");
        txtGQuebradosLab.setText("");
        txtPHectLab.setText("");
        txtMatExtLab.setText("");
        txtMuestraLab.setText("");
        int fila = tblMuestras.getSelectedRow();
        modeloT.removeRow(fila);
        tblMuestras.setModel(modeloT);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
    int respuesta = JOptionPane.showConfirmDialog(null, "¿Confirma que desea salir?");
    if (respuesta==0){
    dispose();
    }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed
     if (txtCerealMuestra.getText().equalsIgnoreCase("Trigo")){
     Double peso = Double.parseDouble(txtPHectLab.getText());
     int resPH = 0;
     if(peso > 0 && peso <= 73){
         resPH=3;
     }
     if(peso >73  && peso <= 76){
         resPH=2;
     }
     if(peso > 76 && peso <= 100){
         resPH=1;
     }
     Double materia = Double.parseDouble(txtMatExtLab.getText());
     int resMat = 0;
     if(materia > 0 && materia <= 0.20){
         resMat=1;
     }
     if(materia >0.20  && materia <= 0.80){
         resMat=2;
     }
     if(materia > 0.80 && materia <= 1.5){
         resMat=3;
     }
     Double grano = Double.parseDouble(txtGDaniadosLab.getText());
     int resGD = 0;
     if(grano > 0 && grano <= 0.50){
         resGD = 1;
     }
     if(grano > 0.50 && grano <= 1.0){
         resGD = 2;
     }
     if(grano > 1.0 && grano <= 1.50){
         resGD = 3;
     }
     
     Double granoQ = Double.parseDouble(txtGQuebradosLab.getText());
     int resGQ = 0;
     if(granoQ > 0 && granoQ <= 0.50){
         resGQ = 1;
     }
     if(granoQ > 0.50 && granoQ <= 1.20){
         resGQ = 2;
     }
     if(granoQ > 1.20 && granoQ <= 2.0){
         resGQ = 3;
     }
     
     Double humedad = Double.parseDouble(txtHumedadLab.getText());
     int hum = 0;
      if(humedad > 14){
         hum = 3;
     } else{
          hum = 1;
      }
      
      Double total = ((resPH + resGQ + hum + resGD + resMat) / 5.0 );
      if( total >0 && total <=1.5){
          txtResultadoMuestra.setText("Grado 1");
      }
       if( total > 1.50 && total <= 2.5){
          txtResultadoMuestra.setText("Grado 2");
      }
        if( total >2.5 && total <=4){
          txtResultadoMuestra.setText("Grado 3");
      }
     }
     
     if (txtCerealMuestra.getText().equalsIgnoreCase("Maiz")){
     Double peso = Double.parseDouble(txtPHectLab.getText());
     int resPH = 0;
     if(peso > 0 && peso <= 69){
         resPH=3;
     }
     if(peso >69  && peso <= 72){
         resPH=2;
     }
     if(peso > 72 && peso <= 75){
         resPH=1;
     }
     Double materia = Double.parseDouble(txtMatExtLab.getText());
     int resMat = 0;
     if(materia > 0 && materia <= 1.0){
         resMat=1;
     }
     if(materia >1.0  && materia <= 1.50){
         resMat=2;
     }
     if(materia > 1.50 && materia <= 2){
         resMat=3;
     }
     Double grano = Double.parseDouble(txtGDaniadosLab.getText());
     int resGD = 0;
     if(grano > 0 && grano <= 3.0){
         resGD = 1;
     }
     if(grano > 3.0 && grano <= 5.0){
         resGD = 2;
     }
     if(grano > 5.0 && grano <= 8.0){
         resGD = 3;
     }
     
     Double granoQ = Double.parseDouble(txtGQuebradosLab.getText());
     int resGQ = 0;
     if(granoQ > 0 && granoQ <= 2.0){
         resGQ = 1;
     }
     if(granoQ > 2.0 && granoQ <= 3.0){
         resGQ = 2;
     }
     if(granoQ > 3.0 && granoQ <= 5.0){
         resGQ = 3;
     }
     
     Double humedad = Double.parseDouble(txtHumedadLab.getText());
     int hum = 0;
      if(humedad > 14.5){
         hum = 3;
     } else{
          hum = 1;
      }
      
      Double total = ((resPH + resGQ + hum + resGD + resMat) / 5.0 );
      if( total >0 && total <=1.5){
          txtResultadoMuestra.setText("Grado 1");
      }
       if( total > 1.50 && total <= 2.5){
          txtResultadoMuestra.setText("Grado 2");
      }
        if( total >2.5 && total <=4){
          txtResultadoMuestra.setText("Grado 3");
      }
     }
     
     if (txtCerealMuestra.getText().equalsIgnoreCase("Soja")){
     Double peso = Double.parseDouble(txtPHectLab.getText());
     int resPH = 0;
     if(peso > 0 && peso <= 5){
         resPH=1;
     }
     if(peso >5  && peso <= 10){
         resPH=2;
     }
     if(peso > 10 && peso <= 15){
         resPH=3;
     }
     Double materia = Double.parseDouble(txtMatExtLab.getText());
     int resMat = 0;
     if(materia > 0 && materia <= 1.0){
         resMat=1;
     }
     if(materia >1.0  && materia <= 3.0){
         resMat=2;
     }
     if(materia > 3.0 && materia <= 5.0){
         resMat=3;
     }
     Double grano = Double.parseDouble(txtGDaniadosLab.getText());
     int resGD = 0;
     if(grano > 0 && grano <= 5.0){
         resGD = 1;
     }
     if(grano > 5.0 && grano <= 5.50){
         resGD = 2;
     }
     if(grano > 5.50 && grano <= 7.0){
         resGD = 3;
     }
     
     Double granoQ = Double.parseDouble(txtGQuebradosLab.getText());
     int resGQ = 0;
     if(granoQ > 0 && granoQ <= 20.0){
         resGQ = 1;
     }
     if(granoQ > 20.0 && granoQ <= 30.0){
         resGQ = 2;
     }
     if(granoQ > 30.0 && granoQ <= 50.0){
         resGQ = 3;
     }
     
     Double humedad = Double.parseDouble(txtHumedadLab.getText());
     int hum = 0;
      if(humedad > 13.5){
         hum = 3;
     } else{
          hum = 1;
      }
      
      Double total = ((resPH + resGQ + hum + resGD + resMat) / 5.0 );
      if( total >0 && total <=1.5){
          txtResultadoMuestra.setText("Grado 1");
      }
       if( total > 1.50 && total <= 2.5){
          txtResultadoMuestra.setText("Grado 2");
      }
        if( total >2.5 && total <=4){
          txtResultadoMuestra.setText("Grado 3");
      }
     }
    }//GEN-LAST:event_btnResultadoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarTodos;
    private javax.swing.JButton btnAceptarViaje;
    private javax.swing.JButton btnBorrarTodos;
    private javax.swing.JButton btnBuscarViaje;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnResultado;
    private javax.swing.JButton btnSalir;
    private datechooser.beans.DateChooserCombo calendarioDViaje;
    private datechooser.beans.DateChooserCombo calendarioHViaje;
    private datechooser.beans.DateChooserCombo calendarioRecep;
    private datechooser.beans.DateChooserCombo calendarioRecep1;
    private datechooser.beans.DateChooserCombo calendarioRecep2;
    private datechooser.beans.DateChooserCombo calendarioRecep3;
    private javax.swing.JCheckBox ckFecha;
    private javax.swing.JCheckBox ckNumMuestra;
    private javax.swing.JCheckBox ckProductor;
    private javax.swing.JComboBox cmbNroMuestra;
    private javax.swing.JComboBox cmbProductor;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelGDaniados;
    private javax.swing.JLabel labelGDaniados1;
    private javax.swing.JLabel labelGDaniados2;
    private javax.swing.JLabel labelGDaniados3;
    private javax.swing.JLabel labelGQuebrados;
    private javax.swing.JLabel labelGQuebrados1;
    private javax.swing.JLabel labelGQuebrados2;
    private javax.swing.JLabel labelGQuebrados3;
    private javax.swing.JLabel labelGranosV;
    private javax.swing.JLabel labelGranosV1;
    private javax.swing.JLabel labelGranosV2;
    private javax.swing.JLabel labelGranosV3;
    private javax.swing.JLabel labelHumedad;
    private javax.swing.JLabel labelHumedad1;
    private javax.swing.JLabel labelHumedad2;
    private javax.swing.JLabel labelHumedad3;
    private javax.swing.JLabel labelMatExt;
    private javax.swing.JLabel labelMatExt1;
    private javax.swing.JLabel labelMatExt2;
    private javax.swing.JLabel labelMatExt3;
    private javax.swing.JLabel labelPesoH;
    private javax.swing.JLabel labelPesoH1;
    private javax.swing.JLabel labelPesoH2;
    private javax.swing.JLabel labelPesoH3;
    private javax.swing.JLabel labelPorcentaje;
    private javax.swing.JLabel labelPorcentaje2;
    private javax.swing.JLabel labelusuario;
    private javax.swing.JTable tblMuestras;
    private javax.swing.JTextField txtCereal;
    private javax.swing.JTextField txtCerealMuestra;
    private javax.swing.JTextField txtCerealMuestra1;
    private javax.swing.JTextField txtCerealMuestra2;
    private javax.swing.JTextField txtCerealMuestra3;
    private javax.swing.JTextField txtDomicilioLab;
    private javax.swing.JTextField txtEnviadoPor;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JTextField txtEstablecimiento;
    private javax.swing.JTextField txtFEnvio;
    private javax.swing.JTextField txtFEnvio1;
    private javax.swing.JTextField txtFEnvio2;
    private javax.swing.JTextField txtFEnvio3;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFechaEnvio;
    private javax.swing.JTextField txtGDaniados1;
    private javax.swing.JTextField txtGDaniados2;
    private javax.swing.JTextField txtGDaniados3;
    private javax.swing.JTextField txtGDaniadosLab;
    private javax.swing.JTextField txtGDaniadosMaizN;
    private javax.swing.JTextField txtGDaniadosSojaN;
    private javax.swing.JTextField txtGDaniadosTrigoN;
    private javax.swing.JTextField txtGQuebrados1;
    private javax.swing.JTextField txtGQuebrados2;
    private javax.swing.JTextField txtGQuebrados3;
    private javax.swing.JTextField txtGQuebradosLab;
    private javax.swing.JTextField txtGQuebradosMaizN;
    private javax.swing.JTextField txtGQuebradosSojaN;
    private javax.swing.JTextField txtGQuebradosTrigoN;
    private javax.swing.JTextField txtGranosVerdesN;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtHumedadLab;
    private javax.swing.JTextField txtHumedadLab1;
    private javax.swing.JTextField txtHumedadLab2;
    private javax.swing.JTextField txtHumedadLab3;
    private javax.swing.JTextField txtHumedadMaiz1;
    private javax.swing.JTextField txtHumedadMaiz2;
    private javax.swing.JTextField txtHumedadMaiz3;
    private javax.swing.JTextField txtHumedadMaizN;
    private javax.swing.JTextField txtHumedadMensis;
    private javax.swing.JTextField txtHumedadMensis1;
    private javax.swing.JTextField txtHumedadMensis2;
    private javax.swing.JTextField txtHumedadMensis3;
    private javax.swing.JTextField txtHumedadSoja1;
    private javax.swing.JTextField txtHumedadSoja2;
    private javax.swing.JTextField txtHumedadSoja3;
    private javax.swing.JTextField txtHumedadSojaN;
    private javax.swing.JTextField txtHumedadTrigo1;
    private javax.swing.JTextField txtHumedadTrigo2;
    private javax.swing.JTextField txtHumedadTrigo3;
    private javax.swing.JTextField txtHumedadTrigoN;
    private javax.swing.JTextField txtImpurezasLab1;
    private javax.swing.JTextField txtImpurezasLab2;
    private javax.swing.JTextField txtImpurezasLab3;
    private javax.swing.JTextField txtImpurezasMensis1;
    private javax.swing.JTextField txtImpurezasMensis2;
    private javax.swing.JTextField txtImpurezasMensis3;
    private javax.swing.JTextField txtLaboratorio;
    private javax.swing.JTextField txtLocalidadLab;
    private javax.swing.JTextField txtMatExtLab;
    private javax.swing.JTextField txtMatExtMaiz1;
    private javax.swing.JTextField txtMatExtMaiz2;
    private javax.swing.JTextField txtMatExtMaiz3;
    private javax.swing.JTextField txtMatExtMaizN;
    private javax.swing.JTextField txtMatExtMensis;
    private javax.swing.JTextField txtMatExtSoja1;
    private javax.swing.JTextField txtMatExtSoja2;
    private javax.swing.JTextField txtMatExtSoja3;
    private javax.swing.JTextField txtMatExtSojaN;
    private javax.swing.JTextField txtMatExtTrigo1;
    private javax.swing.JTextField txtMatExtTrigo2;
    private javax.swing.JTextField txtMatExtTrigo3;
    private javax.swing.JTextField txtMatExtTrigoN;
    private javax.swing.JTextField txtMuestra;
    private javax.swing.JTextField txtMuestraLab;
    private javax.swing.JTextField txtMuestraLab1;
    private javax.swing.JTextField txtMuestraLab2;
    private javax.swing.JTextField txtMuestraLab3;
    private javax.swing.JTextField txtNumMuestra;
    private javax.swing.JTextField txtPHect1;
    private javax.swing.JTextField txtPHect2;
    private javax.swing.JTextField txtPHect3;
    private javax.swing.JTextField txtPHectLab;
    private javax.swing.JTextField txtPHectMaizN;
    private javax.swing.JTextField txtPHectTrigoN;
    private javax.swing.JTextField txtPesoLab1;
    private javax.swing.JTextField txtPesoLab2;
    private javax.swing.JTextField txtPesoLab3;
    private javax.swing.JTextField txtPesoMensis1;
    private javax.swing.JTextField txtPesoMensis2;
    private javax.swing.JTextField txtPesoMensis3;
    private javax.swing.JTextField txtProductor;
    private javax.swing.JTextField txtProvinciaLab;
    private javax.swing.JTextField txtResultadoMuestra;
    private javax.swing.JTextField txtTelefonoLab;
    // End of variables declaration//GEN-END:variables
}
