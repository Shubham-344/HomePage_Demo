package com.example.homepage.ui;

public class ItemModel {
    public int itemimg;
    public String itemname;
    public String itemprice ;


    public  ItemModel(int itemimg, String itemname, String itemprice){
        this.itemname = itemname;
        this.itemprice = itemprice;
        this.itemimg = itemimg ;

    }
    public ItemModel(String itemname,String itemprice){
        this.itemname = itemname;
        this.itemprice = itemprice;
    }
}
