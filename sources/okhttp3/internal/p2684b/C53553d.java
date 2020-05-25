package okhttp3.internal.p2684b;

import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.C53509af;

/* renamed from: okhttp3.internal.b.d */
public final class C53553d {

    /* renamed from: a */
    private final Set<C53509af> f132703a = new LinkedHashSet();

    /* renamed from: a */
    public final synchronized void mo111386a(C53509af afVar) {
        this.f132703a.add(afVar);
    }

    /* renamed from: b */
    public final synchronized void mo111387b(C53509af afVar) {
        this.f132703a.remove(afVar);
    }

    /* renamed from: c */
    public final synchronized boolean mo111388c(C53509af afVar) {
        return this.f132703a.contains(afVar);
    }
}
