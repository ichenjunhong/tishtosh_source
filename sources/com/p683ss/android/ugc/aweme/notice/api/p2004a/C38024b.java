package com.p683ss.android.ugc.aweme.notice.api.p2004a;

import android.util.SparseArray;
import com.p683ss.android.ugc.aweme.notice.api.bean.C38039f;
import com.p683ss.android.ugc.aweme.notice.api.p2009ws.C38058b;

/* renamed from: com.ss.android.ugc.aweme.notice.api.a.b */
public final class C38024b implements C38058b {

    /* renamed from: a */
    private static final SparseArray<Class> f96790a;

    static {
        SparseArray<Class> sparseArray = new SparseArray<>();
        f96790a = sparseArray;
        sparseArray.put(1, C38039f.class);
    }

    /* renamed from: a */
    public final Class mo77496a(int i) {
        return (Class) f96790a.get(i);
    }
}
