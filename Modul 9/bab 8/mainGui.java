package tugaspraktikum.tugaspraktikum9;

import java.awt.*;
import java.awt.event.*;
public class mainGui extends Frame {
    
    double nil1 = 0;
    double nil2 = 0;
    double nil3 = 0;
    double nil4 = 0;

    public mainGui() {
        super("Hitung Nilai"); 
        setLayout(null); 
        setSize(420, 550); 

        // JLabel jadi Label
        Label jdl = new Label("Hitung Nilai Akhir");
        jdl.setBounds(150, 40, 200, 30); 
        add(jdl);

        
        CheckboxGroup bg = new CheckboxGroup();
        Checkbox r1 = new Checkbox("ASD", bg, false);
        Checkbox r2 = new Checkbox("Pemlan", bg, true); 
        Checkbox r3 = new Checkbox("Matkomlan", bg, false);
        Checkbox r4 = new Checkbox("Probstat", bg, false);

        r1.setBounds(20, 80, 60, 20);
        r2.setBounds(90, 80, 80, 20);
        r3.setBounds(180, 80, 90, 20);
        r4.setBounds(280, 80, 90, 20);

        add(r1); add(r2); add(r3); add(r4);

        // Komponen GUI
        Label l1 = new Label("Tugas :"); l1.setBounds(80, 130, 60, 20); add(l1);
        TextField t1 = new TextField(); t1.setBounds(150, 130, 120, 20); add(t1);

        Label l2 = new Label("Kuis :"); l2.setBounds(80, 160, 60, 20); add(l2);
        TextField t2 = new TextField(); t2.setBounds(150, 160, 120, 20); add(t2);

        Label l3 = new Label("UTS :"); l3.setBounds(80, 190, 60, 20); add(l3);
        TextField t3 = new TextField(); t3.setBounds(150, 190, 120, 20); add(t3);

        Label l4 = new Label("UAS :"); l4.setBounds(80, 220, 60, 20); add(l4);
        TextField t4 = new TextField(); t4.setBounds(150, 220, 120, 20); add(t4);

        Label l5 = new Label("Hasil :"); l5.setBounds(80, 260, 60, 20); add(l5);
        TextField t5 = new TextField(); t5.setBounds(150, 260, 120, 20); add(t5);
        t5.setEditable(false);

        Button b1 = new Button("Hitung");
        b1.setBounds(160, 300, 100, 30);
        add(b1);

        TextArea ta = new TextArea();
        ta.setBounds(40, 350, 320, 110);
        ta.setFont(new Font("Monospaced", Font.PLAIN, 12));
        add(ta); 

        Button b2 = new Button("Tampilkan nilai semua matkul");
        b2.setBounds(40, 480, 320, 30);
        add(b2);

       
        ItemListener resetListener = new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                t1.setText(""); t2.setText(""); t3.setText(""); t4.setText(""); t5.setText("");
            }
        };
        r1.addItemListener(resetListener);
        r2.addItemListener(resetListener);
        r3.addItemListener(resetListener);
        r4.addItemListener(resetListener);

        // Tombol Hitung
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(t1.getText());
                    double b = Double.parseDouble(t2.getText());
                    double c = Double.parseDouble(t3.getText());
                    double d = Double.parseDouble(t4.getText());
                    
                    double h = 0;
                    
                    
                    if(r1.getState() == true) {
                        asd x = new asd();
                        h = x.hitungNilai(a,b,c,d);
                        nil1 = h;
                    }
                    if(r2.getState() == true) {
                        pemlan x = new pemlan();
                        h = x.hitungNilai(a,b,c,d);
                        nil2 = h;
                    }
                    if(r3.getState() == true) {
                        matkomlan x = new matkomlan();
                        h = x.hitungNilai(a,b,c,d);
                        nil3 = h;
                    }
                    if(r4.getState() == true) {
                        probstat x = new probstat();
                        h = x.hitungNilai(a,b,c,d);
                        nil4 = h;
                    }

                    
                    t5.setText(String.format("%.2f", h));

                } catch (Exception ex) {
                    System.out.println("error bang: " + ex);
                }
            }
        });

        // Tombol Tampil
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            ta.setText("HASIL NILAI SEMUA MATA KULIAH\n\n" +
            String.format("%-10s: %.2f","Pemlan", nil2) + "\n" +
            String.format("%-10s: %.2f","ASD", nil1) + "\n" +
            String.format("%-10s: %.2f","Matkomlan", nil3) + "\n" +
            String.format("%-10s: %.2f","Probstat", nil4));
            }
        });

    
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        mainGui f = new mainGui();
        f.setVisible(true);
    }
}