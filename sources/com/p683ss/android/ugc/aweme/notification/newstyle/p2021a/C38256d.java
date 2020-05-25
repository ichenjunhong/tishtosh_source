package com.p683ss.android.ugc.aweme.notification.newstyle.p2021a;

import android.app.Activity;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2023c.C38317a;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2023c.p2026c.C38323a;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2023c.p2026c.C38323a.C38324a;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2027d.C38342g;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38404t;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.a.d */
public final class C38256d extends C26840g<User> implements C38324a {

    /* renamed from: b */
    public static final C38257a f97373b = new C38257a(null);

    /* renamed from: a */
    public int f97374a;

    /* renamed from: c */
    private final C38317a f97375c;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.a.d$a */
    public static final class C38257a {
        private C38257a() {
        }

        public /* synthetic */ C38257a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo50303a(List<User> list) {
        super.mo50303a(list);
    }

    /* renamed from: b */
    public final void mo50304b(List<? extends User> list) {
        super.mo50304b(list);
    }

    public C38256d(C38317a aVar) {
        C52711k.m112240b(aVar, "mActivity");
        this.f97375c = aVar;
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        if (mo50673a().get(i) instanceof C38342g) {
            return 14;
        }
        return super.mo48641a(i);
    }

    /* renamed from: a_ */
    public final C1352v mo49730a_(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        int c = C0726c.m2098c(viewGroup.getContext(), R.color.a1a);
        this.f70682s = c;
        C1352v a_ = super.mo49730a_(viewGroup);
        DmtTextView dmtTextView = new DmtTextView(viewGroup.getContext());
        dmtTextView.setGravity(17);
        dmtTextView.setTextColor(c);
        dmtTextView.setTextSize(13.0f);
        dmtTextView.setText(R.string.blg);
        View view = a_.itemView;
        if (view != null) {
            DmtStatusView dmtStatusView = (DmtStatusView) view;
            dmtStatusView.setBuilder(dmtStatusView.mo19207c().mo19231b((View) dmtTextView));
            C52711k.m112236a((Object) a_, "superFooterHolder");
            return a_;
        }
        throw new C52857u("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        C52711k.m112240b(vVar, "holder");
        if (mo48641a(i) != 14) {
            ((C38323a) vVar).mo78277a((User) mo50673a().get(i));
            return;
        }
        C38404t tVar = (C38404t) vVar;
        Object obj = mo50673a().get(i);
        if (obj != null) {
            tVar.mo78315a((C38342g) obj);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.model.MusTimestampTitleItem");
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        if (i != 14) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b29, viewGroup, false);
            C38317a aVar = this.f97375c;
            if (aVar != null) {
                return new C38323a(inflate, (Activity) aVar, this);
            }
            throw new C52857u("null cannot be cast to non-null type android.app.Activity");
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b39, viewGroup, false);
        C52711k.m112236a((Object) inflate2, "view");
        return new C38404t(inflate2);
    }

    /* renamed from: a */
    public final void mo78231a(User user, int i, int i2) {
        C52711k.m112240b(user, "user");
        if (i >= 0 && i < mo50673a().size()) {
            mo50673a().remove(i);
            boolean z = false;
            int i3 = i - 1;
            if (i3 >= 0 && mo48641a(i3) == 14 && (i >= mo50673a().size() || mo48641a(i) == 14)) {
                mo50673a().remove(i3);
                z = true;
            }
            if (mo50673a().isEmpty()) {
                notifyDataSetChanged();
                this.f97375c.mo78222b();
            } else if (z) {
                notifyItemRangeRemoved(i3, 2);
            } else {
                notifyItemRemoved(i);
            }
        }
    }
}
