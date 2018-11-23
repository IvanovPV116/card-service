package ru.itpark.repository;

import ru.itpark.domain.Card;

import java.util.ArrayList;
import java.util.List;

public class CardRepository {
    private List<Card> cards = new ArrayList<Card>();
    public void add(Card card) {cards.add(card);}
    public List<Card>getCards(){

        cards.add(new Card(
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
                " да"+"\n"+"\n")
        );

        cards.add(new Card(
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
                " нет"+"\n"+"\n")
        );

        cards.add(new Card(
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
                " нет"+"\n"+"\n")
        );

        cards.add(new Card(
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
                " да"+"\n"+"\n")
        );

        cards.add(new Card(
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
                " нет"+"\n"+"\n")
        );

        cards.add(new Card(
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
                "нет"+"\n"+"\n")
        );

        cards.add(new Card(
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
                "нет"+"\n"+"\n")
        );

        cards.add(new Card(
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
                "нет")
        );

        return cards;}
}
