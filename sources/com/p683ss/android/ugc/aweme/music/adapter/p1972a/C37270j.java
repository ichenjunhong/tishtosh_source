package com.p683ss.android.ugc.aweme.music.adapter.p1972a;

import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.common.p1589a.C26835b;
import com.p683ss.android.ugc.aweme.music.adapter.C37305k;
import com.p683ss.android.ugc.aweme.music.adapter.p1973b.C37283j;
import com.p683ss.android.ugc.aweme.music.adapter.p1973b.C37286m;
import com.p683ss.android.ugc.aweme.music.p1975c.C37356i;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.List;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.a.j */
public final class C37270j extends C26835b<List<C37283j>> {

    /* renamed from: a */
    private int f95159a;

    /* renamed from: b */
    private boolean f95160b;

    public C37270j() {
    }

    public C37270j(boolean z) {
        this.f95160b = z;
    }

    /* renamed from: a */
    public final void mo54757a(RecyclerView recyclerView) {
        super.mo54757a(recyclerView);
        C47718bf.m103290c(this);
    }

    /* renamed from: b */
    public final void mo54759b(RecyclerView recyclerView) {
        super.mo54759b(recyclerView);
        C47718bf.m103291d(this);
    }

    @C53771m
    public final void onSwitchMusicFragmentEvent(C37356i iVar) {
        this.f95159a = iVar.f95318a;
    }

    /* renamed from: a */
    public final C1352v mo51021a(ViewGroup viewGroup) {
        return new C37305k(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.xc, viewGroup, false), this.f95160b);
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo51023a(Object obj, int i) {
        return ((List) obj).get(i) instanceof C37286m;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo51022a(Object obj, int i, C1352v vVar, List list) {
        List list2 = (List) obj;
        C37305k kVar = (C37305k) vVar;
        kVar.f95214a.mo77026a(this.f95159a);
    }
}
