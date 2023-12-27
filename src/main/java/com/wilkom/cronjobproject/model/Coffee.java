package com.wilkom.cronjobproject.model;

import java.util.Objects;

public class Coffee {

    private String brand;
    private String origin;
    private String characteristics;

    public Coffee(String brand, String origin, String characteristics) {
        this.brand = brand;
        this.origin = origin;
        this.characteristics = characteristics;
    }

    public Coffee() {
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOrigin() {
        return this.origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getCharacteristics() {
        return this.characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public Coffee brand(String brand) {
        setBrand(brand);
        return this;
    }

    public Coffee origin(String origin) {
        setOrigin(origin);
        return this;
    }

    public Coffee characteristics(String characteristics) {
        setCharacteristics(characteristics);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Coffee)) {
            return false;
        }
        Coffee coffee = (Coffee) o;
        return Objects.equals(brand, coffee.brand) && Objects.equals(origin, coffee.origin)
                && Objects.equals(characteristics, coffee.characteristics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, origin, characteristics);
    }

    @Override
    public String toString() {
        return "{" +
                " brand='" + getBrand() + "'" +
                ", origin='" + getOrigin() + "'" +
                ", characteristics='" + getCharacteristics() + "'" +
                "}";
    }

}
