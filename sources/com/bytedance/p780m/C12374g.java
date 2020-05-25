package com.bytedance.p780m;

/* renamed from: com.bytedance.m.g */
public final class C12374g<T> extends C12372e<T> {

    /* renamed from: a */
    private final C12372e<T> f32606a;

    /* renamed from: b */
    private T f32607b;

    /* renamed from: c */
    private boolean f32608c;

    public C12374g(C12372e<T> eVar) {
        this.f32606a = eVar;
    }

    /* renamed from: a */
    public final T mo23382a(C12361b bVar) {
        if (this.f32607b != null) {
            return this.f32607b;
        }
        this.f32607b = this.f32606a.mo23382a(bVar);
        return this.f32607b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo23384a(T t, C12361b bVar) {
        if (!this.f32608c) {
            this.f32608c = true;
            super.mo23384a(t, bVar);
        }
    }
}
