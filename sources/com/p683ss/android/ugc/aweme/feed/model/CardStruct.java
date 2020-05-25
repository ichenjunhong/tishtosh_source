package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.C17971f;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.model.CardStruct */
public class CardStruct implements Serializable {
    @C17952c(mo34828a = "card_data")
    private Object cardData;
    @C17952c(mo34828a = "card_style")
    int cardStyle;
    @C17952c(mo34828a = "card_type")
    int cardType;
    @C17952c(mo34828a = "card_url")
    String cardUrl;
    @C17952c(mo34828a = "dynamic_type")
    private int dynamicType;
    @C17952c(mo34828a = "preload_type")
    private int preloadType;
    @C17952c(mo34828a = "show_duration")
    private int showDuration;
    @C17952c(mo34828a = "show_seconds")
    int showSeconds;
    @C17952c(mo34828a = "track_url_list")
    private UrlModel trackUrlList;

    /* renamed from: com.ss.android.ugc.aweme.feed.model.CardStruct$IStatusCode */
    public interface IStatusCode {
    }

    public int getCardStyle() {
        return this.cardStyle;
    }

    public int getCardType() {
        return this.cardType;
    }

    public String getCardUrl() {
        return this.cardUrl;
    }

    public int getDynamicType() {
        return this.dynamicType;
    }

    public int getShowDuration() {
        return this.showDuration;
    }

    public int getShowSeconds() {
        return this.showSeconds;
    }

    public UrlModel getTrackUrlList() {
        return this.trackUrlList;
    }

    public boolean isEnablePreload() {
        if (this.preloadType == 1) {
            return true;
        }
        return false;
    }

    public JSONObject getCardData() {
        try {
            return new JSONObject(new C17971f().mo34889b(this.cardData));
        } catch (Exception unused) {
            return null;
        }
    }

    public void setCardType(int i) {
        this.cardType = i;
    }

    public void setCardUrl(String str) {
        this.cardUrl = str;
    }

    public void setTrackUrlList(UrlModel urlModel) {
        this.trackUrlList = urlModel;
    }
}
