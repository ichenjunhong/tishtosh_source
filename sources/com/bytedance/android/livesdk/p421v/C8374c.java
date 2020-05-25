package com.bytedance.android.livesdk.p421v;

import android.content.Context;
import android.view.View;

/* renamed from: com.bytedance.android.livesdk.v.c */
public final class C8374c extends C8368a<C8374c> {

    /* renamed from: m */
    private C8375a f22790m;

    /* renamed from: com.bytedance.android.livesdk.v.c$a */
    public interface C8375a {
        /* renamed from: a */
        void mo12637a(View view, C8374c cVar);
    }

    public C8374c() {
    }

    /* renamed from: a */
    public final C8374c mo14582a(C8375a aVar) {
        this.f22790m = aVar;
        return this;
    }

    private C8374c(Context context) {
        mo14563a(context);
    }

    /* renamed from: b */
    public static C8374c m16598b(Context context) {
        return new C8374c(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo14567a(View view, C8368a aVar) {
        C8374c cVar = (C8374c) aVar;
        if (this.f22790m != null) {
            this.f22790m.mo12637a(view, cVar);
        }
    }
}
