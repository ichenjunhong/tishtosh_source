package com.p683ss.android.ugc.aweme.poi.p2074ui.publish;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.poi.model.C39136t;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p683ss.android.ugc.aweme.utils.C47759cc;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.publish.PoiStructInToolsLine */
public class PoiStructInToolsLine {
    private static final String TAG = "PoiStructInToolsLine";
    @C17952c(mo34828a = "mPoiRateId")
    public String mPoiRateId;
    @C17952c(mo34828a = "mPoiRatePrompt")
    public String mPoiRatePrompt;
    public PoiStruct poi;
    public C39136t poiActivity;
    public final int version = 1;

    public String getPoiId() {
        return this.poi.poiId;
    }

    public String getPoiName() {
        return this.poi.poiName;
    }

    public String toJson() {
        return C47759cc.m103382a().getGson().mo34889b(this);
    }

    public static String filter(String str) {
        PoiStructInToolsLine fromJson = fromJson(str);
        if (fromJson != null) {
            return fromJson.toJson();
        }
        return null;
    }

    public static boolean hasPoiActivity(PoiStructInToolsLine poiStructInToolsLine) {
        if (poiStructInToolsLine == null || poiStructInToolsLine.poiActivity == null) {
            return false;
        }
        return true;
    }

    public static String filterForDraft(String str) {
        PoiStructInToolsLine fromJson = fromJson(str);
        if (hasPoiActivity(fromJson)) {
            fromJson.poiActivity = null;
            return fromJson.toJson();
        } else if (fromJson == null || fromJson.poi == null) {
            return null;
        } else {
            return str;
        }
    }

    public static PoiStructInToolsLine fromJson(String str) {
        try {
            return (PoiStructInToolsLine) C47759cc.m103382a().getGson().mo34884a(str, PoiStructInToolsLine.class);
        } catch (Exception unused) {
            return null;
        }
    }
}
