package editor.com.mvc.view;


        import java.awt.BorderLayout;
        import java.awt.Color;

        import javax.swing.ImageIcon;
        import javax.swing.JFrame;
        import javax.swing.JLabel;
        import javax.swing.SwingConstants;

public class About extends JFrame {

    public About() {
        setResizable(false);
        setTitle("About");
        setSize(400, 410);
        setBackground(new Color(245, 246, 247));
        JLabel lblLogo = new JLabel("");
        lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
       // lblLogo.setIcon(new ImageIcon(About.class.getResource("/assets/logo_paint_brush.jpg")));
        getContentPane().add(lblLogo, BorderLayout.NORTH);

        JLabel lblNewLabel = new JLabel("<html>"
                + "<h3> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;Student Project: 2D vector graphic editor  </h3>"
                + "<p> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Used Technologies: Java and Swing <p> </html>");
        lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(lblNewLabel, BorderLayout.CENTER);
        setLocation(300, 100);
        setVisible(true);


    }

}
