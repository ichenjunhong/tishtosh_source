package p2628d.p2650m;

import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: d.m.u */
public class C52837u extends C52836t {
    /* renamed from: a */
    public static final <T> void m112390a(Appendable appendable, T t, C52671b<? super T, ? extends CharSequence> bVar) {
        boolean z;
        C52711k.m112240b(appendable, "$this$appendElement");
        if (bVar != null) {
            appendable.append((CharSequence) bVar.invoke(t));
            return;
        }
        if (t != null) {
            z = t instanceof CharSequence;
        } else {
            z = true;
        }
        if (z) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }
}
