package com.facebook.drawee.p930a.p931a.p933b;

import com.facebook.common.p921e.C13697a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.drawee.a.a.b.a */
public final class C13760a implements C13764b {

    /* renamed from: a */
    private final List<C13764b> f35773a = new ArrayList(2);

    /* renamed from: a */
    public final synchronized void mo25696a(C13764b bVar) {
        this.f35773a.add(bVar);
    }

    /* renamed from: b */
    public final synchronized void mo25697b(C13764b bVar) {
        this.f35773a.remove(bVar);
    }

    public C13760a(C13764b... bVarArr) {
        Collections.addAll(this.f35773a, bVarArr);
    }

    /* renamed from: a */
    public final synchronized void mo25695a(String str, int i, boolean z) {
        int size = this.f35773a.size();
        for (int i2 = 0; i2 < size; i2++) {
            C13764b bVar = (C13764b) this.f35773a.get(i2);
            if (bVar != null) {
                try {
                    bVar.mo25695a(str, i, z);
                } catch (Exception e) {
                    C13697a.m27696c("ForwardingImageOriginListener", "InternalListener exception in onImageLoaded", (Throwable) e);
                }
            }
        }
    }
}
