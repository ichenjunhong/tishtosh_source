package com.bytedance.ies.bullet.kit.web;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient.CustomViewCallback;

/* renamed from: com.bytedance.ies.bullet.kit.web.f */
public interface C10523f {
    /* renamed from: a */
    Bitmap mo18571a();

    /* renamed from: a */
    View mo18572a(C10524g gVar);

    /* renamed from: a */
    void mo18573a(ValueCallback<Uri> valueCallback);

    /* renamed from: a */
    void mo18574a(ValueCallback<Uri> valueCallback, String str);

    /* renamed from: a */
    void mo18575a(ValueCallback<Uri> valueCallback, String str, String str2);

    /* renamed from: a */
    void mo18576a(C10524g gVar, int i);

    /* renamed from: a */
    void mo18577a(C10524g gVar, View view, int i, CustomViewCallback customViewCallback);

    /* renamed from: a */
    void mo18578a(C10524g gVar, View view, CustomViewCallback customViewCallback);

    /* renamed from: a */
    void mo18579a(C10524g gVar, C10519e eVar);

    /* renamed from: a */
    void mo18580a(C10524g gVar, String str);

    /* renamed from: a */
    void mo18581a(C10524g gVar, String str, int i, String str2);

    /* renamed from: a */
    void mo18582a(C10524g gVar, String str, Callback callback);

    /* renamed from: a */
    boolean mo18583a(C10524g gVar, ValueCallback<Uri[]> valueCallback, C10499c cVar);

    /* renamed from: a */
    boolean mo18584a(C10524g gVar, String str, String str2, JsResult jsResult);

    /* renamed from: a */
    boolean mo18585a(C10524g gVar, String str, String str2, String str3, JsPromptResult jsPromptResult);

    /* renamed from: b */
    void mo18586b(C10524g gVar);

    /* renamed from: b */
    boolean mo18587b(C10524g gVar, String str, String str2, JsResult jsResult);

    /* renamed from: c */
    void mo18588c(C10524g gVar);

    /* renamed from: c */
    boolean mo18589c(C10524g gVar, String str, String str2, JsResult jsResult);
}
