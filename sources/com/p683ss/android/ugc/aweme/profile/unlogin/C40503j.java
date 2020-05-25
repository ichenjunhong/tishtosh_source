package com.p683ss.android.ugc.aweme.profile.unlogin;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.profile.adapter.C39741c;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.unlogin.j */
public final class C40503j extends C1322a<C39741c> {

    /* renamed from: a */
    public List<? extends Aweme> f103374a = C52575l.m112097a();

    /* renamed from: b */
    public final C24579d f103375b;

    public final int getItemCount() {
        return this.f103374a.size();
    }

    public C40503j(C24579d dVar) {
        C52711k.m112240b(dVar, "listener");
        this.f103375b = dVar;
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C39741c cVar = (C39741c) vVar;
        C52711k.m112240b(cVar, "holder");
        cVar.mo80836a((Aweme) this.f103374a.get(i), i, true, "", true, 1);
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        return new C39741c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bp9, viewGroup, false), "personal_homepage", this.f103375b);
    }
}
