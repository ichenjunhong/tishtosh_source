package com.bytedance.android.live.base.model;

import com.bytedance.android.live.base.model.ImageModel.Content;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _ImageModel_Content_ProtoDecoder implements C2888b<Content> {
    public final Content decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static Content decodeStatic(C2895g gVar) throws Exception {
        Content content = new Content();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        content.f8664a = C2896h.m8234e(gVar);
                        break;
                    case 2:
                        content.f8665b = C2896h.m8234e(gVar);
                        break;
                    case 3:
                        content.f8666c = C2896h.m8232c(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return content;
            }
        }
    }
}
