package okhttp3.internal.p2684b;

import java.io.IOException;
import okhttp3.C53498ab;
import okhttp3.C53504ad;
import okhttp3.C53676u;
import okhttp3.C53676u.C53677a;
import okhttp3.C53682y;
import okhttp3.internal.p2685c.C53570g;

/* renamed from: okhttp3.internal.b.a */
public final class C53549a implements C53676u {

    /* renamed from: a */
    public final C53682y f132682a;

    public C53549a(C53682y yVar) {
        this.f132682a = yVar;
    }

    public final C53504ad intercept(C53677a aVar) throws IOException {
        C53570g gVar = (C53570g) aVar;
        C53498ab a = gVar.mo111416a();
        C53557g gVar2 = gVar.f132760a;
        return gVar.mo111418a(a, gVar2, gVar2.mo111396a(this.f132682a, aVar, !a.f132379b.equals("GET")), gVar2.mo111400b());
    }
}
