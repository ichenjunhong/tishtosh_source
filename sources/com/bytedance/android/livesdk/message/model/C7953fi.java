package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.fi */
public final class C7953fi implements C2888b<C7838bl> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7838bl blVar = new C7838bl();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        blVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        blVar.f21656a = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        blVar.f21657b = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return blVar;
            }
        }
    }
}
