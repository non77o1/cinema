package clas;

import java.util.Arrays;

public class movieName extends Items{
    String age;
    String doration;
    String Language;
    String times;

    String seats[];

    public movieName() {
    }

    public movieName(int item_id, String item_name, double item_prise, String age, String doration, String language) {
        super(item_id, item_name, item_prise);
        this.age = age;
        this.doration = doration;
        Language = language;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDoration() {
        return doration;
    }

    public void setDoration(String doration) {
        this.doration = doration;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public String getSeats() {
        return Arrays.toString(seats);
    }

    public void setSeats(String[] seats) {
        int num=0;
        for (int i=0 ; i<20 ; i++){
            if (seats[i]!=null){
                num+=1;
            }
        }

        if (num!=0){
            this.seats = new String[num];
            for (int i=0 ; i<num ; i++){
                if (seats[i]!=null) {
                    this.seats[i] = seats[i];
                }
            }
        }
    }

    public String toString(){
        return super.getItem_name() +" "+super.getItem_prise()+" "+this.doration+" "+this.Language+" "+this.age;
    }
}
