package com.p683ss.android.ugc.aweme.feed.netdetector.fetchfeed;

import android.os.Handler;
import android.os.Message;
import com.p683ss.android.ugc.aweme.feed.netdetector.C30550b;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.g */
public final class C30569g {

    /* renamed from: a */
    public static AtomicBoolean f79851a = new AtomicBoolean(false);

    /* renamed from: b */
    public static AtomicBoolean f79852b = new AtomicBoolean(true);

    /* renamed from: c */
    public static AtomicBoolean f79853c = new AtomicBoolean(true);

    /* renamed from: d */
    public static C30571a f79854d;

    /* renamed from: e */
    public static Object f79855e = new Object();

    /* renamed from: f */
    private static AtomicBoolean f79856f = new AtomicBoolean(false);

    /* renamed from: g */
    private static AtomicBoolean f79857g = new AtomicBoolean(false);

    /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.g$a */
    public static class C30571a extends Handler {

        /* renamed from: a */
        public Handler f79858a;

        private C30571a(Handler handler) {
            this.f79858a = handler;
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            C30569g.f79854d = null;
            this.f79858a.handleMessage(message);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.g$b */
    static class C30572b extends RuntimeException {
        C30572b(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    public static Boolean m71557a() {
        if (!C30550b.m71531b()) {
            return Boolean.valueOf(true);
        }
        return Boolean.valueOf(f79851a.get());
    }

    /* renamed from: b */
    public static Boolean m71559b() {
        if (!C30550b.m71531b()) {
            return Boolean.valueOf(false);
        }
        if (f79856f.get()) {
            return Boolean.valueOf(f79852b.get());
        }
        if (f79857g.get()) {
            return Boolean.valueOf(f79853c.get());
        }
        return Boolean.valueOf(false);
    }

    /* renamed from: a */
    public static void m71558a(Boolean bool) {
        f79856f.set(bool.booleanValue());
    }

    /* renamed from: b */
    public static void m71560b(Boolean bool) {
        f79857g.set(bool.booleanValue());
    }
}
