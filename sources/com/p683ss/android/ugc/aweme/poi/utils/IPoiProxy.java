package com.p683ss.android.ugc.aweme.poi.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.livesdkapi.service.C8862e;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.poi.C39040b;
import com.p683ss.android.ugc.aweme.poi.C39054d;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.IPoiProxy */
public interface IPoiProxy {
    C39040b createPoiItemViewHolder(View view, C39054d dVar);

    String detectIsFromEditOrStory(Context context);

    void disableStartActivityIfNeeded(Activity activity);

    void enterLiveOrNot(Activity activity, Bundle bundle, View view);

    String getGeckoRes(String str, String str2);

    Map<Object, Object> getTrickyMapByActivity(Context context);

    void handleCellClick(Aweme aweme);

    void jumpToPoiDetail(Context context, Aweme aweme, String str, String str2, JSONObject jSONObject, View view);

    C8862e liveService();

    void logFeedRawPoiAdOpenUrlApp(Context context, AwemeRawAd awemeRawAd, String str);

    void logFeedRawPoiAdOpenUrlH5(Context context, AwemeRawAd awemeRawAd, String str);

    void logPoiAdClick(Context context, AwemeRawAd awemeRawAd, String str);

    void logPoiAdCollect(Context context, Aweme aweme, String str);

    void logPoiAdCollectCancel(Context context, Aweme aweme, String str);

    void logPoiAdCouponClick(Context context, Aweme aweme, String str);

    void logPoiAdOtherClick(Context context, Aweme aweme, String str, String str2);

    void logPoiAdPhoneClick(Context context, Aweme aweme, String str);

    void logPoiAdShow(Context context, AwemeRawAd awemeRawAd, String str);

    void onDeepLinkFinished(Activity activity);

    boolean openAdOpenUrl(Context context, String str, boolean z);

    boolean openAdWebUrl(Context context, String str, String str2);

    void poiCardJumpToDetail(Context context, Aweme aweme);

    void sendPoiFavouriteEvent(String str, String str2, String str3, boolean z);

    void startChat(Context context, String str, String str2, String str3, UrlModel urlModel, String str4, String str5);

    void trackAppsFlyerEvent(String str, String str2);

    void tryLoadAwemeMapPlugin();
}
