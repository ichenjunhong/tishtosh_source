package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.eb */
public final class C7919eb implements C2888b<C7802ah> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7802ah ahVar = new C7802ah();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b == -1) {
                gVar.mo7516a(a);
                return ahVar;
            } else if (b == 1) {
                ahVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
            } else if (b == 3) {
                ahVar.f21459b = C2896h.m8234e(gVar);
            } else if (b != 6) {
                C2896h.m8236g(gVar);
            } else {
                ahVar.f21458a = C2896h.m8232c(gVar);
            }
        }
    }
}
