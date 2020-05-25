package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._Text_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.fx */
public final class C7968fx implements C2888b<C7853bv> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m15905a(gVar);
    }

    /* renamed from: a */
    public static C7853bv m15905a(C2895g gVar) throws Exception {
        C7853bv bvVar = new C7853bv();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bvVar.f21701a = C2896h.m8234e(gVar);
                        break;
                    case 2:
                        bvVar.f21702b = _Text_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        bvVar.f21703c = _Text_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return bvVar;
            }
        }
    }
}
