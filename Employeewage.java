package main.day8;

    public class Employeewage {

        final int PRESENT_NUMBER_RANGE = 3;
        final int PRESENT = 1;
        final int PART_TIME = 2;
        final int WAGE_PER_HOUR = 20;
        final int WORKING_HOUR = 8;
        final int MAX_WORKING_DAY = 20;
        final int MAX_WORKING_HOUR = 80;

        public int getWorkingHour(int empPresent) {
            switch (empPresent) {
                case PRESENT:
                    return WORKING_HOUR;

                case PART_TIME:
                    return WORKING_HOUR / 2;

            }
            return 0;
        }
    }
