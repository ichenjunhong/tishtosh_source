package com.bytedance.p126ad.symphony;

import android.content.Context;
import com.bytedance.p126ad.symphony.p129b.p130a.C2683a;
import com.bytedance.p126ad.symphony.p137g.C2736a;
import com.bytedance.p126ad.symphony.p137g.C2737b;
import com.bytedance.p126ad.symphony.p138h.C2739a;
import com.bytedance.p126ad.symphony.p139i.C2745d;
import com.bytedance.p126ad.symphony.provider.AbsNativeAdProvider;
import com.bytedance.p126ad.symphony.provider.C2752b;
import com.bytedance.p126ad.symphony.provider.C2752b.C2753a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.ad.symphony.e */
public final class C2721e {
    /* renamed from: a */
    private static void m7778a(List<C2737b> list) {
        if (C2680b.m7713b()) {
            StringBuilder sb = new StringBuilder();
            List arrayList = new ArrayList(list);
            List arrayList2 = new ArrayList();
            int i = 0;
            while (arrayList != null && !arrayList.isEmpty()) {
                int i2 = i + 1;
                if (i > 0) {
                    sb.append("-->");
                }
                sb.append("[");
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    C2737b bVar = (C2737b) arrayList.get(i3);
                    if (i3 > 0) {
                        sb.append(", ");
                    } else {
                        arrayList2 = bVar.mo7292e();
                    }
                    sb.append(bVar.mo7291d());
                }
                sb.append("]");
                arrayList = arrayList2;
                i = i2;
            }
            new StringBuilder("requestQueue: ").append(sb.toString());
        }
    }

    /* renamed from: a */
    private static void m7779a(List<C2737b> list, List<C2737b> list2) {
        if (!C2745d.m7836a(list) && !C2745d.m7836a(list2)) {
            for (C2737b bVar : list) {
                for (C2737b a : list2) {
                    a.mo7285a(bVar);
                    bVar.mo7284a();
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m7780a(List<C2737b> list, String str, C2683a aVar) {
        for (C2737b bVar : list) {
            if (!AbsNativeAdProvider.isInhouseNativeAdProvider(bVar.mo7291d())) {
                C2752b bVar2 = (C2752b) aVar.f8153c.get(Integer.valueOf(bVar.mo7291d()));
                if (bVar2 != null && bVar2.hasValidAd(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static C2736a m7775a(Context context, int i, String str, C2753a aVar, C2683a aVar2) {
        C2736a aVar3;
        C2752b bVar = (C2752b) aVar2.f8153c.get(Integer.valueOf(i));
        C2739a a = aVar2.mo7253b().mo7299a(str);
        if (bVar == null || a == null) {
            aVar3 = null;
        } else {
            aVar3 = new C2736a(str, bVar, a, aVar);
        }
        if (aVar3 == null || !aVar3.mo7288a(context)) {
            return null;
        }
        new StringBuilder("handler-->").append(aVar3.mo7291d());
        return aVar3;
    }

    /* renamed from: a */
    public static List<C2737b> m7776a(Context context, C2739a aVar, String str, C2753a aVar2, C2683a aVar3) {
        if (aVar == null) {
            return null;
        }
        List c = aVar.mo7295c();
        List<Integer> d = aVar.mo7296d();
        LinkedList linkedList = new LinkedList();
        if (d != null) {
            for (Integer intValue : d) {
                C2736a a = m7775a(context, intValue.intValue(), str, aVar2, aVar3);
                if (a != null) {
                    linkedList.add(a);
                }
            }
        }
        linkedList.addAll(m7777a(context, c, str, aVar2, aVar3));
        return linkedList;
    }

    /* renamed from: a */
    private static List<C2737b> m7777a(Context context, List<List<Integer>> list, String str, C2753a aVar, C2683a aVar2) {
        LinkedList linkedList = new LinkedList();
        if (C2745d.m7836a(list) || C2745d.m7836a((List) list.get(0))) {
            return linkedList;
        }
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        for (int i = 0; i < list.size(); i++) {
            List list2 = (List) list.get(i);
            linkedList3.clear();
            for (int i2 = 0; i2 < list2.size(); i2++) {
                C2736a a = m7775a(context, ((Integer) list2.get(i2)).intValue(), str, aVar, aVar2);
                if (a != null) {
                    linkedList3.add(a);
                }
            }
            if (!linkedList3.isEmpty()) {
                if (m7780a(linkedList3, str, aVar2)) {
                    break;
                } else if (linkedList.isEmpty()) {
                    linkedList.addAll(linkedList3);
                    linkedList2.clear();
                    linkedList2.addAll(linkedList3);
                } else {
                    m7779a(linkedList3, linkedList2);
                    linkedList2.clear();
                    linkedList2.addAll(linkedList3);
                }
            }
        }
        m7778a(linkedList);
        return linkedList;
    }
}
