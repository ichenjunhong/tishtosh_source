package com.p683ss.android.ugc.aweme.music.p1974b;

import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.util.Collection;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.b.d */
public final class C37332d {
    /* renamed from: a */
    public static final String m83628a(UrlModel urlModel) {
        if (urlModel == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("UrlModel: ");
        sb.append(urlModel.getUrlList());
        return sb.toString();
    }

    /* renamed from: b */
    public static final String m83629b(UrlModel urlModel) {
        C52711k.m112240b(urlModel, "$this$firstUrl");
        List urlList = urlModel.getUrlList();
        if (urlList != null) {
            return (String) C52575l.m112140f(urlList);
        }
        return null;
    }

    /* renamed from: c */
    public static final List<String> m83630c(UrlModel urlModel) {
        C52711k.m112240b(urlModel, "$this$backUpUrl");
        List urlList = urlModel.getUrlList();
        if (urlList == null) {
            return C52575l.m112097a();
        }
        List<String> e = C52575l.m112139e((Collection<? extends T>) urlList);
        e.remove(m83629b(urlModel));
        return e;
    }
}
