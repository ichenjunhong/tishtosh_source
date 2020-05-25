package com.p683ss.android.ugc.aweme.services;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.sdk.account.p844a.p846b.C13003d;
import com.p683ss.android.ugc.aweme.C23291au;
import com.p683ss.android.ugc.aweme.IAccountService.C20836c;
import com.p683ss.android.ugc.aweme.account.bean.C20938e;
import com.p683ss.android.ugc.aweme.account.login.C21518u;
import com.p683ss.android.ugc.aweme.account.login.C21635v;
import com.p683ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean;
import com.p683ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p683ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p683ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.p683ss.android.ugc.aweme.account.p1278k.C21003a;
import com.p683ss.android.ugc.aweme.account.p1302o.C22087a;
import com.p683ss.android.ugc.aweme.account.p1302o.C22087a.C22088a;
import com.p683ss.android.ugc.aweme.account.p1302o.C22089b;
import com.p683ss.android.ugc.aweme.account.util.C22282t;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;
import p064c.p065a.C1680ad;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.BaseLoginService */
public abstract class BaseLoginService implements C0183j, C23291au {
    private boolean mKeepCallback;
    private C20836c mLoginParam;
    private C20836c mPlatformParam;

    public String getLoginMobEnterFrom() {
        return C21635v.f58647b;
    }

    public String getLoginMobEnterMethod() {
        return C21635v.f58646a;
    }

    public C20836c getLoginParam() {
        return this.mLoginParam;
    }

    public C23291au keepCallback() {
        this.mKeepCallback = true;
        return this;
    }

    public void retryLogin() {
        retryLogin(false);
    }

    public C1680ad<OneLoginPhoneBean> canShowOneKeyLoginHalfScreen() {
        return C1680ad.m5961a(new OneLoginPhoneBean());
    }

    public List<C20938e> getAllSupportedLoginPlatform() {
        return Collections.singletonList(new C20938e("Phone", 2131951971, "mobile"));
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        if (this.mLoginParam != null && (this.mLoginParam.f56769a instanceof C0184k)) {
            ((C0184k) this.mLoginParam.f56769a).getLifecycle().mo325b(this);
        }
        this.mLoginParam = null;
        this.mPlatformParam = null;
    }

    public C1680ad<OneLoginPhoneBean> canShowOneKeyBindHalfScreen(String str) {
        return C1680ad.m5961a(new OneLoginPhoneBean());
    }

    public void retryLogin(boolean z) {
        new Handler().postDelayed(new BaseLoginService$$Lambda$0(this, z), 300);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$retryLogin$0$BaseLoginService(boolean z) {
        C21518u.m54176b(new BaseLoginMethod());
        if (this.mLoginParam != null) {
            this.mLoginParam.f56772d.putBoolean("from_third_party_login", z);
            showLoginAndRegisterView(this.mLoginParam);
        }
    }

    /* access modifiers changed from: protected */
    public String platform(LoginMethodName loginMethodName) {
        if (loginMethodName == LoginMethodName.EMAIL_PASS) {
            return "email";
        }
        if (loginMethodName == LoginMethodName.USER_NAME_PASS) {
            return "handle";
        }
        if (loginMethodName == LoginMethodName.PHONE_NUMBER_PASS) {
            return "phone";
        }
        if (loginMethodName == LoginMethodName.PHONE_SMS) {
            return "sms_verification";
        }
        if (loginMethodName == LoginMethodName.THIRD_PARTY) {
            return ((TPLoginMethod) C21518u.m54175b()).getPlatform();
        }
        return "";
    }

    public void showLoginView(C20836c cVar) {
        this.mLoginParam = cVar;
        C21635v.f58646a = cVar.f56772d.getString("enter_method", "");
        C21635v.f58647b = cVar.f56772d.getString("enter_from", "");
        if (!this.mKeepCallback && (cVar.f56769a instanceof C0184k)) {
            ((C0184k) cVar.f56769a).getLifecycle().mo324a(this);
        }
        this.mKeepCallback = false;
    }

    public void showLoginAndRegisterView(C20836c cVar) {
        this.mLoginParam = cVar;
        if (!this.mLoginParam.f56772d.getBoolean("is_multi_account", false)) {
            boolean z = C22282t.m55153g().getBoolean("account_terminal_app_has_logged_out", true);
            C22088a aVar = C22087a.f59597c;
            if (!z) {
                C22282t.m55152f(true);
                String str = "monitor_account_business";
                String str2 = C22087a.f59596b;
                C23088c a = C23088c.m56631a();
                a.mo47824a("type", "auto_logout");
                if (!TextUtils.isEmpty(str2)) {
                    a.mo47824a("error_desc", str2);
                }
                JSONObject b = a.mo47825b();
                C52711k.m112236a((Object) b, "eventJsonBuilder.build()");
                C22089b.m54868a(str, 1, b);
            }
        }
        C22087a.m54862a("OpenLogin");
        if (!this.mKeepCallback && (cVar.f56769a instanceof C0184k)) {
            ((C0184k) cVar.f56769a).getLifecycle().mo324a(this);
        }
        this.mKeepCallback = false;
    }

    public void loginByPlatform(C20836c cVar, C20938e eVar) {
        this.mPlatformParam = cVar;
        C21635v.f58646a = cVar.f56772d.getString("enter_method", "");
        C21635v.f58647b = cVar.f56772d.getString("enter_from", "");
        if (!this.mKeepCallback && (cVar.f56769a instanceof C0184k)) {
            ((C0184k) cVar.f56769a).getLifecycle().mo324a(this);
        }
        this.mKeepCallback = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f A[Catch:{ Exception -> 0x0079 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052 A[Catch:{ Exception -> 0x0079 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005e A[Catch:{ Exception -> 0x0079 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061 A[Catch:{ Exception -> 0x0079 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void logout(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.account.k.b r0 = com.p683ss.android.ugc.aweme.account.p1278k.C21008b.m53393a()
            com.ss.android.ugc.aweme.IAccountUserService r1 = r0.f57129b
            boolean r1 = r1.isLogin()
            if (r1 == 0) goto L_0x0022
            long r1 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.aweme.IAccountUserService r3 = r0.f57129b
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.getCurUser()
            a.i r4 = com.p683ss.android.ugc.aweme.account.login.C21518u.m54169a()
            com.ss.android.ugc.aweme.account.k.c r5 = new com.ss.android.ugc.aweme.account.k.c
            r5.<init>(r1, r3)
            r4.mo29c(r5)
        L_0x0022:
            java.lang.String r1 = "user_logout"
            boolean r1 = android.text.TextUtils.equals(r7, r1)     // Catch:{ Exception -> 0x0079 }
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x003c
            boolean r1 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x0079 }
            if (r1 == 0) goto L_0x0033
            goto L_0x003d
        L_0x0033:
            java.lang.String r1 = "user_logout"
            boolean r1 = android.text.TextUtils.equals(r8, r1)     // Catch:{ Exception -> 0x0079 }
            if (r1 == 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r2 = 1
        L_0x003d:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0079 }
            r1.<init>()     // Catch:{ Exception -> 0x0079 }
            java.lang.String r4 = "is_logout_from_right"
            r1.put(r4, r2)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r4 = "logout_from"
            boolean r5 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x0079 }
            if (r5 == 0) goto L_0x0052
            java.lang.String r5 = "none"
            goto L_0x0053
        L_0x0052:
            r5 = r8
        L_0x0053:
            r1.put(r4, r5)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r4 = "type"
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x0079 }
            if (r7 == 0) goto L_0x0061
            java.lang.String r7 = "other"
            goto L_0x0062
        L_0x0061:
            r7 = r8
        L_0x0062:
            r1.put(r4, r7)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r7 = "exception"
            java.lang.Exception r4 = new java.lang.Exception     // Catch:{ Exception -> 0x0079 }
            r4.<init>()     // Catch:{ Exception -> 0x0079 }
            java.lang.String r4 = android.util.Log.getStackTraceString(r4)     // Catch:{ Exception -> 0x0079 }
            r1.put(r7, r4)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r7 = "dmt_logout"
            r2 = r2 ^ r3
            com.p683ss.android.ugc.aweme.account.p1302o.C22089b.m54868a(r7, r2, r1)     // Catch:{ Exception -> 0x0079 }
        L_0x0079:
            com.ss.android.ugc.aweme.IAccountUserService r7 = r0.f57129b
            java.lang.String r7 = r7.getCurUserId()
            com.p683ss.android.ugc.aweme.account.p1278k.C21003a.f57116e = r7
            com.ss.android.ugc.aweme.account.k.d r7 = new com.ss.android.ugc.aweme.account.k.d
            r7.<init>(r8)
            c.a.ad r7 = p064c.p065a.C1680ad.m5958a(r7)
            c.a.ac r8 = p064c.p065a.p093k.C2168a.m6521b()
            c.a.ad r7 = r7.mo6155b(r8)
            com.ss.android.ugc.aweme.account.k.b$1 r8 = new com.ss.android.ugc.aweme.account.k.b$1
            r8.<init>()
            r7.mo6159b(r8)
            java.lang.String r7 = "login"
            com.bytedance.keva.Keva r7 = com.bytedance.keva.Keva.getRepo(r7)
            java.lang.String r8 = "last_logout_time"
            long r0 = java.lang.System.currentTimeMillis()
            r7.storeLong(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.services.BaseLoginService.logout(java.lang.String, java.lang.String):void");
    }

    public void switchAccount(String str, Bundle bundle, C13003d dVar) {
        C21003a.m53388a(str, bundle, false, dVar);
    }

    public void notifyProgress(int i, int i2, String str) {
        if (this.mLoginParam != null && this.mLoginParam.f56774f != null) {
            this.mLoginParam.f56774f.mo44387a(i, i2, str);
        }
    }

    public void returnResult(int i, int i2, Object obj) {
        if (!(this.mLoginParam == null || this.mLoginParam.f56773e == null)) {
            this.mLoginParam.f56773e.onResult(i, i2, obj);
            this.mLoginParam = null;
        }
        if (this.mPlatformParam != null && this.mPlatformParam.f56773e != null) {
            this.mPlatformParam.f56773e.onResult(i, i2, obj);
            this.mPlatformParam = null;
        }
    }
}
