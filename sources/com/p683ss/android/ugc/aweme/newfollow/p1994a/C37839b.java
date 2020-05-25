package com.p683ss.android.ugc.aweme.newfollow.p1994a;

import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.comment.list.C25261j;
import com.p683ss.android.ugc.aweme.comment.list.C25265n;
import com.p683ss.android.ugc.aweme.comment.list.C25268q;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.p683ss.android.ugc.aweme.comment.p1518c.C25147a;
import com.p683ss.android.ugc.aweme.comment.services.CommentService;
import com.p683ss.android.ugc.aweme.comment.services.CommentService.C25280a;
import com.p683ss.android.ugc.aweme.commercialize.model.C26129j;
import com.p683ss.android.ugc.aweme.discover.mixfeed.viewholder.ISearchMixViewHolderExperiment;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.flowfeed.p1752a.C31745a;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.FollowFeedCommentLayout.C31830a;
import com.p683ss.android.ugc.aweme.newfollow.p2003vh.C37952b;
import com.p683ss.android.ugc.aweme.newfollow.p2003vh.CommentFollowFeedMomentViewHolder;
import com.p683ss.android.ugc.aweme.p1308ad.AdServiceImpl;
import com.p683ss.android.ugc.aweme.p1308ad.p1310b.C22324a;
import com.p683ss.android.ugc.aweme.p1308ad.services.p1322a.C22429c;
import com.p683ss.android.ugc.aweme.p1308ad.view.C22450d;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.newfollow.a.b */
public final class C37839b extends C31745a {

    /* renamed from: h */
    public static final C37840a f96360h = new C37840a(null);

    /* renamed from: i */
    private final C22324a f96361i = new C37841b(this);

    /* renamed from: com.ss.android.ugc.aweme.newfollow.a.b$a */
    public static final class C37840a {
        private C37840a() {
        }

        public /* synthetic */ C37840a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.a.b$b */
    public static final class C37841b implements C22324a {

        /* renamed from: a */
        final /* synthetic */ C37839b f96362a;

        /* renamed from: a */
        public final void mo46458a() {
        }

        C37841b(C37839b bVar) {
            this.f96362a = bVar;
        }

        /* renamed from: a */
        public final void mo46459a(View view, boolean z, String str) {
            C52711k.m112240b(view, "itemView");
            C52711k.m112240b(str, "enterMethod");
            C31830a aVar = this.f96362a.f82923d;
            if (aVar != null) {
                aVar.mo64704a(view, this.f96362a.f82921b, this.f96362a.f82922c, false, str);
            }
        }
    }

    /* renamed from: a */
    public final void mo51254a(Comment comment) {
    }

    /* renamed from: a */
    public final void mo51256a(CommentReplyButtonStruct commentReplyButtonStruct, C25261j jVar) {
    }

    /* renamed from: a */
    public final void mo51257a(C29366a aVar) {
    }

    /* renamed from: b */
    public final void mo51260b(Comment comment, int i) {
    }

    /* renamed from: d */
    public final void mo51262d() {
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        List a = mo50673a();
        if (a == null) {
            return super.mo48641a(i);
        }
        if (((Comment) a.get(i)) instanceof C26129j) {
            return 10;
        }
        return 1;
    }

    /* renamed from: b */
    public final void mo51259b(C25265n nVar, Comment comment) {
        C31830a aVar = this.f82923d;
        if (aVar != null) {
            aVar.mo64706a(this.f82921b, comment);
        }
    }

    /* renamed from: b */
    public final void mo51261b(String str, String str2) {
        C31830a aVar = this.f82923d;
        if (aVar != null) {
            aVar.mo64713b(this.f82921b, str, str2);
        }
    }

    /* renamed from: a */
    public final void mo51253a(C25265n nVar, Comment comment) {
        C31830a aVar = this.f82923d;
        if (aVar != null) {
            aVar.mo64710a(this.f82921b, this.f82922c, comment, "click_comment");
        }
    }

    /* renamed from: a */
    public final void mo51255a(Comment comment, int i) {
        C31830a aVar = this.f82923d;
        if (aVar != null) {
            aVar.mo64707a(this.f82921b, comment, i);
        }
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        if (i == 10) {
            C22429c cVar = new C22429c();
            cVar.f60429g = this.f82925f;
            cVar.f60430h = 257;
            cVar.f60431i = this.f96361i;
            C22450d viewHolderForType = AdServiceImpl.createIAdServicebyMonsterPlugin().getViewHolderForType(viewGroup.getContext(), cVar);
            C52711k.m112236a((Object) viewHolderForType, "ServiceManager.get().get…e(parent.context, params)");
            return viewHolderForType;
        } else if (this.f82924e) {
            return new CommentFollowFeedMomentViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.u7, viewGroup, false), this);
        } else {
            if (this.f82926g == 9 && C10181b.m20511a().mo18168a(ISearchMixViewHolderExperiment.class, true, "search_mix_display_type", 31744, 0) == ISearchMixViewHolderExperiment.EXPERIMENT6) {
                return new CommentFollowFeedMomentViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.u7, viewGroup, false), this);
            }
            if (this.f82926g == 9) {
                C1352v vVar = (C1352v) this.f82920a.f82927a.poll();
                if (vVar != null) {
                    return vVar;
                }
            }
            C52711k.m112240b(viewGroup, "parent");
            CommentService a = C25280a.m61493a();
            C25147a aVar = this;
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            String curUserId = g.getCurUserId();
            C52711k.m112236a((Object) curUserId, "AccountProxyService.userService().curUserId");
            C25268q providerCommentViewHolderFollowFeed = a.providerCommentViewHolderFollowFeed(viewGroup, aVar, curUserId);
            if (providerCommentViewHolderFollowFeed != null) {
                return (C1352v) providerCommentViewHolderFollowFeed;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.RecyclerView.ViewHolder");
        }
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        String str;
        if (vVar instanceof C22450d) {
            C22429c cVar = new C22429c();
            Object obj = mo50673a().get(i);
            if (obj != null) {
                cVar.f60427e = (C26129j) obj;
                cVar.f60428f = new Rect(-1, -1, -1, -1);
                cVar.f60431i = this.f96361i;
                cVar.f60429g = this.f82925f;
                if (vVar != null) {
                    ((C22450d) vVar).mo46525a(C11010c.m22280a(), cVar);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.ad.view.IAdViewHolder<com.ss.android.ugc.aweme.ad.services.params.CommentAdViewHolderParams>");
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.model.CommentStruct");
        } else if (vVar instanceof CommentFollowFeedMomentViewHolder) {
            CommentFollowFeedMomentViewHolder commentFollowFeedMomentViewHolder = (CommentFollowFeedMomentViewHolder) vVar;
            commentFollowFeedMomentViewHolder.f96611b = this.f82925f;
            commentFollowFeedMomentViewHolder.f96612c = this.f82926g;
            Aweme aweme = this.f82921b;
            String str2 = null;
            if (aweme != null) {
                str = aweme.getAuthorUid();
            } else {
                str = null;
            }
            commentFollowFeedMomentViewHolder.f96614e = str;
            Aweme aweme2 = this.f82921b;
            if (aweme2 != null) {
                str2 = aweme2.getAid();
            }
            commentFollowFeedMomentViewHolder.f96613d = str2;
            Comment comment = (Comment) mo50673a().get(i);
            if (comment != null) {
                commentFollowFeedMomentViewHolder.f96610a = comment;
                if (commentFollowFeedMomentViewHolder.mTvComment != null) {
                    commentFollowFeedMomentViewHolder.mTvComment.post(new C37952b(commentFollowFeedMomentViewHolder, comment));
                    if (commentFollowFeedMomentViewHolder.f96612c == 9 && C10181b.m20511a().mo18168a(ISearchMixViewHolderExperiment.class, true, "search_mix_display_type", 31744, 0) != 0) {
                        commentFollowFeedMomentViewHolder.mTvComment.setLineSpacing(C9432q.m18687b(commentFollowFeedMomentViewHolder.itemView.getContext(), 1.2f), 1.0f);
                    }
                }
            }
        } else {
            if (vVar instanceof C25268q) {
                C25268q qVar = (C25268q) vVar;
                String str3 = this.f82925f;
                if (str3 == null) {
                    C52711k.m112234a();
                }
                qVar.mo51154a(str3);
                qVar.mo51150a(this.f82926g);
                Aweme aweme3 = this.f82921b;
                if (aweme3 == null) {
                    C52711k.m112234a();
                }
                String authorUid = aweme3.getAuthorUid();
                C52711k.m112236a((Object) authorUid, "aweme!!.authorUid");
                qVar.mo51158c(authorUid);
                Aweme aweme4 = this.f82921b;
                if (aweme4 == null) {
                    C52711k.m112234a();
                }
                String aid = aweme4.getAid();
                C52711k.m112236a((Object) aid, "aweme!!.aid");
                qVar.mo51157b(aid);
                Object obj2 = mo50673a().get(i);
                C52711k.m112236a(obj2, "data[position]");
                qVar.mo51152a((Comment) obj2);
            }
        }
    }

    /* renamed from: a */
    public final void mo51258a(String str, String str2) {
        C31830a aVar = this.f82923d;
        if (aVar != null) {
            aVar.mo64708a(this.f82921b, str, str2);
        }
    }

    /* renamed from: a */
    public final void mo51252a(View view, boolean z, String str) {
        C31830a aVar = this.f82923d;
        if (aVar != null) {
            aVar.mo64704a(view, this.f82921b, this.f82922c, z, str);
        }
    }
}
