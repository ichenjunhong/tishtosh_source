package com.p683ss.android.ugc.aweme.p1308ad.comment;

import android.content.Context;
import android.view.View;
import com.p683ss.android.ugc.aweme.commercialize.model.C26138s;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1308ad.p1310b.C22328b;
import com.p683ss.android.ugc.aweme.p1308ad.services.p1322a.C22429c;
import com.p683ss.android.ugc.aweme.p1308ad.services.p1322a.C22430d;
import com.p683ss.android.ugc.aweme.p1308ad.view.C22450d;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.ad.comment.d */
public final class C22353d extends C22450d<C22429c> {

    /* renamed from: a */
    private C22354e f60212a;

    public C22353d(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        this.f60212a = (C22354e) view;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo46525a(Context context, C22430d dVar) {
        C22429c cVar = (C22429c) dVar;
        if (cVar instanceof C22429c) {
            C22354e eVar = this.f60212a;
            if (eVar != null) {
                eVar.setDataCenter(cVar.f60426d);
            }
            C22354e eVar2 = this.f60212a;
            if (eVar2 != null) {
                C26138s sVar = cVar.f60423a;
                C52711k.m112236a((Object) sVar, "params?.linkData");
                Aweme aweme = cVar.f60424b;
                C52711k.m112236a((Object) aweme, "params?.aweme");
                eVar2.mo46526a(sVar, aweme);
            }
            C22354e eVar3 = this.f60212a;
            if (eVar3 != null) {
                C22328b bVar = cVar.f60425c;
                C52711k.m112236a((Object) bVar, "params?.onDislikeCommentAdListener");
                eVar3.setOnDislikeCommentAdListener(bVar);
            }
        }
    }
}
