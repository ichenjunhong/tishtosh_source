package com.p683ss.android.ugc.aweme.choosemusic.viewholder.p1515a;

import android.graphics.Color;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.choosemusic.viewholder.C25036f;
import com.p683ss.android.ugc.aweme.choosemusic.viewholder.C25036f.C25037a;
import com.p683ss.android.ugc.aweme.choosemusic.viewholder.C25036f.C25038b;
import com.p683ss.android.ugc.aweme.common.p1589a.C26835b;
import com.p683ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.a.b */
public final class C25021b extends C26835b<List<? extends MusicSearchHistory>> {

    /* renamed from: a */
    private boolean f66266a;

    public C25021b(boolean z) {
        this.f66266a = z;
    }

    /* renamed from: a */
    public final C1352v mo51021a(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a00, viewGroup, false);
        if (this.f66266a) {
            ((ImageView) inflate.findViewById(R.id.b1b)).setImageResource(R.drawable.d1q);
            ((TextView) inflate.findViewById(R.id.da6)).setTextColor(Color.parseColor("#e6ffffff"));
            ((ImageView) inflate.findViewById(R.id.az5)).setImageResource(R.drawable.d0z);
        }
        C52711k.m112236a((Object) inflate, "view");
        return new C25036f(inflate);
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo51023a(Object obj, int i) {
        List list = (List) obj;
        C52711k.m112240b(list, "items");
        if (((MusicSearchHistory) list.get(i)).type != Integer.MAX_VALUE) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo51022a(Object obj, int i, C1352v vVar, List list) {
        List list2 = (List) obj;
        C52711k.m112240b(list2, "items");
        C52711k.m112240b(vVar, "holder");
        C52711k.m112240b(list, "payloads");
        MusicSearchHistory musicSearchHistory = (MusicSearchHistory) list2.get(i);
        C25036f fVar = (C25036f) vVar;
        boolean z = this.f66266a;
        C52711k.m112240b(musicSearchHistory, "history");
        fVar.f66305a.setText(musicSearchHistory.keyword);
        fVar.f66306b.setOnClickListener(new C25037a(z, musicSearchHistory));
        fVar.f66305a.setOnClickListener(new C25038b(musicSearchHistory));
    }
}
