package com.p683ss.android.ugc.aweme.poi.utils;

import android.content.Context;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.poi.PoiProxyImpl;
import java.util.Map;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.n */
public final class C39454n {

    /* renamed from: a */
    public static final C39454n f100872a = new C39454n();

    /* renamed from: b */
    public static final C39455a f100873b = new C39455a(null);

    /* renamed from: com.ss.android.ugc.aweme.poi.utils.n$a */
    public static final class C39455a {
        private C39455a() {
        }

        public /* synthetic */ C39455a(C52707g gVar) {
            this();
        }
    }

    private C39454n() {
    }

    /* renamed from: a */
    public static IPoiProxy m87738a() {
        IPoiProxy createIPoiProxybyMonsterPlugin = PoiProxyImpl.createIPoiProxybyMonsterPlugin();
        C52711k.m112236a((Object) createIPoiProxybyMonsterPlugin, "ServiceManager.get().get…ce(IPoiProxy::class.java)");
        return createIPoiProxybyMonsterPlugin;
    }

    /* renamed from: b */
    public final Map<Object, Object> mo80415b(Context context) {
        C52711k.m112240b(context, "context");
        return m87738a().getTrickyMapByActivity(context);
    }

    /* renamed from: a */
    public final String mo80407a(Context context) {
        C52711k.m112240b(context, "context");
        return m87738a().detectIsFromEditOrStory(context);
    }

    /* renamed from: a */
    public final void mo80408a(Context context, Aweme aweme, String str) {
        m87738a().logPoiAdPhoneClick(context, aweme, str);
    }

    /* renamed from: b */
    public final void mo80416b(Context context, Aweme aweme, String str) {
        m87738a().logPoiAdCollect(context, aweme, str);
    }

    /* renamed from: c */
    public final void mo80418c(Context context, Aweme aweme, String str) {
        m87738a().logPoiAdCollectCancel(context, aweme, str);
    }

    /* renamed from: d */
    public final void mo80420d(Context context, AwemeRawAd awemeRawAd, String str) {
        m87738a().logFeedRawPoiAdOpenUrlH5(context, awemeRawAd, str);
    }

    /* renamed from: c */
    public final void mo80419c(Context context, AwemeRawAd awemeRawAd, String str) {
        m87738a().logFeedRawPoiAdOpenUrlApp(context, awemeRawAd, str);
    }

    /* renamed from: b */
    public final void mo80417b(Context context, AwemeRawAd awemeRawAd, String str) {
        m87738a().logPoiAdClick(context, awemeRawAd, str);
    }

    /* renamed from: a */
    public final void mo80410a(Context context, AwemeRawAd awemeRawAd, String str) {
        m87738a().logPoiAdShow(context, awemeRawAd, str);
    }

    /* renamed from: a */
    public final boolean mo80413a(Context context, String str, String str2) {
        C52711k.m112240b(str, "webUrl");
        C52711k.m112240b(str2, "title");
        return m87738a().openAdWebUrl(context, str, str2);
    }

    /* renamed from: a */
    public final boolean mo80414a(Context context, String str, boolean z) {
        C52711k.m112240b(str, "openUrl");
        return m87738a().openAdOpenUrl(context, str, z);
    }

    /* renamed from: a */
    public final void mo80409a(Context context, Aweme aweme, String str, String str2) {
        m87738a().logPoiAdOtherClick(context, aweme, str, str2);
    }

    /* renamed from: a */
    public final void mo80412a(String str, String str2, String str3, boolean z) {
        C52711k.m112240b(str, "eventName");
        C52711k.m112240b(str2, "from");
        C52711k.m112240b(str3, "poiId");
        m87738a().sendPoiFavouriteEvent(str, str2, str3, z);
    }

    /* renamed from: a */
    public final void mo80411a(Context context, String str, String str2, String str3, UrlModel urlModel, String str4, String str5) {
        Context context2 = context;
        C52711k.m112240b(context, "context");
        String str6 = str;
        C52711k.m112240b(str, "id");
        String str7 = str2;
        C52711k.m112240b(str2, "secId");
        String str8 = str3;
        C52711k.m112240b(str3, "title");
        UrlModel urlModel2 = urlModel;
        C52711k.m112240b(urlModel, "thumb");
        String str9 = str4;
        C52711k.m112240b(str4, "reason");
        String str10 = str5;
        C52711k.m112240b(str10, "sign");
        m87738a().startChat(context2, str6, str7, str8, urlModel2, str9, str10);
    }
}
