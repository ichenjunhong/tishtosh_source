package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.arch.lifecycle.C0199s;
import android.os.Handler;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30241a;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30255o;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30256p;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.WidgetAsyncAB;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p683ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p683ss.android.ugc.aweme.protection.api.services.C40859b;
import com.ss.android.ugc.trill.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.cj */
public final class C30850cj extends C30241a {

    /* renamed from: p */
    public ViewGroup f80797p;

    /* renamed from: q */
    public boolean f80798q = false;

    /* renamed from: r */
    private boolean f80799r = false;

    /* renamed from: e */
    public final void mo60599e() {
    }

    /* renamed from: j */
    public static SimpleDateFormat m72268j() {
        boolean z;
        try {
            z = C32816h.m75716b().getAntiAddictionToastEnable24hourTime().booleanValue();
        } catch (C10174a unused) {
            z = false;
        }
        if (z) {
            return new SimpleDateFormat("HH:mm", Locale.ENGLISH);
        }
        return new SimpleDateFormat("hh:mm aa", Locale.ENGLISH);
    }

    /* renamed from: a */
    public final void mo60587a(VideoItemParams videoItemParams) {
        super.mo60587a(videoItemParams);
    }

    public C30850cj(View view) {
        super(view, C10181b.m20511a().mo18172a(WidgetAsyncAB.class, true, "widget_open", 31744, false));
    }

    /* renamed from: a */
    public final void mo60586a(DataCenter dataCenter) {
        dataCenter.mo48226a("on_page_selected", (C0199s<C23274a>) this.f79009b).mo48226a("on_render_ready", (C0199s<C23274a>) this.f79009b).mo48226a("already_hide_mix_enter", (C0199s<C23274a>) this.f79009b);
    }

    /* renamed from: a */
    public final void mo60585a(View view) {
        this.f79019l = ((X2CItemFeed) C35857a.m81002b(X2CItemFeed.class)).getView(this.f79017j, R.layout.b5l);
        this.f80797p = (ViewGroup) this.f79019l.findViewById(R.id.dp);
        this.f80797p.setOnClickListener(C30858ck.f80811a);
    }

    /* renamed from: c */
    public final void mo63584c(final Map<String, Object> map) {
        if (C23729p.m58262a((View) this.f80797p)) {
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public final void run() {
                    if (C30850cj.this.f80797p != null) {
                        TextView textView = (TextView) C30850cj.this.f80797p.findViewById(R.id.d6m);
                        String charSequence = textView.getText().toString();
                        if (!TextUtils.isEmpty(charSequence)) {
                            textView.setText(C2240a.m6772a(C30850cj.this.f79017j.getResources().getString(R.string.fp), new Object[]{C30850cj.m72268j().format(new Date(System.currentTimeMillis())), charSequence}));
                            C25945k.m62916g().mo54095a(C30850cj.this.f80797p, 0, 360, true);
                            C30255o.f79039a.mo60617a(new C30256p(C30850cj.this.f79008a, new Runnable() {
                                public final void run() {
                                    if (C23729p.m58262a((View) C30850cj.this.f80797p)) {
                                        C30850cj.this.f80798q = true;
                                    }
                                }
                            }));
                            C40859b.f104022a.getAntiAddictionService().mo83192c();
                        }
                    }
                }
            }, 100);
            handler.postDelayed(new Runnable() {
                public final void run() {
                    if (C30850cj.this.f80797p != null) {
                        C25945k.m62916g().mo54095a(C30850cj.this.f80797p, -C30850cj.this.f80797p.getHeight(), 360, false);
                        handler.postDelayed(new Runnable() {
                            public final void run() {
                                if (C30850cj.this.mo63585d(map)) {
                                    C30850cj.this.f79016i.mo48228a("need_show_mix_enter", (Object) Integer.valueOf(1));
                                }
                            }
                        }, 360);
                    }
                }
            }, 7000);
        }
    }

    /* renamed from: d */
    public final boolean mo63585d(Map<String, Object> map) {
        String str = (String) map.get("event_type_state");
        Aweme aweme = (Aweme) map.get("aweme_state");
        if (FeedParamProvider.m71941a(this.f79017j).isHotSpot() || !C23794bh.m58395i().mo76336b(aweme, this.f79022o, str)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cd  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a mo60590b(com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            super.mo60590b(r8)
            java.lang.String r1 = r8.f62242a
            java.lang.String r2 = "video_params"
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 == 0) goto L_0x00f9
            java.lang.Object r8 = r8.mo48246a()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r8 = (com.p683ss.android.ugc.aweme.feed.model.VideoItemParams) r8
            if (r8 == 0) goto L_0x00f8
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            com.ss.android.ugc.aweme.arch.widgets.base.a r0 = new com.ss.android.ugc.aweme.arch.widgets.base.a
            java.lang.String r1 = "ui_state"
            r0.<init>(r1, r8)
            java.lang.String r1 = "aweme_state"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r7.f79011d
            r8.put(r1, r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f79011d
            boolean r1 = com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30253m.m71085a(r1)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0058
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f79011d
            boolean r1 = r1.isHotSearchAweme()
            if (r1 != 0) goto L_0x0058
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f79011d
            boolean r1 = r1.isHotVideoAweme()
            if (r1 != 0) goto L_0x0058
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f79011d
            boolean r1 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72842j(r1)
            if (r1 != 0) goto L_0x0058
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f79011d
            boolean r1 = com.p683ss.android.ugc.aweme.feed.utils.C31186b.m72814b(r1)
            if (r1 != 0) goto L_0x0058
            r1 = 1
            goto L_0x0059
        L_0x0058:
            r1 = 0
        L_0x0059:
            java.lang.String r4 = "check_pri_state"
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r8.put(r4, r1)
            java.lang.String r1 = "check_mt_reieve_state"
            com.ss.android.ugc.aweme.protection.api.services.b r4 = com.p683ss.android.ugc.aweme.protection.api.services.C40859b.f104022a
            com.ss.android.ugc.aweme.protection.api.services.c r4 = r4.getAntiAddictionService()
            boolean r4 = r4.mo83193d()
            if (r4 == 0) goto L_0x00b7
            android.content.Context r4 = r7.f79017j
            android.support.v4.app.FragmentActivity r4 = (android.support.p030v4.app.FragmentActivity) r4
            com.ss.android.ugc.aweme.main.TabChangeManager r4 = com.p683ss.android.ugc.aweme.main.TabChangeManager.m82396a(r4)
            android.support.v4.app.Fragment r4 = r4.mo75609a()
            boolean r5 = r4 instanceof com.p683ss.android.ugc.aweme.main.C36664i
            if (r5 == 0) goto L_0x00b7
            com.ss.android.ugc.aweme.main.i r4 = (com.p683ss.android.ugc.aweme.main.C36664i) r4
            com.ss.android.ugc.aweme.base.e.a r4 = r4.mo75499c()
            boolean r5 = r4 instanceof com.p683ss.android.ugc.aweme.main.C36617e
            if (r5 == 0) goto L_0x00b7
            com.ss.android.ugc.aweme.main.e r4 = (com.p683ss.android.ugc.aweme.main.C36617e) r4
            java.lang.String r4 = r4.mo63459s()
            java.lang.String r5 = "FeedRecommendFragment"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0099
            goto L_0x00b7
        L_0x0099:
            com.ss.android.ugc.aweme.protection.api.services.b r4 = com.p683ss.android.ugc.aweme.protection.api.services.C40859b.f104022a
            com.ss.android.ugc.aweme.protection.api.services.c r4 = r4.getAntiAddictionService()
            java.lang.String r4 = r4.mo83195f()
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r7.f79011d
            java.lang.String r5 = r5.getAid()
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 != 0) goto L_0x00b7
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 == 0) goto L_0x00b7
            r4 = 1
            goto L_0x00b8
        L_0x00b7:
            r4 = 0
        L_0x00b8:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r8.put(r1, r4)
            java.lang.String r1 = "check_pri_state"
            java.lang.Object r1 = r8.get(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x00f5
            com.ss.android.ugc.aweme.protection.api.services.b r1 = com.p683ss.android.ugc.aweme.protection.api.services.C40859b.f104022a
            com.ss.android.ugc.aweme.protection.api.services.c r1 = r1.getAntiAddictionService()
            java.lang.String r1 = r1.mo83188a()
            java.lang.String r4 = "hint_minite_state"
            r8.put(r4, r1)
            java.lang.String r4 = "check_mt_reieve_state"
            java.lang.Object r8 = r8.get(r4)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x00ed
            r7.f80799r = r2
            goto L_0x00f7
        L_0x00ed:
            boolean r8 = android.text.TextUtils.isEmpty(r1)
            if (r8 != 0) goto L_0x00f5
            r7.f80798q = r3
        L_0x00f5:
            r7.f80799r = r3
        L_0x00f7:
            return r0
        L_0x00f8:
            return r0
        L_0x00f9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.C30850cj.mo60590b(com.ss.android.ugc.aweme.arch.widgets.base.a):com.ss.android.ugc.aweme.arch.widgets.base.a");
    }

    /* renamed from: e */
    public final void mo60600e(C23274a aVar) {
        if (aVar != null && !this.f80799r) {
            String str = aVar.f62242a;
            char c = 65535;
            int hashCode = str.hashCode();
            boolean z = true;
            if (hashCode != -1266775233) {
                if (hashCode != -962685926) {
                    if (hashCode == 350216171 && str.equals("on_page_selected")) {
                        c = 0;
                    }
                } else if (str.equals("on_render_ready")) {
                    c = 1;
                }
            } else if (str.equals("already_hide_mix_enter")) {
                c = 2;
            }
            switch (c) {
                case 0:
                    C30255o.f79039a.mo60617a(new C30256p(false, new Runnable() {
                        public final void run() {
                        }
                    }));
                    return;
                case 1:
                    if (!this.f80798q) {
                        final HashMap hashMap = new HashMap();
                        hashMap.put("aweme_state", this.f79011d);
                        hashMap.put("event_type_state", this.f79012e);
                        C30255o.f79039a.mo60617a(new C30256p(false, new Runnable() {
                            public final void run() {
                                if (C23729p.m58262a((View) C30850cj.this.f80797p)) {
                                    if (C30850cj.this.mo63585d(hashMap)) {
                                        C30850cj.this.f79016i.mo48228a("need_hide_mix_enter", (Object) Integer.valueOf(1));
                                        return;
                                    }
                                    C30850cj.this.mo63584c(hashMap);
                                }
                            }
                        }));
                        break;
                    }
                    break;
                case 2:
                    break;
            }
            if (!this.f80798q) {
                if (FeedParamProvider.m71941a(this.f79017j).isHotSpot() || !C23794bh.m58395i().mo76336b(this.f79011d, this.f79022o, this.f79012e)) {
                    z = false;
                }
                if (z) {
                    final HashMap hashMap2 = new HashMap();
                    hashMap2.put("aweme_state", this.f79011d);
                    hashMap2.put("event_type_state", this.f79012e);
                    C30255o.f79039a.mo60617a(new C30256p(false, new Runnable() {
                        public final void run() {
                            if (C23729p.m58262a((View) C30850cj.this.f80797p)) {
                                C30850cj.this.mo63584c(hashMap2);
                            }
                        }
                    }));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo60584a(int i, C23274a aVar) {
        if (!this.f79010c) {
            this.f79010c = true;
            if (this.f79018k instanceof FrameLayout) {
                ((FrameLayout) this.f79018k).addView(this.f79019l);
            }
        }
        if (aVar != null) {
            HashMap hashMap = (HashMap) aVar.mo48246a();
            if (hashMap != null) {
                TextView textView = (TextView) this.f80797p.findViewById(R.id.d6m);
                ImageView imageView = (ImageView) this.f80797p.findViewById(R.id.axv);
                if (((Boolean) hashMap.get("check_pri_state")).booleanValue()) {
                    String str = (String) hashMap.get("hint_minite_state");
                    if (((Boolean) hashMap.get("check_mt_reieve_state")).booleanValue()) {
                        this.f80797p.setVisibility(0);
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f80797p.getLayoutParams();
                        marginLayoutParams.height = (int) C9432q.m18687b(this.f79017j, 32.0f);
                        marginLayoutParams.bottomMargin = 0;
                        this.f80797p.setLayoutParams(marginLayoutParams);
                        textView.setText(C40859b.f104022a.getAntiAddictionService().mo83194e());
                        textView.setTextColor(C0726c.m2098c(this.f79017j, R.color.aso));
                        imageView.setImageResource(R.drawable.csp);
                        return;
                    } else if (!TextUtils.isEmpty(str)) {
                        this.f80797p.setVisibility(0);
                        MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) this.f80797p.getLayoutParams();
                        marginLayoutParams2.height = (int) C9432q.m18687b(this.f79017j, 48.0f);
                        marginLayoutParams2.bottomMargin = (int) C9432q.m18687b(this.f79017j, -48.0f);
                        this.f80797p.setLayoutParams(marginLayoutParams2);
                        textView.setTextColor(C0726c.m2098c(this.f79017j, R.color.vc));
                        textView.setText(str);
                        imageView.setImageResource(R.drawable.cst);
                        return;
                    }
                }
                this.f80797p.setVisibility(8);
                textView.setText("");
            }
        }
    }
}
