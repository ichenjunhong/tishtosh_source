package com.p683ss.android.ugc.aweme.profile.jedi.aweme;

import android.text.TextUtils;
import com.bytedance.jedi.p725a.p733f.C11585a;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p683ss.android.ugc.aweme.profile.jedi.aweme.AwemeListApi.C39889a;
import com.p683ss.android.ugc.aweme.profile.service.C40023p;
import com.p683ss.android.ugc.aweme.profile.util.C40542c;
import java.util.Collection;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.g */
public final class C39915g extends C11585a<C39912d, List<? extends Aweme>, C39912d, FeedItemList> {

    /* renamed from: a */
    private final AwemeListApi f101769a = C39889a.m88658a();

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.g$a */
    static final class C39916a<T> implements C1710e<FeedItemList> {

        /* renamed from: a */
        final /* synthetic */ C39912d f101770a;

        C39916a(C39912d dVar) {
            this.f101770a = dVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            FeedItemList feedItemList = (FeedItemList) obj;
            C52711k.m112236a((Object) feedItemList, "it");
            feedItemList.fetchType = this.f101770a.f101763a;
            C40542c.m89957a(this.f101770a.f101763a, this.f101770a.f101766d, feedItemList);
            C40023p.f101960a.mo52800a("personal", feedItemList.getItems());
            C29981aa.m70153a().mo60162a(feedItemList.getRequestId(), feedItemList.logPb);
            Collection items = feedItemList.getItems();
            if (items == null || items.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (this.f101770a.f101765c == 0) {
                    CharSequence charSequence = this.f101770a.f101766d;
                    IAccountUserService g = C20854a.m53167g();
                    C52711k.m112236a((Object) g, "AccountProxyService.userService()");
                    if (TextUtils.equals(charSequence, g.getCurUserId())) {
                        C40542c.m89959a(this.f101770a.f101763a, false, 0, feedItemList.hasMore, feedItemList.maxCursor, feedItemList.minCursor, feedItemList.getItems().size());
                    }
                } else {
                    CharSequence charSequence2 = this.f101770a.f101766d;
                    IAccountUserService g2 = C20854a.m53167g();
                    C52711k.m112236a((Object) g2, "AccountProxyService.userService()");
                    if (TextUtils.equals(charSequence2, g2.getCurUserId())) {
                        C40542c.m89959a(this.f101770a.f101763a, true, 0, feedItemList.hasMore, feedItemList.maxCursor, feedItemList.minCursor, feedItemList.getItems().size());
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo22310b(Object obj) {
        C39912d dVar = (C39912d) obj;
        C52711k.m112240b(dVar, "req");
        return dVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C2201v mo22308a(Object obj) {
        C2201v vVar;
        C39912d dVar = (C39912d) obj;
        C52711k.m112240b(dVar, "req");
        int i = dVar.f101763a;
        if (i != 4) {
            switch (i) {
                case 0:
                    vVar = this.f101769a.getPublishAweme(dVar.f101764b, dVar.f101766d, dVar.f101767e, dVar.f101765c);
                    break;
                case 1:
                    vVar = this.f101769a.getFavoriteAweme(dVar.f101764b, dVar.f101766d, dVar.f101767e, dVar.f101765c);
                    break;
                default:
                    vVar = this.f101769a.getPublishAweme(dVar.f101764b, dVar.f101766d, dVar.f101767e, dVar.f101765c);
                    break;
            }
        } else {
            vVar = this.f101769a.getCollectAweme(dVar.f101764b, dVar.f101765c);
        }
        C2201v d = vVar.mo6529b(C2168a.m6521b()).mo6540d((C1710e<? super T>) new C39916a<Object>(dVar));
        C52711k.m112236a((Object) d, "when (req.type) {\n      …}\n            }\n        }");
        return d;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo22309a(Object obj, Object obj2) {
        FeedItemList feedItemList = (FeedItemList) obj2;
        C52711k.m112240b((C39912d) obj, "req");
        C52711k.m112240b(feedItemList, "resp");
        List items = feedItemList.getItems();
        if (items == null) {
            return C52575l.m112097a();
        }
        return items;
    }
}
