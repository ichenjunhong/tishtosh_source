package com.bytedance.ttnet;

import android.content.Context;
import com.bytedance.frameworks.baselib.network.http.C9858c;
import com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c;
import com.bytedance.frameworks.baselib.network.http.p570c.p571a.C9859a;
import com.bytedance.frameworks.baselib.network.http.p570c.p571a.C9865e;
import com.bytedance.frameworks.baselib.network.http.p574e.C9912g;
import com.bytedance.retrofit2.p830a.C12686c;
import com.bytedance.retrofit2.p830a.C12689e;
import com.bytedance.ttnet.p886d.C13314c;
import com.bytedance.ttnet.p887e.C13337i;
import java.io.IOException;

/* renamed from: com.bytedance.ttnet.b */
public final class C13281b {

    /* renamed from: a */
    public static final C13285c f34660a = new C13285c();

    /* renamed from: b */
    public static final C13283a f34661b = new C13283a();

    /* renamed from: c */
    static boolean f34662c;

    /* renamed from: d */
    static String f34663d;

    /* renamed from: e */
    private static volatile C13284b f34664e;

    /* renamed from: com.bytedance.ttnet.b$a */
    public static class C13283a extends C13285c {
        private C13283a() {
            super();
        }

        /* renamed from: a */
        public final C9858c mo24891a() {
            return C13286d.m26762a(C9874c.m19754a(C13303d.m26799b().mo24896a()));
        }
    }

    /* renamed from: com.bytedance.ttnet.b$b */
    public interface C13284b {
        /* renamed from: h */
        boolean mo24856h();
    }

    /* renamed from: com.bytedance.ttnet.b$c */
    public static class C13285c {
        private C13285c() {
        }

        /* renamed from: a */
        public C9858c mo24891a() {
            Context a = C13303d.m26799b().mo24896a();
            C9865e a2 = C9865e.m19730a(a);
            if (C9912g.m19864a(a)) {
                C9865e.m19739a((C9859a) C13314c.m26812a());
            }
            return a2;
        }
    }

    /* renamed from: com.bytedance.ttnet.b$d */
    static class C13286d implements C9858c {

        /* renamed from: a */
        private static volatile C13286d f34665a;

        /* renamed from: b */
        private C9874c f34666b;

        private C13286d(C9874c cVar) {
            this.f34666b = cVar;
        }

        /* renamed from: a */
        public static C13286d m26762a(C9874c cVar) {
            if (f34665a == null) {
                synchronized (C13286d.class) {
                    if (f34665a == null) {
                        f34665a = new C13286d(cVar);
                    }
                }
            }
            return f34665a;
        }

        /* renamed from: a */
        public final C12689e mo9561a(C12686c cVar) throws IOException {
            try {
                return this.f34666b.mo9561a(cVar);
            } catch (Throwable th) {
                C13281b.f34662c = true;
                C13281b.f34663d = C13337i.m26872a(th);
                C13303d.m26801c();
                return C13281b.f34660a.mo24891a().mo9561a(cVar);
            }
        }
    }

    /* renamed from: a */
    public static boolean m26758a() {
        if (f34664e == null) {
            C9865e.m19737a(0);
            return false;
        } else if (!f34664e.mo24856h()) {
            return false;
        } else {
            C13303d.m26799b();
            if (!f34662c) {
                return true;
            }
            C9865e.m19737a(7);
            return false;
        }
    }

    /* renamed from: a */
    public static void m26757a(C13284b bVar) {
        f34664e = bVar;
    }
}
