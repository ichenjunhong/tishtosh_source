package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C53263bl.C53264a;
import kotlinx.coroutines.internal.C53331t;
import p2628d.C52860x;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.C52628e;
import p2628d.p2631c.p2632a.C52601b;
import p2628d.p2631c.p2633b.p2634a.C52617e;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.k */
public class C53343k<T> extends C53224au<T> implements C52617e, C53342j<T> {

    /* renamed from: b */
    private static final AtomicIntegerFieldUpdater f131974b = AtomicIntegerFieldUpdater.newUpdater(C53343k.class, "_decision");

    /* renamed from: c */
    private static final AtomicReferenceFieldUpdater f131975c = AtomicReferenceFieldUpdater.newUpdater(C53343k.class, Object.class, "_state");
    private volatile int _decision = 0;
    public volatile Object _state = C53230b.f131814a;

    /* renamed from: a */
    private final C52628e f131976a = this.f131977d.getContext();

    /* renamed from: d */
    private final C52625c<T> f131977d;
    private volatile C53226aw parentHandle;

    /* renamed from: a */
    public final Object mo110790a() {
        return this._state;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo110887c() {
        return "CancellableContinuation";
    }

    /* renamed from: d */
    public final C52625c<T> mo110791d() {
        return this.f131977d;
    }

    public C52628e getContext() {
        return this.f131976a;
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* renamed from: a */
    public final boolean mo110936a(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof C53283bz)) {
                return false;
            }
            z = obj instanceof C53302h;
        } while (!f131975c.compareAndSet(this, obj, new C53345m(this, th, z)));
        if (z) {
            try {
                ((C53302h) obj).mo110795a(th);
            } catch (Throwable th2) {
                C52628e context = getContext();
                StringBuilder sb = new StringBuilder("Exception in cancellation handler for ");
                sb.append(this);
                C53194ab.m113022a(context, new C53358x(sb.toString(), th2), null);
            }
        }
        m113396j();
        m113388a(0);
        return true;
    }

    /* renamed from: f */
    private boolean m113392f() {
        if (!(this._state instanceof C53283bz)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private final void m113396j() {
        C53226aw awVar = this.parentHandle;
        if (awVar != null) {
            awVar.mo110788a();
            this.parentHandle = C53282by.f131910a;
        }
    }

    public C52617e getCallerFrame() {
        C52625c<T> cVar = this.f131977d;
        if (!(cVar instanceof C52617e)) {
            cVar = null;
        }
        return (C52617e) cVar;
    }

    /* renamed from: h */
    private final boolean m113394h() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f131974b.compareAndSet(this, 0, 1));
        return true;
    }

    /* renamed from: i */
    private final boolean m113395i() {
        do {
            switch (this._decision) {
                case 0:
                    break;
                case 1:
                    return false;
                default:
                    throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f131974b.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: b */
    public final Object mo110937b() {
        m113393g();
        if (m113394h()) {
            return C52601b.m112157a();
        }
        Object obj = this._state;
        if (!(obj instanceof C53354t)) {
            return mo110793a(obj);
        }
        throw C53331t.m113355a(((C53354t) obj).f131987b, (C52625c<?>) this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo110887c());
        sb.append('(');
        sb.append(C53203ai.m113028a(this.f131977d));
        sb.append("){");
        sb.append(this._state);
        sb.append("}@");
        sb.append(C53203ai.m113029a((Object) this));
        return sb.toString();
    }

    /* renamed from: g */
    private final void m113393g() {
        if (!m113392f()) {
            C53263bl blVar = (C53263bl) this.f131977d.getContext().get(C53263bl.f131892c);
            if (blVar != null) {
                blVar.mo110867l();
                C53226aw a = C53264a.m113182a(blVar, true, false, new C53346n(blVar, this), 2, null);
                this.parentHandle = a;
                if (m113392f()) {
                    a.mo110788a();
                    this.parentHandle = C53282by.f131910a;
                }
            }
        }
    }

    /* renamed from: a */
    private final void m113388a(int i) {
        if (!m113395i()) {
            C53223at.m113065a((C53224au<? super T>) this, i);
        }
    }

    public void resumeWith(Object obj) {
        m113390a(C53355u.m113421a(obj), this.f131806e);
    }

    /* renamed from: c */
    private static void m113391c(Object obj) {
        StringBuilder sb = new StringBuilder("Already resumed, but proposed with update ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* renamed from: a */
    public final <T> T mo110793a(Object obj) {
        if (obj instanceof C53356v) {
            return ((C53356v) obj).f131988a;
        }
        return obj;
    }

    /* renamed from: a */
    public Throwable mo110886a(C53263bl blVar) {
        C52711k.m112240b(blVar, "parent");
        return blVar.mo110866k();
    }

    /* renamed from: a */
    public final void mo110933a(C52671b<? super Throwable, C52860x> bVar) {
        Object obj;
        C52711k.m112240b(bVar, "handler");
        C53302h hVar = null;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof C53230b) {
                if (hVar == null) {
                    if (bVar instanceof C53302h) {
                        hVar = (C53302h) bVar;
                    } else {
                        hVar = new C53260bi(bVar);
                    }
                }
                if (f131975c.compareAndSet(this, obj2, hVar)) {
                    return;
                }
            } else if (obj2 instanceof C53302h) {
                m113389a(bVar, obj2);
            } else if (obj2 instanceof C53345m) {
                if (!C53345m.f131978a.compareAndSet((C53345m) obj2, 0, 1)) {
                    m113389a(bVar, obj2);
                }
                try {
                    if (!(obj2 instanceof C53354t)) {
                        obj2 = null;
                    }
                    C53354t tVar = (C53354t) obj2;
                    if (tVar != null) {
                        obj = tVar.f131987b;
                    } else {
                        obj = null;
                    }
                    bVar.invoke(obj);
                    return;
                } catch (Throwable th) {
                    C52628e context = getContext();
                    StringBuilder sb = new StringBuilder("Exception in cancellation handler for ");
                    sb.append(this);
                    C53194ab.m113022a(context, new C53358x(sb.toString(), th), null);
                    return;
                }
            } else {
                return;
            }
        }
    }

    public C53343k(C52625c<? super T> cVar, int i) {
        C52711k.m112240b(cVar, "delegate");
        super(1);
        this.f131977d = cVar;
    }

    /* renamed from: a */
    private static void m113389a(C52671b<? super Throwable, C52860x> bVar, Object obj) {
        StringBuilder sb = new StringBuilder("It's prohibited to register multiple handlers, tried to register ");
        sb.append(bVar);
        sb.append(", already has ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* renamed from: a */
    private final void m113390a(Object obj, int i) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof C53283bz) {
                if (f131975c.compareAndSet(this, obj2, obj)) {
                    m113396j();
                    m113388a(i);
                    return;
                }
            } else if (!(obj2 instanceof C53345m) || !((C53345m) obj2).mo110939a()) {
                m113391c(obj);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo110935a(Throwable th, int i) {
        C52711k.m112240b(th, "exception");
        m113390a((Object) new C53354t(th), 0);
    }

    /* renamed from: a */
    public final void mo110934a(C53360z zVar, T t) {
        int i;
        C52711k.m112240b(zVar, "receiver$0");
        C52625c<T> cVar = this.f131977d;
        C53360z zVar2 = null;
        if (!(cVar instanceof C53221ar)) {
            cVar = null;
        }
        C53221ar arVar = (C53221ar) cVar;
        if (arVar != null) {
            zVar2 = arVar.f131801c;
        }
        if (zVar2 == zVar) {
            i = 3;
        } else {
            i = this.f131806e;
        }
        m113390a((Object) t, i);
    }
}
