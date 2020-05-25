package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.content.Context;
import android.support.p030v4.app.C0636b;
import android.support.p030v4.content.C0726c;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.p1103ad.p1104a.C18522b;
import com.p683ss.android.p1103ad.p1104a.C18522b.C18524a;
import com.p683ss.android.p1103ad.p1104a.C18531c;
import com.p683ss.android.p1103ad.p1104a.C18542d;
import com.p683ss.android.p1103ad.p1104a.p1105a.C18514a;
import com.p683ss.android.p1103ad.p1104a.p1105a.C18520f;
import com.p683ss.android.p1103ad.p1104a.p1107b.C18525a;
import com.p683ss.android.p1103ad.p1104a.p1107b.C18526b;
import com.p683ss.android.p1103ad.p1104a.p1107b.C18530d;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.views.C48191h;
import com.p683ss.android.ugc.aweme.web.C48379p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bs */
public final class C26435bs {

    /* renamed from: b */
    private static final String f69696b = C48379p.f121676d;

    /* renamed from: a */
    public C18514a f69697a;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bs$a */
    public static class C26439a {

        /* renamed from: a */
        public static C26435bs f69703a = new C26435bs();
    }

    /* renamed from: a */
    public static C26435bs m63920a() {
        return C26439a.f69703a;
    }

    private C26435bs() {
        C18531c.f51072f = C11010c.m22280a();
        C18525a aVar = C18542d.m44864a().f51098d;
        C18531c.f51069c = C26440bt.f69704a;
        aVar.mo37783a(C26441bu.f69705a).mo37784a(C26442bv.f69706a).mo37785a(f69696b).mo37782a(2000);
        C18531c.f51067a = new C18520f() {
            /* renamed from: a */
            public final void mo37786a(Activity activity, String[] strArr, C18514a aVar) {
                if (activity != null) {
                    boolean z = false;
                    String str = strArr[0];
                    if (activity != null && C0726c.m2090a((Context) activity, str) == 0) {
                        z = true;
                    }
                    if (z) {
                        aVar.mo37779a();
                        return;
                    }
                    C26435bs.this.f69697a = aVar;
                    C0636b.m1718a(activity, strArr, BaseNotice.HASHTAG);
                }
            }
        };
    }

    /* renamed from: a */
    public final void mo54161a(Activity activity, String str, String str2, String str3, String str4) {
        long j;
        try {
            j = Long.valueOf(str2).longValue();
        } catch (Exception unused) {
            j = 0;
        }
        C18522b a = new C18524a().mo37800c(str).mo37795a(j).mo37797a(str3).mo37799b(str4).mo37796a(Long.valueOf(System.currentTimeMillis())).mo37798a();
        final C48191h hVar = new C48191h(activity);
        hVar.show();
        C18542d.m44864a().mo37811a(activity, a, new C18530d() {
            /* renamed from: a */
            public final void mo37804a(C18526b bVar) {
                hVar.dismiss();
            }

            /* renamed from: b */
            public final void mo37805b(C18526b bVar) {
                hVar.dismiss();
            }
        });
    }
}
