package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager.BadTokenException;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebStorage.QuotaUpdater;
import android.webkit.WebView;
import android.webkit.WebView.WebViewTransport;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.p906a.C13482c;
import com.google.android.gms.ads.internal.C14987bu;
import com.google.android.gms.ads.internal.overlay.C15006c;
import com.google.android.gms.common.util.C15524o;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.als */
public final class C15585als extends WebChromeClient {

    /* renamed from: a */
    private final ama f40878a;

    public C15585als(ama ama) {
        this.f40878a = ama;
    }

    /* renamed from: a */
    private final boolean m33243a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        try {
            if (!(this.f40878a == null || this.f40878a.mo29197w() == null || this.f40878a.mo29197w().mo29202a() == null)) {
                C14987bu a = this.f40878a.mo29197w().mo29202a();
                if (a != null && !a.mo27622b()) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(str3).length());
                    sb.append("window.");
                    sb.append(str);
                    sb.append("('");
                    sb.append(str3);
                    sb.append("')");
                    a.mo27621a(sb.toString());
                    return false;
                }
            }
            Builder builder = new Builder(context);
            builder.setTitle(str2);
            if (z) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(context);
                textView.setText(str3);
                EditText editText = new EditText(context);
                editText.setText(str4);
                linearLayout.addView(textView);
                linearLayout.addView(editText);
                builder.setView(linearLayout).setPositiveButton(17039370, new aly(jsPromptResult, editText)).setNegativeButton(17039360, new alx(jsPromptResult)).setOnCancelListener(new alw(jsPromptResult)).create().show();
            } else {
                builder.setMessage(str3).setPositiveButton(17039370, new alv(jsResult)).setNegativeButton(17039360, new alu(jsResult)).setOnCancelListener(new alt(jsResult)).create().show();
            }
        } catch (BadTokenException e) {
            abv.m32795c("Fail to display Dialog.", e);
        }
        return true;
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebViewTransport webViewTransport = (WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.f40878a.mo29198x() != null) {
            webView2.setWebViewClient(C13482c.m27232a(this.f40878a.mo29198x()));
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof ama)) {
            abv.m32798e("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        C15006c s = ((ama) webView).mo29187s();
        if (s == null) {
            abv.m32798e("Tried to close an AdWebView not associated with an overlay.");
        } else {
            s.mo27669a();
        }
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 19 + String.valueOf(sourceId).length());
        sb.append("JS: ");
        sb.append(message);
        sb.append(" (");
        sb.append(sourceId);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        String sb2 = sb.toString();
        if (sb2.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        switch (alz.f40886a[consoleMessage.messageLevel().ordinal()]) {
            case 1:
                abv.m32794c(sb2);
                break;
            case 2:
                abv.m32798e(sb2);
                break;
            case 3:
            case 4:
                abv.m32796d(sb2);
                break;
            case 5:
                abv.m32792b(sb2);
                break;
            default:
                abv.m32796d(sb2);
                break;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j != 0) {
            if (j2 == 0) {
                j = Math.min(j + Math.min(131072, j4), 1048576);
            } else if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        } else if (j2 > j4 || j2 > 1048576) {
            j2 = 0;
        }
        quotaUpdater.updateQuota(j2);
    }

    public final void onHideCustomView() {
        C15006c s = this.f40878a.mo29187s();
        if (s == null) {
            abv.m32798e("Could not get ad overlay when hiding custom view.");
        } else {
            s.mo27676b();
        }
    }

    /* renamed from: a */
    private static Context m33242a(WebView webView) {
        if (!(webView instanceof ama)) {
            return webView.getContext();
        }
        ama ama = (ama) webView;
        Activity d = ama.mo28938d();
        if (d != null) {
            return d;
        }
        return ama.getContext();
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return m33243a(m33242a(webView), "alert", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return m33243a(m33242a(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return m33243a(m33242a(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return m33243a(m33242a(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    public final void onReachedMaxAppCacheSize(long j, long j2, QuotaUpdater quotaUpdater) {
        long j3 = j + 131072;
        if (5242880 - j2 < j3) {
            quotaUpdater.updateQuota(0);
        } else {
            quotaUpdater.updateQuota(j3);
        }
    }

    public final void onShowCustomView(View view, CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }

    public final void onShowCustomView(View view, int i, CustomViewCallback customViewCallback) {
        C15006c s = this.f40878a.mo29187s();
        if (s == null) {
            abv.m32798e("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        s.mo27673a(view, customViewCallback);
        s.mo27670a(i);
    }

    public final void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
        if (callback != null) {
            callback.invoke(str, acd.m32590a(this.f40878a.getContext(), "android.permission.ACCESS_FINE_LOCATION") || acd.m32590a(this.f40878a.getContext(), "android.permission.ACCESS_COARSE_LOCATION"), true);
        }
    }

    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        if (C15524o.m32299g()) {
            if (!((Boolean) caf.m37099d().mo30717a(C15740bx.f44262aw)).booleanValue()) {
                if (this.f40878a == null || this.f40878a.mo29197w() == null || this.f40878a.mo29197w().mo29226l() == null) {
                    super.onPermissionRequest(permissionRequest);
                    return;
                }
                String[] a = this.f40878a.mo29197w().mo29226l().mo31548a(permissionRequest.getResources());
                if (a.length > 0) {
                    permissionRequest.grant(a);
                    return;
                } else {
                    permissionRequest.deny();
                    return;
                }
            }
        }
        super.onPermissionRequest(permissionRequest);
    }
}
