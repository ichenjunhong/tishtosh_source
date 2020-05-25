package kotlinx.coroutines.p2679b;

import kotlinx.coroutines.internal.C53319j;
import kotlinx.coroutines.internal.C53320k;
import kotlinx.coroutines.internal.C53320k.C53322b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.b.e */
public final class C53238e extends C53319j<C53242i> {
    public C53238e() {
        super(false);
    }

    /* renamed from: a */
    public final C53242i mo110821a(C53245l lVar) {
        Object obj;
        Object obj2;
        C52711k.m112240b(lVar, "mode");
        while (true) {
            C53320k kVar = (C53320k) this._cur$internal;
            while (true) {
                long j = kVar._state$internal;
                obj = null;
                if ((1152921504606846976L & j) == 0) {
                    boolean z = false;
                    int i = (int) ((1073741823 & j) >> 0);
                    if ((((int) ((1152921503533105152L & j) >> 30)) & kVar.f131948a) != (kVar.f131948a & i)) {
                        obj2 = kVar.f131949c.get(kVar.f131948a & i);
                        if (obj2 != null) {
                            if (obj2 instanceof C53322b) {
                                break;
                            }
                            if (((C53242i) obj2).mo110827e() == lVar) {
                                z = true;
                            }
                            if (!z) {
                                break;
                            }
                            int i2 = (i + 1) & 1073741823;
                            if (C53320k.f131944b.compareAndSet(kVar, j, C53320k.f131946f.mo110921a(j, i2))) {
                                kVar.f131949c.set(kVar.f131948a & i, null);
                                break;
                            } else if (kVar.f131950d) {
                                C53320k kVar2 = kVar;
                                do {
                                    kVar2 = kVar2.mo110917a(i, i2);
                                } while (kVar2 != null);
                                break;
                            }
                        } else if (kVar.f131950d) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    obj = C53320k.f131945e;
                    break;
                }
            }
            obj = obj2;
            if (obj != C53320k.f131945e) {
                return (C53242i) obj;
            }
            C53319j.f131943a.compareAndSet(this, kVar, kVar.mo110920c());
        }
    }
}
