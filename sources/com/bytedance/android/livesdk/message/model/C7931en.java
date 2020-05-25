package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.message.model.en */
public final class C7931en implements C2888b<C7815at> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7815at atVar = new C7815at();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        atVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        if (atVar.f21520a == null) {
                            atVar.f21520a = new ArrayList();
                        }
                        atVar.f21520a.add(Long.valueOf(C2896h.m8232c(gVar)));
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return atVar;
            }
        }
    }
}
