package ru.itpark.data;

import ru.itpark.repository.CardRepository;
import ru.itpark.service.CardService;

public class CardData {
    public static void cardData(String[] args) {
        CardRepository repository = new CardRepository();
        CardService service = new CardService(repository);

        service.add(
                "\r Tinkoff Black Platinum",
                " Тинькофф Банк",
                " Visa Platinum" + "\n",
                " да",
                " да",
                " Нет",
                " да",
                " Руб",
                " да",
                " нет",
                " нет",
                " нет",
                " нет" + "\n" + "\n"
        );

        service.add(
                "\r Польза",
                " Хоум Кредит Банк",
                " Visa Platinum" + "\n",
                " да",
                " да",
                " да",
                " нет",
                " Руб",
                " да",
                " да",
                " нет",
                " нет",
                " нет" + "\n" + "\n"
        );

        service.add(
                "\r Мультикарта",
                " ВТБ",
                " Visa Gold" + "Mastercard World" + "Мир Премиальная" + "\n",
                " да",
                " да",
                " да",
                " да",
                " Руб",
                " да",
                " нет",
                " нет",
                " нет",
                " нет" + "\n" + "\n"
        );

        service.add(
                "\r Generation",
                " Ак Барс",
                " Mastercard World" + "\n",
                " да",
                " да",
                " Нет",
                " да",
                " Руб",
                " да",
                " нет",
                " нет",
                " нет",
                " да" + "\n" + "\n"
        );

        service.add(
                "\rКарта номер один",
                " Восточный Банк",
                " Visa Classic" + "\n",
                " да",
                " да",
                " Нет",
                " да",
                " Руб",
                " да",
                " нет",
                " нет",
                " нет",
                " нет" + "\n" + "\n"
        );

        service.add(
                "\rCard Plus",
                "Кредит Европа Банк",
                "Mastercard World" + "\n",
                "да",
                "да",
                "Нет",
                "да",
                "Руб",
                "да",
                "нет",
                "нет",
                "нет",
                "нет" + "\n" + "\n"
        );

        service.add(
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
                "нет" + "\n" + "\n"
        );

        service.add(
                "\rТвой ПСБ",
                "Восточный Банк",
                "Mastercard Gold, Мир Классическая" + "\n",
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

    }
}