package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.dd */
public final class C7892dd implements C2888b<C7999k> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m15886a(gVar);
    }

    /* renamed from: a */
    public static C7999k m15886a(C2895g gVar) throws Exception {
        C7999k kVar = new C7999k();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        kVar.f21864a = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        kVar.f21865b = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return kVar;
            }
        }
    }
}
