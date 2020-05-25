package com.facebook.p914c.p915a;

import com.facebook.common.p927k.C13727c;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.c.a.d */
public final class C13620d {
    /* renamed from: c */
    private static String m27495c(C13619c cVar) throws UnsupportedEncodingException {
        return C13727c.m27773a(cVar.mo25470a().getBytes("UTF-8"));
    }

    /* renamed from: b */
    public static String m27494b(C13619c cVar) {
        try {
            if (cVar instanceof C13621e) {
                return m27495c((C13619c) ((C13621e) cVar).f35534a.get(0));
            }
            return m27495c(cVar);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static List<String> m27493a(C13619c cVar) {
        try {
            if (cVar instanceof C13621e) {
                List<C13619c> list = ((C13621e) cVar).f35534a;
                ArrayList arrayList = new ArrayList(list.size());
                for (int i = 0; i < list.size(); i++) {
                    arrayList.add(m27495c((C13619c) list.get(i)));
                }
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(m27495c(cVar));
            return arrayList2;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
