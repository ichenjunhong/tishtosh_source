package com.bytedance.p702im.core.internal.utils;

import com.bytedance.p702im.core.p706c.C11207p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.utils.f */
public final class C11468f extends ArrayList<C11207p> {
    public C11468f() {
    }

    public C11468f(Collection<? extends C11207p> collection) {
        super(collection);
    }

    public final boolean update(C11207p pVar) {
        int indexOf = indexOf(pVar);
        if (indexOf < 0) {
            return false;
        }
        set(indexOf, pVar);
        return true;
    }

    /* renamed from: a */
    private static boolean m23475a(C11207p pVar) {
        if (pVar == null || pVar.isDeleted() || pVar.getSvrStatus() != 0) {
            return false;
        }
        return true;
    }

    public final boolean add(C11207p pVar) {
        int indexOf = indexOf(pVar);
        if (indexOf < 0) {
            super.add((-indexOf) - 1, pVar);
        } else {
            set(indexOf, pVar);
        }
        return true;
    }

    public final void addList(List<C11207p> list) {
        if (list != null && !list.isEmpty()) {
            for (C11207p pVar : list) {
                if (m23475a(pVar)) {
                    add(pVar);
                }
            }
        }
    }

    public final void appendList(List<C11207p> list) {
        if (list != null && !list.isEmpty()) {
            for (C11207p pVar : list) {
                if (m23475a(pVar)) {
                    int indexOf = indexOf(pVar);
                    if (indexOf < 0) {
                        super.add(pVar);
                    } else {
                        set(indexOf, pVar);
                    }
                }
            }
        }
    }

    public final void updateList(List<C11207p> list) {
        if (list != null && !list.isEmpty()) {
            for (C11207p pVar : list) {
                if (m23475a(pVar)) {
                    update(pVar);
                }
            }
        }
    }
}
