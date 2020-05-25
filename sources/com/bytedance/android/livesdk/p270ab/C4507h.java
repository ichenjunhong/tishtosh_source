package com.bytedance.android.livesdk.p270ab;

import com.bytedance.android.live.core.p230g.C3898l;
import com.bytedance.android.live.room.C4194m;
import com.bytedance.android.livesdk.browser.p288b.C4691a;
import com.bytedance.android.livesdk.browser.p288b.C4692b.C4694a;
import com.bytedance.android.livesdk.browser.p289c.C4697b;
import com.bytedance.android.livesdk.browser.p289c.C4707e.C4711c;
import com.bytedance.android.livesdk.browser.p292f.C4750d;
import com.bytedance.android.livesdk.browser.p292f.C4750d.C4752a;
import com.bytedance.android.livesdk.browser.p294h.C4756a;
import com.bytedance.android.livesdk.browser.p294h.C4758c.C4760a;
import com.bytedance.android.livesdk.browser.shorturl.C4955a;
import com.bytedance.android.livesdk.browser.shorturl.ShortUrlService.C4954a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6599c;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6606i.C6608a;
import com.bytedance.android.livesdk.live.provider.C7763a;
import com.bytedance.android.livesdk.live.provider.C7763a.C7764a;
import com.bytedance.android.livesdk.live.provider.GsonProvider;
import com.bytedance.android.livesdk.p270ab.C4498a.C4500a;
import com.bytedance.android.livesdk.p270ab.C4515k.C4517a;
import com.bytedance.android.livesdk.p278ae.C4548a.C4549a;
import com.bytedance.android.livesdk.p420u.C8316b;
import com.bytedance.android.livesdk.p426x.C8576k.C8577a;
import com.bytedance.android.livesdk.p426x.C8578l.C8579a;
import com.bytedance.android.livesdk.p427y.C8581a;
import com.bytedance.android.livesdk.p427y.C8582b.C8583a;
import com.bytedance.android.livesdk.schema.LiveActionHandlerImpl.C8249a;
import com.bytedance.android.livesdk.schema.interfaces.C8260a;
import com.bytedance.android.livesdk.widget.p423a.C8489a.C8493a;
import com.bytedance.android.livesdkapi.depend.live.C8668r;
import com.google.gson.C17971f;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.livesdk.ab.h */
public class C4507h {

    /* renamed from: a */
    private static volatile C4507h f12280a;

    /* renamed from: b */
    private final Map<Class<?>, C4509a<?>> f12281b = new ConcurrentHashMap();

    /* renamed from: com.bytedance.android.livesdk.ab.h$a */
    static final class C4509a<T> {

        /* renamed from: a */
        public C4510b<T> f12282a;

        /* renamed from: b */
        public C4511a<T> f12283b;

        /* renamed from: c */
        public Object f12284c;

        private C4509a(C4510b<T> bVar) {
            this.f12282a = bVar;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.ab.h$b */
    public interface C4510b<T> {

        /* renamed from: com.bytedance.android.livesdk.ab.h$b$a */
        public static final class C4511a<R> {

            /* renamed from: a */
            public volatile R f12285a;

            /* renamed from: b */
            volatile boolean f12286b;

            private C4511a() {
            }

            /* renamed from: a */
            public final C4511a<R> mo10336a() {
                this.f12286b = true;
                return this;
            }

            /* renamed from: a */
            public final C4511a<R> mo10337a(R r) {
                this.f12285a = r;
                return this;
            }
        }

        /* renamed from: a */
        C4511a<T> mo10307a(C4511a<T> aVar);
    }

    /* renamed from: com.bytedance.android.livesdk.ab.h$c */
    public static final class C4512c {

        /* renamed from: a */
        private C4507h f12287a;

        private C4512c(C4507h hVar) {
            this.f12287a = hVar;
        }

        /* renamed from: a */
        public final <T> C4509a<T> mo10338a(Class<T> cls, C4510b<T> bVar) {
            return this.f12287a.mo10334a(cls, bVar);
        }
    }

    /* renamed from: a */
    static C4507h m10873a() {
        if (f12280a == null) {
            synchronized (C4507h.class) {
                if (f12280a == null) {
                    f12280a = new C4507h();
                }
            }
        }
        return f12280a;
    }

    private C4507h() {
        mo10334a(C17971f.class, (C4510b<T>) new GsonProvider<T>());
        mo10334a(C4697b.class, (C4510b<T>) new C4711c<T>());
        mo10334a(C4955a.class, (C4510b<T>) new C4954a<T>());
        mo10334a(C7763a.class, (C4510b<T>) new C7764a<T>());
        mo10334a(C6599c.class, (C4510b<T>) new C6608a<T>());
        mo10334a(C8668r.class, (C4510b<T>) new C4549a<T>());
        mo10334a(C8260a.class, (C4510b<T>) new C8249a<T>());
        mo10334a(C4506g.class, (C4510b<T>) new C4517a<T>());
        m10875b(C4506g.class);
        C4512c cVar = new C4512c();
        cVar.mo10338a(C4691a.class, new C4694a());
        cVar.mo10338a(C4756a.class, new C4760a());
        cVar.mo10338a(C3898l.class, new C8493a());
        cVar.mo10338a(C4750d.class, new C4752a());
        cVar.mo10338a(C8581a.class, new C8583a());
        mo10334a(C4503d.class, (C4510b<T>) new C4500a<T>());
        C4498a aVar = (C4498a) m10875b(C4503d.class);
        aVar.f12272a = new C4512c();
        aVar.mo10306a(C4194m.class, new C8579a());
        aVar.mo10306a(C8316b.class, new C8577a());
    }

    /* renamed from: b */
    private <T> T m10875b(Class<T> cls) {
        return mo10335a(cls, true);
    }

    /* renamed from: a */
    public static <T> T m10874a(Class<T> cls) {
        return m10873a().m10875b(cls);
    }

    /* renamed from: a */
    public final <T> C4509a<T> mo10334a(Class<T> cls, C4510b<T> bVar) {
        C4509a<T> aVar = new C4509a<>(bVar);
        this.f12281b.put(cls, aVar);
        return aVar;
    }

    /* renamed from: a */
    static final /* synthetic */ C4511a m10872a(Class cls, C4511a aVar) {
        try {
            return aVar.mo10337a(cls.newInstance());
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
    public <T> T mo10335a(Class<T> cls, boolean z) {
        C4509a aVar = (C4509a) this.f12281b.get(cls);
        if (aVar == null) {
            if (!z) {
                return null;
            }
            aVar = new C4509a(new C4513i(cls));
            aVar.f12283b = aVar.f12282a.mo10307a(new C4511a());
            aVar.f12284c = aVar.f12282a.mo10307a(aVar.f12283b).f12285a;
            this.f12281b.put(cls, aVar);
        }
        if (aVar.f12283b == null || !aVar.f12283b.f12286b) {
            aVar.f12283b = aVar.f12282a.mo10307a(new C4511a());
        }
        if (aVar.f12283b.f12286b) {
            if (aVar.f12284c == null) {
                synchronized (C4507h.class) {
                    if (aVar.f12284c == null) {
                        aVar.f12284c = aVar.f12283b.f12285a;
                    }
                }
            }
            return aVar.f12284c;
        }
        Object obj = aVar.f12283b.f12285a;
        aVar.f12283b = null;
        return obj;
    }
}
