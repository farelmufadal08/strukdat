public class cobak {
    private String  data [];
    private int top ;
    public cobak (int total ) {
        data = new String [total];
        top = -1;

    }
    public void push (String abjad) {
        if (top < data.length -1) {
            data[++top]= abjad ;

        }
    }
    public String pop () {
        if (top >= 0) {
            String  temp = data [top--];
            return temp;

        }
        return ("");
    }
    public void cetak () {
        for (int i = data.length -1 ; i > 0; i-- ) {
            System.out.println(data[i]);
        }
    }
    public static void main(String[] args) {

        cobak x = new cobak (13);
        x.push ("a");
        x.push ("t");
        x.push ("a");
        x.push ("d");
        x.push (" ");
        x.push ("r");
        x.push ("u");
        x.push ("t");
        x.push ("k");
        x.push ("u");
        x.push ("r");
        x.push ("t");
        x.push ("s");


        System.out.print(x.pop());
        System.out.print(x.pop());
        System.out.print(x.pop());
        System.out.print(x.pop());
        System.out.print(x.pop());
        System.out.print(x.pop());
        System.out.print(x.pop());
        System.out.print(x.pop());
        System.out.print(x.pop());
        System.out.print(x.pop());
        System.out.print(x.pop());
        System.out.print(x.pop());
        System.out.print(x.pop());





    }
}
