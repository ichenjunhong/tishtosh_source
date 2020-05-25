package com.p683ss.android.ugc.aweme.account.util;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.account.util.d */
public final class C22262d {

    /* renamed from: a */
    public static final Set<Integer> f60036a = new HashSet(Arrays.asList(new Integer[]{Integer.valueOf(1), Integer.valueOf(6)}));

    /* renamed from: a */
    public static String m55108a(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("third_party_")) {
            return null;
        }
        return str.replace("third_party_", "");
    }
}
