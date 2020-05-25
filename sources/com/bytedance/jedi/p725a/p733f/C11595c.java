package com.bytedance.jedi.p725a.p733f;

import com.bytedance.jedi.p725a.p728c.C11571b;
import com.bytedance.jedi.p725a.p728c.C11574e;
import com.bytedance.jedi.p725a.p742l.C11731c;
import com.bytedance.jedi.p725a.p742l.C11733e;
import com.bytedance.jedi.p725a.p742l.C11733e.C11734a;
import java.util.LinkedHashSet;
import p064c.p065a.p071d.C1710e;
import p2628d.C52856t;

/* renamed from: com.bytedance.jedi.a.f.c */
public final class C11595c {

    /* renamed from: com.bytedance.jedi.a.f.c$a */
    static final class C11596a<T> implements C1710e<RESP> {

        /* renamed from: a */
        final /* synthetic */ C11587b f30979a;

        /* renamed from: b */
        final /* synthetic */ Object f30980b;

        C11596a(C11587b bVar, Object obj) {
            this.f30979a = bVar;
            this.f30980b = obj;
        }

        public final void accept(RESP resp) {
            Object a = this.f30979a.mo22309a(this.f30980b, resp);
            if (a != null) {
                C11574e a2 = C11571b.m23675a(this.f30979a);
                if (!(a2 instanceof C11731c)) {
                    a2 = null;
                }
                C11731c cVar = (C11731c) a2;
                if (cVar != null) {
                    cVar.mo22302a(C11734a.m24062a(C52856t.m112465a(this.f30979a.mo22310b(this.f30980b), a), new C11733e(C52856t.m112465a(this.f30979a.mo22310b(this.f30980b), a), new LinkedHashSet(), null)));
                }
            }
        }
    }
}
