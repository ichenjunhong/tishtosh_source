package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5706o;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.message.model.ew */
public final class C7940ew implements C2888b<C7826bb> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7826bb bbVar = new C7826bb();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bbVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        bbVar.f21542a = (int) C2896h.m8232c(gVar);
                        break;
                    case 3:
                        if (bbVar.f21543b == null) {
                            bbVar.f21543b = new ArrayList();
                        }
                        bbVar.f21543b.add(C5706o.m12613a(gVar));
                        break;
                    case 4:
                        bbVar.f21544c = C2896h.m8234e(gVar);
                        break;
                    case 5:
                        bbVar.f21545d = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 6:
                        bbVar.f21546e = (int) C2896h.m8232c(gVar);
                        break;
                    case 7:
                        bbVar.f21547f = C5706o.m12613a(gVar);
                        break;
                    case 8:
                        bbVar.f21548g = C2896h.m8232c(gVar);
                        break;
                    case 9:
                        bbVar.f21549h = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 11:
                        bbVar.f21550i = C2896h.m8232c(gVar);
                        break;
                    case 12:
                        bbVar.f21551j = C2896h.m8232c(gVar);
                        break;
                    case 13:
                        bbVar.f21552k = C2896h.m8232c(gVar);
                        break;
                    case 14:
                        bbVar.f21553l = C2896h.m8232c(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return bbVar;
            }
        }
    }
}
