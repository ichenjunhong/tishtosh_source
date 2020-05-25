package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.internal.i */
public class C53317i {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f131938a = AtomicReferenceFieldUpdater.newUpdater(C53317i.class, Object.class, "_removedRef");

    /* renamed from: c */
    static final AtomicReferenceFieldUpdater f131939c = AtomicReferenceFieldUpdater.newUpdater(C53317i.class, Object.class, "_next");

    /* renamed from: d */
    static final AtomicReferenceFieldUpdater f131940d = AtomicReferenceFieldUpdater.newUpdater(C53317i.class, Object.class, "_prev");
    volatile Object _next = this;
    volatile Object _prev = this;
    private volatile Object _removedRef;

    /* renamed from: kotlinx.coroutines.internal.i$a */
    public static abstract class C53318a extends C53307d<C53317i> {

        /* renamed from: d */
        public C53317i f131941d;

        /* renamed from: e */
        public final C53317i f131942e;

        public C53318a(C53317i iVar) {
            C52711k.m112240b(iVar, "newNode");
            this.f131942e = iVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo110901a(Object obj, Object obj2) {
            boolean z;
            C53317i iVar;
            C53317i iVar2 = (C53317i) obj;
            C52711k.m112240b(iVar2, "affected");
            if (obj2 == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                iVar = this.f131942e;
            } else {
                iVar = this.f131941d;
            }
            if (iVar != null && C53317i.f131939c.compareAndSet(iVar2, this, iVar) && z) {
                C53317i iVar3 = this.f131942e;
                C53317i iVar4 = this.f131941d;
                if (iVar4 == null) {
                    C52711k.m112234a();
                }
                iVar3.mo110907b(iVar4);
            }
        }
    }

    /* renamed from: d */
    public final boolean mo110908d() {
        return mo110909e() instanceof C53328q;
    }

    /* renamed from: e */
    public final Object mo110909e() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof C53327p)) {
                return obj;
            }
            ((C53327p) obj).mo110902b(this);
        }
    }

    /* renamed from: f */
    public final C53317i mo110910f() {
        return C53316h.m113308a(mo110909e());
    }

    /* renamed from: h */
    public final C53317i mo110912h() {
        return C53316h.m113308a(mo110911g());
    }

    /* renamed from: i */
    private C53328q m113310i() {
        C53328q qVar = (C53328q) this._removedRef;
        if (qVar != null) {
            return qVar;
        }
        C53328q qVar2 = new C53328q(this);
        f131938a.lazySet(this, qVar2);
        return qVar2;
    }

    /* renamed from: j */
    private final C53317i m113311j() {
        Object obj;
        C53317i iVar;
        do {
            obj = this._prev;
            if (obj instanceof C53328q) {
                return ((C53328q) obj).f131957a;
            }
            if (obj == this) {
                iVar = m113312k();
            } else if (obj != null) {
                iVar = (C53317i) obj;
            } else {
                throw new C52857u("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (!f131940d.compareAndSet(this, obj, iVar.m113310i()));
        return (C53317i) obj;
    }

    /* renamed from: k */
    private final C53317i m113312k() {
        boolean z;
        C53317i iVar = this;
        C53317i iVar2 = iVar;
        while (!(iVar2 instanceof C53315g)) {
            iVar2 = iVar2.mo110910f();
            if (iVar2 != iVar) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (!z) {
                throw new IllegalStateException("Cannot loop to this while looking for list head".toString());
            }
        }
        return iVar2;
    }

    /* renamed from: g */
    public final Object mo110911g() {
        while (true) {
            Object obj = this._prev;
            if (obj instanceof C53328q) {
                return obj;
            }
            if (obj != null) {
                C53317i iVar = (C53317i) obj;
                if (iVar.mo110909e() == this) {
                    return obj;
                }
                m113309a(iVar, null);
            } else {
                throw new C52857u("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }

    /* renamed from: c */
    public boolean mo110904c() {
        Object e;
        C53317i iVar;
        C53317i iVar2;
        Object e2;
        do {
            e = mo110909e();
            if (e instanceof C53328q) {
                return false;
            }
            iVar = this;
            if (e == iVar) {
                return false;
            }
            if (e != null) {
                iVar2 = (C53317i) e;
            } else {
                throw new C52857u("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (!f131939c.compareAndSet(this, e, iVar2.m113310i()));
        C53317i j = m113311j();
        Object obj = this._next;
        if (obj != null) {
            C53317i iVar3 = j;
            C53317i iVar4 = null;
            loop1:
            while (true) {
                C53317i iVar5 = ((C53328q) obj).f131957a;
                while (true) {
                    e2 = iVar5.mo110909e();
                    if (!(e2 instanceof C53328q)) {
                        Object e3 = iVar3.mo110909e();
                        if (!(e3 instanceof C53328q)) {
                            if (e3 == iVar) {
                                if (f131939c.compareAndSet(iVar3, this, iVar5)) {
                                    break loop1;
                                }
                            } else if (e3 != null) {
                                C53317i iVar6 = (C53317i) e3;
                                if (iVar6 == iVar5) {
                                    break loop1;
                                }
                                C53317i iVar7 = iVar3;
                                iVar3 = iVar6;
                                iVar4 = iVar7;
                            } else {
                                throw new C52857u("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                            }
                        } else if (iVar4 != null) {
                            iVar3.m113311j();
                            f131939c.compareAndSet(iVar4, iVar3, ((C53328q) e3).f131957a);
                            iVar3 = iVar4;
                            iVar4 = null;
                        } else {
                            iVar3 = C53316h.m113308a(iVar3._prev);
                        }
                    } else {
                        break;
                    }
                }
                iVar5.m113311j();
                obj = e2;
            }
            iVar2.m113309a(C53316h.m113308a(this._prev), null);
            return true;
        }
        throw new C52857u("null cannot be cast to non-null type kotlinx.coroutines.internal.Removed");
    }

    /* renamed from: b */
    public final void mo110907b(C53317i iVar) {
        Object obj;
        do {
            obj = iVar._prev;
            if ((obj instanceof C53328q) || mo110909e() != iVar) {
                return;
            }
        } while (!f131940d.compareAndSet(iVar, obj, this));
        if (mo110909e() instanceof C53328q) {
            if (obj != null) {
                iVar.m113309a((C53317i) obj, null);
            } else {
                throw new C52857u("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        }
    }

    /* renamed from: a */
    public final boolean mo110906a(C53317i iVar) {
        C52711k.m112240b(iVar, "node");
        f131940d.lazySet(iVar, this);
        f131939c.lazySet(iVar, this);
        while (mo110909e() == this) {
            if (f131939c.compareAndSet(this, this, iVar)) {
                iVar.mo110907b(this);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private C53317i m113309a(C53317i iVar, C53327p pVar) {
        Object obj;
        while (true) {
            C53317i iVar2 = null;
            while (true) {
                obj = iVar._next;
                if (obj == null) {
                    return iVar;
                }
                if (obj instanceof C53327p) {
                    ((C53327p) obj).mo110902b(iVar);
                } else if (!(obj instanceof C53328q)) {
                    Object obj2 = this._prev;
                    if (obj2 instanceof C53328q) {
                        return null;
                    }
                    if (obj != this) {
                        if (obj != null) {
                            iVar2 = iVar;
                            iVar = (C53317i) obj;
                        } else {
                            throw new C52857u("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                        }
                    } else if (obj2 == iVar) {
                        return null;
                    } else {
                        if (f131940d.compareAndSet(this, obj2, iVar) && !(iVar._prev instanceof C53328q)) {
                            return null;
                        }
                    }
                } else if (iVar2 != null) {
                    break;
                } else {
                    iVar = C53316h.m113308a(iVar._prev);
                }
            }
            iVar.m113311j();
            f131939c.compareAndSet(iVar2, iVar, ((C53328q) obj).f131957a);
            iVar = iVar2;
        }
    }

    /* renamed from: a */
    public final int mo110905a(C53317i iVar, C53317i iVar2, C53318a aVar) {
        C52711k.m112240b(iVar, "node");
        C52711k.m112240b(iVar2, "next");
        C52711k.m112240b(aVar, "condAdd");
        f131940d.lazySet(iVar, this);
        f131939c.lazySet(iVar, iVar2);
        aVar.f131941d = iVar2;
        if (!f131939c.compareAndSet(this, iVar2, aVar)) {
            return 0;
        }
        if (aVar.mo110902b(this) == null) {
            return 1;
        }
        return 2;
    }
}
