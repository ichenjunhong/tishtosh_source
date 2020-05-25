package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.dz */
public final class C7916dz implements C2888b<C7801ag> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7801ag agVar = new C7801ag();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b == -1) {
                gVar.mo7516a(a);
                return agVar;
            } else if (b != 1) {
                C2896h.m8236g(gVar);
            } else {
                agVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
            }
        }
    }
}
