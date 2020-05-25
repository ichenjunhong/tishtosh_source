package com.p683ss.android.ugc.aweme.friends.adapter;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.p683ss.android.ugc.aweme.base.activity.C23452y;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.friends.p1787a.C32506c;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32720aj;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32728al;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32730an;
import com.p683ss.android.ugc.aweme.newfollow.util.C37940g;
import com.p683ss.android.ugc.aweme.notice.api.C38046d;
import com.p683ss.android.ugc.aweme.p1382aq.C23196ad;
import com.p683ss.android.ugc.aweme.p1382aq.C23196ad.C23197a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.t */
public final class C32546t extends C26840g<User> {

    /* renamed from: a */
    public int f84732a;

    /* renamed from: b */
    public int f84733b;

    /* renamed from: c */
    public String f84734c = "";

    /* renamed from: d */
    public int f84735d = -1;

    /* renamed from: e */
    public boolean f84736e;

    /* renamed from: f */
    public C32506c f84737f;

    /* renamed from: g */
    private AbsActivity f84738g;

    /* renamed from: h */
    private boolean f84739h;

    /* renamed from: i */
    private C23452y<User> f84740i;

    /* renamed from: j */
    private HashMap<String, Boolean> f84741j = new HashMap<>();

    /* renamed from: k */
    private List<String> f84742k;

    /* renamed from: c */
    public final int mo48636c() {
        int i;
        int c = super.mo48636c();
        if (c > 0) {
            i = 3;
            if (this.f84732a > 0) {
                i = 4;
            }
        } else {
            i = 2;
        }
        return c + i;
    }

    /* renamed from: a */
    public final void mo65848a(boolean z) {
        this.f84739h = z;
        notifyItemChanged(0);
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        boolean z;
        if (this.f84732a > 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            if (z) {
                this.f84735d = i;
            }
            if (z) {
                return 3;
            }
            return 2;
        } else if (!z || i != this.f84732a + 3) {
            return 4;
        } else {
            return 2;
        }
    }

    public final void onViewAttachedToWindow(C1352v vVar) {
        String str;
        super.onViewAttachedToWindow(vVar);
        if (vVar != null && (vVar instanceof C32728al)) {
            C32728al alVar = (C32728al) vVar;
            User a = alVar.mo66319a();
            if (a != null) {
                if (this.f84742k == null) {
                    this.f84742k = new ArrayList();
                }
                if (!this.f84742k.contains(a.getUid())) {
                    C23197a b = C23196ad.m56841a("follow_card").mo47957b("rec_uid", a.getUid()).mo47957b("enter_from", "find_friends").mo47957b("event_type", "impression").mo47957b("rec_reason", a.getRecommendReason()).mo47957b("impr_order", String.valueOf(mo50673a().indexOf(a))).mo47957b("req_id", a.getRequestId()).mo47957b("trigger_reason", "friend_rec_message").mo47957b("rec_reason", a.getRecommendReason());
                    String str2 = "card_type";
                    if (a.isNewRecommend()) {
                        str = "new";
                    } else {
                        str = "past";
                    }
                    b.mo47957b(str2, str).mo48076e();
                    C37940g.m84832a().mo77415a(3, alVar.mo66319a().getUid());
                    this.f84742k.add(a.getUid());
                }
            }
        }
    }

    public C32546t(AbsActivity absActivity, C23452y<User> yVar) {
        this.f84738g = absActivity;
        this.f84740i = yVar;
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        switch (i) {
            case 0:
                return new AddFriendsItemsViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bbh, viewGroup, false), this.f84738g, this.f84734c);
            case 1:
                return new C32550w(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bbj, viewGroup, false));
            case 2:
            case 3:
                return new C32730an(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.up, viewGroup, false));
            case 4:
                C32720aj ajVar = new C32720aj(viewGroup.getContext(), this.f84741j);
                ajVar.setEnterFrom(this.f84734c);
                ajVar.setListener(this.f84740i);
                ajVar.setRecommendAwemeClickListener(this.f84737f);
                return new C32728al(ajVar);
            default:
                return null;
        }
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        int i2;
        boolean z = true;
        switch (mo48641a(i)) {
            case 0:
                AddFriendsItemsViewHolder addFriendsItemsViewHolder = (AddFriendsItemsViewHolder) vVar;
                if (this.f84739h) {
                    if (addFriendsItemsViewHolder.f84608b.isViewValid()) {
                        if (addFriendsItemsViewHolder.mRedPointView.getVisibility() == 8) {
                            addFriendsItemsViewHolder.mRedPointView.setVisibility(0);
                        }
                        addFriendsItemsViewHolder.mRedPointView.setText(String.valueOf(C38046d.m85098a(4)));
                        break;
                    }
                } else {
                    if (addFriendsItemsViewHolder.f84608b.isViewValid()) {
                        if (addFriendsItemsViewHolder.mRedPointView.getVisibility() == 0) {
                            addFriendsItemsViewHolder.mRedPointView.setVisibility(8);
                            addFriendsItemsViewHolder.mRedPointView.setText("0");
                        }
                        if (C38046d.m85102b(4)) {
                            C38046d.m85103c(4);
                        }
                    }
                    return;
                }
                break;
            case 1:
                return;
            case 2:
                if (vVar instanceof C32730an) {
                    ((C32730an) vVar).mo66322a(false, this.f84733b, this.f84732a, false, "");
                    return;
                }
                break;
            case 3:
                if (vVar instanceof C32730an) {
                    C32730an anVar = (C32730an) vVar;
                    anVar.mo66322a(true, this.f84733b, this.f84732a, false, "");
                    if (this.f84736e) {
                        anVar.mo66321a();
                    }
                    return;
                }
                break;
            case 4:
                if (vVar instanceof C32728al) {
                    if (this.f84732a <= 0 || i <= this.f84732a + 3) {
                        i2 = i - 3;
                    } else {
                        i2 = i - 4;
                    }
                    if ((this.f84732a > 0 && i > this.f84732a + 3) || this.f84732a <= 0) {
                        z = false;
                    }
                    ((C32728al) vVar).mo66320a((User) this.f70670n.get(i2), i2, z, this.f84733b);
                    break;
                }
                break;
        }
    }
}
