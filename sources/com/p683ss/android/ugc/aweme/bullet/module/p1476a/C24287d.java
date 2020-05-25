package com.p683ss.android.ugc.aweme.bullet.module.p1476a;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.view.View;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.HttpAuthHandler;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.ies.bullet.kit.web.C10499c;
import com.bytedance.ies.bullet.kit.web.C10519e;
import com.bytedance.ies.bullet.kit.web.C10523f;
import com.bytedance.ies.bullet.kit.web.C10524g;
import com.bytedance.ies.bullet.kit.web.C10528k;
import com.bytedance.ies.bullet.kit.web.C10529l;
import com.bytedance.ies.bullet.kit.web.C10530m;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.bullet.kit.web.p648a.C10484a;
import com.bytedance.ies.bullet.kit.web.p648a.C10486c;
import com.bytedance.ies.bullet.kit.web.p648a.C10488e;
import com.bytedance.ies.bullet.kit.web.p649b.C10492a;
import com.bytedance.ies.bullet.p628b.p629a.C10241d;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p653ui.common.p655b.C10565b;
import com.p683ss.android.newmedia.p1196b.C19543a;
import com.p683ss.android.ugc.aweme.app.C23057c;
import com.p683ss.android.ugc.aweme.bullet.p1470a.C24099a;
import com.p683ss.android.ugc.aweme.bullet.utils.C24348b;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18979e;
import java.util.Locale;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.a.d */
public final class C24287d extends C10486c {

    /* renamed from: a */
    private final C10326b f64421a;

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.a.d$a */
    public static final class C24288a extends C10484a {

        /* renamed from: a */
        final /* synthetic */ C10484a f64422a;

        /* renamed from: a */
        public final void mo18581a(C10524g gVar, String str, int i, String str2) {
            C52711k.m112240b(gVar, "kitContainerApi");
            C10484a aVar = this.f64422a;
            if (aVar != null) {
                try {
                    aVar.mo18581a(gVar, str, i, str2);
                    return;
                } catch (C10241d unused) {
                }
            }
            super.mo18581a(gVar, str, i, str2);
        }

        /* renamed from: a */
        public final void mo18582a(C10524g gVar, String str, Callback callback) {
            C52711k.m112240b(gVar, "kitContainerApi");
            C10484a aVar = this.f64422a;
            if (aVar != null) {
                try {
                    aVar.mo18582a(gVar, str, callback);
                    return;
                } catch (C10241d unused) {
                }
            }
            super.mo18582a(gVar, str, callback);
        }

        /* renamed from: a */
        public final boolean mo18585a(C10524g gVar, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            C52711k.m112240b(gVar, "kitContainerApi");
            C10484a aVar = this.f64422a;
            if (aVar != null) {
                try {
                    return aVar.mo18585a(gVar, str, str2, str3, jsPromptResult);
                } catch (C10241d unused) {
                }
            }
            return super.mo18585a(gVar, str, str2, str3, jsPromptResult);
        }

        /* renamed from: a */
        public final boolean mo18583a(C10524g gVar, ValueCallback<Uri[]> valueCallback, C10499c cVar) {
            C52711k.m112240b(gVar, "kitContainerApi");
            C10484a aVar = this.f64422a;
            if (aVar != null) {
                try {
                    return aVar.mo18583a(gVar, valueCallback, cVar);
                } catch (C10241d unused) {
                }
            }
            return super.mo18583a(gVar, valueCallback, cVar);
        }

        C24288a(C10484a aVar) {
            this.f64422a = aVar;
        }

        /* renamed from: c */
        public final void mo18588c(C10524g gVar) {
            C52711k.m112240b(gVar, "kitContainerApi");
            C10484a aVar = this.f64422a;
            if (aVar != null) {
                aVar.mo18588c(gVar);
            }
        }

        /* renamed from: a */
        public final void mo18573a(ValueCallback<Uri> valueCallback) {
            C52711k.m112240b(valueCallback, "uploadMsg");
            C10484a aVar = this.f64422a;
            if (aVar != null) {
                try {
                    aVar.mo18573a(valueCallback);
                    return;
                } catch (C10241d unused) {
                }
            }
            super.mo18573a(valueCallback);
        }

        /* renamed from: b */
        public final void mo18586b(C10524g gVar) {
            C52711k.m112240b(gVar, "kitContainerApi");
            C10484a aVar = this.f64422a;
            if (aVar != null) {
                try {
                    aVar.mo18586b(gVar);
                    return;
                } catch (C10241d unused) {
                }
            }
            super.mo18586b(gVar);
        }

        /* renamed from: a */
        public final void mo18574a(ValueCallback<Uri> valueCallback, String str) {
            C52711k.m112240b(valueCallback, "uploadMsg");
            C52711k.m112240b(str, "acceptType");
            C10484a aVar = this.f64422a;
            if (aVar != null) {
                try {
                    aVar.mo18574a(valueCallback, str);
                    return;
                } catch (C10241d unused) {
                }
            }
            super.mo18574a(valueCallback, str);
        }

        /* renamed from: a */
        public final void mo18576a(C10524g gVar, int i) {
            C52711k.m112240b(gVar, "kitContainerApi");
            C10484a aVar = this.f64422a;
            if (aVar != null) {
                try {
                    aVar.mo18576a(gVar, i);
                    return;
                } catch (C10241d unused) {
                }
            }
            super.mo18576a(gVar, i);
        }

        /* renamed from: a */
        public final void mo18579a(C10524g gVar, C10519e eVar) {
            C52711k.m112240b(gVar, "kitContainerApi");
            C10484a aVar = this.f64422a;
            if (aVar != null) {
                try {
                    aVar.mo18579a(gVar, eVar);
                    return;
                } catch (C10241d unused) {
                }
            }
            super.mo18579a(gVar, eVar);
        }

        /* renamed from: a */
        public final void mo18580a(C10524g gVar, String str) {
            C52711k.m112240b(gVar, "kitContainerApi");
            C10484a aVar = this.f64422a;
            if (aVar != null) {
                aVar.mo18580a(gVar, str);
            }
        }

        /* renamed from: a */
        public final void mo18578a(C10524g gVar, View view, CustomViewCallback customViewCallback) {
            C52711k.m112240b(gVar, "kitContainerApi");
            C10484a aVar = this.f64422a;
            if (aVar != null) {
                aVar.mo18578a(gVar, view, customViewCallback);
            }
        }

        /* renamed from: a */
        public final void mo18575a(ValueCallback<Uri> valueCallback, String str, String str2) {
            C52711k.m112240b(valueCallback, "uploadMsg");
            C52711k.m112240b(str, "acceptType");
            C52711k.m112240b(str2, "capture");
            C10484a aVar = this.f64422a;
            if (aVar != null) {
                try {
                    aVar.mo18575a(valueCallback, str, str2);
                    return;
                } catch (C10241d unused) {
                }
            }
            super.mo18575a(valueCallback, str, str2);
        }

        /* renamed from: c */
        public final boolean mo18589c(C10524g gVar, String str, String str2, JsResult jsResult) {
            C52711k.m112240b(gVar, "kitContainerApi");
            C10484a aVar = this.f64422a;
            if (aVar != null) {
                try {
                    return aVar.mo18589c(gVar, str, str2, jsResult);
                } catch (C10241d unused) {
                }
            }
            return super.mo18589c(gVar, str, str2, jsResult);
        }

        /* renamed from: b */
        public final boolean mo18587b(C10524g gVar, String str, String str2, JsResult jsResult) {
            C52711k.m112240b(gVar, "kitContainerApi");
            C10484a aVar = this.f64422a;
            if (aVar != null) {
                try {
                    return aVar.mo18587b(gVar, str, str2, jsResult);
                } catch (C10241d unused) {
                }
            }
            return super.mo18587b(gVar, str, str2, jsResult);
        }

        /* renamed from: a */
        public final void mo18577a(C10524g gVar, View view, int i, CustomViewCallback customViewCallback) {
            C52711k.m112240b(gVar, "kitContainerApi");
            C10484a aVar = this.f64422a;
            if (aVar != null) {
                try {
                    aVar.mo18577a(gVar, view, i, customViewCallback);
                    return;
                } catch (C10241d unused) {
                }
            }
            super.mo18577a(gVar, view, i, customViewCallback);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.a.d$b */
    public static final class C24289b extends C10488e {

        /* renamed from: a */
        final /* synthetic */ C10488e f64423a;

        /* renamed from: a */
        public final boolean mo18609a(C10524g gVar, RenderProcessGoneDetail renderProcessGoneDetail) {
            C52711k.m112240b(gVar, "kitContainerApi");
            return true;
        }

        C24289b(C10488e eVar) {
            this.f64423a = eVar;
        }

        /* renamed from: b */
        public final WebResourceResponse mo18611b(C10524g gVar, C10529l lVar) {
            C52711k.m112240b(gVar, "kitContainerApi");
            C10488e eVar = this.f64423a;
            if (eVar != null) {
                try {
                    return eVar.mo18611b(gVar, lVar);
                } catch (C10241d unused) {
                }
            }
            return super.mo18611b(gVar, lVar);
        }

        /* renamed from: c */
        public final WebResourceResponse mo18613c(C10524g gVar, String str) {
            C52711k.m112240b(gVar, "kitContainerApi");
            C10488e eVar = this.f64423a;
            if (eVar != null) {
                try {
                    return eVar.mo18613c(gVar, str);
                } catch (C10241d unused) {
                }
            }
            return super.mo18613c(gVar, str);
        }

        /* renamed from: d */
        public final void mo18614d(C10524g gVar, String str) {
            C52711k.m112240b(gVar, "kitContainerApi");
            C18979e.m46155a(str);
            C10488e eVar = this.f64423a;
            if (eVar != null) {
                eVar.mo18614d(gVar, str);
            }
        }

        /* renamed from: b */
        public final boolean mo18612b(C10524g gVar, String str) {
            Object obj;
            boolean z;
            String str2;
            Context context;
            C52711k.m112240b(gVar, "kitContainerApi");
            C10488e eVar = this.f64423a;
            if (eVar != null) {
                try {
                    return eVar.mo18612b(gVar, str);
                } catch (C10241d unused) {
                }
            }
            if (str != null) {
                Uri parse = Uri.parse(str);
                C52711k.m112236a((Object) parse, "Uri.parse(rawUrl)");
                String scheme = parse.getScheme();
                if (scheme != null) {
                    Locale locale = Locale.getDefault();
                    C52711k.m112236a((Object) locale, "Locale.getDefault()");
                    if (scheme != null) {
                        obj = scheme.toLowerCase(locale);
                        C52711k.m112236a(obj, "(this as java.lang.String).toLowerCase(locale)");
                    } else {
                        throw new C52857u("null cannot be cast to non-null type java.lang.String");
                    }
                } else {
                    obj = null;
                }
                if ((!C52711k.m112239a((Object) WebKitApi.SCHEME_HTTP, obj)) && (!C52711k.m112239a((Object) WebKitApi.SCHEME_HTTPS, obj))) {
                    C18979e.m46155a(str);
                    C10492a j = gVar.mo18664j();
                    if (j == null || !j.mo18619a(str)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        return true;
                    }
                    if (C52711k.m112239a((Object) C23057c.f61423a, obj) || C52711k.m112239a((Object) C23057c.f61425c, obj)) {
                        str = C19543a.m47829a(str);
                        C52711k.m112236a((Object) str, "AppBaseUtils.tryConvertScheme(rawUrl)");
                    }
                    try {
                        Uri parse2 = Uri.parse(str);
                        String queryParameter = parse2.getQueryParameter("url");
                        if (queryParameter != null) {
                            str2 = C24348b.m59717b(queryParameter);
                        } else {
                            str2 = null;
                        }
                        String valueOf = String.valueOf(C24348b.m59709a(parse2, "url", str2));
                        WebView m_ = gVar.mo18665m_();
                        if (m_ != null) {
                            context = m_.getContext();
                        } else {
                            context = null;
                        }
                        C19543a.m47830a(context, valueOf, null);
                    } catch (Exception unused2) {
                    }
                    return true;
                }
            }
            return super.mo18612b(gVar, str);
        }

        /* renamed from: a */
        public final void mo18607a(C10524g gVar, String str) {
            C52711k.m112240b(gVar, "kitContainerApi");
            C10488e eVar = this.f64423a;
            if (eVar != null) {
                eVar.mo18607a(gVar, str);
            }
        }

        /* renamed from: a */
        public final boolean mo18610a(C10524g gVar, C10529l lVar) {
            C52711k.m112240b(gVar, "kitContainerApi");
            C10488e eVar = this.f64423a;
            if (eVar != null) {
                try {
                    return eVar.mo18610a(gVar, lVar);
                } catch (C10241d unused) {
                }
            }
            return super.mo18610a(gVar, lVar);
        }

        /* renamed from: a */
        public final void mo18604a(C10524g gVar, SslErrorHandler sslErrorHandler, SslError sslError) {
            C52711k.m112240b(gVar, "kitContainerApi");
            C10488e eVar = this.f64423a;
            if (eVar != null) {
                eVar.mo18604a(gVar, sslErrorHandler, sslError);
            }
        }

        /* renamed from: a */
        public final void mo18605a(C10524g gVar, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            C52711k.m112240b(gVar, "kitContainerApi");
            C10488e eVar = this.f64423a;
            if (eVar != null) {
                eVar.mo18605a(gVar, webResourceRequest, webResourceResponse);
            }
        }

        /* renamed from: a */
        public final void mo18606a(C10524g gVar, C10529l lVar, C10528k kVar) {
            C52711k.m112240b(gVar, "kitContainerApi");
            C10488e eVar = this.f64423a;
            if (eVar != null) {
                eVar.mo18606a(gVar, lVar, kVar);
            }
        }

        /* renamed from: a */
        public final void mo18608a(C10524g gVar, String str, Bitmap bitmap) {
            C52711k.m112240b(gVar, "kitContainerApi");
            C10488e eVar = this.f64423a;
            if (eVar != null) {
                eVar.mo18608a(gVar, str, bitmap);
            }
        }

        /* renamed from: a */
        public final void mo18602a(C10524g gVar, int i, String str, String str2) {
            C52711k.m112240b(gVar, "kitContainerApi");
            C10488e eVar = this.f64423a;
            if (eVar != null) {
                eVar.mo18602a(gVar, i, str, str2);
            }
        }

        /* renamed from: a */
        public final void mo18603a(C10524g gVar, HttpAuthHandler httpAuthHandler, String str, String str2) {
            C52711k.m112240b(gVar, "kitContainerApi");
            C10488e eVar = this.f64423a;
            if (eVar != null) {
                eVar.mo18603a(gVar, httpAuthHandler, str, str2);
            }
        }
    }

    /* renamed from: a */
    public final C10530m mo18595a() {
        Object c = this.f64421a.mo18401c(C10565b.class);
        C10488e eVar = null;
        if (!(c instanceof C24099a)) {
            c = null;
        }
        C24099a aVar = (C24099a) c;
        if (aVar != null) {
            eVar = aVar.mo49858d();
        }
        return new C24289b(eVar);
    }

    /* renamed from: b */
    public final C10523f mo18596b() {
        Object c = this.f64421a.mo18401c(C10565b.class);
        C10484a aVar = null;
        if (!(c instanceof C24099a)) {
            c = null;
        }
        C24099a aVar2 = (C24099a) c;
        if (aVar2 != null) {
            aVar = aVar2.mo49857c();
        }
        return new C24288a(aVar);
    }

    public C24287d(C10326b bVar) {
        C52711k.m112240b(bVar, "providerFactory");
        this.f64421a = bVar;
    }
}
