package part_05;

/**
 * Demonstrate how variable-arity works, aka varargs. Create a method that uses "String ... varargs". Within the
 * varargs method, use StringBuilder to build a nicely formatted String/sentence using the varargs. Print this statement
 * to the console. Do this at least 3 times with different Strings/sentences.
 */

class Varargs {
    public static void main(String[] args) {
       String result = varMeth("This", "is", "a", "sentence");
       String result2 = varMeth("This", "is", "also", "a", "sentence");

        System.out.println(result);
        System.out.println(result2);
    }

    static String varMeth (String...v){
        StringBuilder sb = new StringBuilder(1);
        for (int i=0;i<v.length;i++) {
            sb.append(v[i]);
            sb.append(" ");
        }
        return sb.toString();
    }
}