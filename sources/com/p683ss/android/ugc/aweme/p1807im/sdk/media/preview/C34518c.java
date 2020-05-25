package com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview;

import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1850b.C34409a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.p1858b.C34517a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.p2629a.C52575l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.c */
public final class C34518c implements C34517a {

    /* renamed from: a */
    private final List<C34409a> f88992a;

    /* renamed from: b */
    private final C34409a f88993b;

    /* renamed from: c */
    private final List<C34409a> f88994c;

    /* renamed from: a */
    public final C34409a mo72529a() {
        return this.f88993b;
    }

    /* renamed from: b */
    public final C52847n<List<C34409a>, Boolean> mo72530b() {
        List list;
        List<C34409a> list2 = this.f88992a;
        if (list2 != null) {
            list = C52575l.m112139e((Collection<? extends T>) list2);
        } else {
            list = new ArrayList();
        }
        return C52856t.m112465a(list, Boolean.valueOf(false));
    }

    /* renamed from: c */
    public final List<C34409a> mo72531c() {
        List<C34409a> list = this.f88994c;
        if (list != null) {
            return C52575l.m112139e((Collection<? extends T>) list);
        }
        return new ArrayList<>();
    }

    public C34518c(List<C34409a> list, C34409a aVar, List<C34409a> list2) {
        this.f88992a = list;
        this.f88993b = aVar;
        this.f88994c = list2;
    }
}
