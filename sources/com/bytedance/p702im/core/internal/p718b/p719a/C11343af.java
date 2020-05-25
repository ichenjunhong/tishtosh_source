package com.bytedance.p702im.core.internal.p718b.p719a;

import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.proto.IMCMD;

/* renamed from: com.bytedance.im.core.internal.b.a.af */
public final class C11343af extends C11406q<Boolean> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20947a(C11447f fVar) {
        return true;
    }

    public C11343af() {
        super(IMCMD.SEND_MESSAGE.getValue());
    }

    public C11343af(C11162b<Boolean> bVar) {
        super(IMCMD.SEND_MESSAGE.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20946a(C11447f fVar, Runnable runnable) {
        runnable.run();
        mo21055a(Boolean.valueOf(true));
    }
}
