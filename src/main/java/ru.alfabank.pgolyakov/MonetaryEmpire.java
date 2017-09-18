package ru.alfabank.pgolyakov;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavel on 06.09.2017.
 */
public class MonetaryEmpire {


    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        List<Vegetable> vegetableArrayList = new ArrayList<Vegetable>();
        List<Linen> linenArrayList = new ArrayList<Linen>();

        vegetableArrayList.add(new Vegetable("Томат", 100, "Томат новогорский"));
        linenArrayList.add(new Linen("Бранд", 1700, "Наволочка Бранд"));

        System.out.println(warehouse1);






    }
}


class Warehouse {


    public static void main(String[] args) {


        List<Vegetable> vegetables = new ArrayList<Vegetable>();
        vegetables.add(new Vegetable("Томат", 100, "Томат новогорский"));
        vegetables.add(new Vegetable("Огурец", 120, "Огурец Тамбовский"));
        vegetables.add(new Vegetable("Перец", 160, "Перец красный"));


        for (
                Vegetable takeVegetable : vegetables)

        {
            System.out.println(takeVegetable);
        }


        List<Linen> linens = new ArrayList<Linen>();
        linens.add(new Linen("Золушка", 1600, "Комплект двуспального белья Золушка"));
        linens.add(new Linen("Бранд", 1700, "Наволочка Бранд"));


        for (Linen takeLinen : linens)

        {
            System.out.println(takeLinen);
        }

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

class Linen extends Product {
    String brandLine; //Марка постельного белья

    Linen(String articleCode, Integer priceProduct, String prodName) {
        super(articleCode, priceProduct, prodName);
    }


    public void nameLinen() {
        System.out.println(brandLine);
    }
}
