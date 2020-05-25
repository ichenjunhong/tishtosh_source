package com.bytedance.p702im.core.internal.p718b.p719a;

import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.proto.Response;
import com.bytedance.p702im.core.proto.ResponseBody;

/* renamed from: com.bytedance.im.core.internal.b.a.b */
abstract class C11364b extends C11406q {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo21032a(int i, ResponseBody responseBody);

    C11364b(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20947a(C11447f fVar) {
        if (!fVar.mo21093g() || fVar.f30732g == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20946a(C11447f fVar, Runnable runnable) {
        if (fVar.mo21093g() && fVar.f30732g.body != null) {
            Response response = fVar.f30732g;
            mo21032a(response.inbox_type.intValue(), response.body);
        }
    }
}
