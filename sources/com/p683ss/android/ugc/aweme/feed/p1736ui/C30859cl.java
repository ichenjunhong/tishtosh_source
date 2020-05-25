package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.arch.lifecycle.C0199s;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.ies.C10174a;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25908e;
import com.p683ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p683ss.android.ugc.aweme.protection.api.services.C40859b;
import com.ss.android.ugc.trill.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.cl */
public final class C30859cl extends C31009h implements C0199s<C23274a> {

    /* renamed from: a */
    public ViewGroup f80812a;

    /* renamed from: b */
    public boolean f80813b;

    /* renamed from: c */
    private C25908e f80814c;

    /* renamed from: d */
    private boolean f80815d;

    /* renamed from: a */
    public final void mo49781a() {
    }

    /* renamed from: d */
    public final boolean mo63594d() {
        if (FeedParamProvider.m71941a(this.f81198r).isHotSpot() || !C23794bh.m58395i().mo76336b(this.f81192l, this.f81202v, this.f81193m)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static SimpleDateFormat m72278e() {
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

    /* renamed from: j */
    private void m72279j() {
        if (C23729p.m58262a((View) this.f80812a) && !this.f80813b) {
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public final void run() {
                    if (C30859cl.this.f80812a != null) {
                        TextView textView = (TextView) C30859cl.this.f80812a.findViewById(R.id.d6m);
                        String charSequence = textView.getText().toString();
                        if (!TextUtils.isEmpty(charSequence)) {
                            textView.setText(C2240a.m6772a(C30859cl.this.f81198r.getResources().getString(R.string.fp), new Object[]{C30859cl.m72278e().format(new Date(System.currentTimeMillis())), charSequence}));
                            C25945k.m62916g().mo54095a(C30859cl.this.f80812a, 0, 360, true);
                            C30859cl.this.f80813b = true;
                            C40859b.f104022a.getAntiAddictionService().mo83192c();
                        }
                    }
                }
            }, 100);
            handler.postDelayed(new Runnable() {
                public final void run() {
                    if (C30859cl.this.f80812a != null) {
                        C25945k.m62916g().mo54095a(C30859cl.this.f80812a, -C30859cl.this.f80812a.getHeight(), 360, false);
                        handler.postDelayed(new Runnable() {
                            public final void run() {
                                if (C30859cl.this.mo63594d()) {
                                    C30859cl.this.f81197q.mo48228a("need_show_mix_enter", (Object) Integer.valueOf(1));
                                }
                            }
                        }, 360);
                    }
                }
            }, 7000);
        }
    }

    public C30859cl(View view) {
        super(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49784a(DataCenter dataCenter) {
        dataCenter.mo48226a("on_page_selected", (C0199s<C23274a>) this).mo48226a("on_render_ready", (C0199s<C23274a>) this).mo48226a("already_hide_mix_enter", (C0199s<C23274a>) this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49783a(View view) {
        View view2 = ((X2CItemFeed) C35857a.m81002b(X2CItemFeed.class)).getView(this.f81198r, R.layout.b5l);
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(view2);
        }
        this.f80812a = (ViewGroup) view.findViewById(R.id.dp);
        this.f80812a.setOnClickListener(C30863cm.f80820a);
    }

    public final /* synthetic */ void onChanged(Object obj) {
        C23274a aVar = (C23274a) obj;
        if (aVar != null && !this.f80815d) {
            String str = aVar.f62242a;
            char c = 65535;
            int hashCode = str.hashCode();
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
                    return;
                case 1:
                    if (C23729p.m58262a((View) this.f80812a) && !this.f80813b) {
                        if (!mo63594d()) {
                            m72279j();
                            break;
                        } else {
                            this.f81197q.mo48228a("need_hide_mix_enter", (Object) Integer.valueOf(1));
                            break;
                        }
                    }
                case 2:
                    break;
            }
            if (C23729p.m58262a((View) this.f80812a) && !this.f80813b && mo63594d()) {
                m72279j();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58323a(com.p683ss.android.ugc.aweme.feed.model.VideoItemParams r8) {
        /*
            r7 = this;
            super.mo58323a(r8)
            if (r8 == 0) goto L_0x0149
            com.ss.android.ugc.aweme.commercialize.feed.e r8 = r8.mAdViewController
            r7.f80814c = r8
            android.view.ViewGroup r8 = r7.f80812a
            r0 = 2132023646(0x7f14195e, float:1.9685746E38)
            android.view.View r8 = r8.findViewById(r0)
            android.widget.TextView r8 = (android.widget.TextView) r8
            android.view.ViewGroup r0 = r7.f80812a
            r1 = 2132019913(0x7f140ac9, float:1.9678174E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            com.ss.android.ugc.aweme.commercialize.feed.e r1 = r7.f80814c
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x002f
            com.ss.android.ugc.aweme.commercialize.feed.e r1 = r7.f80814c
            boolean r1 = r1.mo53244a()
            if (r1 == 0) goto L_0x002f
            r1 = 1
            goto L_0x0030
        L_0x002f:
            r1 = 0
        L_0x0030:
            if (r1 != 0) goto L_0x013b
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f81192l
            boolean r1 = r1.isHotSearchAweme()
            if (r1 != 0) goto L_0x013b
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f81192l
            boolean r1 = r1.isHotVideoAweme()
            if (r1 != 0) goto L_0x013b
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f81192l
            boolean r1 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72842j(r1)
            if (r1 != 0) goto L_0x013b
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f81192l
            boolean r1 = com.p683ss.android.ugc.aweme.feed.utils.C31186b.m72814b(r1)
            if (r1 != 0) goto L_0x013b
            com.ss.android.ugc.aweme.protection.api.services.b r1 = com.p683ss.android.ugc.aweme.protection.api.services.C40859b.f104022a
            com.ss.android.ugc.aweme.protection.api.services.c r1 = r1.getAntiAddictionService()
            java.lang.String r1 = r1.mo83188a()
            com.ss.android.ugc.aweme.protection.api.services.b r4 = com.p683ss.android.ugc.aweme.protection.api.services.C40859b.f104022a
            com.ss.android.ugc.aweme.protection.api.services.c r4 = r4.getAntiAddictionService()
            boolean r4 = r4.mo83193d()
            if (r4 == 0) goto L_0x00af
            android.content.Context r4 = r7.f81198r
            android.support.v4.app.FragmentActivity r4 = (android.support.p030v4.app.FragmentActivity) r4
            com.ss.android.ugc.aweme.main.TabChangeManager r4 = com.p683ss.android.ugc.aweme.main.TabChangeManager.m82396a(r4)
            android.support.v4.app.Fragment r4 = r4.mo75609a()
            boolean r5 = r4 instanceof com.p683ss.android.ugc.aweme.main.C36664i
            if (r5 == 0) goto L_0x00af
            com.ss.android.ugc.aweme.main.i r4 = (com.p683ss.android.ugc.aweme.main.C36664i) r4
            com.ss.android.ugc.aweme.base.e.a r4 = r4.mo75499c()
            boolean r5 = r4 instanceof com.p683ss.android.ugc.aweme.main.C36617e
            if (r5 == 0) goto L_0x00af
            com.ss.android.ugc.aweme.main.e r4 = (com.p683ss.android.ugc.aweme.main.C36617e) r4
            java.lang.String r4 = r4.mo63459s()
            java.lang.String r5 = "FeedRecommendFragment"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0091
            goto L_0x00af
        L_0x0091:
            com.ss.android.ugc.aweme.protection.api.services.b r4 = com.p683ss.android.ugc.aweme.protection.api.services.C40859b.f104022a
            com.ss.android.ugc.aweme.protection.api.services.c r4 = r4.getAntiAddictionService()
            java.lang.String r4 = r4.mo83195f()
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r7.f81192l
            java.lang.String r5 = r5.getAid()
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 != 0) goto L_0x00af
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 == 0) goto L_0x00af
            r4 = 1
            goto L_0x00b0
        L_0x00af:
            r4 = 0
        L_0x00b0:
            if (r4 == 0) goto L_0x00f3
            r7.f80815d = r2
            android.view.ViewGroup r1 = r7.f80812a
            r1.setVisibility(r3)
            android.view.ViewGroup r1 = r7.f80812a
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            android.content.Context r2 = r7.f81198r
            r4 = 1107296256(0x42000000, float:32.0)
            float r2 = com.bytedance.common.utility.C9432q.m18687b(r2, r4)
            int r2 = (int) r2
            r1.height = r2
            r1.bottomMargin = r3
            android.view.ViewGroup r2 = r7.f80812a
            r2.setLayoutParams(r1)
            com.ss.android.ugc.aweme.protection.api.services.b r1 = com.p683ss.android.ugc.aweme.protection.api.services.C40859b.f104022a
            com.ss.android.ugc.aweme.protection.api.services.c r1 = r1.getAntiAddictionService()
            java.lang.String r1 = r1.mo83194e()
            r8.setText(r1)
            android.content.Context r1 = r7.f81198r
            r2 = 2131823004(0x7f11099c, float:1.9278795E38)
            int r1 = android.support.p030v4.content.C0726c.m2098c(r1, r2)
            r8.setTextColor(r1)
            r8 = 2131952727(0x7f130457, float:1.9541905E38)
            r0.setImageResource(r8)
            return
        L_0x00f3:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x013b
            r7.f80813b = r3
            r7.f80815d = r3
            android.view.ViewGroup r2 = r7.f80812a
            r2.setVisibility(r3)
            android.view.ViewGroup r2 = r7.f80812a
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            android.content.Context r3 = r7.f81198r
            r4 = 1111490560(0x42400000, float:48.0)
            float r3 = com.bytedance.common.utility.C9432q.m18687b(r3, r4)
            int r3 = (int) r3
            r2.height = r3
            android.content.Context r3 = r7.f81198r
            r4 = -1035993088(0xffffffffc2400000, float:-48.0)
            float r3 = com.bytedance.common.utility.C9432q.m18687b(r3, r4)
            int r3 = (int) r3
            r2.bottomMargin = r3
            android.view.ViewGroup r3 = r7.f80812a
            r3.setLayoutParams(r2)
            android.content.Context r2 = r7.f81198r
            r3 = 2131821564(0x7f1103fc, float:1.9275875E38)
            int r2 = android.support.p030v4.content.C0726c.m2098c(r2, r3)
            r8.setTextColor(r2)
            r8.setText(r1)
            r8 = 2131952731(0x7f13045b, float:1.9541913E38)
            r0.setImageResource(r8)
            return
        L_0x013b:
            r7.f80815d = r3
            android.view.ViewGroup r0 = r7.f80812a
            r1 = 8
            r0.setVisibility(r1)
            java.lang.String r0 = ""
            r8.setText(r0)
        L_0x0149:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.C30859cl.mo58323a(com.ss.android.ugc.aweme.feed.model.VideoItemParams):void");
    }
}
