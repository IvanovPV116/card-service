package ru.itpark.repository;

import ru.itpark.domain.Card;

import java.util.ArrayList;
import java.util.List;

public class CardRepository {
    public List<Card> cards = new ArrayList<Card>();

    public void add(Card card) {cards.add(card);}

    public List<Card>getCards(){return cards;}
}
