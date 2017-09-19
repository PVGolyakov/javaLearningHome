package ru.alfabank.pgolyakov;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavel on 06.09.2017.
 */
public class MonetaryEmpire {


    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        List<Vegetable> vegetables = new ArrayList<Vegetable>();
        List<Linen> linens = new ArrayList<Linen>();


        vegetables.add(new Vegetable("Томат", 100, "Томат новогорский"));
        vegetables.add(new Vegetable("Огурец", 120, "Огурец Тамбовский"));
        vegetables.add(new Vegetable("Перец", 160, "Перец красный"));


        linens.add(new Linen("Золушка", 1600, "Комплект двуспального белья Золушка"));
        linens.add(new Linen("Бранд", 1700, "Наволочка Бранд"));



    }
}


class Warehouse {
    List<Vegetable> vegetables = new ArrayList<Vegetable>();
    List<Linen> linens = new ArrayList<Linen>();


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
