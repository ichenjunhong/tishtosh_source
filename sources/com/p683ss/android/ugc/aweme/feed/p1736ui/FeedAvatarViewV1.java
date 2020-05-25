package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.app.Dialog;
import android.arch.lifecycle.C0199s;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Looper;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimationImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23718g;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.discover.hitrank.C28220g;
import com.p683ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.utils.C31208r;
import com.p683ss.android.ugc.aweme.feed.utils.C31217y;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.story.C46635b;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.FeedAvatarViewV1 */
public class FeedAvatarViewV1 extends C31009h implements C0199s<C23274a> {

    /* renamed from: c */
    private static final String f80397c;

    /* renamed from: a */
    public boolean f80398a;

    /* renamed from: b */
    private C31112q f80399b;
    ViewGroup mFollowContainerView;
    AnimationImageView mFollowView;

    /* renamed from: a */
    public final void mo49781a() {
        C47718bf.m103291d(this);
        if (this.f80399b != null) {
            this.f80399b.mo63898a();
        }
    }

    /* renamed from: h */
    public final void mo63316h() {
        super.mo63316h();
        if (this.f80399b != null) {
            this.f80399b.mo63902b();
        }
    }

    static {
        String str;
        if (C23794bh.m58388b().mo75673d()) {
            str = "home_follow_lottie.json";
        } else {
            str = "anim_follow_people.json";
        }
        f80397c = str;
    }

    /* renamed from: d */
    private boolean m72012d() {
        if (this.f80399b == null || this.f80399b.f81423d == null || !this.f80399b.f81423d.mo53248d()) {
            return false;
        }
        return true;
    }

    public FeedAvatarViewV1(View view) {
        super(view);
        C47718bf.m103290c(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49784a(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.mo48226a("update_ad_user_follow_ui", (C0199s<C23274a>) this).mo48226a("bind_follow_view", (C0199s<C23274a>) this);
            if (this.f80399b != null) {
                this.f80399b.mo63899a(dataCenter);
            }
        }
    }

    /* renamed from: b */
    private void m72011b(int i) {
        int i2;
        float f;
        this.mFollowView.setAnimation(f80397c);
        AnimationImageView animationImageView = this.mFollowView;
        if (C26503d.m64062e(this.f81192l) || this.f81192l.isDelete()) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        animationImageView.setVisibility(i2);
        AnimationImageView animationImageView2 = this.mFollowView;
        if (i == 0) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        animationImageView2.setProgress(f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49783a(View view) {
        View view2 = ((X2CItemFeed) C35857a.m81002b(X2CItemFeed.class)).getView(this.f81198r, R.layout.b6_);
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(view2);
        }
        ButterKnife.bind((Object) this, view2);
        this.f80399b = new C31112q(view2);
    }

    @C53771m
    public void onFollowEvent(FollowStatus followStatus) {
        C31140u uVar = new C31140u(this, followStatus);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            uVar.run();
        } else if (this.mFollowView != null) {
            this.mFollowView.post(uVar);
        } else {
            C32458a.m75144a("onFollowEvent mFollowView is null!");
        }
    }

    public /* synthetic */ void onChanged(Object obj) {
        C23274a aVar = (C23274a) obj;
        if (aVar != null) {
            String str = aVar.f62242a;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1860252652) {
                if (hashCode == -1486328463 && str.equals("bind_follow_view")) {
                    c = 1;
                }
            } else if (str.equals("update_ad_user_follow_ui")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    if (!m72012d()) {
                        this.mFollowView.setVisibility(8);
                        return;
                    } else if (this.f81192l.getAuthor() != null) {
                        m72010a(this.f81192l.getAuthor().getFollowStatus());
                        return;
                    }
                    break;
                case 1:
                    m72010a(((Integer) aVar.mo48246a()).intValue());
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void mo58323a(VideoItemParams videoItemParams) {
        int i;
        AnimationImageView animationImageView;
        super.mo58323a(videoItemParams);
        this.f80399b.mo63900a(videoItemParams);
        C31208r.m72879a(this.f81192l, this.f81199s, true, true);
        ViewGroup viewGroup = this.mFollowContainerView;
        if (C47915gg.m103651b()) {
            i = 4;
        } else {
            i = 0;
        }
        viewGroup.setVisibility(i);
        int i2 = 8;
        if (C26469cc.m63997a(this.f81192l, 3)) {
            animationImageView = this.mFollowView;
        } else {
            animationImageView = this.mFollowView;
            if (!C26503d.m64062e(this.f81192l) && !this.f81192l.isDelete()) {
                i2 = 0;
            }
        }
        animationImageView.setVisibility(i2);
    }

    /* renamed from: a */
    private void m72010a(int i) {
        if (this.f81192l == null) {
            StringBuilder sb = new StringBuilder("aweme is null. FollowStatus is :");
            sb.append(i);
            C32458a.m75151c(4, "FeedAvatarView", sb.toString());
        } else if (this.f81192l.getAuthor() == null) {
            StringBuilder sb2 = new StringBuilder("author is null. AwemeId is :");
            sb2.append(this.f81192l.getAid());
            sb2.append(", FollowStatus is :");
            sb2.append(i);
            C32458a.m75151c(4, "FeedAvatarView", sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder("AuthorUid is: ");
            sb3.append(this.f81192l.getAuthorUid());
            sb3.append(", AwemeId is :");
            sb3.append(this.f81192l.getAid());
            sb3.append(", FollowStatus is :");
            sb3.append(i);
            C32458a.m75151c(4, "FeedAvatarView", sb3.toString());
            if (this.f81192l.isDelete()) {
                this.mFollowView.setVisibility(4);
                this.mFollowContainerView.setVisibility(4);
                C32458a.m75151c(4, "FeedAvatarView", "aweme is delete!updateFollowView!");
                return;
            }
            this.mFollowView.clearAnimation();
            User author = this.f81192l.getAuthor();
            int i2 = 0;
            if (C9431p.m18665a(author.getUid(), C20854a.m53167g().getCurUserId()) || C9431p.m18665a(this.f81193m, "homepage_follow") || !this.f81192l.isCanPlay()) {
                if (!C9431p.m18665a(this.f81193m, "homepage_follow") || C9431p.m18665a(author.getUid(), C20854a.m53167g().getCurUserId()) || !this.f81192l.isCanPlay() || (!C23794bh.m58388b().mo75673d() && i != 0)) {
                    this.mFollowView.setVisibility(4);
                } else {
                    m72011b(i);
                }
                boolean z = true;
                if (!C26235d.m63570a(this.f81192l) ? author == null || !author.isLive() || !C46635b.m101190a() || author.isBlock() || C47915gg.m103651b() : C31208r.m72886a(this.f81192l)) {
                    z = false;
                }
                if (z) {
                    if (!(this.f80399b == null || this.f80399b.f81422c == null)) {
                        ((LayoutParams) this.f80399b.f81422c.getLayoutParams()).bottomMargin = (int) C9432q.m18687b(this.f81198r, 12.5f);
                    }
                } else if (!(this.f80399b == null || this.f80399b.f81421b == null)) {
                    ((LayoutParams) this.f80399b.f81421b.getLayoutParams()).bottomMargin = (int) C9432q.m18687b(this.f81198r, 10.0f);
                }
                return;
            }
            if (i == 0) {
                try {
                    if (mo63786g() || m72012d()) {
                        this.mFollowView.setImageDrawable(C0726c.m2091a(this.f81198r, (int) R.drawable.cs9));
                        AnimationImageView animationImageView = this.mFollowView;
                        if (C26503d.m64062e(this.f81192l) || this.f81192l.isDelete()) {
                            i2 = 8;
                        }
                        animationImageView.setVisibility(i2);
                    }
                } catch (Exception unused) {
                }
            }
            if (!this.f80398a) {
                if ((mo63786g() || m72012d()) && C23794bh.m58388b().mo75673d()) {
                    m72011b(i);
                } else {
                    this.mFollowView.setVisibility(4);
                }
            }
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.ai3 && ((view == null || view.getVisibility() != 4) && !C26503d.m64057a(this.f81192l) && !mo63785c() && this.f81192l != null && !this.f81192l.isDelete())) {
            User author = this.f81192l.getAuthor();
            if (author != null) {
                if (author.getFollowStatus() != 0) {
                    if (C23794bh.m58388b().mo75673d()) {
                        C31217y.m72906a(this.f81192l, "head_icon");
                        Dialog c = new C10643a(view.getContext()).mo18885a((int) R.string.wq).mo18886a((int) R.string.f9m, (OnClickListener) new C31141v(this, view)).mo18900b((int) R.string.pc, C31142w.f81519a).mo18897a().mo18883c();
                        if (c.findViewById(R.id.dez) instanceof TextView) {
                            ((TextView) c.findViewById(R.id.dez)).setTextColor(view.getResources().getColor(R.color.j7));
                        }
                        if (c.findViewById(R.id.d8j) != null) {
                            c.findViewById(R.id.d8j).setVisibility(8);
                        }
                    }
                } else if (!TextUtils.equals(author.getUid(), C20854a.m53167g().getCurUserId())) {
                    if (this.f80399b != null && this.f80399b.f81423d != null && this.f80399b.f81423d.mo53244a() && !C26503d.m64065h(this.f81192l)) {
                        C25945k.m62911b().mo53118a(view.getContext(), this.f81192l);
                    }
                    if (C26503d.m64067j(this.f81192l) || C26503d.m64065h(this.f81192l)) {
                        C25945k.m62911b().mo53121a(this.f81198r, this.f81192l, "plus_sign");
                    }
                    if (!C23718g.m58207b().mo49153d()) {
                        C10691a.m21542b(this.f81198r, (int) R.string.cg1).mo19066a();
                        return;
                    }
                    if (this.f81197q != null) {
                        C30332aw awVar = new C30332aw(12, this.f81192l);
                        awVar.f79231d = C22858c.f61207c;
                        this.f81197q.mo48228a("feed_internal_event", (Object) awVar);
                    }
                    if (C20854a.m53167g().isLogin()) {
                        C28220g.f74083b.mo56652a(author, 5);
                        this.mFollowView.setAnimation(f80397c);
                        this.mFollowView.mo6654b();
                        this.mFollowView.mo6652a((AnimatorListener) new AnimatorListener() {
                            public final void onAnimationCancel(Animator animator) {
                            }

                            public final void onAnimationRepeat(Animator animator) {
                            }

                            public final void onAnimationStart(Animator animator) {
                            }

                            public final void onAnimationEnd(Animator animator) {
                                FeedAvatarViewV1.this.f80398a = false;
                            }
                        });
                        this.f80398a = true;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo63315a(FollowStatus followStatus) {
        if (!TextUtils.isEmpty(followStatus.userId) && TextUtils.equals(C23198ae.m56846a(this.f81192l), followStatus.userId)) {
            if (this.f81192l.getAuthor() != null) {
                this.f81192l.getAuthor().setFollowStatus(followStatus.followStatus);
            }
            m72010a(followStatus.followStatus);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo63314a(View view, DialogInterface dialogInterface, int i) {
        if (!C23718g.m58207b().mo49153d()) {
            C10691a.m21542b(view.getContext(), (int) R.string.cg1).mo19066a();
            dialogInterface.dismiss();
            return;
        }
        if (this.f81197q != null) {
            C30332aw awVar = new C30332aw(38, this.f81192l);
            awVar.f79231d = "head_icon";
            this.f81197q.mo48228a("feed_internal_event", (Object) awVar);
        }
        C31217y.m72907a(true);
        dialogInterface.dismiss();
    }
}
