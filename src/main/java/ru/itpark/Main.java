package ru.itpark;


import ru.itpark.domain.Card;
import ru.itpark.repository.CardRepository;
import ru.itpark.service.CardService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CardRepository repository = new CardRepository();
        CardService service = new CardService(repository);

        service.add(
                0,
                "\r Tinkoff Black Platinum",
                " Тинькофф Банк",
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
                " да"+"\n"+"\n"
        );

        service.add(
                0,
                "\r Польза",
                " Хоум Кредит Банк",
                " Visa Platinum"+"\n",
                " да",
                " да",
                " да",
                " нет",
                " Руб",
                " да",
                " да",
                " нет",
                " нет",
                " нет"+"\n"+"\n"
        );

        service.add(
                0,
                "\r Мультикарта",
                " ВТБ",
                " Visa Gold" + "Mastercard World" + "Мир Премиальная"+"\n",
                " да",
                " да",
                " да",
                " да",
                " Руб",
                " да",
                " нет",
                " нет",
                " нет",
                " нет"+"\n"+"\n"
        );

        service.add(
                0,
                "\r Generation",
                " Ак Барс",
                " Mastercard World"+"\n",
                " да",
                " да",
                " Нет",
                " да",
                " Руб",
                " да",
                " нет",
                " нет",
                " нет",
                " да"+"\n"+"\n"
        );

        service.add(
                0,
                "\rКарта номер один",
                " Восточный Банк",
                " Visa Classic"+"\n",
                " да",
                " да",
                " Нет",
                " да",
                " Руб",
                " да",
                " нет",
                " нет",
                " нет",
                " нет"+"\n"+"\n"
        );

        service.add(
                0,
                "\rCard Plus",
                "Кредит Европа Банк",
                "Mastercard World"+"\n",
                "нет",
                "да",
                "Нет",
                "да",
                "Руб",
                "да",
                "нет",
                "нет",
                "нет",
                "нет"+"\n"+"\n"
        );

        service.add(
                0,
                "\rМаксимальный доход - Банки.ру",
                "Локо-Банк",
                "Visa Platinum, Mastercard Platinum\"+\"\\n",
                "да",
                "да",
                "Нет",
                "да",
                "Руб",
                "да",
                "нет",
                "нет",
                "нет",
                "нет"+"\n"+"\n"
        );

        service.add(
                0,
                "\rТвой ПСБ",
                "Восточный Банк",
                "Mastercard Gold, Мир Классическая"+"\n",
                "да",
                "да",
                "Нет",
                "да",
                "Руб",
                "да",
                "нет",
                "нет",
                "нет",
                "нет"
        );


        System.out.println("Поиск:");

        System.out.println("\n \n-Результаты поиска по - Название Карты': \n");
        List<Card> name = service.findAllByName("0");
        System.out.println(name);

        System.out.println(" \n \n-Результаты поиска по - Название Банка: \n");
        List<Card> bankName = service.findAllByBankName("0");
        System.out.println(bankName);

        System.out.println(" \n \n-Результаты поиска по - Категория карты: \n");
        List<Card> cardCategory = service.findAllByCardCategory("0");
        System.out.println(cardCategory);

        System.out.println(" \n \n-Результаты поиска по - Проценты на остаток: \n");
        List<Card> percentOnBalance = service.findAllByPercentOnBalance("0");
        System.out.println(percentOnBalance);

        System.out.println(" \n \n-Результаты поиска по - Бесплатное обслуживание: \n");
        List<Card> priceOfService = service.findAllByPriceOfService("0");
        System.out.println(priceOfService);

        System.out.println(" \n \n-Результаты поиска по - Бонусы и скидки: \n");
        List<Card> bonus = service.findAllByBonus("0");
        System.out.println(bonus);

        System.out.println(" \n \n-Результаты поиска по - CashBack: \n");
        List<Card> cashBack = service.findAllByCashBack("0");
        System.out.println(cashBack);

        System.out.println(" \n \n-Результаты поиска по - Валюта: \n");
        List<Card> currency = service.findAllByCurrency("0");
        System.out.println(currency);

        System.out.println(" \n \n-Результаты поиска по - Бесконтактная оплата: \n");
        List<Card> contactless = service.findAllByContactless("0");
        System.out.println(contactless);

        System.out.println(" \n \n-Результаты поиска по - комиссия за снятие: \n");
        List<Card> cashCommission = service.findAllByCashCommission("0");
        System.out.println(cashCommission);

        System.out.println(" \n \n-Результаты поиска по - моментальный выпуск: \n");
        List<Card> instantRelease = service.findAllByInstantRelease("0");
        System.out.println(instantRelease);

        System.out.println(" \n \n-Результаты поиска по - Предоплаченная карта: \n");
        List<Card> prepaidCard = service.findAllByPrepaidCard("0");
        System.out.println(prepaidCard);

        System.out.println(" \n \n-Результаты поиска по - Оплата общественного транспорта: \n");
        List<Card> publicTransport = service.findAllByPublicTransport("да");
        System.out.println(publicTransport + "\n");

    }
}
