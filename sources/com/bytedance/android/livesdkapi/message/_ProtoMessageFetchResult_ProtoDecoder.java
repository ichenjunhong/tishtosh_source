package com.bytedance.android.livesdkapi.message;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.ArrayList;

public final class _ProtoMessageFetchResult_ProtoDecoder implements C2888b<C8849f> {
    public final C8849f decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C8849f decodeStatic(C2895g gVar) throws Exception {
        C8849f fVar = new C8849f();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        if (fVar.f24148a == null) {
                            fVar.f24148a = new ArrayList();
                        }
                        fVar.f24148a.add(_ProtoMessageFetchResult_BaseProtoMessage_ProtoDecoder.decodeStatic(gVar));
                        break;
                    case 2:
                        fVar.f24149b = C2896h.m8234e(gVar);
                        break;
                    case 3:
                        fVar.f24150c = C2896h.m8232c(gVar);
                        break;
                    case 4:
                        fVar.f24151d = C2896h.m8232c(gVar);
                        break;
                    case 5:
                        fVar.f24152e = C2896h.m8234e(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return fVar;
            }
        }
    }
}
