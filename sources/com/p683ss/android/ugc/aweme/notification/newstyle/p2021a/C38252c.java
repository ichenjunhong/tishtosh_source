package com.p683ss.android.ugc.aweme.notification.newstyle.p2021a;

import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2027d.C38327a;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2027d.C38329c;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2027d.C38342g;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38370b;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38404t;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.MainServiceImpl;
import com.p683ss.android.ugc.aweme.utils.C47916gh;
import com.p683ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.a.c */
public final class C38252c extends C26840g<User> {

    /* renamed from: e */
    public static final C38253a f97362e = new C38253a(null);

    /* renamed from: a */
    public UrlModel f97363a;

    /* renamed from: b */
    public String f97364b;

    /* renamed from: c */
    public C52670a<C52860x> f97365c;

    /* renamed from: d */
    public int f97366d;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.a.c$a */
    public static final class C38253a {
        private C38253a() {
        }

        public /* synthetic */ C38253a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m85449a(int i, String str) {
            C26890h.m65011a("notification_message_folded_message", C23089d.m56640a().mo47829a("action_type", str).mo47829a("account_type", "like").mo47826a("client_order", i).f61491a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.a.c$b */
    static final class C38254b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C38252c f97367a;

        /* renamed from: b */
        final /* synthetic */ List f97368b;

        /* renamed from: c */
        final /* synthetic */ List f97369c;

        /* renamed from: d */
        final /* synthetic */ int f97370d;

        /* renamed from: e */
        final /* synthetic */ List f97371e;

        C38254b(C38252c cVar, List list, List list2, int i, List list3) {
            this.f97367a = cVar;
            this.f97368b = list;
            this.f97369c = list2;
            this.f97370d = i;
            this.f97371e = list3;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            int i = 0;
            while (this.f97369c.size() + i < this.f97367a.f97366d + this.f97370d && i < this.f97368b.size()) {
                this.f97371e.add(this.f97368b.get(i));
                i++;
            }
            if (i < this.f97368b.size()) {
                this.f97371e.add(new C38342g(1));
                this.f97371e.addAll(this.f97368b.subList(i, this.f97368b.size()));
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.a.c$c */
    static final class C38255c extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        public static final C38255c f97372a = new C38255c();

        C38255c() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return C52860x.f131107a;
        }
    }

    public C38252c() {
        this(0, 1, null);
    }

    private C38252c(int i) {
        this.f97366d = i;
        this.f97365c = C38255c.f97372a;
    }

    /* renamed from: c */
    public final void mo51189c(List<User> list) {
        super.mo51189c(m85442a(list, true));
    }

    /* renamed from: a */
    public final void mo50303a(List<User> list) {
        List a = m85442a(list, false);
        a.add(0, new C38327a());
        super.mo50303a(a);
    }

    public final void onViewAttachedToWindow(C1352v vVar) {
        C52711k.m112240b(vVar, "holder");
        super.onViewAttachedToWindow(vVar);
        if (!(vVar instanceof C38370b)) {
            vVar = null;
        }
        C38370b bVar = (C38370b) vVar;
        if (bVar != null) {
            C38253a aVar = f97362e;
            C38253a.m85449a(bVar.getAdapterPosition(), "show");
        }
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        if (mo50673a().get(i) instanceof C38327a) {
            return 15;
        }
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
        dmtTextView.setText(R.string.bk9);
        DmtTextView dmtTextView2 = new DmtTextView(viewGroup.getContext());
        dmtTextView2.setGravity(17);
        dmtTextView2.setTextColor(c);
        dmtTextView2.setTextSize(13.0f);
        dmtTextView2.setText(R.string.blg);
        View view = a_.itemView;
        if (view != null) {
            DmtStatusView dmtStatusView = (DmtStatusView) view;
            dmtStatusView.setBuilder(dmtStatusView.mo19207c().mo19231b((View) dmtTextView2));
            C52711k.m112236a((Object) a_, "superFooterHolder");
            return a_;
        }
        throw new C52857u("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        switch (i) {
            case 14:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b39, viewGroup, false);
                C52711k.m112236a((Object) inflate, "view");
                return new C38404t(inflate);
            case 15:
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b2_, viewGroup, false);
                C52711k.m112236a((Object) inflate2, "view");
                return new C38329c(inflate2, this.f97363a, this.f97364b, this.f97365c);
            default:
                View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b2w, viewGroup, false);
                C52711k.m112236a((Object) inflate3, "view");
                return new C38370b(inflate3);
        }
    }

    /* renamed from: a */
    private final List<User> m85442a(List<User> list, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this.f97366d == 0) {
            if (list == null) {
                list = new ArrayList<>();
            }
            return list;
        } else if (list == null || list.isEmpty()) {
            return new ArrayList<>();
        } else {
            List a = mo50673a();
            if (a == null) {
                a = new ArrayList();
            }
            List<User> arrayList = new ArrayList<>();
            Iterable iterable = a;
            Iterator a2 = C52575l.m112148k(iterable).mo110157a();
            while (true) {
                if (!a2.hasNext()) {
                    i = 0;
                    break;
                }
                User user = (User) a2.next();
                if (!(user instanceof C38342g) || ((C38342g) user).getType() != 0) {
                    z4 = false;
                    continue;
                } else {
                    z4 = true;
                    continue;
                }
                if (z4) {
                    i = 1;
                    break;
                }
            }
            Iterator a3 = C52575l.m112148k(iterable).mo110157a();
            while (true) {
                if (!a3.hasNext()) {
                    z2 = false;
                    break;
                }
                User user2 = (User) a3.next();
                if (!(user2 instanceof C38342g) || ((C38342g) user2).getType() != 1) {
                    z3 = false;
                    continue;
                } else {
                    z3 = true;
                    continue;
                }
                if (z3) {
                    z2 = true;
                    break;
                }
            }
            C38254b bVar = new C38254b(this, list, a, i, arrayList);
            C52670a aVar = bVar;
            if (!z) {
                if (i == 0) {
                    arrayList.add(new C38342g(0));
                }
                aVar.invoke();
            } else if (i != 0 && (z2 || a.size() + list.size() < this.f97366d + i)) {
                arrayList.addAll(list);
                return arrayList;
            } else if (i != 0) {
                aVar.invoke();
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        String str;
        String uniqueId;
        switch (mo48641a(i)) {
            case 14:
                if (vVar != null) {
                    C38404t tVar = (C38404t) vVar;
                    Object obj = mo50673a().get(i);
                    if (obj != null) {
                        tVar.mo78315a((C38342g) obj);
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.model.MusTimestampTitleItem");
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTTimestampTitleHolder");
            case 15:
                return;
            default:
                if (vVar != null) {
                    C38370b bVar = (C38370b) vVar;
                    Object obj2 = mo50673a().get(i);
                    C52711k.m112236a(obj2, "data[position]");
                    User user = (User) obj2;
                    C52711k.m112240b(user, "user");
                    bVar.f97636f = user;
                    DmtTextView e = bVar.mo78298e();
                    C52711k.m112236a((Object) e, "mTvName");
                    e.setText(user.getNickname());
                    DmtTextView f = bVar.mo78299f();
                    C52711k.m112236a((Object) f, "mTvContent");
                    StringBuilder sb = new StringBuilder("@");
                    if (TextUtils.isEmpty(user.getUniqueId())) {
                        str = user.getShortId();
                    } else {
                        str = user.getUniqueId();
                    }
                    sb.append(str);
                    f.setText(sb.toString());
                    UserVerify userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
                    bVar.mo78297d().setUserData(userVerify);
                    bVar.mo78300g().mo65360a(user.getFollowStatus(), user.getFollowerStatus());
                    C31980a aVar = bVar.f97635e;
                    if (aVar != null) {
                        aVar.mo65173a(user);
                    }
                    bVar.mo78297d().mo48964b();
                    C47916gh.m103675a(bVar.f97110c, user.getCustomVerify(), user.getEnterpriseVerifyReason(), bVar.mo78298e());
                    if (MainServiceImpl.createIMainServicebyMonsterPlugin().shouldChangeToHandle("Notification")) {
                        DmtTextView e2 = bVar.mo78298e();
                        C52711k.m112236a((Object) e2, "mTvName");
                        if (TextUtils.isEmpty(user.getUniqueId())) {
                            uniqueId = user.getShortId();
                        } else {
                            uniqueId = user.getUniqueId();
                        }
                        e2.setText(uniqueId);
                        DmtTextView f2 = bVar.mo78299f();
                        C52711k.m112236a((Object) f2, "mTvContent");
                        f2.setText(user.getNickname());
                    }
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.LikeListHolder");
        }
    }

    public /* synthetic */ C38252c(int i, int i2, C52707g gVar) {
        this(0);
    }
}
