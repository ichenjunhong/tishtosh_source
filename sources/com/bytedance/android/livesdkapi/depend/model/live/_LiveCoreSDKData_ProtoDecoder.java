package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _LiveCoreSDKData_ProtoDecoder implements C2888b<LiveCoreSDKData> {
    public final LiveCoreSDKData decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static LiveCoreSDKData decodeStatic(C2895g gVar) throws Exception {
        LiveCoreSDKData liveCoreSDKData = new LiveCoreSDKData();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b == -1) {
                gVar.mo7516a(a);
                return liveCoreSDKData;
            } else if (b != 1) {
                C2896h.m8236g(gVar);
            } else {
                liveCoreSDKData.pullData = _LiveCoreSDKData_PullData_ProtoDecoder.decodeStatic(gVar);
            }
        }
    }
}
