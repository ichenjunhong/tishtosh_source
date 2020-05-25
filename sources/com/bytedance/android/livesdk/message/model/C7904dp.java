package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.message.model.dp */
public final class C7904dp implements C2888b<C8011u> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C8011u uVar = new C8011u();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        uVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        if (uVar.f21922a == null) {
                            uVar.f21922a = new ArrayList();
                        }
                        uVar.f21922a.add(C7972ga.m15907a(gVar));
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return uVar;
            }
        }
    }
}
