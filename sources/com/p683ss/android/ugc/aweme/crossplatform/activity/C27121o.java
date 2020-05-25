package com.p683ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.crossplatform.activity.WebViewPoolExperiment.C27104a;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.WebViewCacheExperiment2;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.o */
public class C27121o {

    /* renamed from: h */
    private static C27121o f71549h;

    /* renamed from: a */
    List<SingleWebView> f71550a = new ArrayList();

    /* renamed from: b */
    int f71551b = 2;

    /* renamed from: c */
    final Object f71552c = new Object();

    /* renamed from: d */
    List<String> f71553d = C27104a.m65413a();

    /* renamed from: e */
    List<String> f71554e;

    /* renamed from: f */
    private List<SoftReference<SingleWebView>> f71555f = new ArrayList();

    /* renamed from: g */
    private List<SingleWebView> f71556g = new ArrayList();

    /* renamed from: a */
    public static C27121o m65429a() {
        if (f71549h == null) {
            synchronized (C27121o.class) {
                if (f71549h == null) {
                    f71549h = new C27121o();
                }
            }
        }
        return f71549h;
    }

    /* renamed from: c */
    static boolean m65430c() {
        return C10181b.m20511a().mo18172a(WebViewCacheExperiment2.class, true, "enable_webview_cache", 31744, false);
    }

    private C27121o() {
        try {
            this.f71554e = C32816h.m75716b().getWebviewCachePoolSwitch();
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo55436b() {
        if (VERSION.SDK_INT < 23) {
            return true;
        }
        if (!C23715d.m58202a((Collection<T>) this.f71553d) || !C23715d.m58202a((Collection<T>) this.f71554e) || m65430c()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ boolean mo55437d() {
        SystemClock.uptimeMillis();
        synchronized (this.f71552c) {
            for (int i = 0; i < this.f71551b - this.f71550a.size(); i++) {
                this.f71550a.add(new SingleWebView(new MutableContextWrapper(C11010c.m22280a())));
            }
        }
        SystemClock.uptimeMillis();
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ boolean mo55438e() {
        SystemClock.uptimeMillis();
        synchronized (this.f71552c) {
            for (int i = 0; i < this.f71551b - this.f71550a.size(); i++) {
                this.f71550a.add(new SingleWebView(new MutableContextWrapper(C11010c.m22280a())));
            }
        }
        SystemClock.uptimeMillis();
        return false;
    }

    /* renamed from: a */
    public final SingleWebView mo55434a(Activity activity) {
        SingleWebView singleWebView = null;
        if (mo55436b()) {
            return null;
        }
        synchronized (this.f71552c) {
            if (this.f71550a.size() > 0) {
                singleWebView = (SingleWebView) this.f71550a.get(0);
                this.f71550a.remove(0);
                if (singleWebView != null) {
                    Context context = singleWebView.getContext();
                    if (context instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context).setBaseContext(activity);
                    }
                    singleWebView.initWeb(activity);
                }
            }
        }
        return singleWebView;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo55435a(String str) {
        if (VERSION.SDK_INT < 23) {
            return true;
        }
        if (str.contains("need_webview_pool=1") || !C23715d.m58202a((Collection<T>) this.f71553d) || !C23715d.m58202a((Collection<T>) this.f71554e) || m65430c()) {
            return false;
        }
        return true;
    }
}
