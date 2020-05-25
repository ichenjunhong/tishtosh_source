package com.p683ss.android.ugc.aweme.setting.model;

import com.p683ss.android.ugc.aweme.sharer.C42307b;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.setting.model.WebShareModeOrder */
public final class WebShareModeOrder implements Comparator<C42307b> {
    private final List<WebShareMode> shareModes;

    public WebShareModeOrder(List<WebShareMode> list) {
        this.shareModes = list;
    }

    public final int compare(C42307b bVar, C42307b bVar2) {
        boolean z;
        boolean z2;
        int i;
        C52711k.m112240b(bVar, "lhs");
        C52711k.m112240b(bVar2, "rhs");
        Collection collection = this.shareModes;
        boolean z3 = true;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 0;
        }
        Iterator it = this.shareModes.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (C52711k.m112239a((Object) ((WebShareMode) it.next()).platformId, (Object) bVar.mo86136b())) {
                break;
            } else {
                i2++;
            }
        }
        Integer valueOf = Integer.valueOf(i2);
        if (valueOf.intValue() != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            valueOf = null;
        }
        int i3 = 100;
        if (valueOf != null) {
            i = valueOf.intValue();
        } else {
            i = 100;
        }
        Iterator it2 = this.shareModes.iterator();
        int i4 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i4 = -1;
                break;
            } else if (C52711k.m112239a((Object) ((WebShareMode) it2.next()).platformId, (Object) bVar2.mo86136b())) {
                break;
            } else {
                i4++;
            }
        }
        Integer valueOf2 = Integer.valueOf(i4);
        if (valueOf2.intValue() == -1) {
            z3 = false;
        }
        if (!z3) {
            valueOf2 = null;
        }
        if (valueOf2 != null) {
            i3 = valueOf2.intValue();
        }
        return i - i3;
    }
}
