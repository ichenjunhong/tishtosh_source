package com.p683ss.android.ugc.aweme.emoji.p1689h.p1690a;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1690a.p1691a.C29387c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.emoji.h.a.b */
public final class C29389b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f76984a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C29389b.class), "lruCache", "getLruCache()Landroid/util/LruCache;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C29389b.class), "weakRefCache", "getWeakRefCache()Ljava/util/HashMap;"))};

    /* renamed from: b */
    public static final C29390a f76985b = new C29390a(null);

    /* renamed from: c */
    private final C52668f f76986c;

    /* renamed from: d */
    private final C52668f f76987d;

    /* renamed from: e */
    private final C29387c f76988e;

    /* renamed from: com.ss.android.ugc.aweme.emoji.h.a.b$a */
    public static final class C29390a {
        private C29390a() {
        }

        public /* synthetic */ C29390a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.h.a.b$b */
    static final class C29391b extends C52712l implements C52670a<LruCache<String, Bitmap>> {

        /* renamed from: a */
        public static final C29391b f76989a = new C29391b();

        C29391b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new LruCache(20);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.h.a.b$c */
    static final class C29392c extends C52712l implements C52670a<HashMap<String, WeakReference<Bitmap>>> {

        /* renamed from: a */
        public static final C29392c f76990a = new C29392c();

        C29392c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new HashMap();
        }
    }

    /* renamed from: a */
    private final HashMap<String, WeakReference<Bitmap>> m69294a() {
        return (HashMap) this.f76987d.getValue();
    }

    private C29389b(C29387c cVar) {
        this.f76988e = cVar;
        this.f76986c = C52732g.m112285a(C29391b.f76989a);
        this.f76987d = C52732g.m112285a(C29392c.f76990a);
    }

    /* renamed from: b */
    private final Bitmap m69296b(String str) {
        Bitmap b = C29393c.f76991a.mo59457b(this.f76988e.getPicFileDirPath(), str);
        if (b != null) {
            m69295a(str, b);
        }
        return b;
    }

    /* renamed from: a */
    private final synchronized Bitmap m69293a(String str) {
        Bitmap bitmap;
        List<String> arrayList = new ArrayList<>();
        bitmap = null;
        for (Entry entry : m69294a().entrySet()) {
            Bitmap bitmap2 = (Bitmap) ((WeakReference) entry.getValue()).get();
            if (bitmap2 == null) {
                arrayList.add(entry.getKey());
            } else if (C52711k.m112239a((Object) str, (Object) (String) entry.getKey())) {
                bitmap = bitmap2;
            }
        }
        for (String remove : arrayList) {
            m69294a().remove(remove);
        }
        return bitmap;
    }

    public /* synthetic */ C29389b(C29387c cVar, C52707g gVar) {
        this(cVar);
    }

    /* renamed from: a */
    public final Bitmap mo59454a(String str, boolean z) {
        if (str == null) {
            return null;
        }
        Bitmap a = m69293a(str);
        if (a != null && a != null) {
            return a;
        }
        if (z) {
            return m69296b(str);
        }
        return null;
    }

    /* renamed from: a */
    private final synchronized void m69295a(String str, Bitmap bitmap) {
        List<String> arrayList = new ArrayList<>();
        for (Entry entry : m69294a().entrySet()) {
            if (((WeakReference) entry.getValue()).get() == null) {
                arrayList.add(entry.getKey());
            }
        }
        for (String remove : arrayList) {
            m69294a().remove(remove);
        }
        m69294a().put(str, new WeakReference(bitmap));
    }
}
