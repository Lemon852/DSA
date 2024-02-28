package Problems;
class Main{
    public static String defangIPaddr(String address) {
        String newString = "";
        for(int i=0; i<address.length(); i++){
            if(address.charAt(i)=='.'){
                newString +="[.]";
            }else{
                newString+=address.charAt(i);
            }
        }
        return newString;
    }
    public static void main(String args[]){
        String address = "1.1.1.1.2";
        String result = defangIPaddr(address);
        System.out.print(result);
    }
}
