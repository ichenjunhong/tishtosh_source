package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.C5739ba;
import com.bytedance.android.livesdk.chatroom.model.C5742bd;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.message.model.fd */
public final class C7948fd implements C2888b<C7833bh> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7833bh bhVar = new C7833bh();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bhVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        bhVar.f21612g = (int) C2896h.m8232c(gVar);
                        break;
                    case 3:
                        bhVar.f21607b = C2896h.m8232c(gVar);
                        break;
                    case 4:
                        bhVar.f21608c = C2896h.m8232c(gVar);
                        break;
                    case 5:
                        bhVar.f21609d = (int) C2896h.m8232c(gVar);
                        break;
                    case 6:
                        bhVar.f21610e = (int) C2896h.m8232c(gVar);
                        break;
                    case 7:
                        bhVar.f21611f = C2896h.m8234e(gVar);
                        break;
                    case 8:
                        bhVar.f21614i = C2896h.m8230a(gVar);
                        break;
                    case 9:
                        bhVar.f21616k = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 10:
                        bhVar.f21617l = C2896h.m8230a(gVar);
                        break;
                    case 11:
                        bhVar.f21613h = (int) C2896h.m8232c(gVar);
                        break;
                    case 12:
                        bhVar.f21606a = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 13:
                        if (bhVar.f21615j == null) {
                            bhVar.f21615j = new ArrayList();
                        }
                        bhVar.f21615j.add(C5739ba.m12619a(gVar));
                        break;
                    case 14:
                        bhVar.f21618m = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 15:
                        bhVar.f21620o = C2896h.m8232c(gVar);
                        break;
                    case 16:
                        bhVar.f21621p = C2896h.m8231b(gVar);
                        break;
                    case 17:
                        bhVar.f21622q = C2896h.m8231b(gVar);
                        break;
                    case 18:
                        bhVar.f21623r = C2896h.m8231b(gVar);
                        break;
                    case 19:
                        bhVar.f21619n = C5742bd.m12622a(gVar);
                        break;
                    case 20:
                        bhVar.f21626u = C7970fz.m15906a(gVar);
                        break;
                    case 21:
                        bhVar.f21625t = C2896h.m8232c(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return bhVar;
            }
        }
    }
}
