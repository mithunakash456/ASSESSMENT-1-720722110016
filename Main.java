class Main {
    public static void main(String[] args) {
        String b = "t6hj7ui";
        String letters = "";
        String digits = "";
        for (int i = 0; i < b.length(); i++) {
            if (Character.isLetter(b.charAt(i))) {
                letters += b.charAt(i);
            } else if (Character.isDigit(b.charAt(i))) {
                digits += b.charAt(i);
            }
        }
        String output = "";
        output += repeatChar('t', Character.getNumericValue(b.charAt(1)));
        output += repeatString("hj", Character.getNumericValue(b.charAt(4))); 
        output += "ui"; 
        System.out.println(output);
    }
    public static String repeatChar(char c, int times) {
        if (times < 0) times = 0; 
        return String.valueOf(c).repeat(times);
    }
    public static String repeatString(String str, int times) {
        if (times < 0) times = 0; 
        return str.repeat(times);
    }
}
