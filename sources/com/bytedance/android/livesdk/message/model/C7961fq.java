package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.fq */
public final class C7961fq implements C2888b<C7843bp> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7843bp bpVar = new C7843bp();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bpVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        bpVar.f21670a = (int) C2896h.m8232c(gVar);
                        break;
                    case 3:
                        bpVar.f21671b = C2896h.m8232c(gVar);
                        break;
                    case 4:
                        bpVar.f21672c = C2896h.m8232c(gVar);
                        break;
                    case 5:
                        bpVar.f21673d = C7958fn.m15901a(gVar);
                        break;
                    case 6:
                        bpVar.f21674e = C7960fp.m15903a(gVar);
                        break;
                    case 7:
                        bpVar.f21675f = C7959fo.m15902a(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                bpVar.mo14154a();
                return bpVar;
            }
        }
    }
}
