package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.C5743c.C5744a;
import com.bytedance.android.livesdkapi.depend.model.live._BannerInRoom_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.ay */
public final class C5736ay implements C2888b<C5744a> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m12617a(gVar);
    }

    /* renamed from: a */
    public static C5744a m12617a(C2895g gVar) throws Exception {
        C5744a aVar = new C5744a();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f15101a = C2896h.m8234e(gVar);
                        break;
                    case 2:
                        if (aVar.f15102b == null) {
                            aVar.f15102b = new ArrayList();
                        }
                        aVar.f15102b.add(_BannerInRoom_ProtoDecoder.decodeStatic(gVar));
                        break;
                    case 3:
                        aVar.f15103c = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 4:
                        aVar.f15104d = C5735ax.m12616a(gVar);
                        break;
                    case 5:
                        aVar.f15105e = (int) C2896h.m8232c(gVar);
                        break;
                    case 6:
                        aVar.f15106f = (int) C2896h.m8232c(gVar);
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
