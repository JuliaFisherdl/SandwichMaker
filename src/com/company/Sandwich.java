package com.company;

public class Sandwich {

    //properties
    private String breadType;
    private String proteinType;
    private String cheeseType;
    private boolean hasVeggies;

    //constrictor
    public Sandwich(String protein, String cheese, boolean veggies) {
        breadType = "whole grain";
        cheeseType = cheese;
        proteinType = protein;
        hasVeggies = veggies;

        //getter and setter methods
            /*
            public void setBreadType(String bread){
                breadType = bread;
            }
            public String setProteinType) String Protein){
                proteinType = protein;
            }
            public void setCheeseType(String cheese){
                cheeseType = cheese:
            }
            public void setHasVeggies(Boolean veggies) {
    hasVeggies = veggies;*/
    }

        //getters
        public String getBreadType() {
            return breadType;
        }
        public String getProteinType() {
            return proteinType;
        }
        public String getCheeseType() {
            return cheeseType;
        }
        public boolean getHasVeggies() {
            return hasVeggies;
        }
        public void describeSandwich() {
            if (hasVeggies == false) {
                System.out.print("The sandwich is on " + getBreadType() + " bread with " + getProteinType() + " and " + getCheeseType() + " with " +
                        "with no veggies.");
            } else {
                System.out.print("The sandwich is on" + getBreadType() + " bread" + getProteinType() + " and " + getCheeseType() + " with " +
                        "with veggies.");
            }
        }

    }
































