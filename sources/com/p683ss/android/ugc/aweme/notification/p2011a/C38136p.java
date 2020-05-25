package com.p683ss.android.ugc.aweme.notification.p2011a;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38106s;
import com.p683ss.android.ugc.aweme.notification.newstyle.C38415g;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38383h;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38389i;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.a.p */
public final class C38136p extends C38383h implements OnClickListener {

    /* renamed from: d */
    private final View f97111d;

    /* renamed from: e */
    private final View f97112e;

    /* renamed from: f */
    private final AvatarImageWithVerify f97113f;

    /* renamed from: g */
    private final AvatarImageView f97114g;

    /* renamed from: m */
    private final AvatarImageView f97115m;

    /* renamed from: n */
    private final TextView f97116n;

    /* renamed from: o */
    private final TextView f97117o;

    /* renamed from: p */
    private final RemoteImageView f97118p;

    /* renamed from: q */
    private C38106s f97119q;

    /* renamed from: r */
    private boolean f97120r = true;

    /* renamed from: s */
    private BaseNotice f97121s;

    public C38136p(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.bu1);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f97111d = findViewById;
        View findViewById2 = view.findViewById(R.id.bt7);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f97112e = findViewById2;
        View findViewById3 = view.findViewById(R.id.bt8);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.…notification_head_single)");
        this.f97113f = (AvatarImageWithVerify) findViewById3;
        View findViewById4 = view.findViewById(R.id.bt9);
        C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.….notification_head_user1)");
        this.f97114g = (AvatarImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.bt_);
        C52711k.m112236a((Object) findViewById5, "itemView.findViewById(R.….notification_head_user2)");
        this.f97115m = (AvatarImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.bto);
        C52711k.m112236a((Object) findViewById6, "itemView.findViewById(R.id.notification_name)");
        this.f97116n = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.bsc);
        C52711k.m112236a((Object) findViewById7, "itemView.findViewById(R.id.notification_content)");
        this.f97117o = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.bsd);
        C52711k.m112236a((Object) findViewById8, "itemView.findViewById(R.id.notification_cover)");
        this.f97118p = (RemoteImageView) findViewById8;
        C38415g.m85729b(this.f97111d);
        C38446k.m85764a(this.f97112e);
        C38446k.m85764a(this.f97118p);
        OnClickListener onClickListener = this;
        this.f97111d.setOnClickListener(onClickListener);
        this.f97112e.setOnClickListener(onClickListener);
        this.f97113f.setOnClickListener(onClickListener);
        this.f97118p.setOnClickListener(onClickListener);
        ((C13833a) this.f97118p.getHierarchy()).mo25902b((int) R.color.c8);
        C38415g.m85728a((View) this.f97118p);
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        if (!C38137q.m85243a(C11010c.m22280a())) {
            C10691a.m21542b(this.f97110c, (int) R.string.cg1).mo19066a();
            return;
        }
        C38106s sVar = this.f97119q;
        if (sVar != null) {
            if (view != null) {
                num = Integer.valueOf(view.getId());
            } else {
                num = null;
            }
            if ((num != null && num.intValue() == R.id.bsd) || ((num != null && num.intValue() == R.id.bt7) || (num != null && num.intValue() == R.id.bu1))) {
                String str = sVar.f96959g;
                m85236a("pollsticker", getLayoutPosition());
                C41302w.m91042a().mo83861a(C41311y.m91065a(str).mo83870a("refer", "message").mo83871a());
            } else {
                if (num != null && num.intValue() == R.id.bt8) {
                    List<? extends User> list = sVar.f96953a;
                    if (list != null) {
                        User user = (User) C52575l.m112140f(list);
                        if (user != null) {
                            String uid = user.getUid();
                            if (uid != null) {
                                List<? extends User> list2 = sVar.f96953a;
                                if (list2 != null) {
                                    User user2 = (User) C52575l.m112140f(list2);
                                    if (user2 != null) {
                                        String secUid = user2.getSecUid();
                                        if (secUid != null) {
                                            C38383h.m85681a((C38383h) this, uid, secUid, this.f97121s, false, (String) null, 24, (Object) null);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo78110a(BaseNotice baseNotice, boolean z, boolean z2, String str, String str2) {
        String str3;
        BaseNotice baseNotice2 = baseNotice;
        C52711k.m112240b(baseNotice2, "notice");
        C52711k.m112240b(str2, "enterFrom");
        if (baseNotice.getVoteNotice() != null) {
            this.f97121s = baseNotice2;
            this.f97120r = z2;
            this.f97119q = baseNotice.getVoteNotice();
            C38106s sVar = this.f97119q;
            if (sVar != null) {
                List<? extends User> list = sVar.f96953a;
                if (list != null) {
                    int size = list.size();
                    if (size > 0) {
                        mo78304a(this.f97116n, list, 3, sVar.f96956d, this.f97121s, z2, str, str2);
                        if (size == 1) {
                            this.f97113f.setVisibility(0);
                            this.f97114g.setVisibility(8);
                            this.f97115m.setVisibility(8);
                            UserVerify userVerify = new UserVerify(((User) list.get(0)).getAvatarThumb(), ((User) list.get(0)).getCustomVerify(), ((User) list.get(0)).getEnterpriseVerifyReason(), Integer.valueOf(((User) list.get(0)).getVerificationType()), ((User) list.get(0)).getWeiboVerify());
                            this.f97113f.setUserData(userVerify);
                            this.f97112e.setVisibility(8);
                            this.f97113f.mo48964b();
                        } else {
                            this.f97112e.setVisibility(0);
                            this.f97113f.setVisibility(8);
                            this.f97114g.setVisibility(0);
                            this.f97115m.setVisibility(0);
                            C23515d.m57669a((RemoteImageView) this.f97114g, ((User) list.get(0)).getAvatarThumb());
                            C23515d.m57669a((RemoteImageView) this.f97115m, ((User) list.get(1)).getAvatarThumb());
                        }
                        if (size == 1) {
                            str3 = this.f97110c.getString(R.string.fd7, new Object[]{sVar.f96955c});
                        } else {
                            str3 = this.f97110c.getString(R.string.fd5);
                        }
                        C38389i.m85696a(this.f97117o, new SpannableStringBuilder(str3), baseNotice2, 7, C9432q.m18670a(this.f97110c) - ((int) C9432q.m18687b(this.f97110c, 148.0f)));
                        C23515d.m57669a(this.f97118p, sVar.f96954b);
                    }
                }
            }
        }
    }
}
