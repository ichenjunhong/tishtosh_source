package com.p683ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimationImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.CircleImageView;
import com.p683ss.android.ugc.aweme.common.p1589a.C26838e;
import com.p683ss.android.ugc.aweme.discover.p1642d.C28099g;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.UserProfileActivity;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.RecommendCardViewHolder */
public class RecommendCardViewHolder extends C26838e {

    /* renamed from: a */
    public User f72928a;
    CircleImageView avatar;

    /* renamed from: b */
    private Context f72929b;

    /* renamed from: c */
    private C30313ae f72930c;
    FrameLayout closeContainer;
    ImageView closeIv;
    View descriptionBg;
    AnimationImageView ivFollow;
    View nickNameBg;
    LinearLayout rootLayout;
    TextView txtDescription;
    TextView txtNickName;

    /* renamed from: c */
    public final void mo50308c() {
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.b0t) {
            if (this.f72928a != null) {
                if (!C27804ak.m66548a(this.f72929b)) {
                    C10691a.m21542b(this.f72929b, (int) R.string.cg1).mo19066a();
                } else {
                    String uid = this.f72928a.getUid();
                    if (!TextUtils.equals(uid, C20902b.m53242a().getCurUserId()) && this.f72928a.getFollowStatus() == 0) {
                        if (this.f72928a.getFollowStatus() == 0) {
                            this.ivFollow.setAnimation("anim_follow_people.json");
                            this.ivFollow.mo6654b();
                        }
                        if (this.f72930c != null) {
                            C28099g gVar = new C28099g(uid, "follow");
                            gVar.f73790b = this.f72928a;
                            this.f72930c.mo60714a(gVar);
                        }
                    }
                }
            }
        } else if (id == R.id.cfg && this.f72928a != null) {
            UserProfileActivity.m89408a(this.f72929b, this.f72928a.getUid(), this.f72928a.getSecUid(), "discovery_recommend");
            if (this.f72930c != null) {
                this.f72930c.mo60714a(new C28099g(this.f72928a.getUid(), "enter"));
            }
        }
    }
}
