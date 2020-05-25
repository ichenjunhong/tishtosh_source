package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1821f;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.f.c */
public final class C33455c {

    /* renamed from: a */
    public static final C33455c f86705a = new C33455c();

    private C33455c() {
    }

    /* renamed from: a */
    public static final UrlModel m76688a(UrlModel urlModel, String str) {
        if (urlModel == null) {
            urlModel = new UrlModel();
        }
        if (urlModel.getUrlList() == null) {
            urlModel.setUrlList(new ArrayList());
        }
        if (!TextUtils.isEmpty(str) && new File(str).exists()) {
            List urlList = urlModel.getUrlList();
            StringBuilder sb = new StringBuilder("file://");
            sb.append(str);
            urlList.add(0, sb.toString());
        }
        if (urlModel.getUrlList().isEmpty()) {
            urlModel.getUrlList().add("error_picture_path");
        }
        return urlModel;
    }
}
