package com.facebook.p982j.p984b;

import com.facebook.p982j.p986c.C14441e;
import com.facebook.p982j.p986c.C14442f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.j.b.h */
public final class C14423h implements C14394a {

    /* renamed from: a */
    public final C14425b f37460a;

    /* renamed from: b */
    private final int f37461b;

    /* renamed from: com.facebook.j.b.h$a */
    public static class C14424a {

        /* renamed from: a */
        public int f37462a;

        /* renamed from: b */
        public List<String> f37463b;
    }

    /* renamed from: com.facebook.j.b.h$b */
    public static class C14425b {

        /* renamed from: a */
        public final List<C14442f> f37464a;

        public C14425b(List<String> list) {
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(C14442f.m29549a((String) list.get(i)));
            }
            this.f37464a = C14441e.m29546a(arrayList);
        }
    }

    /* renamed from: a */
    public final int mo26578a() {
        return this.f37461b;
    }

    public C14423h(int i, List<String> list) {
        this.f37461b = i;
        this.f37460a = new C14425b(list);
    }
}
