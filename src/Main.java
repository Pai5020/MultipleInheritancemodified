public class Main {
    public static void main(String[] args) {
        Button b = new Button();
        b.color = "Blue" ;
        b.size = 20;
        System.out.println("Color: "+ b.color );
        System.out.println("Size: "+ b.size);
        b.ClickAction();
        b.InputText();

        TextField t = new TextField();
        t.color = "Green";
        t.size = 15;
        System.out.println("Color: "+ t.color );
        System.out.println("Size: "+ t.size);
        t.ClickAction();
        t.InputText();

        CheckBox Cb = new CheckBox();
        Cb.color = "Yellow";
        Cb.size = 13 ;
        System.out.println("Color: "+ Cb.color );
        System.out.println("Size: "+ Cb.size);
        Cb.ClickAction();
        Cb.InputText();
    }
}