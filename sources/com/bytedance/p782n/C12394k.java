package com.bytedance.p782n;

/* renamed from: com.bytedance.n.k */
public abstract class C12394k<IN, OUT> extends C12382d<IN, OUT> {

    /* renamed from: g */
    public IN f32637g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public OUT mo18071a() {
        return this.f32637g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo18072a(Throwable th);

    /* renamed from: a_ */
    public final Object mo18063a_(C12378b<OUT> bVar, IN in) throws Throwable {
        this.f32637g = in;
        try {
            return bVar.mo23391a(mo18071a());
        } catch (C12392a e) {
            return m24961a(bVar, in, e.getCause());
        } catch (Throwable th) {
            return m24961a(bVar, in, th);
        }
    }

    /* renamed from: a */
    private Object m24961a(C12378b<OUT> bVar, IN in, Throwable th) throws Throwable {
        while (mo18072a(th)) {
            try {
                return bVar.mo23391a(mo18071a());
            } catch (C12392a e) {
                th = e.getCause();
            } catch (Throwable th2) {
                th = th2;
            }
        }
        throw th;
    }
}
