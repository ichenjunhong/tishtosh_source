package com.p683ss.android.ugc.aweme.commercialize.p1550c;

import android.content.Context;
import com.p683ss.android.ugc.aweme.comment.services.CommentService.C25280a;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25908e;
import com.p683ss.android.ugc.aweme.commercialize.model.C26129j;
import com.p683ss.android.ugc.aweme.commercialize.model.C26138s;
import com.p683ss.android.ugc.aweme.commercialize.p1555e.C25735b;
import com.p683ss.android.ugc.aweme.commercialize.p1572im.C25938a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26428bm;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeNationalTask;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStarAtlas;
import com.p683ss.android.ugc.aweme.feed.model.NationalTaskLink;
import com.p683ss.android.ugc.aweme.feed.model.StarAtlasLink;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.p1308ad.p1309a.C22321d;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.c.e */
public final class C25660e implements C22321d {
    /* renamed from: a */
    public final boolean mo46447a() {
        return C25280a.m61493a().isBlackMode();
    }

    /* renamed from: a */
    public final boolean mo46450a(String str) {
        return C25938a.m62898b(str);
    }

    /* renamed from: a */
    public final List<TextExtraStruct> mo46444a(C26129j jVar) {
        C52711k.m112240b(jVar, "comment");
        return C25280a.m61493a().getDisplayTextExtra(jVar);
    }

    /* renamed from: b */
    public final String mo46451b(C26129j jVar) {
        C52711k.m112240b(jVar, "commentStruct");
        return C25280a.m61493a().getDisplayText(jVar);
    }

    /* renamed from: a */
    public final boolean mo46449a(Aweme aweme) {
        C52711k.m112240b(aweme, "aweme");
        C26138s a = C26428bm.m63902a(aweme);
        if ((a == null || a.linkType != 0) && aweme.getStarAtlasInfo() == null && aweme.getAwemeNationalTask() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo46446a(Context context, Aweme aweme) {
        C26138s a = C26428bm.m63902a(aweme);
        if (a == null || a.linkType != 0) {
            AwemeStarAtlas starAtlasInfo = aweme.getStarAtlasInfo();
            if (starAtlasInfo != null) {
                StarAtlasLink starAtlasLink = starAtlasInfo.getStarAtlasLink();
                if (starAtlasLink != null) {
                    C26540w.m64205a(context, starAtlasLink, aweme, false);
                    return;
                }
            }
            AwemeNationalTask awemeNationalTask = aweme.getAwemeNationalTask();
            if (awemeNationalTask != null) {
                NationalTaskLink nationalTaskLink = awemeNationalTask.getNationalTaskLink();
                if (nationalTaskLink != null) {
                    C26540w.m64204a(context, nationalTaskLink, aweme, false);
                    return;
                }
            }
            if (a != null && a.linkType == 1) {
                C26540w.m64202a(context, a, aweme, true);
            }
            return;
        }
        C26540w.m64202a(context, a, aweme, true);
    }

    /* renamed from: a */
    public final List<TextExtraStruct> mo46443a(Context context, Aweme aweme, C26129j jVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(jVar, "commentStruct");
        return C25280a.m61493a().getDisplayLinkTextExtra(context, aweme, jVar);
    }

    /* renamed from: a */
    public final List<TextExtraStruct> mo46445a(C26129j jVar, AwemeRawAd awemeRawAd, C52670a<C52860x> aVar) {
        C52711k.m112240b(jVar, "commentStruct");
        C52711k.m112240b(aVar, "onLinkTagClick");
        return C25280a.m61493a().getNewDisplayTextExtra(jVar, awemeRawAd, aVar);
    }

    /* renamed from: a */
    public final boolean mo46448a(Context context, Aweme aweme, C25908e eVar, int i, C25735b bVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(eVar, "adViewController");
        C52711k.m112240b(bVar, "adOpenCallBack");
        return C26540w.m64253a(context, aweme, eVar, i, bVar);
    }
}
