package com.bytedance.ies.bullet.kit.web;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;

/* renamed from: com.bytedance.ies.bullet.kit.web.m */
public interface C10530m {
    /* renamed from: a */
    void mo18602a(C10524g gVar, int i, String str, String str2);

    /* renamed from: a */
    void mo18603a(C10524g gVar, HttpAuthHandler httpAuthHandler, String str, String str2);

    /* renamed from: a */
    void mo18604a(C10524g gVar, SslErrorHandler sslErrorHandler, SslError sslError);

    /* renamed from: a */
    void mo18605a(C10524g gVar, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse);

    /* renamed from: a */
    void mo18606a(C10524g gVar, C10529l lVar, C10528k kVar);

    /* renamed from: a */
    void mo18607a(C10524g gVar, String str);

    /* renamed from: a */
    void mo18608a(C10524g gVar, String str, Bitmap bitmap);

    /* renamed from: a */
    boolean mo18609a(C10524g gVar, RenderProcessGoneDetail renderProcessGoneDetail);

    /* renamed from: a */
    boolean mo18610a(C10524g gVar, C10529l lVar);

    /* renamed from: b */
    WebResourceResponse mo18611b(C10524g gVar, C10529l lVar);

    /* renamed from: b */
    boolean mo18612b(C10524g gVar, String str);

    /* renamed from: c */
    WebResourceResponse mo18613c(C10524g gVar, String str);

    /* renamed from: d */
    void mo18614d(C10524g gVar, String str);
}
