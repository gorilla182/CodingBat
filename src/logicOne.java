public class logicOne {
    public int dateFashion(int you, int date) {
        if((you>=8 && date >2)||(you>2 && date >=8)){
            return 2;
        } else if (you<=2||date<=2){
            return 0;
        }else{
            return 1;
        }
    }
    public boolean squirrelPlay(int temp, boolean isSummer) {
        if(isSummer && (temp >=60 && temp<=100)){
            return true;
        } else if (!isSummer && (temp >=60 && temp<=90)){
            return true;
        } else{
            return false;
        }
    }
    public int caughtSpeeding(int speed, boolean isBirthday) {
        if(isBirthday){
            if(speed >0 && speed <= 65){
                return 0;
            } else if(speed >= 66 && speed <=85){
                return 1;
            } else{
                return 2;
            }
        } else{
            if(speed >0 && speed <= 60){
                return 0;
            } else if(speed >= 61 && speed <=80){
                return 1;
            } else{
                return 2;
            }
        }
    }
    public int sortaSum(int a, int b) {
        if((a+b)>=10 && (a+b)<=19){
            return 20;
        }else
            return a+b;
    }
    public String alarmClock(int day, boolean vacation) {
        if(!vacation){
            if(day>=1 && day<=5){
                return "7:00";
            } else
                return "10:00";
        } else{
            if(day>=1 && day <=5){
                return "10:00";
            } else
                return "off";
        }

    }
}
