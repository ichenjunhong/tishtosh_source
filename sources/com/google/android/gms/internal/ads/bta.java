package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

public final class bta extends bsz {

    /* renamed from: a */
    private final int f43827a;

    /* renamed from: b */
    private final Map<String, List<String>> f43828b;

    public bta(int i, Map<String, List<String>> map, bsu bsu) {
        StringBuilder sb = new StringBuilder(26);
        sb.append("Response code: ");
        sb.append(i);
        super(sb.toString(), bsu, 1);
        this.f43827a = i;
        this.f43828b = map;
    }
}
