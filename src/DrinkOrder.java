public class DrinkOrder {
    public static void main(String[] args) {
        Drink drink1 = new Drink();
        drink1.name = "Janusz drynk";
        drink1.price = 9.99;
        drink1.alcohol = true;

drink1.ingredient1Name = "Wódka";
drink1.ingredient2Name = "Tequila";
drink1.ingredient3Name = "Zimna woda z kranu";
drink1.ingredient1Amount = 20;
drink1.ingredient2Amount = 30;
drink1.ingredient3Amount = 150;

int totalAmount = drink1.ingredient1Amount + drink1.ingredient2Amount + drink1.ingredient3Amount;

drink1.volumeMeasure = "ml";

        System.out.println("Nazwa drinka: " + drink1.name);
        System.out.println("Cena drinka: " + drink1.price + "zł");
        System.out.println("Drink alkoholowy: " + drink1.alcohol);
        System.out.println("Objętość drinka: "  + totalAmount + drink1.volumeMeasure);
        System.out.println("Skład drinka:");
        System.out.println(drink1.ingredient1Amount + drink1.volumeMeasure + " " + drink1.ingredient1Name);
        System.out.println(drink1.ingredient2Amount + drink1.volumeMeasure + " " + drink1.ingredient2Name);
        System.out.println(drink1.ingredient3Amount + drink1.volumeMeasure + " " + drink1.ingredient3Name);
    }
}
