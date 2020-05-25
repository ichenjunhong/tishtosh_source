package com.p683ss.sys.p2584ck;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager.LayoutParams;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.p683ss.sys.p2584ck.C51438b.C51441a;
import com.p683ss.sys.p2584ck.p2585a.C51430e.C51431a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.sys.ck.e */
public final class C51444e extends Dialog {

    /* renamed from: a */
    protected SCWebView f128634a;

    /* renamed from: b */
    C51441a f128635b;

    /* renamed from: c */
    private Activity f128636c;

    /* renamed from: d */
    private int f128637d;

    /* renamed from: e */
    private int f128638e;

    /* renamed from: f */
    private String f128639f;

    /* renamed from: g */
    private boolean f128640g;

    /* renamed from: h */
    private String f128641h;

    public C51444e(Activity activity, int i, int i2, View view, int i3, String str, String str2) {
        super(activity, R.style.gz);
        setContentView(view);
        this.f128636c = activity;
        this.f128639f = str;
        this.f128641h = str2;
        setCancelable(true);
    }

    public final void hide() {
        this.f128640g = false;
        super.hide();
    }

    public final void show() {
        super.show();
        this.f128640g = true;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DisplayMetrics displayMetrics = this.f128636c.getResources().getDisplayMetrics();
        this.f128637d = displayMetrics.heightPixels;
        this.f128638e = displayMetrics.widthPixels;
        float f = displayMetrics.density;
        if (this.f128637d < this.f128638e) {
            this.f128638e = (this.f128637d * 3) / 4;
        }
        this.f128638e = (this.f128638e * 4) / 5;
        this.f128637d = (int) (((float) this.f128638e) * this.f128635b.f128628b);
        if (((int) ((((float) this.f128638e) / f) + 0.5f)) < this.f128635b.f128629c) {
            this.f128638e = (int) (((float) this.f128635b.f128629c) * f);
            this.f128637d = (int) (displayMetrics.density * ((float) this.f128635b.f128629c) * this.f128635b.f128628b);
        }
        LayoutParams attributes = getWindow().getAttributes();
        attributes.width = this.f128638e;
        attributes.height = this.f128637d;
        if (C51438b.f128621c >= 0.0f) {
            attributes.dimAmount = C51438b.f128621c;
        }
        attributes.gravity = 17;
        getWindow().setAttributes(attributes);
        this.f128634a = (SCWebView) findViewById(R.id.cjy);
        this.f128634a.mo102154a();
        SCWebView sCWebView = this.f128634a;
        String str = this.f128639f;
        String str2 = this.f128641h;
        CookieSyncManager.createInstance(sCWebView.f128571a);
        CookieManager instance = CookieManager.getInstance();
        StringBuilder sb = new StringBuilder("sec_sessionid=");
        sb.append(str2);
        instance.setCookie(str, sb.toString());
        CookieSyncManager.getInstance().sync();
        this.f128634a.loadUrl(this.f128639f);
        this.f128634a.buildLayer();
    }

    public final void dismiss() {
        this.f128640g = false;
        if (this.f128634a != null) {
            ViewParent parent = this.f128634a.getParent();
            if (parent != null) {
                new C51431a(this.f128634a.getActionList().toString()).start();
                SCWebView sCWebView = this.f128634a;
                StringBuilder sb = new StringBuilder("javascript:prompt('");
                sb.append(C51438b.f128619a);
                sb.append("',points.getLogToString())");
                sCWebView.loadUrl(sb.toString());
                ((ViewGroup) parent).removeView(this.f128634a);
            }
            this.f128634a.removeAllViews();
        }
        if (this.f128636c != null && !this.f128636c.isFinishing()) {
            super.dismiss();
        }
        this.f128636c = null;
    }
}
