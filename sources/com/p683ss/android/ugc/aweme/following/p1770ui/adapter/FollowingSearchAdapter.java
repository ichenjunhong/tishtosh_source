package com.p683ss.android.ugc.aweme.following.p1770ui.adapter;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a.C31988e;
import com.p683ss.android.ugc.aweme.following.p1770ui.view.FollowUserBtn;
import com.p683ss.android.ugc.aweme.p1382aq.C23249s;
import com.p683ss.android.ugc.aweme.p1382aq.C23253w;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.UserProfileActivity;
import com.p683ss.android.ugc.aweme.utils.C47916gh;
import com.p683ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowingSearchAdapter */
public class FollowingSearchAdapter extends C26840g<IMUser> {

    /* renamed from: a */
    public static final String f83769a = "FollowingSearchAdapter";

    /* renamed from: b */
    public String f83770b = "";

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowingSearchAdapter$ViewHolder */
    class ViewHolder extends C1352v {

        /* renamed from: a */
        C31980a f83771a;
        @BindView(2131493884)
        View editRemark;
        @BindView(2131493853)
        AvatarImageWithVerify ivAvatar;
        @BindView(2131494191)
        View more;
        @BindView(2131495208)
        TextView txtDesc;
        @BindView(2131495209)
        FollowUserBtn txtFollow;
        @BindView(2131495226)
        TextView txtUserName;

        /* renamed from: a */
        public final void mo65292a(IMUser iMUser) {
            final User user = IMUser.toUser(iMUser);
            if (user.getFollowStatus() == 2) {
                user.setFollowerStatus(1);
            }
            this.itemView.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    UserProfileActivity.m89402a(ViewHolder.this.itemView.getContext(), user, "following");
                    new C23249s().mo48144s(user.getUid()).mo48137c("following").mo48143h("personal_homepage").mo48142g("1044").mo48076e();
                }
            });
            UserVerify userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
            this.ivAvatar.setUserData(userVerify);
            FollowingSearchAdapter.this.mo65290a(this.txtUserName, iMUser, FollowingSearchAdapter.this.f83770b);
            FollowingSearchAdapter.this.mo65291b(this.txtDesc, iMUser, FollowingSearchAdapter.this.f83770b);
            this.f83771a.f83488c = new C32119j(this, iMUser);
            this.f83771a.mo65173a(user);
            this.more.getLayoutParams().width = 0;
            this.ivAvatar.mo48964b();
            C47916gh.m103675a(this.itemView.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.txtUserName);
        }

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object) this, view);
            this.f83771a = new C31980a(this.txtFollow, new C31988e(FollowingSearchAdapter.this) {
                /* renamed from: a */
                public final void mo49741a(int i, User user) {
                    String str;
                    String str2;
                    super.mo49741a(i, user);
                    if (i == 1) {
                        str = "follow";
                    } else {
                        str = "follow_cancel";
                    }
                    C23253w c = new C23253w(str).mo48164d("others_homepage").mo48161b("common_relation").mo48163c("follow_button");
                    if (i == 1) {
                        str2 = "1007";
                    } else {
                        str2 = "1036";
                    }
                    c.mo48160a(str2).mo48166f(user.getUid()).mo48076e();
                }
            });
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo65293a(IMUser iMUser, FollowStatus followStatus) {
            if (followStatus != null) {
                FollowingSearchAdapter.this.mo65290a(this.txtUserName, iMUser, FollowingSearchAdapter.this.f83770b);
                FollowingSearchAdapter.this.mo65291b(this.txtDesc, iMUser, FollowingSearchAdapter.this.f83770b);
                if (followStatus.isFollowSucess) {
                    iMUser.setFollowStatus(followStatus.followStatus);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowingSearchAdapter$ViewHolder_ViewBinding */
    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ViewHolder f83777a;

        public void unbind() {
            ViewHolder viewHolder = this.f83777a;
            if (viewHolder != null) {
                this.f83777a = null;
                viewHolder.ivAvatar = null;
                viewHolder.txtUserName = null;
                viewHolder.txtDesc = null;
                viewHolder.txtFollow = null;
                viewHolder.editRemark = null;
                viewHolder.more = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f83777a = viewHolder;
            viewHolder.ivAvatar = (AvatarImageWithVerify) Utils.findRequiredViewAsType(view, R.id.ay2, "field 'ivAvatar'", AvatarImageWithVerify.class);
            viewHolder.txtUserName = (TextView) Utils.findRequiredViewAsType(view, R.id.dl2, "field 'txtUserName'", TextView.class);
            viewHolder.txtDesc = (TextView) Utils.findRequiredViewAsType(view, R.id.dkb, "field 'txtDesc'", TextView.class);
            viewHolder.txtFollow = (FollowUserBtn) Utils.findRequiredViewAsType(view, R.id.dkd, "field 'txtFollow'", FollowUserBtn.class);
            viewHolder.editRemark = Utils.findRequiredView(view, R.id.b0_, "field 'editRemark'");
            viewHolder.more = Utils.findRequiredView(view, R.id.bmy, "field 'more'");
        }
    }

    public void onViewAttachedToWindow(C1352v vVar) {
        super.onViewAttachedToWindow(vVar);
    }

    public void onViewDetachedFromWindow(C1352v vVar) {
        super.onViewDetachedFromWindow(vVar);
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        ((ViewHolder) vVar).mo65292a((IMUser) this.f70670n.get(i));
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bpe, viewGroup, false));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65290a(TextView textView, IMUser iMUser, String str) {
        textView.setText(iMUser.getDisplayId());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo65291b(TextView textView, IMUser iMUser, String str) {
        textView.setText(iMUser.getNickName());
    }
}
