package com.p683ss.android.ugc.aweme.bullet.module.p1477ad;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.bytedance.ies.bullet.kit.web.C10524g;
import com.bytedance.ies.bullet.kit.web.p648a.C10488e;
import com.p683ss.android.ugc.aweme.bullet.business.QuickShopBusiness;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.g */
public final class C24308g extends C10488e {

    /* renamed from: a */
    public boolean f64470a;

    /* renamed from: b */
    public boolean f64471b;

    /* renamed from: c */
    public boolean f64472c;

    /* renamed from: d */
    public long f64473d;

    /* renamed from: e */
    public C24309a f64474e;

    /* renamed from: f */
    public boolean f64475f = true;

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.g$a */
    public interface C24309a {
        /* renamed from: a */
        void mo50061a();

        /* renamed from: b */
        void mo50062b();

        /* renamed from: c */
        void mo50063c();
    }

    /* renamed from: a */
    public final void mo18604a(C10524g gVar, SslErrorHandler sslErrorHandler, SslError sslError) {
        C52711k.m112240b(gVar, "kitContainerApi");
    }

    /* renamed from: a */
    private static boolean m59563a(String str) {
        return C52711k.m112239a((Object) str, (Object) QuickShopBusiness.f64351b);
    }

    /* renamed from: a */
    public final void mo50060a(boolean z) {
        this.f64472c = z;
        if (z && !this.f64470a && this.f64474e != null) {
            System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public final void mo18607a(C10524g gVar, String str) {
        C52711k.m112240b(gVar, "kitContainerApi");
        if (!m59563a(str)) {
            if (this.f64475f) {
                this.f64475f = false;
                WebView m_ = gVar.mo18665m_();
                if (m_ != null) {
                    m_.clearHistory();
                }
            }
            if (!this.f64470a && !this.f64471b && !this.f64472c) {
                this.f64470a = true;
            }
            C24309a aVar = this.f64474e;
            if (aVar != null) {
                aVar.mo50063c();
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
            boolean r1 = m59563a(r1)
            if (r1 == 0) goto L_0x001a
            return
        L_0x001a:
            if (r2 == 0) goto L_0x002e
            boolean r1 = r2.mo18566b()
            r2 = 1
            if (r1 != r2) goto L_0x002d
            r0.f64471b = r2
            com.ss.android.ugc.aweme.bullet.module.ad.g$a r1 = r0.f64474e
            if (r1 == 0) goto L_0x002d
            r1.mo50062b()
            return
        L_0x002d:
            return
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24308g.mo18606a(com.bytedance.ies.bullet.kit.web.g, com.bytedance.ies.bullet.kit.web.l, com.bytedance.ies.bullet.kit.web.k):void");
    }

    /* renamed from: a */
    public final void mo18608a(C10524g gVar, String str, Bitmap bitmap) {
        C52711k.m112240b(gVar, "kitContainerApi");
        if (!m59563a(str)) {
            this.f64470a = false;
            this.f64471b = false;
            mo50060a(false);
            this.f64473d = System.currentTimeMillis();
            C24309a aVar = this.f64474e;
            if (aVar != null) {
                aVar.mo50061a();
            }
        }
    }

    /* renamed from: a */
    public final void mo18602a(C10524g gVar, int i, String str, String str2) {
        C52711k.m112240b(gVar, "kitContainerApi");
        if (!m59563a(str2)) {
            this.f64471b = true;
            C24309a aVar = this.f64474e;
            if (aVar != null) {
                aVar.mo50062b();
            }
        }
    }
}
