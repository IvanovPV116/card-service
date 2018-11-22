package ru.itpark;

import ru.itpark.domain.Card;
import ru.itpark.repository.CardRepository;
import ru.itpark.service.CardService;

import java.util.List;


class MainTest {

    @org.junit.jupiter.api.Test
    void main() {
        CardService service = new CardService(new CardRepository());


        service.add("\r Tinkoff Black Platinum",
                "Тинькофф Банк",
                " Visa Platinum"+"\n",
                " да",
                " да",
                " Нет",
                " да",
                " Руб",
                " да",
                " нет",
                " нет",
                " нет",
                " нет");
        List<Card> name = service.findAllByBankName("Тинькофф Банк");
        System.out.println(name);
    }
//    {
//        CardService service = new CardService(new CardRepository());
//        List<Card> bankName = service.findAllByBankName("Восточный Банк");
//        System.out.println(bankName);
//    }
//    {
//        CardService service = new CardService();
//        List<Card> cardCategory = service.findAllByCardCategory("мир");
//        System.out.println(cardCategory);
//    }
//    {
//
//        CardService service = new CardService();
//        List<Card> percentOnBalance = service.findAllByPercentOnBalance("да");
//        System.out.println(percentOnBalance);
//    }
//    {
//        CardService service = new CardService();
//        List<Card> priceOfService = service.findAllByPriceOfService("да");
//        System.out.println(priceOfService);
//    }
//    {
//
//        CardService service = new CardService();
//        List<Card> bonus = service.findAllByBonus("да");
//        System.out.println(bonus);
//    }
//    {
//
//        CardService service = new CardService();
//        List<Card> cashBack = service.findAllByCashBack("да");
//        System.out.println(cashBack);
//    }
//    {
//        CardService service = new CardService();
//        List<Card> currency = service.findAllByCurrency("да");
//        System.out.println(currency);
//    }
//    {
//        CardService service = new CardService();
//        List<Card> contactless = service.findAllByContactless("да");
//        System.out.println(contactless);
//    }
//    {
//        CardService service = new CardService();
//        List<Card> cashCommission = service.findAllByCashCommission("да");
//        System.out.println(cashCommission);
//    }
//    {
//        CardService service = new CardService();
//        List<Card> instantRelease = service.findAllByInstantRelease("да");
//        System.out.println(instantRelease);
//    }
//    {
//        CardService service = new CardService();
//        List<Card> prepaidCard = service.findAllByPrepaidCard("да");
//        System.out.println(prepaidCard);
//    }
//    {
//        CardService service = new CardService();
//        List<Card> publicTransport = service.findAllByPublicTransport("да");
//        System.out.println(publicTransport);
//    }
}