package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.fw */
public final class C7967fw implements C2888b<C7854bw> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7854bw bwVar = new C7854bw();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b == -1) {
                gVar.mo7516a(a);
                return bwVar;
            } else if (b == 1) {
                bwVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
            } else if (b != 3) {
                C2896h.m8236g(gVar);
            } else {
                bwVar.f21704a = C7968fx.m15905a(gVar);
            }
        }
    }
}
