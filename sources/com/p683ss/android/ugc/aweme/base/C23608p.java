package com.p683ss.android.ugc.aweme.base;

import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.util.Collections;

/* renamed from: com.ss.android.ugc.aweme.base.p */
public final class C23608p {
    /* renamed from: a */
    public static C23550k m57874a(UrlModel urlModel) {
        if (urlModel == null) {
            return new C23550k("", Collections.emptyList());
        }
        return new C23550k(urlModel.getUri(), urlModel.getUrlList());
    }
}
