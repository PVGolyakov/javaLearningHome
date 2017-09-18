package ru.alfabank.pgolyakov;

public class Product {
    String articleCode; //Номер товара
    String prodName; //Название продукта
    Integer priceProduct; //Цена

    Product(String articleCode, Integer priceProduct, String prodName) {
        this.articleCode = articleCode;
        this.prodName = prodName;
        this.priceProduct = priceProduct;
    }

    @Override
    public String toString() {
        return articleCode + " " + prodName + " " + priceProduct;
    }
}
