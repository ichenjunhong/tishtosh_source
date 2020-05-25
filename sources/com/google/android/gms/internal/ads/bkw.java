package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

public final class bkw extends bkv {

    /* renamed from: a */
    private final int f42824a;

    /* renamed from: b */
    private final Map<String, List<String>> f42825b;

    public bkw(int i, Map<String, List<String>> map, bkn bkn) {
        StringBuilder sb = new StringBuilder(26);
        sb.append("Response code: ");
        sb.append(i);
        super(sb.toString(), bkn);
        this.f42824a = i;
        this.f42825b = map;
    }
}
