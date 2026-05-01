package tugaspraktikum.tugaspraktikum9;

public class probstat extends MataKuliah {
    @Override
    public double hitungNilai(double tugas, double kuis, double uts, double uas) {
        // Rumus Probstat: Tugas(25%), Kuis(25%), UTS(25%), UAS(25%)
        return (tugas * 0.25) + (kuis * 0.25) + (uts * 0.25) + (uas * 0.25);
    }
}