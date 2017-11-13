
package replaceall;

/**
 *
 * @author Pablo
 */
public class ReplaceAll {

    public static void main(String[] args) {

        String str = "Este 1231 es 124 un String 1243 para 34563 usar 5455";
        System.out.println(str +"\n");

        // remove all numbers
        String newStr = str.replaceAll("[0-9]+", "");
        

        System.out.println(newStr +"\n");
        

        // remove all words with 'Java'
        newStr = str.replaceAll("[a-zA-Z]+", "Java");

        System.out.println(newStr +"\n");

    }

}
