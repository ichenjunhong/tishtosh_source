package com.facebook.imagepipeline.memory;

import com.facebook.common.p920d.C13689i;
import com.facebook.common.p923g.C13709h;
import com.facebook.common.p923g.C13709h.C13710a;
import com.facebook.common.p924h.C13715a;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.imagepipeline.memory.u */
public final class C14094u implements C13709h {

    /* renamed from: a */
    C13715a<C14091r> f36818a;

    /* renamed from: b */
    private final int f36819b;

    /* renamed from: a */
    public final synchronized int mo25608a() {
        m28846e();
        return this.f36819b;
    }

    public final synchronized void close() {
        C13715a.m27752c(this.f36818a);
        this.f36818a = null;
    }

    /* renamed from: e */
    private synchronized void m28846e() {
        if (mo25612d()) {
            throw new C13710a();
        }
    }

    /* renamed from: b */
    public final synchronized long mo25610b() throws UnsupportedOperationException {
        m28846e();
        return ((C14091r) this.f36818a.mo25630a()).getNativePtr();
    }

    /* renamed from: c */
    public final synchronized ByteBuffer mo25611c() {
        return ((C14091r) this.f36818a.mo25630a()).getByteBuffer();
    }

    /* renamed from: d */
    public final synchronized boolean mo25612d() {
        boolean z;
        if (!C13715a.m27750a(this.f36818a)) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public final synchronized byte mo25607a(int i) {
        boolean z;
        m28846e();
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27655a(z);
        if (i < this.f36819b) {
            z2 = true;
        }
        C13689i.m27655a(z2);
        return ((C14091r) this.f36818a.mo25630a()).read(i);
    }

    public C14094u(C13715a<C14091r> aVar, int i) {
        boolean z;
        C13689i.m27652a(aVar);
        if (i < 0 || i > ((C14091r) aVar.mo25630a()).getSize()) {
            z = false;
        } else {
            z = true;
        }
        C13689i.m27655a(z);
        this.f36818a = aVar.clone();
        this.f36819b = i;
    }

    /* renamed from: a */
    public final synchronized int mo25609a(int i, byte[] bArr, int i2, int i3) {
        boolean z;
        m28846e();
        if (i + i3 <= this.f36819b) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27655a(z);
        return ((C14091r) this.f36818a.mo25630a()).read(i, bArr, i2, i3);
    }
}
