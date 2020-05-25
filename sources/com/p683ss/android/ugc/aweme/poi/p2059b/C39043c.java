package com.p683ss.android.ugc.aweme.poi.p2059b;

import android.text.TextUtils;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.b.c */
public final class C39043c implements Serializable {
    public static String pageKey;

    public final boolean isSamePage(String str) {
        if (TextUtils.isEmpty(pageKey) || !pageKey.equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }
}
