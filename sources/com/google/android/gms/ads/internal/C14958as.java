package com.google.android.gms.ads.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.example.p906a.C13482c;
import com.google.android.gms.internal.ads.C15740bx;
import com.google.android.gms.internal.ads.abv;
import com.google.android.gms.internal.ads.caf;

/* renamed from: com.google.android.gms.ads.internal.as */
final class C14958as extends WebViewClient {

    /* renamed from: a */
    private final /* synthetic */ C14957ar f38566a;

    C14958as(C14957ar arVar) {
        this.f38566a = arVar;
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return C13482c.m27234a(webView, renderProcessGoneDetail);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.f38566a.mo27555d())) {
            return false;
        }
        if (str.startsWith((String) caf.m37099d().mo30717a(C15740bx.f44346ca))) {
            if (this.f38566a.f38564h != null) {
                try {
                    this.f38566a.f38564h.mo30870a(3);
                } catch (RemoteException e) {
                    abv.m32797d("#007 Could not call remote method.", e);
                }
            }
            this.f38566a.mo27552a(0);
            return true;
        }
        if (str.startsWith((String) caf.m37099d().mo30717a(C15740bx.f44347cb))) {
            if (this.f38566a.f38564h != null) {
                try {
                    this.f38566a.f38564h.mo30870a(0);
                } catch (RemoteException e2) {
                    abv.m32797d("#007 Could not call remote method.", e2);
                }
            }
            this.f38566a.mo27552a(0);
            return true;
        }
        if (str.startsWith((String) caf.m37099d().mo30717a(C15740bx.f44348cc))) {
            if (this.f38566a.f38564h != null) {
                try {
                    this.f38566a.f38564h.mo30872c();
                } catch (RemoteException e3) {
                    abv.m32797d("#007 Could not call remote method.", e3);
                }
            }
            this.f38566a.mo27552a(this.f38566a.mo27553c(str));
            return true;
        } else if (str.startsWith("gmsg://")) {
            return true;
        } else {
            if (this.f38566a.f38564h != null) {
                try {
                    this.f38566a.f38564h.mo30871b();
                } catch (RemoteException e4) {
                    abv.m32797d("#007 Could not call remote method.", e4);
                }
            }
            String d = this.f38566a.mo27556d(str);
            C14957ar arVar = this.f38566a;
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(d));
            arVar.f38559c.startActivity(intent);
            return true;
        }
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.f38566a.f38564h != null) {
            try {
                this.f38566a.f38564h.mo30870a(0);
            } catch (RemoteException e) {
                abv.m32797d("#007 Could not call remote method.", e);
            }
        }
    }
}
