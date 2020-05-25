package com.google.firebase.iid;

import android.support.p030v4.p038f.C0777a;
import android.util.Pair;
import com.google.android.gms.p1033b.C15179g;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.iid.t */
final class C17936t {

    /* renamed from: a */
    private final Executor f49807a;

    /* renamed from: b */
    private final Map<Pair<String, String>, C15179g<String>> f49808b = new C0777a();

    C17936t(Executor executor) {
        this.f49807a = executor;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized C15179g<String> mo34787a(String str, String str2, C17938v vVar) {
        Pair pair = new Pair(str, str2);
        C15179g<String> gVar = (C15179g) this.f49808b.get(pair);
        if (gVar != null) {
            return gVar;
        }
        C15179g<String> b = vVar.mo34749a().mo27999b(this.f49807a, new C17937u(this, pair));
        this.f49808b.put(pair, b);
        return b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C15179g mo34786a(Pair pair, C15179g gVar) throws Exception {
        synchronized (this) {
            this.f49808b.remove(pair);
        }
        return gVar;
    }
}
