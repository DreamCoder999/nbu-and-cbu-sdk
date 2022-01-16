package uz.dreamcode.nbu.model;

import com.google.gson.annotations.SerializedName;

public class NBUModel {
    @SerializedName(value = "title")
    private String title;
    @SerializedName(value = "code")
    private String code;
    @SerializedName(value = "cb_price")
    private String cbPrice;
    @SerializedName(value = "nbu_buy_price")
    private String nbuBuyPrice;
    @SerializedName(value = "nbu_cell_price")
    private String nbuCellPrice;
    @SerializedName(value = "date")
    private String date;

    public NBUModel(String title, String code, String cbPrice, String nbuBuyPrice, String nbuCellPrice, String date) {
        this.title = title;
        this.code = code;
        this.cbPrice = cbPrice;
        this.nbuBuyPrice = nbuBuyPrice;
        this.nbuCellPrice = nbuCellPrice;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public String getCode() {
        return code;
    }

    public String getCbPrice() {
        return cbPrice;
    }

    public String getNbuBuyPrice() {
        return nbuBuyPrice;
    }

    public String getNbuCellPrice() {
        return nbuCellPrice;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "NBUModel{" +
                "title='" + title + '\'' +
                ", code='" + code + '\'' +
                ", cbPrice='" + cbPrice + '\'' +
                ", nbuBuyPrice='" + nbuBuyPrice + '\'' +
                ", nbuCellPrice='" + nbuCellPrice + '\'' +
                ", date=" + date +
                '}';
    }
}
/*
* {
        "title": "BAA dirhami",
        "code": "AED",
        "cb_price": "2954.46",
        "nbu_buy_price": "",
        "nbu_cell_price": "",
        "date": "15.01.2022 16:00:01"
    }*/