package p064c.p065a.p072e.p087j;

import p064c.p065a.C1674ab;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p075c.C1754h;
import p064c.p065a.p072e.p075c.C1755i;

/* renamed from: c.a.e.j.n */
public final class C2141n {
    /* renamed from: a */
    public static <T, U> void m6438a(C1754h<T> hVar, C1674ab<? super U> abVar, boolean z, C1690c cVar, C2138k<T, U> kVar) {
        boolean z2;
        int i = 1;
        while (!m6439a(kVar.mo6257b(), hVar.isEmpty(), abVar, z, hVar, cVar, kVar)) {
            while (true) {
                boolean b = kVar.mo6257b();
                Object poll = hVar.poll();
                if (poll == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!m6439a(b, z2, abVar, z, hVar, cVar, kVar)) {
                    if (!z2) {
                        kVar.mo6253a(abVar, poll);
                    } else {
                        i = kVar.mo6252a(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private static <T, U> boolean m6439a(boolean z, boolean z2, C1674ab<?> abVar, boolean z3, C1755i<?> iVar, C1690c cVar, C2138k<T, U> kVar) {
        if (kVar.mo6255a()) {
            iVar.clear();
            cVar.dispose();
            return true;
        }
        if (z) {
            if (!z3) {
                Throwable d = kVar.mo6259d();
                if (d != null) {
                    iVar.clear();
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    abVar.onError(d);
                    return true;
                } else if (z2) {
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    abVar.onComplete();
                    return true;
                }
            } else if (z2) {
                if (cVar != null) {
                    cVar.dispose();
                }
                Throwable d2 = kVar.mo6259d();
                if (d2 != null) {
                    abVar.onError(d2);
                } else {
                    abVar.onComplete();
                }
                return true;
            }
        }
        return false;
    }
}
