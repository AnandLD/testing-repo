package automationtesting;

public class StringExample {

    public static void main(String[] args) {

        String name = "LearnMore";
        name.length();
        System.out.println(name.length());

        String one = "Learn";
        String two = "More";
        System.out.println(one.concat(two));

        System.out.println(name.charAt(5));

        String currency =     "    $45.56   ";
        if (currency.contains("$")){
            System.out.println("Doller");
        }
        System.out.println(currency);
        System.out.println(currency.trim());
        System.out.println(one.toLowerCase());
        System.out.println(one.toUpperCase());

        System.out.println(name.substring(1,5));

        String userName = name.substring(1,5);

        String value = "123";
        int f = Integer.parseInt(value);
        System.out.println(f+2);

        System.out.println(name.replace('e','a'));

    }



}
