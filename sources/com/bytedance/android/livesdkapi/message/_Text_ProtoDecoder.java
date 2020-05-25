package com.bytedance.android.livesdkapi.message;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.ArrayList;

public final class _Text_ProtoDecoder implements C2888b<C8851g> {
    public final C8851g decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C8851g decodeStatic(C2895g gVar) throws Exception {
        C8851g gVar2 = new C8851g();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        gVar2.f24155a = C2896h.m8234e(gVar);
                        break;
                    case 2:
                        gVar2.f24156b = C2896h.m8234e(gVar);
                        break;
                    case 3:
                        gVar2.f24157c = _TextFormat_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 4:
                        if (gVar2.f24158d == null) {
                            gVar2.f24158d = new ArrayList();
                        }
                        gVar2.f24158d.add(_TextPiece_ProtoDecoder.decodeStatic(gVar));
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return gVar2;
            }
        }
    }
}
