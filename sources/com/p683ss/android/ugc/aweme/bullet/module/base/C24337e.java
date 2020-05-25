package com.p683ss.android.ugc.aweme.bullet.module.base;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.ies.bullet.kit.web.C10524g;
import com.bytedance.ies.bullet.kit.web.C10530m;
import com.bytedance.ies.bullet.kit.web.p648a.C10488e;
import com.bytedance.ies.bullet.kit.web.p649b.C10492a;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p653ui.common.view.SSWebView;
import com.p683ss.android.newmedia.C19544c;
import com.p683ss.android.sdk.activity.C19725b;
import com.p683ss.android.ugc.aweme.bullet.business.C24254b;
import com.p683ss.android.ugc.aweme.bullet.business.ShareBusiness;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18979e;
import com.p683ss.android.ugc.aweme.login.larksso.LarkSsoHelper;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONObject;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.base.e */
public class C24337e extends C10488e {

    /* renamed from: a */
    public final C24254b f64624a;

    /* renamed from: b */
    public final C10530m f64625b;

    /* renamed from: c */
    private final C19544c f64626c = new C19544c();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo50035a(JSONObject jSONObject, boolean z) {
        C52711k.m112240b(jSONObject, "data");
    }

    /* renamed from: a */
    public void mo18608a(C10524g gVar, String str, Bitmap bitmap) {
        C52711k.m112240b(gVar, "kitContainerApi");
        C10530m mVar = this.f64625b;
        if (mVar != null) {
            mVar.mo18608a(gVar, str, bitmap);
        }
        ShareBusiness shareBusiness = (ShareBusiness) this.f64624a.mo50011a(ShareBusiness.class);
        if (shareBusiness != null) {
            shareBusiness.mo49965a(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo50133a(Context context, String str) {
        return this.f64626c.mo40799a(context, str);
    }

    /* renamed from: a */
    protected static SSWebView m59684a(C10524g gVar) {
        C52711k.m112240b(gVar, "kitContainerApi");
        try {
            WebView m_ = gVar.mo18665m_();
            if (m_ != null) {
                return (SSWebView) m_;
            }
            throw new C52857u("null cannot be cast to non-null type com.bytedance.ies.bullet.ui.common.view.SSWebView");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final WebResourceResponse mo18613c(C10524g gVar, String str) {
        C52711k.m112240b(gVar, "kitContainerApi");
        LarkSsoHelper.m81943a(str);
        return super.mo18613c(gVar, str);
    }

    /* renamed from: e */
    protected static boolean m59687e(C10524g gVar, String str) {
        C52711k.m112240b(gVar, "kitContainerApi");
        C18979e.m46155a(str);
        C10492a j = gVar.mo18664j();
        if (j == null || !j.mo18619a(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo18612b(C10524g gVar, String str) {
        C52711k.m112240b(gVar, "kitContainerApi");
        if (!mo50133a((Context) this.f64624a.mo50010a(), str) && !m59687e(gVar, str)) {
            return super.mo18612b(gVar, str);
        }
        return true;
    }

    /* renamed from: a */
    public void mo18607a(C10524g gVar, String str) {
        C52711k.m112240b(gVar, "kitContainerApi");
        C10530m mVar = this.f64625b;
        if (mVar != null) {
            mVar.mo18607a(gVar, str);
        }
        m59685a(Integer.valueOf(0), "", str, true);
    }

    /* renamed from: a */
    public final void mo18604a(C10524g gVar, SslErrorHandler sslErrorHandler, SslError sslError) {
        C52711k.m112240b(gVar, "kitContainerApi");
        C10530m mVar = this.f64625b;
        if (mVar != null) {
            mVar.mo18604a(gVar, sslErrorHandler, sslError);
        }
    }

    public C24337e(C10326b bVar, C24254b bVar2, C10530m mVar) {
        C52711k.m112240b(bVar, "ctx");
        C52711k.m112240b(bVar2, "bulletBusiness");
        this.f64624a = bVar2;
        this.f64625b = mVar;
    }

    /* renamed from: a */
    protected static void m59686a(JSONObject jSONObject, String str, Object obj) {
        C52711k.m112240b(str, "key");
        if (jSONObject != null && !TextUtils.isEmpty(str) && obj != null) {
            try {
                jSONObject.put(str, obj);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo18605a(C10524g gVar, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        C52711k.m112240b(gVar, "kitContainerApi");
        C10530m mVar = this.f64625b;
        if (mVar != null) {
            mVar.mo18605a(gVar, webResourceRequest, webResourceResponse);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (p2628d.p2650m.C52830p.m112413c(r3, "favicon.ico", false, 2, null) == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (r3 == null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005b, code lost:
        if (p2628d.p2650m.C52830p.m112413c(r3, "favicon.ico", false, 2, null) == true) goto L_0x009d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18606a(com.bytedance.ies.bullet.kit.web.C10524g r7, com.bytedance.ies.bullet.kit.web.C10529l r8, com.bytedance.ies.bullet.kit.web.C10528k r9) {
        /*
            r6 = this;
            java.lang.String r0 = "kitContainerApi"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            com.bytedance.ies.bullet.kit.web.m r0 = r6.f64625b
            if (r0 == 0) goto L_0x000c
            r0.mo18606a(r7, r8, r9)
        L_0x000c:
            r7 = 2
            r0 = 1
            r1 = 0
            r2 = 0
            if (r8 == 0) goto L_0x0018
            boolean r3 = r8.mo18566b()
            if (r3 == r0) goto L_0x002e
        L_0x0018:
            if (r8 == 0) goto L_0x0041
            android.net.Uri r3 = r8.mo18565a()
            if (r3 == 0) goto L_0x0041
            java.lang.String r3 = r3.getPath()
            if (r3 == 0) goto L_0x0041
            java.lang.String r4 = "favicon.ico"
            boolean r3 = p2628d.p2650m.C52830p.m112413c(r3, r4, r1, r7, r2)
            if (r3 != 0) goto L_0x0041
        L_0x002e:
            android.net.Uri r3 = r8.mo18565a()
            if (r3 == 0) goto L_0x003a
            java.lang.String r3 = r3.toString()
            if (r3 != 0) goto L_0x003c
        L_0x003a:
            java.lang.String r3 = "null"
        L_0x003c:
            java.lang.String r4 = "request.url?.toString() ?: \"null\""
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
        L_0x0041:
            if (r8 == 0) goto L_0x009d
            boolean r3 = r8.mo18566b()
            if (r3 != 0) goto L_0x009d
            android.net.Uri r3 = r8.mo18565a()
            if (r3 == 0) goto L_0x005d
            java.lang.String r3 = r3.getPath()
            if (r3 == 0) goto L_0x005d
            java.lang.String r4 = "favicon.ico"
            boolean r7 = p2628d.p2650m.C52830p.m112413c(r3, r4, r1, r7, r2)
            if (r7 == r0) goto L_0x009d
        L_0x005d:
            if (r9 == 0) goto L_0x009d
            int r7 = r9.mo18568a()
            android.net.Uri r0 = r8.mo18565a()
            if (r0 == 0) goto L_0x006e
            java.lang.String r0 = r0.getHost()
            goto L_0x006f
        L_0x006e:
            r0 = r2
        L_0x006f:
            android.net.Uri r3 = r8.mo18565a()
            if (r3 == 0) goto L_0x007a
            java.lang.String r3 = r3.getPath()
            goto L_0x007b
        L_0x007a:
            r3 = r2
        L_0x007b:
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r5 = "host"
            com.p683ss.android.sdk.activity.C19725b.m48222a(r4, r5, r0)
            java.lang.String r0 = "path"
            com.p683ss.android.sdk.activity.C19725b.m48222a(r4, r0, r3)
            java.lang.String r0 = "statusCode"
            com.p683ss.android.sdk.activity.C19725b.m48222a(r4, r0, r2)
            java.lang.String r0 = "errorCode"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            com.p683ss.android.sdk.activity.C19725b.m48222a(r4, r0, r7)
            java.lang.String r7 = "aweme_webview_assets_error"
            com.p683ss.android.ugc.aweme.base.C23569o.m57776a(r7, r1, r4)
        L_0x009d:
            if (r9 == 0) goto L_0x00a8
            int r7 = r9.mo18568a()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x00a9
        L_0x00a8:
            r7 = r2
        L_0x00a9:
            if (r9 == 0) goto L_0x00b6
            java.lang.CharSequence r9 = r9.mo18569b()
            if (r9 == 0) goto L_0x00b6
            java.lang.String r9 = r9.toString()
            goto L_0x00b7
        L_0x00b6:
            r9 = r2
        L_0x00b7:
            if (r8 == 0) goto L_0x00bd
            android.net.Uri r2 = r8.mo18565a()
        L_0x00bd:
            java.lang.String r8 = java.lang.String.valueOf(r2)
            r6.m59685a(r7, r9, r8, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.module.base.C24337e.mo18606a(com.bytedance.ies.bullet.kit.web.g, com.bytedance.ies.bullet.kit.web.l, com.bytedance.ies.bullet.kit.web.k):void");
    }

    /* renamed from: a */
    private final void m59685a(Integer num, String str, String str2, boolean z) {
        JSONObject jSONObject = new JSONObject();
        m59686a(jSONObject, "errorCode", (Object) num);
        if (!TextUtils.isEmpty(str)) {
            m59686a(jSONObject, "errorDesc", (Object) str);
        }
        if (!TextUtils.isEmpty(str2)) {
            Uri parse = Uri.parse(str2);
            m59686a(jSONObject, "url", (Object) str2);
            C52711k.m112236a((Object) parse, "url");
            m59686a(jSONObject, "host", (Object) parse.getHost());
            m59686a(jSONObject, LeakCanaryFileProvider.f132050j, (Object) parse.getPath());
        }
        m59686a(jSONObject, "container_type", (Object) "bullet");
        mo50035a(jSONObject, z);
        C19725b.m48223a(jSONObject, z);
    }

    /* renamed from: a */
    public void mo18602a(C10524g gVar, int i, String str, String str2) {
        C52711k.m112240b(gVar, "kitContainerApi");
        C10530m mVar = this.f64625b;
        if (mVar != null) {
            mVar.mo18602a(gVar, i, str, str2);
        }
        if (VERSION.SDK_INT < 23) {
            m59685a(Integer.valueOf(i), str, str2, false);
        }
    }
}
