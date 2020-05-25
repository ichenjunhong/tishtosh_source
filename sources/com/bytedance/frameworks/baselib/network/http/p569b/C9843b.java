package com.bytedance.frameworks.baselib.network.http.p569b;

import java.net.URI;

/* renamed from: com.bytedance.frameworks.baselib.network.http.b.b */
public interface C9843b {

    /* renamed from: a */
    public static final C9843b f26792a = new C9843b() {
        /* renamed from: a */
        public final boolean mo17681a(URI uri, C9849e eVar) {
            return true;
        }
    };

    /* renamed from: b */
    public static final C9843b f26793b = new C9843b() {
        /* renamed from: a */
        public final boolean mo17681a(URI uri, C9849e eVar) {
            return false;
        }
    };

    /* renamed from: c */
    public static final C9843b f26794c = new C9843b() {
        /* renamed from: a */
        public final boolean mo17681a(URI uri, C9849e eVar) {
            return C9849e.m19690a(eVar.f26804d, uri.getHost());
        }
    };

    /* renamed from: a */
    boolean mo17681a(URI uri, C9849e eVar);
}
