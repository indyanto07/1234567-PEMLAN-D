package tugaspraktikum.tugaspraktikum9.bab9;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ResultFrame extends JFrame {

    // Constructor menerima data dari FormDaftarUlang
    public ResultFrame(String nama, String tglLahir, String noPend, String noTelp, String alamat, String email) {
        setTitle("Data Mahasiswa");
        setSize(450, 400);
        setLocationRelativeTo(null); // Menengahkan jendela
        setLayout(new BorderLayout());
        getContentPane().setBackground(Color.WHITE);

        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(70, 130, 180));
        // Judul Hasil
        JLabel lblResultTitle = new JLabel("Data Mahasiswa Berhasil Disimpan", SwingConstants.CENTER);
        lblResultTitle.setFont(new Font("Segoe UI", Font.BOLD, 16));
        lblResultTitle.setBorder(new EmptyBorder(20, 10, 10, 10));
        lblResultTitle.setForeground(Color.WHITE);
        headerPanel.add(lblResultTitle);
        add(headerPanel, BorderLayout.NORTH);

        // Area Teks untuk Data
        JTextArea txtResultDisplay = new JTextArea();
        txtResultDisplay.setEditable(false); // Tidak bisa diedit user
        txtResultDisplay.setFont(new Font("Monospaced", Font.PLAIN, 14));
        txtResultDisplay.setBorder(BorderFactory.createCompoundBorder(
                new EmptyBorder(10, 20, 20, 20),
                BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1)
        ));
        txtResultDisplay.setBackground(new Color(245, 245, 245));

        // Menampilkan data
        String hasil = String.format(
            "\n  %-15s : %s\n" +
            "  %-15s : %s\n" +
            "  %-15s : %s\n" +
            "  %-15s : %s\n" +
            "  %-15s : %s\n" +
            "  %-15s : %s\n",
            "Nama", nama, "Tanggal Lahir", tglLahir, "No. Pendaftaran", noPend, "No. Telp", noTelp, "Alamat", alamat, "E-mail", email
        );
        
        txtResultDisplay.setText(hasil);
        add(txtResultDisplay, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
