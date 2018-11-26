package ru.itpark.domain;

public class Card {
    private int id;
    private String name;
    private String bankName;
    private String cardCategory; //TODO: много категорий карты, оставлю 7, как их вложить? Либо указыват категорию при создании карты?
    private String percentOnBalance;   //проценты на остаток в поиске. в поиске true или не важно (галочка)
    private String priceOfService;     //стоимость обслуживания. в поиске бесплатно =0, true или не важно (галочка)
    private String bonus; //TODO: 7 категорий бонусов, как их вложить? Либо указыват бонус при создании карты?
    private String cashBack;           //в поиске true или не важно (галочка)
    private String currency; //валюта рубль, доллар, евро, мультивалютная
    private String contactless;     //бесконтактная оплата. в поиске true или не важно (галочка)
    private String cashCommission;   //комиссия за снятие. в поиске бесплатно =0, true или не важно (галочка)
    private String instantRelease;  //моментальный выпуск. в поиске true или не важно (галочка)
    private String prepaidCard;     //Предоплаченная карта. в поиске true или не важно (галочка)
    private String publicTransport; //оплата общественного транспорта. в поиске true или не важно (галочка)

    public Card(int id,
                String name,
                String bankName,
                String cardCategory,
                String percentOnBalance,
                String priceOfService,
                String bonus,
                String cashBack,
                String currency,
                String contactless,
                String cashCommission,
                String instantRelease,
                String prepaidCard,
                String publicTransport) {
       this.id = id;
        this.name = name;
        this.bankName = bankName;
        this.cardCategory = cardCategory;
        this.percentOnBalance = percentOnBalance;
        this.priceOfService = priceOfService;
        this.bonus = bonus;
        this.cashBack = cashBack;
        this.currency = currency;
        this.contactless = contactless;
        this.cashCommission = cashCommission;
        this.instantRelease = instantRelease;
        this.prepaidCard = prepaidCard;
        this.publicTransport = publicTransport;
    }

    public int getId() { return id;}

    public String getName() { return name;}

    public String getBankName() { return bankName;}

    public String getCardCategory() { return cardCategory;}

    public String getPercentOnBalance() { return percentOnBalance;}

    public String getPriceOfService() {
        return priceOfService;
    }

    public String getBonus() {
        return bonus;
    }

    public String getCashBack() {
        return cashBack;
    }

    public String getCurrency() {
        return currency;
    }

    public String getContactless() {
        return contactless;
    }

    public String getCashCommission() {
        return cashCommission;
    }

    public String getInstantRelease() {
        return instantRelease;
    }

    public String getPrepaidCard() {
        return prepaidCard;
    }

    public String getPublicTransport() {
        return publicTransport;
    }
    public String toString(){
        return "Card{" +
                "id"+id+
                ",name'"+name+ '\''+
                ",bankName'"+bankName+'\''+
                ",cardCategory'" + cardCategory + '\''+
                ",percentOnBalance'"+percentOnBalance+'\''+
                ",priceOfService'"+priceOfService+'\''+
                ",bonus'"+bonus + '\''+
                ",cashBack'"+ cashBack+ '\''+
                ",currency'"+ currency+ '\''+
                ",contactless'"+ contactless+ '\''+
                ",cashCommission'"+ cashCommission+ '\''+
                ",instantRelease'"+ instantRelease+ '\''+
                ",prepaidCard'"+ prepaidCard+ '\''+
                ",publicTransport'"+ publicTransport+ '\''+
                '}';

    }
}
