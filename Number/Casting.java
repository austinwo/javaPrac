class Casting{
    public static void main(String[] args){
        // Math.random() return a double
        double ranNum = Math.random();
        // cast a number into an integer
        int ranNumInteger = (int) ranNum;
        // string concatenation (not recommended)
        String str = "" + ranNumInteger;
    }
}