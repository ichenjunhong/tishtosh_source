package com.bytedance.ies.bullet.kit.web;

import android.net.Uri;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import java.util.Map;
import p2628d.p2629a.C52550ab;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.kit.web.a */
public final class C10479a {

    /* renamed from: com.bytedance.ies.bullet.kit.web.a$a */
    public static final class C10480a implements C10529l {

        /* renamed from: a */
        final /* synthetic */ WebResourceRequest f27877a;

        /* renamed from: b */
        public final boolean mo18566b() {
            return this.f27877a.isForMainFrame();
        }

        /* renamed from: a */
        public final Uri mo18565a() {
            Uri url = this.f27877a.getUrl();
            C52711k.m112236a((Object) url, "getUrl()");
            return url;
        }

        /* renamed from: c */
        public final Map<String, String> mo18567c() {
            Map<String, String> requestHeaders = this.f27877a.getRequestHeaders();
            if (requestHeaders == null) {
                return C52550ab.m112045a();
            }
            return requestHeaders;
        }

        C10480a(WebResourceRequest webResourceRequest) {
            this.f27877a = webResourceRequest;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.a$b */
    public static final class C10481b implements C10528k {

        /* renamed from: a */
        final /* synthetic */ WebResourceError f27878a;

        /* renamed from: a */
        public final int mo18568a() {
            return this.f27878a.getErrorCode();
        }

        /* renamed from: b */
        public final CharSequence mo18569b() {
            return this.f27878a.getDescription();
        }

        C10481b(WebResourceError webResourceError) {
            this.f27878a = webResourceError;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.a$c */
    public static final class C10482c implements C10519e {

        /* renamed from: a */
        final /* synthetic */ PermissionRequest f27879a;

        C10482c(PermissionRequest permissionRequest) {
            this.f27879a = permissionRequest;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.a$d */
    public static final class C10483d implements C10499c {

        /* renamed from: a */
        final /* synthetic */ FileChooserParams f27880a;

        /* renamed from: a */
        public final String[] mo18570a() {
            return this.f27880a.getAcceptTypes();
        }

        C10483d(FileChooserParams fileChooserParams) {
            this.f27880a = fileChooserParams;
        }
    }

    /* renamed from: a */
    public static final C10529l m21031a(WebResourceRequest webResourceRequest) {
        C52711k.m112240b(webResourceRequest, "$this$transform");
        return new C10480a(webResourceRequest);
    }
}
