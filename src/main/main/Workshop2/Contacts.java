package main.main.BridgeLabz;
import java.util.Scanner;

    public class contacts {


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getPhone_number() {
            return phone_number;
        }

        public void setPhone_number(int phone_number) {
            this.phone_number = phone_number;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
        private String name;
        private int age;

        private int phone_number;
        private String city;
        private String state;

        @Override
        public String toString() {
            return "contacts{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", phone_number=" + phone_number +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    '}';
        }



}
