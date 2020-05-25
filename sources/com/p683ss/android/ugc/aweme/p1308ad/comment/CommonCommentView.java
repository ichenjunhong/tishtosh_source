package com.p683ss.android.ugc.aweme.p1308ad.comment;

import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.support.p030v4.content.C0726c;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p940f.C13837e;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.CircleImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.commercialize.model.C26138s;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.p1308ad.comment.AdCommentReportBubbleView.C22333a;
import com.p683ss.android.ugc.aweme.p1308ad.p1309a.C22317a;
import com.p683ss.android.ugc.aweme.p1308ad.p1309a.C22319b;
import com.p683ss.android.ugc.aweme.p1308ad.p1309a.C22323f;
import com.p683ss.android.ugc.aweme.p1308ad.p1310b.C22328b;
import com.p683ss.android.ugc.aweme.poi.widget.C39481c;
import com.ss.android.ugc.trill.R;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.ad.comment.CommonCommentView */
public final class CommonCommentView extends LinearLayout implements C0199s<C23274a>, OnClickListener {

    /* renamed from: a */
    public C26138s f60166a;

    /* renamed from: b */
    public Aweme f60167b;

    /* renamed from: c */
    public C39481c f60168c;

    /* renamed from: d */
    public C22328b f60169d;

    /* renamed from: e */
    private CircleImageView f60170e;

    /* renamed from: f */
    private DmtTextView f60171f;

    /* renamed from: g */
    private DmtTextView f60172g;

    /* renamed from: h */
    private DmtTextView f60173h;

    /* renamed from: i */
    private DmtTextView f60174i;

    /* renamed from: j */
    private DmtTextView f60175j;

    /* renamed from: k */
    private boolean f60176k;

    /* renamed from: l */
    private DataCenter f60177l;

    /* renamed from: m */
    private final float f60178m;

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.CommonCommentView$a */
    public static final class C22339a implements C22333a {

        /* renamed from: a */
        final /* synthetic */ CommonCommentView f60179a;

        /* renamed from: a */
        public final void mo46489a() {
            C39481c cVar = this.f60179a.f60168c;
            if (cVar != null) {
                cVar.mo80495b();
            }
            C22328b bVar = this.f60179a.f60169d;
            if (bVar != null) {
                bVar.mo46466a(true);
            }
        }

        /* renamed from: b */
        public final void mo46490b() {
            String str;
            C22317a a = C22317a.m55223a();
            C52711k.m112236a((Object) a, "AdDependManager.inst()");
            C22323f fVar = a.f60117d;
            Context context = this.f60179a.getContext();
            C22317a a2 = C22317a.m55223a();
            C52711k.m112236a((Object) a2, "AdDependManager.inst()");
            C22319b bVar = a2.f60115b;
            C52711k.m112236a((Object) bVar, "AdDependManager.inst().abOrSettingDepend");
            String a3 = bVar.mo46423a();
            C26138s sVar = this.f60179a.f60166a;
            if (sVar != null) {
                str = sVar.webUrl;
            } else {
                str = null;
            }
            fVar.mo46457a(context, a3, str);
            this.f60179a.mo46500a("comment_ad", "otherclick", "plan");
        }

        /* renamed from: c */
        public final void mo46491c() {
            String str;
            C22317a a = C22317a.m55223a();
            C52711k.m112236a((Object) a, "AdDependManager.inst()");
            C22323f fVar = a.f60117d;
            Context context = this.f60179a.getContext();
            Aweme aweme = this.f60179a.f60167b;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            fVar.mo46456a(context, str);
        }

        C22339a(CommonCommentView commonCommentView) {
            this.f60179a = commonCommentView;
        }
    }

    public CommonCommentView(Context context) {
        this(context, null, 0, 6, null);
    }

    /* renamed from: j */
    private final void m55331j() {
        m55329h();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m55331j();
    }

    /* renamed from: i */
    private final void m55330i() {
        m55331j();
        if (!m55329h() || !this.f60176k) {
        }
    }

    /* renamed from: a */
    private final void m55321a() {
        m55323b();
        m55324c();
        m55325d();
        m55326e();
        m55327f();
        m55330i();
    }

    /* renamed from: d */
    private final void m55325d() {
        String str;
        DmtTextView dmtTextView = this.f60172g;
        if (dmtTextView != null) {
            C26138s sVar = this.f60166a;
            if (sVar != null) {
                str = sVar.title;
            } else {
                str = null;
            }
            dmtTextView.setText(str);
        }
    }

    /* renamed from: e */
    private final void m55326e() {
        String str;
        DmtTextView dmtTextView = this.f60173h;
        if (dmtTextView != null) {
            C26138s sVar = this.f60166a;
            if (sVar != null) {
                str = sVar.tipsText;
            } else {
                str = null;
            }
            dmtTextView.setText(str);
        }
    }

    /* renamed from: f */
    private final void m55327f() {
        String str;
        DmtTextView dmtTextView = this.f60174i;
        if (dmtTextView != null) {
            C26138s sVar = this.f60166a;
            if (sVar != null) {
                str = sVar.buttonText;
            } else {
                str = null;
            }
            dmtTextView.setText(str);
        }
        C38446k.m85764a(this.f60174i);
    }

    /* renamed from: g */
    private final void m55328g() {
        C22317a a = C22317a.m55223a();
        C52711k.m112236a((Object) a, "AdDependManager.inst()");
        a.f60117d.mo46453a(getContext(), this.f60166a, this.f60167b);
    }

    /* renamed from: b */
    private final void m55323b() {
        String str;
        DmtTextView dmtTextView = this.f60171f;
        if (dmtTextView != null) {
            C26138s sVar = this.f60166a;
            if (sVar != null) {
                str = sVar.source;
            } else {
                str = null;
            }
            dmtTextView.setText(str);
        }
        DmtTextView dmtTextView2 = this.f60171f;
        if (dmtTextView2 != null) {
            dmtTextView2.setFontType(C10751d.f28903b);
        }
        DmtTextView dmtTextView3 = this.f60171f;
        if (dmtTextView3 != null) {
            TextPaint paint = dmtTextView3.getPaint();
            if (paint != null) {
                paint.setFakeBoldText(true);
            }
        }
    }

    /* renamed from: h */
    private final boolean m55329h() {
        CharSequence charSequence;
        C26138s sVar = this.f60166a;
        String str = null;
        if (sVar != null) {
            charSequence = sVar.downloadUrl;
        } else {
            charSequence = null;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            C26138s sVar2 = this.f60166a;
            if (sVar2 != null) {
                str = sVar2.type;
            }
            if (TextUtils.equals(str, "app")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private final void m55324c() {
        UrlModel urlModel;
        CircleImageView circleImageView = this.f60170e;
        if (circleImageView != null) {
            C13833a aVar = (C13833a) circleImageView.getHierarchy();
            if (aVar != null) {
                C13837e eVar = aVar.f36079a;
                if (eVar != null) {
                    eVar.mo25939c((float) C23728o.m58241a(0.5d));
                }
            }
        }
        CircleImageView circleImageView2 = this.f60170e;
        if (circleImageView2 != null) {
            C13833a aVar2 = (C13833a) circleImageView2.getHierarchy();
            if (aVar2 != null) {
                C13837e eVar2 = aVar2.f36079a;
                if (eVar2 != null) {
                    eVar2.mo25938b(C0726c.m2098c(getContext(), R.color.j5));
                }
            }
        }
        RemoteImageView remoteImageView = this.f60170e;
        C26138s sVar = this.f60166a;
        if (sVar != null) {
            urlModel = sVar.avatarIcon;
        } else {
            urlModel = null;
        }
        C23515d.m57669a(remoteImageView, urlModel);
    }

    public final void setOnDislikeCommentAdListener(C22328b bVar) {
        C52711k.m112240b(bVar, "dislikeCommentAdListener");
        this.f60169d = bVar;
    }

    public final void setDataCenter(DataCenter dataCenter) {
        this.f60177l = dataCenter;
        if (dataCenter != null) {
            C0199s sVar = this;
            dataCenter.mo48227a("comment_aweme_and_link", sVar, true).mo48227a("comment_dialog_state", sVar, true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C23274a aVar) {
        if (aVar != null) {
            String str = aVar.f62242a;
            int hashCode = str.hashCode();
            if (hashCode != -2103039046) {
                if (hashCode == 1823087802 && str.equals("comment_dialog_state")) {
                    Object obj = (Integer) aVar.mo48246a();
                    if (obj == null) {
                        obj = Boolean.valueOf(false);
                    }
                    if (C52711k.m112239a(obj, (Object) Integer.valueOf(5))) {
                        C39481c cVar = this.f60168c;
                        if (cVar != null) {
                            cVar.mo80495b();
                        }
                    } else if (C52711k.m112239a(obj, (Object) Integer.valueOf(3))) {
                        C39481c cVar2 = this.f60168c;
                        if (cVar2 != null) {
                            cVar2.mo80495b();
                        }
                    } else if (C52711k.m112239a(obj, (Object) Integer.valueOf(6))) {
                        C39481c cVar3 = this.f60168c;
                        if (cVar3 != null) {
                            cVar3.mo80495b();
                        }
                    } else if (C52711k.m112239a(obj, (Object) Integer.valueOf(7))) {
                        m55330i();
                    } else if (C52711k.m112239a(obj, (Object) Integer.valueOf(8))) {
                        m55331j();
                    }
                }
            } else if (str.equals("comment_aweme_and_link")) {
                C52847n nVar = (C52847n) aVar.mo48246a();
                if (nVar != null) {
                    Aweme aweme = (Aweme) nVar.getFirst();
                    if (aweme != null) {
                        this.f60167b = aweme;
                        C52847n nVar2 = (C52847n) aVar.mo48246a();
                        if (nVar2 != null) {
                            C26138s sVar = (C26138s) nVar2.getSecond();
                            if (sVar != null) {
                                this.f60166a = sVar;
                                C26138s sVar2 = this.f60166a;
                                if (sVar2 == null) {
                                    C52711k.m112234a();
                                }
                                Aweme aweme2 = this.f60167b;
                                if (aweme2 == null) {
                                    C52711k.m112234a();
                                }
                                mo46499a(sVar2, aweme2);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r11) {
        /*
            r10 = this;
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r11)
            java.lang.String r0 = "v"
            p2628d.p2639f.p2641b.C52711k.m112240b(r11, r0)
            int r11 = r11.getId()
            r0 = 2132023534(0x7f1418ee, float:1.9685519E38)
            if (r11 != r0) goto L_0x005d
            com.ss.android.ugc.aweme.commercialize.model.s r11 = r10.f60166a
            r0 = 0
            if (r11 == 0) goto L_0x0023
            java.lang.String r11 = r11.creativeId
            if (r11 == 0) goto L_0x0023
            long r1 = java.lang.Long.parseLong(r11)
            java.lang.Long r11 = java.lang.Long.valueOf(r1)
            goto L_0x0024
        L_0x0023:
            r11 = r0
        L_0x0024:
            if (r11 != 0) goto L_0x0029
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0029:
            long r1 = r11.longValue()
            boolean r11 = r10.m55329h()
            if (r11 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r11 = new com.ss.android.ugc.aweme.feed.model.AwemeRawAd
            r11.<init>()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r11.setCreativeId(r1)
            com.ss.android.ugc.aweme.commercialize.model.s r1 = r10.f60166a
            if (r1 == 0) goto L_0x0045
            java.lang.String r0 = r1.logExtra
        L_0x0045:
            r11.setLogExtra(r0)
            return
        L_0x0049:
            r10.m55328g()
            com.ss.android.ugc.aweme.poi.widget.c r11 = r10.f60168c
            if (r11 == 0) goto L_0x0053
            r11.mo80495b()
        L_0x0053:
            java.lang.String r11 = "comment_ad"
            java.lang.String r0 = "click"
            java.lang.String r1 = "button"
            r10.mo46500a(r11, r0, r1)
            return
        L_0x005d:
            r0 = 2132020626(0x7f140d92, float:1.967962E38)
            if (r11 != r0) goto L_0x012a
            com.ss.android.ugc.aweme.poi.widget.c r11 = r10.f60168c
            if (r11 != 0) goto L_0x0071
            com.ss.android.ugc.aweme.poi.widget.c r11 = new com.ss.android.ugc.aweme.poi.widget.c
            android.app.Activity r0 = com.bytedance.ies.ugc.p694a.C11016e.m22312g()
            r11.<init>(r0)
            r10.f60168c = r11
        L_0x0071:
            android.content.Context r11 = r10.getContext()
            r0 = 1120927744(0x42d00000, float:104.0)
            float r11 = com.bytedance.common.utility.C9432q.m18687b(r11, r0)
            int r11 = (int) r11
            android.content.Context r0 = r10.getContext()
            r1 = 1124728832(0x430a0000, float:138.0)
            float r0 = com.bytedance.common.utility.C9432q.m18687b(r0, r1)
            int r0 = (int) r0
            com.ss.android.ugc.aweme.poi.widget.c r1 = r10.f60168c
            r2 = 0
            if (r1 == 0) goto L_0x008f
            r1.f101001p = r2
        L_0x008f:
            com.ss.android.ugc.aweme.poi.widget.c r1 = r10.f60168c
            if (r1 == 0) goto L_0x0095
            r1.f101002q = r2
        L_0x0095:
            com.ss.android.ugc.aweme.poi.widget.c r1 = r10.f60168c
            if (r1 == 0) goto L_0x009d
            r2 = -1
            r1.f100999n = r2
        L_0x009d:
            com.ss.android.ugc.aweme.ad.comment.AdCommentReportBubbleView r1 = new com.ss.android.ugc.aweme.ad.comment.AdCommentReportBubbleView
            android.content.Context r5 = r10.getContext()
            java.lang.String r2 = "context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r2)
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9)
            com.ss.android.ugc.aweme.commercialize.model.s r2 = r10.f60166a
            if (r2 != 0) goto L_0x00b7
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00b7:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r10.f60167b
            if (r3 != 0) goto L_0x00be
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00be:
            java.lang.String r4 = "linkData"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r4)
            java.lang.String r4 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r4)
            r1.f60141a = r2
            r1.f60142b = r3
            boolean r2 = r2.reportEnabled
            if (r2 == 0) goto L_0x00d9
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r1.f60143c
            if (r2 == 0) goto L_0x00e2
            r3 = 0
            r2.setVisibility(r3)
            goto L_0x00e2
        L_0x00d9:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r1.f60143c
            if (r2 == 0) goto L_0x00e2
            r3 = 8
            r2.setVisibility(r3)
        L_0x00e2:
            com.ss.android.ugc.aweme.ad.comment.CommonCommentView$a r2 = new com.ss.android.ugc.aweme.ad.comment.CommonCommentView$a
            r2.<init>(r10)
            com.ss.android.ugc.aweme.ad.comment.AdCommentReportBubbleView$a r2 = (com.p683ss.android.ugc.aweme.p1308ad.comment.AdCommentReportBubbleView.C22333a) r2
            r1.setInnerClick(r2)
            com.ss.android.ugc.aweme.poi.widget.c r2 = r10.f60168c
            if (r2 == 0) goto L_0x00fe
            android.content.Context r3 = r10.getContext()
            r4 = 2131820674(0x7f110082, float:1.927407E38)
            int r3 = android.support.p030v4.content.C0726c.m2098c(r3, r4)
            r2.mo80496b(r3)
        L_0x00fe:
            com.ss.android.ugc.aweme.poi.widget.c r2 = r10.f60168c
            if (r2 == 0) goto L_0x0107
            android.view.View r1 = (android.view.View) r1
            r2.mo80488a(r1)
        L_0x0107:
            com.ss.android.ugc.aweme.poi.widget.c r1 = r10.f60168c
            if (r1 == 0) goto L_0x010e
            r1.mo80487a(r11, r0)
        L_0x010e:
            com.ss.android.ugc.aweme.poi.widget.c r11 = r10.f60168c
            if (r11 == 0) goto L_0x0115
            r11.mo80503e()
        L_0x0115:
            com.ss.android.ugc.aweme.poi.widget.c r11 = r10.f60168c
            if (r11 == 0) goto L_0x0120
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r10.f60173h
            android.view.View r0 = (android.view.View) r0
            r11.mo80497b(r0)
        L_0x0120:
            java.lang.String r11 = "comment_ad"
            java.lang.String r0 = "otherclick"
            java.lang.String r1 = "adtag"
            r10.mo46500a(r11, r0, r1)
            return
        L_0x012a:
            r0 = 2132017508(0x7f140164, float:1.9673296E38)
            if (r11 != r0) goto L_0x0144
            java.lang.String r11 = "comment_ad"
            java.lang.String r0 = "click"
            java.lang.String r1 = "photo"
            r10.mo46500a(r11, r0, r1)
            r10.m55328g()
            com.ss.android.ugc.aweme.poi.widget.c r11 = r10.f60168c
            if (r11 == 0) goto L_0x0143
            r11.mo80495b()
            goto L_0x018c
        L_0x0143:
            return
        L_0x0144:
            r0 = 2132018277(0x7f140465, float:1.9674856E38)
            if (r11 != r0) goto L_0x015e
            java.lang.String r11 = "comment_ad"
            java.lang.String r0 = "click"
            java.lang.String r1 = "title"
            r10.mo46500a(r11, r0, r1)
            r10.m55328g()
            com.ss.android.ugc.aweme.poi.widget.c r11 = r10.f60168c
            if (r11 == 0) goto L_0x015d
            r11.mo80495b()
            goto L_0x018c
        L_0x015d:
            return
        L_0x015e:
            r0 = 2132023392(0x7f141860, float:1.968523E38)
            if (r11 != r0) goto L_0x0178
            java.lang.String r11 = "comment_ad"
            java.lang.String r0 = "click"
            java.lang.String r1 = "source"
            r10.mo46500a(r11, r0, r1)
            r10.m55328g()
            com.ss.android.ugc.aweme.poi.widget.c r11 = r10.f60168c
            if (r11 == 0) goto L_0x0177
            r11.mo80495b()
            goto L_0x018c
        L_0x0177:
            return
        L_0x0178:
            r10.m55328g()
            java.lang.String r11 = "comment_ad"
            java.lang.String r0 = "click"
            java.lang.String r1 = ""
            r10.mo46500a(r11, r0, r1)
            com.ss.android.ugc.aweme.poi.widget.c r11 = r10.f60168c
            if (r11 == 0) goto L_0x018c
            r11.mo80495b()
            return
        L_0x018c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1308ad.comment.CommonCommentView.onClick(android.view.View):void");
    }

    /* renamed from: a */
    public final void mo46499a(C26138s sVar, Aweme aweme) {
        C52711k.m112240b(sVar, "linkData");
        C52711k.m112240b(aweme, "aweme");
        this.f60166a = sVar;
        this.f60167b = aweme;
        m55321a();
    }

    /* renamed from: a */
    public final void mo46500a(String str, String str2, String str3) {
        C22317a a = C22317a.m55223a();
        C52711k.m112236a((Object) a, "AdDependManager.inst()");
        a.f60116c.mo46431a(str2, getContext(), this.f60166a, this.f60167b, str3);
    }

    public CommonCommentView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.bhp, this);
        this.f60171f = (DmtTextView) inflate.findViewById(R.id.title);
        this.f60170e = (CircleImageView) inflate.findViewById(R.id.hi);
        this.f60172g = (DmtTextView) inflate.findViewById(R.id.ze);
        this.f60173h = (DmtTextView) inflate.findViewById(R.id.ej4);
        this.f60174i = (DmtTextView) inflate.findViewById(R.id.f0u);
        this.f60175j = (DmtTextView) inflate.findViewById(R.id.f0t);
        DmtTextView dmtTextView = this.f60174i;
        if (dmtTextView != null) {
            dmtTextView.setOnClickListener(this);
        }
        DmtTextView dmtTextView2 = this.f60173h;
        if (dmtTextView2 != null) {
            dmtTextView2.setOnClickListener(this);
        }
        CircleImageView circleImageView = this.f60170e;
        if (circleImageView != null) {
            circleImageView.setOnClickListener(this);
        }
        DmtTextView dmtTextView3 = this.f60171f;
        if (dmtTextView3 != null) {
            dmtTextView3.setOnClickListener(this);
        }
        DmtTextView dmtTextView4 = this.f60172g;
        if (dmtTextView4 != null) {
            dmtTextView4.setOnClickListener(this);
        }
        setOnClickListener(this);
        C22317a a = C22317a.m55223a();
        C52711k.m112236a((Object) a, "AdDependManager.inst()");
        if (a.f60114a.mo46447a()) {
            DmtTextView dmtTextView5 = this.f60171f;
            if (dmtTextView5 != null) {
                C52711k.m112236a((Object) inflate, "rootView");
                dmtTextView5.setTextColor(inflate.getResources().getColor(R.color.a1o));
            }
            DmtTextView dmtTextView6 = this.f60172g;
            if (dmtTextView6 != null) {
                C52711k.m112236a((Object) inflate, "rootView");
                dmtTextView6.setTextColor(inflate.getResources().getColor(R.color.a1l));
            }
        }
        this.f60178m = C9432q.m18687b(context, 51.5f);
    }

    private /* synthetic */ CommonCommentView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        this(context, null, 0);
    }
}
