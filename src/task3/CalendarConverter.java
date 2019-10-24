package task3;

class CalendarConverter {
    static final private int MONDAY = 1;
    static final private int TUESDAY = 2;
    static final private int WEDNESDAY = 3;
    static final private int THURSDAY = 4;
    static final private int FRIDAY = 5;
    static final private int SATURDAY = 6;
    static final private int SUNDAY = 7;

    static String convertDayToString(int dayNumber) {
        String day;
        switch (dayNumber) {
            case MONDAY:
                day = MONDAY + " dzień tygodnia to Poniedziałek";
                break;
            case TUESDAY:
                day = TUESDAY + " dzień tygodnia to Wtorek";
                break;
            case WEDNESDAY:
                day = WEDNESDAY + " dzień tygodnia to Sroda";
                break;
            case THURSDAY:
                day = THURSDAY + " dzień tygodnia to Czwartek";
                break;
            case FRIDAY:
                day = FRIDAY + " dzień tygodnia to Piątek";
                break;
            case SATURDAY:
                day = SATURDAY + " dzień tygodnia to Sobota";
                break;
            case SUNDAY:
                day = SUNDAY + " dzień tygodnia to Niedziela";
                break;
            default:
                day = "Niepoprawna wartość dnia tygodnia";
        }
        return day;
    }
}
