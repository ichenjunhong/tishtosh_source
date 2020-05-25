package com.p2620vk.sdk.dialogs;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.C2240a;
import com.example.p906a.C13482c;
import com.p2620vk.sdk.VKServiceActivity;
import com.p2620vk.sdk.api.C52351b;
import com.p2620vk.sdk.p2621a.C52325c;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.ss.android.ugc.trill.R;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.vk.sdk.dialogs.b */
public final class C52430b implements OnDismissListener {

    /* renamed from: a */
    protected C52351b f130778a;

    /* renamed from: b */
    protected WebView f130779b;

    /* renamed from: c */
    protected View f130780c;

    /* renamed from: d */
    protected View f130781d;

    /* renamed from: e */
    protected Bundle f130782e;

    /* renamed from: f */
    protected Intent f130783f;

    /* renamed from: g */
    public int f130784g = -1;

    /* renamed from: h */
    protected int f130785h;

    /* renamed from: i */
    protected Dialog f130786i;

    /* renamed from: com.vk.sdk.dialogs.b$a */
    static class C52432a extends WebViewClient {

        /* renamed from: a */
        boolean f130789a = true;

        /* renamed from: b */
        final C52430b f130790b;

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return C13482c.m27234a(webView, renderProcessGoneDetail);
        }

        public C52432a(C52430b bVar) {
            this.f130790b = bVar;
        }

        /* renamed from: a */
        private boolean m111986a(String str) {
            if (!str.startsWith("https://oauth.vk.com/blank.html")) {
                return false;
            }
            Intent intent = new Intent("com.vk.auth-token");
            String substring = str.substring(str.indexOf(35) + 1);
            intent.putExtra("extra-token-data", substring);
            Map a = C52325c.m111793a(substring);
            if (this.f130790b.f130778a != null) {
                intent.putExtra("extra-validation-request", this.f130790b.f130778a.f130349e.mo109409a());
            }
            if (a == null || (!a.containsKey("error") && !a.containsKey("cancel"))) {
                this.f130790b.mo109422a(-1, intent);
            } else {
                this.f130790b.mo109422a(0, intent);
            }
            this.f130790b.mo109424b();
            return true;
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (m111986a(str)) {
                return true;
            }
            this.f130789a = true;
            return false;
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (this.f130789a) {
                if (this.f130790b.f130780c != null) {
                    this.f130790b.f130780c.setVisibility(8);
                }
                webView.setVisibility(0);
            }
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            m111986a(str);
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            this.f130789a = false;
            try {
                new Builder(webView.getContext()).setMessage(str).setPositiveButton(R.string.fcz, new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C52432a.this.f130790b.mo109421a();
                    }
                }).setNegativeButton(17039360, new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C52432a.this.f130790b.mo109424b();
                    }
                }).show();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo109424b() {
        if (this.f130786i != null) {
            C52435c.m111987a(this.f130786i);
        }
    }

    /* renamed from: a */
    public final void mo109421a() {
        String str;
        try {
            if (this.f130778a == null) {
                str = null;
            } else {
                str = this.f130778a.f130356l;
            }
            if (str == null) {
                int i = this.f130782e.getInt("client_id", 0);
                str = C2240a.m6773a(Locale.US, "https://oauth.vk.com/authorize?client_id=%s&scope=%s&redirect_uri=%s&display=mobile&v=%s&response_type=token&revoke=%d", new Object[]{Integer.valueOf(i), this.f130782e.getString("scope"), "https://oauth.vk.com/blank.html", this.f130782e.getString(C42311c.f106863g), Integer.valueOf(this.f130782e.getBoolean("revoke", false) ? 1 : 0)});
            }
            this.f130779b.setWebViewClient(C13482c.m27232a(new C52432a(this)));
            this.f130779b.getSettings().setJavaScriptEnabled(true);
            C52435c.m111988a(this.f130779b, str);
            this.f130779b.setBackgroundColor(0);
            if (VERSION.SDK_INT >= 11) {
                this.f130779b.setLayerType(1, null);
            }
            this.f130779b.setVerticalScrollBarEnabled(false);
            this.f130779b.setVisibility(4);
            this.f130779b.setOverScrollMode(2);
            this.f130780c.setVisibility(0);
        } catch (Exception unused) {
            this.f130784g = 0;
            mo109424b();
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Activity activity;
        if (this.f130781d == null) {
            activity = null;
        } else {
            activity = (Activity) this.f130781d.getContext();
        }
        if (activity instanceof VKServiceActivity) {
            ((VKServiceActivity) activity).mo109129a(this.f130785h, this.f130784g, this.f130783f);
        }
    }

    /* renamed from: a */
    public final void mo109422a(int i, Intent intent) {
        this.f130784g = i;
        this.f130783f = intent;
    }

    /* renamed from: a */
    public final void mo109423a(Activity activity, Bundle bundle, int i, C52351b bVar) {
        this.f130778a = bVar;
        this.f130782e = bundle;
        this.f130785h = i;
        this.f130781d = View.inflate(activity, R.layout.awl, null);
        this.f130780c = this.f130781d.findViewById(R.id.c62);
        this.f130779b = (WebView) this.f130781d.findViewById(R.id.a0i);
        final Dialog dialog = new Dialog(activity, R.style.ot);
        dialog.setContentView(this.f130781d);
        dialog.setOnCancelListener(new OnCancelListener() {
            public final void onCancel(DialogInterface dialogInterface) {
                dialog.dismiss();
            }
        });
        dialog.setOnDismissListener(this);
        if (VERSION.SDK_INT >= 21) {
            dialog.getWindow().setStatusBarColor(0);
        }
        this.f130786i = dialog;
        this.f130786i.show();
        mo109421a();
    }
}
