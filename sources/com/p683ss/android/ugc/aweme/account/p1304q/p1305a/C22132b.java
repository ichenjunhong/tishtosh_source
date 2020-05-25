package com.p683ss.android.ugc.aweme.account.p1304q.p1305a;

import android.content.Context;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p859d.C13081d;
import com.bytedance.sdk.account.p861f.p862a.C13117p;
import com.bytedance.sdk.account.p861f.p862a.C13120s;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13136m;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13139p;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21107l;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21608p;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21608p.C21612a;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21608p.C21613b;
import com.p683ss.android.ugc.aweme.account.util.C22275o;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.q.a.b */
public final class C22132b implements C10762d, C21612a, C21613b {

    /* renamed from: a */
    public static int f59678a = 22;

    /* renamed from: b */
    public static int f59679b = 23;

    /* renamed from: c */
    protected WeakReference<Context> f59680c;

    /* renamed from: d */
    private C10757a f59681d;

    /* renamed from: e */
    private C21608p f59682e;

    /* renamed from: f */
    private C13139p f59683f;

    /* renamed from: g */
    private C13136m f59684g;

    /* renamed from: h */
    private C10766h f59685h;

    /* renamed from: b */
    public final void mo45889b() {
        mo46213a(this.f59685h, false);
    }

    /* renamed from: c */
    private FragmentActivity m54929c() {
        if (this.f59680c != null) {
            return (FragmentActivity) this.f59680c.get();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo45150a() {
        C13081d.m26312a(C23826bi.m58460b()).mo24604a(f59678a, this.f59684g);
    }

    public C22132b(WeakReference<Context> weakReference, C10757a aVar) {
        this.f59680c = weakReference;
        this.f59681d = aVar;
    }

    /* renamed from: a */
    public final void mo46213a(C10766h hVar, boolean z) {
        if (hVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", z ? 1 : 0);
            } catch (JSONException unused) {
            }
            this.f59681d.mo19455a(hVar.f28945b, jSONObject);
        }
    }

    /* renamed from: b */
    public final void mo45151b(String str, int i) {
        this.f59682e.dismiss();
        C13081d.m26312a(C23826bi.m58460b()).mo24614a("", str, f59678a, this.f59683f);
    }

    public final void call(final C10766h hVar, JSONObject jSONObject) throws Exception {
        if (this.f59680c.get() != null) {
            if (TextUtils.isEmpty(C23826bi.m58449a().getCurUser().getBindPhone())) {
                C10691a.m21542b((Context) this.f59680c.get(), (int) R.string.bau).mo19066a();
                mo46213a(hVar, false);
                return;
            }
            this.f59685h = hVar;
            this.f59685h.f28951h = false;
            this.f59683f = new C21107l() {
                public final void onSuccess(C12993e<C13120s> eVar) {
                    super.onSuccess(eVar);
                    C22132b.this.mo46213a(hVar, true);
                }

                public final void onError(C12993e<C13120s> eVar, int i) {
                    super.onError(eVar, i);
                    if (C22132b.this.f59680c != null) {
                        C10691a.m21545b((Context) C22132b.this.f59680c.get(), C22275o.m55130a((C12990b) eVar)).mo19066a();
                    }
                    C22132b.this.mo46213a(hVar, false);
                }

                public final /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
                    C12993e eVar = (C12993e) bVar;
                    if (!TextUtils.isEmpty(str)) {
                        C22132b.this.mo46214a(str, eVar.f34001d, C22132b.f59678a, C22132b.this);
                        return;
                    }
                    if (C22132b.this.f59680c != null) {
                        C10691a.m21545b((Context) C22132b.this.f59680c.get(), C22275o.m55130a((C12990b) eVar)).mo19066a();
                    }
                    C22132b.this.mo46213a(hVar, false);
                }
            };
            this.f59684g = new C13136m() {
                public final void onSuccess(C12993e<C13117p> eVar) {
                    C22132b.this.mo46214a(((C13117p) eVar.f34007h).f34303a, null, C22132b.f59678a, C22132b.this);
                }

                public final void onError(C12993e<C13117p> eVar, int i) {
                    if (C22132b.this.f59680c != null) {
                        C10691a.m21545b((Context) C22132b.this.f59680c.get(), C22275o.m55130a((C12990b) eVar)).mo19066a();
                    }
                }

                public final /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
                    C12993e eVar = (C12993e) bVar;
                    if (!TextUtils.isEmpty(str)) {
                        C22132b.this.mo46214a(str, eVar.f34001d, C22132b.f59678a, C22132b.this);
                        return;
                    }
                    if (C22132b.this.f59680c != null) {
                        C10691a.m21545b((Context) C22132b.this.f59680c.get(), C22275o.m55130a((C12990b) eVar)).mo19066a();
                    }
                }
            };
            C13081d.m26312a(C23826bi.m58460b()).mo24614a("", "", f59678a, this.f59683f);
        }
    }

    /* renamed from: a */
    public final void mo46214a(String str, String str2, int i, C21612a aVar) {
        if (m54929c() != null) {
            if (this.f59682e == null) {
                this.f59682e = C21608p.m54320a(str, i, aVar);
                C0679r a = m54929c().getSupportFragmentManager().mo2225a();
                a.mo2178a((Fragment) this.f59682e, "captcha");
                a.mo2195c();
            } else if (m54929c().getSupportFragmentManager().mo2224a("captcha") == null) {
                this.f59682e.show(m54929c().getSupportFragmentManager(), "captcha");
                this.f59682e.f58591d = aVar;
            }
            this.f59682e.f58592e = this;
            this.f59682e.mo45885a(str, str2, i);
        }
    }
}
