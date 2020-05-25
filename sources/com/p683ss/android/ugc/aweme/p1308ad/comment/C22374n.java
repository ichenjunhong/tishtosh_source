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

/* renamed from: com.ss.android.ugc.aweme.ad.comment.n */
public final class C22374n extends C22450d<C22429c> {

    /* renamed from: a */
    private NewSpecialCommentView f60247a;

    public C22374n(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        this.f60247a = (NewSpecialCommentView) view;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo46525a(Context context, C22430d dVar) {
        C22429c cVar = (C22429c) dVar;
        if (cVar instanceof C22429c) {
            NewSpecialCommentView newSpecialCommentView = this.f60247a;
            if (newSpecialCommentView != null) {
                newSpecialCommentView.setDataCenter(cVar.f60426d);
            }
            NewSpecialCommentView newSpecialCommentView2 = this.f60247a;
            if (newSpecialCommentView2 != null) {
                C26138s sVar = cVar.f60423a;
                C52711k.m112236a((Object) sVar, "params?.linkData");
                Aweme aweme = cVar.f60424b;
                C52711k.m112236a((Object) aweme, "params?.aweme");
                newSpecialCommentView2.mo46505a(sVar, aweme);
            }
            NewSpecialCommentView newSpecialCommentView3 = this.f60247a;
            if (newSpecialCommentView3 != null) {
                C22328b bVar = cVar.f60425c;
                C52711k.m112236a((Object) bVar, "params?.onDislikeCommentAdListener");
                newSpecialCommentView3.setOnDislikeCommentAdListener(bVar);
            }
        }
    }
}
