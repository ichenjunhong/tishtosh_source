package com.p683ss.android.ugc.aweme.longvideo;

import android.app.Activity;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.commercialize.egg.C25751b;
import com.p683ss.android.ugc.aweme.commercialize.egg.C25788h;
import com.p683ss.android.ugc.aweme.commercialize.egg.C25823j;
import com.p683ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1556a.C25746b;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1560e.C25773a;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1560e.C25778d;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1561f.C25780a;
import com.p683ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30472aa;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30503v;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.longvideo.p1933a.C36349a;
import com.p683ss.android.ugc.aweme.longvideo.p1934b.C36353b.C36354a;
import com.p683ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.longvideo.DiggView */
public final class DiggView implements C0183j, OnClickListener, C30503v {

    /* renamed from: a */
    public FragmentActivity f92962a;

    /* renamed from: b */
    public final ArrayList<C36332a> f92963b = new ArrayList<>();

    /* renamed from: c */
    CommerceEggLayout f92964c;

    /* renamed from: d */
    C25751b f92965d;

    /* renamed from: e */
    C25746b f92966e;

    /* renamed from: f */
    C25780a f92967f;

    /* renamed from: g */
    C25773a f92968g;

    /* renamed from: h */
    public final LongVideoDiggAnimationView f92969h;

    /* renamed from: i */
    public final TextView f92970i;

    /* renamed from: j */
    public final String f92971j;

    /* renamed from: k */
    private Aweme f92972k;

    /* renamed from: l */
    private C30472aa f92973l;

    /* renamed from: m */
    private long f92974m;

    /* renamed from: n */
    private int f92975n;

    /* renamed from: o */
    private int f92976o;

    /* renamed from: p */
    private CommerceLikeLayout f92977p;

    /* renamed from: q */
    private String f92978q;

    /* renamed from: com.ss.android.ugc.aweme.longvideo.DiggView$a */
    public interface C36332a {
        /* renamed from: a */
        void mo75228a();
    }

    /* renamed from: a */
    public final void mo60920a(Exception exc) {
        C22971a.m56493a((Context) this.f92962a, (Throwable) exc);
        m81970a(m81971a(Integer.valueOf(this.f92976o)));
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        C30472aa aaVar = this.f92973l;
        if (aaVar != null) {
            aaVar.aq_();
        }
        C30472aa aaVar2 = this.f92973l;
        if (aaVar2 != null) {
            aaVar2.mo46991S_();
        }
        this.f92963b.clear();
        this.f92964c = null;
        this.f92965d = null;
        this.f92966e = null;
        this.f92967f = null;
        this.f92968g = null;
    }

    /* renamed from: a */
    public final void mo75223a() {
        if (!this.f92969h.isSelected()) {
            m81968a((View) null);
        }
    }

    /* renamed from: a */
    private static boolean m81971a(Integer num) {
        if (num != null && num.intValue() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m81970a(boolean z) {
        if (this.f92972k != null) {
            this.f92969h.setSelected(z);
            TextView textView = this.f92970i;
            if (textView != null) {
                if (z) {
                    if (!m81971a(Integer.valueOf(this.f92975n))) {
                        textView.setText(C33095b.m76068a(this.f92974m + 1));
                    }
                } else if (m81971a(Integer.valueOf(this.f92975n))) {
                    textView.setText(C33095b.m76068a(this.f92974m - 1));
                }
                textView.setText(C33095b.m76068a(this.f92974m));
            }
        }
    }

    public final void onClick(View view) {
        String str;
        ClickInstrumentation.onClick(view);
        C47718bf.m103288a(new C36349a());
        if (!this.f92969h.isSelected()) {
            IAccountUserService a = C20902b.m53242a();
            C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
            if (a.isLogin() && this.f92972k != null) {
                if (C25823j.f68267a) {
                    C25780a aVar = this.f92967f;
                    if (aVar != null) {
                        C25778d dVar = new C25778d("like", null, null, null, 14, null);
                        aVar.mo52993a(dVar);
                    }
                } else if (C25788h.m62410a()) {
                    CommerceEggLayout commerceEggLayout = this.f92964c;
                    if (commerceEggLayout != null) {
                        commerceEggLayout.mo52925a(this.f92965d, this.f92966e, 1, true);
                    }
                } else {
                    CommerceLikeLayout commerceLikeLayout = this.f92977p;
                    if (commerceLikeLayout != null) {
                        String str2 = this.f92978q;
                        if (str2 == null) {
                            C52711k.m112237a("enterFrom");
                        }
                        Aweme aweme = this.f92972k;
                        if (aweme != null) {
                            str = aweme.getAid();
                        } else {
                            str = null;
                        }
                        commerceLikeLayout.mo54399a(str2, str);
                    }
                }
            }
        }
        m81968a(view);
    }

    /* renamed from: a */
    private final void m81968a(View view) {
        int i;
        String str;
        String str2;
        IAccountUserService a = C20902b.m53242a();
        C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
        if (!a.isLogin()) {
            if (TextUtils.equals(this.f92971j, "homepage_hot")) {
                i = R.string.c31;
            } else {
                i = R.string.bwi;
            }
            FragmentActivity fragmentActivity = this.f92962a;
            String str3 = null;
            if (fragmentActivity != null) {
                str = fragmentActivity.getString(i);
            } else {
                str = null;
            }
            Activity activity = this.f92962a;
            String str4 = this.f92971j;
            String str5 = "click_like";
            C47661ab a2 = C47661ab.m103163a().mo94972a("login_title", str);
            String str6 = "group_id";
            Aweme aweme = this.f92972k;
            if (aweme != null) {
                str2 = aweme.getAid();
            } else {
                str2 = null;
            }
            C47661ab a3 = a2.mo94972a(str6, str2);
            String str7 = "log_pb";
            Aweme aweme2 = this.f92972k;
            if (aweme2 != null) {
                str3 = aweme2.getAid();
            }
            C27965f.m66720a(activity, str4, str5, a3.mo94972a(str7, C23198ae.m56874k(str3)).f120139a);
            return;
        }
        this.f92969h.mo75316a(view);
        if (this.f92969h.isSelected()) {
            m81969a(C36354a.m82039a(this.f92972k), 0);
            m81970a(false);
            Iterator it = this.f92963b.iterator();
            while (it.hasNext()) {
                it.next();
            }
            return;
        }
        m81969a(C36354a.m82039a(this.f92972k), 1);
        m81970a(true);
        for (C36332a a4 : this.f92963b) {
            a4.mo75228a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r1 == null) goto L_0x000a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60919a(android.support.p030v4.p038f.C0794k<java.lang.String, java.lang.Integer> r4) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.feed.h.aw r0 = new com.ss.android.ugc.aweme.feed.h.aw
            if (r4 == 0) goto L_0x000a
            F r1 = r4.f2711a
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x000c
        L_0x000a:
            java.lang.String r1 = ""
        L_0x000c:
            r2 = 13
            r0.<init>(r2, r1)
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r0)
            com.ss.android.ugc.aweme.longvideo.b.b$a r0 = com.p683ss.android.ugc.aweme.longvideo.p1934b.C36353b.f93061a
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.f92972k
            java.lang.String r0 = com.p683ss.android.ugc.aweme.longvideo.p1934b.C36353b.C36354a.m82039a(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 0
            if (r4 == 0) goto L_0x0026
            F r2 = r4.f2711a
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0027
        L_0x0026:
            r2 = r1
        L_0x0027:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 == 0) goto L_0x003d
            if (r4 == 0) goto L_0x0036
            S r0 = r4.f2712b
            r1 = r0
            java.lang.Integer r1 = (java.lang.Integer) r1
        L_0x0036:
            boolean r0 = m81971a(r1)
            r3.m81970a(r0)
        L_0x003d:
            if (r4 == 0) goto L_0x004a
            S r4 = r4.f2712b
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L_0x004a
            int r4 = r4.intValue()
            goto L_0x004b
        L_0x004a:
            r4 = 0
        L_0x004b:
            r3.f92976o = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.longvideo.DiggView.mo60919a(android.support.v4.f.k):void");
    }

    /* renamed from: a */
    public final void mo75225a(C36332a aVar) {
        C52711k.m112240b(aVar, "diggCallback");
        if (!this.f92963b.contains(aVar)) {
            this.f92963b.add(aVar);
        }
    }

    /* renamed from: a */
    private final void m81969a(String str, int i) {
        C30472aa aaVar = this.f92973l;
        if (aaVar != null) {
            aaVar.mo44934a_(str, Integer.valueOf(i), this.f92971j);
        }
    }

    public DiggView(LongVideoDiggAnimationView longVideoDiggAnimationView, TextView textView, String str) {
        C52711k.m112240b(longVideoDiggAnimationView, "diggAnimationView");
        C52711k.m112240b(str, "mEventType");
        this.f92969h = longVideoDiggAnimationView;
        this.f92970i = textView;
        this.f92971j = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008d A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo75224a(android.support.p030v4.app.FragmentActivity r2, com.p683ss.android.ugc.aweme.feed.model.Aweme r3, com.p683ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout r4, java.lang.String r5) {
        /*
            r1 = this;
            java.lang.String r0 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r0)
            java.lang.String r0 = "enterFrom"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
            r1.f92962a = r2
            android.arch.lifecycle.h r2 = r2.getLifecycle()
            r0 = r1
            android.arch.lifecycle.j r0 = (android.arch.lifecycle.C0183j) r0
            r2.mo324a(r0)
            r1.f92972k = r3
            r1.f92978q = r5
            r1.f92977p = r4
            com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView r2 = r1.f92969h
            r3 = 2131952922(0x7f13051a, float:1.95423E38)
            r2.setImageResource(r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r1.f92972k
            if (r2 == 0) goto L_0x002d
            int r2 = r2.getUserDigg()
            goto L_0x002e
        L_0x002d:
            r2 = 0
        L_0x002e:
            r1.f92975n = r2
            int r2 = r1.f92975n
            r1.f92976o = r2
            com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView r2 = r1.f92969h
            int r3 = r1.f92975n
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = m81971a(r3)
            r2.setSelected(r3)
            com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView r2 = r1.f92969h
            r3 = r1
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r2.setOnClickListener(r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r1.f92972k
            if (r2 == 0) goto L_0x005a
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r2 = r2.getStatistics()
            if (r2 == 0) goto L_0x005a
            long r2 = r2.getDiggCount()
            goto L_0x005c
        L_0x005a:
            r2 = 0
        L_0x005c:
            r1.f92974m = r2
            android.widget.TextView r2 = r1.f92970i
            if (r2 == 0) goto L_0x006d
            long r3 = r1.f92974m
            java.lang.String r3 = com.p683ss.android.ugc.aweme.i18n.C33095b.m76068a(r3)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.setText(r3)
        L_0x006d:
            com.ss.android.ugc.aweme.feed.m.aa r2 = new com.ss.android.ugc.aweme.feed.m.aa
            r2.<init>()
            r1.f92973l = r2
            com.ss.android.ugc.aweme.feed.m.aa r2 = r1.f92973l
            if (r2 == 0) goto L_0x0082
            com.ss.android.ugc.aweme.feed.m.z r3 = new com.ss.android.ugc.aweme.feed.m.z
            r3.<init>()
            com.ss.android.ugc.aweme.common.a r3 = (com.p683ss.android.ugc.aweme.common.C26832a) r3
            r2.mo54799a(r3)
        L_0x0082:
            com.ss.android.ugc.aweme.feed.m.aa r2 = r1.f92973l
            if (r2 == 0) goto L_0x008d
            r3 = r1
            com.ss.android.ugc.aweme.common.e r3 = (com.p683ss.android.ugc.aweme.common.C26865e) r3
            r2.mo54800a(r3)
            return
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.longvideo.DiggView.mo75224a(android.support.v4.app.FragmentActivity, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout, java.lang.String):void");
    }
}
