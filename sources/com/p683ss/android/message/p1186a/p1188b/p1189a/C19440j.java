package com.p683ss.android.message.p1186a.p1188b.p1189a;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

/* renamed from: com.ss.android.message.a.b.a.j */
public final class C19440j extends DataOutputStream {

    /* renamed from: a */
    C19441a f53757a;

    /* renamed from: com.ss.android.message.a.b.a.j$a */
    static class C19441a extends ByteArrayOutputStream {
        /* renamed from: a */
        public final byte[] mo40562a() {
            return this.buf;
        }

        /* renamed from: b */
        public final int mo40563b() {
            return this.count;
        }
    }

    public C19440j() {
        this(new C19441a());
    }

    private C19440j(C19441a aVar) {
        super(aVar);
        this.f53757a = aVar;
    }
}
