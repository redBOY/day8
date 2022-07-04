package main.day8;

public class uc1empwage {
    public double calculateEmpWage() {
        int totalWorkingHour = 0;
        int day = 0;

        while (day < MAX_WORKING_DAY && (totalWorkingHour + WORKING_HOUR / 2) < MAX_WORKING_HOUR) {
            int isPresent = (int) (Math.random() * PRESENT_NUMBER_RANGE);
            totalWorkingHour = totalWorkingHour + getWorkingHour(isPresent);
            day++;
        }
}
