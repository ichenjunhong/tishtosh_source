package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.chatroom.model.C5737az;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.cv */
public final class C7883cv implements C2888b<C7824b> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7824b bVar = new C7824b();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b == -1) {
                gVar.mo7516a(a);
                return bVar;
            } else if (b == 1) {
                bVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
            } else if (b != 3) {
                C2896h.m8236g(gVar);
            } else {
                bVar.f21538a = C5737az.m12618a(gVar);
            }
        }
    }
}
