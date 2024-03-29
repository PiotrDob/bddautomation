package utils.models;

import java.math.BigDecimal;

public class ExchangeRate {

    private String code;
    private BigDecimal mid;
    private String currency;

    public ExchangeRate() {
    }

    public String getCode() {
        return code;
    }

    public ExchangeRate setCode(String c) {
        this.code = c;
        return this;
    }


    public String getCurrency() {
        return currency;
    }

    public ExchangeRate setCurrency(String c) {
        this.currency = c;
        return this;
    }


    public BigDecimal getMid() {
        return mid;
    }

    public ExchangeRate setMid(BigDecimal m) {
        this.mid = m;
        return this;
    }

    @Override
    public String toString() {
        return "Code: " + this.code + " | Currency: " + this.currency + " | Mid: " + this.mid;
    }

    public boolean isNull(){
        if (this.mid == null || this.currency == null || this.code == null)
            return true;
        else
            return false;
    }

}
