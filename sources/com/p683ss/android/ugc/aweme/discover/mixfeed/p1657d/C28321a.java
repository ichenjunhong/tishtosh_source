package com.p683ss.android.ugc.aweme.discover.mixfeed.p1657d;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.discover.adapter.C27797ad;
import com.p683ss.android.ugc.aweme.discover.adapter.C27840az;
import com.p683ss.android.ugc.aweme.discover.adapter.C27840az.C27845a;
import com.p683ss.android.ugc.aweme.discover.mixfeed.p1656c.C28310a;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.p1487c.C24478a;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.d.a */
public final class C28321a extends C1322a<C1352v> implements C24478a {

    /* renamed from: a */
    public List<Music> f74291a = new ArrayList();

    /* renamed from: b */
    private C28310a f74292b;

    public final int getItemCount() {
        return this.f74291a.size();
    }

    /* renamed from: a */
    public final void mo50246a(C28310a aVar) {
        this.f74292b = aVar;
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        return C27845a.m66591a(viewGroup, null, null);
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        String str;
        C52711k.m112240b(vVar, "viewHolder");
        Music music = (Music) this.f74291a.get(i);
        if (vVar instanceof C27840az) {
            C27840az azVar = (C27840az) vVar;
            azVar.f73136g = this.f74292b;
            azVar.mo56270a(new C27797ad(true));
            azVar.mo56261a("general_search");
            C28310a aVar = this.f74292b;
            if (aVar != null) {
                str = aVar.getSearchKeyWord();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            azVar.mo56260a(music, str);
        }
    }
}
