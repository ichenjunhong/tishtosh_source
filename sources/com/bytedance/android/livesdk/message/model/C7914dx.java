package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.dx */
public final class C7914dx implements C2888b<C7799af> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7799af afVar = new C7799af();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        afVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        afVar.f21449a = C2896h.m8231b(gVar);
                        break;
                    case 3:
                        afVar.f21450b = C2896h.m8234e(gVar);
                        break;
                    case 4:
                        afVar.f21451c = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 5:
                        afVar.f21452d = C7915dy.m15890a(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return afVar;
            }
        }
    }
}
