package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.arch.lifecycle.C0199s;
import android.support.p030v4.content.C0726c;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.comment.p1516a.C25064a;
import com.p683ss.android.ugc.aweme.comment.services.CommentService.C25280a;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25908e;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.feed.experiment.VideoInteractionExperiment;
import com.p683ss.android.ugc.aweme.feed.helper.C30385i;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p683ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.feed.utils.C31208r;
import com.p683ss.android.ugc.aweme.festival.christmas.C31357a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.inflate.C35914e;
import com.p683ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p683ss.android.ugc.aweme.login.utils.C36330a;
import com.p683ss.android.ugc.aweme.main.p1938b.C36513a;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.setting.C41626j;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.C47950q;
import com.ss.android.ugc.trill.R;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.cq */
public final class C30877cq extends C31009h implements C0199s<C23274a> {

    /* renamed from: a */
    TextView f80854a;

    /* renamed from: b */
    View f80855b;

    /* renamed from: c */
    ImageView f80856c;

    /* renamed from: d */
    View f80857d;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.cq$a */
    public class C30878a implements OnClickListener {
        public C30878a() {
        }

        public final void onClick(View view) {
            boolean z;
            ClickInstrumentation.onClick(view);
            if (C47915gg.m103651b()) {
                C10691a.m21548c(C30877cq.this.f81198r, (int) R.string.a2a).mo19066a();
            } else if (C36330a.m81964a(C30877cq.this.f81192l)) {
                C10691a.m21545b(C30877cq.this.f81198r, C36330a.m81963a(C30877cq.this.f81192l, R.string.fc_)).mo19066a();
            } else if (C30877cq.this.f81192l == null || (C30877cq.this.f81192l.isCanPlay() && !C30877cq.this.f81192l.isDelete())) {
                C25280a.m61493a().setStartLoadTime();
                C30385i.m71299a().mo60807b(C30877cq.this.f80856c, C30877cq.this.f81193m, C23198ae.m56877m(C30877cq.this.f81192l), C23198ae.m56846a(C30877cq.this.f81192l));
                C47718bf.m103288a(new C36513a());
                if (C47950q.m103755d(C30877cq.this.f81192l) && !C31190f.m72831a(C30877cq.this.f81192l)) {
                    C10691a.m21542b(C30877cq.this.f81198r, (int) R.string.cxz).mo19066a();
                } else if (!C31190f.m72831a(C30877cq.this.f81192l) && C47950q.m103754c(C30877cq.this.f81192l) && !C47950q.m103756e(C30877cq.this.f81192l)) {
                    C10691a.m21542b(C30877cq.this.f81198r, (int) R.string.ffs).mo19066a();
                } else if (C30877cq.this.f81192l == null || C30877cq.this.f81192l.getVideoControl() == null || C30877cq.this.f81192l.getVideoControl().timerStatus != 0) {
                    C30877cq cqVar = C30877cq.this;
                    if (cqVar.f81192l == null || cqVar.f81192l.getStatus() == null || !cqVar.f81192l.getStatus().isAllowComment()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z || C26503d.m64060c(C30877cq.this.f81192l)) {
                        C30877cq.this.f81197q.mo48228a("video_comment_list", (Object) Integer.valueOf(7));
                    } else if (!C26503d.m64060c(C30877cq.this.f81192l)) {
                        C10691a.m21542b(C30877cq.this.f81198r, (int) R.string.wa).mo19066a();
                    }
                    if (C23198ae.m56870i(C30877cq.this.f81193m) && C26503d.m64061d(C30877cq.this.f81192l)) {
                        C25945k.m62911b().mo53141e(C30877cq.this.f81198r, C30877cq.this.f81192l);
                    }
                } else {
                    C10691a.m21548c(C30877cq.this.f81198r, (int) R.string.fba).mo19066a();
                }
            } else if (C30877cq.this.f81192l.isImage()) {
                C10691a.m21542b(C30877cq.this.f81198r, (int) R.string.bqo).mo19066a();
            } else {
                C10691a.m21542b(C30877cq.this.f81198r, (int) R.string.fc_).mo19066a();
            }
        }
    }

    /* renamed from: a */
    public final void mo49781a() {
        C47718bf.m103291d(this);
    }

    /* renamed from: e */
    private static String m72318e() {
        if (VideoInteractionExperiment.NEED_SHOW_TEXT) {
            return VideoInteractionExperiment.DEFAULT_COMMENT_TEXT;
        }
        return "0";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo63420b() {
        if (C31357a.m73095a()) {
            this.f80856c.setImageDrawable(C0726c.m2091a(this.f81198r, (int) R.drawable.df7));
        }
    }

    /* renamed from: j */
    private long m72319j() {
        if (this.f81192l == null) {
            return 0;
        }
        AwemeStatistics statistics = this.f81192l.getStatistics();
        if (statistics == null) {
            return 0;
        }
        long commentCount = statistics.getCommentCount();
        if (this.f81192l.getAdCommentStruct() != null && commentCount > 0) {
            commentCount++;
        }
        return commentCount;
    }

    /* renamed from: d */
    private void m72317d() {
        long j;
        Aweme aweme = this.f81192l;
        if (aweme == null || !aweme.isDelete()) {
            this.f80854a.setVisibility(0);
            this.f80855b.setVisibility(0);
            if (C41626j.m91502b(aweme) || C36330a.m81964a(aweme)) {
                j = 0;
            } else {
                j = m72319j();
            }
            if (C25280a.m61493a().buildCommentStruct(this.f81192l) != null) {
                j = m72315a(1);
            }
            if (j < 0) {
                j = 0;
            }
            try {
                this.f80854a.setText(m72316a(j));
            } catch (Exception e) {
                C32458a.m75148a((Throwable) e);
                this.f80854a.setText("0");
            }
        } else {
            this.f80854a.setVisibility(4);
        }
    }

    public C30877cq(View view) {
        super(view);
        C47718bf.m103290c(this);
    }

    /* renamed from: a */
    private String m72316a(long j) {
        if (j <= 0) {
            return m72318e();
        }
        return C33095b.m76068a(j);
    }

    /* renamed from: a */
    private long m72315a(int i) {
        if (this.f81192l == null) {
            return 0;
        }
        AwemeStatistics statistics = this.f81192l.getStatistics();
        if (statistics == null) {
            return 0;
        }
        return statistics.getCommentCount() + 1;
    }

    @C53771m
    public final void onCommentEvent(C25064a aVar) {
        int i = aVar.f66393a;
        if (i == 3 || i == 4 || i == 8) {
            Object[] objArr = (Object[]) aVar.f66394b;
            if (objArr != null && objArr.length == 2) {
                m72317d();
            }
        }
    }

    @C53771m
    public final void onVideoEvent(C30332aw awVar) {
        if (awVar != null && 14 == awVar.f79228a) {
            if (C9431p.m18665a(this.f81192l.getAid(), (String) awVar.f79229b)) {
                m72317d();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49784a(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.mo48226a("show_festival_activity_icon", (C0199s<C23274a>) this).mo48226a("video_open_comment_dialog", (C0199s<C23274a>) this);
        }
    }

    /* renamed from: a */
    public final void mo58323a(VideoItemParams videoItemParams) {
        int i;
        super.mo58323a(videoItemParams);
        C31208r.m72879a(this.f81192l, this.f81199s, true, true);
        mo63420b();
        m72317d();
        if (videoItemParams != null) {
            C25908e eVar = videoItemParams.mAdViewController;
            if (eVar != null) {
                if (eVar.mo53244a() || !C26503d.m64059b(this.f81192l)) {
                    TextView textView = this.f80854a;
                    if (!eVar.mo53249e() || C26503d.m64060c(this.f81192l)) {
                        i = 4;
                    } else {
                        i = 0;
                    }
                    textView.setVisibility(i);
                }
                if (this.f81192l != null && this.f81192l.isDelete()) {
                    this.f80854a.setVisibility(4);
                }
            }
        }
    }

    public final /* synthetic */ void onChanged(Object obj) {
        C23274a aVar = (C23274a) obj;
        if (aVar != null) {
            String str = aVar.f62242a;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -213371911) {
                if (hashCode != 281945252) {
                    if (hashCode == 350216171 && str.equals("on_page_selected")) {
                        c = 0;
                    }
                } else if (str.equals("show_festival_activity_icon")) {
                    c = 1;
                }
            } else if (str.equals("video_open_comment_dialog")) {
                c = 2;
            }
            switch (c) {
                case 0:
                case 1:
                    mo63420b();
                    return;
                case 2:
                    if (this.f80857d != null) {
                        this.f80857d.callOnClick();
                        break;
                    }
                    break;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49783a(View view) {
        View view2 = ((X2CItemFeed) C35857a.m81002b(X2CItemFeed.class)).getView(this.f81198r, R.layout.b6o);
        this.f80857d = view2.findViewById(R.id.xn);
        if (this.f80857d == null) {
            view2 = C35914e.m81075a(getClass().getName(), view2, this.f81198r, R.layout.b6o);
            this.f80857d = view2.findViewById(R.id.xn);
        }
        this.f80854a = (TextView) view2.findViewById(R.id.x3);
        this.f80855b = view2.findViewById(R.id.x2);
        this.f80856c = (ImageView) view2.findViewById(R.id.x9);
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(view2);
        }
        this.f80857d.setOnClickListener(new C30878a());
        this.f80854a.setOnClickListener(new C30878a());
        this.f80855b.setOnClickListener(new C30878a());
        this.f80855b.setOnTouchListener(C23729p.m58253a());
    }
}
