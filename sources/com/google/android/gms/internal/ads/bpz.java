package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public final class bpz {

    /* renamed from: a */
    public final int f43517a;

    /* renamed from: b */
    public final byte[] f43518b;

    /* renamed from: c */
    public final Map<String, String> f43519c;

    /* renamed from: d */
    public final List<blz> f43520d;

    /* renamed from: e */
    public final boolean f43521e;

    /* renamed from: f */
    private final long f43522f;

    public bpz(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        List arrayList;
        if (map == null) {
            arrayList = null;
        } else if (map.isEmpty()) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList(map.size());
            for (Entry entry : map.entrySet()) {
                arrayList.add(new blz((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        List list = arrayList;
        this(i, bArr, map, list, z, j);
    }

    public bpz(int i, byte[] bArr, boolean z, long j, List<blz> list) {
        Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = Collections.emptyMap();
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (blz blz : list) {
                treeMap.put(blz.f42900a, blz.f42901b);
            }
        }
        Map map = treeMap;
        this(i, bArr, map, list, z, j);
    }

    public bpz(byte[] bArr, Map<String, String> map) {
        this(200, bArr, map, false, 0);
    }

    private bpz(int i, byte[] bArr, Map<String, String> map, List<blz> list, boolean z, long j) {
        this.f43517a = i;
        this.f43518b = bArr;
        this.f43519c = map;
        if (list == null) {
            this.f43520d = null;
        } else {
            this.f43520d = Collections.unmodifiableList(list);
        }
        this.f43521e = z;
        this.f43522f = j;
    }
}
