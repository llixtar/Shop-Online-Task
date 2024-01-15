package app.model.implmnts;

import app.entity.Purchase;
import app.model.AppModel;

public class AppDeliveryModel implements AppModel {
    private final static int PERSENT = 5;
    public double calculateAmountDue(Purchase purchase) {
        double prise = purchase.getPrice() * purchase.getQuantity();
        return prise + ((prise * PERSENT) / 100);
    }
}
