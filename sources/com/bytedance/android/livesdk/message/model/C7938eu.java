package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.depend.model.live._BattleSetting_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.eu */
public final class C7938eu implements C2888b<C7823az> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7823az azVar = new C7823az();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        azVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        azVar.f21537a = _BattleSetting_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return azVar;
            }
        }
    }
}
