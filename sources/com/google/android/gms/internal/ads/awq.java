package com.google.android.gms.internal.ads;

import java.util.Comparator;

final class awq implements Comparator<awo> {
    awq() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        awo awo = (awo) obj;
        awo awo2 = (awo) obj2;
        awv awv = (awv) awo.iterator();
        awv awv2 = (awv) awo2.iterator();
        while (awv.hasNext() && awv2.hasNext()) {
            int compare = Integer.compare(awo.m34291a(awv.mo29625a()), awo.m34291a(awv2.mo29625a()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(awo.size(), awo2.size());
    }
}
