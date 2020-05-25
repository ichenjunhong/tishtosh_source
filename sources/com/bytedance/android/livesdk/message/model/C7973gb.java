package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.message.model.C7857bz.C7858a;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.gb */
public final class C7973gb implements C2888b<C7858a> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m15908a(gVar);
    }

    /* renamed from: a */
    public static C7858a m15908a(C2895g gVar) throws Exception {
        C7858a aVar = new C7858a();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b == -1) {
                gVar.mo7516a(a);
                aVar.mo14155a();
                return aVar;
            } else if (b == 1) {
                aVar.f21728a = C2896h.m8232c(gVar);
            } else if (b == 3) {
                aVar.f21729b = C2896h.m8234e(gVar);
            } else if (b != 9) {
                C2896h.m8236g(gVar);
            } else {
                aVar.f21731d = _ImageModel_ProtoDecoder.decodeStatic(gVar);
            }
        }
    }
}
