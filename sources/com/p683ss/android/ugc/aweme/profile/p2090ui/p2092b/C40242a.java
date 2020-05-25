package com.p683ss.android.ugc.aweme.profile.p2090ui.p2092b;

import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40357dx;
import com.p683ss.android.ugc.aweme.profile.p2090ui.EnterpriseTransformLayout;
import com.p683ss.android.ugc.aweme.profile.p2090ui.I18nBaseMyProfileFragment;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.C40471x;
import com.p683ss.android.ugc.aweme.profile.service.C40010c;
import com.p683ss.android.ugc.aweme.translation.p2373ui.TranslationStatusView;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.b.a */
public final class C40242a extends I18nBaseMyProfileFragment {

    /* renamed from: av */
    public static final C40243a f102774av = new C40243a(null);

    /* renamed from: ar */
    public boolean f102775ar;

    /* renamed from: as */
    public boolean f102776as;

    /* renamed from: at */
    public final C40357dx f102777at = new C40357dx();

    /* renamed from: au */
    public boolean f102778au;

    /* renamed from: aw */
    private C40471x f102779aw;

    /* renamed from: ax */
    private View f102780ax;

    /* renamed from: ay */
    private HashMap f102781ay;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.b.a$a */
    public static final class C40243a {
        private C40243a() {
        }

        public /* synthetic */ C40243a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.b.a$b */
    static final class C40244b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C40242a f102782a;

        C40244b(C40242a aVar) {
            this.f102782a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C26890h.m65011a("enter_profile_bio", C23089d.m56640a().mo47829a("enter_method", "click_hint").f61491a);
            this.f102782a.f102778au = false;
            C40242a aVar = this.f102782a;
            C52711k.m112236a((Object) view, "view");
            User user = aVar.f103081w;
            C52711k.m112236a((Object) user, "mUser");
            if (TextUtils.isEmpty(user.getSignature()) && !C32800a.m75679a(view)) {
                Keva keva = C40249e.f102788a;
                if (keva != null) {
                    keva.storeBoolean("profile_v2_show_bio_hint", false);
                }
                C40010c.f101950a.mo82032d(aVar.getActivity());
                FragmentActivity activity = aVar.getActivity();
                if (activity != null) {
                    activity.overridePendingTransition(R.anim.bm, R.anim.dp);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.b.a$c */
    static final class C40245c implements OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ C40242a f102783a;

        C40245c(C40242a aVar) {
            this.f102783a = aVar;
        }

        public final void onDismiss() {
            int i;
            boolean z;
            TextView textView = this.f102783a.f103076r;
            C52711k.m112236a((Object) textView, "txtUserId");
            CharSequence obj = textView.getText().toString();
            int length = obj.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                if (!z2) {
                    i = i2;
                } else {
                    i = length;
                }
                if (obj.charAt(i) <= ' ') {
                    z = true;
                } else {
                    z = false;
                }
                if (z2) {
                    if (!z) {
                        break;
                    }
                    length--;
                } else if (!z) {
                    z2 = true;
                } else {
                    i2++;
                }
            }
            String obj2 = obj.subSequence(i2, length + 1).toString();
            CharSequence charSequence = obj2;
            if (!TextUtils.isEmpty(charSequence) && C52830p.m112413c(obj2, " T", false, 2, null)) {
                C52830p.m112419a(charSequence, " T", 0, false, 6, (Object) null);
                this.f102783a.mo82485m(R.drawable.dnk);
            }
            this.f102783a.f102776as = false;
        }
    }

    /* renamed from: K */
    public final void mo82484K() {
        if (this.f102781ay != null) {
            this.f102781ay.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo82484K();
    }

    /* renamed from: I */
    private final void m89502I() {
        this.f102777at.mo82601a(this);
    }

    public final void onPause() {
        super.onPause();
        this.f102775ar = false;
    }

    /* renamed from: o */
    public final void mo82456o() {
        super.mo82456o();
        TranslationStatusView translationStatusView = this.f102721V;
        if (translationStatusView != null) {
            translationStatusView.mo94641a();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f102775ar = true;
        if (this.f102158ap && this.f102778au) {
            C40247c.m89516a();
        }
        if (isVisible()) {
            m89502I();
        }
    }

    /* renamed from: d */
    public final void mo81903d(User user) {
        super.mo81903d(user);
        EnterpriseTransformLayout enterpriseTransformLayout = this.f102715P;
        if (enterpriseTransformLayout != null) {
            enterpriseTransformLayout.mo82121a();
        }
    }

    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z) {
            m89502I();
        }
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (this.f102779aw != null) {
            C40471x xVar = this.f102779aw;
            if (xVar != null && xVar.isShowing()) {
                C40471x xVar2 = this.f102779aw;
                if (xVar2 != null) {
                    xVar2.dismiss();
                }
            }
        }
        if (z && this.f102778au) {
            C40247c.m89516a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        if (r5.f103081w.nicknameUpdateReminder() != false) goto L_0x0078;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo82485m(int r6) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.profile.model.User r6 = r5.f103081w
            if (r6 != 0) goto L_0x0005
            return
        L_0x0005:
            boolean r6 = r5.isViewValid()
            if (r6 == 0) goto L_0x00d0
            android.widget.TextView r6 = r5.f103076r
            if (r6 == 0) goto L_0x00d0
            com.ss.android.ugc.aweme.profile.model.User r6 = r5.f103081w
            java.lang.String r6 = r6.getUniqueId()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x0024
            com.ss.android.ugc.aweme.profile.model.User r6 = r5.f103081w
            java.lang.String r6 = r6.getShortId()
            goto L_0x002a
        L_0x0024:
            com.ss.android.ugc.aweme.profile.model.User r6 = r5.f103081w
            java.lang.String r6 = r6.getUniqueId()
        L_0x002a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "@"
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            android.widget.TextView r0 = r5.f103076r
            java.lang.String r1 = "txtUserId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r0.setText(r6)
            r5.mo82153F()
            boolean r6 = com.p683ss.android.ugc.aweme.experiment.C29508i.m69649c()
            if (r6 == 0) goto L_0x0078
            com.ss.android.ugc.aweme.profile.model.User r6 = r5.f103081w
            if (r6 == 0) goto L_0x0067
            com.ss.android.ugc.aweme.profile.model.User r6 = r5.f103081w
            java.lang.String r0 = "mUser"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)
            boolean r6 = r6.isSecret()
            if (r6 != 0) goto L_0x0067
            com.ss.android.ugc.aweme.profile.model.User r6 = r5.f103081w
            boolean r6 = r6.nicknameUpdateReminder()
            if (r6 == 0) goto L_0x0067
            goto L_0x0078
        L_0x0067:
            android.widget.TextView r6 = r5.f103076r
            android.content.res.Resources r0 = r5.getResources()
            r1 = 2131822159(0x7f11064f, float:1.9277082E38)
            int r0 = r0.getColor(r1)
            r6.setTextColor(r0)
            goto L_0x00d0
        L_0x0078:
            java.lang.String r6 = " T"
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>()
            android.widget.TextView r1 = r5.f103076r
            java.lang.String r2 = "txtUserId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.lang.CharSequence r1 = r1.getText()
            r0.append(r1)
            r1 = r6
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.append(r1)
            com.ss.android.ugc.aweme.profile.util.aj r1 = new com.ss.android.ugc.aweme.profile.util.aj
            android.content.Context r2 = r5.getContext()
            r3 = 2131954953(0x7f130d09, float:1.954642E38)
            r4 = 1
            r1.<init>(r2, r3, r4)
            int r2 = r0.length()
            int r6 = r6.length()
            int r2 = r2 - r6
            int r2 = r2 + r4
            int r6 = r0.length()
            r3 = 17
            r0.setSpan(r1, r2, r6, r3)
            android.widget.TextView r6 = r5.f103076r
            java.lang.String r1 = "txtUserId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r6.setText(r0)
            android.widget.TextView r6 = r5.f103076r
            android.content.res.Resources r0 = r5.getResources()
            r1 = 2131822160(0x7f110650, float:1.9277084E38)
            int r0 = r0.getColor(r1)
            r6.setTextColor(r0)
            return
        L_0x00d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.p2090ui.p2092b.C40242a.mo82485m(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cc, code lost:
        if (r0.isShowing() == false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0188, code lost:
        if (r12.f102776as == false) goto L_0x018a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo81896b(java.lang.String r13) {
        /*
            r12 = this;
            super.mo81896b(r13)
            com.ss.android.ugc.aweme.profile.model.User r13 = r12.f103081w
            if (r13 == 0) goto L_0x0191
            boolean r0 = com.p683ss.android.ugc.aweme.experiment.C29508i.m69649c()
            if (r0 == 0) goto L_0x0013
            boolean r0 = r13.nicknameUpdateReminder()
            if (r0 == 0) goto L_0x0190
        L_0x0013:
            boolean r13 = r13.nicknameUpdateReminder()
            boolean r0 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103651b()
            if (r0 != 0) goto L_0x0190
            android.support.v4.app.FragmentActivity r0 = r12.getActivity()
            if (r0 == 0) goto L_0x0191
            android.view.View r0 = r12.getView()
            if (r0 == 0) goto L_0x0191
            boolean r0 = r12.isViewValid()
            if (r0 == 0) goto L_0x0191
            com.ss.android.ugc.aweme.profile.model.User r0 = r12.f103081w
            if (r0 == 0) goto L_0x0191
            com.ss.android.ugc.aweme.profile.model.User r0 = r12.f103081w
            java.lang.String r1 = "mUser"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.String r0 = r0.getUid()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0048
            goto L_0x0191
        L_0x0048:
            com.ss.android.ugc.aweme.profile.model.User r0 = r12.f103081w
            java.lang.String r1 = "mUser"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.String r0 = r0.getUid()
            java.lang.String r1 = "mUser.uid"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.String r1 = "userId"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r1)
            com.ss.android.ugc.aweme.base.h.g r1 = com.p683ss.android.ugc.aweme.experiment.C29508i.f77294a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "last_time_show_change_username_bubble_"
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r2 = 0
            long r0 = r1.mo48700a(r0, r2)
            long r2 = java.lang.System.currentTimeMillis()
            com.bytedance.ies.abmock.b r4 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.experiment.ChangeUsernameBubbleExperiment> r5 = com.p683ss.android.ugc.aweme.experiment.ChangeUsernameBubbleExperiment.class
            r6 = 1
            java.lang.String r7 = "username_modify_tip_interval"
            r8 = 31744(0x7c00, float:4.4483E-41)
            r9 = 1
            int r4 = r4.mo18168a(r5, r6, r7, r8, r9)
            r5 = 1
            if (r4 != r5) goto L_0x008d
            r4 = 168(0xa8, float:2.35E-43)
            goto L_0x00a5
        L_0x008d:
            com.bytedance.ies.abmock.b r6 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.experiment.ChangeUsernameBubbleExperiment> r7 = com.p683ss.android.ugc.aweme.experiment.ChangeUsernameBubbleExperiment.class
            r8 = 1
            java.lang.String r9 = "username_modify_tip_interval"
            r10 = 31744(0x7c00, float:4.4483E-41)
            r11 = 1
            int r4 = r6.mo18168a(r7, r8, r9, r10, r11)
            r6 = 2
            if (r4 != r6) goto L_0x00a3
            r4 = 72
            goto L_0x00a5
        L_0x00a3:
            r4 = 24
        L_0x00a5:
            r6 = 0
            long r0 = r2 - r0
            r6 = 3600000(0x36ee80, float:5.044674E-39)
            int r4 = r4 * r6
            long r6 = (long) r4
            r4 = 0
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x00b5
            r0 = 1
            goto L_0x00b6
        L_0x00b5:
            r0 = 0
        L_0x00b6:
            if (r0 == 0) goto L_0x0178
            boolean r0 = r12.f102158ap
            if (r0 == 0) goto L_0x0162
            boolean r0 = r12.f102775ar
            if (r0 == 0) goto L_0x0162
            com.ss.android.ugc.aweme.profile.ui.widget.x r0 = r12.f102779aw
            if (r0 == 0) goto L_0x00ce
            com.ss.android.ugc.aweme.profile.ui.widget.x r0 = r12.f102779aw
            if (r0 == 0) goto L_0x0191
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto L_0x0190
        L_0x00ce:
            com.ss.android.ugc.aweme.profile.ui.widget.x r0 = new com.ss.android.ugc.aweme.profile.ui.widget.x
            android.support.v4.app.FragmentActivity r1 = r12.getActivity()
            if (r1 != 0) goto L_0x00d9
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00d9:
            java.lang.String r6 = "activity!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r6)
            android.app.Activity r1 = (android.app.Activity) r1
            r0.<init>(r1, r13)
            r12.f102779aw = r0
            com.ss.android.ugc.aweme.profile.ui.widget.x r13 = r12.f102779aw
            if (r13 == 0) goto L_0x00f3
            com.ss.android.ugc.aweme.profile.ui.b.a$c r0 = new com.ss.android.ugc.aweme.profile.ui.b.a$c
            r0.<init>(r12)
            android.widget.PopupWindow$OnDismissListener r0 = (android.widget.PopupWindow.OnDismissListener) r0
            r13.setOnDismissListener(r0)
        L_0x00f3:
            com.ss.android.ugc.aweme.profile.ui.widget.x r13 = r12.f102779aw
            if (r13 == 0) goto L_0x0137
            android.widget.TextView r0 = r12.f103076r
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x0137
            java.lang.String r1 = com.p683ss.android.ugc.aweme.profile.p2090ui.widget.C40471x.f103315g
            com.p683ss.android.ugc.aweme.common.C26890h.onEventV3(r1)
            android.app.Activity r1 = r13.f103318b
            if (r1 == 0) goto L_0x0137
            boolean r1 = r13.isShowing()
            if (r1 != 0) goto L_0x0137
            android.app.Activity r1 = r13.f103318b
            boolean r1 = r1.isFinishing()
            if (r1 != 0) goto L_0x0137
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            com.ss.android.ugc.aweme.profile.ui.widget.x$c r4 = new com.ss.android.ugc.aweme.profile.ui.widget.x$c
            r4.<init>(r13, r0)
            android.view.ViewTreeObserver$OnGlobalLayoutListener r4 = (android.view.ViewTreeObserver.OnGlobalLayoutListener) r4
            r1.addOnGlobalLayoutListener(r4)
            android.view.View r0 = r13.getContentView()
            java.lang.Runnable r1 = r13.f103317a
            r0.removeCallbacks(r1)
            android.view.View r0 = r13.getContentView()
            java.lang.Runnable r13 = r13.f103317a
            r6 = 6000(0x1770, double:2.9644E-320)
            r0.postDelayed(r13, r6)
            r4 = 1
        L_0x0137:
            r12.f102776as = r4
            com.ss.android.ugc.aweme.profile.model.User r13 = r12.f103081w
            java.lang.String r0 = "mUser"
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, r0)
            java.lang.String r13 = r13.getUid()
            java.lang.String r0 = "mUser.uid"
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, r0)
            java.lang.String r0 = "userId"
            p2628d.p2639f.p2641b.C52711k.m112240b(r13, r0)
            com.ss.android.ugc.aweme.base.h.g r0 = com.p683ss.android.ugc.aweme.experiment.C29508i.f77294a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "last_time_show_change_username_bubble_"
            r1.<init>(r4)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.mo48708b(r13, r2)
            goto L_0x0191
        L_0x0162:
            com.ss.android.ugc.aweme.profile.ui.widget.x r13 = r12.f102779aw
            if (r13 == 0) goto L_0x0191
            com.ss.android.ugc.aweme.profile.ui.widget.x r13 = r12.f102779aw
            if (r13 == 0) goto L_0x0190
            boolean r13 = r13.isShowing()
            if (r13 != r5) goto L_0x0191
            com.ss.android.ugc.aweme.profile.ui.widget.x r13 = r12.f102779aw
            if (r13 == 0) goto L_0x0191
            r13.dismiss()
            goto L_0x0190
        L_0x0178:
            com.ss.android.ugc.aweme.profile.ui.widget.x r13 = r12.f102779aw
            if (r13 == 0) goto L_0x018a
            com.ss.android.ugc.aweme.profile.ui.widget.x r13 = r12.f102779aw
            if (r13 == 0) goto L_0x0191
            boolean r13 = r13.isShowing()
            if (r13 != 0) goto L_0x0190
            boolean r13 = r12.f102776as
            if (r13 != 0) goto L_0x0190
        L_0x018a:
            r13 = 2131954953(0x7f130d09, float:1.954642E38)
            r12.mo82485m(r13)
        L_0x0190:
            return
        L_0x0191:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.p2090ui.p2092b.C40242a.mo81896b(java.lang.String):void");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        this.f102780ax = view.findViewById(R.id.f09);
    }

    /* renamed from: a */
    public final void mo81887a(int i, String str) {
        boolean z;
        TextView textView = this.f103074p;
        if (textView != null) {
            textView.setOnClickListener(null);
        }
        if (!C47915gg.m103651b() && TextUtils.isEmpty(str)) {
            if (C40249e.f102788a != null) {
                Keva keva = C40249e.f102788a;
                if (keva == null) {
                    C52711k.m112234a();
                }
                z = keva.getBoolean("profile_v2_show_bio_hint", true);
            } else {
                z = false;
            }
            if (z) {
                this.f102778au = true;
                TextView textView2 = this.f103074p;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                    textView2.setText(getResources().getString(R.string.co3));
                    textView2.setOnClickListener(new C40244b(this));
                }
                return;
            }
        }
        super.mo81887a(i, str);
    }
}
