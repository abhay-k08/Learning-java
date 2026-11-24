public class castingandpramotion {
        public static void main(String[] args) {
                // 1.implicit conversion
                // byte -> int
                byte b = 24;
                int i;
                i = b;
                System.out.println(i);// 24

                // character to int
                char c = 'a';
                int j;
                j = c;
                System.out.println(j);// 97 bcz the unicode of te character a

                // 2.Explicit conversion
                // int to byte
                int k = 22;
                byte l;
                l = (byte) k;// typecasting ans must 44
                System.out.println(l);// 300 % 256 == 44
                int m = 300;
                byte n;
                n = (byte) m;// typecasting ans must 44
                System.out.println(n);// 300 % 256 == 44

                // 3.trunketing conversion
                float x = 15.67f;
                int y;

                y = (int) x;
                System.out.println(y);

                // 4.type pramotion
                byte num =26 ;
                //num=num*2; the error given is Error: Type mismatch: cannot convert from int to byte so we use
                 num = (byte) (num*3);
                 System.out.println(num+ " " +"ye hua casting ke use se problem solve");


                 //5.automatic type pramotion when in opration  you use th einteger datatype with byte 
                 byte p=10;
                 byte q=60;
                 byte r=50;
                 int opration=(p*q)/r;
                 // this automatically converted into the int data type by auto matic pramotion
                 System.out.println(opration+" "+"yeh huaa int me pramote data tha byte main");
                 // agr humko byte me chahiye hotta to casting karni padti


                
        }
}
