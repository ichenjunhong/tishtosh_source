package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.C23291au;
import com.p683ss.android.ugc.aweme.IAccountService.C20837d;
import com.p683ss.android.ugc.aweme.IAccountService.C20840g;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.account.bean.C20938e;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.profile.util.C40535ai;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.fe.method.LoginMethod */
public final class LoginMethod extends BaseCommonJavaMethod {

    /* renamed from: b */
    public static final C29810a f77846b = new C29810a(null);

    /* renamed from: a */
    public boolean f77847a;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.LoginMethod$a */
    public static final class C29810a {
        private C29810a() {
        }

        public /* synthetic */ C29810a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.LoginMethod$b */
    static final class C29811b implements C20840g {

        /* renamed from: a */
        final /* synthetic */ LoginMethod f77848a;

        /* renamed from: b */
        final /* synthetic */ C29789a f77849b;

        C29811b(LoginMethod loginMethod, C29789a aVar) {
            this.f77848a = loginMethod;
            this.f77849b = aVar;
        }

        public final void onResult(int i, int i2, Object obj) {
            if (i == 1) {
                if (i2 == 1) {
                    LoginMethod.m69934a(this.f77849b);
                    return;
                }
                this.f77848a.mo60056b(this.f77849b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.LoginMethod$c */
    static final class C29812c implements C20840g {

        /* renamed from: a */
        final /* synthetic */ LoginMethod f77850a;

        /* renamed from: b */
        final /* synthetic */ C29789a f77851b;

        C29812c(LoginMethod loginMethod, C29789a aVar) {
            this.f77850a = loginMethod;
            this.f77851b = aVar;
        }

        public final void onResult(int i, int i2, Object obj) {
            if (i == 1) {
                if (i2 == 1) {
                    LoginMethod.m69934a(this.f77851b);
                    return;
                }
                this.f77850a.mo60056b(this.f77851b);
            }
        }
    }

    /* renamed from: a */
    public static void m69934a(C29789a aVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            C40535ai.m89942a(jSONObject);
        } catch (JSONException unused) {
        }
        if (aVar != null) {
            aVar.mo60041a(jSONObject);
        }
    }

    /* renamed from: b */
    public final void mo60056b(C29789a aVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", false);
        jSONObject.put("code", 1);
        if (aVar != null) {
            aVar.mo60041a(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("type", "loginCanceled");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("code", 1);
            jSONObject2.put("args", jSONObject3);
        } catch (JSONException unused) {
        }
        mo60037b("H5_nativeEvent", jSONObject2, 3);
    }

    public LoginMethod(C10757a aVar, boolean z) {
        super(aVar);
        this.f77847a = z;
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        Object obj = this.f77793e.get();
        C20938e eVar = null;
        if (!(obj instanceof Activity)) {
            obj = null;
        }
        Activity activity = (Activity) obj;
        if (activity != null && jSONObject != null) {
            String optString = jSONObject.optString("enter_from", "h5");
            IAccountUserService a = C20902b.m53242a();
            C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
            if (!a.isLogin()) {
                String optString2 = jSONObject.optString("platform", "");
                C52711k.m112236a((Object) optString2, "params.optString(PLATFORM, \"\")");
                CharSequence charSequence = optString2;
                if (!TextUtils.isEmpty(charSequence)) {
                    C23291au b = C20854a.m53162b();
                    C52711k.m112236a((Object) b, "AccountProxyService.loginService()");
                    Iterator it = b.getAllSupportedLoginPlatform().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C20938e eVar2 = (C20938e) it.next();
                        if (TextUtils.equals(charSequence, eVar2.f56971c)) {
                            eVar = eVar2;
                            break;
                        }
                    }
                    if (eVar != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("setting_page", "feedback_faq_list_page");
                        bundle.putBoolean("is_login", this.f77847a);
                        C20854a.m53162b().loginByPlatform(new C20837d().mo44381a(activity).mo44385a(optString).mo44382a(bundle).mo44384a((C20840g) new C29811b(this, aVar)).mo44380a(), eVar);
                        return;
                    }
                }
                C20854a.m53162b().showLoginAndRegisterView(new C20837d().mo44381a(activity).mo44385a(optString).mo44384a((C20840g) new C29812c(this, aVar)).mo44380a());
                return;
            }
            m69934a(aVar);
        }
    }
}
