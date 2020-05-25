package com.p683ss.android.ugc.aweme.poi.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.sticker.data.PoiCardStruct;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.model.n */
public final class C39130n implements Serializable {
    @C17952c(mo34828a = "is_show")
    public int isShow;
    @C17952c(mo34828a = "url")
    public String url;

    public final int getIsShow() {
        return this.isShow;
    }

    public final String getUrl() {
        return this.url;
    }

    public final PoiCardStruct toStickerPoiCard() {
        PoiCardStruct poiCardStruct = new PoiCardStruct();
        poiCardStruct.setIsShow(Integer.valueOf(this.isShow));
        poiCardStruct.setUrl(this.url);
        return poiCardStruct;
    }

    public final void setIsShow(int i) {
        this.isShow = i;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void fromStickerPoiStruct(PoiCardStruct poiCardStruct) {
        int i;
        if (poiCardStruct != null) {
            if (poiCardStruct.getIsShow() != null) {
                i = poiCardStruct.getIsShow().intValue();
            } else {
                i = 0;
            }
            this.isShow = i;
            this.url = poiCardStruct.getUrl();
        }
    }
}
