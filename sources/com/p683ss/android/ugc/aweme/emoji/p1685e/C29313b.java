package com.p683ss.android.ugc.aweme.emoji.p1685e;

import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.C29355m;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.C29359n;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29287c;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29288d;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29292h;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29293i;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29406a;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.e.b */
public final class C29313b extends C29287c<C29293i, C29288d> implements C29292h {

    /* renamed from: d */
    private RecyclerView f76710d;

    /* renamed from: e */
    private C29310a f76711e;

    /* renamed from: f */
    private C29315d f76712f;

    /* renamed from: i */
    private C1332i f76713i;

    /* renamed from: j */
    private View f76714j;

    /* renamed from: a */
    public final void mo59238a(int i) {
    }

    /* renamed from: b */
    public final void mo59228b() {
    }

    /* renamed from: c */
    public final void mo59229c() {
    }

    /* renamed from: d */
    public final int mo59230d() {
        return R.layout.lk;
    }

    /* renamed from: e */
    public final void mo59232e() {
    }

    /* renamed from: f */
    public final C29355m mo59239f() {
        return null;
    }

    /* renamed from: g */
    public final C29359n mo59240g() {
        return null;
    }

    /* renamed from: a */
    public final View mo59227a() {
        return super.mo59227a();
    }

    public C29313b(C29293i iVar, ViewGroup viewGroup, List<String> list, View view, C1332i iVar2, int i, C29314c cVar) {
        super(iVar, null, viewGroup);
        this.f76713i = iVar2;
        this.f76714j = view;
        View a = mo59227a();
        this.f76710d = (RecyclerView) a.findViewById(R.id.a_z);
        this.f76712f = new C29315d(viewGroup.getContext());
        this.f76711e = new C29310a(iVar, view);
        this.f76710d.setAdapter(this.f76711e);
        C29310a aVar = this.f76711e;
        C29315d dVar = this.f76712f;
        if (list == null || list.size() < i) {
            list = C29315d.f76715b;
        }
        List a2 = C29406a.m69329b(dVar.f76716a).mo59402a(list, i);
        if (a2.size() > i) {
            a2 = a2.subList(0, i);
        }
        aVar.f76704a.clear();
        if (a2 != null) {
            aVar.f76704a.addAll(a2);
        }
        aVar.notifyDataSetChanged();
        if (iVar2 != null) {
            this.f76710d.mo4798a((C1331h) new C29316e());
        } else {
            iVar2 = new GridLayoutManager(a.getContext(), 8);
        }
        this.f76710d.setLayoutManager(iVar2);
        if (cVar != null) {
            cVar.mo59258a(this.f76710d);
        }
    }
}
