package com.p683ss.android.ugc.aweme.commercialize.anchor.p1546a;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25626g;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1589a.C26835b;
import com.p683ss.android.ugc.aweme.miniapp.anchor.p1953d.p1954a.C36830a;
import com.p683ss.android.ugc.aweme.utils.C47760cd;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.a.e */
public final class C25610e extends C26835b<List<? extends C25626g>> {

    /* renamed from: a */
    public final C0184k f67794a;

    public C25610e(C0184k kVar) {
        C52711k.m112240b(kVar, "lifecycleOwner");
        this.f67794a = kVar;
    }

    /* renamed from: a */
    public final C1352v mo51021a(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a1h, viewGroup, false);
        C52711k.m112236a((Object) inflate, "view");
        return new C25611f(inflate, this.f67794a);
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo51023a(Object obj, int i) {
        C52711k.m112240b((List) obj, "items");
        return true;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo51022a(Object obj, int i, C1352v vVar, List list) {
        int i2;
        int i3;
        List list2 = (List) obj;
        C52711k.m112240b(list2, "items");
        C52711k.m112240b(vVar, "holder");
        C52711k.m112240b(list, "payloads");
        C25626g gVar = (C25626g) list2.get(i);
        if (vVar instanceof C25611f) {
            C25611f fVar = (C25611f) vVar;
            C52711k.m112240b(gVar, "anchorItem");
            if (gVar.f67830a == C25600a.ANCHOR_SHOP_LINK.getTYPE()) {
                gVar.f67842m.getExtensionDataRepo().getI18nStarAtlasClosed().observe(fVar.f67802h, new C25612a(fVar));
            }
            DmtTextView dmtTextView = fVar.f67799e;
            int i4 = 8;
            if (gVar.f67838i) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            dmtTextView.setVisibility(i2);
            fVar.f67799e.setText(R.string.g);
            ImageView imageView = fVar.f67801g;
            if (gVar.f67837h) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            imageView.setVisibility(i3);
            ImageView imageView2 = fVar.f67800f;
            if (gVar.f67837h) {
                i4 = 0;
            }
            imageView2.setVisibility(i4);
            if (gVar.f67837h) {
                C26890h.m65011a("gc_label_page_show", C23089d.m56640a().mo47829a("params_for_special", "game_platform").mo47829a("target_app_id", "2210").mo47829a("position", "auto_page").f61491a);
                if (gVar.f67830a == C25600a.GAME.getTYPE()) {
                    C36830a aVar = (C36830a) C47760cd.m103384a(gVar.f67836g, C36830a.class);
                    C52711k.m112236a((Object) aVar, "gameInfo");
                    C26890h.m65011a("gc_label_game_show", C23089d.m56640a().mo47829a("params_for_special", "game_platform").mo47829a("target_app_id", "2210").mo47829a("game_name", gVar.f67832c).mo47829a("game_id", aVar.getId()).mo47829a("position", "auto_page").f61491a);
                }
            }
            fVar.f67800f.setOnClickListener(new C25613b(gVar));
            String str = gVar.f67835f;
            if (str != null) {
                fVar.f67798d.setText(str);
            }
            C23515d.m57669a(fVar.f67795a, gVar.f67831b);
            fVar.f67796b.setText(gVar.f67832c);
            if (gVar.f67843n) {
                DmtTextView dmtTextView2 = fVar.f67796b;
                View view = fVar.itemView;
                C52711k.m112236a((Object) view, "itemView");
                Context context = view.getContext();
                C52711k.m112236a((Object) context, "itemView.context");
                dmtTextView2.setTextColor(context.getResources().getColor(R.color.a3r));
            } else {
                DmtTextView dmtTextView3 = fVar.f67796b;
                View view2 = fVar.itemView;
                C52711k.m112236a((Object) view2, "itemView");
                Context context2 = view2.getContext();
                C52711k.m112236a((Object) context2, "itemView.context");
                dmtTextView3.setTextColor(context2.getResources().getColor(R.color.g5));
            }
            fVar.itemView.setOnClickListener(new C25614c(gVar));
        }
    }
}
