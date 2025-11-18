class ServicePermanentDecharge extends Service {
    ServicePermanentDecharge(int decharge) {
        super(192 - decharge, new HeuresTPPermanent(), new AjoutControle());
    }
}