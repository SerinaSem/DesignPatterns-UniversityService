public class AjoutControle extends AjoutNonControle {
    @Override
    public void ajoute(HeuresEnseignement type, int heures, Service s) {
        if (type.getCoeff() * heures + s.heuresEqTDEffectuees() <= s.getHeuresDues())
            super.ajoute(type, heures, s);
        else
            System.out.println("Trop d’heures");
    }
}
