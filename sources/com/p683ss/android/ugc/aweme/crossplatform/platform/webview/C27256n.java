package com.p683ss.android.ugc.aweme.crossplatform.platform.webview;

import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.n */
public final class C27256n {

    /* renamed from: b */
    public static final C27256n f71916b = new C27256n();

    /* renamed from: c */
    public static final C27257a f71917c = new C27257a(null);

    /* renamed from: d */
    private static final CopyOnWriteArrayList<String> f71918d = new CopyOnWriteArrayList<>();

    /* renamed from: e */
    private static final CopyOnWriteArrayList<String> f71919e = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public C52687r<? super WebView, ? super String, ? super Map<String, String>, ? super C52682m<? super String, ? super Map<String, String>, C52860x>, C52860x> f71920a;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.n$a */
    public static final class C27257a {
        private C27257a() {
        }

        /* renamed from: a */
        public static C27256n m65702a() {
            return C27256n.f71916b;
        }

        public /* synthetic */ C27257a(C52707g gVar) {
            this();
        }
    }

    private C27256n() {
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            List ttnetInterceptWebviewBlackList = b.getTtnetInterceptWebviewBlackList();
            IESSettingsProxy b2 = C32816h.m75716b();
            C52711k.m112236a((Object) b2, "SettingsReader.get()");
            List ttnetInterceptWebviewWhiteList = b2.getTtnetInterceptWebviewWhiteList();
            if (!C23715d.m58202a((Collection<T>) ttnetInterceptWebviewWhiteList)) {
                C52711k.m112236a((Object) ttnetInterceptWebviewWhiteList, "whiteList");
                if (!C23715d.m58202a((Collection<T>) ttnetInterceptWebviewWhiteList)) {
                    f71918d.addAll(ttnetInterceptWebviewWhiteList);
                }
            }
            if (!C23715d.m58202a((Collection<T>) ttnetInterceptWebviewBlackList)) {
                C52711k.m112236a((Object) ttnetInterceptWebviewBlackList, "blackList");
                if (!C23715d.m58202a((Collection<T>) ttnetInterceptWebviewBlackList)) {
                    f71919e.addAll(ttnetInterceptWebviewBlackList);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static boolean m65699a(String str) {
        C52711k.m112240b(str, "ref");
        CharSequence charSequence = str;
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        if (C52830p.m112456b(charSequence, (CharSequence) WebKitApi.SCHEME_HTTPS, false, 2, (Object) null) || C52830p.m112456b(charSequence, (CharSequence) WebKitApi.SCHEME_HTTP, false, 2, (Object) null)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    static boolean m65700b(String str) {
        if (!C23715d.m58202a((Collection<T>) f71918d)) {
            Iterator it = f71918d.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                CharSequence charSequence = str;
                C52711k.m112236a((Object) str2, "host");
                if (C52830p.m112456b(charSequence, (CharSequence) str2, false, 2, (Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    static boolean m65701c(String str) {
        if (!C23715d.m58202a((Collection<T>) f71919e)) {
            Iterator it = f71919e.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                CharSequence charSequence = str;
                C52711k.m112236a((Object) str2, "host");
                if (C52830p.m112456b(charSequence, (CharSequence) str2, false, 2, (Object) null)) {
                    return false;
                }
            }
        }
        return true;
    }
}
