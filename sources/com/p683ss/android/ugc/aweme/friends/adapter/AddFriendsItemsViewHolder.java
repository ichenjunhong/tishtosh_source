package com.p683ss.android.ugc.aweme.friends.adapter;

import android.content.Intent;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.p683ss.android.common.p1146d.C18898c;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.friends.invite.C32584b;
import com.p683ss.android.ugc.aweme.friends.p1792ui.ContactsActivity;
import com.p683ss.android.ugc.aweme.friends.p1792ui.InviteFriendsActivity;
import com.p683ss.android.ugc.aweme.friends.service.C32619f;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.AddFriendsItemsViewHolder */
public class AddFriendsItemsViewHolder extends C1352v {

    /* renamed from: a */
    C32584b f84607a;

    /* renamed from: b */
    AbsActivity f84608b;

    /* renamed from: c */
    private String f84609c;
    TextView mRedPointView;

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.df) {
            C26890h.m65011a("find_friends", C23089d.m56640a().mo47829a("enter_from", "find_friends").mo47829a("platform", "facebook").f61491a);
            this.f84608b.startActivity(C32619f.f84867a.getInviteUserListActivityIntent(this.f84608b, 3));
        } else if (id == R.id.dl) {
            C26890h.m65011a("find_friends", C23089d.m56640a().mo47829a("enter_from", "find_friends").mo47829a("platform", "twitter").f61491a);
            this.f84608b.startActivity(C32619f.f84867a.getInviteUserListActivityIntent(this.f84608b, 2));
        } else if (id == R.id.dn) {
            C26890h.m65011a("find_friends", C23089d.m56640a().mo47829a("enter_from", "find_friends").mo47829a("platform", "vk").f61491a);
            this.f84608b.startActivity(C32619f.f84867a.getInviteUserListActivityIntent(this.f84608b, 4));
        } else if (id == R.id.dc) {
            C26890h.m65011a("find_friends", C23089d.m56640a().mo47829a("enter_from", "find_friends").mo47829a("platform", "contact").f61491a);
            C18898c.m46009a(this.f84608b, "add_profile", "phone_number");
            this.f84608b.startActivity(ContactsActivity.m75414a(this.f84608b, this.f84609c, false));
        } else {
            if (id == R.id.auw) {
                C26890h.m65011a("invite_friends", C23089d.m56640a().mo47829a("enter_from", "find_friends").f61491a);
                AbsActivity absActivity = this.f84608b;
                String str = this.f84609c;
                Intent intent = new Intent(absActivity, InviteFriendsActivity.class);
                if (!TextUtils.isEmpty(str)) {
                    intent.putExtra("enter_from", str);
                }
                this.f84608b.startActivity(intent);
            }
        }
    }

    public AddFriendsItemsViewHolder(View view, AbsActivity absActivity, String str) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f84608b = absActivity;
        this.f84609c = str;
        this.f84607a = new C32584b(view.getContext());
        boolean z = true;
        this.f84607a.mo65914a(C20854a.m53167g().getCurUser(), this.f84608b.getString(R.string.bt8, new Object[]{this.f84608b.getString(R.string.it)}), this.f84608b.getString(R.string.ca8));
        int i = 8;
        view.findViewById(R.id.dl).setVisibility(8);
        view.findViewById(R.id.dn).setVisibility(8);
        if (!"RU".equalsIgnoreCase(C35837h.m80981f()) && !"RU".equalsIgnoreCase(C35837h.m80980e())) {
            z = false;
        }
        if (z) {
            view.findViewById(R.id.dn).setVisibility(0);
        } else if (C35837h.m80982g()) {
            view.findViewById(R.id.dl).setVisibility(0);
        }
        if (this.itemView != null) {
            View findViewById = this.itemView.findViewById(R.id.auw);
            if (findViewById != null) {
                if (((Boolean) SharePrefCache.inst().isShowInviteContactsFriends().mo47782d()).booleanValue()) {
                    i = 0;
                }
                C9432q.m18691b(findViewById, i);
            }
        }
    }
}
