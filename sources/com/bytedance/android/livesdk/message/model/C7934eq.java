package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.eq */
public final class C7934eq implements C2888b<C7819ax> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7819ax axVar = new C7819ax();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        axVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        axVar.f21525a = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        axVar.f21526b = C2896h.m8231b(gVar);
                        break;
                    case 4:
                        axVar.f21527c = C2896h.m8231b(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return axVar;
            }
        }
    }
}
