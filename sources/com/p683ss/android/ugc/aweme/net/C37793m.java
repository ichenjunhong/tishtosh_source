package com.p683ss.android.ugc.aweme.net;

import com.bytedance.ttnet.C13303d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.network.observer.bean.C50095d;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.net.m */
public final class C37793m {

    /* renamed from: a */
    static final String[] f96255a = {"https://www.google.com/images/nav_logo.webp", "https://www.facebook.com/images/fb_icon_325x325.png"};

    /* renamed from: b */
    public static volatile boolean f96256b;

    /* renamed from: c */
    static boolean f96257c;

    /* renamed from: d */
    static long f96258d;

    /* renamed from: e */
    public static final C37793m f96259e = new C37793m();

    /* renamed from: f */
    private static final String[] f96260f = {"https://www.baidu.com", "https://www.taobao.com/favicon.ico"};

    /* renamed from: com.ss.android.ugc.aweme.net.m$a */
    public static final class C37794a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ int f96261a;

        public C37794a(int i) {
            this.f96261a = i;
        }

        public final /* synthetic */ Object call() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("detect_source", this.f96261a);
            jSONObject.put("detect_status", 1);
            jSONObject.put("detect_cost", 0);
            jSONObject.put(C50095d.f125472b, 0);
            C26890h.m65014b("network_detect_result", jSONObject);
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.net.m$b */
    static final class C37795b<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C37795b f96262a = new C37795b();

        C37795b() {
        }

        public final /* synthetic */ Object call() {
            C37793m mVar = C37793m.f96259e;
            return Boolean.valueOf(C13303d.m26798a(C37793m.f96255a, 10, 1));
        }
    }

    private C37793m() {
    }

    /* renamed from: a */
    public static void m84397a() {
        if (!f96257c && !f96256b) {
            f96257c = true;
            f96258d = System.currentTimeMillis();
            C0013i.m16a((Callable<TResult>) C37795b.f96262a);
        }
    }
}
