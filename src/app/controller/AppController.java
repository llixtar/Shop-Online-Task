package app.controller;

import app.model.implmnts.AppDeliveryModel;
import app.utils.Utils;
import app.view.AppView;
import app.entity.Buyer;
import app.entity.Purchase;
import app.model.implmnts.AppWithoutDeliveryModel;

public class AppController {

    double[][] watchPrices = {{1599.99, 1049.99, 1749.99},
            {2499.99, 2999.99, 1999.99},
            {749.99, 599.99, 799.99}};

    static String totalPrice;

    private final AppView view = new AppView();

    public void getOrder() {
        view.getCaption();

        int categoryProduct = view.getCategoryProduct();
        int modelProduct = view.getModelProduct(categoryProduct, watchPrices);
        double price = getPrice(categoryProduct, modelProduct);
        int quantity = view.getQuantity();

        Purchase purchase = new Purchase(quantity, price, view.nameWatches[categoryProduct][modelProduct]);

        if (view.getTypeDelivery() == 1) {
            AppWithoutDeliveryModel model = new AppWithoutDeliveryModel();
            totalPrice = Utils.roundValue(model.calculateAmountDue(purchase));
        } else {
            AppDeliveryModel model = new AppDeliveryModel();
            totalPrice = Utils.roundValue(model.calculateAmountDue(purchase));
        }

        String data[] = view.getBuyerData();
        Buyer buyer = new Buyer(data[0], data[1], data[2], data[3]);

        prepareOutputData(purchase, buyer);
    }

    //------------------------------------------------------------------------------------------------------------------
    private double getPrice(int categoryProduct, int modelProduct) {
        return watchPrices[categoryProduct][modelProduct];
    }
    //------------------------------------------------------------------------------------------------------------------
    private void prepareOutputData(Purchase purchase, Buyer buyer) {

        view.orderResult(String.format("Дякуємо за замовлення!%n" +
                        "Годинник: %s%n" +
                        "Кількість: %d%n" +
                        "Ціна: %.2f грн.%n" +
                        "%n" +
                        "Замовник: %s%n" +
                        "Телефон: %s%n" +
                        "Адреса: %s%n" +
                        "Номер почтового відділення: %s%n" +
                        "%n" +
                        "Сума до сплати: %s грн.",
                purchase.getNameProd(), purchase.getQuantity(), purchase.getPrice(),
                buyer.getName(), buyer.getPhone(), buyer.getCity(), buyer.getNumPost(), totalPrice));

    }
    //------------------------------------------------------------------------------------------------------------------
}
