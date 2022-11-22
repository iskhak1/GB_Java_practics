package ru.gb.home6;

import java.util.HashMap;
import java.util.Map;

public class Shop {

    private Map map;

    LaptopPOJO[] laptopPOJOS = {
            new LaptopPOJO("12", "China", "laptop", "Irbis NB262", "2020",
                    "Windows", "Grey", "IPS", "11", "FullHD(1980x1080", "Intel Celeron 3350",
                    2, "1.1GHz", "LPDDR3", 4, "1", "Intel HD Graphics 500",
                    "512", "0"),
            new LaptopPOJO("12", "China", "laptop", "Digma EVE", "2020",
                    "Windows", "Black", "IPS", "14", "FullHD(1980x1080", "Intel i3 3350",
                    2, "1.1GHz", "LPDDR4", 6, "1", "Intel HD Graphics 500",
                    "512", "0"),
            new LaptopPOJO("12", "USA", "laptop", "Apple MacBook pro", "2021",
                    "Mac", "SpaceGrey", "IPS", "13", "FullHD(1980x1080", "M1 pro",
                    12, "3.1GHz", "LPDDR5", 16, "1", "M1 pro",
                    "512", "0"),
            new LaptopPOJO("12", "China", "laptop", "Sony ", "2015",
                    "Windows", "Grey", "IPS", "16", "FullHD(1980x1080", "Intel i3 330",
                    2, "1.1GHz", "LPDDR3", 4, "1", "Intel HD Graphics 500",
                    "512", "0"),
            new LaptopPOJO("12", "China", "laptop", "Irbis NB262", "2020",
                    "Windows", "Grey", "IPS", "11", "FullHD(1980x1080", "Intel Celeron 3350",
                    2, "1.1GHz", "LPDDR3", 4, "1", "Intel HD Graphics 500",
                    "512", "0"),
            new LaptopPOJO("12", "China", "laptop", "Irbis NB262", "2020",
                    "Windows", "Grey", "IPS", "11", "FullHD(1980x1080", "Intel Celeron 3350",
                    2, "1.1GHz", "LPDDR3", 4, "1", "Intel HD Graphics 500",
                    "512", "0"),
            new LaptopPOJO("12", "China", "laptop", "Irbis NB262", "2020",
                    "Windows", "Grey", "IPS", "11", "FullHD(1980x1080", "Intel Celeron 3350",
                    2, "1.1GHz", "LPDDR3", 4, "1", "Intel HD Graphics 500",
                    "512", "0"),
            new LaptopPOJO("12", "China", "laptop", "Irbis NB262", "2020",
                    "Windows", "Grey", "IPS", "11", "FullHD(1980x1080", "Intel Celeron 3350",
                    2, "1.1GHz", "LPDDR3", 4, "1", "Intel HD Graphics 500",
                    "512", "0"),
            new LaptopPOJO("12", "China", "laptop", "Irbis NB262", "2020",
                    "Windows", "Grey", "IPS", "11", "FullHD(1980x1080", "Intel Celeron 3350",
                    2, "1.1GHz", "LPDDR3", 4, "1", "Intel HD Graphics 500",
                    "512", "0"),
            new LaptopPOJO("12", "China", "laptop", "Irbis NB262", "2020",
                    "Windows", "Grey", "IPS", "11", "FullHD(1980x1080", "Intel Celeron 3350",
                    2, "1.1GHz", "LPDDR3", 4, "1", "Intel HD Graphics 500",
                    "512", "0"),
            new LaptopPOJO("12", "China", "laptop", "Irbis NB262", "2020",
                    "Windows", "Grey", "IPS", "11", "FullHD(1980x1080", "Intel Celeron 3350",
                    2, "1.1GHz", "LPDDR3", 4, "1", "Intel HD Graphics 500",
                    "512", "0"),
            new LaptopPOJO("12", "China", "laptop", "Irbis NB262", "2020",
                    "Windows", "Grey", "IPS", "11", "FullHD(1980x1080", "Intel Celeron 3350",
                    2, "1.1GHz", "LPDDR3", 1, "1", "Intel HD Graphics 500",
                    "256", "0"),
            new LaptopPOJO("12", "China", "laptop", "Irbis NB262", "2020",
                    "Windows", "Grey", "IPS", "11", "FullHD(1980x1080", "Intel Celeron 3350",
                    2, "1.1GHz", "LPDDR3", 4, "1", "Intel HD Graphics 500",
                    "512", "0"),
            new LaptopPOJO("12", "China", "laptop", "Irbis NB262", "2020",
                    "Windows", "Grey", "IPS", "11", "FullHD(1980x1080", "Intel Celeron 3350",
                    2, "1.1GHz", "LPDDR3", 32, "1", "Intel HD Graphics 500",
                    "1024", "0"),
            new LaptopPOJO("12", "China", "laptop", "Irbis NB262", "2020",
                    "Windows", "Grey", "IPS", "11", "FullHD(1980x1080", "Intel Celeron 3350",
                    2, "1.1GHz", "LPDDR3", 4, "1", "Intel HD Graphics 500",
                    "512", "0"),
            new LaptopPOJO("12", "China", "laptop", "Irbis NB262", "2020",
                    "Windows", "Grey", "IPS", "11", "FullHD(1980x1080", "Intel Celeron 3350",
                    2, "1.1GHz", "LPDDR3", 8, "1", "Intel HD Graphics 500",
                    "512", "0"),
            new LaptopPOJO("12", "China", "laptop", "Irbis NB262", "2020",
                    "Windows", "Grey", "IPS", "11", "FullHD(1980x1080", "Intel Celeron 3350",
                    2, "1.1GHz", "LPDDR3", 2, "1", "Intel HD Graphics 500",
                    "120", "0"),
            new LaptopPOJO("12", "China", "laptop", "Irbis NB262", "2020",
                    "Windows", "Grey", "IPS", "11", "FullHD(1980x1080", "Intel Celeron 3350",
                    2, "1.1GHz", "LPDDR3", 2, "1", "Intel HD Graphics 500",
                    "512", "0"),
            new LaptopPOJO("12", "China", "laptop", "Irbis NB262", "2020",
                    "Windows", "Grey", "IPS", "11", "FullHD(1980x1080", "Intel Celeron 3350",
                    2, "1.1GHz", "LPDDR3", 4, "1", "Intel HD Graphics 500",
                    "512", "0"),
            new LaptopPOJO("12", "China", "laptop", "Irbis NB262", "2020",
                    "Windows", "Grey", "IPS", "11", "FullHD(1980x1080", "Intel Celeron 3350",
                    2, "1.1GHz", "LPDDR3", 4, "1", "Intel HD Graphics 500",
                    "512", "0"),
            new LaptopPOJO("12", "China", "laptop", "Irbis NB262", "2020",
                    "Windows", "Grey", "IPS", "11", "FullHD(1980x1080", "Intel Celeron 3350",
                    2, "1.1GHz", "LPDDR3", 4, "1", "Intel HD Graphics 500",
                    "512", "0"),
            new LaptopPOJO("12", "China", "laptop", "Irbis NB262", "2020",
                    "Windows", "Grey", "IPS", "11", "FullHD(1980x1080", "Intel Celeron 3350",
                    2, "1.1GHz", "LPDDR3", 4, "1", "Intel HD Graphics 500",
                    "512", "0"),
            new LaptopPOJO("12", "China", "laptop", "Irbis NB262", "2020",
                    "Windows", "Grey", "IPS", "11", "FullHD(1980x1080", "Intel Celeron 3350",
                    2, "1.1GHz", "LPDDR3", 4, "1", "Intel HD Graphics 500",
                    "512", "0")

    };



    public void filter(String manufacturerWarranty, String countryOfOrigin, String type, String model, String yearOfRelease, String os, String color, String screenType, String screenSize, String screenResolution, String procModel, int numOfCores, String processorFrequency, String typeOfRam, int ramCapacity, String numberOfSlotsForMemoryModules, String integratedGraphicsCardModel, String totalSolidStateDrives, String totalCapacityOfHardDiskDrives){

        for (int i = 0; i < laptopPOJOS.length ; i++) {
            if (laptopPOJOS[i].getManufacturerWarranty().startsWith(manufacturerWarranty)&&laptopPOJOS[i].getCountryOfOrigin().startsWith(countryOfOrigin)
                    &&laptopPOJOS[i].getType().startsWith(type)&&laptopPOJOS[i].getModel().startsWith(model)&&laptopPOJOS[i].getYearOfRelease().startsWith(yearOfRelease)
                    &&laptopPOJOS[i].getOs().startsWith(os)&&laptopPOJOS[i].getColor().startsWith(color)&&laptopPOJOS[i].getScreenType().startsWith(screenResolution)
                    &&laptopPOJOS[i].getScreenSize().startsWith(screenSize)&&laptopPOJOS[i].getScreenResolution().startsWith(screenResolution)&&laptopPOJOS[i].getProcModel().startsWith(model)
                    &&laptopPOJOS[i].getNumOfCores()==numOfCores||laptopPOJOS[i].getProcessorFrequency().startsWith(processorFrequency)&&laptopPOJOS[i].getTypeOfRam().startsWith(typeOfRam)
                    &&laptopPOJOS[i].getRamCapacity()==ramCapacity||laptopPOJOS[i].getNumberOfSlotsForMemoryModules().startsWith(numberOfSlotsForMemoryModules)&&laptopPOJOS[i].getIntegratedGraphicsCardModel().startsWith(integratedGraphicsCardModel)
                    &&laptopPOJOS[i].getTotalSolidStateDrives().startsWith(totalSolidStateDrives)&&laptopPOJOS[i].getTotalCapacityOfHardDiskDrives().startsWith(totalCapacityOfHardDiskDrives)){

                System.out.println(laptopPOJOS[i].toString());

            }
        }

    }
    public void filter(String manufacturerWarranty, String countryOfOrigin, String type, String model, String yearOfRelease, String os, String color, String screenType, String screenSize, String screenResolution, String procModel, int numOfCores, String processorFrequency, String typeOfRam, int ramCapacity, String numberOfSlotsForMemoryModules, String integratedGraphicsCardModel, String totalSolidStateDrives) {
        for (int i = 0; i < laptopPOJOS.length; i++) {
            if (laptopPOJOS[i].getManufacturerWarranty().startsWith(manufacturerWarranty) && laptopPOJOS[i].getCountryOfOrigin().startsWith(countryOfOrigin)
                    && laptopPOJOS[i].getType().startsWith(type) && laptopPOJOS[i].getModel().startsWith(model) && laptopPOJOS[i].getYearOfRelease().startsWith(yearOfRelease)
                    && laptopPOJOS[i].getOs().startsWith(os) && laptopPOJOS[i].getColor().startsWith(color) && laptopPOJOS[i].getScreenType().startsWith(screenResolution)
                    && laptopPOJOS[i].getScreenSize().startsWith(screenSize) && laptopPOJOS[i].getScreenResolution().startsWith(screenResolution) && laptopPOJOS[i].getProcModel().startsWith(model)
                    && laptopPOJOS[i].getNumOfCores() == numOfCores || laptopPOJOS[i].getProcessorFrequency().startsWith(processorFrequency) && laptopPOJOS[i].getTypeOfRam().startsWith(typeOfRam)
                    && laptopPOJOS[i].getRamCapacity() == ramCapacity || laptopPOJOS[i].getNumberOfSlotsForMemoryModules().startsWith(numberOfSlotsForMemoryModules) && laptopPOJOS[i].getIntegratedGraphicsCardModel().startsWith(integratedGraphicsCardModel)
                    && laptopPOJOS[i].getTotalSolidStateDrives().startsWith(totalSolidStateDrives)) {

                System.out.println(laptopPOJOS[i].toString());

            }
        }
    }
    public void filter(String manufacturerWarranty, String countryOfOrigin, String type, String model, String yearOfRelease, String os, String color, String screenType, String screenSize, String screenResolution, String procModel, int numOfCores, String processorFrequency, String typeOfRam, int ramCapacity, String numberOfSlotsForMemoryModules, String integratedGraphicsCardModel){
        for (int i = 0; i < laptopPOJOS.length ; i++) {
            if (laptopPOJOS[i].getManufacturerWarranty().startsWith(manufacturerWarranty)&&laptopPOJOS[i].getCountryOfOrigin().startsWith(countryOfOrigin)
                    &&laptopPOJOS[i].getType().startsWith(type)&&laptopPOJOS[i].getModel().startsWith(model)&&laptopPOJOS[i].getYearOfRelease().startsWith(yearOfRelease)
                    &&laptopPOJOS[i].getOs().startsWith(os)&&laptopPOJOS[i].getColor().startsWith(color)&&laptopPOJOS[i].getScreenType().startsWith(screenResolution)
                    &&laptopPOJOS[i].getScreenSize().startsWith(screenSize)&&laptopPOJOS[i].getScreenResolution().startsWith(screenResolution)&&laptopPOJOS[i].getProcModel().startsWith(model)
                    &&laptopPOJOS[i].getNumOfCores()==numOfCores||laptopPOJOS[i].getProcessorFrequency().startsWith(processorFrequency)&&laptopPOJOS[i].getTypeOfRam().startsWith(typeOfRam)
                    &&laptopPOJOS[i].getRamCapacity()==ramCapacity||laptopPOJOS[i].getNumberOfSlotsForMemoryModules().startsWith(numberOfSlotsForMemoryModules)&&laptopPOJOS[i].getIntegratedGraphicsCardModel().startsWith(integratedGraphicsCardModel));

                System.out.println(laptopPOJOS[i].toString());

            }
    }
    public void filter(String manufacturerWarranty, String countryOfOrigin, String type, String model, String yearOfRelease, String os, String color, String screenType, String screenSize, String screenResolution, String procModel, int numOfCores, String processorFrequency, String typeOfRam, int ramCapacity, String numberOfSlotsForMemoryModules){
        for (int i = 0; i < laptopPOJOS.length ; i++) {
            if (laptopPOJOS[i].getManufacturerWarranty().startsWith(manufacturerWarranty)&&laptopPOJOS[i].getCountryOfOrigin().startsWith(countryOfOrigin)
                    &&laptopPOJOS[i].getType().startsWith(type)&&laptopPOJOS[i].getModel().startsWith(model)&&laptopPOJOS[i].getYearOfRelease().startsWith(yearOfRelease)
                    &&laptopPOJOS[i].getOs().startsWith(os)&&laptopPOJOS[i].getColor().startsWith(color)&&laptopPOJOS[i].getScreenType().startsWith(screenResolution)
                    &&laptopPOJOS[i].getScreenSize().startsWith(screenSize)&&laptopPOJOS[i].getScreenResolution().startsWith(screenResolution)&&laptopPOJOS[i].getProcModel().startsWith(model)
                    &&laptopPOJOS[i].getNumOfCores()==numOfCores||laptopPOJOS[i].getProcessorFrequency().startsWith(processorFrequency)&&laptopPOJOS[i].getTypeOfRam().startsWith(typeOfRam)
                    &&laptopPOJOS[i].getRamCapacity()==ramCapacity||laptopPOJOS[i].getNumberOfSlotsForMemoryModules().startsWith(numberOfSlotsForMemoryModules));
                System.out.println(laptopPOJOS[i].toString());

            }
    }
    public void filter(String manufacturerWarranty, String countryOfOrigin, String type, String model, String yearOfRelease, String os, String color, String screenType, String screenSize, String screenResolution, String procModel, int numOfCores, String processorFrequency, String typeOfRam, int ramCapacity) {
        for (int i = 0; i < laptopPOJOS.length; i++) {
            if (laptopPOJOS[i].getManufacturerWarranty().startsWith(manufacturerWarranty) && laptopPOJOS[i].getCountryOfOrigin().startsWith(countryOfOrigin)
                    && laptopPOJOS[i].getType().startsWith(type) && laptopPOJOS[i].getModel().startsWith(model) && laptopPOJOS[i].getYearOfRelease().startsWith(yearOfRelease)
                    && laptopPOJOS[i].getOs().startsWith(os) && laptopPOJOS[i].getColor().startsWith(color) && laptopPOJOS[i].getScreenType().startsWith(screenResolution)
                    && laptopPOJOS[i].getScreenSize().startsWith(screenSize) && laptopPOJOS[i].getScreenResolution().startsWith(screenResolution) && laptopPOJOS[i].getProcModel().startsWith(model)
                    && laptopPOJOS[i].getNumOfCores() == numOfCores && laptopPOJOS[i].getProcessorFrequency().startsWith(processorFrequency) && laptopPOJOS[i].getTypeOfRam().startsWith(typeOfRam)
                    && laptopPOJOS[i].getRamCapacity() == ramCapacity) {

                System.out.println(laptopPOJOS[i].toString());

            }
        }
    }

    public void getMin(){
        map = new HashMap();
        for (LaptopPOJO laptopPOJO : laptopPOJOS) {
            if (laptopPOJO.getRamCapacity() < 4 || laptopPOJO.getTotalSolidStateDrives().startsWith(String.valueOf(256))) {
                System.out.println(laptopPOJO.toString());
                map.put(laptopPOJO,laptopPOJO.getRamCapacity());
            }
        }
    }

}
