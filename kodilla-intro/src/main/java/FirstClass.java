public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(800,1700 , 2020 , "black");
        Notebook heavyNotebook = new Notebook (2000,100 , 2016 , "pink");
        Notebook oldNotebook = new Notebook (1200,200 , 2019 , "silver");

        checkAllParameters(notebook);
        checkAllParameters(heavyNotebook);
        checkAllParameters(oldNotebook);
    }
    public static void checkAllParameters(Notebook notebook){
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.colour);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.yearAndPrice();
        notebook.colour();
    }
}