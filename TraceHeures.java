class TraceHeures extends Service {
    private final Service s;

    TraceHeures(Service s) {
        super(0, null, null);
        this.s = s;
    }

    @Override
    HeuresCours getHeuresCours() {
        return s.getHeuresCours();
    }

    @Override
    HeuresTD getHeuresTD() {
        return s.getHeuresTD();
    }

    @Override
    HeuresTP getHeuresTP() {
        return s.getHeuresTP();
    }

    @Override
    int getHeuresDues() {
        return s.getHeuresDues();
    }

    @Override
    void ajoute(HeuresEnseignement type, int h) {
        s.ajoute(type, h);
        System.out.println("hEqTD:" + heuresEqTDEffectuees());
    }

    @Override
    int heuresEqTDEffectuees() {
        return s.heuresEqTDEffectuees();
    }
}