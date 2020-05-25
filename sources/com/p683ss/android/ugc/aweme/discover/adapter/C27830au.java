package com.p683ss.android.ugc.aweme.discover.adapter;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.discover.model.CardType;
import com.p683ss.android.ugc.aweme.discover.model.SearchMusic;
import com.p683ss.android.ugc.aweme.music.model.Music;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.au */
public final class C27830au {

    /* renamed from: a */
    final List<SearchMusic> f73111a = new ArrayList();

    /* renamed from: a */
    public static boolean m66578a(SearchMusic searchMusic) {
        C52711k.m112240b(searchMusic, "searchMusic");
        return searchMusic instanceof C27907k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo56255b(List<? extends SearchMusic> list) {
        if (list != null) {
            this.f73111a.clear();
            this.f73111a.addAll(list);
        }
    }

    /* renamed from: a */
    public final List<SearchMusic> mo56254a(List<? extends SearchMusic> list) {
        boolean z;
        Collection collection = list;
        if (C9376b.m18558a(collection)) {
            return new ArrayList<>();
        }
        mo56255b(list);
        if (list == null) {
            C52711k.m112234a();
        }
        List e = C52575l.m112139e(collection);
        ListIterator listIterator = e.listIterator();
        while (listIterator.hasNext()) {
            SearchMusic searchMusic = (SearchMusic) listIterator.next();
            if (searchMusic.getCardType() == CardType.TYPE_CLUSTER.getValue() && !C9376b.m18558a((Collection<T>) searchMusic.getMusicList())) {
                listIterator.remove();
                SearchMusic searchMusic2 = new SearchMusic();
                searchMusic2.setCardType(CardType.TYPE_NORMAL.getValue());
                List musicList = searchMusic.getMusicList();
                if (musicList == null) {
                    C52711k.m112234a();
                }
                searchMusic2.setMusic((Music) C52575l.m112137e(musicList));
                listIterator.add(searchMusic2);
                C27907k kVar = new C27907k(false, null, 3, null);
                List clusterList = kVar.getClusterList();
                List musicList2 = searchMusic.getMusicList();
                if (musicList2 == null) {
                    C52711k.m112234a();
                }
                List musicList3 = searchMusic.getMusicList();
                if (musicList3 == null) {
                    C52711k.m112234a();
                }
                clusterList.addAll(musicList2.subList(1, musicList3.size()));
                listIterator.add(kVar);
            }
        }
        Iterable iterable = e;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            SearchMusic searchMusic3 = (SearchMusic) next;
            if (!(searchMusic3 instanceof C27907k) || ((C27907k) searchMusic3).getClusterList().size() > 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                arrayList.add(next);
            }
        }
        return C52575l.m112139e((Collection<? extends T>) (List) arrayList);
    }
}
