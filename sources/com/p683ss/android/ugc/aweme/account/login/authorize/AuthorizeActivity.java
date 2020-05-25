package com.p683ss.android.ugc.aweme.account.login.authorize;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.C12316a;
import com.bytedance.lobby.auth.C12318c;
import com.bytedance.lobby.internal.C12347d;
import com.bytedance.sdk.account.p844a.C13021f;
import com.bytedance.sdk.account.p844a.p845a.C12989a;
import com.bytedance.sdk.account.p844a.p845a.C12995g;
import com.bytedance.sdk.account.p877l.C13207b;
import com.p683ss.android.account.C18496d;
import com.p683ss.android.common.p1146d.C18898c;
import com.p683ss.android.ugc.aweme.C22475af;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.C22137r;
import com.p683ss.android.ugc.aweme.account.agegate.C20860a.C20861a;
import com.p683ss.android.ugc.aweme.account.base.SafeHandler;
import com.p683ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p683ss.android.ugc.aweme.account.login.BaseActivity;
import com.p683ss.android.ugc.aweme.account.login.C21355h;
import com.p683ss.android.ugc.aweme.account.login.C21356i;
import com.p683ss.android.ugc.aweme.account.login.C21390o;
import com.p683ss.android.ugc.aweme.account.login.C21390o.C21391a;
import com.p683ss.android.ugc.aweme.account.login.C21459s;
import com.p683ss.android.ugc.aweme.account.login.C21518u;
import com.p683ss.android.ugc.aweme.account.login.FriendsSuggestionExperiment;
import com.p683ss.android.ugc.aweme.account.login.authorize.p1281a.C21074a;
import com.p683ss.android.ugc.aweme.account.login.authorize.p1281a.C21075b;
import com.p683ss.android.ugc.aweme.account.login.authorize.p1281a.C21076c;
import com.p683ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.p683ss.android.ugc.aweme.account.login.model.TPUserInfo;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21841f;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21674q;
import com.p683ss.android.ugc.aweme.account.login.termsconstent.C21470b.C21471a;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1274g.C20975a;
import com.p683ss.android.ugc.aweme.account.p1276i.C20987e;
import com.p683ss.android.ugc.aweme.account.p1276i.C20989f;
import com.p683ss.android.ugc.aweme.account.p1279l.C21023g;
import com.p683ss.android.ugc.aweme.account.p1302o.C22089b;
import com.p683ss.android.ugc.aweme.account.p1302o.C22093d;
import com.p683ss.android.ugc.aweme.account.util.C22264f;
import com.p683ss.android.ugc.aweme.account.util.C22282t;
import com.p683ss.android.ugc.aweme.account.utils.C22298e;
import com.p683ss.android.ugc.aweme.app.C23057c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.friends.model.ThirdPartyResultEvent;
import com.p683ss.android.ugc.aweme.main.service.C36679a;
import com.p683ss.android.ugc.aweme.main.service.C36694o;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.settings.KeepCookieSettings;
import com.p683ss.android.ugc.aweme.utils.C47700ay;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.greenrobot.eventbus.C53771m;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity */
public class AuthorizeActivity extends BaseActivity implements C12316a, C20861a, C21074a, C21391a, C21471a, C21841f {

    /* renamed from: C */
    private static Set<Integer> f57273C = new HashSet();

    /* renamed from: p */
    private static final boolean f57274p = false;

    /* renamed from: A */
    private boolean f57275A;

    /* renamed from: B */
    private Handler f57276B = new SafeHandler(this);

    /* renamed from: D */
    private C13207b f57277D;

    /* renamed from: E */
    private boolean f57278E = false;

    /* renamed from: l */
    AuthResult f57279l;

    /* renamed from: m */
    protected String f57280m;

    /* renamed from: n */
    protected String f57281n;

    /* renamed from: o */
    C21390o f57282o;

    /* renamed from: q */
    private C12347d f57283q;

    /* renamed from: r */
    private C12318c f57284r;

    /* renamed from: s */
    private C20987e f57285s;

    /* renamed from: t */
    private C13021f f57286t;

    /* renamed from: u */
    private String f57287u;

    /* renamed from: v */
    private boolean f57288v;

    /* renamed from: w */
    private boolean f57289w;

    /* renamed from: x */
    private int f57290x;

    /* renamed from: y */
    private boolean f57291y = true;

    /* renamed from: z */
    private boolean f57292z;

    /* renamed from: i */
    private void m53536i() {
        C21085j.m53560a(this);
    }

    /* renamed from: a */
    public final String mo45068a() {
        return this.f57280m;
    }

    public final int ag_() {
        return R.layout.b0k;
    }

    /* renamed from: b */
    public final String mo45072b() {
        return this.f57281n;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final void mo45118a(C13207b bVar, JSONObject jSONObject) {
        C23826bi.m58455a(bVar);
        if (this.f57288v) {
            String str = this.f57287u;
            if (C21356i.m53983a(C23826bi.m58460b())) {
                C22089b.m54868a("aweme_thirdparty_login_error_rate", 1, C21355h.m53973a(str).mo47824a("app_language", ((C36694o) C23826bi.m58450a(C36694o.class)).mo47888a()).mo47824a("platform", str).mo47825b());
            }
            C26890h.m65011a("sso_callback_response", new C20856a().mo44776a("enter_method", this.f57281n).mo44776a("enter_from", this.f57280m).mo44776a("platform", this.f57287u).mo44774a("status", 1).mo44774a("_perf_monitor", 1).f56798a);
        }
        ((C36679a) C23826bi.m58450a(C36679a.class)).mo47861a(this.f57287u);
        this.f57276B.post(new C21081f(this, bVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo45117a(C13207b bVar) {
        if (this.f57288v) {
            this.f57277D = bVar;
            if (!C10181b.m20511a().mo18172a(FriendsSuggestionExperiment.class, true, "should_recommend_friends_during_login", 31744, false) || TextUtils.isEmpty(this.f57287u) || !"facebook".equals(this.f57287u) || this.f57277D == null || this.f57279l == null) {
                m53530a(new Intent(), bVar);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("thirdparty_token", m53531b(this.f57279l));
            bundle.putString("thirdparty_token_secret", m53533c(this.f57279l));
            bundle.putBoolean("thirdparty_is_new_user", this.f57277D.f34477e);
            bundle.putString("thirdparty_platform_name", this.f57287u);
            ((C22475af) C23826bi.m58450a(C22475af.class)).mo46773a(bundle);
            return;
        }
        m53529a(-1, new Intent());
    }

    /* renamed from: h */
    private void m53535h() {
        C47700ay.m103236b(this.f57282o);
    }

    /* renamed from: g */
    private int m53534g() {
        if (this.f57289w) {
            return 3;
        }
        if (this.f57288v) {
            return 1;
        }
        return 2;
    }

    /* renamed from: d */
    public final Bundle mo45075d() {
        return getIntent().getExtras();
    }

    /* renamed from: e */
    public final void mo45120e() {
        m53529a(0, new Intent());
    }

    /* renamed from: c */
    public final String mo45073c() {
        return getIntent().getStringExtra("enter_type");
    }

    public void onDestroy() {
        super.onDestroy();
        C47718bf.m103291d(this);
        if (f57273C != null) {
            f57273C.remove(Integer.valueOf(hashCode()));
        }
    }

    /* renamed from: f */
    public final void mo45121f() {
        boolean z = false;
        if (C22298e.m55182a() && !C10193n.m20607a().mo18204a(KeepCookieSettings.class, "keep_lobby_cookies", C10181b.m20511a().mo18175c().getKeepLobbyCookies(), false)) {
            z = true;
        }
        if (z) {
            C22089b.m54868a("monitor_clear_cookie", 1, C23088c.m56631a().mo47824a("enter_from", "lobby").mo47825b());
            try {
                CookieSyncManager.createInstance(this);
                CookieManager.getInstance().removeAllCookie();
                CookieSyncManager.getInstance().sync();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x014e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ah_() {
        /*
            r6 = this;
            super.ah_()
            android.view.Window r0 = r6.getWindow()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            r3 = 21
            if (r1 < r3) goto L_0x0025
            r1 = 201326592(0xc000000, float:9.8607613E-32)
            r0.clearFlags(r1)
            android.view.View r1 = r0.getDecorView()
            r3 = 1280(0x500, float:1.794E-42)
            r1.setSystemUiVisibility(r3)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.addFlags(r1)
            r0.setStatusBarColor(r2)
            goto L_0x0030
        L_0x0025:
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 19
            if (r1 < r3) goto L_0x0030
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r0.addFlags(r1)
        L_0x0030:
            com.bytedance.sdk.account.a.f r0 = com.bytedance.sdk.account.p859d.C13081d.m26313b(r6)
            r6.f57286t = r0
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r1 = "platform"
            java.lang.String r1 = r0.getStringExtra(r1)
            r6.f57287u = r1
            java.lang.String r1 = "account_type"
            r3 = 1
            int r1 = r0.getIntExtra(r1, r3)
            r6.f57290x = r1
            java.lang.String r1 = "is_login"
            boolean r1 = r0.getBooleanExtra(r1, r3)
            r6.f57288v = r1
            java.lang.String r1 = "is_only_fetch_token"
            boolean r0 = r0.getBooleanExtra(r1, r2)
            r6.f57289w = r0
            boolean r0 = r6.f57289w
            if (r0 == 0) goto L_0x0061
            r6.f57288v = r2
        L_0x0061:
            r6.f57291y = r3
            java.lang.String r0 = r6.f57287u
            java.lang.String r0 = com.p683ss.android.ugc.aweme.account.p1276i.C20989f.m53351a(r0)
            com.bytedance.lobby.internal.d r1 = com.bytedance.lobby.internal.C12343c.m24851a()
            r6.f57283q = r1
            com.bytedance.lobby.auth.c$a r1 = new com.bytedance.lobby.auth.c$a
            r1.<init>(r6)
            com.bytedance.lobby.auth.c$a r1 = r1.mo23308a(r6)
            com.bytedance.lobby.auth.c$a r1 = r1.mo23309a(r0)
            java.lang.String r2 = "providerId"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r2)
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 0
            if (r2 != 0) goto L_0x00da
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            int r4 = r0.hashCode()
            r5 = -1240244679(0xffffffffb6135e39, float:-2.1959552E-6)
            if (r4 == r5) goto L_0x00c6
            r5 = 28903346(0x1b907b2, float:6.796931E-38)
            if (r4 == r5) goto L_0x00b4
            r5 = 497130182(0x1da19ac6, float:4.2776377E-21)
            if (r4 == r5) goto L_0x00a4
            goto L_0x00da
        L_0x00a4:
            java.lang.String r4 = "facebook"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00da
            java.lang.String r0 = "fb_read_permissions"
            java.lang.String r4 = "public_profile, user_friends, user_age_range, email"
            r2.putString(r0, r4)
            goto L_0x00db
        L_0x00b4:
            java.lang.String r4 = "instagram"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00da
            java.lang.String r0 = "ig_redirect_url"
            java.lang.String r4 = com.p683ss.android.ugc.aweme.buildconfigdiff.C24095a.m58949f()
            r2.putString(r0, r4)
            goto L_0x00db
        L_0x00c6:
            java.lang.String r4 = "google"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00da
            java.lang.String r0 = "google_force_sign_out"
            com.ss.android.ugc.aweme.settings.GoogleMultiLoginExperiment r4 = com.p683ss.android.ugc.aweme.settings.GoogleMultiLoginExperiment.INSTANCE
            boolean r4 = r4.isEnabled()
            r2.putBoolean(r0, r4)
            goto L_0x00db
        L_0x00da:
            r2 = r3
        L_0x00db:
            if (r2 == 0) goto L_0x00e0
            r1.mo23307a(r2)
        L_0x00e0:
            com.bytedance.lobby.auth.c r0 = r1.mo23310a()
            r6.f57284r = r0
            java.lang.String r0 = r6.f57287u
            java.lang.String r0 = com.p683ss.android.ugc.aweme.account.p1276i.C20989f.m53351a(r0)
            java.lang.String r1 = "providerId"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r1)
            int r1 = r0.hashCode()
            switch(r1) {
                case -1240244679: goto L_0x014e;
                case -916346253: goto L_0x013d;
                case 3765: goto L_0x012c;
                case 3321844: goto L_0x011b;
                case 486515695: goto L_0x010a;
                case 497130182: goto L_0x00f9;
                default: goto L_0x00f8;
            }
        L_0x00f8:
            goto L_0x015e
        L_0x00f9:
            java.lang.String r1 = "facebook"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x015e
            com.ss.android.ugc.aweme.account.i.a r0 = new com.ss.android.ugc.aweme.account.i.a
            r0.<init>()
            r3 = r0
            com.ss.android.ugc.aweme.account.i.e r3 = (com.p683ss.android.ugc.aweme.account.p1276i.C20987e) r3
            goto L_0x015e
        L_0x010a:
            java.lang.String r1 = "kakaotalk"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x015e
            com.ss.android.ugc.aweme.account.i.c r0 = new com.ss.android.ugc.aweme.account.i.c
            r0.<init>()
            r3 = r0
            com.ss.android.ugc.aweme.account.i.e r3 = (com.p683ss.android.ugc.aweme.account.p1276i.C20987e) r3
            goto L_0x015e
        L_0x011b:
            java.lang.String r1 = "line"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x015e
            com.ss.android.ugc.aweme.account.i.d r0 = new com.ss.android.ugc.aweme.account.i.d
            r0.<init>()
            r3 = r0
            com.ss.android.ugc.aweme.account.i.e r3 = (com.p683ss.android.ugc.aweme.account.p1276i.C20987e) r3
            goto L_0x015e
        L_0x012c:
            java.lang.String r1 = "vk"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x015e
            com.ss.android.ugc.aweme.account.i.h r0 = new com.ss.android.ugc.aweme.account.i.h
            r0.<init>()
            r3 = r0
            com.ss.android.ugc.aweme.account.i.e r3 = (com.p683ss.android.ugc.aweme.account.p1276i.C20987e) r3
            goto L_0x015e
        L_0x013d:
            java.lang.String r1 = "twitter"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x015e
            com.ss.android.ugc.aweme.account.i.g r0 = new com.ss.android.ugc.aweme.account.i.g
            r0.<init>()
            r3 = r0
            com.ss.android.ugc.aweme.account.i.e r3 = (com.p683ss.android.ugc.aweme.account.p1276i.C20987e) r3
            goto L_0x015e
        L_0x014e:
            java.lang.String r1 = "google"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x015e
            com.ss.android.ugc.aweme.account.i.b r0 = new com.ss.android.ugc.aweme.account.i.b
            r0.<init>()
            r3 = r0
            com.ss.android.ugc.aweme.account.i.e r3 = (com.p683ss.android.ugc.aweme.account.p1276i.C20987e) r3
        L_0x015e:
            r6.f57285s = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity.ah_():void");
    }

    /* renamed from: c */
    private static String m53533c(AuthResult authResult) {
        if (TextUtils.equals("google", authResult.f32456d)) {
            return authResult.f32458f;
        }
        return authResult.f32459g;
    }

    /* renamed from: b */
    private static String m53531b(AuthResult authResult) {
        if (!TextUtils.equals("google", authResult.f32456d)) {
            return authResult.f32458f;
        }
        if (C22298e.m55182a()) {
            return "";
        }
        return "unuse";
    }

    @C53771m
    public void onThirdPartyResult(ThirdPartyResultEvent thirdPartyResultEvent) {
        if (thirdPartyResultEvent.userList.size() > 0) {
            this.f57278E = true;
        } else {
            this.f57278E = false;
        }
        m53530a(new Intent(), this.f57277D);
    }

    /* renamed from: a */
    public final void mo23306a(AuthResult authResult) {
        if (f57274p) {
            C22264f.m55111a("AuthorizeActivity", authResult.f32462j);
        }
        this.f57279l = authResult;
        if (authResult.f32453a) {
            mo45116a(authResult, true);
        } else if (authResult.f32454b) {
            this.f57276B.post(new C21073a(this));
        } else {
            this.f57276B.post(new C21077b(this));
        }
        if (this.f57285s != null) {
            this.f57285s.mo44980a(authResult);
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onCreate", true);
        super.onCreate(bundle);
        C47718bf.m103290c(this);
        f57273C.add(Integer.valueOf(hashCode()));
        if (f57273C.size() != 1) {
            finish();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onCreate", false);
            return;
        }
        this.f57280m = getIntent().getStringExtra("enter_from");
        this.f57281n = getIntent().getStringExtra("enter_method");
        if (!(this.f57283q == null || this.f57284r == null)) {
            C26890h.onEvent(MobClick.obtain().setEventName("sign_in").setLabelName(this.f57287u));
            C22093d.f59606a = System.currentTimeMillis();
            C12347d.m24858a(this.f57284r);
            if (this.f57288v) {
                C26890h.m65011a("token_request", new C20856a().mo44776a("enter_method", this.f57281n).mo44776a("enter_from", this.f57280m).mo44776a("platform", this.f57287u).mo44774a("_perf_monitor", 1).f56798a);
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onCreate", false);
    }

    /* renamed from: a */
    private void m53529a(int i, Intent intent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            setResult(i, intent);
            finish();
            return;
        }
        this.f57276B.post(new C21080e(this, i, intent));
    }

    /* renamed from: a */
    public final void mo44785a(int i, AuthResult authResult) {
        if (!isFinishing()) {
            if (i == -1) {
                C21674q.f58706a.mo45931a(true, 56004, C20989f.m53355d(authResult), (C21841f) this);
            }
            if (i == 0) {
                C21674q.f58706a.mo45931a(true, -3005, C20989f.m53355d(authResult), (C21841f) this);
            }
            if (authResult == null || i != 1) {
                m53535h();
                m53529a(0, new Intent());
                finish();
                return;
            }
            mo45116a(authResult, false);
        }
    }

    /* renamed from: b */
    public final void mo45119b(int i, AuthResult authResult) {
        if (i == -1) {
            mo45116a(authResult, false);
            return;
        }
        m53535h();
        m53529a(0, new Intent());
        finish();
    }

    /* renamed from: b */
    private static boolean m53532b(int i, Intent intent) {
        if (i == 0 || intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        if (extras == null || !extras.containsKey("callback")) {
            return false;
        }
        try {
            Uri parse = Uri.parse(extras.getString("callback"));
            String scheme = parse.getScheme();
            if (scheme != null) {
                if (scheme.startsWith(C23057c.f61424b)) {
                    if ("connect_switch".equals(parse.getQueryParameter("error_name"))) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m53530a(Intent intent, C13207b bVar) {
        AgeGateResponse ageGateResponse;
        C21848h hVar;
        C26890h.m65011a("account_sync_request", new C20856a().mo44776a("enter_method", this.f57281n).mo44776a("enter_from", this.f57280m).mo44776a("platform", this.f57287u).mo44774a("_perf_monitor", 1).f56798a);
        if (((C22475af) C23826bi.m58450a(C22475af.class)).mo46779f() == 0 || !this.f57275A) {
            ageGateResponse = null;
        } else {
            ageGateResponse = new AgeGateResponse(0, "", false, 0, 0);
        }
        Bundle bundle = new Bundle(getIntent().getExtras());
        if (bVar.f34477e) {
            bundle.putBoolean("new_user_need_set_username", true);
            bundle.putBoolean("new_user_need_get_recommend_username", true);
            bundle.putString("set_username_platform", C20989f.m53350a(this.f57284r));
            bundle.putString("enter_from", this.f57280m);
            bundle.putString("enter_method", this.f57281n);
        }
        String str = "current_scene";
        if (bVar.f34477e) {
            hVar = C21848h.SIGN_UP;
        } else {
            hVar = C21848h.LOGIN;
        }
        bundle.putInt(str, hVar.getValue());
        bundle.putString("platform", C20989f.m53350a(this.f57284r));
        bundle.putString("login_path", "third_party_auth");
        if (ageGateResponse != null) {
            bundle.putSerializable("age_gate_response", ageGateResponse);
        }
        if (!TextUtils.isEmpty(this.f57287u) && this.f57279l != null && "facebook".equals(this.f57287u) && this.f57278E && this.f57288v) {
            bundle.putBoolean("is_show_thirdparty_friends", true);
            bundle.putString("thirdparty_platform_name", this.f57287u);
            bundle.putString("thirdparty_token", this.f57279l.f32458f);
            bundle.putString("thirdparty_token_secret", this.f57279l.f32459g);
            bundle.putBoolean("thirdparty_is_new_user", bVar.f34477e);
        }
        C22137r.m54940a(bundle).mo20a((C0011g<TResult, TContinuationResult>) new C21083h<TResult,TContinuationResult>(this, intent, bVar), C0013i.f25b).mo19a(C21084i.f57325a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo45116a(AuthResult authResult, boolean z) {
        String a = C20989f.m53349a(authResult);
        String c = C20989f.m53354c(authResult);
        String d = C20989f.m53355d(authResult);
        long j = authResult.f32460h / 1000;
        String b = m53531b(authResult);
        String c2 = m53533c(authResult);
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(authResult.f32457e)) {
            hashMap.put("uid", Uri.encode(authResult.f32457e));
        }
        if (!TextUtils.isEmpty(c2)) {
            hashMap.put("access_token_secret", Uri.encode(c2));
        }
        if (!TextUtils.isEmpty(C20989f.m53352b(authResult))) {
            hashMap.put("profile_key", Uri.encode(C20989f.m53352b(authResult)));
        }
        switch (m53534g()) {
            case 1:
                this.f57292z = z;
                if (this.f57288v && ((C22475af) C23826bi.m58450a(C22475af.class)).mo46778e()) {
                    hashMap.put("multi_login", Uri.encode("1"));
                }
                if (!z) {
                    if (TextUtils.isEmpty(a)) {
                        this.f57286t.mo24652b(c, d, b, j, (Map) hashMap, (C12989a<C12995g>) new C21076c<C12995g>(this));
                        break;
                    } else {
                        this.f57286t.mo24648a(c, d, a, j, (Map) hashMap, (C12989a<C12995g>) new C21076c<C12995g>(this));
                        break;
                    }
                } else {
                    m53536i();
                    if (TextUtils.isEmpty(a)) {
                        this.f57286t.mo24655d(c, d, b, j, hashMap, new C21076c(this));
                        break;
                    } else {
                        this.f57286t.mo24654c(c, d, a, j, hashMap, new C21076c(this));
                        break;
                    }
                }
            case 2:
                if (TextUtils.isEmpty(a)) {
                    this.f57286t.mo24653b(c, d, b, j, (Map) hashMap, (C18496d) new C21075b(this));
                    break;
                } else {
                    this.f57286t.mo24649a(c, d, a, j, (Map) hashMap, (C18496d) new C21075b(this));
                    break;
                }
            case 3:
                Intent intent = new Intent();
                if (!TextUtils.isEmpty(b)) {
                    intent.putExtra("access_token", b);
                }
                if (!TextUtils.isEmpty(c2)) {
                    intent.putExtra("access_token_secret", c2);
                }
                if (!TextUtils.isEmpty(a)) {
                    intent.putExtra("code", a);
                }
                if (j > 0) {
                    intent.putExtra("expires_in", j);
                }
                if (!TextUtils.isEmpty(c)) {
                    intent.putExtra("platform_id", c);
                }
                m53529a(-1, intent);
                break;
            default:
                this.f57276B.post(new C21078c(this));
                break;
        }
        this.f57276B.post(new C21079d(this));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.f57291y = false;
        if (i == 32972) {
            if (m53532b(i2, intent)) {
                Intent intent2 = new Intent();
                intent2.putExtra("repeat_bind_error", true);
                m53529a(0, intent2);
                return;
            }
            this.f57286t.mo24651a(this.f57287u, null, new C21075b(this));
        }
        super.onActivityResult(i, i2, intent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Bundle mo45114a(Intent intent, C13207b bVar, C0013i iVar) throws Exception {
        if (iVar.mo33d()) {
            m53529a(0, intent);
        } else {
            C20975a.m53337a(11);
            C18898c.m46009a(this, "sign_in_success", this.f57287u);
            m53529a(-1, intent);
            C21674q.f58706a.mo45932a(bVar.f34477e, this.f57287u, (C21841f) this, bVar);
        }
        C26890h.m65011a("account_sync_response", new C20856a().mo44776a("enter_method", this.f57281n).mo44776a("enter_from", this.f57280m).mo44776a("platform", this.f57287u).mo44774a("status", iVar.mo33d() ^ true ? 1 : 0).mo44776a("fail_info", "").mo44774a("_perf_monitor", 1).f56798a);
        User i = C23826bi.m58468i();
        if (getIntent().getBooleanExtra("need_remember_login_method", true)) {
            C21518u.m54176b(new TPLoginMethod(i.getUid(), this.f57287u, TPUserInfo.from(i)));
        }
        if (C23826bi.m58466g()) {
            C23826bi.m58451a(1, 1, (Object) "");
            C23826bi.m58461b(C23826bi.m58468i());
        }
        if (this.f57279l != null) {
            ((C36679a) C23826bi.m58450a(C36679a.class)).mo47863a(this.f57287u, this.f57279l.f32458f, this.f57279l.f32459g);
        }
        return (Bundle) iVar.mo34e();
    }

    /* renamed from: a */
    public final void mo45115a(int i, String str, String str2, String str3, C12995g gVar) {
        boolean z;
        String str4;
        String str5;
        if (!isFinishing()) {
            if (this.f57288v) {
                C26890h.m65011a("sso_callback_response", new C20856a().mo44776a("enter_method", this.f57281n).mo44776a("enter_from", this.f57280m).mo44776a("platform", this.f57287u).mo44774a("status", 0).mo44776a("fail_info", C2240a.m6773a(Locale.CHINA, "error:%d,msg:%s", new Object[]{Integer.valueOf(i), str})).mo44774a("_perf_monitor", 1).f56798a);
            }
            int f = ((C22475af) C23826bi.m58450a(C22475af.class)).mo46779f();
            if (i == 1011) {
                z = true;
            } else {
                z = false;
            }
            this.f57275A = z;
            C21023g c = new C21023g().mo44997b(this.f57287u).mo44996a("0").mo44998c(String.valueOf(i));
            if (this.f57292z) {
                str4 = "/passport/auth/only_login/";
            } else {
                str4 = "/passport/auth/login/";
            }
            c.mo44999d(str4).mo44990b();
            if (!this.f57292z || !this.f57275A) {
                if (!this.f57275A && this.f57288v) {
                    C21674q.f58706a.mo45931a(false, i, this.f57287u, (C21841f) this);
                    if (i > 0 && !C21459s.f58194d.contains(Integer.valueOf(i)) && !C21459s.f58196f.contains(Integer.valueOf(i))) {
                        if (TextUtils.isEmpty(str)) {
                            str5 = getString(R.string.c2i);
                        } else {
                            str5 = str;
                        }
                        C10691a.m21545b(getBaseContext(), str5).mo19066a();
                    }
                }
                m53535h();
                if (this.f57288v) {
                    String str6 = this.f57287u;
                    StringBuilder sb = new StringBuilder("passport error:");
                    sb.append(str);
                    C22093d.f59607b.mo46195a(1, str6, i, sb.toString());
                    C21355h.m53977a(i, str, this.f57287u);
                }
                Intent intent = new Intent();
                intent.putExtra("error_code", i);
                if (f == 1 && this.f57275A && !TextUtils.equals(this.f57287u, "facebook") && !TextUtils.equals(this.f57287u, "google") && C22282t.m55143b() != 0) {
                    m53529a(0, intent);
                } else if (gVar.mo24592a()) {
                    intent.putExtra("description", str);
                    intent.putExtra("repeat_bind_error", true);
                    m53529a(999, intent);
                } else {
                    intent.putExtra("description", str2);
                    m53529a(0, intent);
                }
            } else {
                if (!TextUtils.isEmpty(str3)) {
                    this.f57279l.f32462j.putString("profile_key", str3);
                }
                this.f57276B.post(new C21082g(this, f));
            }
        }
    }
}
