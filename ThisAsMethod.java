package com.thiskeyword;

class ShoppingMall
{
    public void DepartmentStores()
    {
        System.out.println("Cosmetic,Toys,Home Accessories are available!!!");
    }
    public void PharmaciesStore()
    {
        System.out.println("Medicines,Syrups,Health checking devices are available!!!");
    }
    public void FoodCourt()
    {
        System.out.println("Foods of various kind are available!!!");
    }
    public void ClothingStores()
    {
        this.TechnologyStores();
        System.out.println("Clothes for Men and Women are available!!!");
    }
    public void TechnologyStores()
    {
        System.out.println("Latest Versions of Phones and Laptops are available!!!");
    }

}
public class ThisAsMethod
{
    public static void main(String[] args)
    {
        ShoppingMall obj = new ShoppingMall();
        obj.ClothingStores();
    }
}
