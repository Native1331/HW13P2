public class MonthUtils {
    public static class Month{
        private final String name;
        private final int quantityOfDays;
        private final int quantityOfWorkDays;

        private Month(String name, int quantityOfDays, int quantityOfWorkDays) {
            this.name=name;
            this.quantityOfDays = quantityOfDays;
            this.quantityOfWorkDays = quantityOfWorkDays;);
        }

        public String getName() {
            return name;
        }

        public int getQuantityOfDays() {
            return quantityOfDays;
        }

        public int getQuantityOfWorkDays() {
            return quantityOfWorkDays;
        }
    }

    public static final Month JANUARY = new Month ("January", 31, 23);
    public static final Month FEBRUARY = new Month ("February", 31, 23);
    public static final Month MARCH = new Month ("March", 31, 25);
    public static final Month APRIL = new Month ("April", 30, 25);
    public static final Month MAY = new Month ("May", 30, 25);
    public static final Month JUNE = new Month ("June", 31, 26);
    public static final Month JULY = new Month ("July", 30, 25);
    public static final Month AUGUST = new Month ("August", 31, 26);
    public static final Month SEPTEMBER = new Month ("September", 31, 26);
    public static final Month OCTOBER = new Month ("October", 30, 25);
    public static final Month NOVEMBER = new Month ("November", 31, 26);
    public static final Month DECEMBER = new Month ("December", 30, 25);

    public static final Month[] QUARTER1 = new Month[] {JANUARY, FEBRUARY, MARCH};
    public static final Month[] QUARTER2 = new Month[] {APRIL, MAY, JUNE};
    public static final Month[] QUARTER3 = new Month[] {JULY, AUGUST, SEPTEMBER};
    public static final Month[] QUARTER4=new Month[] {OCTOBER,NOVEMBER,DECEMBER};

public static Month[]getYearQuarter(int quarterNumber) {
    if (quarterNumber == 1) {
        return QUARTER1;
    } else if (quarterNumber == 2) {
        return QUARTER2;
    } else if (quarterNumber == 3) {
        return QUARTER3;
    } else if (quarterNumber == 4) {
        return QUARTER4;
    }else {
        return null;
    }
}
public static final Month[]YEAR=new Month[]{
        JANUARY,FEBRUARY,MARCH,APRIL,MAY,
        JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER
        };

public static Month[]getYear(){
        return YEAR;
        }

public static Month[]getYearQuarter1(){
        return QUARTER1;
        }

public static Month[]getYearQuarter2(){
        return QUARTER2;
        }

public static Month[]getYearQuarter3(){
        return QUARTER3;
        }

public static Month[]getYearQuarter4(){
        return QUARTER4;
        }
    public static final Month[] HALF1 = new Month[] {
            JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE};
        public static final Month[] HALF2 = new Month[] {
                JULY, AUGUST,SEPTEMBER,
                OCTOBER, NOVEMBER, DECEMBER};
        public static Month[] getYearHalfFirst() {
            return HALF1;
        };
    public static Month[] getYearHalfSecond() {
        return HALF2;
    };
    public static Month[] getYearHalf(int halfNumber){
        if (halfNumber == 1){
            return HALF1;
        }else if (halfNumber ==2) {
            return HALF2;
        }else{
            return null;
        }
    }
    }
}
