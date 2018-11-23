package ru.itpark;

import ru.itpark.data.CardData;
import ru.itpark.domain.Card;
import ru.itpark.repository.CardRepository;
import ru.itpark.service.CardService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CardData data = new CardData();
//        CardRepository repository = new CardRepository();
//        CardService service = new CardService(repository);
//
//        service.add(
//                "\r Tinkoff Black Platinum",
//                " Тинькофф Банк",
//                " Visa Platinum"+"\n",
//                " да",
//                " да",
//                " Нет",
//                " да",
//                " Руб",
//                " да",
//                " нет",
//                " нет",
//                " нет",
//                " нет"+"\n"+"\n"
//        );
//
//        service.add(
//                "\r Польза",
//                " Хоум Кредит Банк",
//                " Visa Platinum"+"\n",
//                " да",
//                " да",
//                " да",
//                " нет",
//                " Руб",
//                " да",
//                " да",
//                " нет",
//                " нет",
//                " нет"+"\n"+"\n"
//        );
//
//        service.add(
//                "\r Мультикарта",
//                " ВТБ",
//                " Visa Gold" + "Mastercard World" + "Мир Премиальная"+"\n",
//                " да",
//                " да",
//                " да",
//                " да",
//                " Руб",
//                " да",
//                " нет",
//                " нет",
//                " нет",
//                " нет"+"\n"+"\n"
//        );
//
//        service.add(
//                "\r Generation",
//                " Ак Барс",
//                " Mastercard World"+"\n",
//                " да",
//                " да",
//                " Нет",
//                " да",
//                " Руб",
//                " да",
//                " нет",
//                " нет",
//                " нет",
//                " да"+"\n"+"\n"
//        );
//
//        service.add(
//                "\rКарта номер один",
//                " Восточный Банк",
//                " Visa Classic"+"\n",
//                " да",
//                " да",
//                " Нет",
//                " да",
//                " Руб",
//                " да",
//                " нет",
//                " нет",
//                " нет",
//                " нет"+"\n"+"\n"
//        );
//
//        service.add(
//                "\rCard Plus",
//                "Кредит Европа Банк",
//                "Mastercard World"+"\n",
//                "да",
//                "да",
//                "Нет",
//                "да",
//                "Руб",
//                "да",
//                "нет",
//                "нет",
//                "нет",
//                "нет"+"\n"+"\n"
//        );
//
//        service.add(
//                "\rМаксимальный доход - Банки.ру",
//                "Локо-Банк",
//                "Visa Platinum, Mastercard Platinum\"+\"\\n",
//                "да",
//                "да",
//                "Нет",
//                "да",
//                "Руб",
//                "да",
//                "нет",
//                "нет",
//                "нет",
//                "нет"+"\n"+"\n"
//        );
//
//        service.add(
//                "\rТвой ПСБ",
//                "Восточный Банк",
//                "Mastercard Gold, Мир Классическая"+"\n",
//                "да",
//                "да",
//                "Нет",
//                "да",
//                "Руб",
//                "да",
//                "нет",
//                "нет",
//                "нет",
//                "нет"
//        );




        List<Card> name = name.findAllByName("0");
        System.out.println(name);


        List<Card> bankName = name.findAllByBankName("Восточный Банк");
        System.out.println(bankName);


        List<Card> cardCategory = name.findAllByCardCategory("мир");
        System.out.println(cardCategory);


        List<Card> percentOnBalance = name.findAllByPercentOnBalance("0");
        System.out.println(percentOnBalance);


        List<Card> priceOfService = name.findAllByPriceOfService("0");
        System.out.println(priceOfService);


        List<Card> bonus = name.findAllByBonus("0");
        System.out.println(bonus);


        List<Card> cashBack = name.findAllByCashBack("0");
        System.out.println(cashBack);


        List<Card> currency = name.findAllByCurrency("0");
        System.out.println(currency);


        List<Card> contactless = name.findAllByContactless("0");
        System.out.println(contactless);


        List<Card> cashCommission = name.findAllByCashCommission("0");
        System.out.println(cashCommission);


        List<Card> instantRelease = name.findAllByInstantRelease("0");
        System.out.println(instantRelease);

        List<Card> prepaidCard = name.findAllByPrepaidCard("0");
        System.out.println(prepaidCard);


        List<Card> publicTransport = name.findAllByPublicTransport("0");
        System.out.println(publicTransport);


    }
}
