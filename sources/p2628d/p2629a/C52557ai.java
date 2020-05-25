package p2628d.p2629a;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: d.a.ai */
public class C52557ai extends C52556ah {
    /* renamed from: a */
    public static final <T> Set<T> m112062a() {
        return C52592z.INSTANCE;
    }

    /* renamed from: a */
    public static final <T> Set<T> m112063a(T... tArr) {
        C52711k.m112240b(tArr, "elements");
        if (tArr.length > 0) {
            return C52568f.m112086g(tArr);
        }
        return C52555ag.m112062a();
    }

    /* renamed from: b */
    public static final <T> Set<T> m112064b(T... tArr) {
        C52711k.m112240b(tArr, "elements");
        return (Set) C52568f.m112081b((Object[]) tArr, (Collection) new LinkedHashSet(C52550ab.m112044a(tArr.length)));
    }
}
