package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.p1294a;

import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13109h;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21598l;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21838c;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.timer.TimerHolder.C21852a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.timer.TimerHolder.C21853b;
import org.json.JSONObject;
import p064c.p065a.p071d.C1710e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a.d */
public final class C21643d extends C21838c {

    /* renamed from: b */
    public final JSONObject f58661b;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a.d$a */
    static final class C21644a<T> implements C1710e<C12993e<C13109h>> {

        /* renamed from: a */
        final /* synthetic */ C21643d f58662a;

        /* renamed from: b */
        final /* synthetic */ String f58663b;

        C21644a(C21643d dVar, String str) {
            this.f58662a = dVar;
            this.f58663b = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            C21829b bVar = this.f58662a.f59129a;
            Bundle arguments = this.f58662a.f59129a.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putBoolean("code_sent", true);
            arguments.putInt("next_page", C21850i.EMAIL_SMS_SIGN_UP.getValue());
            arguments.putString("password", this.f58663b);
            C52711k.m112236a((Object) arguments, "(fragment.arguments ?: B…                        }");
            bVar.mo45961a(arguments);
        }
    }

    /* renamed from: a */
    public final boolean mo45905a() {
        if (this.f58661b != null) {
            String string = this.f58661b.getString("email");
            String string2 = this.f58661b.getString("password");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                FragmentActivity activity = this.f59129a.getActivity();
                C52711k.m112236a((Object) string, "email");
                C21853b a = C21852a.m54530a(activity, string, C21848h.SIGN_UP);
                if (a != null) {
                    C21598l lVar = a.f59142a;
                    if (lVar != null && lVar.mo45883e()) {
                        C21829b bVar = this.f59129a;
                        Bundle arguments = this.f59129a.getArguments();
                        if (arguments == null) {
                            arguments = new Bundle();
                        }
                        arguments.putBoolean("code_sent", false);
                        arguments.putInt("next_page", C21850i.EMAIL_SMS_SIGN_UP.getValue());
                        arguments.putString("password", string2);
                        C52711k.m112236a((Object) arguments, "(fragment.arguments ?: B…wd)\n                    }");
                        bVar.mo45961a(arguments);
                        return true;
                    }
                }
                C21677s.m54405a(this.f59129a, string, 1, "auto_system", null, string2).mo6496c((C1710e<? super T>) new C21644a<Object>(this, string2)).mo6491b();
            }
        }
        return true;
    }

    public C21643d(C21829b bVar, JSONObject jSONObject) {
        C52711k.m112240b(bVar, "fragment");
        super(bVar);
        this.f58661b = jSONObject;
    }
}
