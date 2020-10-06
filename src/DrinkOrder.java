public class DrinkOrder {
    public static void main(String[] args) {
        Drink drink1 = new Drink();
        drink1.name = "Janusz drynk";
        drink1.price = 9.99;
        drink1.alcohol = true;

        Ingredient1 ingredient1 = new Ingredient1();
        ingredient1.name = "wódka";
        ingredient1.amount = 20;

        Ingredient2 ingredient2 = new Ingredient2();
        ingredient2.name = "tequila";
        ingredient2.amount = 30;

        Ingredient3 ingredient3 = new Ingredient3();
        ingredient3.name = "zimna woda z kranu";
        ingredient3.amount = 150;

int totalAmount = ingredient1.amount + ingredient2.amount + ingredient3.amount;

        System.out.println("Nazwa drinka: " + drink1.name);
        System.out.println("Cena drinka: " + drink1.price + "zł");
        System.out.println("Drink alkoholowy: " + drink1.alcohol);
        System.out.println("Objętość drinka: "  + totalAmount + "ml");
        System.out.print("Skład drinka: ");
        System.out.print(ingredient1.name + ", " + ingredient2.name + ", " + ingredient3.name + ".");
    }
}
