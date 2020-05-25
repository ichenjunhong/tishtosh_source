package com.facebook.imagepipeline.memory;

import com.facebook.common.p920d.C13689i;
import com.facebook.common.p923g.C13713k;
import com.facebook.common.p924h.C13715a;
import java.io.IOException;

/* renamed from: com.facebook.imagepipeline.memory.w */
public final class C14096w extends C13713k {

    /* renamed from: a */
    private final C14092s f36822a;

    /* renamed from: b */
    private C13715a<C14091r> f36823b;

    /* renamed from: c */
    private int f36824c;

    /* renamed from: com.facebook.imagepipeline.memory.w$a */
    public static class C14097a extends RuntimeException {
        public C14097a() {
            super("OutputStream no longer valid");
        }
    }

    /* renamed from: b */
    public final int mo25627b() {
        return this.f36824c;
    }

    /* renamed from: d */
    private void m28862d() {
        if (!C13715a.m27750a(this.f36823b)) {
            throw new C14097a();
        }
    }

    /* renamed from: c */
    public final C14094u mo25626a() {
        m28862d();
        return new C14094u(this.f36823b, this.f36824c);
    }

    public final void close() {
        C13715a.m27752c(this.f36823b);
        this.f36823b = null;
        this.f36824c = -1;
        super.close();
    }

    public C14096w(C14092s sVar) {
        this(sVar, sVar.f36817g[0]);
    }

    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }

    public C14096w(C14092s sVar, int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27655a(z);
        this.f36822a = (C14092s) C13689i.m27652a(sVar);
        this.f36824c = 0;
        this.f36823b = C13715a.m27747a(this.f36822a.mo25599a(i), this.f36822a);
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            StringBuilder sb = new StringBuilder("length=");
            sb.append(bArr.length);
            sb.append("; regionStart=");
            sb.append(i);
            sb.append("; regionLength=");
            sb.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        m28862d();
        int i3 = this.f36824c + i2;
        m28862d();
        if (i3 > ((C14091r) this.f36823b.mo25630a()).getSize()) {
            C14091r rVar = (C14091r) this.f36822a.mo25599a(i3);
            ((C14091r) this.f36823b.mo25630a()).copy(0, rVar, 0, this.f36824c);
            this.f36823b.close();
            this.f36823b = C13715a.m27747a(rVar, this.f36822a);
        }
        ((C14091r) this.f36823b.mo25630a()).write(this.f36824c, bArr, i, i2);
        this.f36824c += i2;
    }
}
