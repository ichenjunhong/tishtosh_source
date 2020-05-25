package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.df */
public final class C7894df implements C2888b<C8001m> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C8001m mVar = new C8001m();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        mVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        mVar.f21870c = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        mVar.f21869b = C2896h.m8234e(gVar);
                        break;
                    case 4:
                        mVar.f21871d = C2896h.m8230a(gVar);
                        break;
                    case 5:
                        mVar.f21872e = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 6:
                        mVar.f21873f = C2896h.m8234e(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return mVar;
            }
        }
    }
}
