package ArrayLinkiedLists;

import java.util.ArrayList;

public class Grocery {
    private ArrayList<String>groceryList = new ArrayList<String>();

    public void addGroceryList(String item) {
        String nickname = "Necko";
        this.groceryList.add(item);
    }
    public void printGroceryList() {
        System.out.println("You have "+this.groceryList.size()+" items in grocery list");

        for (int i = 0; i < groceryList.size() ; i++) {
            System.out.println((i+1)+"."+groceryList.get(i));
        }
    }
    public void modifyGroceryList(int position, String item){
        groceryList.set(position,item);
        System.out.println("Grocery item "+position+" has been modified.");
    }
    public void removeGroceryList(int position){
        groceryList.remove(position);
        System.out.println("Grocery item "+position+" has been removed");
    }
}
