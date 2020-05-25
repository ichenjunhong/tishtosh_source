package com.p683ss.android.ugc.aweme.bullet.module.p1477ad;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import com.bytedance.ies.bullet.kit.web.C10524g;
import com.bytedance.ies.bullet.kit.web.p648a.C10488e;
import com.p683ss.android.ugc.aweme.bullet.business.QuickShopBusiness;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.f */
public final class C24306f extends C10488e {

    /* renamed from: a */
    public boolean f64465a;

    /* renamed from: b */
    public boolean f64466b;

    /* renamed from: c */
    public boolean f64467c;

    /* renamed from: d */
    public long f64468d;

    /* renamed from: e */
    public C24307a f64469e;

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.f$a */
    public interface C24307a {
        /* renamed from: a */
        void mo50056a();

        /* renamed from: a */
        void mo50057a(long j);

        /* renamed from: b */
        void mo50058b();

        /* renamed from: c */
        void mo50059c();
    }

    /* renamed from: a */
    public final void mo18604a(C10524g gVar, SslErrorHandler sslErrorHandler, SslError sslError) {
        C52711k.m112240b(gVar, "kitContainerApi");
    }

    /* renamed from: a */
    private static boolean m59552a(String str) {
        return C52711k.m112239a((Object) str, (Object) QuickShopBusiness.f64351b);
    }

    /* renamed from: a */
    public final void mo50055a(boolean z) {
        this.f64467c = z;
        if (z && !this.f64465a) {
            C24307a aVar = this.f64469e;
            if (aVar != null) {
                aVar.mo50059c();
            }
        }
    }

    /* renamed from: a */
    public final void mo18607a(C10524g gVar, String str) {
        C52711k.m112240b(gVar, "kitContainerApi");
        if (!m59552a(str) && !this.f64465a && !this.f64466b && !this.f64467c) {
            this.f64465a = true;
            C24307a aVar = this.f64469e;
            if (aVar != null) {
                aVar.mo50057a(System.currentTimeMillis() - this.f64468d);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18606a(com.bytedance.ies.bullet.kit.web.C10524g r1, com.bytedance.ies.bullet.kit.web.C10529l r2, com.bytedance.ies.bullet.kit.web.C10528k r3) {
        /*
            r0 = this;
            java.lang.String r3 = "kitContainerApi"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r3)
            if (r2 == 0) goto L_0x0012
            android.net.Uri r1 = r2.mo18565a()
            if (r1 == 0) goto L_0x0012
            java.lang.String r1 = r1.toString()
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            boolean r1 = m59552a(r1)
            if (r1 == 0) goto L_0x001a
            return
        L_0x001a:
            if (r2 == 0) goto L_0x002e
            boolean r1 = r2.mo18566b()
            r2 = 1
            if (r1 != r2) goto L_0x002d
            r0.f64466b = r2
            com.ss.android.ugc.aweme.bullet.module.ad.f$a r1 = r0.f64469e
            if (r1 == 0) goto L_0x002d
            r1.mo50058b()
            return
        L_0x002d:
            return
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24306f.mo18606a(com.bytedance.ies.bullet.kit.web.g, com.bytedance.ies.bullet.kit.web.l, com.bytedance.ies.bullet.kit.web.k):void");
    }

    /* renamed from: a */
    public final void mo18608a(C10524g gVar, String str, Bitmap bitmap) {
        C52711k.m112240b(gVar, "kitContainerApi");
        if (!m59552a(str)) {
            this.f64465a = false;
            this.f64466b = false;
            mo50055a(false);
            this.f64468d = System.currentTimeMillis();
            C24307a aVar = this.f64469e;
            if (aVar != null) {
                aVar.mo50056a();
            }
        }
    }

    /* renamed from: a */
    public final void mo18602a(C10524g gVar, int i, String str, String str2) {
        C52711k.m112240b(gVar, "kitContainerApi");
        if (!m59552a(str2)) {
            this.f64466b = true;
            C24307a aVar = this.f64469e;
            if (aVar != null) {
                aVar.mo50058b();
            }
        }
    }
}
