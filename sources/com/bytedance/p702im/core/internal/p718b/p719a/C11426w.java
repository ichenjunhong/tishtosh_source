package com.bytedance.p702im.core.internal.p718b.p719a;

import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.proto.IMCMD;

/* renamed from: com.bytedance.im.core.internal.b.a.w */
public final class C11426w extends C11406q<Boolean> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20952a() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20947a(C11447f fVar) {
        return true;
    }

    public C11426w(C11162b<Boolean> bVar) {
        super(IMCMD.MARK_ALL_STRANGER_CONVERSATIONS_READ.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20946a(C11447f fVar, Runnable runnable) {
        if (fVar.mo21093g()) {
            mo21055a(Boolean.valueOf(true));
        } else {
            mo21058b(fVar);
        }
    }
}
