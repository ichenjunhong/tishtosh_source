package com.facebook.p982j.p986c;

import com.facebook.p982j.p984b.C14406b;
import com.facebook.p982j.p984b.C14406b.C14409b;
import java.util.List;

/* renamed from: com.facebook.j.c.b */
public final class C14438b {
    /* renamed from: a */
    public static C14406b m29542a(List<C14406b> list, C14409b bVar) {
        if (list == null) {
            return null;
        }
        int i = 0;
        int size = list.size();
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (((C14406b) list.get(i)).f37402b == bVar) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return null;
        }
        return (C14406b) list.remove(i);
    }
}
