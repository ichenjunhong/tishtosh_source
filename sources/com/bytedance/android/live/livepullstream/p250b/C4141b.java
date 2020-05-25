package com.bytedance.android.live.livepullstream.p250b;

import com.bytedance.android.live.livepullstream.p249a.C4134a;
import com.bytedance.android.live.livepullstream.p249a.C4136b;
import com.bytedance.android.live.room.C4181b;
import com.bytedance.android.live.room.C4189h;
import com.bytedance.android.livesdk.p382h.C7656a.C7658a;
import com.bytedance.android.livesdk.player.C8072a.C8073a;
import com.bytedance.android.livesdk.player.C8080d.C8082a;
import com.bytedance.android.livesdk.player.C8091h.C8094a;
import com.bytedance.android.livesdk.player.C8097k;
import com.bytedance.android.livesdk.player.C8097k.C8099a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.live.livepullstream.b.b */
public class C4141b {

    /* renamed from: a */
    private static volatile C4141b f11319a;

    /* renamed from: b */
    private final Map<Class<?>, C4143a<?>> f11320b = new ConcurrentHashMap();

    /* renamed from: com.bytedance.android.live.livepullstream.b.b$a */
    static final class C4143a<T> {

        /* renamed from: a */
        public C4144b<T> f11321a;

        /* renamed from: b */
        public C4145a<T> f11322b;

        /* renamed from: c */
        public Object f11323c;

        private C4143a(C4144b<T> bVar) {
            this.f11321a = bVar;
        }
    }

    /* renamed from: com.bytedance.android.live.livepullstream.b.b$b */
    public interface C4144b<T> {

        /* renamed from: com.bytedance.android.live.livepullstream.b.b$b$a */
        public static final class C4145a<R> {

            /* renamed from: a */
            public R f11324a;

            /* renamed from: b */
            boolean f11325b;

            private C4145a() {
            }

            /* renamed from: a */
            public final C4145a<R> mo9534a() {
                this.f11325b = true;
                return this;
            }

            /* renamed from: a */
            public final C4145a<R> mo9535a(R r) {
                this.f11324a = r;
                return this;
            }
        }

        /* renamed from: a */
        C4145a<T> mo9533a(C4145a<T> aVar);
    }

    /* renamed from: a */
    private static C4141b m10287a() {
        if (f11319a == null) {
            synchronized (C4141b.class) {
                if (f11319a == null) {
                    f11319a = new C4141b();
                }
            }
        }
        return f11319a;
    }

    private C4141b() {
        m10285a(C4189h.class, (C4144b<T>) new C8094a<T>());
        m10285a(C4181b.class, (C4144b<T>) new C7658a<T>());
        m10285a(C8097k.class, (C4144b<T>) new C8099a<T>());
        m10285a(C4136b.class, (C4144b<T>) new C8082a<T>());
        m10285a(C4134a.class, (C4144b<T>) new C8073a<T>());
    }

    /* renamed from: a */
    public static <T> T m10288a(Class<T> cls) {
        return m10287a().m10289a(cls, true);
    }

    /* renamed from: a */
    private <T> C4143a<T> m10285a(Class<T> cls, C4144b<T> bVar) {
        C4143a<T> aVar = new C4143a<>(bVar);
        this.f11320b.put(cls, aVar);
        return aVar;
    }

    /* renamed from: a */
    static final /* synthetic */ C4145a m10286a(Class cls, C4145a aVar) {
        try {
            return aVar.mo9535a(cls.newInstance());
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

    /* renamed from: a */
    private <T> T m10289a(Class<T> cls, boolean z) {
        C4143a aVar = (C4143a) this.f11320b.get(cls);
        if (aVar == null) {
            C4143a aVar2 = new C4143a(new C4146c(cls));
            aVar2.f11322b = aVar2.f11321a.mo9533a(new C4145a());
            aVar2.f11323c = aVar2.f11321a.mo9533a(aVar2.f11322b).f11324a;
            this.f11320b.put(cls, aVar2);
            aVar = aVar2;
        }
        if (aVar.f11322b == null || !aVar.f11322b.f11325b) {
            aVar.f11322b = aVar.f11321a.mo9533a(new C4145a());
        }
        if (aVar.f11322b.f11325b) {
            if (aVar.f11323c == null) {
                synchronized (C4141b.class) {
                    if (aVar.f11323c == null) {
                        aVar.f11323c = aVar.f11322b.f11324a;
                    }
                }
            }
            return aVar.f11323c;
        }
        Object obj = aVar.f11322b.f11324a;
        aVar.f11322b = null;
        return obj;
    }
}
