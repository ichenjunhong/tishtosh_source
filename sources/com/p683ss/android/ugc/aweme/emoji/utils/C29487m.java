package com.p683ss.android.ugc.aweme.emoji.utils;

import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.m */
public final class C29487m {
    /* renamed from: a */
    public static UrlModel m69578a(String str, int i, int i2) {
        if (str == null) {
            return null;
        }
        UrlModel urlModel = new UrlModel();
        urlModel.setHeight(i2);
        urlModel.setWidth(i);
        urlModel.setUri(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        urlModel.setUrlList(arrayList);
        return urlModel;
    }
}
