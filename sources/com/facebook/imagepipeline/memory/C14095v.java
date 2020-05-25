package com.facebook.imagepipeline.memory;

import com.facebook.common.p920d.C13696m;
import com.facebook.common.p923g.C13711i;
import com.facebook.common.p923g.C13713k;
import com.facebook.common.p923g.C13714l;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.imagepipeline.memory.v */
public final class C14095v implements C13711i {

    /* renamed from: a */
    private final C13714l f36820a;

    /* renamed from: b */
    private final C14092s f36821b;

    /* renamed from: a */
    public final /* synthetic */ C13713k mo25616a() {
        return new C14096w(this.f36821b);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C14094u mo25613a(InputStream inputStream) throws IOException {
        C14096w wVar = new C14096w(this.f36821b);
        try {
            return m28853a(inputStream, wVar);
        } finally {
            wVar.close();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C14094u mo25615a(byte[] bArr) {
        C14096w wVar = new C14096w(this.f36821b, bArr.length);
        try {
            wVar.write(bArr, 0, bArr.length);
            C14094u c = wVar.mo25626a();
            wVar.close();
            return c;
        } catch (IOException e) {
            throw C13696m.m27667b(e);
        } catch (Throwable th) {
            wVar.close();
            throw th;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C13713k mo25617a(int i) {
        return new C14096w(this.f36821b, i);
    }

    public C14095v(C14092s sVar, C13714l lVar) {
        this.f36821b = sVar;
        this.f36820a = lVar;
    }

    /* renamed from: a */
    private C14094u m28853a(InputStream inputStream, C14096w wVar) throws IOException {
        this.f36820a.mo25629a(inputStream, wVar);
        return wVar.mo25626a();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C14094u mo25614a(InputStream inputStream, int i) throws IOException {
        C14096w wVar = new C14096w(this.f36821b, i);
        try {
            return m28853a(inputStream, wVar);
        } finally {
            wVar.close();
        }
    }
}
