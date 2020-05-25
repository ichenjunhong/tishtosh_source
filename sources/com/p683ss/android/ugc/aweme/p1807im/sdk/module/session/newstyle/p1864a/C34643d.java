package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.newstyle.p1864a;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p706c.C11190e;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.C23556a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p683ss.android.ugc.aweme.p1807im.DefaultIMService;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.IMShowRecommendIntervalExperiment;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1838b.C34213a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.C34605e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.C34605e.C34609b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.C34605e.C34610c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.C34611f;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.C34665p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.newstyle.p1865b.C34647a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.newstyle.recommend.C34660g;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.newstyle.recommend.C34661h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.newstyle.recommend.C34661h.C34662a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.newstyle.recommend.C34661h.C34663b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34567a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34576b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34579c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.C34983g;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1884e.C34958a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35178a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35203aq;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35220bb;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t;
import com.p683ss.android.ugc.aweme.p1807im.service.C35428b;
import com.p683ss.android.ugc.aweme.p1807im.service.C35460j;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.p1807im.service.p1899a.C35424c;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35454a;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35456b;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35457c;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.a.d */
public final class C34643d extends C26840g<Object> implements C34647a {

    /* renamed from: d */
    public static final C34644a f89242d = new C34644a(null);

    /* renamed from: a */
    public List<User> f89243a = new ArrayList();

    /* renamed from: b */
    public List<C35456b> f89244b = new ArrayList();

    /* renamed from: c */
    public C35424c<User> f89245c;

    /* renamed from: e */
    private View f89246e;

    /* renamed from: f */
    private final HashMap<String, Boolean> f89247f = new HashMap<>();

    /* renamed from: g */
    private final Map<String, Integer> f89248g = new LinkedHashMap();

    /* renamed from: h */
    private final Set<String> f89249h = new HashSet();

    /* renamed from: i */
    private final Set<String> f89250i = new HashSet();

    /* renamed from: j */
    private boolean f89251j;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.a.d$a */
    public static final class C34644a {
        private C34644a() {
        }

        public /* synthetic */ C34644a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.a.d$b */
    static final class C34645b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34643d f89252a;

        C34645b(C34643d dVar) {
            this.f89252a = dVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C34643d dVar = this.f89252a;
            C35284t a = C35284t.m79782a();
            C52711k.m112236a((Object) a, "IMSPUtils.get()");
            a.mo73435l(System.currentTimeMillis());
            dVar.an_();
            dVar.f89243a.clear();
            dVar.mo72700l();
            dVar.notifyDataSetChanged();
            C26890h.m65011a("close_follow_card", C23089d.m56640a().mo47829a("enter_from", "homepage_message").f61491a);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.a.d$c */
    static final class C34646c extends C52712l implements C52682m<RecommendContact, Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34643d f89253a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f89254b;

        C34646c(C34643d dVar, ViewGroup viewGroup) {
            this.f89253a = dVar;
            this.f89254b = viewGroup;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            RecommendContact recommendContact = (RecommendContact) obj;
            Integer num = (Integer) obj2;
            C35424c<User> cVar = this.f89253a.f89245c;
            if (cVar != null) {
                C52711k.m112236a((Object) recommendContact, "contact");
                C52711k.m112236a((Object) num, "position");
                cVar.mo72702a(102, recommendContact, num.intValue(), this.f89254b, "");
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: g */
    public final int mo72697g() {
        if (this.f89246e == null) {
            return 0;
        }
        return 1;
    }

    /* renamed from: k */
    public final boolean mo72699k() {
        return this.f89243a.isEmpty();
    }

    /* renamed from: c */
    public final int mo48636c() {
        return super.mo48636c() + mo72697g();
    }

    /* renamed from: j */
    public final boolean mo72698j() {
        if (C9376b.m18558a((Collection<T>) this.f70670n) || (this.f70670n.size() == 1 && (this.f70670n.get(0) instanceof C34640a))) {
            return true;
        }
        return false;
    }

    public C34643d() {
        mo54792d(R.string.bkd);
    }

    /* renamed from: m */
    private final void m78595m() {
        if (!C35279p.m79763a()) {
            int size = mo50673a().size();
            for (int i = 0; i < size; i++) {
                Object obj = mo50673a().get(i);
                if ((obj instanceof User) && !(obj instanceof C34660g) && !(obj instanceof RecommendContact)) {
                    Map<String, Integer> map = this.f89248g;
                    String uid = ((User) obj).getUid();
                    C52711k.m112236a((Object) uid, "item.uid");
                    List list = this.f70670n;
                    int i2 = -1;
                    if (list != null) {
                        Iterator it = list.iterator();
                        int i3 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            } else if (it.next() instanceof C34660g) {
                                i2 = i3;
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                    map.put(uid, Integer.valueOf((i - i2) - 1));
                }
            }
        }
    }

    /* renamed from: l */
    public final void mo72700l() {
        boolean z;
        List arrayList = new ArrayList();
        if (C35279p.m79763a()) {
            arrayList.addAll(this.f89244b);
        } else {
            if (this.f89244b.isEmpty()) {
                arrayList.add(new C34640a());
            } else {
                arrayList.addAll(this.f89244b);
            }
            Iterable iterable = this.f89243a;
            Collection arrayList2 = new ArrayList();
            for (Object next : iterable) {
                if (((User) next).getFollowStatus() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList2.add(next);
                }
            }
            arrayList.addAll((List) arrayList2);
        }
        mo50303a(arrayList);
        m78595m();
    }

    /* renamed from: b */
    private final boolean m78593b(int i) {
        if (i < mo72697g()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo72696c(View view) {
        C52711k.m112240b(view, "view");
        if (!C52711k.m112239a((Object) view, (Object) this.f89246e)) {
            this.f89246e = view;
        }
        notifyDataSetChanged();
    }

    public final void onViewDetachedFromWindow(C1352v vVar) {
        C52711k.m112240b(vVar, "holder");
        super.onViewDetachedFromWindow(vVar);
        if (vVar instanceof C34665p) {
            ((C34665p) vVar).mo72730b();
        }
    }

    /* renamed from: c */
    private final void m78594c(int i) {
        if (i >= 0 && i < this.f70670n.size()) {
            Object obj = this.f70670n.get(i);
            if (obj instanceof User) {
                this.f89243a.remove(obj);
                if (this.f89243a.size() == 1 && (this.f89243a.get(0) instanceof C34660g)) {
                    this.f89243a.clear();
                }
            }
            this.f70670n.remove(i);
            notifyItemRemoved(i + mo72697g());
            List list = this.f70670n;
            C52711k.m112236a((Object) list, "mItems");
            if (!list.isEmpty()) {
                List list2 = this.f70670n;
                C52711k.m112236a((Object) list2, "mItems");
                if (C52575l.m112142g(list2) instanceof C34660g) {
                    this.f70670n.remove(this.f70670n.size() - 1);
                    notifyItemRemoved((this.f70670n.size() - 1) + mo72697g());
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        if (m78593b(i)) {
            return 10001;
        }
        Object obj = this.f70670n.get(i - mo72697g());
        if (obj instanceof C34640a) {
            return 10005;
        }
        if (obj instanceof C35454a) {
            return 10007;
        }
        if (obj instanceof C34579c) {
            return 10008;
        }
        if (obj instanceof C35456b) {
            return 10002;
        }
        if (obj instanceof C34660g) {
            return 10003;
        }
        if (obj instanceof RecommendContact) {
            return 10006;
        }
        return 10004;
    }

    public final void onViewAttachedToWindow(C1352v vVar) {
        C52711k.m112240b(vVar, "holder");
        super.onViewAttachedToWindow(vVar);
        if (vVar instanceof C34665p) {
            C34665p pVar = (C34665p) vVar;
            pVar.mo72727a();
            Set<String> set = this.f89250i;
            C35456b bVar = pVar.f89306f;
            C52711k.m112236a((Object) bVar, "holder.currentSession");
            if (!set.contains(bVar.bm_())) {
                pVar.mo72731c();
                Set<String> set2 = this.f89250i;
                C35456b bVar2 = pVar.f89306f;
                C52711k.m112236a((Object) bVar2, "holder.currentSession");
                String bm_ = bVar2.bm_();
                C52711k.m112236a((Object) bm_, "holder.currentSession.sessionID");
                set2.add(bm_);
            }
        } else if ((vVar instanceof C34605e) && !this.f89251j) {
            C35190af.m79536r("create_group_cell_show");
            this.f89251j = true;
        }
    }

    /* renamed from: a */
    public final void mo72695a(User user) {
        boolean z;
        C52711k.m112240b(user, "user");
        if (user instanceof RecommendContact) {
            m78594c(this.f70670n.indexOf(user));
            return;
        }
        List list = this.f70670n;
        C52711k.m112236a((Object) list, "mItems");
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Object next = it.next();
            if (!(next instanceof User) || !C52711k.m112239a((Object) ((User) next).getUid(), (Object) user.getUid())) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                break;
            }
            i++;
        }
        m78594c(i);
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        switch (i) {
            case 10001:
                View view = this.f89246e;
                if (view == null) {
                    C52711k.m112234a();
                }
                return new C34642c(view);
            case 10002:
                return new C34665p(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bfn, viewGroup, false), this);
            case 10003:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bfm, viewGroup, false);
                C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…end_title, parent, false)");
                return new C34661h(inflate, new C34645b(this));
            case 10005:
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bfj, viewGroup, false);
                C52711k.m112236a((Object) inflate2, "LayoutInflater.from(pare…ty_status, parent, false)");
                return new C34641b(inflate2);
            case 10006:
                C34004b a = C34004b.m77717a();
                C52711k.m112236a((Object) a, "AwemeImManager.instance()");
                C1352v createRecommendContactItemView = a.mo71949f().createRecommendContactItemView(viewGroup, new C34646c(this, viewGroup));
                C52711k.m112236a((Object) createRecommendContactItemView, "AwemeImManager.instance(…nt, \"\")\n                }");
                return createRecommendContactItemView;
            case 10007:
                View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bfl, viewGroup, false);
                C52711k.m112236a((Object) inflate3, "view");
                return new C34611f(inflate3, this);
            case 10008:
                return new C34605e(viewGroup, this);
            default:
                C34004b a2 = C34004b.m77717a();
                C52711k.m112236a((Object) a2, "AwemeImManager.instance()");
                C1352v createRecommendViewHolder = a2.mo71949f().createRecommendViewHolder(viewGroup.getContext(), this.f89247f, this.f89245c);
                C52711k.m112236a((Object) createRecommendViewHolder, "AwemeImManager.instance(…FollowClickMap, listener)");
                return createRecommendViewHolder;
        }
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        int i2;
        int i3;
        int i4;
        C1352v vVar2 = vVar;
        int i5 = i;
        C52711k.m112240b(vVar2, "holder");
        int g = i5 - mo72697g();
        int i6 = 0;
        switch (mo48641a(i5)) {
            case 10002:
                if (vVar2 instanceof C34665p) {
                    C34665p pVar = (C34665p) vVar2;
                    Object obj = this.f70670n.get(g);
                    if (obj != null) {
                        pVar.mo72728a((C35456b) obj, g);
                        break;
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.session.BaseSession");
                    }
                }
                break;
            case 10003:
                if (vVar2 instanceof C34661h) {
                    C34661h hVar = (C34661h) vVar2;
                    View view = hVar.f89282a;
                    if (i5 == 0) {
                        i2 = 8;
                    } else {
                        i2 = 0;
                    }
                    view.setVisibility(i2);
                    IIMService provideIMService_Monster = DefaultIMService.provideIMService_Monster();
                    C52711k.m112236a((Object) provideIMService_Monster, "IMServiceManager.getServ…e(IIMService::class.java)");
                    C35428b abInterface = provideIMService_Monster.getAbInterface();
                    if (abInterface == null || !abInterface.mo70322c()) {
                        hVar.f89283b.setVisibility(8);
                    } else {
                        hVar.f89283b.setVisibility(0);
                        hVar.f89283b.setOnClickListener(C34662a.f89286a);
                    }
                    if (IMShowRecommendIntervalExperiment.m76316a() <= 0) {
                        hVar.f89284c.setVisibility(8);
                        break;
                    } else {
                        hVar.f89284c.setVisibility(0);
                        hVar.f89284c.setOnClickListener(new C34663b(hVar));
                        break;
                    }
                }
                break;
            case 10004:
                Object obj2 = this.f70670n.get(g);
                if (obj2 instanceof User) {
                    C34004b a = C34004b.m77717a();
                    C52711k.m112236a((Object) a, "AwemeImManager.instance()");
                    C35460j f = a.mo71949f();
                    User user = (User) obj2;
                    Integer num = (Integer) this.f89248g.get(user.getUid());
                    if (num != null) {
                        i3 = num.intValue();
                    } else {
                        i3 = 0;
                    }
                    f.bindRecommendViewHolder(vVar, user, i3, false, 10);
                    if (!this.f89249h.contains(user.getUid())) {
                        Set<String> set = this.f89249h;
                        String uid = user.getUid();
                        C52711k.m112236a((Object) uid, "uid");
                        set.add(uid);
                        C35424c<User> cVar = this.f89245c;
                        if (cVar != null) {
                            Integer num2 = (Integer) this.f89248g.get(user.getUid());
                            if (num2 != null) {
                                i4 = num2.intValue();
                            } else {
                                i4 = 0;
                            }
                            View view2 = vVar2.itemView;
                            C52711k.m112236a((Object) view2, "holder.itemView");
                            cVar.mo72702a(103, user, i4, view2, "");
                        }
                        C34004b a2 = C34004b.m77717a();
                        C52711k.m112236a((Object) a2, "AwemeImManager.instance()");
                        a2.mo71949f().addImpressionId(3, user.getUid());
                        break;
                    }
                }
                break;
            case 10006:
                Object obj3 = this.f70670n.get(g);
                if (obj3 instanceof RecommendContact) {
                    C34004b a3 = C34004b.m77717a();
                    C52711k.m112236a((Object) a3, "AwemeImManager.instance()");
                    a3.mo71949f().bindRecommendContactItemView(vVar2, (RecommendContact) obj3, i5);
                    break;
                }
                break;
            case 10007:
                Object obj4 = this.f70670n.get(g);
                if ((obj4 instanceof C35454a) && (vVar2 instanceof C34611f)) {
                    C34611f fVar = (C34611f) vVar2;
                    C35454a aVar = (C35454a) obj4;
                    C52711k.m112240b(aVar, "session");
                    fVar.f89173d = aVar;
                    fVar.f89174e = g;
                    AvatarImageView a4 = fVar.mo72657a();
                    ((C13833a) fVar.mo72657a().getHierarchy()).mo25892a((int) R.color.au0, C13818b.f36067g);
                    if (a4 != null) {
                        if (aVar.f91115f instanceof UrlModel) {
                            RemoteImageView remoteImageView = a4;
                            Object obj5 = aVar.f91115f;
                            if (obj5 != null) {
                                C23515d.m57669a(remoteImageView, (UrlModel) obj5);
                            } else {
                                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.model.UrlModel");
                            }
                        } else if (aVar.f91115f instanceof C23556a) {
                            RemoteImageView remoteImageView2 = a4;
                            Object obj6 = aVar.f91115f;
                            if (obj6 != null) {
                                C23515d.m57676a(remoteImageView2, (C23556a) obj6);
                            } else {
                                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.model.AppImageUri");
                            }
                        }
                        if (!TextUtils.isEmpty(aVar.f91116g)) {
                            C35178a.m79421a((View) fVar.mo72657a(), aVar.f91116g);
                        }
                    }
                    ((DmtTextView) fVar.f89171b.getValue()).setText(aVar.f91116g);
                    if (!TextUtils.isEmpty(aVar.f91117h)) {
                        fVar.mo72658b().setText(aVar.f91117h);
                        fVar.mo72658b().requestLayout();
                        fVar.mo72661e().setVisibility(0);
                    } else {
                        fVar.mo72661e().setVisibility(8);
                    }
                    if (aVar.f91118i != 0) {
                        ((DmtTextView) fVar.f89172c.getValue()).setText(C35220bb.m79609a(C11010c.m22280a(), aVar.f91118i));
                    }
                    if (aVar.f91119j > 0) {
                        fVar.mo72660d().setVisibility(0);
                        fVar.mo72659c().setVisibility(8);
                        fVar.mo72660d().setBadgeCount(aVar.f91119j);
                    } else {
                        fVar.mo72660d().setVisibility(8);
                        fVar.mo72659c().setVisibility(0);
                    }
                    C35203aq.m79582a(fVar.itemView);
                    if (!aVar.f91123n) {
                        aVar.mo73752a(true);
                        C34611f.m78562a(aVar.mo73750g(), "show", aVar.f91119j);
                        break;
                    }
                }
                break;
            case 10008:
                Object obj7 = this.f70670n.get(g);
                if ((obj7 instanceof C34579c) && (vVar2 instanceof C34605e)) {
                    C34605e eVar = (C34605e) vVar2;
                    C34579c cVar2 = (C34579c) obj7;
                    C52711k.m112240b(cVar2, "session");
                    eVar.f89160g = cVar2;
                    eVar.f89161h = g;
                    DmtTextView dmtTextView = eVar.f89156c;
                    C52711k.m112236a((Object) dmtTextView, "mTitle");
                    dmtTextView.setText(cVar2.f91116g);
                    C23515d.m57668a((RemoteImageView) eVar.f89155b, (int) R.drawable.d9a);
                    ImageView imageView = eVar.f89158e;
                    C52711k.m112236a((Object) imageView, "mYellowDot");
                    imageView.setVisibility(8);
                    ImageView imageView2 = eVar.f89159f;
                    C52711k.m112236a((Object) imageView2, "mRightArrow");
                    imageView2.setVisibility(0);
                    new C34983g(new C34958a(1, true)).m78958a(new C34609b(eVar, cVar2), new C34610c(eVar, cVar2), C34876e.f89837a, C34877f.f89838a).mo72991f();
                    C35284t a5 = C35284t.m79782a();
                    C52711k.m112236a((Object) a5, "IMSPUtils.get()");
                    if (a5.mo73390P() == 0) {
                        C35284t a6 = C35284t.m79782a();
                        C52711k.m112236a((Object) a6, "IMSPUtils.get()");
                        a6.mo73431j(System.currentTimeMillis());
                        break;
                    }
                }
                break;
        }
        View view3 = vVar2.itemView;
        C52711k.m112236a((Object) view3, "holder.itemView");
        LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof MarginLayoutParams) {
            if ((g == 0 && !(vVar2 instanceof C34641b)) || ((vVar2 instanceof C34661h) && (!this.f89244b.isEmpty()))) {
                i6 = (int) C9432q.m18687b(C11010c.m22280a(), 8.0f);
            }
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, i6, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    /* renamed from: a */
    public final void mo72674a(Context context, int i, C35456b bVar, int i2) {
        boolean z;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(bVar, "session");
        switch (i2) {
            case 0:
                C35457c cVar = bVar.f91125p;
                if (cVar != null) {
                    cVar.mo72636a(context, bVar, i2);
                    return;
                }
                break;
            case 1:
            case 2:
                if (bVar.f91122m == null) {
                    bVar.f91122m = new HashMap<>();
                }
                HashMap<String, String> hashMap = bVar.f91122m;
                C52711k.m112236a((Object) hashMap, "session.extraParams");
                hashMap.put("position", String.valueOf(i));
                if (bVar == null || (bVar instanceof C34576b) || (bVar.mo72634b() == 20 && C34213a.m78052a(bVar.bm_()))) {
                    z = false;
                } else {
                    z = true;
                }
                if (i2 == 2 && (bVar instanceof C34567a)) {
                    C11190e.m22685a(bVar.bm_());
                    z = false;
                }
                C35457c cVar2 = bVar.f91125p;
                if (cVar2 != null) {
                    cVar2.mo72636a(context, bVar, i2);
                }
                if (z) {
                    bVar.f91119j = 0;
                }
                notifyItemChanged(i + mo72697g());
                return;
        }
    }
}
