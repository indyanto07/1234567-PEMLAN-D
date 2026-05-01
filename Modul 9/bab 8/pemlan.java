package tugaspraktikum.tugaspraktikum9;

public class pemlan extends MataKuliah {
    @Override
    public double hitungNilai(double tugas, double kuis, double uts, double uas) {
        // Rumus Pemlan: Tugas(30%), Kuis(20%), UTS(25%), UAS(25%)
        return (tugas * 0.30) + (kuis * 0.20) + (uts * 0.25) + (uas * 0.25);
    }
}
