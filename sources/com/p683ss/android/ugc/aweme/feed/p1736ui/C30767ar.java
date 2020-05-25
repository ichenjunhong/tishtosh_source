package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.feed.experiment.HomeUIOptimizeTitleSize;
import com.p683ss.android.ugc.aweme.feed.experiment.PlayerRedesignExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ar */
public final class C30767ar implements C0199s<C23274a> {

    /* renamed from: a */
    public DataCenter f80622a;

    /* renamed from: b */
    public final Context f80623b;

    /* renamed from: c */
    private DmtTextView f80624c;

    /* renamed from: d */
    private TextView f80625d;

    /* renamed from: e */
    private Aweme f80626e;

    /* renamed from: f */
    private String f80627f = "";

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ar$a */
    static final class C30768a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C30767ar f80628a;

        C30768a(C30767ar arVar) {
            this.f80628a = arVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            DataCenter dataCenter = this.f80628a.f80622a;
            if (dataCenter != null) {
                dataCenter.mo48228a("title_view_click", (Object) null);
            }
        }
    }

    /* renamed from: a */
    private final void m72138a() {
        TextView textView = this.f80625d;
        if (textView != null) {
            textView.setPadding(0, textView.getPaddingTop(), 0, textView.getPaddingTop());
        }
        C23729p.m58257a((View) this.f80624c, 8);
    }

    /* renamed from: a */
    public final void mo63471a(DataCenter dataCenter) {
        this.f80622a = dataCenter;
        if (dataCenter != null) {
            dataCenter.mo48226a("bind_title_touch_listener", (C0199s<C23274a>) this);
        }
    }

    /* renamed from: a */
    private final void m72139a(String str) {
        TextView textView = this.f80625d;
        if (textView != null) {
            textView.setPadding(0, textView.getPaddingTop(), 0, 0);
        }
        DmtTextView dmtTextView = this.f80624c;
        if (dmtTextView != null) {
            dmtTextView.setText(str);
        }
        C23729p.m58257a((View) this.f80624c, 0);
    }

    /* renamed from: b */
    private final String m72140b(String str) {
        String str2;
        try {
            if (PlayerRedesignExperiment.m70953a() == 0) {
                Context context = this.f80623b;
                Object[] objArr = new Object[1];
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                objArr[0] = str2;
                String string = context.getString(R.string.b21, objArr);
                C52711k.m112236a((Object) string, "mContext.getString(R.str…g.feed_title, name ?: \"\")");
                return string;
            }
            if (str == null) {
                return "";
            }
            return str;
        } catch (Throwable unused) {
            if (str == null) {
                str = "";
            }
        }
    }

    public final /* synthetic */ void onChanged(Object obj) {
        String str;
        C23274a aVar = (C23274a) obj;
        if (aVar != null) {
            str = aVar.f62242a;
        } else {
            str = null;
        }
        if (str != null && str.hashCode() == 1104022845 && str.equals("bind_title_touch_listener")) {
            TextView textView = this.f80625d;
            if (textView != null) {
                textView.setOnTouchListener((OnTouchListener) aVar.mo48246a());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003d, code lost:
        if (r3.isDelete() != false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00ab, code lost:
        if (r5 == null) goto L_0x00ad;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0139  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo63472a(com.p683ss.android.ugc.aweme.feed.model.VideoItemParams r12) {
        /*
            r11 = this;
            r0 = 0
            if (r12 == 0) goto L_0x0006
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r12.mAweme
            goto L_0x0007
        L_0x0006:
            r1 = r0
        L_0x0007:
            r11.f80626e = r1
            if (r12 == 0) goto L_0x000e
            java.lang.String r12 = r12.mEventType
            goto L_0x000f
        L_0x000e:
            r12 = r0
        L_0x000f:
            r11.f80627f = r12
            com.ss.android.ugc.aweme.feed.model.Aweme r12 = r11.f80626e
            r1 = 0
            r2 = 1
            if (r12 == 0) goto L_0x018e
            com.ss.android.ugc.aweme.feed.model.Aweme r12 = r11.f80626e
            if (r12 == 0) goto L_0x0020
            com.ss.android.ugc.aweme.profile.model.User r12 = r12.getAuthor()
            goto L_0x0021
        L_0x0020:
            r12 = r0
        L_0x0021:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r11.f80626e
            if (r3 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r11.f80626e
            if (r3 != 0) goto L_0x002c
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x002c:
            boolean r3 = r3.isCanPlay()
            if (r3 == 0) goto L_0x003f
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r11.f80626e
            if (r3 != 0) goto L_0x0039
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0039:
            boolean r3 = r3.isDelete()
            if (r3 == 0) goto L_0x0049
        L_0x003f:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r11.f80626e
            boolean r3 = com.p683ss.android.ugc.aweme.login.utils.C36330a.m81964a(r3)
            if (r3 != 0) goto L_0x0049
            r3 = 1
            goto L_0x004a
        L_0x0049:
            r3 = 0
        L_0x004a:
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r11.f80626e
            boolean r4 = com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc.m63999a(r4, r2)
            if (r4 == 0) goto L_0x00ba
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r11.f80626e
            r5 = 3
            boolean r4 = com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc.m63997a(r4, r5)
            if (r4 == 0) goto L_0x00ba
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r11.f80626e
            if (r4 == 0) goto L_0x006e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r4 = r4.getAwemeRawAd()
            if (r4 == 0) goto L_0x006e
            com.ss.android.ugc.aweme.commercialize.model.y r4 = r4.getOmVast()
            if (r4 == 0) goto L_0x006e
            com.bytedance.t.b.f r4 = r4.vast
            goto L_0x006f
        L_0x006e:
            r4 = r0
        L_0x006f:
            if (r4 == 0) goto L_0x00ba
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r11.f80626e
            if (r4 == 0) goto L_0x0088
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r4 = r4.getAwemeRawAd()
            if (r4 == 0) goto L_0x0088
            com.ss.android.ugc.aweme.commercialize.model.y r4 = r4.getOmVast()
            if (r4 == 0) goto L_0x0088
            com.bytedance.t.b.f r4 = r4.vast
            if (r4 == 0) goto L_0x0088
            java.lang.String r4 = r4.adTitle
            goto L_0x0089
        L_0x0088:
            r4 = r0
        L_0x0089:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x00ba
            android.widget.TextView r4 = r11.f80625d
            if (r4 == 0) goto L_0x0137
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r11.f80626e
            if (r5 == 0) goto L_0x00ad
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r5 = r5.getAwemeRawAd()
            if (r5 == 0) goto L_0x00ad
            com.ss.android.ugc.aweme.commercialize.model.y r5 = r5.getOmVast()
            if (r5 == 0) goto L_0x00ad
            com.bytedance.t.b.f r5 = r5.vast
            if (r5 == 0) goto L_0x00ad
            java.lang.String r5 = r5.adTitle
            if (r5 != 0) goto L_0x00af
        L_0x00ad:
            java.lang.String r5 = ""
        L_0x00af:
            java.lang.String r5 = r11.m72140b(r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.setText(r5)
            goto L_0x0137
        L_0x00ba:
            if (r12 == 0) goto L_0x012c
            com.ss.android.ugc.aweme.IAccountUserService r4 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r5 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            com.ss.android.ugc.aweme.profile.model.User r4 = r4.getCurUser()
            java.lang.String r5 = r12.getUid()
            java.lang.String r6 = "curUser"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r6)
            java.lang.String r6 = r4.getUid()
            boolean r5 = com.bytedance.common.utility.C9431p.m18665a(r5, r6)
            if (r5 == 0) goto L_0x00e0
            long r4 = r4.roomId
            r12.roomId = r4
        L_0x00e0:
            if (r3 != 0) goto L_0x011c
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r11.f80626e
            if (r4 != 0) goto L_0x00e9
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00e9:
            boolean r4 = r4.isAd()
            if (r4 != 0) goto L_0x010b
            com.ss.android.ugc.aweme.profile.f r4 = com.p683ss.android.ugc.aweme.C23794bh.m58377C()
            boolean r4 = r4.mo59618a()
            if (r4 == 0) goto L_0x010b
            android.widget.TextView r4 = r11.f80625d
            if (r4 == 0) goto L_0x011c
            java.lang.String r5 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103656e(r12)
            java.lang.String r5 = r11.m72140b(r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.setText(r5)
            goto L_0x011c
        L_0x010b:
            android.widget.TextView r4 = r11.f80625d
            if (r4 == 0) goto L_0x011c
            java.lang.String r5 = r12.getNickname()
            java.lang.String r5 = r11.m72140b(r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.setText(r5)
        L_0x011c:
            android.widget.TextView r4 = r11.f80625d
            if (r4 == 0) goto L_0x0125
            android.text.TextPaint r4 = r4.getPaint()
            goto L_0x0126
        L_0x0125:
            r4 = r0
        L_0x0126:
            if (r4 == 0) goto L_0x0137
            r4.setFakeBoldText(r2)
            goto L_0x0137
        L_0x012c:
            android.widget.TextView r4 = r11.f80625d
            if (r4 == 0) goto L_0x0137
            java.lang.String r5 = ""
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.setText(r5)
        L_0x0137:
            if (r12 == 0) goto L_0x016e
            java.lang.String r4 = r11.f80627f
            boolean r4 = com.p683ss.android.ugc.aweme.feed.C31257z.m72970a(r4)
            if (r4 == 0) goto L_0x015f
            com.bytedance.ies.abmock.b r5 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.experiment.VerificationExperiment> r6 = com.p683ss.android.ugc.aweme.experiment.VerificationExperiment.class
            r7 = 1
            java.lang.String r8 = "for_you_feed_hide_verification_badge"
            r9 = 31744(0x7c00, float:4.4483E-41)
            r10 = 0
            boolean r4 = r5.mo18172a(r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x015f
            android.content.Context r12 = r11.f80623b
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            android.widget.TextView r6 = r11.f80625d
            com.p683ss.android.ugc.aweme.utils.C47916gh.m103675a(r12, r4, r5, r6)
            goto L_0x016e
        L_0x015f:
            android.content.Context r4 = r11.f80623b
            java.lang.String r5 = r12.getCustomVerify()
            java.lang.String r12 = r12.getEnterpriseVerifyReason()
            android.widget.TextView r6 = r11.f80625d
            com.p683ss.android.ugc.aweme.utils.C47916gh.m103675a(r4, r5, r12, r6)
        L_0x016e:
            if (r3 == 0) goto L_0x0179
            android.widget.TextView r12 = r11.f80625d
            if (r12 == 0) goto L_0x0180
            r3 = 4
            r12.setVisibility(r3)
            goto L_0x0180
        L_0x0179:
            android.widget.TextView r12 = r11.f80625d
            if (r12 == 0) goto L_0x0180
            r12.setVisibility(r1)
        L_0x0180:
            android.widget.TextView r12 = r11.f80625d
            if (r12 == 0) goto L_0x018e
            com.ss.android.ugc.aweme.feed.ui.ar$a r3 = new com.ss.android.ugc.aweme.feed.ui.ar$a
            r3.<init>(r11)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r12.setOnClickListener(r3)
        L_0x018e:
            int r12 = com.p683ss.android.ugc.aweme.experiment.C29506g.m69645a()
            r3 = 2
            if (r12 != r3) goto L_0x0236
            com.ss.android.ugc.aweme.feed.model.Aweme r12 = r11.f80626e
            if (r12 == 0) goto L_0x01a7
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r12 = r12.getStatistics()
            if (r12 == 0) goto L_0x01a7
            long r4 = r12.getPlayCount()
            java.lang.String r0 = com.p683ss.android.ugc.aweme.i18n.C33095b.m76068a(r4)
        L_0x01a7:
            com.ss.android.ugc.aweme.feed.model.Aweme r12 = r11.f80626e
            if (r12 == 0) goto L_0x01b0
            boolean r12 = r12.isAd()
            goto L_0x01b1
        L_0x01b0:
            r12 = 0
        L_0x01b1:
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r11.f80626e
            if (r4 == 0) goto L_0x01ba
            boolean r4 = r4.isDelete()
            goto L_0x01bb
        L_0x01ba:
            r4 = 1
        L_0x01bb:
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 17
            if (r5 < r6) goto L_0x01c8
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = r11.f80624c
            if (r5 == 0) goto L_0x01c8
            r5.setTextDirection(r3)
        L_0x01c8:
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L_0x01d6
            int r3 = r3.length()
            if (r3 != 0) goto L_0x01d4
            goto L_0x01d6
        L_0x01d4:
            r3 = 0
            goto L_0x01d7
        L_0x01d6:
            r3 = 1
        L_0x01d7:
            if (r3 != 0) goto L_0x0232
            if (r12 != 0) goto L_0x0232
            if (r4 != 0) goto L_0x0232
            int r12 = com.p683ss.android.ugc.aweme.feed.experiment.PlayerRedesignExperiment.m70953a()
            r3 = 2132542651(0x7f1c04bb, float:2.0738413E38)
            if (r12 != 0) goto L_0x0211
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r4 = "· "
            r12.<init>(r4)
            android.content.Context r4 = r11.f80623b
            java.lang.String r3 = r4.getString(r3)
            java.lang.String r4 = "mContext.getString(R.string.challenge_view_count)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r1] = r0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r4, r2)
            java.lang.String r0 = com.C2240a.m6772a(r3, r0)
            java.lang.String r1 = "java.lang.String.format(format, *args)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            goto L_0x022d
        L_0x0211:
            android.content.Context r12 = r11.f80623b
            java.lang.String r12 = r12.getString(r3)
            java.lang.String r3 = "mContext.getString(R.string.challenge_view_count)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r3)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r1] = r0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r2)
            java.lang.String r12 = com.C2240a.m6772a(r12, r0)
            java.lang.String r0 = "java.lang.String.format(format, *args)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r0)
        L_0x022d:
            r11.m72139a(r12)
            goto L_0x02a1
        L_0x0232:
            r11.m72138a()
            return
        L_0x0236:
            java.lang.String r12 = r11.f80627f
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            java.lang.String r1 = "homepage_hot"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r12 = android.text.TextUtils.equals(r12, r1)
            r12 = r12 ^ r2
            if (r12 == 0) goto L_0x0298
            com.ss.android.ugc.aweme.feed.model.Aweme r12 = r11.f80626e
            if (r12 == 0) goto L_0x0294
            com.ss.android.ugc.aweme.feed.model.Aweme r12 = r11.f80626e
            r1 = 0
            if (r12 == 0) goto L_0x0254
            long r3 = r12.getCreateTime()
            goto L_0x0255
        L_0x0254:
            r3 = r1
        L_0x0255:
            int r12 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r12 <= 0) goto L_0x0294
            com.ss.android.ugc.aweme.feed.model.Aweme r12 = r11.f80626e
            if (r12 == 0) goto L_0x026b
            long r0 = r12.getCreateTime()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            android.content.Context r12 = r11.f80623b
            java.lang.String r0 = com.p683ss.android.ugc.aweme.utils.C47903fw.m103627d(r12, r0)
        L_0x026b:
            r12 = r0
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x0290
            if (r0 != 0) goto L_0x0278
            java.lang.String r0 = ""
        L_0x0278:
            int r12 = com.p683ss.android.ugc.aweme.feed.experiment.PlayerRedesignExperiment.m70953a()
            if (r12 != 0) goto L_0x028c
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r1 = "· "
            r12.<init>(r1)
            r12.append(r0)
            java.lang.String r0 = r12.toString()
        L_0x028c:
            r11.m72139a(r0)
            goto L_0x02a1
        L_0x0290:
            r11.m72138a()
            goto L_0x02a1
        L_0x0294:
            r11.m72138a()
            return
        L_0x0298:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.f80624c
            android.view.View r12 = (android.view.View) r12
            r0 = 8
            com.p683ss.android.ugc.aweme.base.utils.C23729p.m58257a(r12, r0)
        L_0x02a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.C30767ar.mo63472a(com.ss.android.ugc.aweme.feed.model.VideoItemParams):void");
    }

    public C30767ar(View view, OnTouchListener onTouchListener, Context context) {
        DmtTextView dmtTextView;
        C52711k.m112240b(context, "mContext");
        this.f80623b = context;
        TextView textView = null;
        if (view != null) {
            dmtTextView = (DmtTextView) view.findViewById(R.id.ddv);
        } else {
            dmtTextView = null;
        }
        this.f80624c = dmtTextView;
        if (view != null) {
            textView = (TextView) view.findViewById(R.id.title);
        }
        this.f80625d = textView;
        TextView textView2 = this.f80625d;
        if (textView2 != null) {
            textView2.setOnTouchListener(onTouchListener);
        }
        if (HomeUIOptimizeTitleSize.m70949a()) {
            DmtTextView dmtTextView2 = this.f80624c;
            if (dmtTextView2 != null) {
                dmtTextView2.setTextSize(2, 17.0f);
            }
            TextView textView3 = this.f80625d;
            if (textView3 != null) {
                textView3.setTextSize(2, 17.0f);
            }
        }
    }
}
