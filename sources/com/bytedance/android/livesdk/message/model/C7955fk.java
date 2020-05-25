package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.depend.model.live._OfficialRoomInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.fk */
public final class C7955fk implements C2888b<C7840bn> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7840bn bnVar = new C7840bn();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bnVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        bnVar.f21664a = _OfficialRoomInfo_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return bnVar;
            }
        }
    }
}
