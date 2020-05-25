package com.p683ss.android.ugc.aweme.profile.p2090ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p030v4.view.C1056u;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.captcha.p1491c.C24501b;
import com.p683ss.android.ugc.aweme.challenge.p1494a.C24530d;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.UserProfileActivity;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.C40438j.C40443b;
import com.p683ss.android.ugc.aweme.profile.presenter.C39969h.C39970a;
import com.p683ss.android.ugc.aweme.profile.presenter.C39971i;
import com.p683ss.android.ugc.aweme.profile.presenter.C39979m;
import com.p683ss.android.ugc.aweme.profile.util.C40556o;
import com.p683ss.android.ugc.aweme.setting.C41589c;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.l */
public final class C40448l extends C1352v implements OnClickListener, C39979m {

    /* renamed from: a */
    AvatarImageWithVerify f103261a;

    /* renamed from: b */
    TextView f103262b;

    /* renamed from: c */
    TextView f103263c;

    /* renamed from: d */
    public User f103264d;

    /* renamed from: e */
    int f103265e;

    /* renamed from: f */
    C40449a f103266f;

    /* renamed from: g */
    C40450b f103267g;

    /* renamed from: h */
    C40443b f103268h;

    /* renamed from: i */
    final View f103269i;

    /* renamed from: j */
    String f103270j;

    /* renamed from: k */
    int f103271k;

    /* renamed from: l */
    private View f103272l;

    /* renamed from: m */
    private TextView f103273m;

    /* renamed from: n */
    private Context f103274n;

    /* renamed from: o */
    private C39971i f103275o;

    /* renamed from: p */
    private View f103276p;

    /* renamed from: q */
    private ImageView f103277q;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.l$a */
    public interface C40449a {
        /* renamed from: a */
        void mo82741a(User user, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.l$b */
    public interface C40450b {
        /* renamed from: a */
        void mo82718a(int i);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006c, code lost:
        if (r0 != null) goto L_0x00b8;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo82742a() {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p683ss.android.ugc.aweme.account.C20902b.m53242a()
            boolean r0 = r0.isLogin()
            r1 = 0
            if (r0 != 0) goto L_0x001c
            android.app.Activity r0 = com.bytedance.ies.ugc.p694a.C11016e.m22312g()
            java.lang.String r2 = "homepage_follow"
            java.lang.String r3 = "click_follow_tab"
            com.ss.android.ugc.aweme.profile.ui.widget.n r4 = new com.ss.android.ugc.aweme.profile.ui.widget.n
            r4.<init>(r7)
            com.p683ss.android.ugc.aweme.login.C27965f.m66721a(r0, r2, r3, r1, r4)
            return
        L_0x001c:
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.f103264d
            int r0 = r0.getFollowStatus()
            if (r0 != 0) goto L_0x002f
            com.ss.android.ugc.aweme.profile.ui.widget.l$b r0 = r7.f103267g
            if (r0 == 0) goto L_0x002f
            com.ss.android.ugc.aweme.profile.ui.widget.l$b r0 = r7.f103267g
            int r2 = r7.f103265e
            r0.mo82718a(r2)
        L_0x002f:
            android.content.Context r0 = r7.f103274n
            if (r0 == 0) goto L_0x003e
            android.content.Context r0 = r7.f103274n
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x003e
            android.content.Context r0 = r7.f103274n
            android.app.Activity r0 = (android.app.Activity) r0
            goto L_0x003f
        L_0x003e:
            r0 = r1
        L_0x003f:
            com.ss.android.ugc.aweme.profile.model.User r2 = r7.f103264d
            int r2 = r2.getFollowStatus()
            r3 = 1
            r4 = 0
            r5 = 4
            if (r2 == r5) goto L_0x0064
            switch(r2) {
                case 0: goto L_0x004e;
                case 1: goto L_0x0064;
                case 2: goto L_0x0064;
                default: goto L_0x004d;
            }
        L_0x004d:
            goto L_0x0064
        L_0x004e:
            com.ss.android.ugc.aweme.profile.model.User r2 = r7.f103264d
            boolean r2 = r2.isSecret()
            if (r2 == 0) goto L_0x0058
            r4 = 4
            goto L_0x0064
        L_0x0058:
            com.ss.android.ugc.aweme.profile.model.User r2 = r7.f103264d
            int r2 = r2.getFollowerStatus()
            if (r2 != r3) goto L_0x0063
            r2 = 2
            r4 = 2
            goto L_0x0064
        L_0x0063:
            r4 = 1
        L_0x0064:
            com.ss.android.ugc.aweme.profile.model.User r2 = r7.f103264d
            int r2 = r2.getFollowStatus()
            if (r2 != r5) goto L_0x006f
            if (r0 == 0) goto L_0x00bb
            goto L_0x00b8
        L_0x006f:
            if (r4 != r5) goto L_0x00b8
            if (r0 == 0) goto L_0x00bb
            com.ss.android.ugc.aweme.app.SharePrefCache r2 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.bf r2 = r2.getPrivacyAccountFollowCount()
            java.lang.Object r6 = r2.mo47782d()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r6 != 0) goto L_0x00a2
            com.bytedance.ies.dmt.ui.b.a$a r5 = new com.bytedance.ies.dmt.ui.b.a$a
            r5.<init>(r0)
            r0 = 2132547838(0x7f1c18fe, float:2.0748933E38)
            com.bytedance.ies.dmt.ui.b.a$a r0 = r5.mo18899b(r0)
            r5 = 2132545162(0x7f1c0e8a, float:2.0743506E38)
            com.bytedance.ies.dmt.ui.b.a$a r0 = r0.mo18886a(r5, r1)
            com.bytedance.ies.dmt.ui.b.a r0 = r0.mo18897a()
            r0.mo18882b()
            goto L_0x00b0
        L_0x00a2:
            if (r6 <= 0) goto L_0x00b0
            if (r6 >= r5) goto L_0x00b0
            r1 = 2132547839(0x7f1c18ff, float:2.0748935E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21548c(r0, r1)
            r0.mo19066a()
        L_0x00b0:
            int r6 = r6 + r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r2.mo47776a(r0)
        L_0x00b8:
            r7.m89869a(r4)
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.p2090ui.widget.C40448l.mo82742a():void");
    }

    public final void onFollowFail(Exception exc) {
        if (!C24501b.m59896a(exc)) {
            C22971a.m56494a(this.f103274n, exc, R.string.b47);
        }
        mo82743a(this.f103264d.getFollowStatus(), this.f103264d.getFollowerStatus());
    }

    /* renamed from: a */
    private int m89868a(Drawable drawable) {
        int i = 0;
        if (this.f103273m == null || TextUtils.isEmpty(this.f103273m.getText())) {
            return 0;
        }
        TextPaint paint = this.f103273m.getPaint();
        Rect rect = new Rect();
        paint.getTextBounds(this.f103273m.getText().toString(), 0, this.f103273m.getText().toString().length(), rect);
        int width = rect.width();
        int b = (int) C9432q.m18687b(this.f103274n, 112.0f);
        if (drawable != null) {
            i = drawable.getIntrinsicWidth();
        }
        return (int) ((((float) ((b - width) - i)) - C9432q.m18687b(this.f103274n, 4.0f)) / 2.0f);
    }

    /* renamed from: b */
    private void m89870b(int i) {
        if (i == -1) {
            this.f103273m.setPadding(0, 0, 0, 0);
            this.f103273m.setGravity(17);
            this.f103273m.setCompoundDrawables(null, null, null, null);
            return;
        }
        Drawable drawable = this.f103274n.getResources().getDrawable(i);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        this.f103273m.setCompoundDrawables(drawable, null, null, null);
        this.f103273m.setPadding(m89868a(drawable), 0, 0, 0);
        this.f103273m.setCompoundDrawablePadding(4);
        this.f103273m.setGravity(16);
    }

    public final void onFollowSuccess(FollowStatus followStatus) {
        if (TextUtils.equals(followStatus.userId, this.f103264d.getUid())) {
            this.f103264d.setFollowStatus(followStatus.followStatus);
            C47718bf.m103288a(new C24530d(followStatus.followStatus, this.f103264d));
            mo82743a(followStatus.followStatus, followStatus.followerStatus);
            mo82745a(this.f103264d, followStatus.followStatus);
            C40556o.m89968a(this.f103274n, this.f103264d, followStatus);
            if (followStatus.followStatus == 0 && !TextUtils.isEmpty(this.f103264d.getRemarkName())) {
                this.f103264d.setRemarkName("");
                mo82744a(this.f103264d);
            }
        }
    }

    /* renamed from: a */
    private void m89869a(int i) {
        int i2;
        String str;
        mo82743a(i, this.f103264d.getFollowerStatus());
        if (this.f103264d.getFollowStatus() == 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        C39971i iVar = this.f103275o;
        C39970a a = new C39970a().mo81871a(this.f103264d.getUid()).mo81874b(this.f103264d.getSecUid()).mo81869a(i2);
        if (this.f103271k == 1) {
            str = "homepage_follow";
        } else {
            str = "others_homepage";
        }
        iVar.mo66349a(a.mo81876c(str).mo81873b(12).mo81877d(this.f103264d.getFollowerStatus()).mo81872a());
    }

    public final void onClick(View view) {
        String str;
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.ue) {
            C41589c.m91432a();
            C41589c.m91434f();
            if (this.f103266f != null) {
                this.f103266f.mo82741a(this.f103264d, this.f103265e);
            }
        } else {
            boolean z = true;
            if (id == R.id.hi) {
                if (this.f103268h != null) {
                    this.f103268h.mo60648d(this.f103264d, this.f103265e);
                }
                if (this.f103264d != null) {
                    Context context = this.f103274n;
                    C47661ab a = C47661ab.m103163a().mo94972a("uid", this.f103264d.getUid()).mo94969a("from_recommend_card", 1).mo94972a("sec_user_id", this.f103264d.getSecUid());
                    String str2 = "enter_from";
                    if (this.f103271k == 1) {
                        str = "homepage_follow";
                    } else if (this.f103271k == 2) {
                        str = "homepage_friends";
                    } else {
                        str = "others_homepage";
                    }
                    UserProfileActivity.m89400a(context, a.mo94972a(str2, str).mo94972a("enter_from_request_id", this.f103270j).mo94972a("extra_previous_page_position", "card_head").mo94969a("need_track_compare_recommend_reason", 1).mo94972a("previous_recommend_reason", this.f103264d.getRecommendReason()).mo94972a("recommend_from_type", "card").f120139a);
                }
            } else if (id == R.id.ai0) {
                if (this.f103268h != null) {
                    this.f103268h.mo60647c(this.f103264d, this.f103265e);
                }
                IIMService d = C33194e.m76279d();
                Context context2 = this.f103274n;
                if (this.f103264d.getFollowStatus() != 2) {
                    z = false;
                }
                d.wrapperSyncXAlert(context2, 2, z, new C40451m(this));
            }
        }
    }

    /* renamed from: a */
    public final void mo82744a(User user) {
        if (TextUtils.isEmpty(user.getRemarkName())) {
            this.f103262b.setText(this.f103264d.getNickname());
            this.f103272l.setContentDescription(this.f103264d.getNickname());
            this.f103261a.setContentDescription(this.f103264d.getNickname());
            return;
        }
        this.f103262b.setText(this.f103264d.getRemarkName());
        this.f103272l.setContentDescription(this.f103264d.getRemarkName());
        this.f103261a.setContentDescription(this.f103264d.getNickname());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo82745a(User user, int i) {
        C41589c.m91432a();
        if (C41589c.m91437i() != 1) {
            C41589c.m91432a();
            C41589c.m91437i();
        }
    }

    public C40448l(View view, int i) {
        super(view);
        this.f103274n = view.getContext();
        this.f103272l = view.findViewById(R.id.dms);
        C1056u.m3043b(this.f103272l, 1);
        this.f103261a = (AvatarImageWithVerify) view.findViewById(R.id.hi);
        this.f103261a.setRequestImgSize(C47788ct.m103417a(BaseNotice.HASHTAG));
        this.f103269i = view.findViewById(R.id.cfc);
        this.f103262b = (TextView) view.findViewById(R.id.dn1);
        this.f103263c = (TextView) view.findViewById(R.id.c_5);
        this.f103273m = (TextView) view.findViewById(R.id.ai0);
        this.f103276p = view.findViewById(R.id.b0_);
        this.f103277q = (ImageView) view.findViewById(R.id.ue);
        this.f103277q.setOnClickListener(this);
        C41589c.m91432a();
        C41589c.m91434f();
        this.f103272l.setOnClickListener(this);
        this.f103261a.setOnClickListener(this);
        this.f103273m.setOnClickListener(this);
        if (this.f103275o == null) {
            this.f103275o = new C39971i();
            this.f103275o.mo54800a(this);
        }
        this.f103271k = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo82743a(int i, int i2) {
        this.f103273m.setVisibility(0);
        Resources resources = this.f103274n.getResources();
        if (i == 0) {
            this.f103273m.setText(resources.getText(R.string.b3w));
            this.f103273m.setBackgroundResource(R.drawable.cjh);
            this.f103273m.setTextColor(resources.getColor(R.color.jf));
            m89870b(-1);
        } else if (i == 1 || i == 2) {
            m89870b(-1);
            int i3 = R.string.b55;
            if (i == 2) {
                i3 = R.string.as8;
            }
            this.f103273m.setText(i3);
            this.f103273m.setTextColor(resources.getColor(R.color.a18));
            this.f103273m.setBackgroundResource(R.drawable.l5);
        } else {
            if (i == 4) {
                this.f103273m.setTextColor(resources.getColor(R.color.a18));
                this.f103273m.setBackgroundResource(R.drawable.l5);
                this.f103273m.setText(this.f103274n.getString(R.string.b4y));
            }
        }
    }
}
