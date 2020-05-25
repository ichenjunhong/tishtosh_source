package com.p683ss.android.ugc.aweme.commerce.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commerce.model.d */
public final class C25518d implements Serializable {
    @C17952c(mo34828a = "card_predict_duration")
    public int cardPredictDuration;
    @C17952c(mo34828a = "order_share_recommend")
    public boolean isOrderShareRecommend;
    @C17952c(mo34828a = "recall_reason")
    public String recallReason = "";

    public final int getCardPredictDuration() {
        return this.cardPredictDuration;
    }

    public final String getRecallReason() {
        return this.recallReason;
    }

    public final boolean isOrderShareRecommend() {
        return this.isOrderShareRecommend;
    }

    public final void setCardPredictDuration(int i) {
        this.cardPredictDuration = i;
    }

    public final void setOrderShareRecommend(boolean z) {
        this.isOrderShareRecommend = z;
    }

    public final void setRecallReason(String str) {
        this.recallReason = str;
    }
}
