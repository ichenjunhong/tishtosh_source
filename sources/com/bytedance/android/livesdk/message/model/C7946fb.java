package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.message.model.fb */
public final class C7946fb implements C2888b<C7832bg> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7832bg bgVar = new C7832bg();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bgVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        bgVar.f21600b = C2896h.m8231b(gVar);
                        break;
                    case 3:
                        bgVar.f21599a = C2896h.m8232c(gVar);
                        break;
                    case 4:
                        if (bgVar.f21601c == null) {
                            bgVar.f21601c = new ArrayList();
                        }
                        bgVar.f21601c.add(Long.valueOf(C2896h.m8232c(gVar)));
                        break;
                    case 5:
                        bgVar.f21603e = C2896h.m8231b(gVar);
                        break;
                    case 6:
                        bgVar.f21604f = C2896h.m8232c(gVar);
                        break;
                    case 7:
                        if (bgVar.f21602d == null) {
                            bgVar.f21602d = new ArrayList();
                        }
                        bgVar.f21602d.add(C2896h.m8234e(gVar));
                        break;
                    case 8:
                        bgVar.f21605g = C2896h.m8234e(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return bgVar;
            }
        }
    }
}
