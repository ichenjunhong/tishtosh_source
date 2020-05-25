package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.message.model.C7843bp.C7846c;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.fo */
public final class C7959fo implements C2888b<C7846c> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m15902a(gVar);
    }

    /* renamed from: a */
    public static C7846c m15902a(C2895g gVar) throws Exception {
        C7846c cVar = new C7846c();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b == -1) {
                gVar.mo7516a(a);
                return cVar;
            } else if (b != 1) {
                C2896h.m8236g(gVar);
            } else {
                cVar.f21678a = _User_ProtoDecoder.decodeStatic(gVar);
            }
        }
    }
}
