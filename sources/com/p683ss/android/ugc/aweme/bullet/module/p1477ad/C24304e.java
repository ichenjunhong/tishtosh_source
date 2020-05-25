package com.p683ss.android.ugc.aweme.bullet.module.p1477ad;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import com.bytedance.ies.bullet.kit.web.C10524g;
import com.bytedance.ies.bullet.kit.web.p648a.C10488e;
import com.p683ss.android.ugc.aweme.bullet.business.QuickShopBusiness;
import com.p683ss.android.ugc.aweme.commercialize.p1555e.C25733a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26524k;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.e */
public final class C24304e extends C10488e {

    /* renamed from: c */
    public static final List<JSONObject> f64459c = new ArrayList();

    /* renamed from: d */
    public static final C24305a f64460d = new C24305a(null);

    /* renamed from: f */
    private static final String f64461f = C25733a.class.getSimpleName();

    /* renamed from: a */
    public boolean f64462a;

    /* renamed from: b */
    public boolean f64463b;

    /* renamed from: e */
    private boolean f64464e = false;

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.e$a */
    public static final class C24305a {
        private C24305a() {
        }

        /* renamed from: a */
        private static List<JSONObject> m59550a() {
            return C24304e.f64459c;
        }

        public /* synthetic */ C24305a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final void mo50054a(String str, int i, String str2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str);
                jSONObject.put("error_code", i);
                jSONObject.put("description", str2);
                m59550a().add(jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    public C24304e(boolean z) {
    }

    /* renamed from: a */
    private static boolean m59543a(String str) {
        if (str == null || !str.equals(QuickShopBusiness.f64351b)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo18607a(C10524g gVar, String str) {
        C52711k.m112240b(gVar, "kitContainerApi");
        if (!m59543a(str) && !this.f64462a) {
            this.f64462a = true;
            new StringBuilder("load finish: url=").append(str);
            new StringBuilder("load details: ").append(f64459c);
            C26524k.m64166a(str);
        }
    }

    /* renamed from: a */
    public final void mo18604a(C10524g gVar, SslErrorHandler sslErrorHandler, SslError sslError) {
        String str;
        int i;
        C52711k.m112240b(gVar, "kitContainerApi");
        C24305a aVar = f64460d;
        if (sslError != null) {
            str = sslError.getUrl();
        } else {
            str = null;
        }
        if (sslError != null) {
            i = sslError.getPrimaryError();
        } else {
            i = 0;
        }
        aVar.mo50054a(str, i, "ssl error");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18605a(com.bytedance.ies.bullet.kit.web.C10524g r5, android.webkit.WebResourceRequest r6, android.webkit.WebResourceResponse r7) {
        /*
            r4 = this;
            java.lang.String r0 = "kitContainerApi"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
            r5 = 0
            if (r6 == 0) goto L_0x0013
            android.net.Uri r0 = r6.getUrl()
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = r0.toString()
            goto L_0x0014
        L_0x0013:
            r0 = r5
        L_0x0014:
            boolean r0 = m59543a(r0)
            if (r0 == 0) goto L_0x001b
            return
        L_0x001b:
            boolean r0 = r4.f64464e
            r1 = 0
            if (r0 == 0) goto L_0x003c
            if (r6 == 0) goto L_0x0036
            android.net.Uri r0 = r6.getUrl()
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = r0.getPath()
            if (r0 == 0) goto L_0x0036
            java.lang.String r2 = "favicon.ico"
            r3 = 2
            boolean r0 = p2628d.p2650m.C52830p.m112413c(r0, r2, r1, r3, r5)
            goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            if (r0 != 0) goto L_0x003c
            r0 = 1
            r4.f64463b = r0
        L_0x003c:
            com.ss.android.ugc.aweme.bullet.module.ad.e$a r0 = f64460d
            if (r6 == 0) goto L_0x004b
            android.net.Uri r6 = r6.getUrl()
            if (r6 == 0) goto L_0x004b
            java.lang.String r6 = r6.toString()
            goto L_0x004c
        L_0x004b:
            r6 = r5
        L_0x004c:
            if (r7 == 0) goto L_0x0052
            int r1 = r7.getStatusCode()
        L_0x0052:
            if (r7 == 0) goto L_0x0058
            java.lang.String r5 = r7.getReasonPhrase()
        L_0x0058:
            r0.mo50054a(r6, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24304e.mo18605a(com.bytedance.ies.bullet.kit.web.g, android.webkit.WebResourceRequest, android.webkit.WebResourceResponse):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18606a(com.bytedance.ies.bullet.kit.web.C10524g r3, com.bytedance.ies.bullet.kit.web.C10529l r4, com.bytedance.ies.bullet.kit.web.C10528k r5) {
        /*
            r2 = this;
            java.lang.String r0 = "kitContainerApi"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
            r3 = 0
            if (r4 == 0) goto L_0x0013
            android.net.Uri r0 = r4.mo18565a()
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = r0.toString()
            goto L_0x0014
        L_0x0013:
            r0 = r3
        L_0x0014:
            boolean r0 = m59543a(r0)
            if (r0 == 0) goto L_0x001b
            return
        L_0x001b:
            r0 = 1
            r2.f64463b = r0
            com.ss.android.ugc.aweme.bullet.module.ad.e$a r0 = f64460d
            if (r4 == 0) goto L_0x002d
            android.net.Uri r4 = r4.mo18565a()
            if (r4 == 0) goto L_0x002d
            java.lang.String r4 = r4.toString()
            goto L_0x002e
        L_0x002d:
            r4 = r3
        L_0x002e:
            if (r5 == 0) goto L_0x0035
            int r1 = r5.mo18568a()
            goto L_0x0036
        L_0x0035:
            r1 = 0
        L_0x0036:
            if (r5 == 0) goto L_0x0042
            java.lang.CharSequence r5 = r5.mo18569b()
            if (r5 == 0) goto L_0x0042
            java.lang.String r3 = r5.toString()
        L_0x0042:
            r0.mo50054a(r4, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24304e.mo18606a(com.bytedance.ies.bullet.kit.web.g, com.bytedance.ies.bullet.kit.web.l, com.bytedance.ies.bullet.kit.web.k):void");
    }

    /* renamed from: a */
    public final void mo18608a(C10524g gVar, String str, Bitmap bitmap) {
        C52711k.m112240b(gVar, "kitContainerApi");
        if (!m59543a(str)) {
            this.f64462a = false;
            this.f64463b = false;
            f64459c.clear();
        }
    }

    /* renamed from: a */
    public final void mo18602a(C10524g gVar, int i, String str, String str2) {
        C52711k.m112240b(gVar, "kitContainerApi");
        if (!m59543a(str2)) {
            this.f64463b = true;
            f64460d.mo50054a(str2, i, str);
        }
    }
}
