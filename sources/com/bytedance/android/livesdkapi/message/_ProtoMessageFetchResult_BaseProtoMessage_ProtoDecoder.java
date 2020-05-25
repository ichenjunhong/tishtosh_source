package com.bytedance.android.livesdkapi.message;

import com.bytedance.android.livesdkapi.message.C8849f.C8850a;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _ProtoMessageFetchResult_BaseProtoMessage_ProtoDecoder implements C2888b<C8850a> {
    public final C8850a decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C8850a decodeStatic(C2895g gVar) throws Exception {
        C8850a aVar = new C8850a();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f24153a = C2896h.m8234e(gVar);
                        break;
                    case 2:
                        aVar.f24154b = C2896h.m8235f(gVar);
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
