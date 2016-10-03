package com.shail.encryptiondecryption;

import com.google.gson.annotations.SerializedName;

/**
 * Created by iTexico Developer on 9/30/2016.
 */

public class CreditCard {

    @SerializedName("cardNumberMasked")
    public String cardNumberMasked;

    @SerializedName("cardType")
    public String cardType;

    @SerializedName("cardToken")
    public String cardToken;

    @SerializedName("customerId")
    public String customerId;

    @SerializedName("cardId")
    public String cardId;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getCardNumberMasked() {
        return cardNumberMasked;
    }

    public void setCardNumberMasked(String cardNumberMasked) {
        this.cardNumberMasked = cardNumberMasked;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCardToken() {
        return cardToken;
    }

    public void setCardToken(String cardToken) {
        this.cardToken = cardToken;
    }
}
