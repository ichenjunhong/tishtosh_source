package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C15464q;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.bh */
public final class C16564bh {

    /* renamed from: a */
    public final Map<String, String> f46556a;

    /* renamed from: b */
    public final List<zzbr> f46557b;

    /* renamed from: c */
    public final long f46558c;

    /* renamed from: d */
    public final long f46559d;

    /* renamed from: e */
    public final int f46560e;

    /* renamed from: f */
    public final boolean f46561f;

    /* renamed from: g */
    private final String f46562g;

    public C16564bh(C16859q qVar, Map<String, String> map, long j, boolean z) {
        this(qVar, map, j, true, 0, 0, null);
    }

    public C16564bh(C16859q qVar, Map<String, String> map, long j, boolean z, long j2, int i) {
        this(qVar, map, j, z, j2, i, null);
    }

    public C16564bh(C16859q qVar, Map<String, String> map, long j, boolean z, long j2, int i, List<zzbr> list) {
        List<zzbr> list2;
        String str;
        C15464q.m32123a(qVar);
        C15464q.m32123a(map);
        this.f46559d = j;
        this.f46561f = z;
        this.f46558c = j2;
        this.f46560e = i;
        if (list != null) {
            list2 = list;
        } else {
            list2 = Collections.emptyList();
        }
        this.f46557b = list2;
        String str2 = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                zzbr zzbr = (zzbr) it.next();
                if ("appendVersion".equals(zzbr.f47588a)) {
                    str = zzbr.f47589b;
                    break;
                }
            }
        }
        str = null;
        if (!TextUtils.isEmpty(str)) {
            str2 = str;
        }
        this.f46562g = str2;
        HashMap hashMap = new HashMap();
        for (Entry entry : map.entrySet()) {
            if (m39521a(entry.getKey())) {
                String a = m39520a(qVar, entry.getKey());
                if (a != null) {
                    hashMap.put(a, m39522b(qVar, entry.getValue()));
                }
            }
        }
        for (Entry entry2 : map.entrySet()) {
            if (!m39521a(entry2.getKey())) {
                String a2 = m39520a(qVar, entry2.getKey());
                if (a2 != null) {
                    hashMap.put(a2, m39522b(qVar, entry2.getValue()));
                }
            }
        }
        if (!TextUtils.isEmpty(this.f46562g)) {
            C16585cb.m39589a((Map<String, String>) hashMap, "_v", this.f46562g);
            if (this.f46562g.equals("ma4.0.0") || this.f46562g.equals("ma4.0.1")) {
                hashMap.remove("adid");
            }
        }
        this.f46556a = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    private static boolean m39521a(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj.toString().startsWith("&");
    }

    /* renamed from: a */
    private static String m39520a(C16859q qVar, Object obj) {
        if (obj == null) {
            return null;
        }
        String obj2 = obj.toString();
        if (obj2.startsWith("&")) {
            obj2 = obj2.substring(1);
        }
        int length = obj2.length();
        if (length > 256) {
            obj2 = obj2.substring(0, UnReadVideoExperiment.BROWSE_RECORD_LIST);
            qVar.mo32499c("Hit param name is too long and will be trimmed", Integer.valueOf(length), obj2);
        }
        if (TextUtils.isEmpty(obj2)) {
            return null;
        }
        return obj2;
    }

    /* renamed from: b */
    private static String m39522b(C16859q qVar, Object obj) {
        String obj2 = obj == null ? "" : obj.toString();
        int length = obj2.length();
        if (length <= 8192) {
            return obj2;
        }
        String substring = obj2.substring(0, VideoCacheReadBuffersizeExperiment.DEFAULT);
        qVar.mo32499c("Hit param value is too long and will be trimmed", Integer.valueOf(length), substring);
        return substring;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo31823a(String str, String str2) {
        C15464q.m32125a(str);
        C15464q.m32134b(!str.startsWith("&"), "Short param name required");
        String str3 = (String) this.f46556a.get(str);
        return str3 != null ? str3 : str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ht=");
        sb.append(this.f46559d);
        if (this.f46558c != 0) {
            sb.append(", dbId=");
            sb.append(this.f46558c);
        }
        if (this.f46560e != 0) {
            sb.append(", appUID=");
            sb.append(this.f46560e);
        }
        ArrayList arrayList = new ArrayList(this.f46556a.keySet());
        Collections.sort(arrayList);
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            String str = (String) obj;
            sb.append(", ");
            sb.append(str);
            sb.append("=");
            sb.append((String) this.f46556a.get(str));
        }
        return sb.toString();
    }
}
