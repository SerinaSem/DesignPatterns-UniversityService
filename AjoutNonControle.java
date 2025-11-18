public class AjoutNonControle implements StrategieAjout {
    @Override
    public void ajoute(HeuresEnseignement type, int heures, Service s) {
        type.ajoute(heures);
    }
}
