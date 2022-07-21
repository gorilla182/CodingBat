public class stringOne {

    public String helloName(String name) {
        String result = "Hello " + name + "!";
        return result;
    }
    public String makeAbba(String a, String b) {
        String result = a + b + b + a;
        return result;
    }
    public String makeTags(String tag, String word) {
        String result = "<"+tag+">" + word + "</"+tag+">";
        return result;
    }
    public String makeOutWord(String out, String word) {
        String one = out.substring(0,2);
        String two = out.substring(2,4);
        String result = one+word+two;
        return result;
    }
    public String extraEnd(String str) {
        String result = str.substring(str.length()-2,str.length())+str.substring(str.length()-2,str.length())+str.substring(str.length()-2,str.length());
        return result;
    }
    public String firstTwo(String str) {
        String result;
        if(str.length()>2){
            result = str.substring(0,2);
        }else if(str.length() <= 2 && str.length()!=0){
            result = str;
        }else{
            result = "";
        }
        return result;
    }
    public String firstHalf(String str) {
        int half = str.length() / 2;
        return str.substring(0, half);

    }
    public String withoutEnd(String str) {
        String result = "";
        int half = str.length();
        if(half>=2){
            result = str.substring(1,half-1);
        }
        return result;
    }
    public String comboString(String a, String b) {
        String result = "";
        if(a.length()>b.length()){
            result = b + a + b;
        }else{
            result = a + b + a;
        }
        return result;
    }
    public String nonStart(String a, String b) {
        String result = "";
        if(a.length()>=1 && b.length()>=1){
            result = a.substring(1,a.length()) + b.substring(1,b.length());
        }
        return result;
    }



}
