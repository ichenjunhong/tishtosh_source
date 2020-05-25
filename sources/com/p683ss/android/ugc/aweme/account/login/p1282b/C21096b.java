package com.p683ss.android.ugc.aweme.account.login.p1282b;

import android.text.TextUtils;
import com.bytedance.sdk.account.p844a.C13011d;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p859d.C13081d;
import com.bytedance.sdk.account.p861f.p862a.C13117p;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13136m;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.C22165u;
import com.p683ss.android.ugc.aweme.account.login.loginlog.C21378a;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21608p.C21612a;
import com.p683ss.android.ugc.aweme.account.p1277j.C21000d;

/* renamed from: com.ss.android.ugc.aweme.account.login.b.b */
public abstract class C21096b implements C21612a {

    /* renamed from: a */
    public C21108m f57348a;

    /* renamed from: b */
    private C13011d f57349b = C13081d.m26312a(C23826bi.m58460b());

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo45086a(String str, int i);

    /* renamed from: a */
    public final void mo45150a() {
        this.f57348a.mo45159d();
        C21000d.m53378b();
        this.f57349b.mo24604a(C22165u.f59781u, (C13136m) new C13136m() {
            public final /* bridge */ /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
            }

            public final void onSuccess(C12993e<C13117p> eVar) {
                if (eVar != null && eVar.f34007h != null && !TextUtils.isEmpty(((C13117p) eVar.f34007h).f34303a)) {
                    C21000d.m53379b(((C13117p) eVar.f34007h).f34303a, String.valueOf(((C13117p) eVar.f34007h).f34285r));
                    C21096b.this.f57348a.mo45158a(((C13117p) eVar.f34007h).f34303a, null, ((C13117p) eVar.f34007h).f34285r, C21096b.this);
                }
            }

            public final void onError(C12993e<C13117p> eVar, int i) {
                C21000d.m53380c(String.valueOf(eVar.f34000c), eVar.f34001d);
            }
        });
    }

    public C21096b(C21108m mVar) {
        this.f57348a = mVar;
    }

    /* renamed from: b */
    public final void mo45151b(String str, int i) {
        C21378a.m53998a().mo45512a("", "", false, "send_voice_code", "", "注册图片验证码");
        C21000d.m53376a(str, String.valueOf(i));
        mo45086a(str, i);
        this.f57348a.mo45159d();
    }
}
