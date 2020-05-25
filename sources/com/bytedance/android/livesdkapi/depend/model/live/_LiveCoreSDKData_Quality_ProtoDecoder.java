package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData.Quality;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _LiveCoreSDKData_Quality_ProtoDecoder implements C2888b<Quality> {
    public final Quality decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static Quality decodeStatic(C2895g gVar) throws Exception {
        Quality quality = new Quality();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        quality.name = C2896h.m8234e(gVar);
                        break;
                    case 2:
                        quality.sdkKey = C2896h.m8234e(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return quality;
            }
        }
    }
}
