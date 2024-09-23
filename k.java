
import java.time.LocalDate;
import java.time.Period;

class tennureofanemployee{
    String name;
    int id_no;
    LocalDate datehired; 
    tennureofanemployee(String name, int id_no, int year, int month, int day){
        this.name = name;
        this.id_no = id_no;
        this.datehired = LocalDate.of(year,month,day);
    }
    String tenureperiod(){
        LocalDate today = LocalDate.now();
        Period period = Period.between(this.datehired, today);
        return period.getYears() +"Years "+ period.getMonths() +"Months "  + period.getDays() +"Days";

    }
}
    class tenureperiod {
        public static void main(String[] args) {
           tennureofanemployee ob = new tennureofanemployee("Ali", 1380028, 2003, 2, 28);
           System.out.println(ob.name +" "+ ob.id_no);
           System.out.println(ob.tenureperiod());
        }
    }