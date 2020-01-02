package com.bimlendu.xyz.stockmanagement.models;

public class SKUAvailability {

    private String sku;
    private int availableNos;

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public int getAvailableNos() {
        return availableNos;
    }

    public void setAvailableNos(int availableNos) {
        this.availableNos = availableNos;
    }
}
