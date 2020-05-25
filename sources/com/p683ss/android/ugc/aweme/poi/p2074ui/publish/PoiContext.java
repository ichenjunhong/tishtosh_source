package com.p683ss.android.ugc.aweme.poi.p2074ui.publish;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.aweme.poi.PoiServiceImpl;
import com.p683ss.android.ugc.aweme.poi.model.C39136t;
import com.p683ss.android.ugc.aweme.utils.C47759cc;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.publish.PoiContext */
public class PoiContext implements Serializable {
    private static final int MAX_RECOMMEND_DISTANCE = 50;
    private static final String TAG = "PoiDraft";
    public C39136t mPoiActivity;
    public String mPoiRateId;
    public String mPoiRatePrompt;
    public String mSelectPoiId;
    public String mSelectPoiName;
    public String mShootPoiId;
    public double mShootPoiLat;
    public double mShootPoiLng;
    public String mShootPoiName;

    public void setLat(String str) {
        this.mShootPoiLat = safeParseDouble(str);
    }

    public void setLng(String str) {
        this.mShootPoiLng = safeParseDouble(str);
    }

    private double safeParseDouble(String str) {
        if (TextUtils.isEmpty(str)) {
            return ProfileUiInitOptimizeEnterThreshold.DEFAULT;
        }
        try {
            return Double.parseDouble(str);
        } catch (Exception unused) {
            return ProfileUiInitOptimizeEnterThreshold.DEFAULT;
        }
    }

    public static String serializeForDraft(String str) {
        PoiContext unserializeFromJson = unserializeFromJson(str);
        if (unserializeFromJson == null) {
            return null;
        }
        if (unserializeFromJson.mPoiActivity != null) {
            unserializeFromJson.mPoiActivity = null;
        }
        return serializeToStr(unserializeFromJson);
    }

    public static String serializeToStr(PoiContext poiContext) {
        if (poiContext == null) {
            return null;
        }
        return C47759cc.m103382a().getGson().mo34889b(poiContext);
    }

    public static PoiContext unserializeFromJson(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            PoiStructInToolsLine fromJson = PoiStructInToolsLine.fromJson(str);
            if (fromJson == null) {
                return (PoiContext) C47759cc.m103382a().getGson().mo34884a(str, PoiContext.class);
            }
            if (fromJson.poi != null && !TextUtils.isEmpty(fromJson.getPoiId())) {
                if (!TextUtils.isEmpty(fromJson.getPoiName())) {
                    PoiContext poiContext = new PoiContext();
                    if (PoiStructInToolsLine.hasPoiActivity(fromJson)) {
                        poiContext.mPoiActivity = fromJson.poiActivity;
                        poiContext.mShootPoiId = fromJson.getPoiId();
                        poiContext.mShootPoiName = fromJson.getPoiName();
                        poiContext.setLat(fromJson.poi.getPoiLatitude());
                        poiContext.setLng(fromJson.poi.getPoiLongitude());
                    } else {
                        poiContext.mSelectPoiId = fromJson.getPoiId();
                        poiContext.mSelectPoiName = fromJson.getPoiName();
                        poiContext.mPoiRateId = fromJson.mPoiRateId;
                        poiContext.mPoiRatePrompt = fromJson.mPoiRatePrompt;
                    }
                    return poiContext;
                }
            }
            return (PoiContext) C47759cc.m103382a().getGson().mo34884a(str, PoiContext.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean hasRecommendPoi(String str, String str2) {
        double safeParseDouble = safeParseDouble(str);
        double safeParseDouble2 = safeParseDouble(str2);
        if (safeParseDouble == ProfileUiInitOptimizeEnterThreshold.DEFAULT || safeParseDouble2 == ProfileUiInitOptimizeEnterThreshold.DEFAULT || TextUtils.isEmpty(this.mShootPoiId) || TextUtils.isEmpty(this.mShootPoiName) || this.mShootPoiLat == ProfileUiInitOptimizeEnterThreshold.DEFAULT || this.mShootPoiLng == ProfileUiInitOptimizeEnterThreshold.DEFAULT || PoiServiceImpl.createIPoiServicebyMonsterPlugin().distance(safeParseDouble, safeParseDouble2, this.mShootPoiLat, this.mShootPoiLng) > 50.0d) {
            return false;
        }
        return true;
    }
}
