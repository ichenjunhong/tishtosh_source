package com.p683ss.android.ugc.aweme.effectplatform;

import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.a */
public final class C29240a {
    /* renamed from: a */
    public static UrlModel m68865a(com.p683ss.android.ugc.effectmanager.common.model.UrlModel urlModel) {
        UrlModel urlModel2 = new UrlModel();
        if (urlModel != null) {
            urlModel2.setUri(urlModel.getUri());
            urlModel2.setUrlList(new ArrayList(urlModel.getUrlList()));
        }
        return urlModel2;
    }
}
