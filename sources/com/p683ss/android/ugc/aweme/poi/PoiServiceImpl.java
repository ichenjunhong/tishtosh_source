package com.p683ss.android.ugc.aweme.poi;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.os.Handler;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.view.PagerAdapter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C2240a;
import com.bytedance.common.utility.p522b.C9381g;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.commercialize.coupon.model.C25687b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.utils.C31213v;
import com.p683ss.android.ugc.aweme.location.C36282r;
import com.p683ss.android.ugc.aweme.location.C36285u.C36286a;
import com.p683ss.android.ugc.aweme.net.C37776h;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.poi.adapter.C38969a;
import com.p683ss.android.ugc.aweme.poi.adapter.C38970b;
import com.p683ss.android.ugc.aweme.poi.adapter.C38976g;
import com.p683ss.android.ugc.aweme.poi.adapter.C38978i;
import com.p683ss.android.ugc.aweme.poi.api.POIApiManager;
import com.p683ss.android.ugc.aweme.poi.api.PoiFeedApi;
import com.p683ss.android.ugc.aweme.poi.api.PoiRankApi.PoiRankRetrofitApi;
import com.p683ss.android.ugc.aweme.poi.model.C39142z;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p683ss.android.ugc.aweme.poi.model.p2062a.C39087a;
import com.p683ss.android.ugc.aweme.poi.model.p2062a.C39092f;
import com.p683ss.android.ugc.aweme.poi.nearby.p2065c.C39152b;
import com.p683ss.android.ugc.aweme.poi.p2059b.C39045e;
import com.p683ss.android.ugc.aweme.poi.p2060c.C39051a;
import com.p683ss.android.ugc.aweme.poi.p2060c.C39053b;
import com.p683ss.android.ugc.aweme.poi.p2074ui.AbsPoiAwemeFeedFragment;
import com.p683ss.android.ugc.aweme.poi.p2074ui.C39407s;
import com.p683ss.android.ugc.aweme.poi.p2074ui.PoiDetailActivity;
import com.p683ss.android.ugc.aweme.poi.p2074ui.PoiRouteActivity;
import com.p683ss.android.ugc.aweme.poi.p2074ui.coupon.C39302a;
import com.p683ss.android.ugc.aweme.poi.p2074ui.coupon.GotCouponDialog;
import com.p683ss.android.ugc.aweme.poi.p2074ui.detail.PoiDetailWithoutMapFragment;
import com.p683ss.android.ugc.aweme.poi.rate.p2073a.C39218b;
import com.p683ss.android.ugc.aweme.poi.search.C39241l;
import com.p683ss.android.ugc.aweme.poi.search.C39241l.C39242a;
import com.p683ss.android.ugc.aweme.poi.service.IPoiService;
import com.p683ss.android.ugc.aweme.poi.utils.C39440a;
import com.p683ss.android.ugc.aweme.poi.utils.C39442c;
import com.p683ss.android.ugc.aweme.poi.utils.C39444e;
import com.p683ss.android.ugc.aweme.poi.utils.C39448h;
import com.p683ss.android.ugc.aweme.poi.utils.C39450j;
import com.p683ss.android.ugc.aweme.poi.utils.C39451k;
import com.p683ss.android.ugc.aweme.poi.utils.C39452l;
import com.p683ss.android.ugc.aweme.poi.utils.C39456o;
import com.p683ss.android.ugc.aweme.poi.utils.C39466v;
import com.p683ss.android.ugc.aweme.poi.utils.C39468x;
import com.p683ss.android.ugc.aweme.port.p2082in.C39588bb.C39590b;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.PoiServiceImpl */
public final class PoiServiceImpl implements IPoiService {
    public static final C38953a Companion = new C38953a(null);
    public static final int HUNDRED = 100;

    /* renamed from: com.ss.android.ugc.aweme.poi.PoiServiceImpl$a */
    public static final class C38953a {
        private C38953a() {
        }

        public /* synthetic */ C38953a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.PoiServiceImpl$b */
    static final class C38954b implements C39242a {

        /* renamed from: a */
        final /* synthetic */ C39590b f99225a;

        /* renamed from: b */
        final /* synthetic */ C39241l f99226b;

        C38954b(C39590b bVar, C39241l lVar) {
            this.f99225a = bVar;
            this.f99226b = lVar;
        }

        /* renamed from: a */
        public final void mo79102a(C39045e eVar) {
            C52711k.m112240b(eVar, "event");
            if (eVar.f99539b != null) {
                eVar.f99539b.toStickerPoiStruct();
                this.f99226b.mo79989b();
                return;
            }
            PoiStruct poiStruct = new PoiStruct();
            poiStruct.setPoiId("NULL");
            poiStruct.toStickerPoiStruct();
            this.f99226b.mo79989b();
        }
    }

    public final int getItemPoiInListLayout() {
        return R.layout.b4_;
    }

    public final Class<? extends Activity> getJediPoiRankActivityClass() {
        return null;
    }

    public final Class<? extends Activity> getPoiDetailActivityClass() {
        return PoiDetailActivity.class;
    }

    public final C26875a<Object, Object> getPoiRankFilterModel() {
        return null;
    }

    public final Class<? extends Activity> getPoiSpuRateListActivityClass() {
        return null;
    }

    public final void monitorSelectCityNull() {
        C39456o.m87757b();
    }

    public final boolean needShowCouponInfo(List<String> list, String str) {
        return false;
    }

    public final void pauseLive() {
    }

    public final void pausePoiDetailListening() {
        PoiDetailWithoutMapFragment.m87383N();
    }

    public final void releaseLive() {
    }

    public final void resetPoiMemoryPoiDetailData() {
        C39451k.f100870a = null;
    }

    public final void resumeLive() {
    }

    public final void resumePoiDetailListening() {
        PoiDetailWithoutMapFragment.m87382M();
    }

    public final boolean autoPlayLiveInNearbyTab() {
        return C39448h.m87716c();
    }

    public final boolean getHasShowPermissionTipDialog() {
        return C39444e.m87713a();
    }

    public final boolean isPoiAreaFilterNotOnlineStyle() {
        return C39448h.m87718e();
    }

    public final boolean isSupportPoiStickers() {
        return C39466v.m87779a();
    }

    public final int poiAnchorDistanceLimits() {
        return C39448h.m87719f();
    }

    public final boolean useInjectionJsb() {
        return C39448h.m87717d();
    }

    public final boolean useLocationSDK() {
        return C39448h.m87714a();
    }

    public final boolean useLongCacheStrategy() {
        return C39448h.m87715b();
    }

    public final String getLivePoiId() {
        String str = C39451k.f100870a;
        if (TextUtils.isEmpty(str)) {
            str = "";
        } else if (str == null) {
            C52711k.m112234a();
            return str;
        }
        return str;
    }

    public static IPoiService createIPoiServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IPoiService.class);
        if (a != null) {
            return (IPoiService) a;
        }
        if (C27991b.f73449aF == null) {
            synchronized (IPoiService.class) {
                if (C27991b.f73449aF == null) {
                    C27991b.f73449aF = new PoiServiceImpl();
                }
            }
        }
        return (PoiServiceImpl) C27991b.f73449aF;
    }

    public final void setHasShowPermissionTipDialog(boolean z) {
        C39444e.m87712a(z);
    }

    public final boolean isFragmentNotAbsPoiAwemeFeedFragment(Fragment fragment) {
        if (!(fragment instanceof AbsPoiAwemeFeedFragment)) {
            return true;
        }
        return false;
    }

    public final boolean isPoiLabelCoupon(PoiStruct poiStruct) {
        return C39466v.m87781a(poiStruct);
    }

    public final HashMap<String, String> appendPoiParams(Aweme aweme) {
        HashMap<String, String> a = C39450j.m87722a(aweme);
        C52711k.m112236a((Object) a, "PoiHelper.appendPoiParams(aweme)");
        return a;
    }

    public final String[] formatCoordinate(C39054d dVar) {
        C52711k.m112240b(dVar, "locationWrapper");
        String[] a = C39466v.m87782a(dVar);
        C52711k.m112236a((Object) a, "PoiUtils.formatCoordinate(locationWrapper)");
        return a;
    }

    public final void mobClickCouponEvent(C39051a aVar) {
        C52711k.m112240b(aVar, "params");
        C39053b.m86893d(aVar);
    }

    public final void showPoiRateUploadVideoSuccessDialog(Context context) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(context, "context");
    }

    public final void mobDualCardClick(C39051a aVar) {
        C52711k.m112240b(aVar, "params");
        C52711k.m112240b(aVar, "params");
        C23089d a = C23089d.m56640a();
        a.mo47829a("city_info", C23198ae.m56845a());
        a.mo47829a(C42311c.f106865i, aVar.f99563n);
        a.mo47829a("display", aVar.f99564o);
        a.mo47829a("enter_from", aVar.f99550a);
        if (!TextUtils.isEmpty(aVar.f99562m)) {
            a.mo47829a("poi_channel", aVar.f99562m);
        }
        a.mo47829a("rank_index", aVar.f99565p);
        if (!TextUtils.isEmpty(aVar.f99566q)) {
            a.mo47829a("banner_id", aVar.f99566q);
        }
        C39452l.m87729a(aVar, "dual_card_click", a);
    }

    public final boolean isSameCity(Context context, PoiStruct poiStruct) {
        return C39468x.m87783a(context, poiStruct);
    }

    public final boolean needHideLabel(C39054d dVar, PoiStruct poiStruct) {
        return C39466v.m87780a(dVar, poiStruct);
    }

    public final String formatDistance(Context context, double d) {
        C52711k.m112240b(context, "context");
        String a = C39442c.m87693a(context, d);
        C52711k.m112236a((Object) a, "DistanceComputer.formatDistance(context, distance)");
        return a;
    }

    public final String getDisplayCount(Context context, PoiStruct poiStruct) {
        C52711k.m112240b(context, "context");
        String a = C39450j.m87721a(context, poiStruct);
        C52711k.m112236a((Object) a, "PoiHelper.getDisplayCount(context, poiStruct)");
        return a;
    }

    public final String getDistance(Context context, PoiStruct poiStruct) {
        C52711k.m112240b(context, "context");
        String a = C39442c.m87695a(context, poiStruct);
        C52711k.m112236a((Object) a, "DistanceComputer.getDistance(context, poiStruct)");
        return a;
    }

    public final String getValueFromPoiStruct(PoiStruct poiStruct, String str) {
        C52711k.m112240b(str, "key");
        return C39466v.m87777a(poiStruct, str);
    }

    public final boolean isSameCity(PoiStruct poiStruct, C39054d dVar) {
        return C39468x.m87787a(poiStruct, dVar);
    }

    public final void launchPoiRouteActivity(Activity activity, C39142z zVar) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(zVar, "latLng");
        PoiRouteActivity.m87293a(activity, zVar);
    }

    public final void openPoiRankActivity(Context context, Bundle bundle) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(bundle, "bundle");
        C39407s.m87632a(context, bundle);
    }

    public final void setNotShowNoMyLocation(Dialog dialog, boolean z) {
        C52711k.m112240b(dialog, "dialog");
        if (dialog instanceof C39241l) {
            ((C39241l) dialog).mo79987a(z);
        }
    }

    public final void setupLocationIcon(RemoteImageView remoteImageView, PoiStruct poiStruct) {
        C52711k.m112240b(remoteImageView, "imageView");
        C39466v.m87778a(remoteImageView, poiStruct);
    }

    public final double[] wgs84togcj02(double d, double d2) {
        double[] a = C39440a.m87681a(d, d2);
        C52711k.m112236a((Object) a, "CoordinateTransformUtil.wgs84togcj02(lng, lat)");
        return a;
    }

    public final double[] gcj02towgs84(Double d, Double d2) {
        double d3;
        double d4 = ProfileUiInitOptimizeEnterThreshold.DEFAULT;
        if (d != null) {
            d3 = d.doubleValue();
        } else {
            d3 = 0.0d;
        }
        if (d2 != null) {
            d4 = d2.doubleValue();
        }
        double[] b = C39440a.m87684b(d3, d4);
        C52711k.m112236a((Object) b, "CoordinateTransformUtil.…s84(lng?: 0.0, lat?: 0.0)");
        return b;
    }

    public final C38969a getPoiRankBannerPagerAdapter(Context context, LayoutInflater layoutInflater) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(layoutInflater, "inflater");
        return new C38978i(context, layoutInflater);
    }

    public final String getPoiRankCacheKey(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append('/');
        sb.append(str);
        return sb.toString();
    }

    public final void openPoiCouponScopeActivity(Context context, Bundle bundle) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(bundle, "bundle");
        C52711k.m112240b(context, "context");
        C52711k.m112240b(bundle, "bundle");
    }

    public final void putAwemeRankData(String str, C39087a aVar) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && aVar != null) {
            C39152b.f99885a.put(str, aVar);
        }
    }

    public final void updateData(C26875a<Object, Object> aVar, C39087a aVar2) {
        C52711k.m112240b(aVar, "listModel");
        C52711k.m112240b(aVar2, "struct");
        C52711k.m112240b(aVar, "listModel");
        C52711k.m112240b(aVar2, "struct");
    }

    public final void showChoosePoiLocationDialog(Activity activity, C39590b bVar) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(bVar, "poiChangeListener");
        C39241l lVar = new C39241l(activity, Bundle.EMPTY);
        lVar.setOwnerActivity(activity);
        lVar.f100205d = new C38954b(bVar, lVar);
        lVar.show();
    }

    public final String getMobDistance(Context context, PoiStruct poiStruct) {
        boolean z;
        boolean z2;
        double d;
        PoiStruct poiStruct2 = poiStruct;
        C52711k.m112240b(context, "context");
        C36282r a = C36286a.m81925a().mo75118a();
        if (a == null) {
            return "";
        }
        if (poiStruct2 != null) {
            CharSequence charSequence = poiStruct2.poiLatitude;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                CharSequence charSequence2 = poiStruct2.poiLongitude;
                if (charSequence2 == null || charSequence2.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    String str = poiStruct2.poiLatitude;
                    double d2 = ProfileUiInitOptimizeEnterThreshold.DEFAULT;
                    if (str != null) {
                        d = Double.parseDouble(str);
                    } else {
                        d = 0.0d;
                    }
                    String str2 = poiStruct2.poiLongitude;
                    if (str2 != null) {
                        d2 = Double.parseDouble(str2);
                    }
                    double latitude = a.getLatitude();
                    double longitude = a.getLongitude();
                    if (!a.isGaode()) {
                        double[] a2 = C39440a.m87681a(longitude, latitude);
                        longitude = a2[0];
                        latitude = a2[1];
                    }
                    double d3 = latitude;
                    double d4 = longitude;
                    double[] a3 = C39442c.m87696a(d, d2);
                    C52711k.m112236a((Object) a3, "DistanceComputer.convert…JIfNeeded(poiLat, poiLng)");
                    double distance = distance(a3[0], a3[1], d3, d4);
                    if (distance > 100.0d) {
                        return ">100";
                    }
                    String a4 = C2240a.m6772a("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(distance)}, 1));
                    C52711k.m112236a((Object) a4, "java.lang.String.format(format, *args)");
                    return a4;
                }
            }
        }
        return "";
    }

    public final void onEventV3IncludingPoiParams(Aweme aweme, String str, C23089d dVar) {
        C39452l.m87728a(aweme, str, dVar);
    }

    public final void onEventV3IncludingPoiParams(PoiStruct poiStruct, String str, C23089d dVar) {
        C39452l.m87732a(poiStruct, str, dVar);
    }

    public final PagerAdapter getInfiniteLoopPoiBannerAdapter(PagerAdapter pagerAdapter, int i, boolean z) {
        C52711k.m112240b(pagerAdapter, "childPagerAdapter");
        return new C38970b(pagerAdapter, i, z);
    }

    public final void onEventV3JsonIncludingPoiParams(Aweme aweme, String str, C23089d dVar) {
        C52711k.m112240b(str, "eventName");
        C52711k.m112240b(dVar, "builder");
        C39450j.m87723a(aweme, str, dVar);
    }

    public final void showLocationPermissionTipDialog(Context context, OnClickListener onClickListener, OnClickListener onClickListener2) {
        if (context != null && onClickListener != null && onClickListener2 != null) {
            C39444e.m87711a(context, onClickListener, onClickListener2);
        }
    }

    public final void showManagePoiDialog(Context context, boolean z, long j) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(context, "context");
    }

    public final void onEventV3IncludingPoiParams(C39067g gVar, String str, C23089d dVar) {
        C52711k.m112240b(gVar, "poiSimpleBundle");
        C52711k.m112240b(str, "eventName");
        C52711k.m112240b(dVar, "builder");
        C39450j.m87724a(gVar, str, dVar);
    }

    public final double distance(double d, double d2, double d3, double d4) {
        return C39442c.m87691a(d, d2, d3, d4);
    }

    public final void openUrl(Context context, String str, String str2, String str3) {
        C52711k.m112240b(context, "context");
        C39452l.m87727a(context, str, str2, str3);
    }

    public final void setPoiSpuRateAwemeModel(String str, int i, String str2, int i2) {
        C52711k.m112240b(str, "spuId");
        C52711k.m112240b(str2, "poiId");
        C31213v.m72896a((C26875a) new C39218b(str, i, str2, i2));
    }

    public final void bindLive(Context context, ViewGroup viewGroup, View view, View view2) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(viewGroup, "outBox");
        C52711k.m112240b(view, "dragView");
        C52711k.m112240b(view2, "closeBtn");
        C52711k.m112240b(context, "context");
        C52711k.m112240b(viewGroup, "outBox");
        C52711k.m112240b(view, "dragView");
        C52711k.m112240b(view2, "closeBtn");
    }

    public final void showPoiInfoDialogForAudience(Context context, String str, String str2, String str3) {
        C52711k.m112240b(context, "context");
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "poiId");
        C52711k.m112240b(str2, "anchorId");
        C52711k.m112240b(str3, "roomId");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (android.text.TextUtils.equals(r5, r4) == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        if (p2628d.p2650m.C52830p.m112406a("poi_page", r6, true) == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        r4 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean showPoiAnchor(java.lang.String r4, java.lang.String r5, java.lang.String r6, com.p683ss.android.ugc.aweme.feed.model.Aweme r7) {
        /*
            r3 = this;
            java.lang.String r0 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            r0 = 0
            if (r6 != 0) goto L_0x0009
            return r0
        L_0x0009:
            java.lang.String r1 = "search_homestay_reservation_detail"
            r2 = 1
            boolean r1 = p2628d.p2650m.C52830p.m112406a(r1, r6, r2)
            if (r1 != 0) goto L_0x004d
            java.lang.String r1 = "poi_rate_list"
            boolean r1 = p2628d.p2650m.C52830p.m112406a(r1, r6, r2)
            if (r1 != 0) goto L_0x004d
            java.lang.String r1 = "homestay_reservation_detail"
            boolean r1 = p2628d.p2650m.C52830p.m112406a(r1, r6, r2)
            if (r1 != 0) goto L_0x004d
            java.lang.String r1 = "poi_city"
            boolean r4 = p2628d.p2650m.C52830p.m112406a(r1, r4, r2)
            if (r4 == 0) goto L_0x003f
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            com.ss.android.ugc.aweme.poi.model.PoiStruct r4 = r7.getPoiStruct()
            if (r4 == 0) goto L_0x0035
            java.lang.String r4 = r4.poiId
            goto L_0x0036
        L_0x0035:
            r4 = 0
        L_0x0036:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.equals(r5, r4)
            if (r4 != 0) goto L_0x0049
            goto L_0x0047
        L_0x003f:
            java.lang.String r4 = "poi_page"
            boolean r4 = p2628d.p2650m.C52830p.m112406a(r4, r6, r2)
            if (r4 != 0) goto L_0x0049
        L_0x0047:
            r4 = 1
            goto L_0x004a
        L_0x0049:
            r4 = 0
        L_0x004a:
            if (r4 == 0) goto L_0x004d
            return r2
        L_0x004d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.PoiServiceImpl.showPoiAnchor(java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    public final String distanceStrMore(Context context, double d, double d2, double d3, double d4) {
        C52711k.m112240b(context, "context");
        String c = C39442c.m87700c(context, d, d2, d3, d4);
        C52711k.m112236a((Object) c, "DistanceComputer.distanc…, lat1, lon1, lat2, lon2)");
        return c;
    }

    public final String getDistanceBetweenLocations(Context context, double d, double d2, double d3, double d4) {
        C52711k.m112240b(context, "context");
        String a = C39442c.m87694a(context, d, d2, d3, d4);
        C52711k.m112236a((Object) a, "DistanceComputer.getDist… targetLng, myLat, myLng)");
        return a;
    }

    public final void showGotCouponDialog(Activity activity, String str, C25687b bVar, PoiStruct poiStruct, OnDismissListener onDismissListener) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(bVar, "couponInfo");
        C52711k.m112240b(onDismissListener, "listener");
        GotCouponDialog gotCouponDialog = new GotCouponDialog(activity);
        gotCouponDialog.setOnDismissListener(onDismissListener);
        gotCouponDialog.mo80119a(new C39302a(str, bVar, poiStruct));
    }

    public final void getPoiCommonBanner(long j, int i, String str, C9381g gVar, int i2) {
        C52711k.m112240b(str, "poiId");
        C52711k.m112240b(gVar, "handler");
        ((PoiFeedApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(PoiFeedApi.class)).getPoiCommonBanner(j, i, str).mo20a((C0011g<TResult, TContinuationResult>) new C37776h<TResult,TContinuationResult>(gVar, i2), C0013i.f25b);
    }

    public final void launchActivity(Context context, PoiStruct poiStruct, String str, String str2, boolean z, int i) {
        PoiRouteActivity.m87292a(context, poiStruct, str, str2, z, i);
    }

    public final void speedRecommendPoi(Handler handler, String str, String str2, int i, String str3, String str4) {
        C52711k.m112240b(handler, "handler");
        POIApiManager.m86871a(handler, str, str2, i, str3, str4);
    }

    public final void getPoiRankList(String str, String str2, String str3, String str4, C9381g gVar, int i) {
        C52711k.m112240b(str, "longitude");
        C52711k.m112240b(str2, "latitude");
        C52711k.m112240b(str3, "cityCode");
        C52711k.m112240b(str4, "poiClassCode");
        C52711k.m112240b(gVar, "handler");
        ((PoiRankRetrofitApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(PoiRankRetrofitApi.class)).getPoiRankList(str, str2, str3, str4).mo20a((C0011g<TResult, TContinuationResult>) new C37776h<TResult,TContinuationResult>(gVar, i), C0013i.f25b);
    }

    public final void performPoiBannerItemClick(C39067g gVar, String str, int i, String str2, Context context, C39092f fVar, int i2) {
        C52711k.m112240b(str, "fromPage");
        C52711k.m112240b(str2, "backendTypeCode");
        C52711k.m112240b(context, "context");
        C52711k.m112240b(fVar, "struct");
        new C38976g(gVar, str, i, str2).mo79131a(context, fVar, i2);
    }

    public final void showPoiRateDialog(Context context, String str, String str2, String str3, Integer num, String str4, String str5, HashMap<String, String> hashMap) {
        C52711k.m112240b(hashMap, "paramMap");
        C52711k.m112240b(hashMap, "paramMap");
    }
}
