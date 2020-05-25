package com.bytedance.ttnet.hostmonitor;

import com.bytedance.common.utility.C9415i;

/* renamed from: com.bytedance.ttnet.hostmonitor.f */
public final class C13351f {

    /* renamed from: a */
    C13353a f34835a;

    /* renamed from: b */
    private C13354b f34836b;

    /* renamed from: com.bytedance.ttnet.hostmonitor.f$a */
    public enum C13353a {
        DEBUG,
        INFO,
        ERROR,
        OFF
    }

    /* renamed from: com.bytedance.ttnet.hostmonitor.f$b */
    public interface C13354b {
    }

    /* renamed from: com.bytedance.ttnet.hostmonitor.f$c */
    static class C13355c {

        /* renamed from: a */
        public static final C13351f f34838a = new C13351f();
    }

    private C13351f() {
        C13353a aVar;
        if (C9415i.m18635b()) {
            aVar = C13353a.DEBUG;
        } else {
            aVar = C13353a.OFF;
        }
        this.f34835a = aVar;
        this.f34836b = new C13347b();
    }

    /* renamed from: a */
    public static void m26925a(String str, String str2) {
        C13355c.f34838a.f34835a.compareTo(C13353a.ERROR);
    }

    /* renamed from: b */
    public static void m26926b(String str, String str2) {
        C13355c.f34838a.f34835a.compareTo(C13353a.DEBUG);
    }
}
