package com.p683ss.android.ugc.aweme.shortvideo.model;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStructHelper */
public final class AVTextExtraStructHelper {
    public static final AVTextExtraStructHelper INSTANCE = new AVTextExtraStructHelper();

    private AVTextExtraStructHelper() {
    }

    public static final AVTextExtraStruct createAtStruct(int i, int i2, String str) {
        C52711k.m112240b(str, "userId");
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.atUserType = "";
        aVTextExtraStruct.type = 0;
        aVTextExtraStruct.start = i;
        aVTextExtraStruct.end = i2;
        aVTextExtraStruct.userId = str;
        return aVTextExtraStruct;
    }

    public static final AVTextExtraStruct createCommentStruct(int i, int i2, String str) {
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.type = 0;
        aVTextExtraStruct.subType = 2;
        aVTextExtraStruct.start = i;
        aVTextExtraStruct.end = i2;
        aVTextExtraStruct.userId = str;
        return aVTextExtraStruct;
    }

    public static final AVTextExtraStruct createDuetStruct(int i, int i2, String str, String str2) {
        C52711k.m112240b(str, "userId");
        C52711k.m112240b(str2, "awemeId");
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.atUserType = "";
        aVTextExtraStruct.type = 0;
        aVTextExtraStruct.subType = 1;
        aVTextExtraStruct.start = i;
        aVTextExtraStruct.end = i2;
        aVTextExtraStruct.userId = str;
        aVTextExtraStruct.awemeId = str2;
        return aVTextExtraStruct;
    }
}
