package android.arch.p010b;

import android.arch.p006a.p007a.C0040a;
import android.arch.p010b.C0065d.C0066a;
import android.arch.p010b.C0082h.C0085a;
import android.arch.p010b.C0082h.C0088d;
import java.util.concurrent.Executor;

/* renamed from: android.arch.b.e */
public final class C0070e<Key, Value> {

    /* renamed from: a */
    public Key f166a;

    /* renamed from: b */
    public C0088d f167b;

    /* renamed from: c */
    public C0066a<Key, Value> f168c;

    /* renamed from: d */
    public C0085a f169d;

    /* renamed from: e */
    public Executor f170e = C0040a.f104a;

    public C0070e(C0066a<Key, Value> aVar, C0088d dVar) {
        if (dVar != null) {
            this.f168c = aVar;
            this.f167b = dVar;
            return;
        }
        throw new IllegalArgumentException("PagedList.Config must be provided");
    }
}
