public class variables {
    public static void main(String[] args) {

        // integers-> byte short int long
        // [0b for binar] and [0X for hexadecimal] and [0 for octal] written as a prefix
        // or the keyword
        // the all memory acknowladge by the computer system is binary
        int i = 10;
        byte r = 011;// octal
        byte b = 5;
        short s = 0;
        long age = 100000;
        byte binary = 0b101;
        // for readblity use the underscore like 12_34_56_789 compiler ignore this
        // underscores and write number normally
        System.out.println("integer values-->  " + i + " " + b + " " + s + " " + age + " " + r + " " + binary);

        // Real numbers
        // isme hum e ke bad or aage koi underscore nhi laga sakte error aaye ga also
        // same with decimal
        float a = 10.59f;
        double c = 59.7746;// standrad way
        double avogadonum = 6.022e23;// scientific way
        System.out.println("Floating values-->  " + a + " " + c + " " + avogadonum);

        // character
        char name = 'a';
        System.out.println("Character value in name -->  " + name);

        // Boolean values
        boolean bool = true;
        System.out.println("Boolean value stored in bool -->  " + bool);
        // a b c d e f g h i j k l m n o p q r s t u v w x y z

    }
}
