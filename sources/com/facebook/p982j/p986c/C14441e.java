package com.facebook.p982j.p986c;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.facebook.j.c.e */
public final class C14441e {
    /* renamed from: a */
    public static List m29546a(List list) {
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        return Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public static void m29547a(List list, Comparator comparator) {
        if (list != null && !list.isEmpty()) {
            Collections.sort(list, comparator);
        }
    }
}
