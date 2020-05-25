package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.model.C8009t.C8010a;
import com.bytedance.android.livesdkapi.message._Text_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.dn */
public final class C7902dn implements C2888b<C8010a> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m15889a(gVar);
    }

    /* renamed from: a */
    public static C8010a m15889a(C2895g gVar) throws Exception {
        C8010a aVar = new C8010a();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f21917a = C2896h.m8234e(gVar);
                        break;
                    case 2:
                        aVar.f21918b = C2896h.m8232c(gVar);
                        break;
                    case 3:
                        aVar.f21919c = _Text_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 4:
                        aVar.f21920d = _Text_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return aVar;
            }
        }
    }
}
