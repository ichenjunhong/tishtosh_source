package com.facebook.p982j.p984b;

import com.facebook.p982j.p984b.C14406b.C14409b;
import com.facebook.p982j.p984b.p985a.C14396b;
import com.facebook.p982j.p986c.C14438b;
import com.facebook.p982j.p986c.C14439c;
import com.facebook.p982j.p986c.C14441e;
import java.util.List;

/* renamed from: com.facebook.j.b.d */
public final class C14413d {

    /* renamed from: a */
    public final int f37417a;

    /* renamed from: b */
    public final int f37418b;

    /* renamed from: c */
    public final List<C14406b> f37419c;

    /* renamed from: d */
    private final C14406b f37420d;

    /* renamed from: com.facebook.j.b.d$a */
    public static class C14414a {

        /* renamed from: a */
        public int f37421a;

        /* renamed from: b */
        public int f37422b;

        /* renamed from: c */
        public List<C14406b> f37423c;
    }

    /* renamed from: a */
    public final C14396b mo26586a() {
        if (this.f37420d == null) {
            return null;
        }
        return (C14396b) this.f37420d.f37406f;
    }

    public C14413d(int i, int i2, List<C14406b> list) {
        boolean z;
        Integer valueOf = Integer.valueOf(i);
        boolean z2 = false;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f37417a = ((Integer) C14439c.m29543a(valueOf, z, "group_id")).intValue();
        this.f37418b = i2;
        C14441e.m29547a(list, C14406b.f37401a);
        this.f37420d = C14438b.m29542a(list, C14409b.ANCHOR_POINT);
        List a = C14441e.m29546a(list);
        if (list.size() > 0) {
            z2 = true;
        }
        this.f37419c = (List) C14439c.m29543a(a, z2, "animations");
    }
}
