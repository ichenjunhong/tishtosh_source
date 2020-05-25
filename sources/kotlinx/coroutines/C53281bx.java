package kotlinx.coroutines;

import kotlinx.coroutines.internal.C53315g;
import kotlinx.coroutines.internal.C53317i;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.bx */
public final class C53281bx extends C53315g implements C53258bg {
    /* renamed from: b */
    public final boolean mo110799b() {
        return true;
    }

    public final C53281bx cD_() {
        return this;
    }

    public final String toString() {
        return mo110893a("Active");
    }

    /* renamed from: a */
    public final String mo110893a(String str) {
        C52711k.m112240b(str, "state");
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        Object e = mo110909e();
        if (e != null) {
            boolean z = true;
            for (C53317i iVar = (C53317i) e; !C52711k.m112239a((Object) iVar, (Object) this); iVar = iVar.mo110910f()) {
                if (iVar instanceof C53271br) {
                    C53271br brVar = (C53271br) iVar;
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(brVar);
                }
            }
            sb.append("]");
            String sb2 = sb.toString();
            C52711k.m112236a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        throw new C52857u("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }
}
