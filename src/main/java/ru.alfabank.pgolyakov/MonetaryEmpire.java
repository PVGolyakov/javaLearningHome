package ru.alfabank.pgolyakov;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavel on 06.09.2017.
 */
public class MonetaryEmpire {


    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
/*
warehouse1.getProducts().add(new Linen("Бранд", 1700, "Наволочка Бранд"));
warehouse1.getProducts().add(new Vegetable("Томат", 100, "Томат новогорский"));
warehouse1.getProducts().add(new Vegetable("Перец", 160, "Перец красный"));
warehouse1.getProducts().add(new Vegetable("Огурец", 130, "Огурец Тамбовскией"));
*/
        System.out.println(warehouse1.getProducts().get(0).articleCode);
        System.out.println(warehouse1.getProducts().get(1).articleCode);
        System.out.println(warehouse1.getProducts().get(2).articleCode);
        System.out.println(warehouse1.getProducts().get(3).articleCode);

    }
}


class Warehouse {
    List<Vegetable> vegetables = new ArrayList<Vegetable>();
    List<Linen> linens = new ArrayList<Linen>();

    public List<Product> getProducts() {
        return products;
    }

    List<Product> products = new ArrayList<Product>();

    public List<Vegetable> getVegetables() {
        getVegetables().add(new Vegetable("Томат", 100, "Томат новогорский"));
        getVegetables().add(new Vegetable("Перец", 160, "Перец красный"));
        getVegetables().add(new Vegetable("Огурец", 130, "Огурец Тамбовскией"));
        return vegetables;
    }

    public List<Linen> getLinens() {
        getLinens().add(new Linen("Бранд", 1700, "Наволочка Бранд"));
        return linens;
    }






//list от Producta





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

class Linen extends Product {
    String brandLine; //Марка постельного белья

    Linen(String articleCode, Integer priceProduct, String prodName) {
        super(articleCode, priceProduct, prodName);
    }


    public void nameLinen() {
        System.out.println(brandLine);
    }
}
