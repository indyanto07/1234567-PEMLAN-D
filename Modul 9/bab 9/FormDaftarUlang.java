package tugaspraktikum.tugaspraktikum9.bab9;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormDaftarUlang extends JFrame {

    private JTextField txtNama, txtTglLahir, txtNoPend, txtNoTelp, txtEmail;
    private JTextArea txtAlamat;
    private JButton btnSubmit;

    public FormDaftarUlang() {
        setTitle("Form Daftar Ulang Mahasiswa Baru");
        setSize(500, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        setLayout(new BorderLayout());
        getContentPane().setBackground(new Color(240, 248, 255)); 

        // Panel Header
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(70, 130, 180)); 
        JLabel lblTitle = new JLabel("Form Daftar Ulang Mahasiswa Baru");
        lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 18));
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setBorder(new EmptyBorder(15, 10, 15, 10));
        headerPanel.add(lblTitle);

        // Panel Form
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(new Color(240, 248, 255));
        formPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        txtNama = new JTextField(20);
        txtTglLahir = new JTextField(20);
        txtNoPend = new JTextField(20);
        txtNoTelp = new JTextField(20);
        txtEmail = new JTextField(20);
        txtAlamat = new JTextArea(4, 20);
        txtAlamat.setLineWrap(true);
        txtAlamat.setWrapStyleWord(true);
        txtAlamat.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        JScrollPane scrollAlamat = new JScrollPane(txtAlamat);

        addField(formPanel, gbc, "Nama Lengkap", txtNama, 0);
        addField(formPanel, gbc, "Tanggal Lahir", txtTglLahir, 1);
        addField(formPanel, gbc, "Nomor Pendaftaran", txtNoPend, 2);
        addField(formPanel, gbc, "No. Telp", txtNoTelp, 3);
        
        gbc.gridx = 0; gbc.gridy = 4;
        JLabel lblAlamat = new JLabel("Alamat");
        lblAlamat.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        formPanel.add(lblAlamat, gbc);
        gbc.gridx = 1; gbc.gridy = 4;
        formPanel.add(scrollAlamat, gbc);

        addField(formPanel, gbc, "E-mail", txtEmail, 5);

        // Panel Tombol
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.setBackground(new Color(240, 248, 255));
        buttonPanel.setBorder(new EmptyBorder(0, 20, 20, 20));
        btnSubmit = new JButton("Submit");
        btnSubmit.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnSubmit.setBackground(new Color(60, 179, 113)); 
        btnSubmit.setForeground(Color.BLACK);
        btnSubmit.setFocusPainted(false);
        buttonPanel.add(btnSubmit);

        add(headerPanel, BorderLayout.NORTH);
        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prosesSubmit();
            }
        });
    }

    private void addField(JPanel panel, GridBagConstraints gbc, String labelText, JTextField textField, int yPos) {
        gbc.gridx = 0; gbc.gridy = yPos;
        JLabel label = new JLabel(labelText);
        label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        panel.add(label, gbc);

        gbc.gridx = 1; gbc.gridy = yPos;
        textField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        panel.add(textField, gbc);
    }

    private void prosesSubmit() {
        if (txtNama.getText().trim().isEmpty() || 
            txtTglLahir.getText().trim().isEmpty() || 
            txtNoPend.getText().trim().isEmpty() || 
            txtNoTelp.getText().trim().isEmpty() || 
            txtAlamat.getText().trim().isEmpty() || 
            txtEmail.getText().trim().isEmpty()) {
            
            JOptionPane.showMessageDialog(this, 
                "Peringatan: Semua kolom wajib diisi!", 
                "Data Tidak Lengkap", 
                JOptionPane.WARNING_MESSAGE);
            return; 
        }

        int pilihan = JOptionPane.showConfirmDialog(this, 
            "Apakah anda yakin data yang Anda isi sudah benar?", 
            "Konfirmasi Data", 
            JOptionPane.OK_CANCEL_OPTION, 
            JOptionPane.QUESTION_MESSAGE);

        if (pilihan == JOptionPane.OK_OPTION) {
           
            ResultFrame frameHasil = new ResultFrame(
                txtNama.getText(),
                txtTglLahir.getText(),
                txtNoPend.getText(),
                txtNoTelp.getText(),
                txtAlamat.getText(),
                txtEmail.getText()
            );
            
            this.setVisible(false); 
            frameHasil.setVisible(true); 
        }
    }
}
