package com.bytedance.android.live.broadcast.p211f;

import com.bytedance.android.live.broadcast.api.p195b.C3040c;
import com.bytedance.android.live.broadcast.effect.C3203b;
import com.bytedance.android.live.broadcast.effect.C3254h.C3255a;
import com.bytedance.android.live.broadcast.effect.p207c.C3237a.C3239a;
import com.bytedance.android.live.broadcast.p193a.C3025a;
import com.bytedance.android.live.broadcast.p193a.C3026b.C3028b;
import com.bytedance.android.live.broadcast.p211f.C3383a.C3385a;
import com.bytedance.android.live.broadcast.preview.C3493a.C3494a;
import com.bytedance.android.live.broadcast.preview.C3537b;
import com.bytedance.android.live.broadcast.utils.C3634d;
import com.bytedance.android.live.broadcast.utils.C3634d.C3635a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.live.broadcast.f.d */
public class C3388d {

    /* renamed from: a */
    private static volatile C3388d f9687a;

    /* renamed from: b */
    private final Map<Class<?>, C3390a<?>> f9688b = new ConcurrentHashMap();

    /* renamed from: com.bytedance.android.live.broadcast.f.d$a */
    static final class C3390a<T> {

        /* renamed from: a */
        public C3391b<T> f9689a;

        /* renamed from: b */
        public C3392a<T> f9690b;

        /* renamed from: c */
        public Object f9691c;

        private C3390a(C3391b<T> bVar) {
            this.f9689a = bVar;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.f.d$b */
    public interface C3391b<T> {

        /* renamed from: com.bytedance.android.live.broadcast.f.d$b$a */
        public static final class C3392a<R> {

            /* renamed from: a */
            public R f9692a;

            /* renamed from: b */
            boolean f9693b;

            private C3392a() {
            }

            /* renamed from: a */
            public final C3392a<R> mo8747a() {
                this.f9693b = true;
                return this;
            }

            /* renamed from: a */
            public final C3392a<R> mo8748a(R r) {
                this.f9692a = r;
                return this;
            }
        }

        /* renamed from: a */
        C3392a<T> mo8221a(C3392a<T> aVar);
    }

    /* renamed from: com.bytedance.android.live.broadcast.f.d$c */
    public static final class C3393c {

        /* renamed from: a */
        C3388d f9694a;

        private C3393c(C3388d dVar) {
            this.f9694a = dVar;
        }
    }

    /* renamed from: a */
    static C3388d m9147a() {
        if (f9687a == null) {
            synchronized (C3388d.class) {
                if (f9687a == null) {
                    f9687a = new C3388d();
                }
            }
        }
        return f9687a;
    }

    private C3388d() {
        mo8745a(C3040c.class, (C3391b<T>) new C3239a<T>());
        mo8745a(C3203b.class, (C3391b<T>) new C3255a<T>());
        mo8745a(C3386b.class, (C3391b<T>) new C3385a<T>());
        mo8745a(C3634d.class, (C3391b<T>) new C3635a<T>());
        mo8745a(C3025a.class, (C3391b<T>) new C3028b<T>());
        C3383a aVar = (C3383a) m9149b(C3386b.class);
        aVar.f9686a = new C3393c();
        C3494a aVar2 = new C3494a();
        aVar.f9686a.f9694a.mo8745a(C3537b.class, (C3391b<T>) aVar2);
    }

    /* renamed from: b */
    private <T> T m9149b(Class<T> cls) {
        return mo8746a(cls, true);
    }

    /* renamed from: a */
    public static <T> T m9148a(Class<T> cls) {
        return m9147a().m9149b(cls);
    }

    /* renamed from: a */
    public final <T> C3390a<T> mo8745a(Class<T> cls, C3391b<T> bVar) {
        C3390a<T> aVar = new C3390a<>(bVar);
        this.f9688b.put(cls, aVar);
        return aVar;
    }

    /* renamed from: a */
    static final /* synthetic */ C3392a m9146a(Class cls, C3392a aVar) {
        try {
            return aVar.mo8748a(cls.newInstance());
        } catch (IllegalAccessException unused) {
            StringBuilder sb = new StringBuilder("Requested class isn't registered in LiveImplProvider and its nullary constructor isn't accessible: ");
            sb.append(cls.getName());
            sb.append(".\n Forgot to register in LiveImplProvider or FlavorImplProvider?");
            throw new RuntimeException(sb.toString());
        } catch (InstantiationException unused2) {
            StringBuilder sb2 = new StringBuilder("Requested class isn't registered in LiveImplProvider and doesn't have public non-param constructor: ");
            sb2.append(cls.getName());
            sb2.append(".\n Forgot to register in LiveImplProvider or FlavorImplProvider?");
            throw new RuntimeException(sb2.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <T> T mo8746a(Class<T> cls, boolean z) {
        C3390a aVar = (C3390a) this.f9688b.get(cls);
        if (aVar == null) {
            if (!z) {
                return null;
            }
            aVar = new C3390a(new C3394e(cls));
            aVar.f9690b = aVar.f9689a.mo8221a(new C3392a());
            aVar.f9691c = aVar.f9689a.mo8221a(aVar.f9690b).f9692a;
            this.f9688b.put(cls, aVar);
        }
        if (aVar.f9690b == null || !aVar.f9690b.f9693b) {
            aVar.f9690b = aVar.f9689a.mo8221a(new C3392a());
        }
        if (aVar.f9690b.f9693b) {
            if (aVar.f9691c == null) {
                synchronized (C3388d.class) {
                    if (aVar.f9691c == null) {
                        aVar.f9691c = aVar.f9690b.f9692a;
                    }
                }
            }
            return aVar.f9691c;
        }
        Object obj = aVar.f9690b.f9692a;
        aVar.f9690b = null;
        return obj;
    }
}
