package com.p683ss.android.ugc.aweme.recommend;

import android.content.Context;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.activity.C23452y;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.friends.experiment.RecommendUserDialogItemViewStyle;
import com.p683ss.android.ugc.aweme.friends.model.RecommendUserHint;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32740ap;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32741aq;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32748ar;
import com.p683ss.android.ugc.aweme.friends.p1792ui.IRecommendFriendItemViewV2;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.newfollow.util.C37940g;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p2628d.C52857u;
import p2628d.p2629a.C52549aa;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.recommend.j */
public final class C41114j extends C26840g<User> {

    /* renamed from: c */
    public static final C41115a f104485c = new C41115a(null);

    /* renamed from: a */
    final RecommendUserHint f104486a;

    /* renamed from: b */
    public final String f104487b;

    /* renamed from: d */
    private final HashMap<String, Boolean> f104488d = new HashMap<>();

    /* renamed from: e */
    private final Set<String> f104489e = new HashSet();

    /* renamed from: f */
    private final C23452y<User> f104490f;

    /* renamed from: com.ss.android.ugc.aweme.recommend.j$a */
    public static final class C41115a {
        private C41115a() {
        }

        public /* synthetic */ C41115a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        User user = (User) this.f70670n.get(i);
        if (!(user instanceof RecommendUserHint) || ((RecommendUserHint) user).getRecDialogType() != 1) {
            return 0;
        }
        return 1;
    }

    /* renamed from: a_ */
    public final C1352v mo49730a_(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        int c = C0726c.m2098c(viewGroup.getContext(), R.color.arn);
        this.f70682s = c;
        C1352v a_ = super.mo49730a_(viewGroup);
        View view = a_.itemView;
        if (view != null) {
            DmtStatusView dmtStatusView = (DmtStatusView) view;
            C10719a c2 = dmtStatusView.mo19207c().mo19233c(0);
            DmtTextView dmtTextView = new DmtTextView(viewGroup.getContext());
            dmtTextView.setGravity(17);
            dmtTextView.setTextColor(c);
            dmtTextView.setTextSize(13.0f);
            dmtTextView.setText(R.string.d3p);
            dmtStatusView.setBuilder(c2.mo19231b((View) dmtTextView));
            C52711k.m112236a((Object) a_, "superFooterHolder");
            return a_;
        }
        throw new C52857u("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
    }

    public final void onViewAttachedToWindow(C1352v vVar) {
        C52711k.m112240b(vVar, "holder");
        super.onViewAttachedToWindow(vVar);
        if (vVar instanceof C32748ar) {
            C32748ar arVar = (C32748ar) vVar;
            User a = arVar.mo66319a();
            if (a != null && !this.f104489e.contains(a.getUid())) {
                Set<String> set = this.f104489e;
                String uid = a.getUid();
                C52711k.m112236a((Object) uid, "uid");
                set.add(uid);
                this.f104490f.mo48614a(103, a, arVar.getAdapterPosition(), vVar.itemView, "");
                C37940g.m84832a().mo77415a(3, a.getUid());
            }
        }
    }

    public C41114j(C23452y<User> yVar, String str) {
        C52711k.m112240b(yVar, "listener");
        this.f104490f = yVar;
        this.f104487b = str;
        RecommendUserHint recommendUserHint = new RecommendUserHint();
        recommendUserHint.setRecDialogType(1);
        this.f104486a = recommendUserHint;
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        if (vVar != null) {
            if (vVar instanceof C32740ap) {
                Object obj = this.f70670n.get(i);
                if (obj != null) {
                    C52711k.m112240b((RecommendUserHint) obj, "user");
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.friends.model.RecommendUserHint");
                }
            } else {
                if (vVar instanceof C32748ar) {
                    C32748ar arVar = (C32748ar) vVar;
                    Object obj2 = this.f70670n.get(i);
                    C52711k.m112236a(obj2, "mItems[position]");
                    arVar.mo66320a((User) obj2, i, false, 18);
                }
            }
        }
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        if (i != 1) {
            C32616c cVar = C32616c.f84865a;
            Context context = viewGroup.getContext();
            C52711k.m112236a((Object) context, "parent.context");
            IRecommendFriendItemViewV2 createRecommendUserDialogItemView = cVar.createRecommendUserDialogItemView(context, this.f104488d, false, RecommendUserDialogItemViewStyle.m75373a());
            if (createRecommendUserDialogItemView == null) {
                C52711k.m112234a();
            }
            createRecommendUserDialogItemView.setEnterFrom("others_homepage");
            createRecommendUserDialogItemView.setListener(this.f104490f);
            if (createRecommendUserDialogItemView != null) {
                return new C32748ar((C32741aq) createRecommendUserDialogItemView);
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.friends.ui.RecommendUserDialogItemView");
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bbf, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…alog_hint, parent, false)");
        return new C32740ap(inflate);
    }

    /* renamed from: a */
    public final void mo83626a(User user, int i) {
        C52711k.m112240b(user, "user");
        List list = this.f70670n;
        C52711k.m112236a((Object) list, "mItems");
        Iterator it = C52575l.m112095a((Collection) list).iterator();
        while (it.hasNext()) {
            int a = ((C52549aa) it).mo110114a();
            Object obj = this.f70670n.get(a);
            C52711k.m112236a(obj, "mItems[it]");
            if (TextUtils.equals(((User) obj).getUid(), user.getUid())) {
                Object obj2 = this.f70670n.get(a);
                C52711k.m112236a(obj2, "mItems[it]");
                ((User) obj2).setFollowStatus(i);
                notifyItemChanged(a);
            }
        }
    }
}
