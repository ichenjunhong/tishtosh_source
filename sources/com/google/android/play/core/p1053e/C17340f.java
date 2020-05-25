package com.google.android.play.core.p1053e;

import com.C2240a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.play.core.e.f */
public final class C17340f {

    /* renamed from: a */
    public final List<String> f48846a;

    /* renamed from: b */
    public final List<Locale> f48847b;

    /* renamed from: com.google.android.play.core.e.f$a */
    public static class C17341a {

        /* renamed from: a */
        final List<String> f48848a;

        /* renamed from: b */
        public final List<Locale> f48849b;

        private C17341a() {
            this.f48848a = new ArrayList();
            this.f48849b = new ArrayList();
        }

        /* synthetic */ C17341a(byte b) {
            this();
        }

        /* renamed from: a */
        public final C17341a mo33631a(String str) {
            this.f48848a.add(str);
            return this;
        }

        /* renamed from: a */
        public final C17340f mo33632a() {
            return new C17340f(this, 0);
        }
    }

    /* synthetic */ C17340f(C17341a aVar, byte b) {
        this(aVar);
    }

    /* renamed from: a */
    public static C17341a m42459a() {
        return new C17341a(0);
    }

    public final String toString() {
        return C2240a.m6772a("SplitInstallRequest{modulesNames=%s,languages=%s}", new Object[]{this.f48846a, this.f48847b});
    }

    private C17340f(C17341a aVar) {
        this.f48846a = new ArrayList(aVar.f48848a);
        this.f48847b = new ArrayList(aVar.f48849b);
    }
}
