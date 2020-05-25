package com.p683ss.android.ugc.aweme.poi.p2074ui.upload;

import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.net.C37776h;
import com.p683ss.android.ugc.aweme.poi.api.PoiUploadImageApi;
import com.p683ss.android.ugc.aweme.poi.model.C39115au;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.b */
public final class C39424b extends C26832a<C39115au> {
    public final boolean checkParams(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        if (objArr.length == 3) {
            return true;
        }
        return false;
    }

    public final boolean sendRequest(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        String str = objArr[0];
        if (str != null) {
            String str2 = str;
            String str3 = objArr[1];
            if (str3 != null) {
                String str4 = str3;
                String str5 = objArr[2];
                if (str5 != null) {
                    String str6 = str5;
                    C52711k.m112240b(str2, "poiId");
                    C52711k.m112240b(str4, "uriList");
                    C52711k.m112240b(str6, "waterMark");
                    PoiUploadImageApi.f99534a.uploadPoiImgRequest(str2, str4, str6).mo20a((C0011g<TResult, TContinuationResult>) new C37776h<TResult,TContinuationResult>(this.mHandler, 0), C0013i.f25b);
                    return true;
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.String");
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.String");
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.String");
    }
}
