abstract class HeuresEnseignement {
    private int qte;
    private final double coeff;

    int getQte() {
        return qte;
    }

    void ajoute(int h) {
        qte = qte + h;
    }

    double getCoeff() {
        return coeff;
    }

    HeuresEnseignement(double coeff) {
        this.coeff = coeff;
    }
}