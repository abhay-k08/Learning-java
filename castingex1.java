public class castingex1 {
  public static void main(String[] args) {

    byte b = 42;
    char c = 'a';
    short s = 1024;
    int i = 5000;
    float f = 5.67f;
    double d = .1234;

    double result = (f * b) + (i / c) - (d - s);
    // float *byte = float
    // int *char =int
    // double -short = double

    // final result willl be float and int main flot ki taraf and float and doble
    // main double ki taraf
    System.out.println((f * b) + " " + (i / c) + " " + (d - s));// yeh har ek ki alagalag value dega
    System.out.println(result);// yeh final value dega

  }
}