package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.ArrayList;

public final class _NobleLevelInfo_ProtoDecoder implements C2888b<NobleLevelInfo> {
    public final NobleLevelInfo decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static NobleLevelInfo decodeStatic(C2895g gVar) throws Exception {
        NobleLevelInfo nobleLevelInfo = new NobleLevelInfo();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        nobleLevelInfo.nobleBackground = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        nobleLevelInfo.nobleLevel = C2896h.m8232c(gVar);
                        break;
                    case 3:
                        nobleLevelInfo.nobleIcon = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 4:
                        nobleLevelInfo.nobleName = C2896h.m8234e(gVar);
                        break;
                    case 5:
                        nobleLevelInfo.expireTime = C2896h.m8232c(gVar);
                        break;
                    case 6:
                        nobleLevelInfo.nobleBigIcon = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 7:
                        nobleLevelInfo.nobleIconWithBack = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 8:
                        nobleLevelInfo.nobleBoarder = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 9:
                        if (nobleLevelInfo.nobleBackgroundColor == null) {
                            nobleLevelInfo.nobleBackgroundColor = new ArrayList();
                        }
                        nobleLevelInfo.nobleBackgroundColor.add(C2896h.m8234e(gVar));
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return nobleLevelInfo;
            }
        }
    }
}
