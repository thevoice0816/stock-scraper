package model;

import lombok.Data;

@Data
public class DailyStockPriceTO {

    private String Date;

    private String stockId;

    private String stockName;

    private String volumn;

    private String transactions;

    private String transactionsMoney;

    private String openingPrice;

    private String highestPrice;

    private String lowerstPrice;

    private String closingPrice;

    private String change;

    private String amplitude;

    private String finalBuyPrice;

    private String finalBuyVolumn;

    private String finalSellPrice;

    private String finalSellVolumn;

    private String peRatio;
}
