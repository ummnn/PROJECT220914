public class Ex2_9 {
    public static void main(String[] args) {
        short a = (short)0x55ff;
        short b = (short)0x55ff;

        System.out.println("[비트연산결과]");
        System.out.printf("04x\n",(short)(a&b));
        System.out.printf("04x\n",(short)(a|b));
        System.out.printf("04x\n",(short)(a^b));
        System.out.printf("04x\n",(short)(~a));

        byte c = 20;
        byte d = -8;

        System.out.println("[시프트 연산 결과]");
        System.out.println(c<<2);
        System.out.println(c>>2);
        System.out.println(d>>2);
        System.out.printf("%x\n",(d>>>2));

    }
}
