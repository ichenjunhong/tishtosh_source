package com.p683ss.android.ugc.aweme.comment.adapter;

import android.content.Context;
import android.view.View;
import com.p683ss.android.ugc.aweme.comment.api.C25139b;
import com.p683ss.android.ugc.aweme.comment.api.C25140c;
import com.p683ss.android.ugc.aweme.comment.model.CommentLikeUsersStruct;
import com.p683ss.android.ugc.aweme.comment.p1528ui.CommentListLikeListView;
import com.p683ss.android.ugc.aweme.comment.services.CommentService.C25280a;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.f */
public final class C25113f extends C25140c {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f66538a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C25113f.class), "mLikeUsersView", "getMLikeUsersView()Lcom/ss/android/ugc/aweme/comment/ui/CommentListLikeListView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C25113f.class), "mDivider", "getMDivider()Landroid/view/View;"))};

    /* renamed from: b */
    private final C52668f f66539b;

    /* renamed from: c */
    private final C52668f f66540c;

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.f$a */
    static final class C25114a extends C52712l implements C52670a<View> {

        /* renamed from: a */
        final /* synthetic */ View f66541a;

        C25114a(View view) {
            this.f66541a = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.f66541a.findViewById(R.id.a6h);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.f$b */
    static final class C25115b extends C52712l implements C52670a<CommentListLikeListView> {

        /* renamed from: a */
        final /* synthetic */ View f66542a;

        C25115b(View view) {
            this.f66542a = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (CommentListLikeListView) this.f66542a.findViewById(R.id.f7a);
        }
    }

    /* renamed from: a */
    private final CommentListLikeListView m61024a() {
        return (CommentListLikeListView) this.f66539b.getValue();
    }

    public C25113f(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        this.f66539b = C52732g.m112285a(new C25115b(view));
        this.f66540c = C52732g.m112285a(new C25114a(view));
    }

    /* renamed from: a */
    public final void mo51200a(CommentLikeUsersStruct commentLikeUsersStruct) {
        C52711k.m112240b(commentLikeUsersStruct, "likeUsersStruct");
        m61024a().setEventType(commentLikeUsersStruct.getEventType());
        m61024a().setLikeUsersDialogHeight(commentLikeUsersStruct.getDialogHeight());
        m61024a().mo51821a(commentLikeUsersStruct.getLikeUsers(), commentLikeUsersStruct.getLikeUsersCount(), commentLikeUsersStruct.getAweme());
        if (C25280a.m61493a().provideCommentBlackModeColorHelper().mo51199b()) {
            View view = (View) this.f66540c.getValue();
            if (view != null) {
                C25139b provideCommentBlackModeColorHelper = C25280a.m61493a().provideCommentBlackModeColorHelper();
                View view2 = this.itemView;
                C52711k.m112236a((Object) view2, "itemView");
                Context context = view2.getContext();
                C52711k.m112236a((Object) context, "itemView.context");
                view.setBackgroundColor(provideCommentBlackModeColorHelper.mo51198b(context));
            }
        }
    }
}
