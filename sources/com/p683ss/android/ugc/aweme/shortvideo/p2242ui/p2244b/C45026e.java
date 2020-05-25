package com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b;

import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.utils.C47858ep;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.b.e */
final /* synthetic */ class C45026e implements C52671b {

    /* renamed from: a */
    private final C45017b f114058a;

    C45026e(C45017b bVar) {
        this.f114058a = bVar;
    }

    public final Object invoke(Object obj) {
        C45017b bVar = this.f114058a;
        int intValue = ((Integer) obj).intValue();
        C23569o.m57779a("record", C23088c.m56631a().mo47824a("error", String.valueOf(intValue)).mo47825b());
        StringBuilder sb = new StringBuilder("running error , ve result = ");
        sb.append(intValue);
        C47858ep.m103512a("record_error", "2", sb.toString());
        if (C39618d.f101151O.mo83117a(C40796a.EnableAutoRetryRecord)) {
            bVar.f114045w.post(new C45029h(bVar));
        }
        return C52860x.f131107a;
    }
}
