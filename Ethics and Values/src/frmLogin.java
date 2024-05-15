import javax.swing.*;
import java.awt.*;

public class frmLogin extends JFrame {
    static ImageIcon imgUsuario, imgContraseña;

    static JLabel lblUsuario, lblContraseña, lblGmail, lblCandado;
    static JTextField txtUsuario;
    static JPasswordField txtContraseña;
    static frmLogin ventanaLogin;
    public frmLogin() {

        // funcion panel AQUI AGREGAMOS LAS IMAGNES DEL FONDO
        JPanel contentPane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                ImageIcon fondo = new ImageIcon(".\\img\\fondo.jpg");
                g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this); // getWidth(), getHeight() es para que coja el ancho y el largo de la imagen y se ajuste

            }
        };

        // imagenes
        imgUsuario = new ImageIcon(".\\img\\gmail.png");
        imgContraseña = new ImageIcon(".\\img\\candado.png");

        // lbales
        lblUsuario = new JLabel("Usuario:");
        lblContraseña = new JLabel("Contraseña:");
        lblGmail = new JLabel(imgUsuario);
        lblCandado = new JLabel(imgContraseña);

        // txt
        txtUsuario = new JTextField();
        txtContraseña = new JPasswordField();

        // Bounds
        lblGmail.setBounds(90, 350, 40, 40);
        lblUsuario.setBounds(150,325,80,40);
        txtUsuario.setBounds(150,355,170,30);

        lblCandado.setBounds(90, 420, 40, 40);
        lblContraseña.setBounds(150,395,80,40);
        txtContraseña.setBounds(150,425,170,30);

        // agregar al panel
        contentPane.add(lblGmail);
        contentPane.add(lblUsuario);
        contentPane.add(txtUsuario);

        contentPane.add(lblCandado);
        contentPane.add(lblContraseña);
        contentPane.add(txtContraseña);



        // configuración de pantalla
        setContentPane(contentPane);
        setLayout(null);
        setSize(450, 800);
        setTitle("Login");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        ventanaLogin = new frmLogin();
        ventanaLogin.setVisible(true);
    }
}
