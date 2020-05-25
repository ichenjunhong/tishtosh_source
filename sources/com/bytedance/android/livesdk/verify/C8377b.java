package com.bytedance.android.livesdk.verify;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.livesdk.browser.jsbridge.p298c.C4793m;
import com.bytedance.android.livesdk.browser.jsbridge.p298c.C4793m.C4794a;
import com.bytedance.android.livesdk.browser.p290d.C4720h;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.verify.model.C8389b;
import com.bytedance.ies.p675g.p676a.C10762d;
import java.net.URLEncoder;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.livesdk.verify.b */
public final class C8377b extends C4720h implements C4794a {

    /* renamed from: L */
    C4793m f22796L;

    /* renamed from: M */
    private C8389b f22797M;

    /* renamed from: N */
    private boolean f22798N;

    /* renamed from: O */
    private C1689b f22799O = new C1689b();

    public final void onDestroyView() {
        super.onDestroyView();
        this.f22799O.mo6180a();
    }

    public final void onResume() {
        super.onResume();
        if (this.f22798N && this.f22797M != null) {
            this.f22799O.mo6181a(((ZhimaVerifyApi) C4514j.m10883j().mo10321b().mo9550a(ZhimaVerifyApi.class)).queryPollingStatus(this.f22797M.f22825c, this.f22797M.f22823a).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C8378c<Object>(this), (C1710e<? super Throwable>) new C8379d<Object>(this)));
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f22796L = new C4793m(getActivity(), this, this.f12847A.mo10593c());
        this.f12847A.mo10593c().mo19585a("openZmCert", (C10762d) this.f22796L);
    }

    /* renamed from: a */
    public final void mo10602a(C8389b bVar) {
        if (!TextUtils.isEmpty(bVar.f22823a) && !TextUtils.isEmpty(bVar.f22824b) && !TextUtils.isEmpty(bVar.f22825c)) {
            this.f22797M = bVar;
            Intent intent = new Intent("android.intent.action.VIEW");
            StringBuilder sb = new StringBuilder("alipays://platformapi/startapp?appId=20000067&url=");
            sb.append(URLEncoder.encode(bVar.f22824b));
            intent.setData(Uri.parse(sb.toString()));
            getActivity().startActivity(intent);
            this.f22798N = true;
        }
    }
}
