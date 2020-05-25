package android.arch.lifecycle;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0176h.C0178b;
import android.arch.p006a.p008b.C0045a;
import android.arch.p006a.p008b.C0046b.C0049b;
import android.arch.p006a.p008b.C0046b.C0050c;
import android.arch.p006a.p008b.C0046b.C0051d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map.Entry;

/* renamed from: android.arch.lifecycle.l */
public class C0185l extends C0176h {

    /* renamed from: a */
    private C0045a<C0183j, C0187a> f438a = new C0045a<>();

    /* renamed from: b */
    private C0178b f439b;

    /* renamed from: c */
    private final WeakReference<C0184k> f440c;

    /* renamed from: d */
    private int f441d = 0;

    /* renamed from: e */
    private boolean f442e = false;

    /* renamed from: f */
    private boolean f443f = false;

    /* renamed from: g */
    private ArrayList<C0178b> f444g = new ArrayList<>();

    /* renamed from: android.arch.lifecycle.l$a */
    static class C0187a {

        /* renamed from: a */
        C0178b f447a;

        /* renamed from: b */
        GenericLifecycleObserver f448b;

        C0187a(C0183j jVar, C0178b bVar) {
            this.f448b = C0189n.m411a((Object) jVar);
            this.f447a = bVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo334a(C0184k kVar, C0177a aVar) {
            C0178b b = C0185l.m395b(aVar);
            this.f447a = C0185l.m393a(this.f447a, b);
            this.f448b.mo265a(kVar, aVar);
            this.f447a = b;
        }
    }

    /* renamed from: a */
    public C0178b mo323a() {
        return this.f439b;
    }

    /* renamed from: c */
    private void m400c() {
        this.f444g.remove(this.f444g.size() - 1);
    }

    /* renamed from: b */
    private boolean m398b() {
        if (this.f438a.f116e == 0) {
            return true;
        }
        C0178b bVar = ((C0187a) this.f438a.f113b.getValue()).f447a;
        C0178b bVar2 = ((C0187a) this.f438a.f114c.getValue()).f447a;
        if (bVar == bVar2 && this.f439b == bVar2) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m403d() {
        C0184k kVar = (C0184k) this.f440c.get();
        if (kVar != null) {
            while (!m398b()) {
                this.f443f = false;
                if (this.f439b.compareTo(((C0187a) this.f438a.f113b.getValue()).f447a) < 0) {
                    m397b(kVar);
                }
                C0050c<K, V> cVar = this.f438a.f114c;
                if (!this.f443f && cVar != null && this.f439b.compareTo(((C0187a) cVar.getValue()).f447a) > 0) {
                    m394a(kVar);
                }
            }
            this.f443f = false;
        }
    }

    /* renamed from: c */
    private void m401c(C0178b bVar) {
        this.f444g.add(bVar);
    }

    /* renamed from: a */
    public final void mo332a(C0177a aVar) {
        m396b(m395b(aVar));
    }

    /* renamed from: b */
    public void mo325b(C0183j jVar) {
        this.f438a.mo63b(jVar);
    }

    /* renamed from: b */
    private void m396b(C0178b bVar) {
        if (this.f439b != bVar) {
            this.f439b = bVar;
            if (this.f442e || this.f441d != 0) {
                this.f443f = true;
                return;
            }
            this.f442e = true;
            m403d();
            this.f442e = false;
        }
    }

    /* renamed from: a */
    public final void mo333a(C0178b bVar) {
        m396b(bVar);
    }

    public C0185l(C0184k kVar) {
        this.f440c = new WeakReference<>(kVar);
        this.f439b = C0178b.INITIALIZED;
    }

    /* renamed from: b */
    static C0178b m395b(C0177a aVar) {
        switch (aVar) {
            case ON_CREATE:
            case ON_STOP:
                return C0178b.CREATED;
            case ON_START:
            case ON_PAUSE:
                return C0178b.STARTED;
            case ON_RESUME:
                return C0178b.RESUMED;
            case ON_DESTROY:
                return C0178b.DESTROYED;
            default:
                StringBuilder sb = new StringBuilder("Unexpected event value ");
                sb.append(aVar);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: d */
    private static C0177a m402d(C0178b bVar) {
        switch (bVar) {
            case INITIALIZED:
            case DESTROYED:
                return C0177a.ON_CREATE;
            case CREATED:
                return C0177a.ON_START;
            case STARTED:
                return C0177a.ON_RESUME;
            case RESUMED:
                throw new IllegalArgumentException();
            default:
                StringBuilder sb = new StringBuilder("Unexpected state value ");
                sb.append(bVar);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    private void m394a(C0184k kVar) {
        C0051d a = this.f438a.mo65a();
        while (a.hasNext() && !this.f443f) {
            Entry entry = (Entry) a.next();
            C0187a aVar = (C0187a) entry.getValue();
            while (aVar.f447a.compareTo(this.f439b) < 0 && !this.f443f && this.f438a.mo64c(entry.getKey())) {
                m401c(aVar.f447a);
                aVar.mo334a(kVar, m402d(aVar.f447a));
                m400c();
            }
        }
    }

    /* renamed from: c */
    private C0178b mo75664c(C0183j jVar) {
        Entry entry;
        C0178b bVar;
        C0045a<C0183j, C0187a> aVar = this.f438a;
        C0178b bVar2 = null;
        if (aVar.mo64c(jVar)) {
            entry = ((C0050c) aVar.f112a.get(jVar)).f120d;
        } else {
            entry = null;
        }
        if (entry != null) {
            bVar = ((C0187a) entry.getValue()).f447a;
        } else {
            bVar = null;
        }
        if (!this.f444g.isEmpty()) {
            bVar2 = (C0178b) this.f444g.get(this.f444g.size() - 1);
        }
        return m393a(m393a(this.f439b, bVar), bVar2);
    }

    /* renamed from: b */
    private void m397b(C0184k kVar) {
        C0177a aVar;
        C0045a<C0183j, C0187a> aVar2 = this.f438a;
        C0049b bVar = new C0049b(aVar2.f114c, aVar2.f113b);
        aVar2.f115d.put(bVar, Boolean.valueOf(false));
        while (bVar.hasNext() && !this.f443f) {
            Entry entry = (Entry) bVar.next();
            C0187a aVar3 = (C0187a) entry.getValue();
            while (aVar3.f447a.compareTo(this.f439b) > 0 && !this.f443f && this.f438a.mo64c(entry.getKey())) {
                C0178b bVar2 = aVar3.f447a;
                switch (bVar2) {
                    case INITIALIZED:
                        throw new IllegalArgumentException();
                    case CREATED:
                        aVar = C0177a.ON_DESTROY;
                        break;
                    case STARTED:
                        aVar = C0177a.ON_STOP;
                        break;
                    case RESUMED:
                        aVar = C0177a.ON_PAUSE;
                        break;
                    case DESTROYED:
                        throw new IllegalArgumentException();
                    default:
                        StringBuilder sb = new StringBuilder("Unexpected state value ");
                        sb.append(bVar2);
                        throw new IllegalArgumentException(sb.toString());
                }
                m401c(m395b(aVar));
                aVar3.mo334a(kVar, aVar);
                m400c();
            }
        }
    }

    /* renamed from: a */
    public void mo324a(C0183j jVar) {
        C0178b bVar;
        boolean z;
        if (this.f439b == C0178b.DESTROYED) {
            bVar = C0178b.DESTROYED;
        } else {
            bVar = C0178b.INITIALIZED;
        }
        C0187a aVar = new C0187a(jVar, bVar);
        if (((C0187a) this.f438a.mo62a(jVar, aVar)) == null) {
            C0184k kVar = (C0184k) this.f440c.get();
            if (kVar != null) {
                if (this.f441d != 0 || this.f442e) {
                    z = true;
                } else {
                    z = false;
                }
                C0178b c = mo75664c(jVar);
                this.f441d++;
                while (aVar.f447a.compareTo(c) < 0 && this.f438a.mo64c(jVar)) {
                    m401c(aVar.f447a);
                    aVar.mo334a(kVar, m402d(aVar.f447a));
                    m400c();
                    c = mo75664c(jVar);
                }
                if (!z) {
                    m403d();
                }
                this.f441d--;
            }
        }
    }

    /* renamed from: a */
    static C0178b m393a(C0178b bVar, C0178b bVar2) {
        if (bVar2 == null || bVar2.compareTo(bVar) >= 0) {
            return bVar;
        }
        return bVar2;
    }
}
