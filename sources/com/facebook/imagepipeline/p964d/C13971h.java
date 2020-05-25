package com.facebook.imagepipeline.p964d;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p920d.C13690j;
import com.facebook.common.p920d.C13691k;
import com.facebook.common.p923g.C13703b;
import com.facebook.common.p923g.C13704c;
import com.facebook.common.p924h.C13715a;
import com.facebook.common.p924h.C13718c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.imagepipeline.d.h */
public class C13971h<K, V> implements C13704c, C13986p<K, V> {

    /* renamed from: a */
    static final long f36442a = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: b */
    final C13970g<K, C13975b<K, V>> f36443b;

    /* renamed from: c */
    final C13970g<K, C13975b<K, V>> f36444c;

    /* renamed from: d */
    final Map<Bitmap, Object> f36445d = new WeakHashMap();

    /* renamed from: e */
    protected C13987q f36446e;

    /* renamed from: f */
    private final C13993v<V> f36447f;

    /* renamed from: g */
    private final C13974a f36448g;

    /* renamed from: h */
    private final C13691k<C13987q> f36449h;

    /* renamed from: i */
    private long f36450i;

    /* renamed from: com.facebook.imagepipeline.d.h$a */
    public interface C13974a {
        /* renamed from: a */
        double mo26131a(C13703b bVar);
    }

    /* renamed from: com.facebook.imagepipeline.d.h$b */
    static class C13975b<K, V> {

        /* renamed from: a */
        public final K f36455a;

        /* renamed from: b */
        public final C13715a<V> f36456b;

        /* renamed from: c */
        public int f36457c = 0;

        /* renamed from: d */
        public boolean f36458d = false;

        /* renamed from: e */
        public final C13976c<K> f36459e;

        C13975b(K k, C13715a<V> aVar, C13976c<K> cVar) {
            this.f36455a = C13689i.m27652a(k);
            this.f36456b = (C13715a) C13689i.m27652a(C13715a.m27751b(aVar));
            this.f36459e = cVar;
        }
    }

    /* renamed from: com.facebook.imagepipeline.d.h$c */
    public interface C13976c<K> {
        /* renamed from: a */
        void mo26098a(K k, boolean z);
    }

    /* renamed from: a */
    public final void mo26163a(C13975b<K, V> bVar) {
        boolean c;
        C13715a h;
        C13689i.m27652a(bVar);
        synchronized (this) {
            m28484g(bVar);
            c = m28477c(bVar);
            h = m28485h(bVar);
        }
        C13715a.m27752c(h);
        if (!c) {
            bVar = null;
        }
        if (!(bVar == null || bVar.f36459e == null)) {
            bVar.f36459e.mo26098a(bVar.f36455a, true);
        }
        m28473b();
        m28475c();
    }

    /* renamed from: d */
    private synchronized int m28478d() {
        return this.f36444c.mo26148a() - this.f36443b.mo26148a();
    }

    /* renamed from: e */
    private synchronized int m28481e() {
        return this.f36444c.mo26152b() - this.f36443b.mo26152b();
    }

    /* renamed from: b */
    private synchronized void m28473b() {
        if (this.f36450i + f36442a <= SystemClock.uptimeMillis()) {
            this.f36450i = SystemClock.uptimeMillis();
            this.f36446e = (C13987q) this.f36449h.mo23157b();
        }
    }

    /* renamed from: c */
    private void m28475c() {
        ArrayList a;
        synchronized (this) {
            a = m28470a(Math.min(this.f36446e.f36468d, this.f36446e.f36466b - m28478d()), Math.min(this.f36446e.f36467c, this.f36446e.f36465a - m28481e()));
            m28476c(a);
        }
        m28471a(a);
        m28474b(a);
    }

    /* renamed from: a */
    public final void mo26162a() {
        ArrayList d;
        ArrayList d2;
        synchronized (this) {
            d = this.f36443b.mo26157d();
            d2 = this.f36444c.mo26157d();
            m28476c(d2);
        }
        m28471a(d2);
        m28474b(d);
        m28473b();
    }

    /* renamed from: a */
    private C13993v<C13975b<K, V>> m28469a(final C13993v<V> vVar) {
        return new C13993v<C13975b<K, V>>() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ int mo23155a(Object obj) {
                return vVar.mo23155a(((C13975b) obj).f36456b.mo25630a());
            }
        };
    }

    /* renamed from: d */
    private static <K, V> void m28479d(C13975b<K, V> bVar) {
        if (bVar != null && bVar.f36459e != null) {
            bVar.f36459e.mo26098a(bVar.f36455a, false);
        }
    }

    /* renamed from: c */
    public final synchronized boolean mo26167c(K k) {
        return this.f36444c.mo26151a(k);
    }

    /* renamed from: a */
    private void m28471a(ArrayList<C13975b<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C13715a.m27752c(m28485h((C13975b) it.next()));
            }
        }
    }

    /* renamed from: b */
    private synchronized C13715a<V> m28472b(final C13975b<K, V> bVar) {
        m28483f(bVar);
        return C13715a.m27747a(bVar.f36456b.mo25630a(), new C13718c<V>() {
            /* renamed from: a */
            public final void mo25600a(V v) {
                C13971h.this.mo26163a(bVar);
            }
        });
    }

    /* renamed from: c */
    private synchronized void m28476c(ArrayList<C13975b<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m28482e((C13975b) it.next());
            }
        }
    }

    /* renamed from: f */
    private synchronized void m28483f(C13975b<K, V> bVar) {
        C13689i.m27652a(bVar);
        C13689i.m27657b(!bVar.f36458d);
        bVar.f36457c++;
    }

    /* renamed from: g */
    private synchronized void m28484g(C13975b<K, V> bVar) {
        boolean z;
        C13689i.m27652a(bVar);
        if (bVar.f36457c > 0) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27657b(z);
        bVar.f36457c--;
    }

    /* renamed from: h */
    private synchronized C13715a<V> m28485h(C13975b<K, V> bVar) {
        C13689i.m27652a(bVar);
        if (!bVar.f36458d || bVar.f36457c != 0) {
            return null;
        }
        return bVar.f36456b;
    }

    /* renamed from: d */
    private synchronized boolean m28480d(V v) {
        int a = this.f36447f.mo23155a(v);
        if (a > this.f36446e.f36469e || m28478d() > this.f36446e.f36466b - 1 || m28481e() > this.f36446e.f36465a - a) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private synchronized void m28482e(C13975b<K, V> bVar) {
        C13689i.m27652a(bVar);
        C13689i.m27657b(!bVar.f36458d);
        bVar.f36458d = true;
    }

    /* renamed from: a */
    public final int mo26158a(C13690j<K> jVar) {
        ArrayList b;
        ArrayList b2;
        synchronized (this) {
            b = this.f36443b.mo26154b(jVar);
            b2 = this.f36444c.mo26154b(jVar);
            m28476c(b2);
        }
        m28471a(b2);
        m28474b(b);
        m28473b();
        m28475c();
        return b2.size();
    }

    /* renamed from: b */
    private static void m28474b(ArrayList<C13975b<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m28479d((C13975b) it.next());
            }
        }
    }

    /* renamed from: c */
    private synchronized boolean m28477c(C13975b<K, V> bVar) {
        if (bVar.f36458d || bVar.f36457c != 0) {
            return false;
        }
        this.f36443b.mo26149a(bVar.f36455a, bVar);
        return true;
    }

    /* renamed from: a */
    public final C13715a<V> mo26159a(K k) {
        C13975b bVar;
        C13715a<V> aVar;
        C13689i.m27652a(k);
        synchronized (this) {
            bVar = (C13975b) this.f36443b.mo26156c(k);
            C13975b bVar2 = (C13975b) this.f36444c.mo26153b(k);
            if (bVar2 != null) {
                aVar = m28472b(bVar2);
            } else {
                aVar = null;
            }
        }
        m28479d(bVar);
        m28473b();
        m28475c();
        return aVar;
    }

    /* renamed from: b */
    public final int mo26164b(C13690j<K> jVar) {
        ArrayList b;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            b = this.f36443b.mo26154b(jVar);
            for (int i = 0; i < b.size(); i++) {
                arrayList.add(this.f36444c.mo26156c(((C13975b) b.get(i)).f36455a));
            }
        }
        m28471a(arrayList);
        m28474b(b);
        m28473b();
        m28475c();
        return arrayList.size();
    }

    /* renamed from: c */
    public final synchronized boolean mo26166c(C13690j<K> jVar) {
        boolean z;
        if (!this.f36444c.mo26150a(jVar).isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    public final C13715a<V> mo26165b(K k) {
        C13975b bVar;
        boolean z;
        C13715a<V> aVar;
        C13689i.m27652a(k);
        synchronized (this) {
            bVar = (C13975b) this.f36443b.mo26156c(k);
            z = true;
            boolean z2 = false;
            if (bVar != null) {
                C13975b bVar2 = (C13975b) this.f36444c.mo26156c(k);
                C13689i.m27652a(bVar2);
                if (bVar2.f36457c == 0) {
                    z2 = true;
                }
                C13689i.m27657b(z2);
                aVar = bVar2.f36456b;
            } else {
                aVar = null;
                z = false;
            }
        }
        if (z) {
            m28479d(bVar);
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo25598a(C13703b bVar) {
        ArrayList a;
        double a2 = this.f36448g.mo26131a(bVar);
        synchronized (this) {
            double b = (double) this.f36444c.mo26152b();
            double d = 1.0d - a2;
            Double.isNaN(b);
            a = m28470a(Integer.MAX_VALUE, Math.max(0, ((int) (b * d)) - m28481e()));
            m28476c(a);
        }
        m28471a(a);
        m28474b(a);
        m28473b();
        m28475c();
    }

    /* renamed from: a */
    public final C13715a<V> mo26160a(K k, C13715a<V> aVar) {
        return mo26161a(k, aVar, null);
    }

    /* renamed from: a */
    private synchronized ArrayList<C13975b<K, V>> m28470a(int i, int i2) {
        int max = Math.max(i, 0);
        int max2 = Math.max(i2, 0);
        if (this.f36443b.mo26148a() <= max && this.f36443b.mo26152b() <= max2) {
            return null;
        }
        ArrayList<C13975b<K, V>> arrayList = new ArrayList<>();
        while (true) {
            if (this.f36443b.mo26148a() <= max && this.f36443b.mo26152b() <= max2) {
                return arrayList;
            }
            Object c = this.f36443b.mo26155c();
            this.f36443b.mo26156c(c);
            arrayList.add(this.f36444c.mo26156c(c));
        }
    }

    public C13971h(C13993v<V> vVar, C13974a aVar, C13691k<C13987q> kVar) {
        this.f36447f = vVar;
        this.f36443b = new C13970g<>(m28469a(vVar));
        this.f36444c = new C13970g<>(m28469a(vVar));
        this.f36448g = aVar;
        this.f36449h = kVar;
        this.f36446e = (C13987q) this.f36449h.mo23157b();
        this.f36450i = SystemClock.uptimeMillis();
    }

    /* renamed from: a */
    public final C13715a<V> mo26161a(K k, C13715a<V> aVar, C13976c<K> cVar) {
        C13975b bVar;
        C13715a<V> aVar2;
        C13715a aVar3;
        C13689i.m27652a(k);
        C13689i.m27652a(aVar);
        m28473b();
        synchronized (this) {
            bVar = (C13975b) this.f36443b.mo26156c(k);
            C13975b bVar2 = (C13975b) this.f36444c.mo26156c(k);
            aVar2 = null;
            if (bVar2 != null) {
                m28482e(bVar2);
                aVar3 = m28485h(bVar2);
            } else {
                aVar3 = null;
            }
            if (m28480d((V) aVar.mo25630a())) {
                C13975b bVar3 = new C13975b(k, aVar, cVar);
                this.f36444c.mo26149a(k, bVar3);
                aVar2 = m28472b(bVar3);
            }
        }
        C13715a.m27752c(aVar3);
        m28479d(bVar);
        m28475c();
        return aVar2;
    }
}
