package androidx.work.impl;

import android.content.Context;
import androidx.work.C1532b;
import androidx.work.WorkerParameters.C1530a;
import androidx.work.impl.C1628h.C1632a;
import androidx.work.impl.utils.p058a.C1646c;
import androidx.work.impl.utils.p059b.C1648a;
import com.C2240a;
import com.google.p1057b.p1065h.p1066a.C17832m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* renamed from: androidx.work.impl.b */
public final class C1572b implements C1547a {

    /* renamed from: a */
    private Context f5577a;

    /* renamed from: b */
    private C1532b f5578b;

    /* renamed from: c */
    private C1648a f5579c;

    /* renamed from: d */
    private WorkDatabase f5580d;

    /* renamed from: e */
    private Map<String, C1628h> f5581e = new HashMap();

    /* renamed from: f */
    private List<C1620c> f5582f;

    /* renamed from: g */
    private Set<String> f5583g;

    /* renamed from: h */
    private final List<C1547a> f5584h;

    /* renamed from: i */
    private final Object f5585i;

    /* renamed from: androidx.work.impl.b$a */
    static class C1573a implements Runnable {

        /* renamed from: a */
        private C1547a f5586a;

        /* renamed from: b */
        private String f5587b;

        /* renamed from: c */
        private C17832m<Boolean> f5588c;

        public final void run() {
            boolean z;
            try {
                z = ((Boolean) this.f5588c.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.f5586a.mo5939a(this.f5587b, z);
        }

        C1573a(C1547a aVar, String str, C17832m<Boolean> mVar) {
            this.f5586a = aVar;
            this.f5587b = str;
            this.f5588c = mVar;
        }
    }

    /* renamed from: a */
    public final void mo5968a(C1547a aVar) {
        synchronized (this.f5585i) {
            this.f5584h.add(aVar);
        }
    }

    /* renamed from: b */
    public final void mo5971b(C1547a aVar) {
        synchronized (this.f5585i) {
            this.f5584h.remove(aVar);
        }
    }

    /* renamed from: c */
    public final boolean mo5973c(String str) {
        boolean containsKey;
        synchronized (this.f5585i) {
            containsKey = this.f5581e.containsKey(str);
        }
        return containsKey;
    }

    /* renamed from: b */
    public final boolean mo5972b(String str) {
        boolean contains;
        synchronized (this.f5585i) {
            contains = this.f5583g.contains(str);
        }
        return contains;
    }

    /* renamed from: a */
    public final boolean mo5969a(String str) {
        synchronized (this.f5585i) {
            C2240a.m6772a("Processor stopping %s", new Object[]{str});
            C1628h hVar = (C1628h) this.f5581e.remove(str);
            if (hVar != null) {
                hVar.f5715e = true;
                hVar.mo6031b();
                if (hVar.f5714d != null) {
                    hVar.f5714d.cancel(true);
                }
                if (hVar.f5711a != null) {
                    hVar.f5711a.mo5905d();
                }
                C2240a.m6772a("WorkerWrapper stopped for %s", new Object[]{str});
                return true;
            }
            C2240a.m6772a("WorkerWrapper could not be found for %s", new Object[]{str});
            return false;
        }
    }

    /* renamed from: a */
    public final void mo5939a(String str, boolean z) {
        synchronized (this.f5585i) {
            this.f5581e.remove(str);
            C2240a.m6772a("%s %s executed; reschedule = %s", new Object[]{getClass().getSimpleName(), str, Boolean.valueOf(z)});
            for (C1547a a : this.f5584h) {
                a.mo5939a(str, z);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo5970a(String str, C1530a aVar) {
        synchronized (this.f5585i) {
            if (this.f5581e.containsKey(str)) {
                C2240a.m6772a("Work %s is already enqueued for processing", new Object[]{str});
                return false;
            }
            C1632a aVar2 = new C1632a(this.f5577a, this.f5578b, this.f5579c, this.f5580d, str);
            aVar2.f5741g = this.f5582f;
            if (aVar != null) {
                aVar2.f5742h = aVar;
            }
            C1628h hVar = new C1628h(aVar2);
            C1646c<Boolean> cVar = hVar.f5713c;
            cVar.mo6039a(new C1573a(this, str, cVar), this.f5579c.mo6060a());
            this.f5581e.put(str, hVar);
            this.f5579c.mo6063c().execute(hVar);
            C2240a.m6772a("%s: processing %s", new Object[]{getClass().getSimpleName(), str});
            return true;
        }
    }

    public C1572b(Context context, C1532b bVar, C1648a aVar, WorkDatabase workDatabase, List<C1620c> list) {
        this.f5577a = context;
        this.f5578b = bVar;
        this.f5579c = aVar;
        this.f5580d = workDatabase;
        this.f5582f = list;
        this.f5583g = new HashSet();
        this.f5584h = new ArrayList();
        this.f5585i = new Object();
    }
}
