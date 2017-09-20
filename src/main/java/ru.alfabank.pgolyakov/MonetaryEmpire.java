package ru.alfabank.pgolyakov;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavel on 06.09.2017.
 */
public class MonetaryEmpire {


    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        warehouse1.getLinens().add(new Linen("Бранд", 1700, "Наволочка Бранд"));
        warehouse1.getVegetables().add(new Vegetable("Томат", 100, "Томат новогорский"));
        warehouse1.getVegetables().add(new Vegetable("Перец", 160, "Перец красный"));
        warehouse1.getVegetables().add(new Vegetable("Огурец", 130, "Огурец Тамбовскией"));

    }
}


class Warehouse {
    List<Vegetable> vegetables = new ArrayList<Vegetable>();
    List<Linen> linens = new ArrayList<Linen>();

    public List<Vegetable> getVegetables() {
        return vegetables;
    }

    public void setVegetables(List<Vegetable> vegetables) {
        this.vegetables = vegetables;
    }

    public List<Linen> getLinens() {
        return linens;
    }

    public void setLinens(List<Linen> linens) {
        this.linens = linens;
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
