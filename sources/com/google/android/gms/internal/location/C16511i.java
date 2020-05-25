package com.google.android.gms.internal.location;

import android.content.Context;
import com.google.android.gms.common.api.internal.C15336h;
import com.google.android.gms.common.api.internal.C15336h.C15337a;
import com.google.android.gms.location.C16885d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.location.i */
public final class C16511i {

    /* renamed from: a */
    final C16523u<C16509g> f46395a;

    /* renamed from: b */
    boolean f46396b;

    /* renamed from: c */
    final Map<C15337a<Object>, C16516n> f46397c = new HashMap();

    /* renamed from: d */
    final Map<C15337a<Object>, C16515m> f46398d = new HashMap();

    /* renamed from: e */
    final Map<C15337a<C16885d>, C16512j> f46399e = new HashMap();

    /* renamed from: f */
    private final Context f46400f;

    public C16511i(Context context, C16523u<C16509g> uVar) {
        this.f46400f = context;
        this.f46395a = uVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C16512j mo31723a(C15336h<C16885d> hVar) {
        C16512j jVar;
        synchronized (this.f46399e) {
            jVar = (C16512j) this.f46399e.get(hVar.f39616b);
            if (jVar == null) {
                jVar = new C16512j(hVar);
            }
            this.f46399e.put(hVar.f39616b, jVar);
        }
        return jVar;
    }
}
