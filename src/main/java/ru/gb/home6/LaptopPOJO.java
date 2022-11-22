package ru.gb.home6;

public class LaptopPOJO {
    private String manufacturerWarranty;
    private String countryOfOrigin;
    private String type;
    private String model;
    private String yearOfRelease;
    private String os;
    private String color;
    private String screenType;
    private String screenSize;
    private String screenResolution;
    private String procModel;
    private int numOfCores;
    private String processorFrequency;
    private String typeOfRam;
    private int ramCapacity;
    private String numberOfSlotsForMemoryModules;
    private String integratedGraphicsCardModel;
    private String totalSolidStateDrives;
    private String totalCapacityOfHardDiskDrives;


    public LaptopPOJO(String manufacturerWarranty, String countryOfOrigin, String type, String model, String yearOfRelease, String os, String color, String screenType, String screenSize, String screenResolution, String procModel, int numOfCores, String processorFrequency, String typeOfRam, int ramCapacity, String numberOfSlotsForMemoryModules, String integratedGraphicsCardModel, String totalSolidStateDrives, String totalCapacityOfHardDiskDrives) {
        this.manufacturerWarranty = manufacturerWarranty;
        this.countryOfOrigin = countryOfOrigin;
        this.type = type;
        this.model = model;
        this.yearOfRelease = yearOfRelease;
        this.os = os;
        this.color = color;
        this.screenType = screenType;
        this.screenSize = screenSize;
        this.screenResolution = screenResolution;
        this.procModel = procModel;
        this.numOfCores = numOfCores;
        this.processorFrequency = processorFrequency;
        this.typeOfRam = typeOfRam;
        this.ramCapacity = ramCapacity;
        this.numberOfSlotsForMemoryModules = numberOfSlotsForMemoryModules;
        this.integratedGraphicsCardModel = integratedGraphicsCardModel;
        this.totalSolidStateDrives = totalSolidStateDrives;
        this.totalCapacityOfHardDiskDrives = totalCapacityOfHardDiskDrives;
    }

    public String getManufacturerWarranty() {
        return manufacturerWarranty;
    }

    public void setManufacturerWarranty(String manufacturerWarranty) {
        this.manufacturerWarranty = manufacturerWarranty;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(String yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public String getProcModel() {
        return procModel;
    }

    public void setProcModel(String procModel) {
        this.procModel = procModel;
    }

    public int getNumOfCores() {
        return numOfCores;
    }

    public void setNumOfCores(int numOfCores) {
        this.numOfCores = numOfCores;
    }

    public String getProcessorFrequency() {
        return processorFrequency;
    }

    public void setProcessorFrequency(String processorFrequency) {
        this.processorFrequency = processorFrequency;
    }

    public String getTypeOfRam() {
        return typeOfRam;
    }

    public void setTypeOfRam(String typeOfRam) {
        this.typeOfRam = typeOfRam;
    }

    public int getRamCapacity() {
        return ramCapacity;
    }

    public void setRamCapacity(int ramCapacity) {
        this.ramCapacity = ramCapacity;
    }

    public String getNumberOfSlotsForMemoryModules() {
        return numberOfSlotsForMemoryModules;
    }

    public void setNumberOfSlotsForMemoryModules(String numberOfSlotsForMemoryModules) {
        this.numberOfSlotsForMemoryModules = numberOfSlotsForMemoryModules;
    }

    public String getIntegratedGraphicsCardModel() {
        return integratedGraphicsCardModel;
    }

    public void setIntegratedGraphicsCardModel(String integratedGraphicsCardModel) {
        this.integratedGraphicsCardModel = integratedGraphicsCardModel;
    }

    public String getTotalSolidStateDrives() {
        return totalSolidStateDrives;
    }

    public void setTotalSolidStateDrives(String totalSolidStateDrives) {
        this.totalSolidStateDrives = totalSolidStateDrives;
    }

    public String getTotalCapacityOfHardDiskDrives() {
        return totalCapacityOfHardDiskDrives;
    }

    public void setTotalCapacityOfHardDiskDrives(String totalCapacityOfHardDiskDrives) {
        this.totalCapacityOfHardDiskDrives = totalCapacityOfHardDiskDrives;
    }

    @Override
    public String toString() {
        return "LaptopPOJO{" +
                "manufacturerWarranty='" + manufacturerWarranty + '\'' +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                ", type='" + type + '\'' +
                ", model='" + model + '\'' +
                ", yearOfRelease='" + yearOfRelease + '\'' +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                ", screenType='" + screenType + '\'' +
                ", screenSize='" + screenSize + '\'' +
                ", screenResolution='" + screenResolution + '\'' +
                ", procModel='" + procModel + '\'' +
                ", numOfCores=" + numOfCores +
                ", processorFrequency='" + processorFrequency + '\'' +
                ", typeOfRam='" + typeOfRam + '\'' +
                ", ramCapacity=" + ramCapacity +
                ", numberOfSlotsForMemoryModules='" + numberOfSlotsForMemoryModules + '\'' +
                ", integratedGraphicsCardModel='" + integratedGraphicsCardModel + '\'' +
                ", totalSolidStateDrives='" + totalSolidStateDrives + '\'' +
                ", totalCapacityOfHardDiskDrives='" + totalCapacityOfHardDiskDrives + '\'' +
                '}';
    }
}
