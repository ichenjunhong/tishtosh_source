package com.p683ss.android.ugc.aweme.poi.model;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.poi.model.l */
public final class C39128l implements Serializable {
    public String activityId;
    public String anchorId;
    public String authorId;
    public String awemeid;
    public String backendType;
    public String bannerId;
    public String challengeId;
    public String cityCode;
    public String clickMethod;
    public String contentSource;
    public String contentType;
    public String couponId;
    public int displayStyle;
    public String distanceInfo;
    public String distanceKm;
    public String districtCode;
    public HashMap<String, String> forwardTypeV3Params;
    public String from;
    public String fromPoiId;
    public boolean fromQrScan;
    public String fromUserId;
    public boolean hasActivity;
    public String isCoupon;
    public boolean isPreviewMode;
    public String logPb;
    public int order;
    public String pagePoiId;
    public String pageType;
    public String poiChannel;
    public String poiId;
    public String poiLabelType;
    public String poiName;
    public String poiType;
    public String previousPage;
    public String rankIndex;
    public String requestId;
    public String roomId;
    public String searchKeyWord;
    public String sticker;
    public String subClass;
    public String tabName;
    public String toUserId;

    public C39128l() {
    }

    public final boolean hasActivity() {
        if (this.hasActivity || !TextUtils.isEmpty(this.sticker) || !TextUtils.isEmpty(this.challengeId)) {
            return true;
        }
        return false;
    }

    public C39128l(String str) {
        this.poiId = str;
    }
}
