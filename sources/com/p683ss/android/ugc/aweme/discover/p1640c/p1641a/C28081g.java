package com.p683ss.android.ugc.aweme.discover.p1640c.p1641a;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.adapter.C27840az;
import com.p683ss.android.ugc.aweme.discover.adapter.C27840az.C27845a;
import com.p683ss.android.ugc.aweme.discover.adapter.C27840az.C27846b;
import com.p683ss.android.ugc.aweme.discover.adapter.C27859bf;
import com.p683ss.android.ugc.aweme.discover.model.suggest.SuggestMusic;
import com.p683ss.android.ugc.aweme.discover.p1640c.p1641a.C28082h.C28083a;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.music.model.Music;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.c.a.g */
public final class C28081g extends C28083a implements C27846b {
    public C28081g(C27859bf<?> bfVar) {
        C52711k.m112240b(bfVar, "adapter");
        super(bfVar);
    }

    /* renamed from: a */
    public final C1352v mo56493a(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        C27845a aVar = C27840az.f73131k;
        C27840az a = C27845a.m66591a(viewGroup, this, null);
        a.mo56261a("search_for_you_list");
        return a;
    }

    /* renamed from: a */
    public final void mo56266a(Music music, int i) {
        C52711k.m112240b(music, "music");
        C26890h.m65011a("enter_music_detail", C23089d.m56640a().mo47829a("enter_from", "search_for_you_list").mo47829a("music_id", music.getMid()).mo47829a("log_pb", C29981aa.m70153a().mo60161a(music.getRequestId())).mo47826a("order", mo56496a((Object) music)).f61491a);
    }

    /* renamed from: a */
    public final void mo56494a(List<? extends Object> list, int i, C1352v vVar, List<Object> list2) {
        C52711k.m112240b(list, "items");
        C52711k.m112240b(vVar, "holder");
        C52711k.m112240b(list2, "payloads");
        Object obj = list.get(i);
        if (obj != null) {
            SuggestMusic suggestMusic = (SuggestMusic) obj;
            C27840az azVar = (C27840az) vVar;
            String str = "";
            C52711k.m112240b(str, "keyword");
            if (suggestMusic != null) {
                azVar.mo56260a(suggestMusic.music, str);
                return;
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.suggest.SuggestMusic");
    }
}
