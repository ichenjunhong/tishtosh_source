package com.p683ss.android.ugc.aweme.notification.p2011a;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23697k;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.SmartRoundImageView;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice;
import com.p683ss.android.ugc.aweme.notification.newstyle.C38415g;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.notification.utils.C38454c;
import com.p683ss.android.ugc.aweme.notification.view.CustomLinearLayoutManager;
import com.p683ss.android.ugc.aweme.p2108r.p2110b.C41052b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.p683ss.android.ugc.aweme.utils.C47903fw;
import com.p683ss.android.ugc.aweme.utils.C47916gh;
import com.p683ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.notification.a.n */
public final class C38132n extends C38114b implements OnClickListener {

    /* renamed from: c */
    public Activity f97092c;

    /* renamed from: d */
    private AvatarImageWithVerify f97093d;

    /* renamed from: e */
    private SmartRoundImageView f97094e;

    /* renamed from: f */
    private TextView f97095f;

    /* renamed from: g */
    private TextView f97096g;

    /* renamed from: h */
    private TextView f97097h;

    /* renamed from: i */
    private RecyclerView f97098i;

    /* renamed from: j */
    private ConstraintLayout f97099j;

    /* renamed from: k */
    private DiggNotice f97100k;

    /* renamed from: l */
    private C38134b f97101l;

    /* renamed from: m */
    private View f97102m;

    /* renamed from: n */
    private BaseNotice f97103n;

    /* renamed from: o */
    private String f97104o;

    /* renamed from: com.ss.android.ugc.aweme.notification.a.n$a */
    class C38133a extends C1352v implements OnClickListener {

        /* renamed from: a */
        AvatarImageView f97105a;

        /* renamed from: b */
        User f97106b;

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C41302w a = C41302w.m91042a();
            Activity activity = C38132n.this.f97092c;
            StringBuilder sb = new StringBuilder("aweme://user/profile/");
            sb.append(this.f97106b.getUid());
            a.mo83858a(activity, sb.toString());
        }

        C38133a(View view) {
            super(view);
            this.f97105a = (AvatarImageView) view;
            this.f97105a.setOnClickListener(this);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.a.n$b */
    class C38134b extends C1322a {

        /* renamed from: a */
        List<User> f97108a = new ArrayList();

        public final int getItemCount() {
            if (this.f97108a != null) {
                return this.f97108a.size();
            }
            return 0;
        }

        C38134b() {
        }

        public final void onBindViewHolder(C1352v vVar, int i) {
            C38133a aVar = (C38133a) vVar;
            User user = (User) this.f97108a.get(i);
            if (user != null) {
                aVar.f97106b = user;
                C23515d.m57669a((RemoteImageView) aVar.f97105a, user.getAvatarThumb());
            }
        }

        public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
            AvatarImageView avatarImageView = new AvatarImageView(viewGroup.getContext());
            avatarImageView.setLayoutParams(new LayoutParams((int) C9432q.m18687b(C11010c.m22280a(), 27.0f), (int) C9432q.m18687b(C11010c.m22280a(), 27.0f)));
            return new C38133a(avatarImageView);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo78083a() {
        return true;
    }

    /* renamed from: a */
    public static int m85230a(DiggNotice diggNotice) {
        if (diggNotice == null || diggNotice.getAweme() == null) {
            return 0;
        }
        return diggNotice.getAweme().getEnterpriseType();
    }

    /* renamed from: a */
    public final void mo78082a(boolean z) {
        super.mo78082a(z);
        if (z) {
            this.f97102m.setVisibility(8);
            C41052b.m90722a(this.f97099j);
            return;
        }
        this.f97102m.setVisibility(0);
        C41052b.m90723a(this.f97099j, R.drawable.cm0, R.color.ana);
    }

    public final void onClick(View view) {
        boolean z;
        ClickInstrumentation.onClick(view);
        if (!mo78092b()) {
            String str = "click";
            String str2 = "like";
            int adapterPosition = getAdapterPosition();
            BaseNotice baseNotice = this.f97103n;
            if (this.f97102m.getVisibility() == 8) {
                z = true;
            } else {
                z = false;
            }
            mo78086a(str, str2, adapterPosition, baseNotice, z, this.f97104o);
            super.onClick(view);
            if (this.f97100k != null) {
                int id = view.getId();
                if (id == R.id.btc || id == R.id.bte) {
                    if (this.f97100k.getUsers() != null && this.f97100k.getUsers().size() > 0) {
                        mo78085a(this.f97092c, ((User) this.f97100k.getUsers().get(0)).getUid(), ((User) this.f97100k.getUsers().get(0)).getSecUid());
                        m85185a(((User) this.f97100k.getUsers().get(0)).getUid(), "message_like", "click_head");
                    }
                } else if (id == R.id.btg || id == R.id.btj) {
                    if (this.f97100k.getDiggType() == 5 || this.f97100k.getDiggType() == 6) {
                        C38454c.m85777a(this.f97092c, this.f97100k.getForwardId(), "message", this.f97100k.getCid(), m85230a(this.f97100k));
                    } else {
                        Aweme aweme = this.f97100k.getAweme();
                        C41302w a = C41302w.m91042a();
                        Activity activity = this.f97092c;
                        StringBuilder sb = new StringBuilder();
                        sb.append("aweme://aweme/detail/");
                        sb.append(aweme.getAid());
                        a.mo83858a(activity, C41311y.m91065a(sb.toString()).mo83870a("cid", this.f97100k.getCid()).mo83870a("refer", "message").mo83871a());
                    }
                    mo78082a(true);
                    C38415g.m85725a(this.f97092c);
                }
            }
        }
    }

    public C38132n(View view, Activity activity) {
        super(view);
        this.f97092c = activity;
        this.f97099j = (ConstraintLayout) view.findViewById(R.id.btg);
        this.f97093d = (AvatarImageWithVerify) view.findViewById(R.id.btc);
        this.f97094e = (SmartRoundImageView) view.findViewById(R.id.btj);
        this.f97095f = (TextView) view.findViewById(R.id.bte);
        this.f97096g = (TextView) view.findViewById(R.id.bth);
        this.f97097h = (TextView) view.findViewById(R.id.btb);
        this.f97098i = (RecyclerView) view.findViewById(R.id.btf);
        this.f97102m = view.findViewById(R.id.bti);
        CustomLinearLayoutManager customLinearLayoutManager = new CustomLinearLayoutManager(this.f97092c);
        customLinearLayoutManager.mo4731b(0);
        C23697k kVar = new C23697k(0, (int) C9432q.m18687b((Context) this.f97092c, 10.0f), 0);
        this.f97098i.setLayoutManager(customLinearLayoutManager);
        this.f97098i.mo4798a((C1331h) kVar);
        this.f97101l = new C38134b();
        this.f97098i.setAdapter(this.f97101l);
        C38446k.m85764a(this.f97093d);
        C38446k.m85764a(this.f97095f);
        C38446k.m85764a(this.f97094e);
        this.f97095f.setOnClickListener(this);
        this.f97093d.setOnClickListener(this);
        this.f97099j.setOnClickListener(this);
        this.f97094e.setOnClickListener(this);
        this.f97097h.setOnClickListener(this);
        ((C13833a) this.f97094e.getHierarchy()).mo25902b((int) R.color.c8);
        this.f97093d.setRequestImgSize(C47788ct.m103417a(BaseNotice.HASHTAG));
    }

    /* renamed from: a */
    public final void mo78081a(BaseNotice baseNotice, boolean z, String str) {
        UserVerify userVerify;
        if (baseNotice != null && baseNotice.getDiggNotice() != null && baseNotice.getDiggNotice().getUsers() != null && baseNotice.getDiggNotice().getUsers().size() != 0) {
            super.mo78081a(baseNotice, z, str);
            mo78082a(z);
            this.f97103n = baseNotice;
            this.f97104o = str;
            mo78086a("show", "like", getAdapterPosition(), baseNotice, z, str);
            this.f97100k = baseNotice.getDiggNotice();
            List users = this.f97100k.getUsers();
            if (users != null && users.size() > 0) {
                this.f97095f.setText(((User) users.get(0)).getNickname());
            }
            if (!(this.f97100k == null || this.f97100k.getUsers() == null || this.f97100k.getUsers().size() <= 0)) {
                User user = (User) this.f97100k.getUsers().get(0);
                if (user != null) {
                    userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
                } else {
                    userVerify = null;
                }
                this.f97093d.setUserData(userVerify);
                this.f97093d.mo48964b();
                C47916gh.m103674a(this.f97093d.getContext(), userVerify, this.f97095f);
            }
            int mergeCount = this.f97100k.getMergeCount();
            int i = 1;
            if (mergeCount == 1) {
                if (this.f97100k.getDiggType() == 2) {
                    this.f97097h.setText(this.f97092c.getString(R.string.bk6));
                } else if (this.f97100k.getDiggType() == 3 || this.f97100k.getDiggType() == 6) {
                    this.f97097h.setText(this.f97092c.getString(R.string.bk5));
                } else {
                    this.f97097h.setText(this.f97092c.getString(R.string.bk7));
                }
                this.f97098i.setVisibility(8);
            } else {
                if (this.f97100k.getDiggType() == 2) {
                    this.f97097h.setText(this.f97092c.getString(R.string.bk4, new Object[]{Integer.valueOf(mergeCount)}));
                } else if (this.f97100k.getDiggType() == 3 || this.f97100k.getDiggType() == 6) {
                    this.f97097h.setText(this.f97092c.getString(R.string.ckl, new Object[]{Integer.valueOf(Math.max(mergeCount - 1, 0))}));
                } else {
                    this.f97097h.setText(this.f97092c.getString(R.string.ckm, new Object[]{Integer.valueOf(Math.max(mergeCount - 1, 0))}));
                }
                this.f97098i.setVisibility(0);
            }
            this.f97096g.setText(C47903fw.m103626c(this.f97092c, baseNotice.getCreateTime() * 1000));
            C12203q.m24645a((Object) C23608p.m57874a(this.f97100k.getAweme().getVideo().getOriginCover())).mo23125b(C47788ct.m103417a(500)).mo23118a("Notice").mo23116a((C12197k) this.f97094e).mo23121a();
            C38134b bVar = this.f97101l;
            List users2 = this.f97100k.getUsers();
            bVar.f97108a.clear();
            while (i < 6 && i < users2.size()) {
                bVar.f97108a.add(users2.get(i));
                i++;
            }
            bVar.notifyDataSetChanged();
        }
    }
}
