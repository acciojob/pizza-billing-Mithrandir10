package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private Boolean isCheeseAdded= false;

    private Boolean isToppingsAdded=false;

   private Boolean isTakeaway=false;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg==true){
            this.price=300;

        }else{
            this.price=400;

        }


        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded){

            this.isCheeseAdded=true;
            this.price+=80;

        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded) {
            this.isToppingsAdded=true;
            if (this.isVeg) {
                this.price+=70;

            } else {
                this.price+=120;

            }
        }

    }

    public void addTakeaway(){
        // your code goes here

        if(!isTakeaway){
            this.isTakeaway=true;
            this.price+=20;

        }

    }

    public String getBill(){
        // your code goes here
        this.bill="";
        if(this.isVeg){
            this.bill+="Base Price Of The Pizza: "+300+"\n";
        }else{
            this.bill+="Base Price Of The Pizza: "+400+"\n";
        }

        if(this.isCheeseAdded){
            this.bill+="Extra Cheese Added: "+"80\n";
        }

        if(this.isToppingsAdded){
            if(this.isVeg){
                this.bill += "Extra Toppings Added: " + "70\n";
            }else {
                this.bill += "Extra Toppings Added: " + "120\n";
            }
        }

        if(isTakeaway){
            this.bill+="Paperbag Added: "+"20\n";
        }
        this.bill+="Total Price: "+this.price+"\n";
        return this.bill;
    }
}
