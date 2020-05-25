package com.p683ss.android.ugc.aweme.poi.service;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.os.Handler;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.p522b.C9381g;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.commercialize.coupon.model.C25687b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.poi.C39054d;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.adapter.C38969a;
import com.p683ss.android.ugc.aweme.poi.model.C39142z;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p683ss.android.ugc.aweme.poi.model.p2062a.C39087a;
import com.p683ss.android.ugc.aweme.poi.model.p2062a.C39092f;
import com.p683ss.android.ugc.aweme.poi.p2060c.C39051a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39588bb.C39590b;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.service.IPoiService */
public interface IPoiService {
    HashMap<String, String> appendPoiParams(Aweme aweme);

    boolean autoPlayLiveInNearbyTab();

    void bindLive(Context context, ViewGroup viewGroup, View view, View view2);

    double distance(double d, double d2, double d3, double d4);

    String distanceStrMore(Context context, double d, double d2, double d3, double d4);

    String[] formatCoordinate(C39054d dVar);

    String formatDistance(Context context, double d);

    double[] gcj02towgs84(Double d, Double d2);

    String getDisplayCount(Context context, PoiStruct poiStruct);

    String getDistance(Context context, PoiStruct poiStruct);

    String getDistanceBetweenLocations(Context context, double d, double d2, double d3, double d4);

    boolean getHasShowPermissionTipDialog();

    PagerAdapter getInfiniteLoopPoiBannerAdapter(PagerAdapter pagerAdapter, int i, boolean z);

    int getItemPoiInListLayout();

    Class<? extends Activity> getJediPoiRankActivityClass();

    String getLivePoiId();

    String getMobDistance(Context context, PoiStruct poiStruct);

    void getPoiCommonBanner(long j, int i, String str, C9381g gVar, int i2);

    Class<? extends Activity> getPoiDetailActivityClass();

    C38969a getPoiRankBannerPagerAdapter(Context context, LayoutInflater layoutInflater);

    String getPoiRankCacheKey(String str, String str2);

    C26875a<Object, Object> getPoiRankFilterModel();

    void getPoiRankList(String str, String str2, String str3, String str4, C9381g gVar, int i);

    Class<? extends Activity> getPoiSpuRateListActivityClass();

    String getValueFromPoiStruct(PoiStruct poiStruct, String str);

    boolean isFragmentNotAbsPoiAwemeFeedFragment(Fragment fragment);

    boolean isPoiAreaFilterNotOnlineStyle();

    boolean isPoiLabelCoupon(PoiStruct poiStruct);

    boolean isSameCity(Context context, PoiStruct poiStruct);

    boolean isSameCity(PoiStruct poiStruct, C39054d dVar);

    boolean isSupportPoiStickers();

    void launchActivity(Context context, PoiStruct poiStruct, String str, String str2, boolean z, int i);

    void launchPoiRouteActivity(Activity activity, C39142z zVar);

    void mobClickCouponEvent(C39051a aVar);

    void mobDualCardClick(C39051a aVar);

    void monitorSelectCityNull();

    boolean needHideLabel(C39054d dVar, PoiStruct poiStruct);

    boolean needShowCouponInfo(List<String> list, String str);

    void onEventV3IncludingPoiParams(Aweme aweme, String str, C23089d dVar);

    void onEventV3IncludingPoiParams(C39067g gVar, String str, C23089d dVar);

    void onEventV3IncludingPoiParams(PoiStruct poiStruct, String str, C23089d dVar);

    void onEventV3JsonIncludingPoiParams(Aweme aweme, String str, C23089d dVar);

    void openPoiCouponScopeActivity(Context context, Bundle bundle);

    void openPoiRankActivity(Context context, Bundle bundle);

    void openUrl(Context context, String str, String str2, String str3);

    void pauseLive();

    void pausePoiDetailListening();

    void performPoiBannerItemClick(C39067g gVar, String str, int i, String str2, Context context, C39092f fVar, int i2);

    int poiAnchorDistanceLimits();

    void putAwemeRankData(String str, C39087a aVar);

    void releaseLive();

    void resetPoiMemoryPoiDetailData();

    void resumeLive();

    void resumePoiDetailListening();

    void setHasShowPermissionTipDialog(boolean z);

    void setNotShowNoMyLocation(Dialog dialog, boolean z);

    void setPoiSpuRateAwemeModel(String str, int i, String str2, int i2);

    void setupLocationIcon(RemoteImageView remoteImageView, PoiStruct poiStruct);

    void showChoosePoiLocationDialog(Activity activity, C39590b bVar);

    void showGotCouponDialog(Activity activity, String str, C25687b bVar, PoiStruct poiStruct, OnDismissListener onDismissListener);

    void showLocationPermissionTipDialog(Context context, OnClickListener onClickListener, OnClickListener onClickListener2);

    void showManagePoiDialog(Context context, boolean z, long j);

    boolean showPoiAnchor(String str, String str2, String str3, Aweme aweme);

    void showPoiInfoDialogForAudience(Context context, String str, String str2, String str3);

    void showPoiRateDialog(Context context, String str, String str2, String str3, Integer num, String str4, String str5, HashMap<String, String> hashMap);

    void showPoiRateUploadVideoSuccessDialog(Context context);

    void speedRecommendPoi(Handler handler, String str, String str2, int i, String str3, String str4);

    void updateData(C26875a<Object, Object> aVar, C39087a aVar2);

    boolean useInjectionJsb();

    boolean useLocationSDK();

    boolean useLongCacheStrategy();

    double[] wgs84togcj02(double d, double d2);
}
