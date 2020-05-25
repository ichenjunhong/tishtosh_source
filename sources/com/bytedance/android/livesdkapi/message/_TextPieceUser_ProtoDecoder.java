package com.bytedance.android.livesdkapi.message;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _TextPieceUser_ProtoDecoder implements C2888b<C8857m> {
    public final C8857m decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C8857m decodeStatic(C2895g gVar) throws Exception {
        C8857m mVar = new C8857m();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        mVar.f24174a = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        mVar.f24175b = C2896h.m8230a(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return mVar;
            }
        }
    }
}
