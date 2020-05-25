package com.p683ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C9406f;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.base.activity.C23423b;
import com.p683ss.android.ugc.aweme.base.activity.C23440s;
import com.p683ss.android.ugc.aweme.bullet.impl.BulletService;
import com.p683ss.android.ugc.aweme.commercialize.p1553d.C25713d;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26415ba;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26528m;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.crossplatform.base.C27146a;
import com.p683ss.android.ugc.aweme.crossplatform.base.C27150d;
import com.p683ss.android.ugc.aweme.crossplatform.base.C27151e;
import com.p683ss.android.ugc.aweme.crossplatform.business.IMixActivityContainerProvider;
import com.p683ss.android.ugc.aweme.crossplatform.business.MixActivityContainerProvider;
import com.p683ss.android.ugc.aweme.crossplatform.p1612a.C27097c;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27182a;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27182a.C27183a;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27308i;
import com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p683ss.android.ugc.aweme.favorites.viewholder.C29767c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.framework.p1783d.C32465c;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.p1256aa.C20846a;
import com.p683ss.android.ugc.aweme.p2377ug.C47408a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47859eq;
import com.p683ss.android.ugc.aweme.utils.C47865ew;
import com.p683ss.android.ugc.aweme.utils.p2390d.C47801c;
import com.p683ss.android.ugc.aweme.utils.permission.C47937a;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.Locale;
import org.greenrobot.eventbus.C53755c;
import org.greenrobot.eventbus.C53771m;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity */
public class CrossPlatformActivity extends AmeActivity implements C9406f, C23440s, C27150d {

    /* renamed from: b */
    public static boolean f71477b = true;

    /* renamed from: c */
    public static long f71478c;

    /* renamed from: a */
    public AbsActivityContainer f71479a;

    /* renamed from: d */
    public C27100a f71480d;

    /* renamed from: e */
    boolean f71481e;

    /* renamed from: f */
    private C27182a f71482f;

    /* renamed from: g */
    private C23423b f71483g;

    /* renamed from: h */
    private boolean f71484h = true;

    /* renamed from: i */
    private C32465c f71485i;

    /* renamed from: j */
    private long f71486j;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity$a */
    public interface C27100a {
        /* renamed from: a */
        boolean mo55388a();
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public Resources getResources() {
        C47859eq.m103530a(this, this.mFirstResumed);
        return super.getResources();
    }

    public void onPause() {
        super.onPause();
        if (this.f71485i != null) {
            this.f71485i.mo65739b();
        }
    }

    public void setStatusBarColor() {
        if (this.f71479a != null) {
            this.f71479a.mo54145b();
        }
    }

    /* renamed from: a */
    private boolean m65342a() {
        if (!isViewValid()) {
            return false;
        }
        if (this.f71485i == null) {
            this.f71485i = new C32465c(this);
            this.f71485i.f84544g = false;
        }
        return true;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onResume", true);
        if (C47859eq.m103531b(this)) {
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onResume", false);
            return;
        }
        super.onResume();
        if (this.f71485i != null) {
            this.f71485i.mo65741c();
        }
        C47859eq.m103529a(this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onResume", false);
    }

    public void finish() {
        if (this.f71484h) {
            C26528m.m64180a(this);
            super.finish();
            if (this.f71482f != null && this.f71482f.f71721d.f71806l) {
                super.overridePendingTransition(0, R.anim.r);
            } else if (this.f71482f == null || !this.f71482f.f71721d.f71795a) {
                if (VERSION.SDK_INT < 17 || TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) != 1) {
                    super.overridePendingTransition(R.anim.bk, R.anim.by);
                } else {
                    super.overridePendingTransition(R.anim.bm, R.anim.bv);
                }
            } else if (this.f71481e) {
                super.overridePendingTransition(0, R.anim.r);
            } else {
                super.overridePendingTransition(0, 0);
            }
            if (this.f71479a != null) {
                this.f71479a.mo55374j();
            }
            C26415ba.m63877a((Aweme) null);
            C53755c.m114319a().mo112957b(C47408a.class);
            getIntent().removeExtra("VENDOR_BACK_INTENT_FOR_INTENT_KEY");
        }
    }

    public void onBackPressed() {
        if (C47801c.m103434c() || C47801c.m103435d()) {
            Intent intent = (Intent) getIntent().getParcelableExtra("VENDOR_BACK_INTENT_FOR_INTENT_KEY");
            boolean booleanExtra = getIntent().getBooleanExtra("VENDOR_CLICK_BACK_FOR_INTENT_KEY", false);
            if (!(intent == null || intent.resolveActivity(getPackageManager()) == null || booleanExtra)) {
                startActivity(intent);
                finish();
                return;
            }
        }
        if (this.f71479a != null && this.f71484h) {
            this.f71481e = true;
            if (this.f71480d == null || !this.f71480d.mo55388a()) {
                this.f71479a.mo55372h();
            }
        }
    }

    public void onDestroy() {
        String str;
        this.f71486j = System.currentTimeMillis() - this.f71486j;
        C47718bf.m103288a(new C27097c(Long.valueOf(this.f71486j)));
        C27121o a = C27121o.m65429a();
        C27182a aVar = this.f71482f;
        if (aVar != null) {
            String str2 = aVar.f71718a.f71706c;
            if (!TextUtils.isEmpty(str2)) {
                synchronized (a.f71552c) {
                    if (VERSION.SDK_INT >= 23 && !a.mo55435a(str2) && a.f71550a.size() < a.f71551b) {
                        C11010c.m22280a().getMainLooper().getQueue().addIdleHandler(new C27123q(a));
                    }
                }
            }
        }
        super.onDestroy();
        if (this.f71485i != null) {
            this.f71485i.mo65733a();
        }
        String str3 = null;
        if (C29767c.m69868b() != null) {
            C29767c.m69867a(null);
        }
        if (this.f71482f == null || this.f71482f.f71718a == null) {
            str = null;
        } else {
            str3 = this.f71482f.f71718a.f71706c;
            str = this.f71482f.f71718a.f71713j;
        }
        C47718bf.m103288a(new C25713d(2, str3, str));
        C47718bf.m103291d(this);
        if (this.f71482f.f71722e.f71823c != null) {
            try {
                JSONObject jSONObject = new JSONObject(this.f71482f.f71722e.f71823c);
                jSONObject.put("duration", System.currentTimeMillis() - f71478c);
                C26890h.m65012a("anchor_stay_time", jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo48604a(C23423b bVar) {
        this.f71483g = bVar;
    }

    @C53771m
    public void onEvent(C20846a aVar) {
        finish();
    }

    /* renamed from: a */
    public final <T extends C27308i> T mo55383a(Class<T> cls) {
        if (this.f71479a == null) {
            return null;
        }
        return this.f71479a.mo55364a(cls);
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        C27151e.m65508a().mo55463b();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f71479a != null) {
            this.f71479a.mo55366a(configuration);
        }
    }

    public void showCustomToast(String str) {
        if (m65342a()) {
            this.f71485i.mo65737a(str);
        }
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        String str;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onCreate", true);
        f71478c = System.currentTimeMillis();
        requestDisableOptimizeViewHierarchy();
        super.onCreate(bundle);
        Intent intent = getIntent();
        intent.putExtra("webview_progress_bar", C27146a.m65494a(intent.getExtras()));
        this.f71482f = C27183a.m65604a(intent);
        C27182a aVar = this.f71482f;
        if (aVar != null) {
            String str2 = aVar.f71718a.f71706c;
            if (!TextUtils.isEmpty(str2) && str2.contains("/ies-cdn-alisg/tiktok_activities/covid19")) {
                try {
                    Uri build = Uri.parse(str2).buildUpon().appendQueryParameter("webview_created_timestamp", String.valueOf(f71478c)).build();
                    aVar.f71718a.f71706c = build.toString();
                } catch (Throwable unused) {
                }
            }
        }
        Uri data = intent.getData();
        if (this.f71482f.f71718a.f71704a.intValue() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (data == null || data.isOpaque() || (!z && !TextUtils.equals("bullet", data.getQueryParameter("hybrid_sdk_version")))) {
            this.f71484h = getIntent().getBooleanExtra("key_support_back", true);
            Uri data2 = getIntent().getData();
            if (data2 != null && (data2.toString().startsWith(WebKitApi.SCHEME_HTTP) || data2.toString().startsWith(WebKitApi.SCHEME_HTTPS))) {
                if (TextUtils.equals(data2.getQueryParameter("__live_platform__"), "webcast")) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("bundle_no_hw_acceleration", this.f71482f.f71718a.f71715l);
                    bundle2.putBoolean("hide_nav_bar", this.f71482f.f71721d.f71812r);
                    bundle2.putBoolean("hide_status_bar", this.f71482f.f71721d.f71813s);
                    bundle2.putBoolean("hide_more", !this.f71482f.f71721d.f71804j);
                    bundle2.putInt("bundle_web_view_background_color", this.f71482f.f71721d.f71820z);
                    bundle2.putLong("ad_id", this.f71482f.f71719b.f71746a);
                    bundle2.putString("title", this.f71482f.f71721d.f71799e);
                    C36173w.m81665a().getILiveAllService().mo74806a(data2.toString(), bundle2, this);
                    finish();
                }
            }
            C27182a aVar2 = this.f71482f;
            IMixActivityContainerProvider createIMixActivityContainerProviderbyMonsterPlugin = MixActivityContainerProvider.createIMixActivityContainerProviderbyMonsterPlugin();
            if (createIMixActivityContainerProviderbyMonsterPlugin != null) {
                this.f71479a = createIMixActivityContainerProviderbyMonsterPlugin.createMixActivityContainer(this, aVar2);
            }
            if (this.f71479a == null) {
                this.f71479a = new MixActivityContainer(this, aVar2);
            }
            this.f71479a.mo55368a((Runnable) new C27109d(this));
            getLifecycle().mo324a(this.f71479a);
            if (!this.f71479a.mo55369a()) {
                this.f71484h = true;
                finish();
                ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onCreate", false);
                return;
            }
            if (this.f71482f.f71721d.f71806l) {
                super.overridePendingTransition(R.anim.f2, 0);
            } else if (this.f71482f.f71721d.f71795a) {
                super.overridePendingTransition(0, 0);
            } else if (VERSION.SDK_INT < 17 || TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) != 1) {
                super.overridePendingTransition(R.anim.bm, R.anim.bv);
            } else {
                super.overridePendingTransition(R.anim.bk, R.anim.by);
            }
            supportRequestWindowFeature(10);
            setContentView((int) R.layout.b7x);
            this.f71479a.mo55375k();
            C47718bf.m103290c(this);
            if (this.f71482f.f71720c != null && TextUtils.equals("page_movie_detail", this.f71482f.f71720c.f71778e)) {
                C29767c.m69867a(new WeakReference<>((CrossPlatformWebView) this.f71479a.mo54149e()));
            }
            String str3 = null;
            if (this.f71482f == null || this.f71482f.f71718a == null) {
                str = null;
            } else {
                str3 = this.f71482f.f71718a.f71706c;
                str = this.f71482f.f71718a.f71713j;
            }
            C47718bf.m103288a(new C25713d(1, str3, str));
            this.f71486j = System.currentTimeMillis();
            C47865ew.m103536a().mo95075a(data);
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onCreate", false);
            return;
        }
        BulletService.provideBulletService_Monster().open((Context) this, data.toString(), intent.getExtras());
        finish();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onCreate", false);
    }

    public void showCustomLongToast(int i, String str) {
        if (m65342a()) {
            this.f71485i.mo65734a(i, str);
        }
    }

    public void startActivity(Intent intent, Bundle bundle) {
        super.startActivity(intent, bundle);
        if (this.f71479a != null) {
            this.f71479a.mo55373i();
        }
    }

    /* renamed from: a */
    private static void m65341a(boolean z, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("webViewPoolIsCache", z);
            jSONObject.put("webViewPoolCostTime", j);
        } catch (Exception unused) {
        }
        C23569o.m57783b("service_monitor", "webview_pool_cache", jSONObject);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(str, context, attributeSet);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47937a.m103720a((Activity) this, i, strArr, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f71483g != null) {
            this.f71483g.mo48596a(i, i2, intent);
        }
        if (this.f71479a != null) {
            this.f71479a.mo48596a(i, i2, intent);
        }
    }

    public void showCustomToast(int i, String str, int i2, int i3) {
        if (m65342a()) {
            this.f71485i.mo65735a(i, str, i2, i3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.View r7, java.lang.String r8, android.content.Context r9, android.util.AttributeSet r10) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.crossplatform.activity.o r0 = com.p683ss.android.ugc.aweme.crossplatform.activity.C27121o.m65429a()
            com.ss.android.ugc.aweme.crossplatform.c.a.a r1 = r6.f71482f
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x006d
            com.ss.android.ugc.aweme.crossplatform.c.a r1 = r1.f71718a
            java.lang.String r1 = r1.f71706c
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto L_0x006d
            boolean r4 = r0.mo55435a(r1)
            if (r4 != 0) goto L_0x006d
            boolean r4 = com.p683ss.android.ugc.aweme.crossplatform.activity.C27121o.m65430c()
            if (r4 == 0) goto L_0x0022
        L_0x0020:
            r0 = 1
            goto L_0x006e
        L_0x0022:
            java.lang.String r4 = "need_webview_pool=1"
            boolean r4 = r1.contains(r4)
            if (r4 == 0) goto L_0x002b
            goto L_0x0020
        L_0x002b:
            java.util.List<java.lang.String> r4 = r0.f71553d
            boolean r4 = com.p683ss.android.ugc.aweme.base.utils.C23715d.m58202a(r4)
            if (r4 != 0) goto L_0x004c
            java.util.List<java.lang.String> r4 = r0.f71553d
            java.util.Iterator r4 = r4.iterator()
        L_0x0039:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x004c
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = r1.contains(r5)
            if (r5 == 0) goto L_0x0039
            goto L_0x0020
        L_0x004c:
            java.util.List<java.lang.String> r4 = r0.f71554e
            boolean r4 = com.p683ss.android.ugc.aweme.base.utils.C23715d.m58202a(r4)
            if (r4 != 0) goto L_0x006d
            java.util.List<java.lang.String> r0 = r0.f71554e
            java.util.Iterator r0 = r0.iterator()
        L_0x005a:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x006d
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r1.contains(r4)
            if (r4 == 0) goto L_0x005a
            goto L_0x0020
        L_0x006d:
            r0 = 0
        L_0x006e:
            if (r0 == 0) goto L_0x00a3
            java.lang.String r0 = "com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView"
            boolean r0 = android.text.TextUtils.equals(r8, r0)
            if (r0 == 0) goto L_0x00a3
            long r7 = android.os.SystemClock.uptimeMillis()
            com.ss.android.ugc.aweme.crossplatform.activity.o r9 = com.p683ss.android.ugc.aweme.crossplatform.activity.C27121o.m65429a()
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView r9 = r9.mo55434a(r6)
            if (r9 != 0) goto L_0x0094
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView r9 = new com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView
            r9.<init>(r6, r10)
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r7
            m65341a(r2, r0)
            goto L_0x009c
        L_0x0094:
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r7
            m65341a(r3, r0)
        L_0x009c:
            r7 = 2132017404(0x7f1400fc, float:1.9673085E38)
            r9.setId(r7)
            return r9
        L_0x00a3:
            java.lang.String r0 = "com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView"
            boolean r0 = android.text.TextUtils.equals(r8, r0)
            if (r0 == 0) goto L_0x00d2
            long r7 = android.os.SystemClock.uptimeMillis()
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView r0 = new com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView
            r0.<init>(r9, r10)
            long r9 = android.os.SystemClock.uptimeMillis()
            long r9 = r9 - r7
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            java.lang.String r8 = "tt_webview_create_time"
            r7.put(r8, r9)     // Catch:{ JSONException -> 0x00cc }
            java.lang.String r8 = "tt_webview_type"
            java.lang.String r9 = com.p683ss.android.ugc.aweme.ttwebview.C47367a.m102734a()     // Catch:{ JSONException -> 0x00cc }
            r7.put(r8, r9)     // Catch:{ JSONException -> 0x00cc }
        L_0x00cc:
            java.lang.String r8 = "ttwebview_create_monitor"
            com.p683ss.android.ugc.aweme.app.C23131p.m57779a(r8, r7)
            return r0
        L_0x00d2:
            android.view.View r7 = super.onCreateView(r7, r8, r9, r10)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }
}
