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
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.p1382aq.C23249s;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.UserProfileActivity;
import com.p683ss.android.ugc.aweme.utils.C47916gh;
import com.p683ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FriendsSearchAdapter */
public class FriendsSearchAdapter extends C26840g<IMUser> {

    /* renamed from: a */
    public static final String f83778a = "FriendsSearchAdapter";

    /* renamed from: b */
    public String f83779b = "";

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FriendsSearchAdapter$ViewHolder */
    class ViewHolder extends C1352v {
        @BindView(2131493853)
        AvatarImageWithVerify ivAvatar;
        @BindView(2131493930)
        View remarkNameView;
        @BindView(2131493945)
        RemoteImageView sendMsgView;
        @BindView(2131495208)
        TextView txtDesc;
        @BindView(2131495226)
        TextView txtUserName;

        /* renamed from: a */
        public final void mo65295a(IMUser iMUser) {
            final User user = IMUser.toUser(iMUser);
            if (user.getFollowStatus() == 2) {
                user.setFollowerStatus(1);
            }
            this.itemView.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    UserProfileActivity.m89402a(ViewHolder.this.itemView.getContext(), user, "friends_list");
                    new C23249s().mo48144s(user.getUid()).mo48137c("friends_list").mo48143h("personal_homepage").mo48142g("1044").mo48076e();
                }
            });
            C32616c.m75399a().wrapperSendMessageSyncXIcon(this.sendMsgView, 4);
            this.sendMsgView.setOnClickListener(new C32120k(this, user));
            UserVerify userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
            this.ivAvatar.setUserData(userVerify);
            FriendsSearchAdapter friendsSearchAdapter = FriendsSearchAdapter.this;
            TextView textView = this.txtUserName;
            String str = FriendsSearchAdapter.this.f83779b;
            textView.setText(iMUser.getDisplayId());
            FriendsSearchAdapter friendsSearchAdapter2 = FriendsSearchAdapter.this;
            TextView textView2 = this.txtDesc;
            String str2 = FriendsSearchAdapter.this.f83779b;
            textView2.setText(iMUser.getNickName());
            this.ivAvatar.mo48964b();
            C47916gh.m103675a(this.itemView.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.txtUserName);
        }

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object) this, view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FriendsSearchAdapter$ViewHolder_ViewBinding */
    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ViewHolder f83783a;

        public void unbind() {
            ViewHolder viewHolder = this.f83783a;
            if (viewHolder != null) {
                this.f83783a = null;
                viewHolder.ivAvatar = null;
                viewHolder.txtUserName = null;
                viewHolder.txtDesc = null;
                viewHolder.sendMsgView = null;
                viewHolder.remarkNameView = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f83783a = viewHolder;
            viewHolder.ivAvatar = (AvatarImageWithVerify) Utils.findRequiredViewAsType(view, R.id.ay2, "field 'ivAvatar'", AvatarImageWithVerify.class);
            viewHolder.txtUserName = (TextView) Utils.findRequiredViewAsType(view, R.id.dl2, "field 'txtUserName'", TextView.class);
            viewHolder.txtDesc = (TextView) Utils.findRequiredViewAsType(view, R.id.dkb, "field 'txtDesc'", TextView.class);
            viewHolder.sendMsgView = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.eft, "field 'sendMsgView'", RemoteImageView.class);
            viewHolder.remarkNameView = Utils.findRequiredView(view, R.id.eff, "field 'remarkNameView'");
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
        ((ViewHolder) vVar).mo65295a((IMUser) this.f70670n.get(i));
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bpr, viewGroup, false));
    }
}
