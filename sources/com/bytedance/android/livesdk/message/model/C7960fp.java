package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.message.model.C7843bp.C7847d;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.fp */
public final class C7960fp implements C2888b<C7847d> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m15903a(gVar);
    }

    /* renamed from: a */
    public static C7847d m15903a(C2895g gVar) throws Exception {
        C7847d dVar = new C7847d();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        dVar.f21679a = C2896h.m8232c(gVar);
                        break;
                    case 2:
                        dVar.f21680b = C2896h.m8232c(gVar);
                        break;
                    case 3:
                        dVar.f21681c = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 4:
                        dVar.f21682d = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return dVar;
            }
        }
    }
}
