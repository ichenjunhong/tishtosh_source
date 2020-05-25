package okhttp3.internal.p2685c;

import java.io.IOException;
import java.util.List;
import okhttp3.C53498ab;
import okhttp3.C53504ad;
import okhttp3.C53524e;
import okhttp3.C53532i;
import okhttp3.C53664p;
import okhttp3.C53676u;
import okhttp3.C53676u.C53677a;
import okhttp3.internal.p2684b.C53551c;
import okhttp3.internal.p2684b.C53557g;

/* renamed from: okhttp3.internal.c.g */
public final class C53570g implements C53677a {

    /* renamed from: a */
    public final C53557g f132760a;

    /* renamed from: b */
    public final C53565c f132761b;

    /* renamed from: c */
    public final C53664p f132762c;

    /* renamed from: d */
    private final List<C53676u> f132763d;

    /* renamed from: e */
    private final C53551c f132764e;

    /* renamed from: f */
    private final int f132765f;

    /* renamed from: g */
    private final C53498ab f132766g;

    /* renamed from: h */
    private final C53524e f132767h;

    /* renamed from: i */
    private final int f132768i;

    /* renamed from: j */
    private final int f132769j;

    /* renamed from: k */
    private final int f132770k;

    /* renamed from: l */
    private int f132771l;

    /* renamed from: a */
    public final C53498ab mo111416a() {
        return this.f132766g;
    }

    /* renamed from: b */
    public final C53532i mo111419b() {
        return this.f132764e;
    }

    /* renamed from: c */
    public final int mo111420c() {
        return this.f132768i;
    }

    /* renamed from: d */
    public final int mo111421d() {
        return this.f132769j;
    }

    /* renamed from: e */
    public final int mo111422e() {
        return this.f132770k;
    }

    /* renamed from: f */
    public final C53524e mo111423f() {
        return this.f132767h;
    }

    /* renamed from: a */
    public final C53504ad mo111417a(C53498ab abVar) throws IOException {
        return mo111418a(abVar, this.f132760a, this.f132761b, this.f132764e);
    }

    /* renamed from: a */
    public final C53504ad mo111418a(C53498ab abVar, C53557g gVar, C53565c cVar, C53551c cVar2) throws IOException {
        if (this.f132765f < this.f132763d.size()) {
            this.f132771l++;
            if (this.f132761b == null) {
                C53498ab abVar2 = abVar;
            } else if (!this.f132764e.mo111379a(abVar.f132378a)) {
                StringBuilder sb = new StringBuilder("network interceptor ");
                sb.append(this.f132763d.get(this.f132765f - 1));
                sb.append(" must retain the same host and port");
                throw new IllegalStateException(sb.toString());
            }
            if (this.f132761b == null || this.f132771l <= 1) {
                C53570g gVar2 = new C53570g(this.f132763d, gVar, cVar, cVar2, this.f132765f + 1, abVar, this.f132767h, this.f132762c, this.f132768i, this.f132769j, this.f132770k);
                C53676u uVar = (C53676u) this.f132763d.get(this.f132765f);
                C53504ad intercept = uVar.intercept(gVar2);
                if (cVar != null && this.f132765f + 1 < this.f132763d.size() && gVar2.f132771l != 1) {
                    StringBuilder sb2 = new StringBuilder("network interceptor ");
                    sb2.append(uVar);
                    sb2.append(" must call proceed() exactly once");
                    throw new IllegalStateException(sb2.toString());
                } else if (intercept == null) {
                    StringBuilder sb3 = new StringBuilder("interceptor ");
                    sb3.append(uVar);
                    sb3.append(" returned null");
                    throw new NullPointerException(sb3.toString());
                } else if (intercept.f132404g != null) {
                    return intercept;
                } else {
                    StringBuilder sb4 = new StringBuilder("interceptor ");
                    sb4.append(uVar);
                    sb4.append(" returned a response with no body");
                    throw new IllegalStateException(sb4.toString());
                }
            } else {
                StringBuilder sb5 = new StringBuilder("network interceptor ");
                sb5.append(this.f132763d.get(this.f132765f - 1));
                sb5.append(" must call proceed() exactly once");
                throw new IllegalStateException(sb5.toString());
            }
        } else {
            throw new AssertionError();
        }
    }

    public C53570g(List<C53676u> list, C53557g gVar, C53565c cVar, C53551c cVar2, int i, C53498ab abVar, C53524e eVar, C53664p pVar, int i2, int i3, int i4) {
        this.f132763d = list;
        this.f132764e = cVar2;
        this.f132760a = gVar;
        this.f132761b = cVar;
        this.f132765f = i;
        this.f132766g = abVar;
        this.f132767h = eVar;
        this.f132762c = pVar;
        this.f132768i = i2;
        this.f132769j = i3;
        this.f132770k = i4;
    }
}
