package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData.PullData;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _LiveCoreSDKData_PullData_ProtoDecoder implements C2888b<PullData> {
    public final PullData decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static PullData decodeStatic(C2895g gVar) throws Exception {
        PullData pullData = new PullData();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        pullData.streamData = C2896h.m8234e(gVar);
                        break;
                    case 2:
                        pullData.options = _LiveCoreSDKData_Options_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return pullData;
            }
        }
    }
}
