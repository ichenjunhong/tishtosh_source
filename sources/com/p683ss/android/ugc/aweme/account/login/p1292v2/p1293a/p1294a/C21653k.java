package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.p1294a;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13120s;
import com.p683ss.android.ugc.aweme.account.login.p1284d.C21134a;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21598l;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21838c;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21839d;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.timer.TimerHolder.C21852a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.timer.TimerHolder.C21853b;
import org.json.JSONObject;
import p064c.p065a.p071d.C1710e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a.k */
public final class C21653k extends C21838c {

    /* renamed from: b */
    public final int f58677b;

    /* renamed from: c */
    public final JSONObject f58678c;

    /* renamed from: d */
    public final C21848h f58679d;

    /* renamed from: e */
    public final C21850i f58680e;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a.k$a */
    static final class C21654a<T> implements C1710e<C12993e<C13120s>> {

        /* renamed from: a */
        final /* synthetic */ C21653k f58681a;

        C21654a(C21653k kVar) {
            this.f58681a = kVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            C21829b bVar = this.f58681a.f59129a;
            Bundle arguments = this.f58681a.f59129a.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putInt("next_page", C21850i.PHONE_SMS_LOGIN.getValue());
            arguments.putBoolean("code_sent", true);
            arguments.putBoolean("bind_secure", true);
            C52711k.m112236a((Object) arguments, "(fragment.arguments ?: B…CURE, true)\n            }");
            bVar.mo45961a(arguments);
        }
    }

    /* renamed from: a */
    public final boolean mo45905a() {
        FragmentActivity activity = this.f59129a.getActivity();
        String a = C21134a.m53619a(C21839d.f59130a.mo45973b((Fragment) this.f59129a));
        C52711k.m112236a((Object) a, "PhoneNumberUtil.formatNu…elper.getPhone(fragment))");
        C21853b a2 = C21852a.m54530a(activity, a, C21848h.LOGIN);
        if (a2 != null) {
            C21598l lVar = a2.f59142a;
            if (lVar != null && lVar.mo45883e()) {
                C21829b bVar = this.f59129a;
                Bundle arguments = this.f59129a.getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                arguments.putInt("next_page", C21850i.PHONE_SMS_LOGIN.getValue());
                arguments.putBoolean("code_sent", false);
                arguments.putBoolean("bind_secure", true);
                C52711k.m112236a((Object) arguments, "(fragment.arguments ?: B…CURE, true)\n            }");
                bVar.mo45961a(arguments);
                return true;
            }
        }
        C21677s sVar = C21677s.f58713a;
        C21829b bVar2 = this.f59129a;
        String a3 = C21134a.m53619a(C21839d.f59130a.mo45973b((Fragment) this.f59129a));
        C52711k.m112236a((Object) a3, "PhoneNumberUtil.formatNu…elper.getPhone(fragment))");
        sVar.mo45942a(bVar2, a3, this.f58679d, this.f58680e, "", "auto_system", null).mo6496c((C1710e<? super T>) new C21654a<Object>(this)).mo6491b();
        return true;
    }

    public C21653k(C21829b bVar, int i, JSONObject jSONObject, C21848h hVar, C21850i iVar) {
        C52711k.m112240b(bVar, "fragment");
        C52711k.m112240b(hVar, "scene");
        C52711k.m112240b(iVar, "step");
        super(bVar);
        this.f58677b = i;
        this.f58678c = jSONObject;
        this.f58679d = hVar;
        this.f58680e = iVar;
    }
}
