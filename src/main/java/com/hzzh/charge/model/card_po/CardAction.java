package com.hzzh.charge.model.card_po;

import com.hzzh.charge.model.Card;
import com.hzzh.charge.model.CardHistory;

/**
 * 充值卡包装类
 * Created by TaoRan on 2016/10/20.
 */
public class CardAction {
    //充值卡
    private Card card;
    //充值历史记录
    private CardHistory cardHistory;

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public CardHistory getCardHistory() {
        return cardHistory;
    }

    public void setCardHistory(CardHistory cardHistory) {
        this.cardHistory = cardHistory;
    }
}
