package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C53263bl.C53264a;
import kotlinx.coroutines.internal.C53316h;
import kotlinx.coroutines.internal.C53317i;
import kotlinx.coroutines.internal.C53317i.C53318a;
import kotlinx.coroutines.internal.C53327p;
import kotlinx.coroutines.internal.C53331t;
import p2628d.C52546a;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.C52628e;
import p2628d.p2631c.C52628e.C52631b;
import p2628d.p2631c.C52628e.C52631b.C52632a;
import p2628d.p2631c.C52628e.C52633c;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.bs */
public class C53272bs implements C53263bl, C53285ca, C53349q {

    /* renamed from: d */
    static final AtomicReferenceFieldUpdater f131895d = AtomicReferenceFieldUpdater.newUpdater(C53272bs.class, Object.class, "_state");
    private volatile Object _state;
    private volatile C53347o parentHandle;

    /* renamed from: kotlinx.coroutines.bs$a */
    static final class C53273a<T> extends C53343k<T> {

        /* renamed from: a */
        private final C53272bs f131896a;

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final String mo110887c() {
            return "AwaitContinuation";
        }

        /* renamed from: a */
        public final Throwable mo110886a(C53263bl blVar) {
            C52711k.m112240b(blVar, "parent");
            Object n = this.f131896a.mo110883n();
            if (n instanceof C53275c) {
                Throwable th = ((C53275c) n).rootCause;
                if (th != null) {
                    return th;
                }
            }
            if (n instanceof C53354t) {
                return ((C53354t) n).f131987b;
            }
            return blVar.mo110866k();
        }

        public C53273a(C52625c<? super T> cVar, C53272bs bsVar) {
            C52711k.m112240b(cVar, "delegate");
            C52711k.m112240b(bsVar, "job");
            super(cVar, 1);
            this.f131896a = bsVar;
        }
    }

    /* renamed from: kotlinx.coroutines.bs$b */
    static final class C53274b extends C53271br<C53263bl> {

        /* renamed from: a */
        private final C53272bs f131897a;

        /* renamed from: e */
        private final C53275c f131898e;

        /* renamed from: f */
        private final C53348p f131899f;

        /* renamed from: g */
        private final Object f131900g;

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChildCompletion[");
            sb.append(this.f131899f);
            sb.append(", ");
            sb.append(this.f131900g);
            sb.append(']');
            return sb.toString();
        }

        public final /* synthetic */ Object invoke(Object obj) {
            mo110797a((Throwable) obj);
            return C52860x.f131107a;
        }

        /* renamed from: a */
        public final void mo110797a(Throwable th) {
            boolean z;
            C53272bs bsVar = this.f131897a;
            C53275c cVar = this.f131898e;
            C53348p pVar = this.f131899f;
            Object obj = this.f131900g;
            if (bsVar.mo110883n() == cVar) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C53348p a = C53272bs.m113195a((C53317i) pVar);
                if (a == null || !bsVar.mo110880a(cVar, a, obj)) {
                    bsVar.mo110879a(cVar, obj, 0);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public C53274b(C53272bs bsVar, C53275c cVar, C53348p pVar, Object obj) {
            C52711k.m112240b(bsVar, "parent");
            C52711k.m112240b(cVar, "state");
            C52711k.m112240b(pVar, "child");
            super(pVar.f131981a);
            this.f131897a = bsVar;
            this.f131898e = cVar;
            this.f131899f = pVar;
            this.f131900g = obj;
        }
    }

    /* renamed from: kotlinx.coroutines.bs$c */
    static final class C53275c implements C53258bg {
        volatile Object _exceptionsHolder;

        /* renamed from: a */
        private final C53281bx f131901a;
        public volatile boolean isCompleting = false;
        public volatile Throwable rootCause;

        public final C53281bx cD_() {
            return this.f131901a;
        }

        /* renamed from: e */
        static ArrayList<Throwable> m113241e() {
            return new ArrayList<>(4);
        }

        /* renamed from: b */
        public final boolean mo110799b() {
            if (this.rootCause == null) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public final boolean mo110890d() {
            if (this.rootCause != null) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public final boolean mo110889c() {
            if (this._exceptionsHolder == C53277bt.f131905a) {
                return true;
            }
            return false;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Finishing[cancelling=");
            sb.append(mo110890d());
            sb.append(", completing=");
            sb.append(this.isCompleting);
            sb.append(", rootCause=");
            sb.append(this.rootCause);
            sb.append(", exceptions=");
            sb.append(this._exceptionsHolder);
            sb.append(", list=");
            sb.append(cD_());
            sb.append(']');
            return sb.toString();
        }

        /* renamed from: a */
        public final void mo110888a(Throwable th) {
            C52711k.m112240b(th, "exception");
            Throwable th2 = this.rootCause;
            if (th2 == null) {
                this.rootCause = th;
            } else if (th != th2) {
                Object obj = this._exceptionsHolder;
                if (obj == null) {
                    this._exceptionsHolder = th;
                } else if (obj instanceof Throwable) {
                    if (th != obj) {
                        ArrayList e = m113241e();
                        e.add(obj);
                        e.add(th);
                        this._exceptionsHolder = e;
                    }
                } else if (!(obj instanceof ArrayList)) {
                    StringBuilder sb = new StringBuilder("State is ");
                    sb.append(obj);
                    throw new IllegalStateException(sb.toString().toString());
                } else if (obj != null) {
                    ((ArrayList) obj).add(th);
                } else {
                    throw new C52857u("null cannot be cast to non-null type kotlin.collections.ArrayList<kotlin.Throwable> /* = java.util.ArrayList<kotlin.Throwable> */");
                }
            }
        }

        public C53275c(C53281bx bxVar, boolean z, Throwable th) {
            C52711k.m112240b(bxVar, "list");
            this.f131901a = bxVar;
            this.rootCause = th;
        }
    }

    /* renamed from: kotlinx.coroutines.bs$d */
    public static final class C53276d extends C53318a {

        /* renamed from: a */
        final /* synthetic */ C53317i f131902a;

        /* renamed from: b */
        final /* synthetic */ C53272bs f131903b;

        /* renamed from: c */
        final /* synthetic */ Object f131904c;

        /* renamed from: a */
        public final /* synthetic */ Object mo110892a(Object obj) {
            boolean z;
            C52711k.m112240b((C53317i) obj, "affected");
            if (this.f131903b.mo110883n() == this.f131904c) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            return C53316h.f131934a;
        }

        public C53276d(C53317i iVar, C53317i iVar2, C53272bs bsVar, Object obj) {
            this.f131902a = iVar;
            this.f131903b = bsVar;
            this.f131904c = obj;
            super(iVar2);
        }
    }

    /* renamed from: a */
    public void mo110752a(Object obj, int i, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo110873c() {
        return true;
    }

    public boolean cB_() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo110882d(Throwable th) {
        C52711k.m112240b(th, "exception");
    }

    /* renamed from: e */
    public void mo110758e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo110780h() {
        return false;
    }

    /* renamed from: a */
    public final void mo110876a(C53263bl blVar) {
        if (!(this.parentHandle == null)) {
            throw new IllegalStateException("Check failed.".toString());
        } else if (blVar == null) {
            this.parentHandle = C53282by.f131910a;
        } else {
            blVar.mo110867l();
            C53347o a = blVar.mo110861a((C53349q) this);
            this.parentHandle = a;
            if (mo110864i()) {
                a.mo110788a();
                this.parentHandle = C53282by.f131910a;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo110879a(C53275c cVar, Object obj, int i) {
        ArrayList arrayList;
        Throwable a;
        boolean z = false;
        if (!(mo110883n() == cVar)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!(!cVar.mo110889c())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (cVar.isCompleting) {
            Throwable th = null;
            C53354t tVar = (C53354t) (!(obj instanceof C53354t) ? null : obj);
            if (tVar != null) {
                th = tVar.f131987b;
            }
            synchronized (cVar) {
                Object obj2 = cVar._exceptionsHolder;
                if (obj2 == null) {
                    arrayList = C53275c.m113241e();
                } else if (obj2 instanceof Throwable) {
                    ArrayList e = C53275c.m113241e();
                    e.add(obj2);
                    arrayList = e;
                } else if (!(obj2 instanceof ArrayList)) {
                    StringBuilder sb = new StringBuilder("State is ");
                    sb.append(obj2);
                    throw new IllegalStateException(sb.toString().toString());
                } else if (obj2 != null) {
                    arrayList = (ArrayList) obj2;
                } else {
                    throw new C52857u("null cannot be cast to non-null type kotlin.collections.ArrayList<kotlin.Throwable> /* = java.util.ArrayList<kotlin.Throwable> */");
                }
                Throwable th2 = cVar.rootCause;
                if (th2 != null) {
                    arrayList.add(0, th2);
                }
                if (th != null && (!C52711k.m112239a((Object) th, (Object) th2))) {
                    arrayList.add(th);
                }
                cVar._exceptionsHolder = C53277bt.f131905a;
                List list = arrayList;
                a = m113191a(cVar, list);
                if (a != null && (m113200a(a, list) || a != cVar.rootCause)) {
                    z = true;
                }
            }
            if (!(a == null || a == th)) {
                obj = new C53354t(a);
            }
            if (a != null && !m113208e(a)) {
                mo110882d(a);
            }
            if (f131895d.compareAndSet(this, cVar, C53277bt.m113247a(obj))) {
                m113196a(cVar, obj, i, z);
                return true;
            }
            StringBuilder sb2 = new StringBuilder("Unexpected state: ");
            sb2.append(this._state);
            sb2.append(", expected: ");
            sb2.append(cVar);
            sb2.append(", update: ");
            sb2.append(obj);
            throw new IllegalArgumentException(sb2.toString().toString());
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: a */
    private static boolean m113200a(Throwable th, List<? extends Throwable> list) {
        boolean z = false;
        if (list.size() <= 1) {
            return false;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        C52711k.m112236a((Object) newSetFromMap, "Collections.newSetFromMa…ityHashMap(expectedSize))");
        for (Throwable a : list) {
            Throwable a2 = C53331t.m113353a(a);
            if (a2 != th && !(a2 instanceof CancellationException) && newSetFromMap.add(a2)) {
                C52546a.m112152a(th, a2);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    private final boolean m113201a(C53258bg bgVar, Object obj, int i) {
        if ((bgVar instanceof C53229az) || (bgVar instanceof C53271br)) {
            if (!(!(obj instanceof C53354t))) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!f131895d.compareAndSet(this, bgVar, C53277bt.m113247a(obj))) {
                return false;
            } else {
                m113196a(bgVar, obj, i, false);
                return true;
            }
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo110875a(Object obj) {
        if (obj instanceof C53229az) {
            if (((C53229az) obj).mo110799b()) {
                return 0;
            }
            if (!f131895d.compareAndSet(this, obj, C53277bt.f131907c)) {
                return -1;
            }
            mo110758e();
            return 1;
        } else if (!(obj instanceof C53257bf)) {
            return 0;
        } else {
            if (!f131895d.compareAndSet(this, obj, ((C53257bf) obj).cD_())) {
                return -1;
            }
            mo110758e();
            return 1;
        }
    }

    /* renamed from: a */
    private final void m113197a(C53271br<?> brVar) {
        brVar.mo110906a(new C53281bx());
        f131895d.compareAndSet(this, brVar, brVar.mo110910f());
    }

    /* renamed from: a */
    public final void mo110877a(C53285ca caVar) {
        C52711k.m112240b(caVar, "parentJob");
        m113203b((Object) caVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo110880a(C53275c cVar, C53348p pVar, Object obj) {
        while (C53264a.m113182a(pVar.f131981a, false, false, new C53274b(this, cVar, pVar, obj), 1, null) == C53282by.f131910a) {
            pVar = m113195a((C53317i) pVar);
            if (pVar == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final C53347o mo110861a(C53349q qVar) {
        C52711k.m112240b(qVar, "child");
        C53226aw a = C53264a.m113182a(this, true, false, new C53348p(this, qVar), 2, null);
        if (a != null) {
            return (C53347o) a;
        }
        throw new C52857u("null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
    }

    /* renamed from: a */
    private final void m113198a(C53281bx bxVar, Throwable th) {
        Object e = bxVar.mo110909e();
        if (e != null) {
            Throwable th2 = null;
            for (C53317i iVar = (C53317i) e; !C52711k.m112239a((Object) iVar, (Object) bxVar); iVar = iVar.mo110910f()) {
                if (iVar instanceof C53267bn) {
                    C53271br brVar = (C53271br) iVar;
                    try {
                        brVar.mo110797a(th);
                    } catch (Throwable th3) {
                        if (th2 != null) {
                            C52546a.m112152a(th2, th3);
                            if (th2 != null) {
                            }
                        }
                        C53272bs bsVar = this;
                        StringBuilder sb = new StringBuilder("Exception in completion handler ");
                        sb.append(brVar);
                        sb.append(" for ");
                        sb.append(bsVar);
                        th2 = new C53358x(sb.toString(), th3);
                    }
                }
            }
            if (th2 != null) {
                mo110753a(th2);
            }
            m113208e(th);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r4v10, types: [kotlinx.coroutines.bf] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.coroutines.C53226aw mo110860a(boolean r8, boolean r9, p2628d.p2639f.p2640a.C52671b<? super java.lang.Throwable, p2628d.C52860x> r10) {
        /*
            r7 = this;
            java.lang.String r0 = "handler"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r0)
            r0 = 0
            r1 = r0
        L_0x0007:
            java.lang.Object r2 = r7.mo110883n()
            boolean r3 = r2 instanceof kotlinx.coroutines.C53229az
            if (r3 == 0) goto L_0x0045
            r3 = r2
            kotlinx.coroutines.az r3 = (kotlinx.coroutines.C53229az) r3
            boolean r4 = r3.mo110799b()
            if (r4 == 0) goto L_0x0029
            if (r1 != 0) goto L_0x001e
            kotlinx.coroutines.br r1 = r7.m113193a(r10, r8)
        L_0x001e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f131895d
            boolean r2 = r3.compareAndSet(r7, r2, r1)
            if (r2 == 0) goto L_0x0007
            kotlinx.coroutines.aw r1 = (kotlinx.coroutines.C53226aw) r1
            return r1
        L_0x0029:
            kotlinx.coroutines.bx r2 = new kotlinx.coroutines.bx
            r2.<init>()
            boolean r4 = r3.mo110799b()
            if (r4 == 0) goto L_0x0037
            kotlinx.coroutines.bg r2 = (kotlinx.coroutines.C53258bg) r2
            goto L_0x003f
        L_0x0037:
            kotlinx.coroutines.bf r4 = new kotlinx.coroutines.bf
            r4.<init>(r2)
            r2 = r4
            kotlinx.coroutines.bg r2 = (kotlinx.coroutines.C53258bg) r2
        L_0x003f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f131895d
            r4.compareAndSet(r7, r3, r2)
            goto L_0x0007
        L_0x0045:
            boolean r3 = r2 instanceof kotlinx.coroutines.C53258bg
            if (r3 == 0) goto L_0x00b4
            r3 = r2
            kotlinx.coroutines.bg r3 = (kotlinx.coroutines.C53258bg) r3
            kotlinx.coroutines.bx r3 = r3.cD_()
            if (r3 != 0) goto L_0x0062
            if (r2 == 0) goto L_0x005a
            kotlinx.coroutines.br r2 = (kotlinx.coroutines.C53271br) r2
            r7.m113197a(r2)
            goto L_0x0007
        L_0x005a:
            d.u r8 = new d.u
            java.lang.String r9 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode<*>"
            r8.<init>(r9)
            throw r8
        L_0x0062:
            kotlinx.coroutines.by r4 = kotlinx.coroutines.C53282by.f131910a
            kotlinx.coroutines.aw r4 = (kotlinx.coroutines.C53226aw) r4
            if (r8 == 0) goto L_0x009c
            boolean r5 = r2 instanceof kotlinx.coroutines.C53272bs.C53275c
            if (r5 == 0) goto L_0x009c
            monitor-enter(r2)
            r5 = r2
            kotlinx.coroutines.bs$c r5 = (kotlinx.coroutines.C53272bs.C53275c) r5     // Catch:{ all -> 0x0099 }
            java.lang.Throwable r5 = r5.rootCause     // Catch:{ all -> 0x0099 }
            if (r5 == 0) goto L_0x007f
            boolean r6 = r10 instanceof kotlinx.coroutines.C53348p     // Catch:{ all -> 0x0099 }
            if (r6 == 0) goto L_0x0097
            r6 = r2
            kotlinx.coroutines.bs$c r6 = (kotlinx.coroutines.C53272bs.C53275c) r6     // Catch:{ all -> 0x0099 }
            boolean r6 = r6.isCompleting     // Catch:{ all -> 0x0099 }
            if (r6 != 0) goto L_0x0097
        L_0x007f:
            if (r1 != 0) goto L_0x0085
            kotlinx.coroutines.br r1 = r7.m113193a(r10, r8)     // Catch:{ all -> 0x0099 }
        L_0x0085:
            boolean r4 = r7.m113199a(r2, r3, r1)     // Catch:{ all -> 0x0099 }
            if (r4 != 0) goto L_0x008e
            monitor-exit(r2)
            goto L_0x0007
        L_0x008e:
            if (r5 != 0) goto L_0x0094
            kotlinx.coroutines.aw r1 = (kotlinx.coroutines.C53226aw) r1     // Catch:{ all -> 0x0099 }
            monitor-exit(r2)
            return r1
        L_0x0094:
            r4 = r1
            kotlinx.coroutines.aw r4 = (kotlinx.coroutines.C53226aw) r4     // Catch:{ all -> 0x0099 }
        L_0x0097:
            monitor-exit(r2)
            goto L_0x009d
        L_0x0099:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L_0x009c:
            r5 = r0
        L_0x009d:
            if (r5 == 0) goto L_0x00a5
            if (r9 == 0) goto L_0x00a4
            r10.invoke(r5)
        L_0x00a4:
            return r4
        L_0x00a5:
            if (r1 != 0) goto L_0x00ab
            kotlinx.coroutines.br r1 = r7.m113193a(r10, r8)
        L_0x00ab:
            boolean r2 = r7.m113199a(r2, r3, r1)
            if (r2 == 0) goto L_0x0007
            kotlinx.coroutines.aw r1 = (kotlinx.coroutines.C53226aw) r1
            return r1
        L_0x00b4:
            if (r9 == 0) goto L_0x00c4
            boolean r8 = r2 instanceof kotlinx.coroutines.C53354t
            if (r8 != 0) goto L_0x00bb
            r2 = r0
        L_0x00bb:
            kotlinx.coroutines.t r2 = (kotlinx.coroutines.C53354t) r2
            if (r2 == 0) goto L_0x00c1
            java.lang.Throwable r0 = r2.f131987b
        L_0x00c1:
            r10.invoke(r0)
        L_0x00c4:
            kotlinx.coroutines.by r8 = kotlinx.coroutines.C53282by.f131910a
            kotlinx.coroutines.aw r8 = (kotlinx.coroutines.C53226aw) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C53272bs.mo110860a(boolean, boolean, d.f.a.b):kotlinx.coroutines.aw");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0009 A[LOOP_START] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m113199a(java.lang.Object r2, kotlinx.coroutines.C53281bx r3, kotlinx.coroutines.C53271br<?> r4) {
        /*
            r1 = this;
            kotlinx.coroutines.bs$d r0 = new kotlinx.coroutines.bs$d
            kotlinx.coroutines.internal.i r4 = (kotlinx.coroutines.internal.C53317i) r4
            r0.<init>(r4, r4, r1, r2)
            kotlinx.coroutines.internal.i$a r0 = (kotlinx.coroutines.internal.C53317i.C53318a) r0
        L_0x0009:
            java.lang.Object r2 = r3.mo110911g()
            if (r2 == 0) goto L_0x001d
            kotlinx.coroutines.internal.i r2 = (kotlinx.coroutines.internal.C53317i) r2
            int r2 = r2.mo110905a(r4, r3, r0)
            switch(r2) {
                case 1: goto L_0x001b;
                case 2: goto L_0x0019;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x0009
        L_0x0019:
            r2 = 0
            return r2
        L_0x001b:
            r2 = 1
            return r2
        L_0x001d:
            d.u r2 = new d.u
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C53272bs.m113199a(java.lang.Object, kotlinx.coroutines.bx, kotlinx.coroutines.br):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo110878a(java.lang.Object r3, int r4) {
        /*
            r2 = this;
        L_0x0000:
            java.lang.Object r0 = r2.mo110883n()
            int r0 = r2.m113190a(r0, r3, r4)
            switch(r0) {
                case 0: goto L_0x001d;
                case 1: goto L_0x001b;
                case 2: goto L_0x0019;
                case 3: goto L_0x0000;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "unexpected result"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            throw r3
        L_0x0019:
            r3 = 0
            return r3
        L_0x001b:
            r3 = 1
            return r3
        L_0x001d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Job "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = " is already complete or completing, but is being completed with "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.Throwable r3 = m113209f(r3)
            r4.<init>(r0, r3)
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C53272bs.mo110878a(java.lang.Object, int):boolean");
    }

    /* renamed from: g */
    public String mo110760g() {
        return C53203ai.m113030b(this);
    }

    public final C52633c<?> getKey() {
        return C53263bl.f131892c;
    }

    /* renamed from: m */
    public final void mo110868m() {
        mo110863b((Throwable) null);
    }

    /* renamed from: d */
    private final C53266bm mo110757d() {
        return new C53266bm("Job was cancelled", null, this);
    }

    /* renamed from: i */
    public final boolean mo110864i() {
        if (!(mo110883n() instanceof C53258bg)) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final Object mo110883n() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof C53327p)) {
                return obj;
            }
            ((C53327p) obj).mo110902b(this);
        }
    }

    /* renamed from: j */
    public final boolean mo110865j() {
        Object n = mo110883n();
        if ((n instanceof C53354t) || ((n instanceof C53275c) && ((C53275c) n).mo110890d())) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo110867l() {
        /*
            r1 = this;
        L_0x0000:
            java.lang.Object r0 = r1.mo110883n()
            int r0 = r1.mo110875a(r0)
            switch(r0) {
                case 0: goto L_0x000e;
                case 1: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0000
        L_0x000c:
            r0 = 1
            return r0
        L_0x000e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C53272bs.mo110867l():boolean");
    }

    /* renamed from: b */
    public boolean mo110755b() {
        Object n = mo110883n();
        if (!(n instanceof C53258bg) || !((C53258bg) n).mo110799b()) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mo110760g());
        sb2.append('{');
        sb2.append(m113210g(mo110883n()));
        sb2.append('}');
        sb.append(sb2.toString());
        sb.append('@');
        sb.append(C53203ai.m113029a((Object) this));
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r0 != null) goto L_0x0051;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.concurrent.CancellationException mo110866k() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.mo110883n()
            boolean r1 = r0 instanceof kotlinx.coroutines.C53272bs.C53275c
            if (r1 == 0) goto L_0x0031
            kotlinx.coroutines.bs$c r0 = (kotlinx.coroutines.C53272bs.C53275c) r0
            java.lang.Throwable r0 = r0.rootCause
            if (r0 == 0) goto L_0x0017
            java.lang.String r1 = "Job is cancelling"
            java.util.concurrent.CancellationException r0 = r4.m113192a(r0, r1)
            if (r0 == 0) goto L_0x0017
            goto L_0x0051
        L_0x0017:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Job is still new or active: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        L_0x0031:
            boolean r1 = r0 instanceof kotlinx.coroutines.C53258bg
            if (r1 != 0) goto L_0x0052
            boolean r1 = r0 instanceof kotlinx.coroutines.C53354t
            if (r1 == 0) goto L_0x0044
            kotlinx.coroutines.t r0 = (kotlinx.coroutines.C53354t) r0
            java.lang.Throwable r0 = r0.f131987b
            java.lang.String r1 = "Job was cancelled"
            java.util.concurrent.CancellationException r0 = r4.m113192a(r0, r1)
            return r0
        L_0x0044:
            kotlinx.coroutines.bm r0 = new kotlinx.coroutines.bm
            java.lang.String r1 = "Job has completed normally"
            r2 = 0
            r3 = r4
            kotlinx.coroutines.bl r3 = (kotlinx.coroutines.C53263bl) r3
            r0.<init>(r1, r2, r3)
            java.util.concurrent.CancellationException r0 = (java.util.concurrent.CancellationException) r0
        L_0x0051:
            return r0
        L_0x0052:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Job is still new or active: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C53272bs.mo110866k():java.util.concurrent.CancellationException");
    }

    /* renamed from: o */
    public final Throwable mo110884o() {
        Throwable th;
        Object n = mo110883n();
        if (n instanceof C53275c) {
            th = ((C53275c) n).rootCause;
        } else if (n instanceof C53258bg) {
            StringBuilder sb = new StringBuilder("Cannot be cancelling child in this state: ");
            sb.append(n);
            throw new IllegalStateException(sb.toString().toString());
        } else if (n instanceof C53354t) {
            th = ((C53354t) n).f131987b;
        } else {
            th = null;
        }
        if (th != null && (!mo110873c() || (th instanceof CancellationException))) {
            return th;
        }
        StringBuilder sb2 = new StringBuilder("Parent job is ");
        sb2.append(m113210g(n));
        return new C53266bm(sb2.toString(), th, this);
    }

    /* renamed from: a */
    public void mo110753a(Throwable th) {
        C52711k.m112240b(th, "exception");
        throw th;
    }

    public C53272bs(boolean z) {
        C53229az azVar;
        if (z) {
            azVar = C53277bt.f131907c;
        } else {
            azVar = C53277bt.f131906b;
        }
        this._state = azVar;
    }

    /* renamed from: f */
    private static Throwable m113209f(Object obj) {
        if (!(obj instanceof C53354t)) {
            obj = null;
        }
        C53354t tVar = (C53354t) obj;
        if (tVar != null) {
            return tVar.f131987b;
        }
        return null;
    }

    /* renamed from: a */
    public final C53226aw mo110859a(C52671b<? super Throwable, C52860x> bVar) {
        C52711k.m112240b(bVar, "handler");
        return mo110860a(false, true, bVar);
    }

    /* renamed from: b */
    public final boolean mo110863b(Throwable th) {
        if (!m113203b((Object) th) || !mo110873c()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private final boolean m113203b(Object obj) {
        if (!cB_() || !m113204c(obj)) {
            return m113207e(obj);
        }
        return true;
    }

    /* renamed from: e */
    private final boolean m113208e(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (!mo110780h()) {
            return false;
        }
        C53347o oVar = this.parentHandle;
        if (oVar == null || !oVar.mo110894b(th)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo110881c(Throwable th) {
        C52711k.m112240b(th, "cause");
        if (!m113203b((Object) th) || !mo110873c()) {
            return false;
        }
        return true;
    }

    public <E extends C52631b> E get(C52633c<E> cVar) {
        C52711k.m112240b(cVar, "key");
        C52711k.m112240b(cVar, "key");
        return C52632a.m112176a((C52631b) this, cVar);
    }

    public C52628e minusKey(C52633c<?> cVar) {
        C52711k.m112240b(cVar, "key");
        C52711k.m112240b(cVar, "key");
        return C52632a.m112179b(this, cVar);
    }

    public C52628e plus(C52628e eVar) {
        C52711k.m112240b(eVar, "context");
        C52711k.m112240b(eVar, "context");
        return C52632a.m112177a((C52631b) this, eVar);
    }

    /* renamed from: a */
    private final C53281bx m113194a(C53258bg bgVar) {
        C53281bx cD_ = bgVar.cD_();
        if (cD_ != null) {
            return cD_;
        }
        if (bgVar instanceof C53229az) {
            return new C53281bx();
        }
        if (bgVar instanceof C53271br) {
            m113197a((C53271br) bgVar);
            return null;
        }
        StringBuilder sb = new StringBuilder("State should have list: ");
        sb.append(bgVar);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* renamed from: d */
    private final Throwable m113205d(Object obj) {
        boolean z;
        if (obj != null) {
            z = obj instanceof Throwable;
        } else {
            z = true;
        }
        if (z) {
            if (obj != null) {
                return (Throwable) obj;
            }
            return mo110757d();
        } else if (obj != null) {
            return ((C53285ca) obj).mo110884o();
        } else {
            throw new C52857u("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    /* renamed from: g */
    private static String m113210g(Object obj) {
        if (obj instanceof C53275c) {
            C53275c cVar = (C53275c) obj;
            if (cVar.mo110890d()) {
                return "Cancelling";
            }
            if (cVar.isCompleting) {
                return "Completing";
            }
            return "Active";
        } else if (obj instanceof C53258bg) {
            if (((C53258bg) obj).mo110799b()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof C53354t) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m113204c(java.lang.Object r5) {
        /*
            r4 = this;
        L_0x0000:
            java.lang.Object r0 = r4.mo110883n()
            boolean r1 = r0 instanceof kotlinx.coroutines.C53258bg
            r2 = 0
            if (r1 == 0) goto L_0x0036
            boolean r1 = r0 instanceof kotlinx.coroutines.C53272bs.C53275c
            if (r1 == 0) goto L_0x0015
            r1 = r0
            kotlinx.coroutines.bs$c r1 = (kotlinx.coroutines.C53272bs.C53275c) r1
            boolean r1 = r1.isCompleting
            if (r1 == 0) goto L_0x0015
            goto L_0x0036
        L_0x0015:
            kotlinx.coroutines.t r1 = new kotlinx.coroutines.t
            java.lang.Throwable r3 = r4.m113205d(r5)
            r1.<init>(r3)
            int r0 = r4.m113190a(r0, r1, r2)
            switch(r0) {
                case 0: goto L_0x0035;
                case 1: goto L_0x0033;
                case 2: goto L_0x0033;
                case 3: goto L_0x0000;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected result"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            throw r5
        L_0x0033:
            r5 = 1
            return r5
        L_0x0035:
            return r2
        L_0x0036:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C53272bs.m113204c(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        if (r9 == null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        m113198a(((kotlinx.coroutines.C53272bs.C53275c) r2).cD_(), r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0046, code lost:
        return true;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m113207e(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r8.mo110883n()
            boolean r3 = r2 instanceof kotlinx.coroutines.C53272bs.C53275c
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x004a
            monitor-enter(r2)
            r3 = r2
            kotlinx.coroutines.bs$c r3 = (kotlinx.coroutines.C53272bs.C53275c) r3     // Catch:{ all -> 0x0047 }
            boolean r3 = r3.mo110889c()     // Catch:{ all -> 0x0047 }
            if (r3 == 0) goto L_0x0018
            monitor-exit(r2)
            return r5
        L_0x0018:
            r3 = r2
            kotlinx.coroutines.bs$c r3 = (kotlinx.coroutines.C53272bs.C53275c) r3     // Catch:{ all -> 0x0047 }
            boolean r3 = r3.mo110890d()     // Catch:{ all -> 0x0047 }
            if (r9 != 0) goto L_0x0023
            if (r3 != 0) goto L_0x002f
        L_0x0023:
            if (r1 != 0) goto L_0x0029
            java.lang.Throwable r1 = r8.m113205d(r9)     // Catch:{ all -> 0x0047 }
        L_0x0029:
            r9 = r2
            kotlinx.coroutines.bs$c r9 = (kotlinx.coroutines.C53272bs.C53275c) r9     // Catch:{ all -> 0x0047 }
            r9.mo110888a(r1)     // Catch:{ all -> 0x0047 }
        L_0x002f:
            r9 = r2
            kotlinx.coroutines.bs$c r9 = (kotlinx.coroutines.C53272bs.C53275c) r9     // Catch:{ all -> 0x0047 }
            java.lang.Throwable r9 = r9.rootCause     // Catch:{ all -> 0x0047 }
            r1 = r3 ^ 1
            if (r1 == 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r9 = r0
        L_0x003a:
            monitor-exit(r2)
            if (r9 == 0) goto L_0x0046
            kotlinx.coroutines.bs$c r2 = (kotlinx.coroutines.C53272bs.C53275c) r2
            kotlinx.coroutines.bx r0 = r2.cD_()
            r8.m113198a(r0, r9)
        L_0x0046:
            return r4
        L_0x0047:
            r9 = move-exception
            monitor-exit(r2)
            throw r9
        L_0x004a:
            boolean r3 = r2 instanceof kotlinx.coroutines.C53258bg
            if (r3 == 0) goto L_0x00d9
            if (r1 != 0) goto L_0x0054
            java.lang.Throwable r1 = r8.m113205d(r9)
        L_0x0054:
            r3 = r2
            kotlinx.coroutines.bg r3 = (kotlinx.coroutines.C53258bg) r3
            boolean r6 = r3.mo110799b()
            if (r6 == 0) goto L_0x00a4
            boolean r2 = r3 instanceof kotlinx.coroutines.C53272bs.C53275c
            if (r2 != 0) goto L_0x0063
            r2 = 1
            goto L_0x0064
        L_0x0063:
            r2 = 0
        L_0x0064:
            if (r2 == 0) goto L_0x0096
            boolean r2 = r3.mo110799b()
            if (r2 == 0) goto L_0x0088
            kotlinx.coroutines.bx r2 = r8.m113194a(r3)
            if (r2 != 0) goto L_0x0073
            goto L_0x0085
        L_0x0073:
            kotlinx.coroutines.bs$c r6 = new kotlinx.coroutines.bs$c
            r6.<init>(r2, r5, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f131895d
            boolean r3 = r7.compareAndSet(r8, r3, r6)
            if (r3 != 0) goto L_0x0081
            goto L_0x0085
        L_0x0081:
            r8.m113198a(r2, r1)
            r5 = 1
        L_0x0085:
            if (r5 == 0) goto L_0x0002
            return r4
        L_0x0088:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            throw r9
        L_0x0096:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            throw r9
        L_0x00a4:
            kotlinx.coroutines.t r3 = new kotlinx.coroutines.t
            r3.<init>(r1)
            int r3 = r8.m113190a(r2, r3, r5)
            switch(r3) {
                case 0: goto L_0x00bf;
                case 1: goto L_0x00be;
                case 2: goto L_0x00be;
                case 3: goto L_0x0002;
                default: goto L_0x00b0;
            }
        L_0x00b0:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected result"
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            throw r9
        L_0x00be:
            return r4
        L_0x00bf:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Cannot happen in "
            r9.<init>(r0)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x00d9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C53272bs.m113207e(java.lang.Object):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo110862b(p2628d.p2631c.C52625c<? super p2628d.C52860x> r6) {
        /*
            r5 = this;
        L_0x0000:
            java.lang.Object r0 = r5.mo110883n()
            boolean r1 = r0 instanceof kotlinx.coroutines.C53258bg
            r2 = 1
            if (r1 != 0) goto L_0x000b
            r0 = 0
            goto L_0x0012
        L_0x000b:
            int r0 = r5.mo110875a(r0)
            if (r0 < 0) goto L_0x0000
            r0 = 1
        L_0x0012:
            if (r0 != 0) goto L_0x003a
            d.c.e r6 = r6.getContext()
            java.lang.String r0 = "receiver$0"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            kotlinx.coroutines.bl$b r0 = kotlinx.coroutines.C53263bl.f131892c
            d.c.e$c r0 = (p2628d.p2631c.C52628e.C52633c) r0
            d.c.e$b r6 = r6.get(r0)
            kotlinx.coroutines.bl r6 = (kotlinx.coroutines.C53263bl) r6
            if (r6 == 0) goto L_0x0037
            boolean r0 = r6.mo110755b()
            if (r0 == 0) goto L_0x0030
            goto L_0x0037
        L_0x0030:
            java.util.concurrent.CancellationException r6 = r6.mo110866k()
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            throw r6
        L_0x0037:
            d.x r6 = p2628d.C52860x.f131107a
            return r6
        L_0x003a:
            kotlinx.coroutines.k r0 = new kotlinx.coroutines.k
            d.c.c r1 = p2628d.p2631c.p2632a.C52601b.m112154a(r6)
            r0.<init>(r1, r2)
            r1 = r0
            kotlinx.coroutines.j r1 = (kotlinx.coroutines.C53342j) r1
            kotlinx.coroutines.cd r2 = new kotlinx.coroutines.cd
            r3 = r5
            kotlinx.coroutines.bl r3 = (kotlinx.coroutines.C53263bl) r3
            r4 = r1
            d.c.c r4 = (p2628d.p2631c.C52625c) r4
            r2.<init>(r3, r4)
            kotlinx.coroutines.w r2 = (kotlinx.coroutines.C53357w) r2
            d.f.a.b r2 = (p2628d.p2639f.p2640a.C52671b) r2
            kotlinx.coroutines.aw r2 = r5.mo110859a(r2)
            kotlinx.coroutines.C53344l.m113407a(r1, r2)
            java.lang.Object r0 = r0.mo110937b()
            java.lang.Object r1 = p2628d.p2631c.p2632a.C52601b.m112157a()
            if (r0 != r1) goto L_0x0069
            p2628d.p2631c.p2633b.p2634a.C52620h.m112171b(r6)
        L_0x0069:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C53272bs.mo110862b(d.c.c):java.lang.Object");
    }

    /* renamed from: a */
    static C53348p m113195a(C53317i iVar) {
        while (iVar.mo110908d()) {
            iVar = iVar.mo110912h();
        }
        while (true) {
            iVar = iVar.mo110910f();
            if (!iVar.mo110908d()) {
                if (iVar instanceof C53348p) {
                    return (C53348p) iVar;
                }
                if (iVar instanceof C53281bx) {
                    return null;
                }
            }
        }
    }

    /* renamed from: a */
    private final CancellationException m113192a(Throwable th, String str) {
        Throwable th2;
        if (!(th instanceof CancellationException)) {
            th2 = null;
        } else {
            th2 = th;
        }
        CancellationException cancellationException = (CancellationException) th2;
        if (cancellationException == null) {
            return new C53266bm(str, th, this);
        }
        return cancellationException;
    }

    public <R> R fold(R r, C52682m<? super R, ? super C52631b, ? extends R> mVar) {
        C52711k.m112240b(mVar, "operation");
        C52711k.m112240b(mVar, "operation");
        return C52632a.m112178a(this, r, mVar);
    }

    /* renamed from: a */
    private final Throwable m113191a(C53275c cVar, List<? extends Throwable> list) {
        Object obj;
        boolean z;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            Throwable th = (Throwable) obj;
            if (th == null) {
                th = (Throwable) list.get(0);
            }
            return th;
        } else if (cVar.mo110890d()) {
            return mo110757d();
        } else {
            return null;
        }
    }

    /* renamed from: b */
    private final void m113202b(C53281bx bxVar, Throwable th) {
        Object e = bxVar.mo110909e();
        if (e != null) {
            Throwable th2 = null;
            for (C53317i iVar = (C53317i) e; !C52711k.m112239a((Object) iVar, (Object) bxVar); iVar = iVar.mo110910f()) {
                if (iVar instanceof C53271br) {
                    C53271br brVar = (C53271br) iVar;
                    try {
                        brVar.mo110797a(th);
                    } catch (Throwable th3) {
                        if (th2 != null) {
                            C52546a.m112152a(th2, th3);
                            if (th2 != null) {
                            }
                        }
                        C53272bs bsVar = this;
                        StringBuilder sb = new StringBuilder("Exception in completion handler ");
                        sb.append(brVar);
                        sb.append(" for ");
                        sb.append(bsVar);
                        th2 = new C53358x(sb.toString(), th3);
                    }
                }
            }
            if (th2 != null) {
                mo110753a(th2);
                return;
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004f, code lost:
        if (r2 == null) goto L_0x0060;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlinx.coroutines.C53271br<?> m113193a(p2628d.p2639f.p2640a.C52671b<? super java.lang.Throwable, p2628d.C52860x> r5, boolean r6) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L_0x0037
            boolean r6 = r5 instanceof kotlinx.coroutines.C53267bn
            if (r6 != 0) goto L_0x000a
            goto L_0x000b
        L_0x000a:
            r2 = r5
        L_0x000b:
            kotlinx.coroutines.bn r2 = (kotlinx.coroutines.C53267bn) r2
            if (r2 == 0) goto L_0x002c
            kotlinx.coroutines.bl r6 = r2.f131894b
            r3 = r4
            kotlinx.coroutines.bs r3 = (kotlinx.coroutines.C53272bs) r3
            if (r6 != r3) goto L_0x0017
            r0 = 1
        L_0x0017:
            if (r0 == 0) goto L_0x001e
            if (r2 == 0) goto L_0x002c
            kotlinx.coroutines.br r2 = (kotlinx.coroutines.C53271br) r2
            return r2
        L_0x001e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Failed requirement."
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            throw r5
        L_0x002c:
            kotlinx.coroutines.bj r6 = new kotlinx.coroutines.bj
            r0 = r4
            kotlinx.coroutines.bl r0 = (kotlinx.coroutines.C53263bl) r0
            r6.<init>(r0, r5)
            kotlinx.coroutines.br r6 = (kotlinx.coroutines.C53271br) r6
            return r6
        L_0x0037:
            boolean r6 = r5 instanceof kotlinx.coroutines.C53271br
            if (r6 != 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r2 = r5
        L_0x003d:
            kotlinx.coroutines.br r2 = (kotlinx.coroutines.C53271br) r2
            if (r2 == 0) goto L_0x0060
            J r6 = r2.f131894b
            r3 = r4
            kotlinx.coroutines.bs r3 = (kotlinx.coroutines.C53272bs) r3
            if (r6 != r3) goto L_0x004d
            boolean r6 = r2 instanceof kotlinx.coroutines.C53267bn
            if (r6 != 0) goto L_0x004d
            r0 = 1
        L_0x004d:
            if (r0 == 0) goto L_0x0052
            if (r2 != 0) goto L_0x006b
            goto L_0x0060
        L_0x0052:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Failed requirement."
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            throw r5
        L_0x0060:
            kotlinx.coroutines.bk r6 = new kotlinx.coroutines.bk
            r0 = r4
            kotlinx.coroutines.bl r0 = (kotlinx.coroutines.C53263bl) r0
            r6.<init>(r0, r5)
            r2 = r6
            kotlinx.coroutines.br r2 = (kotlinx.coroutines.C53271br) r2
        L_0x006b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C53272bs.m113193a(d.f.a.b, boolean):kotlinx.coroutines.br");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0075, code lost:
        if (r1 == null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0077, code lost:
        m113198a(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x007c, code lost:
        if ((r0 instanceof kotlinx.coroutines.C53348p) != false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x007e, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0080, code lost:
        r9 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0081, code lost:
        r9 = (kotlinx.coroutines.C53348p) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0083, code lost:
        if (r9 != null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0085, code lost:
        r9 = r0.cD_();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0089, code lost:
        if (r9 == null) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x008b, code lost:
        r6 = m113195a((kotlinx.coroutines.internal.C53317i) r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0092, code lost:
        r6 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0093, code lost:
        if (r6 == null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0099, code lost:
        if (mo110880a(r5, r6, r10) == false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x009c, code lost:
        return 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x009d, code lost:
        mo110879a(r5, r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00a0, code lost:
        return 1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m113190a(java.lang.Object r9, java.lang.Object r10, int r11) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.C53258bg
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r9 instanceof kotlinx.coroutines.C53229az
            r2 = 3
            r3 = 1
            if (r0 != 0) goto L_0x0010
            boolean r0 = r9 instanceof kotlinx.coroutines.C53271br
            if (r0 == 0) goto L_0x0022
        L_0x0010:
            boolean r0 = r9 instanceof kotlinx.coroutines.C53348p
            if (r0 != 0) goto L_0x0022
            boolean r0 = r10 instanceof kotlinx.coroutines.C53354t
            if (r0 != 0) goto L_0x0022
            kotlinx.coroutines.bg r9 = (kotlinx.coroutines.C53258bg) r9
            boolean r9 = r8.m113201a(r9, r10, r11)
            if (r9 != 0) goto L_0x0021
            return r2
        L_0x0021:
            return r3
        L_0x0022:
            r0 = r9
            kotlinx.coroutines.bg r0 = (kotlinx.coroutines.C53258bg) r0
            kotlinx.coroutines.bx r4 = r8.m113194a(r0)
            if (r4 != 0) goto L_0x002c
            return r2
        L_0x002c:
            boolean r5 = r9 instanceof kotlinx.coroutines.C53272bs.C53275c
            r6 = 0
            if (r5 != 0) goto L_0x0033
            r5 = r6
            goto L_0x0034
        L_0x0033:
            r5 = r9
        L_0x0034:
            kotlinx.coroutines.bs$c r5 = (kotlinx.coroutines.C53272bs.C53275c) r5
            if (r5 != 0) goto L_0x003d
            kotlinx.coroutines.bs$c r5 = new kotlinx.coroutines.bs$c
            r5.<init>(r4, r1, r6)
        L_0x003d:
            monitor-enter(r5)
            boolean r7 = r5.isCompleting     // Catch:{ all -> 0x00af }
            if (r7 == 0) goto L_0x0044
            monitor-exit(r5)
            return r1
        L_0x0044:
            r5.isCompleting = r3     // Catch:{ all -> 0x00af }
            if (r5 == r9) goto L_0x0052
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f131895d     // Catch:{ all -> 0x00af }
            boolean r9 = r1.compareAndSet(r8, r9, r5)     // Catch:{ all -> 0x00af }
            if (r9 != 0) goto L_0x0052
            monitor-exit(r5)
            return r2
        L_0x0052:
            boolean r9 = r5.mo110889c()     // Catch:{ all -> 0x00af }
            r9 = r9 ^ r3
            if (r9 == 0) goto L_0x00a1
            boolean r9 = r5.mo110890d()     // Catch:{ all -> 0x00af }
            boolean r1 = r10 instanceof kotlinx.coroutines.C53354t     // Catch:{ all -> 0x00af }
            if (r1 != 0) goto L_0x0063
            r1 = r6
            goto L_0x0064
        L_0x0063:
            r1 = r10
        L_0x0064:
            kotlinx.coroutines.t r1 = (kotlinx.coroutines.C53354t) r1     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x006d
            java.lang.Throwable r1 = r1.f131987b     // Catch:{ all -> 0x00af }
            r5.mo110888a(r1)     // Catch:{ all -> 0x00af }
        L_0x006d:
            java.lang.Throwable r1 = r5.rootCause     // Catch:{ all -> 0x00af }
            r9 = r9 ^ r3
            if (r9 == 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r1 = r6
        L_0x0074:
            monitor-exit(r5)
            if (r1 == 0) goto L_0x007a
            r8.m113198a(r4, r1)
        L_0x007a:
            boolean r9 = r0 instanceof kotlinx.coroutines.C53348p
            if (r9 != 0) goto L_0x0080
            r9 = r6
            goto L_0x0081
        L_0x0080:
            r9 = r0
        L_0x0081:
            kotlinx.coroutines.p r9 = (kotlinx.coroutines.C53348p) r9
            if (r9 != 0) goto L_0x0092
            kotlinx.coroutines.bx r9 = r0.cD_()
            if (r9 == 0) goto L_0x0093
            kotlinx.coroutines.internal.i r9 = (kotlinx.coroutines.internal.C53317i) r9
            kotlinx.coroutines.p r6 = m113195a(r9)
            goto L_0x0093
        L_0x0092:
            r6 = r9
        L_0x0093:
            if (r6 == 0) goto L_0x009d
            boolean r9 = r8.mo110880a(r5, r6, r10)
            if (r9 == 0) goto L_0x009d
            r9 = 2
            return r9
        L_0x009d:
            r8.mo110879a(r5, r10, r11)
            return r3
        L_0x00a1:
            java.lang.String r9 = "Failed requirement."
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00af }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00af }
            r10.<init>(r9)     // Catch:{ all -> 0x00af }
            java.lang.Throwable r10 = (java.lang.Throwable) r10     // Catch:{ all -> 0x00af }
            throw r10     // Catch:{ all -> 0x00af }
        L_0x00af:
            r9 = move-exception
            monitor-exit(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C53272bs.m113190a(java.lang.Object, java.lang.Object, int):int");
    }

    /* renamed from: a */
    private final void m113196a(C53258bg bgVar, Object obj, int i, boolean z) {
        Object obj2;
        C53347o oVar = this.parentHandle;
        if (oVar != null) {
            oVar.mo110788a();
            this.parentHandle = C53282by.f131910a;
        }
        Throwable th = null;
        if (!(obj instanceof C53354t)) {
            obj2 = null;
        } else {
            obj2 = obj;
        }
        C53354t tVar = (C53354t) obj2;
        if (tVar != null) {
            th = tVar.f131987b;
        }
        if (bgVar instanceof C53271br) {
            try {
                ((C53271br) bgVar).mo110797a(th);
            } catch (Throwable th2) {
                StringBuilder sb = new StringBuilder("Exception in completion handler ");
                sb.append(bgVar);
                sb.append(" for ");
                sb.append(this);
                mo110753a((Throwable) new C53358x(sb.toString(), th2));
            }
        } else {
            C53281bx cD_ = bgVar.cD_();
            if (cD_ != null) {
                m113202b(cD_, th);
            }
        }
        mo110752a(obj, i, z);
    }
}
