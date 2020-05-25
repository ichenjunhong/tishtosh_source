package com.p683ss.android.ugc.aweme.following.p1770ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.friends.p1792ui.RecommendUserItemView;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.unread.C47495c;
import com.p683ss.android.ugc.aweme.unread.UnReadCircleView;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.following.ui.view.ConnectedRelationItemView */
public final class ConnectedRelationItemView extends RecommendUserItemView {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f84034a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ConnectedRelationItemView.class), "mUnReadVideoAvatarListController", "getMUnReadVideoAvatarListController()Lcom/ss/android/ugc/aweme/unread/UnReadVideoAvatarListController;"))};

    /* renamed from: b */
    public final HashMap<String, Integer> f84035b;

    /* renamed from: c */
    public final List<String> f84036c;

    /* renamed from: d */
    public final UnReadCircleView f84037d;

    /* renamed from: l */
    private final C52668f f84038l;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.view.ConnectedRelationItemView$a */
    static final class C32252a extends C52712l implements C52670a<C47495c> {

        /* renamed from: a */
        final /* synthetic */ ConnectedRelationItemView f84039a;

        C32252a(ConnectedRelationItemView connectedRelationItemView) {
            this.f84039a = connectedRelationItemView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C47495c(this.f84039a.f84037d, "common_relation");
        }
    }

    private final C47495c getMUnReadVideoAvatarListController() {
        return (C47495c) this.f84038l.getValue();
    }

    public final int getLayoutResId() {
        return R.layout.bhr;
    }

    /* renamed from: b */
    public final void mo65350b(User user) {
        this.f84037d.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo65348a(User user) {
        C52711k.m112240b(user, "user");
        super.mo65348a(user);
        mo65350b(user);
    }

    /* renamed from: c */
    public final void mo65351c(User user) {
        C52711k.m112240b(user, "user");
        super.mo65351c(user);
        getMBlockUserIv().setVisibility(8);
    }

    /* renamed from: a */
    public final void mo65347a(TextView textView, User user) {
        C52711k.m112240b(textView, "textView");
        C52711k.m112240b(user, "user");
        super.mo65347a(textView, user);
        textView.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo65349a(User user, int i) {
        C52711k.m112240b(user, "user");
        super.mo65349a(user, i);
        getMRemarkEdit().setVisibility(8);
    }

    public ConnectedRelationItemView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f84035b = new HashMap<>();
        this.f84036c = new ArrayList();
        View findViewById = getMRootView().findViewById(R.id.f7l);
        C52711k.m112236a((Object) findViewById, "mRootView.findViewById(R.id.view_unread)");
        this.f84037d = (UnReadCircleView) findViewById;
        this.f84038l = C52732g.m112285a(new C32252a(this));
    }

    public /* synthetic */ ConnectedRelationItemView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        this(context, null, 0);
    }
}
