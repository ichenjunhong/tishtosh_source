package com.p683ss.android.ugc.aweme.share.p2154e;

import android.text.TextUtils;
import com.p683ss.android.ugc.trill.share.data.C50448a;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.share.e.b */
final /* synthetic */ class C42007b implements Comparator {

    /* renamed from: a */
    private final Map f106331a;

    /* renamed from: b */
    private final List f106332b;

    C42007b(Map map, List list) {
        this.f106331a = map;
        this.f106332b = list;
    }

    public final int compare(Object obj, Object obj2) {
        Map map = this.f106331a;
        List<C50448a> list = this.f106332b;
        String str = (String) obj;
        String str2 = (String) obj2;
        int intValue = ((Integer) map.get(str2)).intValue() - ((Integer) map.get(str)).intValue();
        if (intValue != 0) {
            return intValue;
        }
        long j = 0;
        long j2 = 0;
        for (C50448a aVar : list) {
            if (TextUtils.equals(aVar.f126502c, str) && j2 <= 0) {
                j2 = aVar.f126501b.longValue();
            } else if (TextUtils.equals(aVar.f126502c, str2) && j <= 0) {
                j = aVar.f126501b.longValue();
            }
        }
        return (int) (j - j2);
    }
}
