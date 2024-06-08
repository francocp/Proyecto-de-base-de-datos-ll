package vista;

import java.awt.Dimension;
import javax.swing.JDesktopPane;


/**
 *
 * @author mikey
 */
public class FRMMenu extends javax.swing.JFrame {

    public static JDesktopPane jdp;
    
    public FRMMenu() {
        initComponents();
        this.setSize(new Dimension(1200, 700));
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de Ventas");
        
        setLayout(null);
        jdp = new JDesktopPane();
        int wight = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.jdp.setBounds(0, 0, wight, (height - 110));
        this.add(jdp);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jmiProductoNuevo = new javax.swing.JMenuItem();
        jmiGestionarProductos = new javax.swing.JMenuItem();
        jmiActualizarStock = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jmiCategoriaNueva = new javax.swing.JMenuItem();
        jmiGestionarCategoria = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmiClienteNuevo = new javax.swing.JMenuItem();
        jmiGestionarClientes = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jmiVentaNueva = new javax.swing.JMenuItem();
        jmiGestionarVentas = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jmiReportesClientes = new javax.swing.JMenuItem();
        jmiReportesCategorias = new javax.swing.JMenuItem();
        jmiReportesProductos = new javax.swing.JMenuItem();
        jmiReportesVentas = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jmiUsuarioNuevo = new javax.swing.JMenuItem();
        jmiGestionarUsuarios = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jmiVerHistorial = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jmiCerrarSesion = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        setPreferredSize(new java.awt.Dimension(150, 50));

        jMenu2.setText("Producto");
        jMenu2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(150, 50));

        jmiProductoNuevo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jmiProductoNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-producto.png"))); // NOI18N
        jmiProductoNuevo.setText("Producto Nuevo");
        jmiProductoNuevo.setPreferredSize(new java.awt.Dimension(190, 30));
        jMenu2.add(jmiProductoNuevo);

        jmiGestionarProductos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jmiGestionarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        jmiGestionarProductos.setText("Gestionar Productos");
        jmiGestionarProductos.setPreferredSize(new java.awt.Dimension(190, 30));
        jMenu2.add(jmiGestionarProductos);

        jmiActualizarStock.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jmiActualizarStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        jmiActualizarStock.setText("Actualizar Stock");
        jMenu2.add(jmiActualizarStock);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Categoría");
        jMenu5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(150, 50));

        jmiCategoriaNueva.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jmiCategoriaNueva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        jmiCategoriaNueva.setText("Categoría Nueva");
        jmiCategoriaNueva.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu5.add(jmiCategoriaNueva);

        jmiGestionarCategoria.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jmiGestionarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categorias.png"))); // NOI18N
        jmiGestionarCategoria.setText("Gestionar Categoría");
        jmiGestionarCategoria.setPreferredSize(new java.awt.Dimension(185, 30));
        jMenu5.add(jmiGestionarCategoria);

        jMenuBar1.add(jMenu5);

        jMenu4.setText("Cliente");
        jMenu4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(150, 50));

        jmiClienteNuevo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jmiClienteNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-cliente.png"))); // NOI18N
        jmiClienteNuevo.setText("Cliente Nuevo");
        jmiClienteNuevo.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu4.add(jmiClienteNuevo);

        jmiGestionarClientes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jmiGestionarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jmiGestionarClientes.setText("Gestionar Clientes");
        jmiGestionarClientes.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu4.add(jmiGestionarClientes);

        jMenuBar1.add(jMenu4);

        jMenu6.setText("Facturaración");
        jMenu6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(150, 50));

        jmiVentaNueva.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jmiVentaNueva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir.png"))); // NOI18N
        jmiVentaNueva.setText("Venta Nueva");
        jmiVentaNueva.setPreferredSize(new java.awt.Dimension(165, 30));
        jMenu6.add(jmiVentaNueva);

        jmiGestionarVentas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jmiGestionarVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        jmiGestionarVentas.setText("Gestionar Ventas");
        jmiGestionarVentas.setPreferredSize(new java.awt.Dimension(165, 30));
        jMenu6.add(jmiGestionarVentas);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Reportes");
        jMenu7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenu7.setPreferredSize(new java.awt.Dimension(150, 50));

        jmiReportesClientes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jmiReportesClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jmiReportesClientes.setText("Reportes de Clientes");
        jmiReportesClientes.setPreferredSize(new java.awt.Dimension(210, 30));
        jMenu7.add(jmiReportesClientes);

        jmiReportesCategorias.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jmiReportesCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jmiReportesCategorias.setText("Reportes de Categorías");
        jmiReportesCategorias.setPreferredSize(new java.awt.Dimension(210, 30));
        jMenu7.add(jmiReportesCategorias);

        jmiReportesProductos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jmiReportesProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jmiReportesProductos.setText("Reportes de Productos");
        jmiReportesProductos.setPreferredSize(new java.awt.Dimension(210, 30));
        jMenu7.add(jmiReportesProductos);

        jmiReportesVentas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jmiReportesVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jmiReportesVentas.setText("Reportes de Ventas");
        jmiReportesVentas.setPreferredSize(new java.awt.Dimension(210, 30));
        jMenu7.add(jmiReportesVentas);

        jMenuBar1.add(jMenu7);

        jMenu1.setText("Usuario");
        jMenu1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(150, 50));

        jmiUsuarioNuevo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jmiUsuarioNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-cliente.png"))); // NOI18N
        jmiUsuarioNuevo.setText("Usuario Nuevo");
        jmiUsuarioNuevo.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu1.add(jmiUsuarioNuevo);

        jmiGestionarUsuarios.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jmiGestionarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        jmiGestionarUsuarios.setText("Gestionar Usuarios");
        jmiGestionarUsuarios.setPreferredSize(new java.awt.Dimension(190, 30));
        jMenu1.add(jmiGestionarUsuarios);

        jMenuBar1.add(jMenu1);

        jMenu8.setText("Historial");
        jMenu8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenu8.setPreferredSize(new java.awt.Dimension(150, 50));

        jmiVerHistorial.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jmiVerHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historial1.png"))); // NOI18N
        jmiVerHistorial.setText("Ver Historial");
        jmiVerHistorial.setPreferredSize(new java.awt.Dimension(160, 40));
        jMenu8.add(jmiVerHistorial);

        jMenuBar1.add(jMenu8);

        jMenu9.setText("Cerrar Sesión");
        jMenu9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenu9.setPreferredSize(new java.awt.Dimension(150, 50));

        jmiCerrarSesion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jmiCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jmiCerrarSesion.setText("Cerrar Sesión");
        jmiCerrarSesion.setPreferredSize(new java.awt.Dimension(165, 40));
        jMenu9.add(jmiCerrarSesion);

        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FRMMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmiActualizarStock;
    private javax.swing.JMenuItem jmiCategoriaNueva;
    private javax.swing.JMenuItem jmiCerrarSesion;
    private javax.swing.JMenuItem jmiClienteNuevo;
    private javax.swing.JMenuItem jmiGestionarCategoria;
    private javax.swing.JMenuItem jmiGestionarClientes;
    private javax.swing.JMenuItem jmiGestionarProductos;
    private javax.swing.JMenuItem jmiGestionarUsuarios;
    private javax.swing.JMenuItem jmiGestionarVentas;
    private javax.swing.JMenuItem jmiProductoNuevo;
    private javax.swing.JMenuItem jmiReportesCategorias;
    private javax.swing.JMenuItem jmiReportesClientes;
    private javax.swing.JMenuItem jmiReportesProductos;
    private javax.swing.JMenuItem jmiReportesVentas;
    private javax.swing.JMenuItem jmiUsuarioNuevo;
    private javax.swing.JMenuItem jmiVentaNueva;
    private javax.swing.JMenuItem jmiVerHistorial;
    // End of variables declaration//GEN-END:variables
}
