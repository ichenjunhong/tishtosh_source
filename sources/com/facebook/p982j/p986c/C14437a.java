package com.facebook.p982j.p986c;

import com.facebook.p982j.p984b.C14413d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* renamed from: com.facebook.j.c.a */
public final class C14437a {
    /* renamed from: a */
    public static List<C14413d> m29541a(List<C14413d> list) {
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Stack stack = new Stack();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C14413d dVar = (C14413d) it.next();
            if (dVar.f37418b == 0) {
                stack.push(dVar);
                it.remove();
            }
        }
        while (!stack.isEmpty()) {
            C14413d dVar2 = (C14413d) stack.pop();
            arrayList.add(dVar2);
            for (C14413d dVar3 : list) {
                if (dVar3.f37418b == dVar2.f37417a) {
                    stack.push(dVar3);
                }
            }
        }
        return arrayList;
    }
}
