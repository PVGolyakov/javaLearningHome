package ru.alfabank.pgolyakov;

import java.util.Arrays;

/**
 * Created by Pavel on 06.09.2017.
 */
public class MonetaryEmpire {


}

class Warehouse {
    Vegetable[] vegetables = new Vegetable[2];
    Linens[] linens = {null, null};


    public static void main(String[] args) {
        Vegetable allVegs = new Vegetable("овощи", 150);
        Linens allLinens = new Linens("белье", 100);

        allVegs.nameVegetable();
        allLinens.nameLinens();


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
    String typeProduct; //Тип продукта
    Integer priceProduct; //Цена

    Product(String typeProduct, Integer priceProduct) {
        this.typeProduct = typeProduct;
        this.priceProduct = priceProduct;
    }
}

class Vegetable extends Product {
    String nameVegetable; //Название овоща

    public Vegetable(String typeProduct, Integer priceProduct) {
        super(typeProduct, priceProduct);
    }


    public void nameVegetable() {
        System.out.println(nameVegetable);
    }
}

class Linens extends Product {
    String brandLines; //Марка постельного белья

    public Linens(String typeProduct, Integer priceProduct) {
        super(typeProduct, priceProduct);
    }


    public void nameLinens() {
        System.out.println(brandLines);
    }
}