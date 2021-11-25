public class binoctalhexal {
    public static void main(String args[]){
        int a = Integer.parseInt(args[0]);
        System.out.println("Java Test"+args[0]);
        System.out.println("Given Number"+args[0]);
        System.out.println("Binary Equivalent"+Integer.toBinaryString(a));
        System.out.println("Octal Equivalent"+Integer.toOctalString(a));
        System.out.println("Hexadecimal Equivalent"+Integer.toHexString(a));
    }
}
