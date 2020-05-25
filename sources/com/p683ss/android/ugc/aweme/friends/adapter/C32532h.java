package com.p683ss.android.ugc.aweme.friends.adapter;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SectionIndexer;
import com.p683ss.android.ugc.aweme.base.widget.C23751c;
import com.p683ss.android.ugc.aweme.friends.model.ContactModel;
import com.p683ss.android.ugc.aweme.friends.model.Friend;
import com.p683ss.android.ugc.aweme.friends.p1787a.C32505b;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.h */
public final class C32532h<T extends User> extends C23751c<T> implements SectionIndexer {

    /* renamed from: e */
    public SectionIndexer f84701e;

    /* renamed from: f */
    public C32533a f84702f = new C32533a();

    /* renamed from: g */
    private int f84703g;

    /* renamed from: h */
    private C32505b f84704h;

    /* renamed from: com.ss.android.ugc.aweme.friends.adapter.h$a */
    public static final class C32533a {

        /* renamed from: a */
        public int f84705a = -1;

        /* renamed from: b */
        public boolean f84706b;

        /* renamed from: c */
        public boolean f84707c;

        /* renamed from: d */
        public String f84708d;
    }

    public final Object[] getSections() {
        if (this.f84701e != null) {
            return this.f84701e.getSections();
        }
        return new String[]{" "};
    }

    public final int getPositionForSection(int i) {
        if (this.f84701e != null) {
            return this.f84701e.getPositionForSection(i);
        }
        return -1;
    }

    public final int getSectionForPosition(int i) {
        if (this.f84701e != null) {
            return this.f84701e.getSectionForPosition(i);
        }
        return -1;
    }

    /* renamed from: a */
    public final int mo65831a(ContactModel contactModel) {
        Friend friend;
        if (contactModel == null) {
            return -1;
        }
        int size = this.f70670n.size();
        for (int i = 0; i < size; i++) {
            if (this.f70670n.get(i) instanceof Friend) {
                friend = (Friend) this.f70670n.get(i);
            } else {
                friend = null;
            }
            if (friend != null && contactModel.equals(new ContactModel(friend.getSocialName(), friend.getNickname()))) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final int mo65832a(String str) {
        if (mo48636c() == 0) {
            return -1;
        }
        int size = this.f70670n.size();
        for (int i = 0; i < size; i++) {
            User user = (User) this.f70670n.get(i);
            if (user != null && TextUtils.equals(user.getUid(), str)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo65833a(FollowStatus followStatus) {
        int a = mo65832a(followStatus.userId);
        if (a != -1 && a < this.f70670n.size()) {
            User user = (User) this.f70670n.get(a);
            if (user != null) {
                user.setFollowStatus(followStatus.followStatus);
            }
        }
    }

    public C32532h(int i, C32505b bVar) {
        this.f84703g = i;
        this.f84704h = bVar;
        mo54792d(R.string.an1);
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        if (getItemViewType(i) == 22) {
            if (!(this.f63324c == null || i == 0)) {
                i--;
            }
            mo49207b(vVar, i);
            return;
        }
        super.mo48222a(vVar, i);
    }

    /* renamed from: b */
    public final C1352v mo49206b(ViewGroup viewGroup, int i) {
        boolean z = false;
        if (i == 22) {
            return new C32518aa(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bba, viewGroup, false), this.f84704h);
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bbb, viewGroup, false);
        C32505b bVar = this.f84704h;
        if (this.f84703g != 0) {
            z = true;
        }
        return new C32534i(inflate, bVar, z);
    }

    /* renamed from: b */
    public final void mo49207b(C1352v vVar, int i) {
        C32533a aVar;
        if (vVar instanceof C32518aa) {
            this.f70670n.get(i);
            return;
        }
        C32534i iVar = (C32534i) vVar;
        T t = (User) this.f70670n.get(i);
        int i2 = this.f84703g;
        if (t != null) {
            iVar.f84716h.setVisibility(0);
            iVar.f84711c = t;
            iVar.f84712d = i2;
            UserVerify userVerify = new UserVerify(t.getAvatarThumb(), t.getCustomVerify(), t.getEnterpriseVerifyReason(), Integer.valueOf(t.getVerificationType()), t.getWeiboVerify());
            iVar.f84714f.setUserData(userVerify);
            if (t.getAvatarThumb() == null) {
                iVar.f84714f.getAvatarImageView().setController(null);
            }
            iVar.f84715g.setText(t.getNickname());
            if (C32534i.m75284a(t) != null) {
                if (TextUtils.isEmpty(C32534i.m75284a(t).getSocialName())) {
                    iVar.f84716h.setText(C47915gg.m103656e(t));
                } else {
                    iVar.f84716h.setText(C32534i.m75284a(t).getSocialName());
                }
            }
            iVar.f84717i.mo65360a(t.getFollowStatus(), t.getFollowerStatus());
            if (iVar.f84712d == 0 && TextUtils.isEmpty(t.getUid()) && C32534i.m75284a(t) != null) {
                if (C32534i.m75284a(t).isInvited()) {
                    iVar.f84717i.mo65913b();
                } else {
                    iVar.f84717i.mo65912a();
                }
                if (this.f84702f.f84705a == i) {
                    aVar = this.f84702f;
                } else {
                    this.f84702f.f84705a = i;
                    int sectionForPosition = getSectionForPosition(i);
                    boolean z = true;
                    if (sectionForPosition == -1 || getPositionForSection(sectionForPosition) != i) {
                        this.f84702f.f84706b = false;
                        this.f84702f.f84708d = null;
                    } else {
                        this.f84702f.f84706b = true;
                        this.f84702f.f84708d = (String) getSections()[sectionForPosition];
                    }
                    C32533a aVar2 = this.f84702f;
                    if (getPositionForSection(sectionForPosition + 1) - 1 != i) {
                        z = false;
                    }
                    aVar2.f84707c = z;
                    aVar = this.f84702f;
                }
                if (!TextUtils.isEmpty(aVar.f84708d)) {
                    iVar.f84719k.setVisibility(0);
                    iVar.f84719k.setText(aVar.f84708d);
                    return;
                }
                iVar.f84719k.setVisibility(8);
            }
        }
    }
}
