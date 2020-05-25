package com.p683ss.android.ugc.aweme.notification.newstyle.p2029f;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtButton;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.facebook.common.p927k.C13731f;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoInfo;
import com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoResp;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p683ss.android.ugc.aweme.notification.tutorialvideo.TutorialVideoViewModel;
import com.p683ss.android.ugc.aweme.notification.util.C38432d;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.notification.util.NotificationBoldSpan;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.al */
public final class C38363al extends C38383h implements OnClickListener {

    /* renamed from: d */
    private final View f97619d;

    /* renamed from: e */
    private final AvatarImageView f97620e;

    /* renamed from: f */
    private final DmtTextView f97621f;

    /* renamed from: g */
    private final DmtButton f97622g;

    /* renamed from: m */
    private TutorialVideoInfo f97623m;

    /* renamed from: n */
    private TutorialVideoViewModel f97624n;

    /* renamed from: o */
    private Context f97625o;

    /* renamed from: p */
    private String f97626p = "";

    /* renamed from: a */
    public final boolean mo78083a() {
        return false;
    }

    /* renamed from: c */
    public final int mo78097c() {
        return R.id.bu1;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!C38364am.m85661a(C11010c.m22280a())) {
            C10691a.m21542b(this.f97110c, (int) R.string.cg1).mo19066a();
            return;
        }
        if (!TextUtils.isEmpty(this.f97626p)) {
            TutorialVideoViewModel tutorialVideoViewModel = this.f97624n;
            if (tutorialVideoViewModel != null) {
                tutorialVideoViewModel.mo78321a(2);
            }
            C41302w a = C41302w.m91042a();
            StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
            sb.append(this.f97626p);
            a.mo83861a(C41311y.m91065a(sb.toString()).mo83870a("refer", "fans").mo83871a());
            m85657b("enter_teach_video", this.f97626p);
        }
    }

    public C38363al(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.bu1);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f97619d = findViewById;
        View findViewById2 = view.findViewById(R.id.bt7);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f97620e = (AvatarImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.bsc);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.notification_content)");
        this.f97621f = (DmtTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.bs3);
        C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.notification_button)");
        this.f97622g = (DmtButton) findViewById4;
        C38432d.m85745a(this.f97619d);
        C38446k.m85764a(this.f97620e);
        C38446k.m85764a(this.f97622g);
        OnClickListener onClickListener = this;
        this.f97622g.setOnClickListener(onClickListener);
        this.f97619d.setOnClickListener(onClickListener);
        this.f97620e.setOnClickListener(onClickListener);
        this.f97622g.getLayoutParams().width = C38432d.m85744a(this.f97110c);
        this.f97624n = new TutorialVideoViewModel();
        Context context = view.getContext();
        C52711k.m112236a((Object) context, "itemView.context");
        this.f97625o = context;
    }

    /* renamed from: b */
    private static void m85657b(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            C26890h.m65011a(str, C23089d.m56640a().mo47829a("group_id", str2).f61491a);
        }
    }

    /* renamed from: a */
    public final void mo78295a(MusNotice musNotice, boolean z) {
        C52711k.m112240b(musNotice, "notice");
        TutorialVideoResp tutorialVideo = musNotice.getTutorialVideo();
        if (tutorialVideo != null) {
            TutorialVideoInfo info = tutorialVideo.getInfo();
            if (info != null) {
                this.f97623m = info;
                TutorialVideoInfo tutorialVideoInfo = this.f97623m;
                if (tutorialVideoInfo != null) {
                    this.f97626p = tutorialVideoInfo.getAwemeId();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(tutorialVideoInfo.getTitle());
                    spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.append(" ");
                    spannableStringBuilder.append(tutorialVideoInfo.getContent());
                    this.f97621f.setText(spannableStringBuilder);
                    this.f97620e.setImageURI(C13731f.m27775a((int) R.drawable.clm));
                    this.f97622g.setText(tutorialVideoInfo.getButton());
                }
                m85657b("show_teach_video", this.f97626p);
            }
        }
    }
}
