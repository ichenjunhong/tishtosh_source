package com.p683ss.android.ugc.aweme.discover.jedi.viewmodel;

import com.bytedance.jedi.arch.ext.list.C11865l;
import com.p683ss.android.ugc.aweme.discover.model.SearchApiResult;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.f */
public final class C28294f extends C11865l {

    /* renamed from: c */
    public final String f74203c;

    /* renamed from: d */
    public final SearchApiResult f74204d;

    public C28294f() {
        this(null, false, 0, null, 15, null);
    }

    public C28294f(String str, boolean z, int i, SearchApiResult searchApiResult) {
        C52711k.m112240b(str, "searchId");
        super(z, i);
        this.f74203c = str;
        this.f74204d = searchApiResult;
    }

    public /* synthetic */ C28294f(String str, boolean z, int i, SearchApiResult searchApiResult, int i2, C52707g gVar) {
        this("", true, 0, null);
    }
}
