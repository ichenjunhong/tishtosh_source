package com.p683ss.android.ugc.aweme.account.login.twostep;

import android.support.p043v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.bytedance.common.utility.C9413g;
import com.p683ss.android.ugc.aweme.account.login.twostep.C21516g.C21517a;
import com.p683ss.android.ugc.aweme.utils.C47957v;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.a */
public final class C21486a extends C21516g {

    /* renamed from: a */
    public TextView f58288a;

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.a$a */
    static final class C21487a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C21486a f58289a;

        C21487a(C21486a aVar) {
            this.f58289a = aVar;
        }

        public final /* synthetic */ Object call() {
            JSONObject jSONObject;
            JSONObject jSONObject2 = this.f58289a.f58344h;
            if (jSONObject2 != null) {
                jSONObject = jSONObject2.getJSONObject("data");
            } else {
                jSONObject = null;
            }
            return C9413g.m18629a(jSONObject, "description", "");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.a$b */
    static final class C21488b<TTaskResult, TContinuationResult> implements C0011g<String, Object> {

        /* renamed from: a */
        final /* synthetic */ C21486a f58290a;

        C21488b(C21486a aVar) {
            this.f58290a = aVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            if (C47957v.m103770a(iVar)) {
                C52711k.m112236a((Object) iVar, "it");
                if (!TextUtils.isEmpty((CharSequence) iVar.mo34e())) {
                    C21486a.m54121a(this.f58290a).setText((CharSequence) iVar.mo34e());
                    return null;
                }
            }
            TextView a = C21486a.m54121a(this.f58290a);
            AppCompatActivity d = this.f58290a.mo45715d();
            if (d == null) {
                C52711k.m112234a();
            }
            a.setText(d.getString(R.string.ag7));
            return null;
        }
    }

    /* renamed from: a */
    public final View mo45685a() {
        if (this.f58347k.getLayoutResource() <= 0) {
            this.f58347k.setLayoutResource(R.layout.azk);
        }
        View inflate = this.f58347k.inflate();
        View findViewById = inflate.findViewById(R.id.lc);
        C52711k.m112236a((Object) findViewById, "view.findViewById(R.id.blocked_authenticator_text)");
        this.f58288a = (TextView) findViewById;
        if (this.f58344h != null) {
            C0013i.m16a((Callable<TResult>) new C21487a<TResult>(this)).mo20a((C0011g<TResult, TContinuationResult>) new C21488b<TResult,TContinuationResult>(this), C0013i.f25b);
        }
        return inflate;
    }

    /* renamed from: a */
    public static final /* synthetic */ TextView m54121a(C21486a aVar) {
        TextView textView = aVar.f58288a;
        if (textView == null) {
            C52711k.m112237a("errorText");
        }
        return textView;
    }

    public C21486a(AppCompatActivity appCompatActivity, ViewStub viewStub, C21517a aVar) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(viewStub, "stub");
        C52711k.m112240b(aVar, "authCallback");
        super(appCompatActivity, viewStub, aVar);
    }
}
