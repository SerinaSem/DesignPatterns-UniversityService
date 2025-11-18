public class ServicePermanent extends Service {
    ServicePermanent() {
        super(192, new HeuresTPPermanent(), new AjoutNonControle());
    }

    boolean serviceFait() {
        return heuresEqTDEffectuees() >= getHeuresDues();
    }


    int nbHeuresSup() {
        int h = heuresEqTDEffectuees() - getHeuresDues();
        if (h > 0)
            return h;
        else
            return 0;
    }
}
