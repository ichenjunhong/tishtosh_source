package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.message.model.C7843bp.C7845b;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.fn */
public final class C7958fn implements C2888b<C7845b> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m15901a(gVar);
    }

    /* renamed from: a */
    public static C7845b m15901a(C2895g gVar) throws Exception {
        C7845b bVar = new C7845b();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b == -1) {
                gVar.mo7516a(a);
                return bVar;
            } else if (b != 1) {
                C2896h.m8236g(gVar);
            } else {
                bVar.f21677a = _User_ProtoDecoder.decodeStatic(gVar);
            }
        }
    }
}
