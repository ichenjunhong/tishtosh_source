package com.p683ss.android.ugc.aweme.bullet.bridge.common;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.bullet.p628b.p633e.C10254a;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.C23291au;
import com.p683ss.android.ugc.aweme.IAccountService.C20837d;
import com.p683ss.android.ugc.aweme.IAccountService.C20840g;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.account.bean.C20938e;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.profile.util.C40535ai;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.LoginMethod */
public class LoginMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24157a f64081b = new C24157a(null);

    /* renamed from: c */
    private final String f64082c = "login";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.LoginMethod$a */
    public static final class C24157a {
        private C24157a() {
        }

        public /* synthetic */ C24157a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.LoginMethod$b */
    static final class C24158b implements C20840g {

        /* renamed from: a */
        final /* synthetic */ LoginMethod f64083a;

        /* renamed from: b */
        final /* synthetic */ C24112a f64084b;

        C24158b(LoginMethod loginMethod, C24112a aVar) {
            this.f64083a = loginMethod;
            this.f64084b = aVar;
        }

        public final void onResult(int i, int i2, Object obj) {
            if (i == 1) {
                if (i2 == 1) {
                    this.f64083a.mo49926a(this.f64084b);
                    return;
                }
                this.f64083a.mo49927b(this.f64084b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.LoginMethod$c */
    static final class C24159c implements C20840g {

        /* renamed from: a */
        final /* synthetic */ LoginMethod f64085a;

        /* renamed from: b */
        final /* synthetic */ C24112a f64086b;

        C24159c(LoginMethod loginMethod, C24112a aVar) {
            this.f64085a = loginMethod;
            this.f64086b = aVar;
        }

        public final void onResult(int i, int i2, Object obj) {
            if (i == 1) {
                if (i2 == 1) {
                    this.f64085a.mo49926a(this.f64086b);
                    return;
                }
                this.f64085a.mo49927b(this.f64086b);
            }
        }
    }

    /* renamed from: d */
    public String mo18313d() {
        return this.f64082c;
    }

    public LoginMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49926a(C24112a aVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            C40535ai.m89942a(jSONObject);
        } catch (JSONException unused) {
        }
        if (mo49908h() == C10254a.LYNX) {
            aVar.mo49911a((Object) jSONObject);
        } else {
            aVar.mo49913a(jSONObject);
        }
    }

    /* renamed from: b */
    public final void mo49927b(C24112a aVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", false);
        jSONObject.put("code", 1);
        if (mo49908h() == C10254a.LYNX) {
            aVar.mo49911a((Object) jSONObject);
        } else {
            aVar.mo49913a(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("type", "loginCanceled");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("code", 1);
            jSONObject2.put("args", jSONObject3);
        } catch (JSONException unused) {
        }
        mo49905a("H5_nativeEvent", jSONObject2);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        Context e = mo18743e();
        C20938e eVar = null;
        if (!(e instanceof Activity)) {
            e = null;
        }
        Activity activity = (Activity) e;
        if (activity != null) {
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
                        bundle.putBoolean("is_login", TextUtils.equals(mo18313d(), "loginWithPlatform"));
                        C20854a.m53162b().loginByPlatform(new C20837d().mo44381a(activity).mo44385a(optString).mo44382a(bundle).mo44384a((C20840g) new C24158b(this, aVar)).mo44380a(), eVar);
                        return;
                    }
                }
                C20854a.m53162b().showLoginAndRegisterView(new C20837d().mo44381a(activity).mo44385a(optString).mo44384a((C20840g) new C24159c(this, aVar)).mo44380a());
                return;
            }
            mo49926a(aVar);
        }
    }
}
