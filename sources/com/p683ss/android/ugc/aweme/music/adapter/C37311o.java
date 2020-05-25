package com.p683ss.android.ugc.aweme.music.adapter;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.music.model.SimilarMusicInfo;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.o */
public final class C37311o extends C26840g<SimilarMusicInfo> {

    /* renamed from: com.ss.android.ugc.aweme.music.adapter.o$a */
    public final class C37312a extends C1352v {

        /* renamed from: a */
        public final SmartImageView f95225a;

        /* renamed from: b */
        final /* synthetic */ C37311o f95226b;

        public C37312a(C37311o oVar, View view) {
            C52711k.m112240b(view, "itemView");
            this.f95226b = oVar;
            super(view);
            View findViewById = view.findViewById(R.id.efw);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.iv_similar_music_cover)");
            this.f95225a = (SmartImageView) findViewById;
        }
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        Context context;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.blm, viewGroup, false);
        C52711k.m112236a((Object) inflate, "view");
        return new C37312a(this, inflate);
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        UrlModel urlModel;
        if (vVar instanceof C37312a) {
            C37312a aVar = (C37312a) vVar;
            List a = mo50673a();
            C52711k.m112236a((Object) a, "data");
            C52711k.m112240b(a, "items");
            SimilarMusicInfo similarMusicInfo = (SimilarMusicInfo) a.get(i);
            if (similarMusicInfo != null) {
                urlModel = similarMusicInfo.getThumbnail();
            } else {
                urlModel = null;
            }
            if (urlModel != null) {
                C12203q.m24645a((Object) C23608p.m57874a(similarMusicInfo.getThumbnail())).mo23125b(C47788ct.m103417a(300)).mo23118a("similar_muisc_cover").mo23116a((C12197k) aVar.f95225a).mo23121a();
                return;
            }
            aVar.f95225a.setVisibility(8);
        }
    }
}
