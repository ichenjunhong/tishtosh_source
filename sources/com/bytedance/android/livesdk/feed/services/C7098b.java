package com.bytedance.android.livesdk.feed.services;

import com.bytedance.android.livesdk.feed.C6957i;
import com.bytedance.android.livesdk.feed.network.GsonProvider;
import com.bytedance.android.livesdk.feed.p339g.C6951a;
import com.google.gson.C17971f;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.livesdk.feed.services.b */
public class C7098b {

    /* renamed from: a */
    private static volatile C7098b f19309a;

    /* renamed from: b */
    private final Map<Class<?>, C7100a<?>> f19310b = new ConcurrentHashMap();

    /* renamed from: com.bytedance.android.livesdk.feed.services.b$a */
    static final class C7100a<T> {

        /* renamed from: a */
        public C7101b<T> f19311a;

        /* renamed from: b */
        public Object f19312b;

        private C7100a(C7101b<T> bVar) {
            this.f19311a = bVar;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.feed.services.b$b */
    public interface C7101b<T> {

        /* renamed from: com.bytedance.android.livesdk.feed.services.b$b$a */
        public static final class C7102a<R> {

            /* renamed from: a */
            public R f19313a;

            /* renamed from: b */
            boolean f19314b;

            private C7102a() {
            }

            /* renamed from: a */
            public final C7102a<R> mo13231a() {
                this.f19314b = true;
                return this;
            }

            /* renamed from: a */
            public final C7102a<R> mo13232a(R r) {
                this.f19313a = r;
                return this;
            }
        }

        /* renamed from: a */
        C7102a<T> mo13186a(C7102a<T> aVar);
    }

    /* renamed from: a */
    private static C7098b m14767a() {
        if (f19309a == null) {
            synchronized (C7098b.class) {
                if (f19309a == null) {
                    f19309a = new C7098b();
                }
            }
        }
        return f19309a;
    }

    private C7098b() {
        m14765a(C6957i.class, (C7101b<T>) new C7097a<T>());
        m14765a(C6951a.class, (C7101b<T>) new C7105e<T>());
        m14765a(C17971f.class, (C7101b<T>) new GsonProvider<T>());
    }

    /* renamed from: a */
    public static <T> T m14768a(Class<T> cls) {
        return m14767a().m14769a(cls, true);
    }

    /* renamed from: a */
    private <T> C7100a<T> m14765a(Class<T> cls, C7101b<T> bVar) {
        C7100a<T> aVar = new C7100a<>(bVar);
        this.f19310b.put(cls, aVar);
        return aVar;
    }

    /* renamed from: a */
    static final /* synthetic */ C7102a m14766a(Class cls, C7102a aVar) {
        try {
            return aVar.mo13232a(cls.newInstance());
        } catch (IllegalAccessException unused) {
            StringBuilder sb = new StringBuilder("Requested class isn't registered in FeedImplProvider and its nullary constructor isn't accessible: ");
            sb.append(cls.getName());
            sb.append(".\n Forgot to register in FeedImplProvider or FlavorImplProvider?");
            throw new RuntimeException(sb.toString());
        } catch (InstantiationException unused2) {
            StringBuilder sb2 = new StringBuilder("Requested class isn't registered in FeedImplProvider and doesn't have public non-param constructor: ");
            sb2.append(cls.getName());
            sb2.append(".\n Forgot to register in FeedImplProvider or FlavorImplProvider?");
            throw new RuntimeException(sb2.toString());
        }
    }

    /* renamed from: a */
    private <T> T m14769a(Class<T> cls, boolean z) {
        C7100a aVar = (C7100a) this.f19310b.get(cls);
        if (aVar == null) {
            aVar = m14765a(cls, (C7101b<T>) new C7103c<T>(cls));
        }
        C7102a a = aVar.f19311a.mo13186a(new C7102a());
        if (!a.f19314b) {
            return a.f19313a;
        }
        if (aVar.f19312b == null) {
            synchronized (C7098b.class) {
                if (aVar.f19312b == null) {
                    aVar.f19312b = a.f19313a;
                }
            }
        }
        return aVar.f19312b;
    }
}
