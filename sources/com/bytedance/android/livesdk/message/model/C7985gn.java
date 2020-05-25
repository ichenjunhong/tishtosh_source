package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.gn */
public final class C7985gn implements C2888b<C7871cl> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7871cl clVar = new C7871cl();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        clVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        clVar.f21796b = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        clVar.f21798d = C2896h.m8232c(gVar);
                        break;
                    case 4:
                        clVar.f21795a = C2896h.m8232c(gVar);
                        break;
                    case 5:
                        clVar.f21797c = C2896h.m8234e(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return clVar;
            }
        }
    }
}
