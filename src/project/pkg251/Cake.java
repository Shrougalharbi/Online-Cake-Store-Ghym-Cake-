package project.pkg251;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


  class Cake {
    private String cake_name;
    private String[] sizes;
    private String size;
    private int layers;
    private double[] prices;
    private String occasion;
    private String flavor;
    private ArrayList<Cake> cakes = new ArrayList<>();
    private CakeReview cakeReview;
   
    public Cake() throws FileNotFoundException {
        if(cakes.size()==0)
            enterCakeDetails();
    }
    
    public Cake(String cake_name,String occasion,String flavor,int layers,String[] sizes,double[] prices) {
        this.cake_name=cake_name;
        this.sizes = sizes;
        this.layers = layers;
        this.prices = prices;
        this.occasion=occasion;
        this.flavor = flavor;
    }
    
    public void enterCakeDetails()throws FileNotFoundException {
        File inputCakes = new File("Cakes.txt");
        Scanner input = new Scanner(inputCakes);
        
        while(input.hasNext()){
            String cake_name=input.next();
            String occasion=input.next();
            String flavors=input.next();
            int layer=input.nextInt();
            String[] size=new String[3];
            for (int i=0;i<3;i++){
             size[i]=input.next();
            }
            double[] prices=new double[3];
            for (int i=0;i<3;i++){
             prices[i]=input.nextInt();
            }
            
        Cake newCake = new Cake(cake_name,occasion,flavors,layer,size,prices); 
        cakes.add(newCake);
        
        }
        input.close();
        
    }
     public void displayCakeDetails(){
       String Size="";
       String price="";
       for (int i=1;i<=sizes.length;i++){
         Size +=i+ ": " +sizes[i-1]+ "  ";
         price +=i+ ": " +prices[i-1]+ "  ";
       }     
       System.out.printf("| %-15s| %-18s| %-7d| %-11s| %-34s| %-28s| ",
               getCake_name(),getFlavor(),getLayers(),getOccasion(),Size,price);
       
       System.out.println();
     }
    
    public Cake findCustomerCake(String cake_name,String flavor,int layers,String Csize){
        for(int i=0 ;i<cakes.size();i++){
         if(cakes.get(i).getCake_name().equalsIgnoreCase(cake_name) && cakes.get(i).getFlavor().equalsIgnoreCase(flavor) && cakes.get(i).getLayers()==layers){
             for(int j=0 ; j < cakes.get(i).sizes.length ; j++){
                 if (cakes.get(i).sizes[j].equalsIgnoreCase(Csize)){
                     cakes.get(i).setCSize(Csize);
                      return cakes.get(i);
             }
            }
        }
    }
        return null;
    }
    public Cake toRate(String cake_name){
        for(int i=0 ;i<cakes.size();i++){
         if(cakes.get(i).getCake_name().equalsIgnoreCase(cake_name))
                      return cakes.get(i);
             }
           
        return null;
    }
    
    public String getCake_name() {
        return cake_name;
    }

    public String[] getSize() {
        return sizes;
    }

    public int getLayers() {
        return layers;
    }

    public double getPrice(String price) {
        for( int i =0; i<sizes.length;i++){
            if(sizes[i].equals(price))
                return prices[i];
        }
    
        return -1;
    }

    public String getOccasion() {
        return occasion;
    }

    public String getFlavor() {
        return flavor;
    }
    
    public void setCake_name(String cake_name) {
        this.cake_name = cake_name;
    }

    public void setSize(String[] size) {
        this.sizes = sizes;
    }
    
    public String getCSize() {
        return size;
    }
    
    public void setCSize(String size) {
        this.size = size;
    }

    public void setLayers(int layers) {
        this.layers = layers;
    }

    public void setPrice(double[] price) {
        this.prices = prices;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
    
    //------------------------------------------------------------------------------------
    
    public void Search(){  
        
        Scanner inputnumber = new Scanner(System.in);
        String search="";
        int number=0;
        System.out.println("} Search , Enter number of the method you want to search |");
        System.out.println("|--------------------------------------------------------|");
        System.out.println("| 1. View list Of cakes                                  |");
        System.out.println("| 2. Search By Cake Name                                 |");
        System.out.println("| 3. Search By Occasion                                  |");
        System.out.println("| 4. Search By Flavor                                    |");
        System.out.println("| 5. Search By Price                                     |");
        System.out.println("| 6. Search By Layers                                    |");
        System.out.println("|--------------------------------------------------------|");

        number=inputnumber.nextInt();
        
        switch(number){
            
            case 1 : 
                System.out.println("| Cake_name      | Flavor            | layers | Occasion   | Sizes                             | Prices                      |");
                System.out.println("|----------------|-------------------|--------|------------|-----------------------------------|-----------------------------|");
                for(Cake cake : cakes)
                   cake.displayCakeDetails();
                break;
            
            case 2 : 
                System.out.println("} Enter Cake Name ");
                search=inputnumber.next();
                System.out.println("| Cake_name      | Flavor            | layers | Occasion   | Sizes                             | Prices                      |");
                System.out.println("|----------------|-------------------|--------|------------|-----------------------------------|-----------------------------|");
                for(Cake cake : cakes)
                   cake.SearchByCakeName(search);
                break;
                
            case 3 : 
                System.out.println("} Enter Occasion ");
                search=inputnumber.next();
                System.out.println("| Cake_name      | Flavor            | layers | Occasion   | Sizes                             | Prices                      |");
                System.out.println("|----------------|-------------------|--------|------------|-----------------------------------|-----------------------------|");
                for(Cake cake : cakes)
                   cake.SearchByOccasion(search);
                break;
                
            case 4 : 
                System.out.println("} Enter Flavor ");
                search=inputnumber.next();
                System.out.println("| Cake_name      | Flavor            | layers | Occasion   | Sizes                             | Prices                      |");
                System.out.println("|----------------|-------------------|--------|------------|-----------------------------------|-----------------------------|");
                for(Cake cake : cakes)
                   cake.SearchByFlavor(search); 
                break;
                
            case 5 : 
                System.out.println("} Enter Price ");
                search=inputnumber.next();
                System.out.println("| Cake_name      | Flavor            | layers | Occasion   | Sizes                             | Prices                      | ");
                System.out.println("|----------------|-------------------|--------|------------|-----------------------------------|-----------------------------|");
                for(Cake cake : cakes)
                   cake.SearchByPrice(search); 
                break;
                
            case 6 :   
                System.out.println("} Enter number of layers ");
                search=inputnumber.next();
                System.out.println("| Cake_name      | Flavor            | layers | Occasion   | Sizes                             | Prices                      |");
                System.out.println("|----------------|-------------------|--------|------------|-----------------------------------|-----------------------------|");
                for(Cake cake : cakes)
                   cake.SearchByLayers(search);
                break;
       
            default: 
                System.err.println("Invalid choice , Please enter number between 1 and 6");
                break;
        }
        
        inputnumber.close();
     }  
    
    public void SearchByCakeName(String name){
        if(getCake_name().equalsIgnoreCase(name))
            displayCakeDetails();
    
    }
    public void SearchByOccasion(String Occasion){
        if(getOccasion().equalsIgnoreCase(Occasion))
            displayCakeDetails();
    }
    
    public void SearchByFlavor(String Flavor){
        if(getFlavor().equalsIgnoreCase(Flavor))
            displayCakeDetails();
    }
    
    public void SearchByPrice(String Price){
        for(int i=0;i<prices.length;i++){
         if(prices[i]==Double.valueOf(Price))
             displayCakeDetails();
    }
    }
    public void SearchByLayers(String Layers){
        if(Layers.equals(String.valueOf(getLayers())))
            displayCakeDetails();
    }
    public CakeReview set(CakeReview cake){
        this.cakeReview=cake;
        return cakeReview;
    }
    public String review(){
        return cakeReview.addString();
        
    }
 }