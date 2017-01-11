package android.bignerdranch.com.starbuzz;

/**
 * Created by Denis on 11.01.2017.
 */

public class Drink {
    private  String name;
    private String description;
    private int imageResourceId;

    public  static final Drink[] drinks = {
            new Drink("Latte","A couple of espresso short with steamed milk",R.drawable.latte),
            new Drink("Cappucino","Espresso, hot milk, and a steamed milk foam",R.drawable.cappuccino),
            new Drink("Filter","Highest quality beans roasted and brewed fresh",R.drawable.filter)
    };
    //Для каждого напитка хранится имя, описание и ресурс изображения
    private Drink(String name, String description, int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }
    public String getDescription(){
        return description;
    }
    public String getName(){
        return name;
    }
    public int getImageResourceId(){
        return imageResourceId;
    }
    public String toString(){
        return this.name;
    }

}
