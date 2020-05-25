package com.bytedance.android.live.base.model;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.ArrayList;

public final class _FlexImageModel_ProtoDecoder implements C2888b<FlexImageModel> {
    public final FlexImageModel decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static FlexImageModel decodeStatic(C2895g gVar) throws Exception {
        FlexImageModel flexImageModel = new FlexImageModel();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        if (flexImageModel.mUrls == null) {
                            flexImageModel.mUrls = new ArrayList();
                        }
                        flexImageModel.mUrls.add(C2896h.m8234e(gVar));
                        break;
                    case 2:
                        flexImageModel.mUri = C2896h.m8234e(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return flexImageModel;
            }
        }
    }
}
