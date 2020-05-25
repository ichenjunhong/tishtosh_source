package com.p683ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.newmedia.C19555f;
import com.p683ss.android.ugc.aweme.C22787ap.C22788a;
import com.p683ss.android.ugc.aweme.app.C23060d;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.bullet.BulletContainerActivity;
import com.p683ss.android.ugc.aweme.bullet.C24098a;
import com.p683ss.android.ugc.aweme.bullet.p1471ab.MTReactUseBulletExperiment;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25867ab;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.C26450a;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.C26456b;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.p1583a.C26455c;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.compliance.api.C27013a;
import com.p683ss.android.ugc.aweme.crossplatform.preload.C27278a;
import com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28668d;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28668d.C28673e;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.detail.C28709e;
import com.p683ss.android.ugc.aweme.effect.C29094ad;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.i18n.language.C33106b;
import com.p683ss.android.ugc.aweme.login.larksso.LarkSsoHelper;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22521l;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22528r;
import com.p683ss.android.ugc.aweme.p1706fe.method.ShareMethod;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.HeaderDetailActivity;
import com.p683ss.android.ugc.aweme.report.C41201a;
import com.p683ss.android.ugc.aweme.search.model.C41434a;
import com.p683ss.android.ugc.aweme.setting.C41549aq;
import com.p683ss.android.ugc.aweme.setting.C41549aq.C41551a;
import com.p683ss.android.ugc.aweme.setting.model.AwemeSettings;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.CrossPlatformLegacyServiceImpl */
public class CrossPlatformLegacyServiceImpl implements C22787ap {
    public Class getBulletContainerActivityClass() {
        return BulletContainerActivity.class;
    }

    public void onLandPageContentLoaded() {
        C25867ab.m62599a();
    }

    public void releaseSearchBaseModelHolder() {
        C28709e.m67973b();
    }

    public String getAppLocale() {
        return C33106b.m76108b();
    }

    public Locale getLocaleSetting() {
        return C33106b.m76103a();
    }

    public boolean getAllowInsideDownloadManager() {
        return C19555f.m47851a().mo40806d();
    }

    public int getWebViewBackAnimation() {
        if (C19555f.m47851a().mo40807e() == 2) {
            return 1;
        }
        return 0;
    }

    public int getWebViewDestroyMode() {
        return C19555f.m47851a().mo40807e();
    }

    public boolean isMTReactUseBullet() {
        if (C10181b.m20511a().mo18168a(MTReactUseBulletExperiment.class, true, "mt_rn_use_bullet", 31744, 0) == 1) {
            return true;
        }
        return false;
    }

    public void onUrlEvent(String str) {
        LarkSsoHelper.m81943a(str);
    }

    public boolean hasGP(Context context) {
        return C26456b.m63968a(context);
    }

    public boolean isGpUri(Uri uri) {
        return C26456b.m63971a(uri);
    }

    public void addSettingChangeListener(final C22788a aVar) {
        C41549aq.m91378a().mo85331a((C41551a) new C41551a() {
            /* renamed from: a */
            public final void mo44361a(AwemeSettings awemeSettings) {
                aVar.mo47260a();
            }
        });
    }

    public void onSearchIntermindateComponentDidMount(Object obj) {
        C22528r rVar;
        C52711k.m112240b(obj, C23060d.f61427a);
        if (obj instanceof CrossPlatformWebView) {
            C28668d.f75245e = System.currentTimeMillis();
            C22521l monitorSession = ((CrossPlatformWebView) obj).getMonitorSession();
            if (monitorSession != null) {
                rVar = (C22528r) monitorSession.mo46870a(C22528r.class);
            } else {
                rVar = null;
            }
            C0013i.m18a((Callable<TResult>) new C28673e<TResult>(rVar, obj), (Executor) C26890h.m65003a());
        }
    }

    public void sendInitDataToFe(Object obj) {
        boolean z;
        C28668d dVar = C28668d.f75246f;
        C52711k.m112240b(obj, C23060d.f61427a);
        if (obj instanceof CrossPlatformWebView) {
            CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) obj;
            CharSequence reactId = crossPlatformWebView.getReactId();
            if (reactId == null || reactId.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String str = null;
                String a = C28668d.m67930a(false);
                if (a != null) {
                    JSONObject jSONObject = new JSONObject();
                    String str2 = "enter_from";
                    C41434a searchEnterParam = crossPlatformWebView.getSearchEnterParam();
                    if (searchEnterParam != null) {
                        str = searchEnterParam.getEnterSearchFrom();
                    }
                    jSONObject.put(str2, str);
                    jSONObject.put("experiment_type", a);
                    jSONObject.put("is_cached_view", C27278a.m65731a(crossPlatformWebView));
                    jSONObject.put("open_search_ts", C28668d.f75243c);
                    crossPlatformWebView.mo55678a("search_middle_init", jSONObject, crossPlatformWebView.getReactId());
                    new StringBuilder("sendInitDataToFe with params:").append(jSONObject);
                }
            }
        }
    }

    public boolean hasAppByHttp(Context context, Uri uri) {
        return C26450a.m63957c(context, uri);
    }

    public boolean hasAppWithoutHttp(Context context, Uri uri) {
        return C26450a.m63958d(context, uri);
    }

    public boolean openAppByHttpUri(Context context, Uri uri) {
        return C26450a.m63953a(context, uri);
    }

    public boolean openAppWithoutHttpUri(Context context, Uri uri) {
        return C26450a.m63955b(context, uri);
    }

    public boolean openGPWebPage(Context context, String str) {
        return C26455c.m63967a(context, str);
    }

    public boolean openGpByMarketUri(Context context, Uri uri) {
        return C26456b.m63969a(context, uri);
    }

    public boolean openGpByUri(Context context, Uri uri) {
        return C26456b.m63972b(context, uri);
    }

    public boolean directlyShare(WeakReference<Context> weakReference, JSONObject jSONObject) {
        return new ShareMethod().mo60070a(weakReference, jSONObject);
    }

    public void report(Activity activity, String str) {
        Aweme rawAdAwemeById = C23324d.m57378a().getRawAdAwemeById(str);
        C27013a.m65227a().reportMobHelper(C41201a.m90896a(rawAdAwemeById, "homepage_hot"));
        C27013a.m65227a().reportAd(activity, C41201a.m90895a(rawAdAwemeById, "landing_page", C29094ad.f76264a));
    }

    public void logAppNotInWhiteList(Context context, Aweme aweme, String str) {
        C26450a.m63956c(context, aweme, str);
    }

    public void logUninstalledEvent(Context context, Aweme aweme, String str) {
        C26450a.m63952a(context, aweme, str);
    }

    public void openAppWithLog(Context context, Aweme aweme, String str) {
        C26450a.m63954b(context, aweme, str);
    }

    public void startBullet(Context context, Class cls, String str) {
        C24098a.m58974a(context, str);
    }

    public void startHeaderDetailActivity(Activity activity, View view, float f, User user, boolean z, Challenge challenge, String... strArr) {
        HeaderDetailActivity.m89056a(activity, view, f, user, z, false, challenge, strArr);
    }
}
