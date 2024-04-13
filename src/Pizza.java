public class Pizza {

    private int price;

    private boolean veg;

    private int extraCheesePrice = 100;

    private int extraToppingsPrice = 200;

    private int takeAwayPackPrice = 50;

    private int basePizzaPrice;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;

    public Pizza(boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price = 4000;
        }else{
            this.price = 3000;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese (){
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }

    public void addExtraToppings () {
        isExtraToppingsAdded = true;
        this.price += extraToppingsPrice;
    }

    public void addTakeAwayPack () {
        isOptedForTakeAway = true;
        this.price += takeAwayPackPrice;
    }

    public void getBill(){
        String bill ="";
        if(isExtraCheeseAdded){
            bill += "Extra cheese added:" + extraCheesePrice + "/n";
        }

        if(isExtraToppingsAdded){
            bill += "Extra toppings added:" + extraToppingsPrice + "/n";
        }

        if(isOptedForTakeAway){
            bill += "Take away pack added:" + takeAwayPackPrice + "/n";
        }

        bill += "Bill;"+ this.price + "/n";
        System.out.println(bill);
    }
}
