package com.p683ss.android.ugc.aweme.video.hashtag.helper;

import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p683ss.android.ugc.aweme.shortvideo.C43858g;
import com.p683ss.android.ugc.aweme.shortvideo.C43870h;
import com.p683ss.android.ugc.aweme.video.hashtag.C48029c;
import com.ss.android.ugc.trill.R;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.video.hashtag.helper.a */
public final class C48036a {

    /* renamed from: a */
    public static final C48036a f120718a = new C48036a();

    private C48036a() {
    }

    /* renamed from: a */
    public static final List<C48029c> m104032a(List<? extends AVChallenge> list, C43870h hVar) {
        boolean z;
        boolean z2;
        List<? extends C43858g> list2;
        List<C48029c> linkedList = new LinkedList<>();
        if (hVar != null) {
            list2 = hVar.f111127a;
            z2 = hVar.f111128b;
            z = hVar.f111129c;
        } else {
            list2 = null;
            z = false;
            z2 = true;
        }
        if (list != null && z2) {
            m104034a(linkedList, list, list2);
        }
        m104033a(linkedList, list2);
        int i = 20;
        if (list2 != null && !list2.isEmpty() && !z) {
            i = ((C43858g) list2.get(list2.size() - 1)).f111095b + 1;
        }
        if (i <= linkedList.size() - 1) {
            return linkedList.subList(0, i);
        }
        return linkedList;
    }

    /* renamed from: a */
    private static void m104033a(List<C48029c> list, List<? extends C43858g> list2) {
        if (list2 != null) {
            for (C43858g gVar : list2) {
                C48029c cVar = new C48029c();
                cVar.f120708b = 2;
                if (gVar.f111094a == 0) {
                    cVar.f120712f = "recommendation";
                } else {
                    cVar.f120712f = "commercial";
                }
                cVar.f120707a = gVar.f111096c;
                if (gVar.f111094a == 2) {
                    cVar.f120709c = R.drawable.d4q;
                } else if (gVar.f111094a == 3) {
                    cVar.f120709c = R.drawable.d4p;
                } else {
                    cVar.f120709c = -1;
                }
                cVar.f120711e = gVar.f111097d;
                if (gVar.f111095b > list.size()) {
                    list.add(cVar);
                } else if (gVar.f111095b < 0) {
                    list.add(0, cVar);
                } else {
                    list.add(gVar.f111095b, cVar);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m104034a(List<C48029c> list, List<? extends AVChallenge> list2, List<? extends C43858g> list3) {
        HashSet hashSet = new HashSet();
        if (list3 != null) {
            for (C43858g gVar : list3) {
                hashSet.add(gVar.f111096c.challengeName);
            }
        }
        for (AVChallenge aVChallenge : list2) {
            C48029c cVar = new C48029c();
            cVar.f120708b = 2;
            cVar.f120712f = "history";
            cVar.f120707a = aVChallenge;
            cVar.f120709c = R.drawable.amn;
            cVar.f120710d = true;
            if (!hashSet.contains(aVChallenge.getChallengeName())) {
                list.add(cVar);
            }
        }
    }
}
