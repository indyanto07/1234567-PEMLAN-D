package tugaspraktikum.tugaspraktikum9;

public class matkomlan extends MataKuliah {
    @Override
    public double hitungNilai(double tugas, double kuis, double uts, double uas) {
        // Rumus Matkomlan: Tugas(10%), Kuis(20%), UTS(30%), UAS(40%)
        return (tugas * 0.10) + (kuis * 0.20) + (uts * 0.30) + (uas * 0.40);
    }
}
