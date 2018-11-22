package ru.itpark.service;

import ru.itpark.domain.Card;
import ru.itpark.repository.CardRepository;
import sun.awt.geom.AreaOp;

import java.util.ArrayList;
import java.util.List;

public class CardService {


    public CardRepository repository;

    public CardService(CardRepository repository) {
        this.repository = repository;
    }

    public CardService() {

    }

    public void add (
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
            String publicTransport

    ){
        Card card = new Card(
               0,
                name,
                bankName,
                cardCategory,
                percentOnBalance,
                priceOfService,
                bonus,
                cashBack,
                currency,
                contactless,
                cashCommission,
                instantRelease,
                prepaidCard,
                publicTransport );
        repository.add(card);
    }
    public List<Card> findAllByName(String name) {
        List<Card> result = new ArrayList<Card>();

        name = name.toLowerCase();// достаточно один раз до цикла преобразовать в нижний регистр
        for (Card card : repository.getCards()) {
            if (card.getName().toLowerCase().contains(name)) {
                result.add(card);
            }
        }
        return result;
    }
    public List<Card> findAllByBankName (String bankName) {
        List<Card> result = new ArrayList<Card>();

        bankName = bankName.toLowerCase();// достаточно один раз до цикла преобразовать в нижний регистр
        for (Card card : repository.getCards()) {
            if (card.getBankName().toLowerCase().contains(bankName)) {
                result.add(card);
            }
        }
        return result;
    }


        public List<Card> findAllByCardCategory (String cardCategory){
        List<Card> result = new ArrayList<Card>();

        cardCategory=cardCategory.toLowerCase();// достаточно один раз до цикла преобразовать в нижний регистр
        for (Card card:repository.getCards()){
            if(card.getCardCategory().toLowerCase().contains(cardCategory)){
                result.add(card);
            }
        }
        return result;

    }
    public List<Card> findAllByPercentOnBalance (String percentOnBalance) {
        List<Card> result = new ArrayList<Card>();

        percentOnBalance = percentOnBalance.toLowerCase();// достаточно один раз до цикла преобразовать в нижний регистр
        for (Card card : repository.getCards()) {
            if (card.getPercentOnBalance().toLowerCase().contains(percentOnBalance)) {
                result.add(card);
            }
        }
        return result;
    }
    public List<Card> findAllByPriceOfService (String priceOfService) {
        List<Card> result = new ArrayList<Card>();

        priceOfService = priceOfService.toLowerCase();// достаточно один раз до цикла преобразовать в нижний регистр
        for (Card card : repository.getCards()) {
            if (card.getPriceOfService().toLowerCase().contains(priceOfService)) {
                result.add(card);
            }
        }
        return result;
    }
    public List<Card> findAllByBonus (String bonus) {
        List<Card> result = new ArrayList<Card>();

        bonus = bonus.toLowerCase();// достаточно один раз до цикла преобразовать в нижний регистр
        for (Card card : repository.getCards()) {
            if (card.getBonus().toLowerCase().contains(bonus)) {
                result.add(card);
            }
        }
        return result;
    }
    public List<Card> findAllByCashBack (String cashBack) {
        List<Card> result = new ArrayList<Card>();

        cashBack = cashBack.toLowerCase();// достаточно один раз до цикла преобразовать в нижний регистр
        for (Card card : repository.getCards()) {
            if (card.getCashBack().toLowerCase().contains(cashBack)) {
                result.add(card);
            }
        }
        return result;
    }
    public List<Card> findAllByCurrency (String currency) {
        List<Card> result = new ArrayList<Card>();

        currency = currency.toLowerCase();// достаточно один раз до цикла преобразовать в нижний регистр
        for (Card card : repository.getCards()) {
            if (card.getCurrency().toLowerCase().contains(currency)) {
                result.add(card);
            }
        }
        return result;
    }

    public List<Card> findAllByContactless (String contactless) {
        List<Card> result = new ArrayList<Card>();

        contactless = contactless.toLowerCase();// достаточно один раз до цикла преобразовать в нижний регистр
        for (Card card : repository.getCards()) {
            if (card.getContactless().toLowerCase().contains(contactless)) {
                result.add(card);
            }
        }
        return result;
    }
    public List<Card> findAllByCashCommission (String cashCommission) {
        List<Card> result = new ArrayList<Card>();

        cashCommission = cashCommission.toLowerCase();// достаточно один раз до цикла преобразовать в нижний регистр
        for (Card card : repository.getCards()) {
            if (card.getCashCommission().toLowerCase().contains(cashCommission)) {
                result.add(card);
            }
        }
        return result;
    }
    public List<Card> findAllByInstantRelease (String instantRelease) {
        List<Card> result = new ArrayList<Card>();

        instantRelease = instantRelease.toLowerCase();// достаточно один раз до цикла преобразовать в нижний регистр
        for (Card card : repository.getCards()) {
            if (card.getInstantRelease().toLowerCase().contains(instantRelease)) {
                result.add(card);
            }
        }
        return result;
    }
    public List<Card> findAllByPrepaidCard (String prepaidCard) {
        List<Card> result = new ArrayList<Card>();

        prepaidCard = prepaidCard.toLowerCase();// достаточно один раз до цикла преобразовать в нижний регистр
        for (Card card : repository.getCards()) {
            if (card.getPrepaidCard().toLowerCase().contains(prepaidCard)) {
                result.add(card);
            }
        }
        return result;
    }
    public List<Card> findAllByPublicTransport (String publicTransport) {
        List<Card> result = new ArrayList<Card>();

        publicTransport = publicTransport.toLowerCase();// достаточно один раз до цикла преобразовать в нижний регистр
        for (Card card : repository.getCards()) {
            if (card.getPublicTransport().toLowerCase().contains(publicTransport)) {
                result.add(card);
            }
        }
        return result;
    }
}
