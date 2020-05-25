package com.p683ss.android.ugc.aweme.utils;

import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1340m;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30462o;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30463p;
import com.p683ss.android.ugc.aweme.framework.p1781b.C32461a;

/* renamed from: com.ss.android.ugc.aweme.utils.ee */
public final class C47843ee {
    /* renamed from: a */
    public static RecyclerView m103486a(RecyclerView recyclerView, C30462o oVar) {
        return m103487a(recyclerView, oVar, 2);
    }

    /* renamed from: a */
    public static RecyclerView m103487a(RecyclerView recyclerView, C30462o oVar, int i) {
        recyclerView.mo4801a((C1340m) new C32461a(C11010c.m22280a()));
        C30463p pVar = new C30463p(recyclerView, oVar);
        pVar.f79595b = i;
        recyclerView.setOnFlingListener(pVar);
        return recyclerView;
    }
}
