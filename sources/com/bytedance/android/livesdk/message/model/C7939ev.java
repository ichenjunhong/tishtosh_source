package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.depend.model.live._BattleMode_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._BattleSetting_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._BattleTask_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.ev */
public final class C7939ev implements C2888b<C7825ba> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7825ba baVar = new C7825ba();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        baVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        baVar.f21539a = _BattleSetting_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        baVar.f21540b = _BattleMode_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 4:
                        baVar.f21541c = _BattleTask_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return baVar;
            }
        }
    }
}
