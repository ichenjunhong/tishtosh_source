package com.p683ss.android.ugc.aweme.profile.p2090ui.widget;

import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.common.p1593e.C26872d;
import com.p683ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40334dn;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40334dn.C40336b;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40334dn.C40337c;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40338do;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40338do.C40340b;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40338do.C40341c;
import com.p683ss.android.ugc.aweme.utils.C47916gh;
import com.p683ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.k */
public final class C40444k extends C26840g<User> {

    /* renamed from: g */
    public static final C40445a f103250g = new C40445a(null);

    /* renamed from: a */
    public C40446b f103251a;

    /* renamed from: b */
    public C26872d<C40338do> f103252b;

    /* renamed from: c */
    public C40341c f103253c;

    /* renamed from: d */
    public String f103254d;

    /* renamed from: e */
    public int f103255e;

    /* renamed from: f */
    public final HashMap<String, Integer> f103256f = new HashMap<>();

    /* renamed from: h */
    private int f103257h;

    /* renamed from: i */
    private int f103258i;

    /* renamed from: j */
    private final C40447c f103259j = new C40447c(this);

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.k$a */
    public static final class C40445a {
        private C40445a() {
        }

        public /* synthetic */ C40445a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.k$b */
    public interface C40446b {
        /* renamed from: a */
        void mo82230a(User user, int i);

        /* renamed from: b */
        void mo82231b(User user, int i);

        /* renamed from: c */
        void mo82232c(User user, int i);

        /* renamed from: d */
        void mo82233d(User user, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.k$c */
    public static final class C40447c implements C40340b {

        /* renamed from: a */
        final /* synthetic */ C40444k f103260a;

        C40447c(C40444k kVar) {
            this.f103260a = kVar;
        }

        /* renamed from: a */
        public final void mo82594a(User user, int i) {
            C52711k.m112240b(user, "user");
            if (i >= 0 && i < this.f103260a.f70670n.size()) {
                this.f103260a.f70670n.remove(i);
                this.f103260a.notifyItemRemoved(i);
                if (this.f103260a.f103251a != null && !(user instanceof RecommendContact)) {
                    C40446b bVar = this.f103260a.f103251a;
                    if (bVar != null) {
                        bVar.mo82230a(user, i);
                    }
                    if (this.f103260a.f70670n.isEmpty()) {
                        C40446b bVar2 = this.f103260a.f103251a;
                        if (bVar2 != null) {
                            bVar2.mo82231b(user, i);
                        }
                    }
                }
                if (i != this.f103260a.f70670n.size()) {
                    C40444k kVar = this.f103260a;
                    kVar.notifyItemRangeChanged(i, kVar.f70670n.size() - i);
                }
            }
        }
    }

    /* renamed from: a */
    public final List<User> mo50673a() {
        List<User> list = this.f70670n;
        C52711k.m112236a((Object) list, "mItems");
        return list;
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        if (((User) this.f70670n.get(i)) instanceof RecommendContact) {
            return 1;
        }
        return 0;
    }

    /* renamed from: b */
    private User m89857b(int i) {
        if (this.f70670n == null || i < 0 || i >= this.f70670n.size()) {
            return null;
        }
        return (User) this.f70670n.get(i);
    }

    public final void onViewAttachedToWindow(C1352v vVar) {
        C52711k.m112240b(vVar, "holder");
        super.onViewAttachedToWindow(vVar);
        if (vVar instanceof C40338do) {
            C26872d<C40338do> dVar = this.f103252b;
            if (dVar != null) {
                dVar.mo50455a(vVar);
            }
        } else if ((vVar instanceof C40334dn) && this.f103258i != 0) {
            C32616c.f84865a.setPermissionPopUpNextTime(this.f103258i);
        }
    }

    /* renamed from: a */
    public final void mo50303a(List<? extends User> list) {
        C52711k.m112240b(list, "list");
        this.f103258i = C32616c.f84865a.checkFriendslistPermissionPopUp("others_homepage");
        if (this.f103258i == 0) {
            this.f70670n = list;
        } else if (!list.isEmpty()) {
            if (this.f70670n == null) {
                this.f70670n = new ArrayList();
            }
            this.f70670n.clear();
            this.f70670n.addAll(list);
            RecommendContact recommendContact = new RecommendContact(Integer.valueOf(this.f103258i));
            recommendContact.setUid("0");
            this.f70670n.add(0, recommendContact);
        } else {
            return;
        }
        List list2 = this.f70670n;
        C52711k.m112236a((Object) list2, "mItems");
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            User user = (User) this.f70670n.get(i);
            Map map = this.f103256f;
            C52711k.m112236a((Object) user, "item");
            String uid = user.getUid();
            C52711k.m112236a((Object) uid, "item.uid");
            map.put(uid, Integer.valueOf(i));
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        if (i == 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bpo, viewGroup, false);
            C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…er_card_m, parent, false)");
            return new C40334dn(inflate, this.f103255e);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bpo, viewGroup, false);
        C52711k.m112236a((Object) inflate2, "LayoutInflater.from(pare…er_card_m, parent, false)");
        return new C40338do(inflate2, this.f103255e);
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        int i2;
        int i3;
        int i4;
        C52711k.m112240b(vVar, "holder");
        if (vVar instanceof C40338do) {
            C40338do doVar = (C40338do) vVar;
            User b = m89857b(i);
            C40340b bVar = this.f103259j;
            C40341c cVar = this.f103253c;
            C40446b bVar2 = this.f103251a;
            int i5 = this.f103257h;
            String str = this.f103254d;
            if (b != null) {
                doVar.f102980g = bVar2;
                doVar.f102976c = b;
                doVar.f102978e = bVar;
                doVar.f102979f = cVar;
                doVar.f102977d = i;
                UserVerify userVerify = new UserVerify(b.getAvatarThumb(), b.getCustomVerify(), b.getEnterpriseVerifyReason(), Integer.valueOf(b.getVerificationType()), b.getWeiboVerify());
                doVar.f102974a.setUserData(userVerify);
                doVar.f102974a.mo48964b();
                User user = doVar.f102976c;
                if (user == null) {
                    C52711k.m112237a("mUser");
                }
                doVar.mo82592a(user);
                StringBuilder sb = new StringBuilder("@");
                User user2 = doVar.f102976c;
                if (user2 == null) {
                    C52711k.m112237a("mUser");
                }
                sb.append(user2.getUniqueId());
                doVar.f102975b.setText(sb.toString());
                View view = doVar.itemView;
                C52711k.m112236a((Object) view, "itemView");
                C47916gh.m103675a(view.getContext(), b.getCustomVerify(), b.getEnterpriseVerifyReason(), doVar.f102975b);
                User user3 = doVar.f102976c;
                if (user3 == null) {
                    C52711k.m112237a("mUser");
                }
                int followStatus = user3.getFollowStatus();
                User user4 = doVar.f102976c;
                if (user4 == null) {
                    C52711k.m112237a("mUser");
                }
                doVar.mo82591a(followStatus, user4.getFollowerStatus());
                LayoutParams layoutParams = doVar.f102981h.getLayoutParams();
                if (layoutParams != null) {
                    RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
                    if (i != 0) {
                        i5 = 0;
                    }
                    layoutParams2.leftMargin = i5;
                    doVar.f102981h.setLayoutParams(layoutParams2);
                    doVar.f102982i = str;
                    if (doVar.f102982i == null) {
                        doVar.f102982i = "";
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.RecyclerView.LayoutParams");
                }
            }
            return;
        }
        if ((vVar instanceof C40334dn) && (m89857b(i) instanceof RecommendContact)) {
            C40334dn dnVar = (C40334dn) vVar;
            User b2 = m89857b(i);
            if (b2 != null) {
                RecommendContact recommendContact = (RecommendContact) b2;
                C40340b bVar3 = this.f103259j;
                C52711k.m112240b(recommendContact, "permission");
                AvatarImageWithVerify avatarImageWithVerify = dnVar.f102959a;
                Integer type = recommendContact.getType();
                if (type != null && type.intValue() == 1) {
                    i2 = R.drawable.do_;
                } else {
                    i2 = R.drawable.doa;
                }
                avatarImageWithVerify.setPlaceHolder(i2);
                DmtTextView dmtTextView = dnVar.f102960b;
                Integer type2 = recommendContact.getType();
                if (type2 != null && type2.intValue() == 1) {
                    i3 = R.string.h5t;
                } else {
                    i3 = R.string.h5v;
                }
                dmtTextView.setText(i3);
                DmtTextView dmtTextView2 = dnVar.f102961c;
                Integer type3 = recommendContact.getType();
                if (type3 != null && type3.intValue() == 1) {
                    i4 = R.string.h5s;
                } else {
                    i4 = R.string.h5u;
                }
                dmtTextView2.setText(i4);
                dnVar.f102963e.setOnClickListener(new C40336b(recommendContact, bVar3, i));
                dnVar.f102962d.setOnClickListener(new C40337c(recommendContact, bVar3, i));
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.friends.model.RecommendContact");
            }
        }
    }
}
