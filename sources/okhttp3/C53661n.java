package okhttp3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.C53559c;

/* renamed from: okhttp3.n */
public final class C53661n {

    /* renamed from: a */
    private int f133118a = 64;

    /* renamed from: b */
    private int f133119b = 5;

    /* renamed from: c */
    private Runnable f133120c;

    /* renamed from: d */
    private ExecutorService f133121d;

    /* renamed from: e */
    private final Deque<C53497a> f133122e = new ArrayDeque();

    /* renamed from: f */
    private final Deque<C53497a> f133123f = new ArrayDeque();

    /* renamed from: g */
    private final Deque<C53496aa> f133124g = new ArrayDeque();

    public C53661n() {
    }

    /* renamed from: f */
    private synchronized int m114129f() {
        return this.f133123f.size() + this.f133124g.size();
    }

    /* renamed from: d */
    public final synchronized List<C53524e> mo111581d() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        arrayList.addAll(this.f133124g);
        for (C53497a aVar : this.f133123f) {
            arrayList.add(C53496aa.this);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: e */
    private void m114128e() {
        if (this.f133123f.size() < this.f133118a && !this.f133122e.isEmpty()) {
            Iterator it = this.f133122e.iterator();
            while (it.hasNext()) {
                C53497a aVar = (C53497a) it.next();
                if (m114127c(aVar) < this.f133119b) {
                    it.remove();
                    this.f133123f.add(aVar);
                    mo111573a().execute(aVar);
                }
                if (this.f133123f.size() >= this.f133118a) {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized ExecutorService mo111573a() {
        if (this.f133121d == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C53559c.m113803a("OkHttp Dispatcher", false));
            this.f133121d = threadPoolExecutor;
        }
        return this.f133121d;
    }

    /* renamed from: b */
    public final synchronized void mo111577b() {
        for (C53497a aVar : this.f133122e) {
            C53496aa.this.mo111248c();
        }
        for (C53497a aVar2 : this.f133123f) {
            C53496aa.this.mo111248c();
        }
        for (C53496aa c : this.f133124g) {
            c.mo111248c();
        }
    }

    /* renamed from: c */
    public final synchronized List<C53524e> mo111580c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C53497a aVar : this.f133122e) {
            arrayList.add(C53496aa.this);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo111578b(C53497a aVar) {
        m114126a(this.f133123f, aVar, true);
    }

    /* renamed from: a */
    public final synchronized void mo111574a(int i) {
        this.f133119b = 10;
        m114128e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo111579b(C53496aa aaVar) {
        m114126a(this.f133124g, aaVar, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo111576a(C53496aa aaVar) {
        this.f133124g.add(aaVar);
    }

    public C53661n(ExecutorService executorService) {
        this.f133121d = executorService;
    }

    /* renamed from: c */
    private int m114127c(C53497a aVar) {
        int i = 0;
        for (C53497a aVar2 : this.f133123f) {
            if (!C53496aa.this.f132374e && aVar2.mo111254b().equals(aVar.mo111254b())) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo111575a(C53497a aVar) {
        if (this.f133123f.size() >= this.f133118a || m114127c(aVar) >= this.f133119b) {
            this.f133122e.add(aVar);
            return;
        }
        this.f133123f.add(aVar);
        mo111573a().execute(aVar);
    }

    /* renamed from: a */
    private <T> void m114126a(Deque<T> deque, T t, boolean z) {
        int f;
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                if (z) {
                    m114128e();
                }
                f = m114129f();
                runnable = this.f133120c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (f == 0 && runnable != null) {
            runnable.run();
        }
    }
}
