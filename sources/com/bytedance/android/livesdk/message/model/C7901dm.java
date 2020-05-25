package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.dm */
public final class C7901dm implements C2888b<C8008s> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m15888a(gVar);
    }

    /* renamed from: a */
    public static C8008s m15888a(C2895g gVar) throws Exception {
        C8008s sVar = new C8008s();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        sVar.f21911b = C2896h.m8232c(gVar);
                        break;
                    case 2:
                        sVar.f21910a = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        sVar.f21912c = C2896h.m8232c(gVar);
                        break;
                    case 4:
                        sVar.f21913d = C2896h.m8232c(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return sVar;
            }
        }
    }
}
