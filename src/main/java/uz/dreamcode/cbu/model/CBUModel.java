package uz.dreamcode.cbu.model;

import com.google.gson.annotations.SerializedName;

public class CBUModel {
    @SerializedName(value = "id")
    private Long id;
    @SerializedName(value = "Code")
    private String code;
    @SerializedName(value = "Ccy")
    private String ccy;
    @SerializedName(value = "CcyNm_RU")
    private String ccyNmRu;
    @SerializedName(value = "CcyNm_UZ")
    private String ccyNmUz;
    @SerializedName(value = "CcyNm_UZC")
    private String ccyNmUzc;
    @SerializedName(value = "CcyNm_EN")
    private String ccyNmEn;
    @SerializedName(value = "Nominal")
    private String nominal;
    @SerializedName(value = "Rate")
    private String rate;
    @SerializedName(value = "Diff")
    private String diff;
    @SerializedName(value = "Date")
    private String date;

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getCcy() {
        return ccy;
    }

    public String getCcyNmRu() {
        return ccyNmRu;
    }

    public String getCcyNmUz() {
        return ccyNmUz;
    }

    public String getCcyNmUzc() {
        return ccyNmUzc;
    }

    public String getCcyNmEn() {
        return ccyNmEn;
    }

    public String getNominal() {
        return nominal;
    }

    public String getRate() {
        return rate;
    }

    public String getDiff() {
        return diff;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "CBUModel{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", ccy='" + ccy + '\'' +
                ", ccyNmRu='" + ccyNmRu + '\'' +
                ", ccyNmUz='" + ccyNmUz + '\'' +
                ", ccyNmUzc='" + ccyNmUzc + '\'' +
                ", ccyNmEn='" + ccyNmEn + '\'' +
                ", nominal='" + nominal + '\'' +
                ", rate='" + rate + '\'' +
                ", diff='" + diff + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}