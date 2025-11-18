public abstract class ServiceNonPermanant extends Service {
    ServiceNonPermanant(int heuresDues) {
        super(heuresDues, new HeuresTPNonPermanent(), new AjoutControle());
    }
}
