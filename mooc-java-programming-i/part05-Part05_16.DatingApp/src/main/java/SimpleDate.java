
public class SimpleDate {
    private static final int DAYSAMONTH = 30;
    private static final int MONTHSAYEAR = 12;
    
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void advance() {
        if (this.day <= DAYSAMONTH - 1) {
            this.day++;
            return;
        }
        
        this.day = 1;
        if (this.month <= MONTHSAYEAR - 1) {
            this.month++;
            return;
        }
        this.month = 1;
        this.year++;
    }     
    
    public void advance(int howManyDays) {
        for (int i = 0; i < howManyDays; i++) {
            this.advance();
        }
    }
    
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDay = new SimpleDate(this.day, this.month, this.year);
        
        newDay.advance(days);
        return newDay;
    }
    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

}
