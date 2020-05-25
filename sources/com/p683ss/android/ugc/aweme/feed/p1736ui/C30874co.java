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
import com.bytedance.ies.abmock.C10181b;
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
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30241a;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30255o;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30256p;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.WidgetAsyncAB;
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
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.co */
public final class C30874co extends C30241a implements C0199s<C23274a> {

    /* renamed from: p */
    TextView f80847p;

    /* renamed from: q */
    View f80848q;

    /* renamed from: r */
    ImageView f80849r;

    /* renamed from: s */
    View f80850s;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.co$a */
    public class C30875a implements OnClickListener {
        public C30875a() {
        }

        public final void onClick(View view) {
            boolean z;
            ClickInstrumentation.onClick(view);
            if (C47915gg.m103651b()) {
                C10691a.m21548c(C30874co.this.f79017j, (int) R.string.a2a).mo19066a();
            } else if (C36330a.m81964a(C30874co.this.f79011d)) {
                C10691a.m21545b(C30874co.this.f79017j, C36330a.m81963a(C30874co.this.f79011d, R.string.fc_)).mo19066a();
            } else if (C30874co.this.f79011d == null || (C30874co.this.f79011d.isCanPlay() && !C30874co.this.f79011d.isDelete())) {
                C25280a.m61493a().setStartLoadTime();
                C30385i.m71299a().mo60807b(C30874co.this.f80849r, C30874co.this.f79012e, C23198ae.m56877m(C30874co.this.f79011d), C23198ae.m56846a(C30874co.this.f79011d));
                C47718bf.m103288a(new C36513a());
                if (C47950q.m103755d(C30874co.this.f79011d) && !C31190f.m72831a(C30874co.this.f79011d)) {
                    C10691a.m21542b(C30874co.this.f79017j, (int) R.string.cxz).mo19066a();
                } else if (!C31190f.m72831a(C30874co.this.f79011d) && C47950q.m103754c(C30874co.this.f79011d) && !C47950q.m103756e(C30874co.this.f79011d)) {
                    C10691a.m21542b(C30874co.this.f79017j, (int) R.string.ffs).mo19066a();
                } else if (C30874co.this.f79011d == null || C30874co.this.f79011d.getVideoControl() == null || C30874co.this.f79011d.getVideoControl().timerStatus != 0) {
                    C30874co coVar = C30874co.this;
                    if (coVar.f79011d == null || coVar.f79011d.getStatus() == null || !coVar.f79011d.getStatus().isAllowComment()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z || C26503d.m64060c(C30874co.this.f79011d)) {
                        C30874co.this.f79016i.mo48228a("video_comment_list", (Object) Integer.valueOf(7));
                    } else if (!C26503d.m64060c(C30874co.this.f79011d)) {
                        C10691a.m21542b(C30874co.this.f79017j, (int) R.string.wa).mo19066a();
                    }
                    if (C23198ae.m56870i(C30874co.this.f79012e) && C26503d.m64061d(C30874co.this.f79011d)) {
                        C25945k.m62911b().mo53141e(C30874co.this.f79017j, C30874co.this.f79011d);
                    }
                } else {
                    C10691a.m21548c(C30874co.this.f79017j, (int) R.string.fba).mo19066a();
                }
            } else if (C30874co.this.f79011d.isImage()) {
                C10691a.m21542b(C30874co.this.f79017j, (int) R.string.bqo).mo19066a();
            } else {
                C10691a.m21542b(C30874co.this.f79017j, (int) R.string.fc_).mo19066a();
            }
        }
    }

    /* renamed from: e */
    public final void mo60599e() {
        C47718bf.m103291d(this);
    }

    /* renamed from: a */
    public final boolean mo60589a(C23274a aVar) {
        if (!aVar.f62242a.equals("video_open_comment_dialog")) {
            return false;
        }
        if (!(this.f79011d == null || this.f79019l == null || this.f80850s == null)) {
            this.f80850s.callOnClick();
        }
        return true;
    }

    /* renamed from: j */
    private void m72303j() {
        m72302c(null);
    }

    /* renamed from: k */
    private static String m72304k() {
        if (VideoInteractionExperiment.NEED_SHOW_TEXT) {
            return VideoInteractionExperiment.DEFAULT_COMMENT_TEXT;
        }
        return "0";
    }

    /* renamed from: a */
    public final void mo60587a(VideoItemParams videoItemParams) {
        super.mo60587a(videoItemParams);
    }

    /* renamed from: a */
    private String m72301a(long j) {
        if (j <= 0) {
            return m72304k();
        }
        return C33095b.m76068a(j);
    }

    public C30874co(View view) {
        super(view, C10181b.m20511a().mo18172a(WidgetAsyncAB.class, true, "widget_open", 31744, false));
        C47718bf.m103290c(this);
    }

    /* renamed from: e */
    public final void mo60600e(C23274a aVar) {
        if (aVar != null) {
            C30255o.f79039a.mo60617a(new C30256p(false, new C30876cp(this, aVar.f62242a)));
        }
    }

    @C53771m
    public final void onCommentEvent(C25064a aVar) {
        int i = aVar.f66393a;
        if (i == 3 || i == 4 || i == 8) {
            Object[] objArr = (Object[]) aVar.f66394b;
            if (objArr != null && objArr.length == 2) {
                m72303j();
            }
        }
    }

    @C53771m
    public final void onVideoEvent(C30332aw awVar) {
        if (awVar != null && 14 == awVar.f79228a) {
            if (C9431p.m18665a(this.f79011d.getAid(), (String) awVar.f79229b)) {
                m72303j();
            }
        }
    }

    /* renamed from: a */
    private static long m72300a(Aweme aweme) {
        if (aweme == null) {
            return 0;
        }
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics == null) {
            return 0;
        }
        long commentCount = statistics.getCommentCount();
        if (aweme.getAdCommentStruct() != null && commentCount > 0) {
            commentCount++;
        }
        return commentCount;
    }

    /* renamed from: b */
    public final C23274a mo60590b(C23274a aVar) {
        if (aVar == null) {
            return null;
        }
        super.mo60590b(aVar);
        if (!aVar.f62242a.equals("video_params")) {
            return null;
        }
        HashMap hashMap = new HashMap();
        C23274a aVar2 = new C23274a("ui_state", hashMap);
        hashMap.put("aweme_state", this.f79011d);
        hashMap.put("isInActivityState", Boolean.valueOf(C31357a.m73095a()));
        hashMap.put("adViewControllerState", ((VideoItemParams) aVar.mo48246a()).mAdViewController);
        return aVar2;
    }

    /* renamed from: c */
    private void m72302c(Map<String, Object> map) {
        Aweme aweme;
        long j;
        if (map != null) {
            aweme = (Aweme) map.get("aweme_state");
        } else {
            aweme = this.f79011d;
        }
        if (aweme == null || !aweme.isDelete()) {
            this.f80847p.setVisibility(0);
            this.f80848q.setVisibility(0);
            long j2 = 0;
            if (C41626j.m91502b(aweme) || C36330a.m81964a(aweme)) {
                j = 0;
            } else {
                j = m72300a(aweme);
            }
            if (C25280a.m61493a().buildCommentStruct(aweme) != null) {
                j = m72299a(1, aweme);
            }
            if (j >= 0) {
                j2 = j;
            }
            try {
                this.f80847p.setText(m72301a(j2));
            } catch (Exception e) {
                C32458a.m75148a((Throwable) e);
                this.f80847p.setText("0");
            }
        } else {
            this.f80847p.setVisibility(4);
        }
    }

    /* renamed from: a */
    public final void mo60585a(View view) {
        this.f79019l = ((X2CItemFeed) C35857a.m81002b(X2CItemFeed.class)).getView(this.f79017j, R.layout.b6o);
        this.f80850s = this.f79019l.findViewById(R.id.xn);
        if (this.f80850s == null) {
            this.f79019l = C35914e.m81075a(getClass().getName(), this.f79019l, this.f79017j, R.layout.b6o);
            this.f80850s = this.f79019l.findViewById(R.id.xn);
        }
        this.f80847p = (TextView) this.f79019l.findViewById(R.id.x3);
        this.f80848q = this.f79019l.findViewById(R.id.x2);
        this.f80849r = (ImageView) this.f79019l.findViewById(R.id.x9);
        this.f80850s.setOnClickListener(new C30875a());
        this.f80847p.setOnClickListener(new C30875a());
        this.f80848q.setOnClickListener(new C30875a());
        this.f80848q.setOnTouchListener(C23729p.m58253a());
    }

    /* renamed from: a */
    public final void mo60586a(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.mo48226a("show_festival_activity_icon", (C0199s<C23274a>) this.f79009b).mo48226a("video_open_comment_dialog", (C0199s<C23274a>) this.f79009b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0041  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo63613a(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            r1 = -213371911(0xfffffffff34833f9, float:-1.5861717E31)
            if (r0 == r1) goto L_0x0028
            r1 = 281945252(0x10ce24a4, float:8.130913E-29)
            if (r0 == r1) goto L_0x001e
            r1 = 350216171(0x14dfdfeb, float:2.2605566E-26)
            if (r0 == r1) goto L_0x0014
            goto L_0x0032
        L_0x0014:
            java.lang.String r0 = "on_page_selected"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0032
            r0 = 0
            goto L_0x0033
        L_0x001e:
            java.lang.String r0 = "show_festival_activity_icon"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0032
            r0 = 1
            goto L_0x0033
        L_0x0028:
            java.lang.String r0 = "video_open_comment_dialog"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0032
            r0 = 2
            goto L_0x0033
        L_0x0032:
            r0 = -1
        L_0x0033:
            switch(r0) {
                case 0: goto L_0x0041;
                case 1: goto L_0x0041;
                case 2: goto L_0x0037;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x005f
        L_0x0037:
            android.view.View r3 = r2.f80850s
            if (r3 == 0) goto L_0x005f
            android.view.View r3 = r2.f80850s
            r3.callOnClick()
            goto L_0x005f
        L_0x0041:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "show_festival_activity_icon"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x005b
            java.lang.String r3 = "isInActivityState"
            boolean r1 = com.p683ss.android.ugc.aweme.festival.christmas.C31357a.m73095a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.put(r3, r1)
        L_0x005b:
            r2.mo60588a(r0)
            return
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.C30874co.mo63613a(java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo60588a(Map<String, Object> map) {
        if (map != null) {
            if (!((Boolean) map.get("isInActivityState")).booleanValue()) {
                return;
            }
        } else if (!C31357a.m73095a()) {
            return;
        }
        this.f80849r.setImageDrawable(C0726c.m2091a(this.f79017j, (int) R.drawable.df7));
    }

    /* renamed from: a */
    private static long m72299a(int i, Aweme aweme) {
        if (aweme == null) {
            return 0;
        }
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics == null) {
            return 0;
        }
        return statistics.getCommentCount() + 1;
    }

    /* renamed from: a */
    public final void mo60584a(int i, C23274a aVar) {
        int i2;
        if (!this.f79010c) {
            this.f79010c = true;
            if (this.f79018k instanceof FrameLayout) {
                ((FrameLayout) this.f79018k).addView(this.f79019l);
            }
        }
        if (aVar != null) {
            HashMap hashMap = (HashMap) aVar.mo48246a();
            Aweme aweme = (Aweme) hashMap.get("aweme_state");
            if (aweme != null) {
                C31208r.m72879a(aweme, this.f79018k, true, true);
                mo60588a((Map<String, Object>) hashMap);
                m72302c(hashMap);
                if (hashMap.get("adViewControllerState") != null) {
                    C25908e eVar = (C25908e) hashMap.get("adViewControllerState");
                    if (eVar != null) {
                        if (eVar.mo53244a() || !C26503d.m64059b(aweme)) {
                            TextView textView = this.f80847p;
                            if (!eVar.mo53249e() || C26503d.m64060c(aweme)) {
                                i2 = 4;
                            } else {
                                i2 = 0;
                            }
                            textView.setVisibility(i2);
                        }
                        if (aweme != null && aweme.isDelete()) {
                            this.f80847p.setVisibility(4);
                        }
                    }
                }
            }
        }
    }
}
