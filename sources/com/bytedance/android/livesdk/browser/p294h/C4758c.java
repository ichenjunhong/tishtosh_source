package com.bytedance.android.livesdk.browser.p294h;

import android.content.Context;
import android.util.SparseArray;
import com.bytedance.android.livesdk.p270ab.C4507h.C4510b;
import com.bytedance.android.livesdk.p270ab.C4507h.C4510b.C4511a;

/* renamed from: com.bytedance.android.livesdk.browser.h.c */
public final class C4758c implements C4756a {

    /* renamed from: a */
    private SparseArray<C4757b> f12960a;

    /* renamed from: com.bytedance.android.livesdk.browser.h.c$a */
    public static final class C4760a implements C4510b<C4756a> {
        /* renamed from: a */
        public final C4511a<C4756a> mo10307a(C4511a<C4756a> aVar) {
            return aVar.mo10337a(new C4758c()).mo10336a();
        }
    }

    private C4758c() {
        this.f12960a = new SparseArray<>();
    }

    /* renamed from: a */
    public final void mo10589a(Context context) {
        this.f12960a.remove(context.hashCode());
    }
}
