package project.pkg251;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


 class Cake {
    private String cake_name;
    private String[] size;
    private int layers;
    private double[] prices;
    private String[] servings;
    private String occasion;
    private String flavor;
    
    
  public Cake(String cake_name,String occasion,String flavor,int layers,String[] size,double[] prices,String[] servings) {
        this.cake_name=cake_name;
        this.size = size;
        this.layers = layers;
        this.prices = prices;
        this.occasion=occasion;
        this.flavor = flavor;
        this.servings=servings;
    }

    public String getCake_name() {
        return cake_name;
    }

    public String[] getSize() {
        return size;
    }

    public int getLayers() {
        return layers;
    }

    public double getPrice(String price) {
        for( int i =0; i<size.length;i++){
            if(size[i].equals(price))
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

    public String[] getServings() {
        return servings;
    }

    public void setCake_name(String cake_name) {
        this.cake_name = cake_name;
    }

    public void setSize(String[] size) {
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
    
    public void setServings(String[] servings) {
        this.servings = servings;
    }
    
    //--------------------------------------------------------------------------
 
    public void displayDetails(){
       String sizes="";
       String price="";
       String serving="";
       for (int i=1;i<=size.length;i++){
         sizes +=i+ ": " +size[i-1]+ "  ";
         price +=i+ ": " +prices[i-1]+ "  ";
         serving +=i+ ": " +servings[i-1]+ "  ";
       }     
       System.out.printf("| %-15s| %-18s| %-7d| %-11s| %-34s| %-28s| %-15s| ",
               getCake_name(),getFlavor(),getLayers(),getOccasion(),sizes,price,serving);
       
       System.out.println();
   }

    //--------------------------------------------------------------------------

    public void SearchByCakeName(String name){
        if(getCake_name().equalsIgnoreCase(name))
            displayDetails();
    }
    
    public void SearchByOccasion(String Occasion){
        if(getOccasion().equalsIgnoreCase(Occasion))
            displayDetails();
    }
    
    public void SearchByFlavor(String Flavor){
        if(getFlavor().equalsIgnoreCase(Flavor))
            displayDetails();
    }
    
    public void SearchByPrice(String Price){
        for(int i=0;i<prices.length;i++){
         if(prices[i]==Double.valueOf(Price))
              displayDetails();
    }
    }
    public void SearchByLayers(String Layers){
        if(Layers.equals(String.valueOf(getLayers())))
            displayDetails();
    }
    

 public static void main(String[] args){
     Scanner inputnumber = new Scanner(System.in);
     ArrayList<Cake> cakes = new ArrayList<>();
     String search="";
     int number=0;
     try {
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
            String[] servings=new String[3];
            for (int i=0;i<3;i++){
             servings[i]=input.next();
            }
           
        Cake newCake = new Cake(cake_name,occasion,flavors,layer,size,prices,servings); 
        cakes.add(newCake);
        }
        
        input.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
     
        System.out.println();
        
    //------------------------------------------------------------------------------------
        
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
                System.out.println("| Cake_name      | Flavor            | layers | Occasion   | Sizes                             | Prices                      | Serving             |");
                System.out.println("|----------------|-------------------|--------|------------|-----------------------------------|-----------------------------|---------------------|");
                for(Cake cake : cakes)
                   cake.displayDetails();
                break;
            
            case 2 : 
                System.out.println("} Enter Cake Name ");
                search=inputnumber.next();
                System.out.println("| Cake_name      | Flavor            | layers | Occasion   | Sizes                             | Prices                      | Serving             |");
                System.out.println("|----------------|-------------------|--------|------------|-----------------------------------|-----------------------------|---------------------|");
                for(Cake cake : cakes)
                   cake.SearchByCakeName(search);
                break;
                
            case 3 : 
                System.out.println("} Enter Occasion ");
                search=inputnumber.next();
                System.out.println("| Cake_name      | Flavor            | layers | Occasion   | Sizes                             | Prices                      | Serving             |");
                System.out.println("|----------------|-------------------|--------|------------|-----------------------------------|-----------------------------|---------------------|");
                for(Cake cake : cakes)
                   cake.SearchByOccasion(search);
                break;
                
            case 4 : 
                System.out.println("} Enter Flavor ");
                search=inputnumber.next();
                System.out.println("| Cake_name      | Flavor            | layers | Occasion   | Sizes                             | Prices                      | Serving             |");
                System.out.println("|----------------|-------------------|--------|------------|-----------------------------------|-----------------------------|---------------------|");
                for(Cake cake : cakes)
                   cake.SearchByFlavor(search); 
                break;
                
            case 5 : 
                System.out.println("} Enter Price ");
                search=inputnumber.next();
                System.out.println("| Cake_name      | Flavor            | layers | Occasion   | Sizes                             | Prices                      | Serving             |");
                System.out.println("|----------------|-------------------|--------|------------|-----------------------------------|-----------------------------|---------------------|");
                for(Cake cake : cakes)
                   cake.SearchByPrice(search); 
                break;
                
            case 6 :   
                System.out.println("} Enter number of layers ");
                search=inputnumber.next();
                System.out.println("| Cake_name      | Flavor            | layers | Occasion   | Sizes                             | Prices                      | Serving             |");
                System.out.println("|----------------|-------------------|--------|------------|-----------------------------------|-----------------------------|---------------------|");
                for(Cake cake : cakes)
                   cake.SearchByLayers(search);
                break;
       
            default: 
                System.err.println("Invalid choice , Please enter number between 1 and 6");
                break;
        }
        
        inputnumber.close();
                }
        
        }