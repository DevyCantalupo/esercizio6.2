public class esercizio6di2 {
    public static boolean equals(char a, char b){
        boolean c = a != b;
        return c;
    }
    public static void main(String[] args) {
        char a = 'a';
        char b = 'a';

        boolean risultato = equals(a,b);
        System.out.println("i valori di a " + a + " e di" + " b " + b + " sono " + risultato);
    }
}
