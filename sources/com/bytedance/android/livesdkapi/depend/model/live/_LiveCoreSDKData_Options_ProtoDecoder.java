package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData.Options;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.ArrayList;

public final class _LiveCoreSDKData_Options_ProtoDecoder implements C2888b<Options> {
    public final Options decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static Options decodeStatic(C2895g gVar) throws Exception {
        Options options = new Options();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        options.defaultQuality = _LiveCoreSDKData_Quality_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        if (options.qualityList == null) {
                            options.qualityList = new ArrayList();
                        }
                        options.qualityList.add(_LiveCoreSDKData_Quality_ProtoDecoder.decodeStatic(gVar));
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return options;
            }
        }
    }
}
