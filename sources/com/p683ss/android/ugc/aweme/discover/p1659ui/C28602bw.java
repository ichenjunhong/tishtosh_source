package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.discover.adapter.C27797ad;
import com.p683ss.android.ugc.aweme.discover.adapter.C27840az.C27845a;
import com.p683ss.android.ugc.aweme.discover.adapter.C27934y;
import com.p683ss.android.ugc.aweme.discover.adapter.music.C27912a;
import com.p683ss.android.ugc.aweme.discover.adapter.music.C27913b;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28587bo.C28588a;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28598bu.C28600a;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import com.ss.android.ugc.trill.R;
import java.util.LinkedList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.bw */
public final class C28602bw extends C28598bu<Music> implements C27934y, C28588a<Music> {

    /* renamed from: a */
    public int f75126a;

    /* renamed from: i */
    private List<C27913b> f75127i = new LinkedList();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58289a() {
        super.mo58289a();
        this.f75119d.setText(R.string.cdb);
    }

    /* renamed from: a */
    public final int mo56250a(Music music) {
        return this.f75126a;
    }

    /* renamed from: a */
    public final void mo58279a(C1352v vVar, C28540ba<Music> baVar) {
        C27912a aVar = (C27912a) vVar;
        aVar.mo56260a((Music) baVar.f74998a, baVar.f74999b.getKeyword());
        aVar.mo56335a(new C27797ad(true));
        aVar.mo56261a("general_search");
        this.f75127i.add((C27913b) aVar);
    }

    /* renamed from: a */
    public final C1352v mo58278a(ViewGroup viewGroup, int i, C28540ba<Music> baVar) {
        ViewGroup viewGroup2 = (ViewGroup) this.f75118c;
        C52711k.m112240b(viewGroup2, "parent");
        C52711k.m112240b(this, "pp");
        return C27845a.m66591a(viewGroup2, null, null);
    }

    /* renamed from: a */
    public final void mo58287a(List<Music> list, C41440e eVar, boolean z) {
        super.mo58287a(list, eVar, z);
        this.f75127i.clear();
        mo58293b(list, eVar, z);
    }

    public C28602bw(View view, Context context, boolean z, C28600a aVar) {
        super(view, context, aVar);
        mo58290a((C1322a) new C28587bo(this));
        if (z) {
            this.f75120e.setText(R.string.hvw);
        }
    }
}
