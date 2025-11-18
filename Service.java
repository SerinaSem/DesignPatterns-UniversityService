class Service {
    private final HeuresCours heuresCours = new HeuresCours();
    private final HeuresTD heuresTD = new HeuresTD();
    private final HeuresTP heuresTP;
    private final int heuresDues;
    private StrategieAjout strategieAjout;

    Service(int h, HeuresTP heuresTP, StrategieAjout strategieAjout) {
        heuresDues = h;
        this.heuresTP = heuresTP;
        this.strategieAjout = strategieAjout;
    }

    HeuresCours getHeuresCours() {
        return heuresCours;
    }

    HeuresTD getHeuresTD() {
        return heuresTD;
    }

    HeuresTP getHeuresTP() {
        return heuresTP;
    }

    int getHeuresDues() {
        return heuresDues;
    }

    void ajoute(HeuresEnseignement type, int h) {
        strategieAjout.ajoute(type, h, this);
    }

    int heuresEqTDEffectuees() {
        return (int) (heuresCours.getCoeff() * heuresCours.getQte()
                + heuresTD.getCoeff() * heuresTD.getQte() + heuresTP.getCoeff() * heuresTP.getQte());
    }
}