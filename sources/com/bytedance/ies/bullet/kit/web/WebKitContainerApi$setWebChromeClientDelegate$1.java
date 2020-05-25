package com.bytedance.ies.bullet.kit.web;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebView;
import com.bytedance.android.monitor.webview.C8892c;
import com.bytedance.ies.bullet.kit.web.C10479a.C10482c;
import com.bytedance.ies.bullet.kit.web.C10479a.C10483d;
import com.bytedance.ies.bullet.kit.web.p650c.C10500a;
import com.bytedance.ies.bullet.kit.web.p650c.C10504c;
import com.bytedance.ies.bullet.p628b.p629a.C10241d;
import p2628d.p2639f.p2641b.C52711k;

public final class WebKitContainerApi$setWebChromeClientDelegate$1 extends WebChromeClient {

    /* renamed from: a */
    final /* synthetic */ C10531n f27876a;

    public final Bitmap getDefaultVideoPoster() {
        for (C10523f a : this.f27876a.f27981h) {
            try {
                return a.mo18571a();
            } catch (C10241d unused) {
            }
        }
        return super.getDefaultVideoPoster();
    }

    public final View getVideoLoadingProgressView() {
        for (C10523f a : this.f27876a.f27981h) {
            try {
                return a.mo18572a((C10524g) this.f27876a);
            } catch (C10241d unused) {
            }
        }
        return super.getVideoLoadingProgressView();
    }

    public final void onGeolocationPermissionsHidePrompt() {
        super.onGeolocationPermissionsHidePrompt();
        for (C10523f b : this.f27876a.f27981h) {
            try {
                b.mo18586b(this.f27876a);
            } catch (C10241d unused) {
            }
        }
    }

    public final void onHideCustomView() {
        super.onHideCustomView();
        for (C10523f c : this.f27876a.f27981h) {
            try {
                c.mo18588c(this.f27876a);
            } catch (C10241d unused) {
            }
        }
    }

    WebKitContainerApi$setWebChromeClientDelegate$1(C10531n nVar) {
        this.f27876a = nVar;
    }

    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        C10519e eVar;
        super.onPermissionRequest(permissionRequest);
        for (C10523f fVar : this.f27876a.f27981h) {
            try {
                C10524g gVar = this.f27876a;
                if (permissionRequest != null) {
                    C52711k.m112240b(permissionRequest, "$this$transform");
                    eVar = new C10482c(permissionRequest);
                } else {
                    eVar = null;
                }
                fVar.mo18579a(gVar, eVar);
            } catch (C10241d unused) {
            }
        }
    }

    public final void openFileChooser(ValueCallback<Uri> valueCallback) {
        C52711k.m112240b(valueCallback, "uploadMsg");
        for (C10523f a : this.f27876a.f27981h) {
            try {
                a.mo18573a(valueCallback);
            } catch (C10241d unused) {
            }
        }
    }

    public final void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
        super.onGeolocationPermissionsShowPrompt(str, callback);
        for (C10523f a : this.f27876a.f27981h) {
            try {
                a.mo18582a((C10524g) this.f27876a, str, callback);
            } catch (C10241d unused) {
            }
        }
    }

    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        C10504c u = this.f27876a.mo18669u();
        if (u != null) {
            C10500a h = u.mo18652h();
            if (h != null) {
                h.mo18630a(i);
            }
            C8892c j = u.mo18654j();
            if (j != null) {
                j.mo15896a(webView, i);
            }
        }
        for (C10523f a : this.f27876a.f27981h) {
            try {
                a.mo18576a((C10524g) this.f27876a, i);
            } catch (C10241d unused) {
            }
        }
    }

    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        C10504c u = this.f27876a.mo18669u();
        if (u != null) {
            C10500a h = u.mo18652h();
            if (h != null) {
                h.mo18639c();
            }
        }
        for (C10523f a : this.f27876a.f27981h) {
            try {
                a.mo18580a((C10524g) this.f27876a, str);
            } catch (C10241d unused) {
            }
        }
    }

    public final void onShowCustomView(View view, CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
        for (C10523f a : this.f27876a.f27981h) {
            try {
                a.mo18578a((C10524g) this.f27876a, view, customViewCallback);
            } catch (C10241d unused) {
            }
        }
    }

    public final void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
        C52711k.m112240b(valueCallback, "uploadMsg");
        C52711k.m112240b(str, "acceptType");
        for (C10523f a : this.f27876a.f27981h) {
            try {
                a.mo18574a(valueCallback, str);
            } catch (C10241d unused) {
            }
        }
    }

    public final void onConsoleMessage(String str, int i, String str2) {
        super.onConsoleMessage(str, i, str2);
        for (C10523f a : this.f27876a.f27981h) {
            try {
                a.mo18581a((C10524g) this.f27876a, str, i, str2);
            } catch (C10241d unused) {
            }
        }
    }

    public final void onShowCustomView(View view, int i, CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, i, customViewCallback);
        for (C10523f a : this.f27876a.f27981h) {
            try {
                a.mo18577a((C10524g) this.f27876a, view, i, customViewCallback);
            } catch (C10241d unused) {
            }
        }
    }

    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, FileChooserParams fileChooserParams) {
        C10499c cVar;
        for (C10523f fVar : this.f27876a.f27981h) {
            try {
                C10524g gVar = this.f27876a;
                if (fileChooserParams != null) {
                    C52711k.m112240b(fileChooserParams, "$this$transform");
                    cVar = new C10483d(fileChooserParams);
                } else {
                    cVar = null;
                }
                return fVar.mo18583a(gVar, valueCallback, cVar);
            } catch (C10241d unused) {
            }
        }
        return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }

    public final void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        C52711k.m112240b(valueCallback, "uploadMsg");
        C52711k.m112240b(str, "acceptType");
        C52711k.m112240b(str2, "capture");
        for (C10523f a : this.f27876a.f27981h) {
            try {
                a.mo18575a(valueCallback, str, str2);
            } catch (C10241d unused) {
            }
        }
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        for (C10523f a : this.f27876a.f27981h) {
            try {
                return a.mo18584a((C10524g) this.f27876a, str, str2, jsResult);
            } catch (C10241d unused) {
            }
        }
        return super.onJsAlert(webView, str, str2, jsResult);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        for (C10523f c : this.f27876a.f27981h) {
            try {
                return c.mo18589c(this.f27876a, str, str2, jsResult);
            } catch (C10241d unused) {
            }
        }
        return super.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        for (C10523f b : this.f27876a.f27981h) {
            try {
                return b.mo18587b(this.f27876a, str, str2, jsResult);
            } catch (C10241d unused) {
            }
        }
        return super.onJsConfirm(webView, str, str2, jsResult);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        for (C10523f a : this.f27876a.f27981h) {
            try {
                return a.mo18585a(this.f27876a, str, str2, str3, jsPromptResult);
            } catch (C10241d unused) {
            }
        }
        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }
}
