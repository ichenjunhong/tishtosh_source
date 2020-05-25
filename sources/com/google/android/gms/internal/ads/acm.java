package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.C14963ax;
import java.io.InputStream;
import java.util.Map;

@C16299uq
public class acm {
    /* renamed from: a */
    public int mo28683a() {
        return 5;
    }

    /* renamed from: a */
    public String mo28687a(Context context) {
        return "";
    }

    /* renamed from: a */
    public void mo28688a(Activity activity) {
    }

    /* renamed from: a */
    public boolean mo28691a(Activity activity, Configuration configuration) {
        return false;
    }

    /* renamed from: a */
    public boolean mo28693a(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    /* renamed from: b */
    public void mo28695b(Context context) {
    }

    /* renamed from: d */
    public int mo28697d() {
        return 1;
    }

    /* renamed from: a */
    public boolean mo28692a(Context context, WebSettings webSettings) {
        return ((Boolean) aek.m32731a(context, new acn(context, webSettings))).booleanValue();
    }

    /* renamed from: a */
    public static boolean m32635a(ama ama) {
        if (ama == null) {
            return false;
        }
        ama.onPause();
        return true;
    }

    /* renamed from: b */
    public static boolean m32636b(ama ama) {
        if (ama == null) {
            return false;
        }
        ama.onResume();
        return true;
    }

    /* renamed from: a */
    public amb mo28686a(ama ama, byc byc, boolean z) {
        return new ana(ama, byc, z);
    }

    /* renamed from: a */
    public void mo28690a(ViewTreeObserver viewTreeObserver, OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
    }

    /* renamed from: b */
    public LayoutParams mo28694b() {
        return new LayoutParams(-2, -2);
    }

    /* renamed from: a */
    public void mo28689a(View view, Drawable drawable) {
        view.setBackgroundDrawable(drawable);
    }

    /* renamed from: a */
    public Drawable mo28684a(Context context, Bitmap bitmap, boolean z, float f) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    /* renamed from: c */
    public static boolean m32637c() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    /* renamed from: c */
    public CookieManager mo28696c(Context context) {
        if (m32637c()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            abv.m32793b("Failed to obtain CookieManager.", th);
            C14963ax.m30834d().mo28588a(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    /* renamed from: a */
    public WebResourceResponse mo28685a(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    public acm() {
    }
}
