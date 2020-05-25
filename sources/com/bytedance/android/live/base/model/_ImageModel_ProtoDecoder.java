package com.bytedance.android.live.base.model;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.ArrayList;

public final class _ImageModel_ProtoDecoder implements C2888b<ImageModel> {
    public final ImageModel decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static ImageModel decodeStatic(C2895g gVar) throws Exception {
        ImageModel imageModel = new ImageModel();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        if (imageModel.mUrls == null) {
                            imageModel.mUrls = new ArrayList();
                        }
                        imageModel.mUrls.add(C2896h.m8234e(gVar));
                        break;
                    case 2:
                        imageModel.mUri = C2896h.m8234e(gVar);
                        break;
                    case 3:
                        imageModel.height = (int) C2896h.m8232c(gVar);
                        break;
                    case 4:
                        imageModel.width = (int) C2896h.m8232c(gVar);
                        break;
                    case 5:
                        imageModel.avgColor = C2896h.m8234e(gVar);
                        break;
                    case 6:
                        imageModel.imageType = C2896h.m8231b(gVar);
                        break;
                    case 7:
                        imageModel.schema = C2896h.m8234e(gVar);
                        break;
                    case 8:
                        imageModel.content = _ImageModel_Content_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 9:
                        imageModel.isAnimated = C2896h.m8230a(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return imageModel;
            }
        }
    }
}
