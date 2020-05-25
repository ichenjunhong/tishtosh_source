package com.p683ss.android.ugc.aweme.account.p1304q.p1305a;

import android.content.Context;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12996h;
import com.bytedance.sdk.account.p859d.C13081d;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13143t;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21608p;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21608p.C21612a;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21608p.C21613b;
import com.p683ss.android.ugc.aweme.account.util.C22275o;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.q.a.c */
public final class C22135c implements C10762d, C21612a, C21613b {

    /* renamed from: a */
    protected WeakReference<Context> f59689a;

    /* renamed from: b */
    public boolean f59690b;

    /* renamed from: c */
    private C10757a f59691c;

    /* renamed from: d */
    private C21608p f59692d;

    /* renamed from: e */
    private C13143t f59693e;

    /* renamed from: f */
    private String f59694f;

    /* renamed from: g */
    private C10766h f59695g;

    /* renamed from: a */
    public final void mo45150a() {
    }

    /* renamed from: b */
    public final void mo45889b() {
        mo46215a(this.f59695g, false);
    }

    /* renamed from: a */
    private void m54935a(String str) {
        C13081d.m26312a(C23826bi.m58460b()).mo24608a(this.f59694f, 23, false, this.f59693e);
    }

    public C22135c(WeakReference<Context> weakReference, C10757a aVar) {
        this.f59689a = weakReference;
        this.f59691c = aVar;
    }

    /* renamed from: b */
    public final void mo45151b(String str, int i) {
        this.f59692d.dismiss();
        m54935a(str);
    }

    /* renamed from: a */
    public final void mo46215a(C10766h hVar, boolean z) {
        if (hVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", z ? 1 : 0);
            } catch (JSONException unused) {
            }
            this.f59691c.mo19455a(hVar.f28945b, jSONObject);
        }
    }

    public final void call(final C10766h hVar, JSONObject jSONObject) throws Exception {
        if (this.f59689a.get() != null) {
            this.f59695g = hVar;
            this.f59695g.f28951h = false;
            this.f59694f = hVar.f28947d.getString("code");
            try {
                this.f59690b = hVar.f28947d.getBoolean("ignoreErrorToast");
            } catch (JSONException unused) {
            }
            this.f59693e = new C13143t() {
                public final /* synthetic */ void onSuccess(C12990b bVar) {
                    C12996h hVar = (C12996h) bVar;
                    C22135c.this.mo46215a(hVar, true);
                }

                public final /* synthetic */ void onError(C12990b bVar, int i) {
                    C12996h hVar = (C12996h) bVar;
                    if (C22135c.this.f59689a != null && !C22135c.this.f59690b) {
                        C10691a.m21545b((Context) C22135c.this.f59689a.get(), C22275o.m55130a((C12990b) hVar)).mo19066a();
                    }
                    C22135c.this.mo46215a(hVar, false);
                }
            };
            m54935a("");
        }
    }
}
