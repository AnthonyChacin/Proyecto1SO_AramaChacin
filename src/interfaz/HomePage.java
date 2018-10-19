package interfaz;

import java.awt.Color;
import logica.Aplicacion;
import logica.Parametros;

/**
 *
 * @autores: Anthony Chacin, carné: 20171110998 Elías Arama, carné: 20171110178
 */
public class HomePage extends javax.swing.JFrame {

    private Aplicacion app;
    Parametros param;

    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();

        this.app = new Aplicacion();
        param = app.getParam();
        this.inicializarParametros(param);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        areaProduccionLabel = new javax.swing.JLabel();
        imagenProduccionLabel = new javax.swing.JLabel();
        productorImagenLabel = new javax.swing.JLabel();
        productoresLabel = new javax.swing.JLabel();
        bateriasLabel = new javax.swing.JLabel();
        pantallasLabel = new javax.swing.JLabel();
        cableConexionLabel = new javax.swing.JLabel();
        textFieldProductorBaterias = new javax.swing.JTextField();
        textFieldProductorPantallas = new javax.swing.JTextField();
        textFieldProductorCables = new javax.swing.JTextField();
        contratarProductorBaterias = new javax.swing.JButton();
        contratarProductorPantallas = new javax.swing.JButton();
        contratarProductorCables = new javax.swing.JButton();
        despedirProductorBaterias = new javax.swing.JButton();
        despedirProductorPantallas = new javax.swing.JButton();
        despedirProductorCables = new javax.swing.JButton();
        almacenImagenLabel = new javax.swing.JLabel();
        almacenesLabel = new javax.swing.JLabel();
        almacenBateriasLabel = new javax.swing.JLabel();
        textFieldAlmacenBaterias = new javax.swing.JTextField();
        almacenPantallasLabel = new javax.swing.JLabel();
        textFieldAlmacenPantallas = new javax.swing.JTextField();
        almacenCablesLabel = new javax.swing.JLabel();
        textFieldAlmacenCables = new javax.swing.JTextField();
        separador1 = new javax.swing.JTextField();
        imagenEnsamblajeLabel = new javax.swing.JLabel();
        areaEnsamblajeLabel = new javax.swing.JLabel();
        ensambladorImagenLabel = new javax.swing.JLabel();
        ensambladoresLabel = new javax.swing.JLabel();
        textFieldEnsambladores = new javax.swing.JTextField();
        contratarEnsamblador = new javax.swing.JButton();
        despedirEnsamblador = new javax.swing.JButton();
        celularEnsambladoImagenLabel = new javax.swing.JLabel();
        celularesEnsambladosLabel = new javax.swing.JLabel();
        textFieldCelularesEnsamblados = new javax.swing.JTextField();
        separador2 = new javax.swing.JTextField();
        cronometradorImagenLabel = new javax.swing.JLabel();
        cronometradorLabel = new javax.swing.JLabel();
        textFieldCronometrador = new javax.swing.JTextField();
        gerenteImagenLabel = new javax.swing.JLabel();
        gerenteLabel = new javax.swing.JLabel();
        textFieldGerente = new javax.swing.JTextField();
        diasImagenLabel = new javax.swing.JLabel();
        diasLabel = new javax.swing.JLabel();
        textFieldDias = new javax.swing.JTextField();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(199, 221, 226));

        areaProduccionLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        areaProduccionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        areaProduccionLabel.setText("Área de producción");

        imagenProduccionLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/area_produccion.png"))); // NOI18N

        productorImagenLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/productor.png"))); // NOI18N

        productoresLabel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        productoresLabel.setForeground(new java.awt.Color(136, 0, 21));
        productoresLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productoresLabel.setText("Productores");

        bateriasLabel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        bateriasLabel.setForeground(new java.awt.Color(136, 0, 21));
        bateriasLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bateriasLabel.setText("Baterías:");

        pantallasLabel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        pantallasLabel.setForeground(new java.awt.Color(136, 0, 21));
        pantallasLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pantallasLabel.setText("Pantallas:");

        cableConexionLabel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        cableConexionLabel.setForeground(new java.awt.Color(136, 0, 21));
        cableConexionLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cableConexionLabel.setText("Cables:");

        textFieldProductorBaterias.setEditable(false);
        textFieldProductorBaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldProductorBateriasActionPerformed(evt);
            }
        });

        textFieldProductorPantallas.setEditable(false);

        textFieldProductorCables.setEditable(false);

        contratarProductorBaterias.setBackground(new java.awt.Color(6, 65, 33));
        contratarProductorBaterias.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        contratarProductorBaterias.setForeground(new java.awt.Color(255, 255, 255));
        contratarProductorBaterias.setText("Contratar");
        contratarProductorBaterias.setBorder(null);

        contratarProductorPantallas.setBackground(new java.awt.Color(6, 65, 33));
        contratarProductorPantallas.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        contratarProductorPantallas.setForeground(new java.awt.Color(255, 255, 255));
        contratarProductorPantallas.setText("Contratar");
        contratarProductorPantallas.setBorder(null);

        contratarProductorCables.setBackground(new java.awt.Color(6, 65, 33));
        contratarProductorCables.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        contratarProductorCables.setForeground(new java.awt.Color(255, 255, 255));
        contratarProductorCables.setText("Contratar");
        contratarProductorCables.setBorder(null);

        despedirProductorBaterias.setBackground(new java.awt.Color(153, 0, 0));
        despedirProductorBaterias.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        despedirProductorBaterias.setForeground(new java.awt.Color(255, 255, 255));
        despedirProductorBaterias.setText("Despedir");
        despedirProductorBaterias.setBorder(null);

        despedirProductorPantallas.setBackground(new java.awt.Color(153, 0, 0));
        despedirProductorPantallas.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        despedirProductorPantallas.setForeground(new java.awt.Color(255, 255, 255));
        despedirProductorPantallas.setText("Despedir");
        despedirProductorPantallas.setBorder(null);

        despedirProductorCables.setBackground(new java.awt.Color(153, 0, 0));
        despedirProductorCables.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        despedirProductorCables.setForeground(new java.awt.Color(255, 255, 255));
        despedirProductorCables.setText("Despedir");
        despedirProductorCables.setBorder(null);

        almacenImagenLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/almacen.png"))); // NOI18N

        almacenesLabel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        almacenesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        almacenesLabel.setText("Almacenes");

        almacenBateriasLabel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        almacenBateriasLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        almacenBateriasLabel.setText("Baterías:");

        textFieldAlmacenBaterias.setEditable(false);

        almacenPantallasLabel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        almacenPantallasLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        almacenPantallasLabel.setText("Pantallas:");

        textFieldAlmacenPantallas.setEditable(false);

        almacenCablesLabel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        almacenCablesLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        almacenCablesLabel.setText("Cables:");

        textFieldAlmacenCables.setEditable(false);

        separador1.setEditable(false);
        separador1.setBackground(new java.awt.Color(81, 4, 22));
        separador1.setBorder(null);

        imagenEnsamblajeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ensamblaje.png"))); // NOI18N

        areaEnsamblajeLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        areaEnsamblajeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        areaEnsamblajeLabel.setText("Área de ensamblaje");

        ensambladorImagenLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ensamblador.png"))); // NOI18N

        ensambladoresLabel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        ensambladoresLabel.setForeground(new java.awt.Color(11, 57, 21));
        ensambladoresLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ensambladoresLabel.setText("Ensambladores:");

        textFieldEnsambladores.setEditable(false);

        contratarEnsamblador.setBackground(new java.awt.Color(6, 65, 33));
        contratarEnsamblador.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        contratarEnsamblador.setForeground(new java.awt.Color(255, 255, 255));
        contratarEnsamblador.setText("Contratar");
        contratarEnsamblador.setBorder(null);

        despedirEnsamblador.setBackground(new java.awt.Color(153, 0, 0));
        despedirEnsamblador.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        despedirEnsamblador.setForeground(new java.awt.Color(255, 255, 255));
        despedirEnsamblador.setText("Despedir");
        despedirEnsamblador.setBorder(null);

        celularEnsambladoImagenLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/celular_listo.png"))); // NOI18N

        celularesEnsambladosLabel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        celularesEnsambladosLabel.setForeground(new java.awt.Color(195, 75, 16));
        celularesEnsambladosLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        celularesEnsambladosLabel.setText("Celulares Ensamblados:");

        textFieldCelularesEnsamblados.setEditable(false);

        separador2.setEditable(false);
        separador2.setBackground(new java.awt.Color(81, 4, 22));
        separador2.setBorder(null);

        cronometradorImagenLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cronometrador.png"))); // NOI18N

        cronometradorLabel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        cronometradorLabel.setForeground(new java.awt.Color(187, 15, 23));
        cronometradorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cronometradorLabel.setText("Cronometrador");

        textFieldCronometrador.setEditable(false);

        gerenteImagenLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gerente.png"))); // NOI18N

        gerenteLabel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        gerenteLabel.setForeground(new java.awt.Color(0, 40, 81));
        gerenteLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gerenteLabel.setText("Gerente");

        textFieldGerente.setEditable(false);

        diasImagenLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dias_faltantes.png"))); // NOI18N

        diasLabel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        diasLabel.setForeground(new java.awt.Color(138, 55, 0));
        diasLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        diasLabel.setText("Días para el despacho ");

        textFieldDias.setEditable(false);
        textFieldDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDiasActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(0, 0, 0));
        salir.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("Salir");
        salir.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(bateriasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textFieldProductorBaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(contratarProductorBaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(despedirProductorBaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(pantallasLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textFieldProductorPantallas, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(contratarProductorPantallas, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(despedirProductorPantallas, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(28, 28, 28))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(cableConexionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textFieldProductorCables, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(contratarProductorCables, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(despedirProductorCables, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(imagenEnsamblajeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(areaEnsamblajeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(180, 180, 180))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(celularEnsambladoImagenLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(celularesEnsambladosLabel))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ensambladorImagenLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ensambladoresLabel)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(contratarEnsamblador, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(despedirEnsamblador, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldCelularesEnsamblados)
                                    .addComponent(textFieldEnsambladores))
                                .addGap(92, 92, 92))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(productorImagenLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(productoresLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(imagenProduccionLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(areaProduccionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(almacenImagenLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(almacenesLabel))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(almacenBateriasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(textFieldAlmacenBaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(almacenPantallasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(textFieldAlmacenPantallas, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(almacenCablesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(textFieldAlmacenCables, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(88, 88, 88)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(gerenteImagenLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(gerenteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cronometradorImagenLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cronometradorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textFieldCronometrador, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textFieldGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(diasImagenLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(diasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(textFieldDias, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(imagenProduccionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(areaProduccionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(productorImagenLabel)
                                    .addComponent(productoresLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldProductorBaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(contratarProductorBaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(despedirProductorBaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(bateriasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textFieldProductorPantallas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(contratarProductorPantallas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(despedirProductorPantallas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(pantallasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textFieldProductorCables, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cableConexionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contratarProductorCables, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(despedirProductorCables, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(areaEnsamblajeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(imagenEnsamblajeLabel, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(ensambladoresLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textFieldEnsambladores, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(ensambladorImagenLabel, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(contratarEnsamblador, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(despedirEnsamblador, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(celularEnsambladoImagenLabel)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(celularesEnsambladosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textFieldCelularesEnsamblados, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(almacenesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(almacenImagenLabel))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cronometradorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textFieldCronometrador, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(cronometradorImagenLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(almacenBateriasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldAlmacenBaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(almacenPantallasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldAlmacenPantallas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(almacenCablesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldAlmacenCables, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(gerenteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textFieldGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(gerenteImagenLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(diasImagenLabel)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(diasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textFieldDias, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldProductorBateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldProductorBateriasActionPerformed

    }//GEN-LAST:event_textFieldProductorBateriasActionPerformed

    private void textFieldDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldDiasActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });

    }

    public void inicializarParametros(Parametros param) {
        textFieldProductorBaterias.setText(String.valueOf(this.param.getNumIniProdBat()));
        textFieldProductorPantallas.setText(String.valueOf(this.param.getNumIniProdPan()));
        textFieldProductorCables.setText(String.valueOf(this.param.getNumIniProdCab()));
        textFieldCelularesEnsamblados.setText(String.valueOf(0));
        textFieldAlmacenBaterias.setText(String.valueOf(0));
        textFieldAlmacenCables.setText(String.valueOf(0));
        textFieldAlmacenPantallas.setText(String.valueOf(0));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel almacenBateriasLabel;
    private javax.swing.JLabel almacenCablesLabel;
    private javax.swing.JLabel almacenImagenLabel;
    private javax.swing.JLabel almacenPantallasLabel;
    private javax.swing.JLabel almacenesLabel;
    private javax.swing.JLabel areaEnsamblajeLabel;
    private javax.swing.JLabel areaProduccionLabel;
    private javax.swing.JLabel bateriasLabel;
    private javax.swing.JLabel cableConexionLabel;
    private javax.swing.JLabel celularEnsambladoImagenLabel;
    private javax.swing.JLabel celularesEnsambladosLabel;
    private javax.swing.JButton contratarEnsamblador;
    private javax.swing.JButton contratarProductorBaterias;
    private javax.swing.JButton contratarProductorCables;
    private javax.swing.JButton contratarProductorPantallas;
    private javax.swing.JLabel cronometradorImagenLabel;
    private javax.swing.JLabel cronometradorLabel;
    private javax.swing.JButton despedirEnsamblador;
    private javax.swing.JButton despedirProductorBaterias;
    private javax.swing.JButton despedirProductorCables;
    private javax.swing.JButton despedirProductorPantallas;
    private javax.swing.JLabel diasImagenLabel;
    private javax.swing.JLabel diasLabel;
    private javax.swing.JLabel ensambladorImagenLabel;
    private javax.swing.JLabel ensambladoresLabel;
    private javax.swing.JLabel gerenteImagenLabel;
    private javax.swing.JLabel gerenteLabel;
    private javax.swing.JLabel imagenEnsamblajeLabel;
    private javax.swing.JLabel imagenProduccionLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pantallasLabel;
    private javax.swing.JLabel productorImagenLabel;
    private javax.swing.JLabel productoresLabel;
    private javax.swing.JButton salir;
    private javax.swing.JTextField separador1;
    private javax.swing.JTextField separador2;
    public static javax.swing.JTextField textFieldAlmacenBaterias;
    public static javax.swing.JTextField textFieldAlmacenCables;
    public static javax.swing.JTextField textFieldAlmacenPantallas;
    public static javax.swing.JTextField textFieldCelularesEnsamblados;
    private javax.swing.JTextField textFieldCronometrador;
    private javax.swing.JTextField textFieldDias;
    private javax.swing.JTextField textFieldEnsambladores;
    private javax.swing.JTextField textFieldGerente;
    private javax.swing.JTextField textFieldProductorBaterias;
    private javax.swing.JTextField textFieldProductorCables;
    private javax.swing.JTextField textFieldProductorPantallas;
    // End of variables declaration//GEN-END:variables

}
