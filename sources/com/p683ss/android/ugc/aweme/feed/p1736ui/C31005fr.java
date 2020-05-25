package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextPaint;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.experiment.C29506g;
import com.p683ss.android.ugc.aweme.experiment.VerificationExperiment;
import com.p683ss.android.ugc.aweme.feed.C31257z;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30241a;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30255o;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30256p;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.WidgetAsyncAB;
import com.p683ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47916gh;
import com.p683ss.android.ugc.aweme.utils.GenericWidget;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.fr */
public final class C31005fr extends C30241a {

    /* renamed from: p */
    public C30765aq f81187p;

    /* renamed from: q */
    private final OnTouchListener f81188q;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.fr$a */
    static final class C31006a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C31005fr f81189a;

        C31006a(C31005fr frVar) {
            this.f81189a = frVar;
        }

        public final void run() {
            C30765aq aqVar = this.f81189a.f81187p;
            if (aqVar != null) {
                DataCenter dataCenter = this.f81189a.f79016i;
                GenericWidget genericWidget = this.f81189a.f79009b;
                C52711k.m112236a((Object) genericWidget, "mWidget");
                C52711k.m112240b(genericWidget, "widget");
                aqVar.f80618d = dataCenter;
                if (dataCenter != null) {
                    dataCenter.mo48226a("bind_title_touch_listener", (C0199s<C23274a>) genericWidget);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo60586a(DataCenter dataCenter) {
    }

    /* renamed from: e */
    public final void mo60599e() {
    }

    /* renamed from: a */
    public final void mo60587a(VideoItemParams videoItemParams) {
        super.mo60587a(videoItemParams);
    }

    /* renamed from: a */
    public final void mo60585a(View view) {
        this.f79019l = ((X2CItemFeed) C35857a.m81002b(X2CItemFeed.class)).getView(this.f79017j, R.layout.b6z);
        View view2 = this.f79019l;
        OnTouchListener onTouchListener = this.f81188q;
        Context context = this.f79017j;
        C52711k.m112236a((Object) context, "mContext");
        this.f81187p = new C30765aq(view2, onTouchListener, context);
        C30255o.f79039a.mo60617a(new C30256p(false, new C31006a(this)));
    }

    /* renamed from: e */
    public final void mo60600e(C23274a aVar) {
        String str;
        C30765aq aqVar = this.f81187p;
        if (aqVar != null) {
            if (aVar != null) {
                str = aVar.f62242a;
            } else {
                str = null;
            }
            if (str != null && str.hashCode() == 1104022845 && str.equals("bind_title_touch_listener")) {
                TextView textView = aqVar.f80616b;
                if (textView != null) {
                    textView.setOnTouchListener((OnTouchListener) aVar.mo48246a());
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006d, code lost:
        if (r6.isDelete() != false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00f0, code lost:
        if (r6 == null) goto L_0x00f2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00fd  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a mo60590b(com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L_0x0004
            return r0
        L_0x0004:
            super.mo60590b(r11)
            java.lang.String r1 = r11.f62242a
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r2 = "video_params"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 == 0) goto L_0x0271
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.ss.android.ugc.aweme.feed.ui.aq r2 = r10.f81187p
            if (r2 == 0) goto L_0x0269
            java.lang.Object r11 = r11.mo48246a()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r11 = (com.p683ss.android.ugc.aweme.feed.model.VideoItemParams) r11
            java.lang.String r3 = "state"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r3)
            if (r11 == 0) goto L_0x002e
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r11.mAweme
            goto L_0x002f
        L_0x002e:
            r3 = r0
        L_0x002f:
            r2.f80617c = r3
            if (r11 == 0) goto L_0x0036
            java.lang.String r11 = r11.mEventType
            goto L_0x0037
        L_0x0036:
            r11 = r0
        L_0x0037:
            r2.f80619e = r11
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r2.f80617c
            r3 = 0
            r4 = 1
            if (r11 == 0) goto L_0x0184
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r2.f80617c
            if (r11 == 0) goto L_0x0048
            com.ss.android.ugc.aweme.profile.model.User r11 = r11.getAuthor()
            goto L_0x0049
        L_0x0048:
            r11 = r0
        L_0x0049:
            r5 = r1
            java.util.Map r5 = (java.util.Map) r5
            java.lang.String r6 = "author_state"
            r5.put(r6, r11)
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r2.f80617c
            if (r6 == 0) goto L_0x0079
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r2.f80617c
            if (r6 != 0) goto L_0x005c
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x005c:
            boolean r6 = r6.isCanPlay()
            if (r6 == 0) goto L_0x006f
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r2.f80617c
            if (r6 != 0) goto L_0x0069
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0069:
            boolean r6 = r6.isDelete()
            if (r6 == 0) goto L_0x0079
        L_0x006f:
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r2.f80617c
            boolean r6 = com.p683ss.android.ugc.aweme.login.utils.C36330a.m81964a(r6)
            if (r6 != 0) goto L_0x0079
            r6 = 1
            goto L_0x007a
        L_0x0079:
            r6 = 0
        L_0x007a:
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r2.f80617c
            boolean r7 = com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc.m63999a(r7, r4)
            if (r7 == 0) goto L_0x00c3
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r2.f80617c
            r8 = 3
            boolean r7 = com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc.m63997a(r7, r8)
            if (r7 == 0) goto L_0x00c3
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r2.f80617c
            if (r7 == 0) goto L_0x009e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r7 = r7.getAwemeRawAd()
            if (r7 == 0) goto L_0x009e
            com.ss.android.ugc.aweme.commercialize.model.y r7 = r7.getOmVast()
            if (r7 == 0) goto L_0x009e
            com.bytedance.t.b.f r7 = r7.vast
            goto L_0x009f
        L_0x009e:
            r7 = r0
        L_0x009f:
            if (r7 == 0) goto L_0x00c3
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r2.f80617c
            if (r7 == 0) goto L_0x00b8
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r7 = r7.getAwemeRawAd()
            if (r7 == 0) goto L_0x00b8
            com.ss.android.ugc.aweme.commercialize.model.y r7 = r7.getOmVast()
            if (r7 == 0) goto L_0x00b8
            com.bytedance.t.b.f r7 = r7.vast
            if (r7 == 0) goto L_0x00b8
            java.lang.String r7 = r7.adTitle
            goto L_0x00b9
        L_0x00b8:
            r7 = r0
        L_0x00b9:
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x00c3
            r7 = 1
            goto L_0x00c4
        L_0x00c3:
            r7 = 0
        L_0x00c4:
            java.lang.String r8 = "check_state"
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)
            r5.put(r8, r9)
            java.lang.String r8 = "no_visible_state"
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)
            r5.put(r8, r9)
            if (r7 == 0) goto L_0x00fd
            java.lang.String r11 = "title_text_state"
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r2.f80617c
            if (r6 == 0) goto L_0x00f2
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r6 = r6.getAwemeRawAd()
            if (r6 == 0) goto L_0x00f2
            com.ss.android.ugc.aweme.commercialize.model.y r6 = r6.getOmVast()
            if (r6 == 0) goto L_0x00f2
            com.bytedance.t.b.f r6 = r6.vast
            if (r6 == 0) goto L_0x00f2
            java.lang.String r6 = r6.adTitle
            if (r6 != 0) goto L_0x00f4
        L_0x00f2:
            java.lang.String r6 = ""
        L_0x00f4:
            java.lang.String r6 = r2.mo63469c(r6)
            r5.put(r11, r6)
            goto L_0x0176
        L_0x00fd:
            if (r11 == 0) goto L_0x016f
            com.ss.android.ugc.aweme.IAccountUserService r7 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r8 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            com.ss.android.ugc.aweme.profile.model.User r7 = r7.getCurUser()
            java.lang.String r8 = r11.getUid()
            java.lang.String r9 = "curUser"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r9)
            java.lang.String r9 = r7.getUid()
            boolean r8 = com.bytedance.common.utility.C9431p.m18665a(r8, r9)
            if (r8 == 0) goto L_0x0123
            long r7 = r7.roomId
            r11.roomId = r7
        L_0x0123:
            if (r6 != 0) goto L_0x0165
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r2.f80617c
            if (r6 != 0) goto L_0x012c
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x012c:
            boolean r6 = r6.isAd()
            if (r6 != 0) goto L_0x013e
            com.ss.android.ugc.aweme.profile.f r6 = com.p683ss.android.ugc.aweme.C23794bh.m58377C()
            boolean r6 = r6.mo59618a()
            if (r6 == 0) goto L_0x013e
            r6 = 1
            goto L_0x013f
        L_0x013e:
            r6 = 0
        L_0x013f:
            java.lang.String r7 = "need_change_nick_name_state"
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)
            r5.put(r7, r8)
            if (r6 == 0) goto L_0x0158
            java.lang.String r6 = "title_text_state"
            java.lang.String r11 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103656e(r11)
            java.lang.String r11 = r2.mo63469c(r11)
            r5.put(r6, r11)
            goto L_0x0165
        L_0x0158:
            java.lang.String r6 = "title_text_state"
            java.lang.String r11 = r11.getNickname()
            java.lang.String r11 = r2.mo63469c(r11)
            r5.put(r6, r11)
        L_0x0165:
            java.lang.String r11 = "author_not_null_state"
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            r5.put(r11, r6)
            goto L_0x0176
        L_0x016f:
            java.lang.String r11 = "title_text_state"
            java.lang.String r6 = ""
            r5.put(r11, r6)
        L_0x0176:
            android.widget.TextView r11 = r2.f80616b
            if (r11 == 0) goto L_0x0184
            com.ss.android.ugc.aweme.feed.ui.aq$a r5 = new com.ss.android.ugc.aweme.feed.ui.aq$a
            r5.<init>(r2)
            android.view.View$OnClickListener r5 = (android.view.View.OnClickListener) r5
            r11.setOnClickListener(r5)
        L_0x0184:
            int r11 = com.p683ss.android.ugc.aweme.experiment.C29506g.m69645a()
            r5 = 2
            if (r11 != r5) goto L_0x01e5
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r2.f80617c
            if (r11 == 0) goto L_0x019d
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r11 = r11.getStatistics()
            if (r11 == 0) goto L_0x019d
            long r5 = r11.getPlayCount()
            java.lang.String r0 = com.p683ss.android.ugc.aweme.i18n.C33095b.m76068a(r5)
        L_0x019d:
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r2.f80617c
            if (r11 == 0) goto L_0x01a6
            boolean r11 = r11.isAd()
            goto L_0x01a7
        L_0x01a6:
            r11 = 0
        L_0x01a7:
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r2.f80617c
            if (r5 == 0) goto L_0x01b0
            boolean r5 = r5.isDelete()
            goto L_0x01b1
        L_0x01b0:
            r5 = 1
        L_0x01b1:
            r6 = r0
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L_0x01bf
            int r6 = r6.length()
            if (r6 != 0) goto L_0x01bd
            goto L_0x01bf
        L_0x01bd:
            r6 = 0
            goto L_0x01c0
        L_0x01bf:
            r6 = 1
        L_0x01c0:
            if (r6 != 0) goto L_0x01c7
            if (r11 != 0) goto L_0x01c7
            if (r5 != 0) goto L_0x01c7
            r3 = 1
        L_0x01c7:
            r11 = r1
            java.util.Map r11 = (java.util.Map) r11
            java.lang.String r4 = "post_time_state"
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            r11.put(r4, r5)
            if (r3 == 0) goto L_0x0269
            java.lang.String r3 = "play_count_state"
            if (r0 != 0) goto L_0x01dc
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x01dc:
            java.lang.String r0 = r2.mo63468b(r0)
            r11.put(r3, r0)
            goto L_0x0269
        L_0x01e5:
            java.lang.String r11 = r2.f80619e
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.lang.String r5 = "homepage_hot"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r11 = android.text.TextUtils.equals(r11, r5)
            r11 = r11 ^ r4
            r5 = r1
            java.util.Map r5 = (java.util.Map) r5
            java.lang.String r6 = "play_time_style_state"
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r11)
            r5.put(r6, r7)
            if (r11 == 0) goto L_0x0269
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r2.f80617c
            if (r11 == 0) goto L_0x0260
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r2.f80617c
            r6 = 0
            if (r11 == 0) goto L_0x020f
            long r8 = r11.getCreateTime()
            goto L_0x0210
        L_0x020f:
            r8 = r6
        L_0x0210:
            int r11 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r11 <= 0) goto L_0x0260
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r2.f80617c
            if (r11 == 0) goto L_0x0226
            long r6 = r11.getCreateTime()
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            android.content.Context r11 = r2.f80620f
            java.lang.String r0 = com.p683ss.android.ugc.aweme.utils.C47903fw.m103627d(r11, r6)
        L_0x0226:
            r11 = r0
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x0256
            java.lang.String r11 = "post_time_state"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r5.put(r11, r2)
            java.lang.String r11 = "play_count_state"
            if (r0 != 0) goto L_0x023e
            java.lang.String r0 = ""
        L_0x023e:
            int r2 = com.p683ss.android.ugc.aweme.feed.experiment.PlayerRedesignExperiment.m70953a()
            if (r2 != 0) goto L_0x0252
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "· "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        L_0x0252:
            r5.put(r11, r0)
            goto L_0x0269
        L_0x0256:
            java.lang.String r11 = "post_time_state"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r5.put(r11, r0)
            goto L_0x0269
        L_0x0260:
            java.lang.String r11 = "post_time_state"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r5.put(r11, r0)
        L_0x0269:
            com.ss.android.ugc.aweme.arch.widgets.base.a r11 = new com.ss.android.ugc.aweme.arch.widgets.base.a
            java.lang.String r0 = "ui_state"
            r11.<init>(r0, r1)
            return r11
        L_0x0271:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.C31005fr.mo60590b(com.ss.android.ugc.aweme.arch.widgets.base.a):com.ss.android.ugc.aweme.arch.widgets.base.a");
    }

    public C31005fr(View view, OnTouchListener onTouchListener) {
        super(view, C10181b.m20511a().mo18172a(WidgetAsyncAB.class, true, "widget_open", 31744, false));
        this.f81188q = onTouchListener;
    }

    /* renamed from: a */
    public final void mo60584a(int i, C23274a aVar) {
        TextPaint textPaint;
        if (!this.f79010c) {
            this.f79010c = true;
            if (this.f79018k instanceof FrameLayout) {
                ((FrameLayout) this.f79018k).addView(this.f79019l, new LayoutParams(-2, -2));
            }
        }
        if (aVar != null) {
            C30765aq aqVar = this.f81187p;
            if (aqVar != null) {
                Object a = aVar.mo48246a();
                C52711k.m112236a(a, "kvData.getData()");
                HashMap hashMap = (HashMap) a;
                C52711k.m112240b(hashMap, "state");
                Map map = hashMap;
                Object obj = map.get("title_text_state");
                if (obj != null) {
                    TextView textView = aqVar.f80616b;
                    if (textView != null) {
                        if (obj != null) {
                            textView.setText((String) obj);
                        } else {
                            throw new C52857u("null cannot be cast to non-null type kotlin.String");
                        }
                    }
                }
                if (map.get("author_not_null_state") != null) {
                    TextView textView2 = aqVar.f80616b;
                    if (textView2 != null) {
                        textPaint = textView2.getPaint();
                    } else {
                        textPaint = null;
                    }
                    if (textPaint != null) {
                        textPaint.setFakeBoldText(true);
                    }
                }
                User user = (User) map.get("author_state");
                if (user != null) {
                    if (!C31257z.m72970a(aqVar.f80619e) || !C10181b.m20511a().mo18172a(VerificationExperiment.class, true, "for_you_feed_hide_verification_badge", 31744, false)) {
                        C47916gh.m103675a(aqVar.f80620f, user.getCustomVerify(), user.getEnterpriseVerifyReason(), aqVar.f80616b);
                    } else {
                        C47916gh.m103675a(aqVar.f80620f, "", "", aqVar.f80616b);
                    }
                }
                Object obj2 = map.get("no_visible_state");
                if (obj2 != null) {
                    if (((Boolean) obj2).booleanValue()) {
                        TextView textView3 = aqVar.f80616b;
                        if (textView3 != null) {
                            textView3.setVisibility(4);
                        }
                    } else {
                        TextView textView4 = aqVar.f80616b;
                        if (textView4 != null) {
                            textView4.setVisibility(0);
                        }
                    }
                    if (C29506g.m69645a() == 2) {
                        if (VERSION.SDK_INT >= 17) {
                            DmtTextView dmtTextView = aqVar.f80615a;
                            if (dmtTextView != null) {
                                dmtTextView.setTextDirection(2);
                            }
                        }
                        Object obj3 = hashMap.get("post_time_state");
                        if (obj3 == null) {
                            throw new C52857u("null cannot be cast to non-null type kotlin.Boolean");
                        } else if (((Boolean) obj3).booleanValue()) {
                            Object obj4 = hashMap.get("play_count_state");
                            if (obj4 != null) {
                                aqVar.mo63467a(aqVar.mo63468b((String) obj4));
                            } else {
                                throw new C52857u("null cannot be cast to non-null type kotlin.String");
                            }
                        } else {
                            aqVar.mo63466a();
                        }
                    } else {
                        Object obj5 = hashMap.get("play_time_style_state");
                        if (obj5 == null) {
                            throw new C52857u("null cannot be cast to non-null type kotlin.Boolean");
                        } else if (((Boolean) obj5).booleanValue()) {
                            Object obj6 = hashMap.get("post_time_state");
                            if (obj6 == null) {
                                throw new C52857u("null cannot be cast to non-null type kotlin.Boolean");
                            } else if (((Boolean) obj6).booleanValue()) {
                                Object obj7 = hashMap.get("play_count_state");
                                if (obj7 != null) {
                                    aqVar.mo63467a((String) obj7);
                                } else {
                                    throw new C52857u("null cannot be cast to non-null type kotlin.String");
                                }
                            } else {
                                aqVar.mo63466a();
                            }
                        } else {
                            C23729p.m58257a((View) aqVar.f80615a, 8);
                        }
                    }
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.Boolean");
            }
        }
    }
}
