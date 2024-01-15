package app.model.implmnts;

import app.model.AppModel;
import app.entity.Purchase;

public class AppWithoutDeliveryModel implements AppModel {
    public double calculateAmountDue(Purchase purchase) {

        return purchase.getPrice() * purchase.getQuantity();
    }
}
