package tugaspraktikum.tugaspraktikum9;

public class asd extends MataKuliah {
    @Override
    public double hitungNilai(double tugas, double kuis, double uts, double uas) {
        // Rumus ASD: Tugas(20%), Kuis(20%), UTS(30%), UAS(30%)
        return (tugas * 0.20) + (kuis * 0.20) + (uts * 0.30) + (uas * 0.30);
    }
}