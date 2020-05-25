package com.bytedance.p782n;

import com.bytedance.p782n.p784b.C12379a;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.bytedance.n.d */
public abstract class C12382d<IN, OUT> {

    /* renamed from: g */
    private static AtomicLong f32612g = new AtomicLong();

    /* renamed from: a */
    C12382d f32613a;

    /* renamed from: b */
    IN f32614b;

    /* renamed from: c */
    OUT f32615c;

    /* renamed from: d */
    C12379a f32616d;

    /* renamed from: e */
    C12378b f32617e;

    /* renamed from: f */
    public long f32618f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18064a(Object... objArr) {
    }

    /* renamed from: a_ */
    public abstract Object mo18063a_(C12378b<OUT> bVar, IN in) throws Throwable;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo23396b(Throwable th) {
        if (this.f32616d != null) {
            this.f32616d.mo23393c(this.f32617e, this, th);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo23395a(C12378b bVar, C12382d dVar, IN in, C12379a aVar, Object[] objArr) {
        this.f32617e = new C12398m(bVar);
        this.f32613a = dVar;
        this.f32614b = in;
        this.f32616d = aVar;
        if (this.f32613a != null) {
            this.f32618f = this.f32613a.f32618f;
        } else {
            this.f32618f = f32612g.getAndIncrement();
            if (this.f32618f < 0) {
                throw new RuntimeException("Pipeline ID use up!");
            }
        }
        mo18064a(objArr);
    }
}
