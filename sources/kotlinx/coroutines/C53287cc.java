package kotlinx.coroutines;

import kotlinx.coroutines.internal.C53331t;
import kotlinx.coroutines.internal.C53334w;
import p2628d.C52848o;
import p2628d.C52851p;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.C52628e;
import p2628d.p2631c.p2632a.C52601b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.cc */
public final class C53287cc {
    /* renamed from: a */
    public static final boolean m113260a(int i) {
        return i == 1;
    }

    /* renamed from: b */
    public static final boolean m113263b(int i) {
        return i == 0 || i == 1;
    }

    /* renamed from: a */
    public static final <T> void m113258a(C52625c<? super T> cVar, T t, int i) {
        C52711k.m112240b(cVar, "receiver$0");
        switch (i) {
            case 0:
                cVar.resumeWith(C52848o.m114620constructorimpl(t));
                return;
            case 1:
                C53223at.m113062a(cVar, t);
                return;
            case 2:
                C53223at.m113067b(cVar, t);
                return;
            case 3:
                C53221ar arVar = (C53221ar) cVar;
                C52628e context = arVar.getContext();
                Object a = C53334w.m113370a(context, arVar.f131800b);
                try {
                    arVar.f131802d.resumeWith(C52848o.m114620constructorimpl(t));
                    return;
                } finally {
                    C53334w.m113371b(context, a);
                }
            case 4:
                return;
            default:
                StringBuilder sb = new StringBuilder("Invalid mode ");
                sb.append(i);
                throw new IllegalStateException(sb.toString().toString());
        }
    }

    /* renamed from: b */
    public static final <T> void m113261b(C52625c<? super T> cVar, T t, int i) {
        C52711k.m112240b(cVar, "receiver$0");
        switch (i) {
            case 0:
                C52601b.m112154a(cVar).resumeWith(C52848o.m114620constructorimpl(t));
                return;
            case 1:
                C53223at.m113062a(C52601b.m112154a(cVar), t);
                return;
            case 2:
                cVar.resumeWith(C52848o.m114620constructorimpl(t));
                return;
            case 3:
                C52628e context = cVar.getContext();
                Object a = C53334w.m113370a(context, null);
                try {
                    cVar.resumeWith(C52848o.m114620constructorimpl(t));
                    return;
                } finally {
                    C53334w.m113371b(context, a);
                }
            case 4:
                return;
            default:
                StringBuilder sb = new StringBuilder("Invalid mode ");
                sb.append(i);
                throw new IllegalStateException(sb.toString().toString());
        }
    }

    /* renamed from: a */
    public static final <T> void m113259a(C52625c<? super T> cVar, Throwable th, int i) {
        C52711k.m112240b(cVar, "receiver$0");
        C52711k.m112240b(th, "exception");
        switch (i) {
            case 0:
                cVar.resumeWith(C52848o.m114620constructorimpl(C52851p.m112464a(th)));
                return;
            case 1:
                C53223at.m113063a(cVar, th);
                return;
            case 2:
                C53223at.m113068b(cVar, th);
                return;
            case 3:
                C53221ar arVar = (C53221ar) cVar;
                C52628e context = arVar.getContext();
                Object a = C53334w.m113370a(context, arVar.f131800b);
                try {
                    C52625c<T> cVar2 = arVar.f131802d;
                    cVar2.resumeWith(C52848o.m114620constructorimpl(C52851p.m112464a(C53331t.m113355a(th, cVar2))));
                    return;
                } finally {
                    C53334w.m113371b(context, a);
                }
            case 4:
                return;
            default:
                StringBuilder sb = new StringBuilder("Invalid mode ");
                sb.append(i);
                throw new IllegalStateException(sb.toString().toString());
        }
    }

    /* renamed from: b */
    public static final <T> void m113262b(C52625c<? super T> cVar, Throwable th, int i) {
        C52711k.m112240b(cVar, "receiver$0");
        C52711k.m112240b(th, "exception");
        switch (i) {
            case 0:
                C52601b.m112154a(cVar).resumeWith(C52848o.m114620constructorimpl(C52851p.m112464a(th)));
                return;
            case 1:
                C53223at.m113063a(C52601b.m112154a(cVar), th);
                return;
            case 2:
                cVar.resumeWith(C52848o.m114620constructorimpl(C52851p.m112464a(th)));
                return;
            case 3:
                C52628e context = cVar.getContext();
                Object a = C53334w.m113370a(context, null);
                try {
                    cVar.resumeWith(C52848o.m114620constructorimpl(C52851p.m112464a(th)));
                    return;
                } finally {
                    C53334w.m113371b(context, a);
                }
            case 4:
                return;
            default:
                StringBuilder sb = new StringBuilder("Invalid mode ");
                sb.append(i);
                throw new IllegalStateException(sb.toString().toString());
        }
    }
}
