package com.facebook.net;

import com.bytedance.common.utility.C9431p;
import com.bytedance.retrofit2.C12792q;
import com.bytedance.retrofit2.p833c.C12727a;
import com.bytedance.ttnet.p887e.C13333g;
import com.p683ss.p2544b.p2545a.C51151a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.facebook.net.h */
public class C14557h {

    /* renamed from: d */
    private static volatile C14557h f37822d;

    /* renamed from: a */
    public volatile ArrayList<Integer> f37823a;

    /* renamed from: b */
    public volatile ArrayList<Integer> f37824b;

    /* renamed from: c */
    public volatile int f37825c;

    /* renamed from: e */
    private final int f37826e = 1;

    /* renamed from: f */
    private final int f37827f = 2;

    /* renamed from: g */
    private volatile boolean f37828g;

    /* renamed from: h */
    private volatile HashMap<String, C12792q> f37829h;

    /* renamed from: i */
    private volatile List<C12727a> f37830i;

    /* renamed from: com.facebook.net.h$a */
    public static class C14558a extends Exception {

        /* renamed from: e */
        public final Exception f37831e;
        public final int retryCount;

        public C14558a(Exception exc, int i) {
            this.f37831e = exc;
            this.retryCount = i;
        }
    }

    /* renamed from: b */
    public final synchronized boolean mo26794b() {
        return this.f37828g;
    }

    private C14557h() {
    }

    /* renamed from: a */
    public static C14557h m29810a() {
        if (f37822d == null) {
            synchronized (C14557h.class) {
                if (f37822d == null) {
                    f37822d = new C14557h();
                }
            }
        }
        return f37822d;
    }

    /* renamed from: a */
    public final <S> S mo26793a(String str, Class<S> cls) {
        List list;
        if (!mo26794b()) {
            C51151a.m110022d("RetryInterceptManager", "[getRetrofitService] is closed");
            return null;
        } else if (C9431p.m18664a(str)) {
            return null;
        } else {
            C12792q qVar = (C12792q) this.f37829h.get(str);
            if (qVar == null) {
                if (mo26794b()) {
                    list = this.f37830i;
                } else {
                    list = null;
                }
                qVar = C13333g.m26858a(str, list, null, null);
            }
            return C13333g.m26860a(qVar, cls);
        }
    }
}
