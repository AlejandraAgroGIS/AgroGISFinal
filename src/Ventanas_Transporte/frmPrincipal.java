/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * OrdenServicio.java
 *
 * Created on 25/09/2011, 11:30:52
 */
package Ventanas_Transporte;


import Clases_Modulo_Seguridad.Usuario;
import Ventanas_Viaje.*;
import Ventanas_Carga.*;
import javax.swing.UIManager;
import de.javasoft.plaf.synthetica.SyntheticaGreenDreamLookAndFeel;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import Clases_Modulo_Transporte.OpcionEditar;
import Gestores_Vista.gestorFrmPrincipal;
import Hibernate.GestorHibernate;
import Ventanas_Seguridad.frmIniciarSesion;
import Ventanas_Seguridad.frmPrueba;
import Ventanas_Seguridad.frmRegistrarUsuario;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;



public class frmPrincipal extends javax.swing.JFrame {
gestorFrmPrincipal gestorF = new gestorFrmPrincipal();
GestorHibernate gestorH = new GestorHibernate();
    /** Creates new form OrdenServicio */
    public frmPrincipal() {
        initComponents();
        this.setSize(1366,766);
        
        MenuInicio.setEnabled(false);
        MenuTransporte.setEnabled(false);
        MenuClientes.setEnabled(false);
        MenuViaje.setEnabled(false);
        MenuCarga.setEnabled(false);
        MenuListados.setEnabled(false);
        MenuAuditoria.setEnabled(false);
        
        //items deshabilitados para la reunion de avance
        ItemTransportista.setEnabled(true);
        ItemVehiculo.setEnabled(false);
        ItemEstacion.setEnabled(true);
        ItemVerEstacion.setEnabled(true);
        ItemVerTransp.setEnabled(false);
        ItemVerVehiculo.setEnabled(false);
        ItemVerTaller.setEnabled(false);
        ItemDetalleConsumo.setEnabled(false);
        MenuEliminarOrden.setEnabled(false);
        ItemRegistroCarga.setEnabled(false);
        ItemFichaPersonal.setEnabled(false);
        ItemCargaCombustible.setEnabled(false);
        menuVerViaje.setEnabled(false);
        ItemNuevoLab.setEnabled(false);
        ItemNuevoSilo.setEnabled(false);
        MenuVerCarga.setEnabled(false);
        ItemResultadosLab.setEnabled(false);
        ItemEnvioMuestras.setEnabled(false);
   
 
        gestorF.HabilitarMenu(MenuInicio, MenuCarga, MenuTransporte, MenuViaje, MenuClientes, MenuListados, MenuAuditoria);
        Iterator ite = gestorH.listarClase(Usuario.class).iterator();
        while(ite.hasNext()){
            Usuario u = (Usuario) ite.next();
            if(u.isEstado()==true){
                labelUsuario.setText(u.getNombreUsuario());
                String path = "/Imagenes/UsuarioLogueado.png";  
                URL url = this.getClass().getResource(path);  
                ImageIcon icon = new ImageIcon(url); 
                labelImagenUsuario.setIcon(icon);
            }
        }
//        this.setExtendedState(this.MAXIMIZED_BOTH);
        
    
     
    
 }

    @Override
 public Image getIconImage(){
     
    Image retValue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/LogoAgroGIS.PNG"));
 
     return retValue;
 }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        Escritorio = new javax.swing.JDesktopPane();
        Calendario = new datechooser.beans.DateChooserCombo();
        pnlUsuarioLogin = new javax.swing.JPanel();
        labelImagenUsuario = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        labelPrincipal = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        MenuPrincipal = new javax.swing.JMenuBar();
        MenuSesion = new javax.swing.JMenu();
        MenuInicioSesion = new javax.swing.JMenuItem();
        MenuCierreSesion = new javax.swing.JMenuItem();
        MenuInicio = new javax.swing.JMenu();
        MenuInicioNuevo = new javax.swing.JMenu();
        ItemNuevoPais = new javax.swing.JMenuItem();
        ItemNuevoProvincia = new javax.swing.JMenuItem();
        ItemNuevoDepto = new javax.swing.JMenuItem();
        ItemNuevoLocalidad = new javax.swing.JMenuItem();
        ItemNuevoBarrio = new javax.swing.JMenuItem();
        ItemEspecialidad = new javax.swing.JMenuItem();
        itemEspTaller = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        ItemUsuario = new javax.swing.JMenuItem();
        MenuTransporte = new javax.swing.JMenu();
        MenuNuevoTransp = new javax.swing.JMenu();
        ItemTransportista = new javax.swing.JMenuItem();
        ItemVehiculo = new javax.swing.JMenuItem();
        ItemTaller = new javax.swing.JMenuItem();
        ItemEstacion = new javax.swing.JMenuItem();
        MenuVerTransp = new javax.swing.JMenu();
        ItemVerTransp = new javax.swing.JMenuItem();
        ItemVerVehiculo = new javax.swing.JMenuItem();
        ItemVerTaller = new javax.swing.JMenuItem();
        ItemVerEstacion = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        ItemDetalleConsumo = new javax.swing.JMenuItem();
        ItemDetalleReparacion = new javax.swing.JMenuItem();
        MenuEliminarOrden = new javax.swing.JMenu();
        ItemEliminarCarga = new javax.swing.JMenuItem();
        ItemEliminarTaller = new javax.swing.JMenuItem();
        ItemRegistroCarga = new javax.swing.JMenuItem();
        ItemRegistroEnvio = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MenuEmitirTransp = new javax.swing.JMenu();
        MenuOrdenServicio = new javax.swing.JMenu();
        ItemCargaCombustible = new javax.swing.JMenuItem();
        ItemEnvioTaller = new javax.swing.JMenuItem();
        ItemFichaPersonal = new javax.swing.JMenuItem();
        MenuClientes = new javax.swing.JMenu();
        MenuNuevoCliente = new javax.swing.JMenu();
        ItemNuevoProductor = new javax.swing.JMenuItem();
        ItemNuevoEst = new javax.swing.JMenuItem();
        itemNuevoLote = new javax.swing.JMenuItem();
        MenuConsultarCliente = new javax.swing.JMenu();
        itemConsultarProd = new javax.swing.JMenuItem();
        itemConsultarEst = new javax.swing.JMenuItem();
        itemConsultarLote = new javax.swing.JMenuItem();
        MenuViaje = new javax.swing.JMenu();
        menuNuevoViaje = new javax.swing.JMenu();
        ItemNuevoViaje = new javax.swing.JMenuItem();
        menuVerViaje = new javax.swing.JMenu();
        ItemConsultarViaje = new javax.swing.JMenuItem();
        ItemAsignarTransporte = new javax.swing.JMenuItem();
        ItemEmitirOrden = new javax.swing.JMenuItem();
        itemConsultarAgenda = new javax.swing.JMenuItem();
        MenuCarga = new javax.swing.JMenu();
        MenuNuevoCarga = new javax.swing.JMenu();
        ItemNuevoLab = new javax.swing.JMenuItem();
        ItemNuevoTipoCereal = new javax.swing.JMenuItem();
        ItemNuevoSilo = new javax.swing.JMenuItem();
        MenuVerCarga = new javax.swing.JMenu();
        ItemVerLab = new javax.swing.JMenuItem();
        ItemVerTipoCereal = new javax.swing.JMenuItem();
        ItemVerSilo = new javax.swing.JMenuItem();
        ItemSolicitud = new javax.swing.JMenuItem();
        ItemRetiroCereal = new javax.swing.JMenuItem();
        ItemDescargaCereal = new javax.swing.JMenuItem();
        ItemEnvioMuestras = new javax.swing.JMenuItem();
        ItemResultadosLab = new javax.swing.JMenuItem();
        MenuListados = new javax.swing.JMenu();
        ItemPdf = new javax.swing.JMenuItem();
        MenuAuditoria = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        jMenuItem8.setText("jMenuItem8");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AgroGIS");
        setIconImage(getIconImage());
        setIconImages(getIconImages());

        Escritorio.setBackground(java.awt.Color.lightGray);

        Calendario.setFieldFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 12));
        Calendario.setNavigateFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 12));
        Calendario.setBounds(1060, 60, 155, 20);
        Escritorio.add(Calendario, javax.swing.JLayeredPane.DEFAULT_LAYER);

        pnlUsuarioLogin.setBackground(new java.awt.Color(204, 204, 204));
        pnlUsuarioLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        labelImagenUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UsuarioNoLogueado.png"))); // NOI18N

        labelUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        javax.swing.GroupLayout pnlUsuarioLoginLayout = new javax.swing.GroupLayout(pnlUsuarioLogin);
        pnlUsuarioLogin.setLayout(pnlUsuarioLoginLayout);
        pnlUsuarioLoginLayout.setHorizontalGroup(
            pnlUsuarioLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuarioLoginLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(labelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelImagenUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(301, 301, 301))
        );
        pnlUsuarioLoginLayout.setVerticalGroup(
            pnlUsuarioLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUsuarioLoginLayout.createSequentialGroup()
                .addComponent(labelImagenUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
            .addGroup(pnlUsuarioLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlUsuarioLogin.setBounds(1010, 10, 240, 50);
        Escritorio.add(pnlUsuarioLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);

        labelPrincipal.setBackground(new java.awt.Color(153, 153, 153));
        labelPrincipal.setForeground(new java.awt.Color(153, 153, 153));
        labelPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenPrincipal.png"))); // NOI18N
        labelPrincipal.setBounds(0, 0, 1280, 720);
        Escritorio.add(labelPrincipal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        jPanel1.setBounds(1280, 0, 100, 720);
        Escritorio.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        MenuSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sesion.png"))); // NOI18N
        MenuSesion.setText("Sesión");
        MenuSesion.setFocusable(false);
        MenuSesion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        MenuInicioSesion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        MenuInicioSesion.setText("Iniciar Sesion");
        MenuInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuInicioSesionActionPerformed(evt);
            }
        });
        MenuSesion.add(MenuInicioSesion);

        MenuCierreSesion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        MenuCierreSesion.setText("Cerrar Sesion");
        MenuCierreSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCierreSesionActionPerformed(evt);
            }
        });
        MenuSesion.add(MenuCierreSesion);

        MenuPrincipal.add(MenuSesion);

        MenuInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NuevoRegistro.png"))); // NOI18N
        MenuInicio.setText("Inicio");
        MenuInicio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        MenuInicioNuevo.setText("Nuevo / Modificar");
        MenuInicioNuevo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        ItemNuevoPais.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemNuevoPais.setText("Pais");
        ItemNuevoPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemNuevoPaisActionPerformed(evt);
            }
        });
        MenuInicioNuevo.add(ItemNuevoPais);

        ItemNuevoProvincia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemNuevoProvincia.setText("Provincia");
        ItemNuevoProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemNuevoProvinciaActionPerformed(evt);
            }
        });
        MenuInicioNuevo.add(ItemNuevoProvincia);

        ItemNuevoDepto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemNuevoDepto.setText("Departamento");
        ItemNuevoDepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemNuevoDeptoActionPerformed(evt);
            }
        });
        MenuInicioNuevo.add(ItemNuevoDepto);

        ItemNuevoLocalidad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemNuevoLocalidad.setText("Localidad");
        ItemNuevoLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemNuevoLocalidadActionPerformed(evt);
            }
        });
        MenuInicioNuevo.add(ItemNuevoLocalidad);

        ItemNuevoBarrio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemNuevoBarrio.setText("Barrio");
        ItemNuevoBarrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemNuevoBarrioActionPerformed(evt);
            }
        });
        MenuInicioNuevo.add(ItemNuevoBarrio);

        ItemEspecialidad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemEspecialidad.setText("Especialidad Laboratorio");
        ItemEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemEspecialidadActionPerformed(evt);
            }
        });
        MenuInicioNuevo.add(ItemEspecialidad);

        itemEspTaller.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        itemEspTaller.setText("Especialidad Taller Reparacion");
        itemEspTaller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEspTallerActionPerformed(evt);
            }
        });
        MenuInicioNuevo.add(itemEspTaller);
        MenuInicioNuevo.add(jSeparator3);

        ItemUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemUsuario.setText("Usuario");
        ItemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemUsuarioActionPerformed(evt);
            }
        });
        MenuInicioNuevo.add(ItemUsuario);

        MenuInicio.add(MenuInicioNuevo);

        MenuPrincipal.add(MenuInicio);

        MenuTransporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Camion.PNG"))); // NOI18N
        MenuTransporte.setText("Transporte");
        MenuTransporte.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        MenuNuevoTransp.setText("Nuevo");
        MenuNuevoTransp.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        ItemTransportista.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemTransportista.setText("Transportista");
        ItemTransportista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemTransportistaActionPerformed(evt);
            }
        });
        MenuNuevoTransp.add(ItemTransportista);

        ItemVehiculo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemVehiculo.setText("Vehiculo");
        MenuNuevoTransp.add(ItemVehiculo);

        ItemTaller.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemTaller.setText("Taller de Reparacion");
        ItemTaller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemTallerActionPerformed(evt);
            }
        });
        MenuNuevoTransp.add(ItemTaller);

        ItemEstacion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemEstacion.setText("Estacion de Servicio");
        ItemEstacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemEstacionActionPerformed(evt);
            }
        });
        MenuNuevoTransp.add(ItemEstacion);

        MenuTransporte.add(MenuNuevoTransp);

        MenuVerTransp.setText("Consultar / Modificar");
        MenuVerTransp.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        ItemVerTransp.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemVerTransp.setText("Transportista");
        MenuVerTransp.add(ItemVerTransp);

        ItemVerVehiculo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemVerVehiculo.setText("Vehiculo");
        MenuVerTransp.add(ItemVerVehiculo);

        ItemVerTaller.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemVerTaller.setText("Taller de Reparacion");
        MenuVerTransp.add(ItemVerTaller);

        ItemVerEstacion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemVerEstacion.setText("Estacion de Servicio");
        MenuVerTransp.add(ItemVerEstacion);
        MenuVerTransp.add(jSeparator2);

        ItemDetalleConsumo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemDetalleConsumo.setText("Detalle de Consumo");
        ItemDetalleConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemDetalleConsumoActionPerformed(evt);
            }
        });
        MenuVerTransp.add(ItemDetalleConsumo);

        ItemDetalleReparacion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemDetalleReparacion.setText("Detalle de Reparaciones");
        ItemDetalleReparacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemDetalleReparacionActionPerformed(evt);
            }
        });
        MenuVerTransp.add(ItemDetalleReparacion);

        MenuTransporte.add(MenuVerTransp);

        MenuEliminarOrden.setText("Eliminar Orden de Servicio");
        MenuEliminarOrden.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        ItemEliminarCarga.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemEliminarCarga.setText("Carga de Combustible");
        MenuEliminarOrden.add(ItemEliminarCarga);

        ItemEliminarTaller.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemEliminarTaller.setText("Envio a Taller");
        ItemEliminarTaller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemEliminarTallerActionPerformed(evt);
            }
        });
        MenuEliminarOrden.add(ItemEliminarTaller);

        MenuTransporte.add(MenuEliminarOrden);

        ItemRegistroCarga.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemRegistroCarga.setText("Registrar Carga de Combustible");
        ItemRegistroCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemRegistroCargaActionPerformed(evt);
            }
        });
        MenuTransporte.add(ItemRegistroCarga);

        ItemRegistroEnvio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemRegistroEnvio.setText("Registrar Envío de Vehículo a Taller");
        ItemRegistroEnvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemRegistroEnvioActionPerformed(evt);
            }
        });
        MenuTransporte.add(ItemRegistroEnvio);
        MenuTransporte.add(jSeparator1);

        MenuEmitirTransp.setText("Emitir");
        MenuEmitirTransp.setFocusable(false);
        MenuEmitirTransp.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        MenuOrdenServicio.setText("Orden para Servicio");
        MenuOrdenServicio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        ItemCargaCombustible.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemCargaCombustible.setText("Carga de Combustible");
        ItemCargaCombustible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCargaCombustibleActionPerformed(evt);
            }
        });
        MenuOrdenServicio.add(ItemCargaCombustible);

        ItemEnvioTaller.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemEnvioTaller.setText("Envio a Taller");
        ItemEnvioTaller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemEnvioTallerActionPerformed(evt);
            }
        });
        MenuOrdenServicio.add(ItemEnvioTaller);

        MenuEmitirTransp.add(MenuOrdenServicio);

        ItemFichaPersonal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemFichaPersonal.setText("Ficha personal");
        MenuEmitirTransp.add(ItemFichaPersonal);

        MenuTransporte.add(MenuEmitirTransp);

        MenuPrincipal.add(MenuTransporte);

        MenuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cliente.png"))); // NOI18N
        MenuClientes.setText("Clientes");
        MenuClientes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        MenuNuevoCliente.setText("Nuevo");
        MenuNuevoCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        ItemNuevoProductor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemNuevoProductor.setText("Productor");
        ItemNuevoProductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemNuevoProductorActionPerformed(evt);
            }
        });
        MenuNuevoCliente.add(ItemNuevoProductor);

        ItemNuevoEst.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemNuevoEst.setText("Establecimiento");
        MenuNuevoCliente.add(ItemNuevoEst);

        itemNuevoLote.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        itemNuevoLote.setText("Lote");
        MenuNuevoCliente.add(itemNuevoLote);

        MenuClientes.add(MenuNuevoCliente);

        MenuConsultarCliente.setText("Consultar / Modificar");
        MenuConsultarCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        itemConsultarProd.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        itemConsultarProd.setText("Productor");
        MenuConsultarCliente.add(itemConsultarProd);

        itemConsultarEst.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        itemConsultarEst.setText("Establecimiento");
        MenuConsultarCliente.add(itemConsultarEst);

        itemConsultarLote.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        itemConsultarLote.setText("Lote");
        MenuConsultarCliente.add(itemConsultarLote);

        MenuClientes.add(MenuConsultarCliente);

        MenuPrincipal.add(MenuClientes);

        MenuViaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Organizador.png"))); // NOI18N
        MenuViaje.setText("Viaje");
        MenuViaje.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        menuNuevoViaje.setText("Nuevo");
        menuNuevoViaje.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        ItemNuevoViaje.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemNuevoViaje.setText("       Viaje       ");
        ItemNuevoViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemNuevoViajeActionPerformed(evt);
            }
        });
        menuNuevoViaje.add(ItemNuevoViaje);

        MenuViaje.add(menuNuevoViaje);

        menuVerViaje.setText("Consultar/Modificar");
        menuVerViaje.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        ItemConsultarViaje.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemConsultarViaje.setText("      Viaje        ");
        menuVerViaje.add(ItemConsultarViaje);

        MenuViaje.add(menuVerViaje);

        ItemAsignarTransporte.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemAsignarTransporte.setText("Asignar Transporte a Viaje");
        ItemAsignarTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemAsignarTransporteActionPerformed(evt);
            }
        });
        MenuViaje.add(ItemAsignarTransporte);

        ItemEmitirOrden.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemEmitirOrden.setText("Emitir Orden de Viaje");
        ItemEmitirOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemEmitirOrdenActionPerformed(evt);
            }
        });
        MenuViaje.add(ItemEmitirOrden);

        itemConsultarAgenda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        itemConsultarAgenda.setText("Consultar Agenda de Viajes");
        itemConsultarAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultarAgendaActionPerformed(evt);
            }
        });
        MenuViaje.add(itemConsultarAgenda);

        MenuPrincipal.add(MenuViaje);

        MenuCarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/silos .png"))); // NOI18N
        MenuCarga.setText("Carga");
        MenuCarga.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        MenuNuevoCarga.setText("Nuevo");
        MenuNuevoCarga.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        ItemNuevoLab.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemNuevoLab.setText("Laboratorio");
        ItemNuevoLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemNuevoLabActionPerformed(evt);
            }
        });
        MenuNuevoCarga.add(ItemNuevoLab);

        ItemNuevoTipoCereal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemNuevoTipoCereal.setText("Cereal");
        ItemNuevoTipoCereal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemNuevoTipoCerealActionPerformed(evt);
            }
        });
        MenuNuevoCarga.add(ItemNuevoTipoCereal);

        ItemNuevoSilo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemNuevoSilo.setText("Silo");
        ItemNuevoSilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemNuevoSiloActionPerformed(evt);
            }
        });
        MenuNuevoCarga.add(ItemNuevoSilo);

        MenuCarga.add(MenuNuevoCarga);

        MenuVerCarga.setText("Consultar / Modificar");
        MenuVerCarga.setFocusable(false);
        MenuVerCarga.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        ItemVerLab.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemVerLab.setText("Laboratorio");
        MenuVerCarga.add(ItemVerLab);

        ItemVerTipoCereal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemVerTipoCereal.setText("Tipo de Cereal");
        MenuVerCarga.add(ItemVerTipoCereal);

        ItemVerSilo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemVerSilo.setText("Silo");
        MenuVerCarga.add(ItemVerSilo);

        MenuCarga.add(MenuVerCarga);

        ItemSolicitud.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemSolicitud.setText("Registrar Solicitud de Retiro de Cereal");
        ItemSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemSolicitudActionPerformed(evt);
            }
        });
        MenuCarga.add(ItemSolicitud);

        ItemRetiroCereal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemRetiroCereal.setText("Registrar Retiro de Cereal");
        ItemRetiroCereal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemRetiroCerealActionPerformed(evt);
            }
        });
        MenuCarga.add(ItemRetiroCereal);

        ItemDescargaCereal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemDescargaCereal.setText("Registrar Descarga de Cereal");
        ItemDescargaCereal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemDescargaCerealActionPerformed(evt);
            }
        });
        MenuCarga.add(ItemDescargaCereal);

        ItemEnvioMuestras.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemEnvioMuestras.setText("Registrar Envío de Muestras a Laboratorio");
        ItemEnvioMuestras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemEnvioMuestrasActionPerformed(evt);
            }
        });
        MenuCarga.add(ItemEnvioMuestras);

        ItemResultadosLab.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemResultadosLab.setText("Registrar Resultados de Laboratorio");
        ItemResultadosLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemResultadosLabActionPerformed(evt);
            }
        });
        MenuCarga.add(ItemResultadosLab);

        MenuPrincipal.add(MenuCarga);

        MenuListados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listado.png"))); // NOI18N
        MenuListados.setText("Listados");
        MenuListados.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        ItemPdf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemPdf.setText("Informe Pdf");
        ItemPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemPdfActionPerformed(evt);
            }
        });
        MenuListados.add(ItemPdf);

        MenuPrincipal.add(MenuListados);

        MenuAuditoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bitacora.png"))); // NOI18N
        MenuAuditoria.setText("Auditoria");
        MenuAuditoria.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        MenuPrincipal.add(MenuAuditoria);

        setJMenuBar(MenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1380, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void ItemCargaCombustibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCargaCombustibleActionPerformed
        frmOrdenCarga carga = new  frmOrdenCarga();
        this.Escritorio.add(carga);
        carga.setVisible(true);
}//GEN-LAST:event_ItemCargaCombustibleActionPerformed

private void ItemEnvioTallerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemEnvioTallerActionPerformed
        frmOrdenTaller taller = new  frmOrdenTaller();
        this.Escritorio.add(taller);
        taller.setVisible(true);
}//GEN-LAST:event_ItemEnvioTallerActionPerformed

private void ItemRegistroCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemRegistroCargaActionPerformed
        frmRegistrarCargaComb registro= new frmRegistrarCargaComb();
        this.Escritorio.add(registro);
        registro.setVisible(true);
}//GEN-LAST:event_ItemRegistroCargaActionPerformed

private void ItemTransportistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemTransportistaActionPerformed
        frmRegistroTransportista transportista= new frmRegistroTransportista();
        this.Escritorio.add(transportista);
        transportista.setVisible(true);
}//GEN-LAST:event_ItemTransportistaActionPerformed

private void ItemNuevoPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemNuevoPaisActionPerformed
        frmRegistrarPais pais= new frmRegistrarPais();
        this.Escritorio.add(pais);
        pais.setVisible(true);
}//GEN-LAST:event_ItemNuevoPaisActionPerformed

private void ItemNuevoProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemNuevoProvinciaActionPerformed
        frmRegistrarProvincia prov=new frmRegistrarProvincia();
        this.Escritorio.add(prov);
        prov.setVisible(true);
}//GEN-LAST:event_ItemNuevoProvinciaActionPerformed

private void ItemNuevoDeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemNuevoDeptoActionPerformed
        frmRegistrarDepartamento depto=new frmRegistrarDepartamento();
        this.Escritorio.add(depto);
        depto.setVisible(true);
}//GEN-LAST:event_ItemNuevoDeptoActionPerformed

private void ItemNuevoLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemNuevoLocalidadActionPerformed
        frmRegistrarLocalidad loc=new frmRegistrarLocalidad();
        this.Escritorio.add(loc);
        loc.setVisible(true);
}//GEN-LAST:event_ItemNuevoLocalidadActionPerformed

private void ItemNuevoBarrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemNuevoBarrioActionPerformed
        frmRegistrarBarrio barrio=new frmRegistrarBarrio();
        this.Escritorio.add(barrio);
        barrio.setVisible(true);
}//GEN-LAST:event_ItemNuevoBarrioActionPerformed

private void ItemEstacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemEstacionActionPerformed
        frmRegistrarEstacionServicio estacion=new frmRegistrarEstacionServicio();
        this.Escritorio.add(estacion);
        estacion.setVisible(true);
}//GEN-LAST:event_ItemEstacionActionPerformed

private void ItemDetalleConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemDetalleConsumoActionPerformed
        frmConsultaConsumo consumo= new frmConsultaConsumo();
        this.Escritorio.add(consumo);
        consumo.setVisible(true);
}//GEN-LAST:event_ItemDetalleConsumoActionPerformed

private void ItemNuevoSiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemNuevoSiloActionPerformed
        frmRegistrarSilo silo=new frmRegistrarSilo();
        this.Escritorio.add(silo);
        silo.setVisible(true);
        
}//GEN-LAST:event_ItemNuevoSiloActionPerformed

private void ItemNuevoLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemNuevoLabActionPerformed
        frmRegistrarLaboratorio laboratorio=new frmRegistrarLaboratorio();
        this.Escritorio.add(laboratorio);
        laboratorio.setVisible(true);
}//GEN-LAST:event_ItemNuevoLabActionPerformed

private void ItemNuevoTipoCerealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemNuevoTipoCerealActionPerformed
        frmRegistrarCereal cereal=new frmRegistrarCereal();
        this.Escritorio.add(cereal);
        cereal.setVisible(true);
}//GEN-LAST:event_ItemNuevoTipoCerealActionPerformed

private void ItemSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemSolicitudActionPerformed
        frmRegistrarSolicitud solicitud=new frmRegistrarSolicitud();
        this.Escritorio.add(solicitud);
        solicitud.setVisible(true);
}//GEN-LAST:event_ItemSolicitudActionPerformed

private void ItemDescargaCerealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemDescargaCerealActionPerformed
        frmDescargaCereal descarga=new frmDescargaCereal();
        this.Escritorio.add(descarga);
        descarga.setVisible(true);
}//GEN-LAST:event_ItemDescargaCerealActionPerformed

private void ItemRetiroCerealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemRetiroCerealActionPerformed
        frmRegistrarRetiroCereal retiro=new frmRegistrarRetiroCereal();
        this.Escritorio.add(retiro);
        retiro.setVisible(true);
}//GEN-LAST:event_ItemRetiroCerealActionPerformed

    private void ItemTallerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemTallerActionPerformed
        frmRegistrarTallerReparacion taller=new frmRegistrarTallerReparacion();
        this.Escritorio.add(taller);
        taller.setVisible(true);
    }//GEN-LAST:event_ItemTallerActionPerformed

    private void ItemRegistroEnvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemRegistroEnvioActionPerformed
        frmRegistrarEnvioTaller envio=new frmRegistrarEnvioTaller();
        this.Escritorio.add(envio);
        envio.setVisible(true);
    }//GEN-LAST:event_ItemRegistroEnvioActionPerformed

    private void ItemResultadosLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemResultadosLabActionPerformed
        frmRegistrarResultadosLab resultados=new frmRegistrarResultadosLab();
        this.Escritorio.add(resultados);
        resultados.setVisible(true);
    }//GEN-LAST:event_ItemResultadosLabActionPerformed

    private void ItemNuevoViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemNuevoViajeActionPerformed
        frmRegistrarViaje viaje= new frmRegistrarViaje();
        this.Escritorio.add(viaje);
        viaje.setVisible(true);
    }//GEN-LAST:event_ItemNuevoViajeActionPerformed

    private void ItemAsignarTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemAsignarTransporteActionPerformed
        frmAsignarTransporte asignar= new frmAsignarTransporte();
        this.Escritorio.add(asignar);
        asignar.setVisible(true);
    }//GEN-LAST:event_ItemAsignarTransporteActionPerformed

    private void ItemEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemEspecialidadActionPerformed
        frmRegistrarEspecialidadLab especialidad=new frmRegistrarEspecialidadLab();
        this.Escritorio.add(especialidad);
        especialidad.setVisible(true);
    }//GEN-LAST:event_ItemEspecialidadActionPerformed

    private void ItemDetalleReparacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemDetalleReparacionActionPerformed
        frmConsultaReparaciones reparacion=new frmConsultaReparaciones();
        this.Escritorio.add(reparacion);
        reparacion.setVisible(true);
    }//GEN-LAST:event_ItemDetalleReparacionActionPerformed

    private void ItemEmitirOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemEmitirOrdenActionPerformed
        frmEmitirOrdenViaje orden=new frmEmitirOrdenViaje();
        this.Escritorio.add(orden);
        orden.setVisible(true);        
    }//GEN-LAST:event_ItemEmitirOrdenActionPerformed

    private void ItemEnvioMuestrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemEnvioMuestrasActionPerformed
        frmRegistrarEnvioMuestra muestra=new frmRegistrarEnvioMuestra();
        this.Escritorio.add(muestra);
        muestra.setVisible(true);
    }//GEN-LAST:event_ItemEnvioMuestrasActionPerformed

    private void itemConsultarAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultarAgendaActionPerformed
        frmConsultarAgenda agenda= new frmConsultarAgenda();
        this.Escritorio.add(agenda);
        agenda.setVisible(true);
    }//GEN-LAST:event_itemConsultarAgendaActionPerformed

    private void ItemNuevoProductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemNuevoProductorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemNuevoProductorActionPerformed

    private void MenuInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuInicioSesionActionPerformed
        frmIniciarSesion sesion= new frmIniciarSesion();
        this.Escritorio.add(sesion);
        sesion.setVisible(true);
        
    }//GEN-LAST:event_MenuInicioSesionActionPerformed

    private void MenuCierreSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCierreSesionActionPerformed
       Iterator ite = gestorH.listarClase(Usuario.class).iterator();
        while(ite.hasNext()){
            Usuario u = (Usuario) ite.next();
            if(u.isEstado()==true){
                u.setEstado(false);
                gestorH.actualizarObjeto(u);
            }
        }
        MenuAuditoria.setEnabled(false);
        MenuCarga.setEnabled(false);
        MenuClientes.setEnabled(false);
        MenuListados.setEnabled(false);
        MenuTransporte.setEnabled(false);
        MenuInicio.setEnabled(false);
        MenuViaje.setEnabled(false);
    }//GEN-LAST:event_MenuCierreSesionActionPerformed

    private void ItemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemUsuarioActionPerformed
        frmRegistrarUsuario usuario=new frmRegistrarUsuario();
        this.Escritorio.add(usuario);
        usuario.setVisible(true);
    }//GEN-LAST:event_ItemUsuarioActionPerformed

    private void ItemPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemPdfActionPerformed
       try {
        File path = new File ("C:/prueba.pdf");
        Desktop.getDesktop().open(path);
        }catch (IOException ex) {
        ex.printStackTrace();

}

    }//GEN-LAST:event_ItemPdfActionPerformed

    private void ItemEliminarTallerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemEliminarTallerActionPerformed
       frmEliminarOrdenTaller orden=new frmEliminarOrdenTaller();
       this.Escritorio.add(orden);
       orden.setVisible(true);
    }//GEN-LAST:event_ItemEliminarTallerActionPerformed

    private void itemEspTallerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEspTallerActionPerformed
        frmRegistrarEspTaller usuario=new frmRegistrarEspTaller();
        this.Escritorio.add(usuario);
        usuario.setVisible(true);
    }//GEN-LAST:event_itemEspTallerActionPerformed

   
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new frmPrincipal().setVisible(true);
                
                
                
                        
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo Calendario;
    public static javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem ItemAsignarTransporte;
    private javax.swing.JMenuItem ItemCargaCombustible;
    private javax.swing.JMenuItem ItemConsultarViaje;
    private javax.swing.JMenuItem ItemDescargaCereal;
    private javax.swing.JMenuItem ItemDetalleConsumo;
    private javax.swing.JMenuItem ItemDetalleReparacion;
    private javax.swing.JMenuItem ItemEliminarCarga;
    private javax.swing.JMenuItem ItemEliminarTaller;
    private javax.swing.JMenuItem ItemEmitirOrden;
    private javax.swing.JMenuItem ItemEnvioMuestras;
    private javax.swing.JMenuItem ItemEnvioTaller;
    private javax.swing.JMenuItem ItemEspecialidad;
    private javax.swing.JMenuItem ItemEstacion;
    private javax.swing.JMenuItem ItemFichaPersonal;
    private javax.swing.JMenuItem ItemNuevoBarrio;
    private javax.swing.JMenuItem ItemNuevoDepto;
    private javax.swing.JMenuItem ItemNuevoEst;
    private javax.swing.JMenuItem ItemNuevoLab;
    private javax.swing.JMenuItem ItemNuevoLocalidad;
    private javax.swing.JMenuItem ItemNuevoPais;
    private javax.swing.JMenuItem ItemNuevoProductor;
    private javax.swing.JMenuItem ItemNuevoProvincia;
    private javax.swing.JMenuItem ItemNuevoSilo;
    private javax.swing.JMenuItem ItemNuevoTipoCereal;
    private javax.swing.JMenuItem ItemNuevoViaje;
    private javax.swing.JMenuItem ItemPdf;
    private javax.swing.JMenuItem ItemRegistroCarga;
    private javax.swing.JMenuItem ItemRegistroEnvio;
    private javax.swing.JMenuItem ItemResultadosLab;
    private javax.swing.JMenuItem ItemRetiroCereal;
    private javax.swing.JMenuItem ItemSolicitud;
    private javax.swing.JMenuItem ItemTaller;
    private javax.swing.JMenuItem ItemTransportista;
    private javax.swing.JMenuItem ItemUsuario;
    private javax.swing.JMenuItem ItemVehiculo;
    private javax.swing.JMenuItem ItemVerEstacion;
    private javax.swing.JMenuItem ItemVerLab;
    private javax.swing.JMenuItem ItemVerSilo;
    private javax.swing.JMenuItem ItemVerTaller;
    private javax.swing.JMenuItem ItemVerTipoCereal;
    private javax.swing.JMenuItem ItemVerTransp;
    private javax.swing.JMenuItem ItemVerVehiculo;
    private javax.swing.JMenu MenuAuditoria;
    private javax.swing.JMenu MenuCarga;
    private javax.swing.JMenuItem MenuCierreSesion;
    private javax.swing.JMenu MenuClientes;
    private javax.swing.JMenu MenuConsultarCliente;
    private javax.swing.JMenu MenuEliminarOrden;
    private javax.swing.JMenu MenuEmitirTransp;
    private javax.swing.JMenu MenuInicio;
    private javax.swing.JMenu MenuInicioNuevo;
    private javax.swing.JMenuItem MenuInicioSesion;
    private javax.swing.JMenu MenuListados;
    private javax.swing.JMenu MenuNuevoCarga;
    private javax.swing.JMenu MenuNuevoCliente;
    private javax.swing.JMenu MenuNuevoTransp;
    private javax.swing.JMenu MenuOrdenServicio;
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JMenu MenuSesion;
    private javax.swing.JMenu MenuTransporte;
    private javax.swing.JMenu MenuVerCarga;
    private javax.swing.JMenu MenuVerTransp;
    private javax.swing.JMenu MenuViaje;
    private javax.swing.JMenuItem itemConsultarAgenda;
    private javax.swing.JMenuItem itemConsultarEst;
    private javax.swing.JMenuItem itemConsultarLote;
    private javax.swing.JMenuItem itemConsultarProd;
    private javax.swing.JMenuItem itemEspTaller;
    private javax.swing.JMenuItem itemNuevoLote;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JLabel labelImagenUsuario;
    private javax.swing.JLabel labelPrincipal;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JMenu menuNuevoViaje;
    private javax.swing.JMenu menuVerViaje;
    private javax.swing.JPanel pnlUsuarioLogin;
    // End of variables declaration//GEN-END:variables

    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
