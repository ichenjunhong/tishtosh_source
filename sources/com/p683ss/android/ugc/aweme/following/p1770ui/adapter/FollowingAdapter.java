package com.p683ss.android.ugc.aweme.following.p1770ui.adapter;

import android.arch.lifecycle.C0184k;
import android.content.res.Resources;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
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
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.base.widget.C23751c;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.experiment.C29504e;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a.C31988e;
import com.p683ss.android.ugc.aweme.following.p1770ui.C32199n;
import com.p683ss.android.ugc.aweme.following.p1770ui.C32352x.C32357b;
import com.p683ss.android.ugc.aweme.following.p1770ui.view.FollowUserBtn;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40211ae;
import com.p683ss.android.ugc.aweme.profile.util.C40519aa.C40520a;
import com.p683ss.android.ugc.aweme.profile.viewmodel.FollowViewModel;
import com.p683ss.android.ugc.aweme.utils.C47916gh;
import com.p683ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowingAdapter */
public class FollowingAdapter extends C23751c<User> {

    /* renamed from: g */
    public static final String f83752g = "FollowingAdapter";

    /* renamed from: e */
    public boolean f83753e;

    /* renamed from: f */
    public C32112c f83754f;

    /* renamed from: h */
    protected C32199n f83755h;

    /* renamed from: i */
    public boolean f83756i;

    /* renamed from: j */
    public boolean f83757j = false;

    /* renamed from: k */
    public HashMap<String, Boolean> f83758k = new HashMap<>();

    /* renamed from: l */
    public C0184k f83759l;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowingAdapter$ViewHolder */
    class ViewHolder extends C1352v {

        /* renamed from: a */
        C31980a f83761a;

        /* renamed from: b */
        FollowViewModel f83762b;
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
        private static boolean m74491a(int i) {
            return i == 1 || i == 2;
        }

        /* renamed from: a */
        public final void mo65286a(final User user) {
            UserVerify userVerify;
            this.itemView.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    FollowingAdapter.this.f83754f.mo56497a(user, ViewHolder.this.getAdapterPosition());
                }
            });
            if (user != null) {
                userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
            } else {
                userVerify = null;
            }
            this.ivAvatar.setUserData(userVerify);
            this.ivAvatar.mo48964b();
            mo65287a(user, user.getFollowStatus());
            mo65288b(user, user.getFollowStatus());
            this.f83761a.f83488c = new C32113d(this, user);
            if (!((Boolean) SharePrefCache.inst().getRemoveFollowerSwitch().mo47782d()).booleanValue() || !FollowingAdapter.this.f83755h.isMine() || FollowingAdapter.this.f83755h == null || FollowingAdapter.this.f83755h.getPageType() != C32357b.follower) {
                this.more.getLayoutParams().width = 0;
            } else {
                Resources resources = this.more.getResources();
                this.more.setOnClickListener(new C32114e(this, new CharSequence[]{resources.getString(R.string.d6l), resources.getString(R.string.wf)}, user, resources));
                this.more.getLayoutParams().width = -2;
            }
            this.f83761a.mo65173a(user);
        }

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object) this, view);
            this.f83761a = new C31980a(this.txtFollow, new C31988e() {
                /* renamed from: b */
                public final String mo56222b() {
                    return "click_follow";
                }

                /* renamed from: a */
                public final String mo56221a() {
                    return FollowingAdapter.m74481b(FollowingAdapter.this.f83755h);
                }

                /* renamed from: c */
                public final int mo56223c() {
                    if (FollowingAdapter.this.f83755h.isMine()) {
                        if (FollowingAdapter.this.f83755h.getPageType() == C32357b.follower) {
                            return 9;
                        }
                        return 0;
                    } else if (FollowingAdapter.this.f83755h.getPageType() == C32357b.follower) {
                        return 11;
                    } else {
                        return 10;
                    }
                }

                /* renamed from: a */
                public final void mo49741a(int i, User user) {
                    String str;
                    String str2;
                    MobClick obtain = MobClick.obtain();
                    if (i == 1) {
                        str = "follow";
                    } else {
                        str = "follow_cancel";
                    }
                    C26890h.onEvent(obtain.setEventName(str).setLabelName(FollowingAdapter.m74481b(FollowingAdapter.this.f83755h)).setValue(String.valueOf(user.getUid())));
                    if (i == 1) {
                        String str3 = "follow";
                        C23089d a = C23089d.m56640a().mo47829a("enter_from", FollowingAdapter.m74481b(FollowingAdapter.this.f83755h)).mo47829a("to_user_id", user.getUid());
                        String str4 = "previous_page";
                        if (FollowingAdapter.this.f83755h.isMine()) {
                            str2 = "personal_homepage";
                        } else {
                            str2 = "others_homepage";
                        }
                        C26890h.m65011a(str3, a.mo47829a(str4, str2).mo47829a("previous_page_position", "other_places").mo47829a("enter_method", "follow_button").mo47831b().f61491a);
                    }
                }
            });
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo65288b(final User user, int i) {
            if (C29504e.m69643c() == 2 || C29504e.m69643c() == 3) {
                if (FollowingAdapter.this.f83758k != null && FollowingAdapter.this.f83758k.get(user.getUid()) != null) {
                    ((Boolean) FollowingAdapter.this.f83758k.get(user.getUid())).booleanValue();
                    new C40520a() {
                        /* renamed from: a */
                        public final void mo65278a() {
                            ViewHolder.this.mo65287a(user, user.getFollowStatus());
                        }
                    };
                    FollowingAdapter.this.f83758k.put(user.getUid(), Boolean.valueOf(false));
                } else if (this.editRemark != null) {
                    this.editRemark.setVisibility(8);
                }
            }
        }

        /* renamed from: a */
        public final void mo65287a(User user, int i) {
            boolean z;
            boolean z2;
            this.txtDesc.setVisibility(0);
            if (!TextUtils.isEmpty(user.getRemarkName())) {
                this.txtUserName.setText(user.getRemarkName());
                this.txtDesc.setText(this.itemView.getContext().getResources().getString(R.string.b4p, new Object[]{user.getNickname()}));
                z2 = false;
                z = true;
            } else {
                this.txtUserName.setText(user.getNickname());
                if (TextUtils.isEmpty(user.getSignature())) {
                    if (FollowingAdapter.this.f83757j) {
                        this.txtDesc.setVisibility(8);
                    } else {
                        this.txtDesc.setText(R.string.dk1);
                    }
                    z2 = false;
                } else {
                    this.txtDesc.setText(user.getSignature());
                    z2 = true;
                }
                z = false;
            }
            if (FollowingAdapter.this.f83753e) {
                boolean isEmpty = true ^ TextUtils.isEmpty(user.getRecommendReason());
                if (m74491a(i) || !isEmpty) {
                    this.txtDesc.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    if (!isEmpty || FollowingAdapter.this.f83758k == null || FollowingAdapter.this.f83758k.get(user.getUid()) == null) {
                        if (z2) {
                            this.txtDesc.setText("");
                            this.txtDesc.setVisibility(8);
                        }
                    } else if (!z) {
                        this.txtDesc.setText(user.getRecommendReason());
                        this.txtDesc.setCompoundDrawablesWithIntrinsicBounds(2131955086, 0, 0, 0);
                        C9432q.m18691b((View) this.txtDesc, 0);
                    }
                } else {
                    this.txtDesc.setText(user.getRecommendReason());
                    this.txtDesc.setCompoundDrawablesWithIntrinsicBounds(2131955086, 0, 0, 0);
                    C9432q.m18691b((View) this.txtDesc, 0);
                }
            }
            C47916gh.m103675a(this.itemView.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.txtUserName);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowingAdapter$ViewHolder_ViewBinding */
    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ViewHolder f83768a;

        public void unbind() {
            ViewHolder viewHolder = this.f83768a;
            if (viewHolder != null) {
                this.f83768a = null;
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
            this.f83768a = viewHolder;
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

    public FollowingAdapter(C0184k kVar) {
        this.f83759l = kVar;
    }

    /* renamed from: a */
    public final int mo65284a(String str) {
        int c = m74482c(str);
        if (c == -1 || !mo49208b()) {
            return c;
        }
        return c + 1;
    }

    /* renamed from: b */
    public static String m74481b(C32199n nVar) {
        if (nVar.isMine()) {
            if (nVar.getPageType() == C32357b.follower) {
                return "fans";
            }
            return "following";
        } else if (nVar.getPageType() == C32357b.follower) {
            return "other_fans";
        } else {
            return "other_following";
        }
    }

    /* renamed from: c */
    private int m74482c(String str) {
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
    public final void mo65285a(C32199n nVar) {
        boolean z;
        this.f83755h = nVar;
        if (!C40211ae.m89448a(nVar.getUser()) || nVar.getPageType() != C32357b.follower) {
            z = false;
        } else {
            z = true;
        }
        this.f83756i = z;
        if (nVar.isMine()) {
            C29504e.m69641a();
            this.f83753e = false;
            return;
        }
        C29504e.m69641a();
        this.f83753e = false;
    }

    /* renamed from: b */
    public final void mo49207b(C1352v vVar, int i) {
        ((ViewHolder) vVar).mo65286a((User) this.f70670n.get(i));
    }

    /* renamed from: b */
    public final C1352v mo49206b(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bpe, viewGroup, false));
    }
}
