package ru.alfabank.pgolyakov;

/**
 * Created by Pavel on 06.09.2017.
 */
public class MonetaryEmpire {


}

class Warehouse {
    Vegetable[] vegetables = new Vegetable[2];
    Linens[] linens = {null, null};


    public static void main(String[] args) {
//        Vegetable allVegs = new Vegetable("овощи", 150);
//        Linens allLinens = new Linens("белье", 100);

//        allVegs.nameVegetable();
//        allLinens.nameLinens();


    }

    void canPutVegetable(Vegetable[] nameVegetables) {
        System.out.println(vegetables);
    }

    void canTakeVegetable(Vegetable[] nameVegetable) {
        System.out.println(vegetables);
    }

    void canPutLinens(Linens[] nameLinens) {
        System.out.println(linens);
    }

    void canTakeLinens(Linens[] nameLinens) {
        System.out.println(linens);
    }


}


class Product {
     String articleCode; //Номер товара
    Integer priceProduct; //Цена
    String prodName; //Название продукта

    Product(String articleCode, Integer priceProduct, String prodName) {
        this.articleCode = articleCode;
        this.priceProduct = priceProduct;
        this.prodName = prodName;
    }
}

class Vegetable extends Product {
    String vendorCode; //Код поставщика

    Vegetable(String articleCode, Integer priceProduct, String prodName) {
        super(articleCode, priceProduct, prodName);
    }

    public void nameVegetable() {
        System.out.println(vendorCode);
    }
}

class Linens extends Product {
    String brandLines; //Марка постельного белья

    Linens(String articleCode, Integer priceProduct, String prodName) {
        super(articleCode, priceProduct, prodName);
    }


    public void nameLinens() {
        System.out.println(brandLines);
    }
}