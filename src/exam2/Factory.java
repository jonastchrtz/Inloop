package exam2;

public class Factory {

    private ReceivingStock receivingStock;
    private Purchasing purchasing;

    public Factory(Purchasing purchasing, ReceivingStock receivingStock) {

        if(purchasing == null | receivingStock == null) {throw new NullPointerException();}

        this.receivingStock = receivingStock;
        this.purchasing = purchasing;

    }

    public Purchasing getPurchasing() {return purchasing;}

    public ReceivingStock getReceivingStock() {return receivingStock;}

    public static Part createPart(PartType partType, String id, String name) {

        switch(partType) {

            case RESOURCE: return new Resource(id, name);

            case SINGLE_COMPONENT: return new SingleComponent(id, name);

            case COMPONENTS: return new Components(id, name);

            default: return null;
        }

    }

}
