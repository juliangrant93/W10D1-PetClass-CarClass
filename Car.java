package com.tts;

    public class Car {
        // Declare variable
        private String make;
        private String model;
        private String type;

        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Car(String make, String model) {
            this.make = "Nissan";
            this.model = "Maxima";

        }

        public Car(String make, String model, String type) {
            this.make = "Nissan";
            this.model = "Maxima";
            this.type = "Sedan";
        }

    public static boolean check (Car c1, Car c2){

        boolean myBool = c1.getModel() == c2.getMake();
        System.out.println(myBool);
        return c1.getModel() == c2.getMake();


    }

        @Override
        public String toString() {
            return "Car{" +
                    "make='" + make + '\'' +
                    ", model='" + model + '\'' +
                    ", type='" + type + '\'' +
                    '}';
        }
    }

