package com.p683ss.android.ugc.gamora.editor.sticker.donation;

import android.app.Dialog;
import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0649f;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.MtEmptyView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.bytedance.jedi.arch.C11787a;
import com.bytedance.jedi.arch.C11788aa;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.C11872h;
import com.bytedance.jedi.arch.C11872h.C11873a;
import com.bytedance.jedi.arch.C11910j;
import com.bytedance.jedi.arch.C11931r;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.C11934u;
import com.bytedance.jedi.arch.C11937x;
import com.bytedance.jedi.arch.C11938y;
import com.bytedance.jedi.arch.C11939z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.internal.C11896i;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.gamora.editor.sticker.donation.p2462a.C49471a;
import com.p683ss.android.ugc.gamora.editor.sticker.donation.p2462a.C49475c;
import com.p683ss.android.ugc.gamora.editor.sticker.donation.p2463b.C49481b;
import com.p683ss.android.ugc.gamora.editor.sticker.donation.viewmodel.C49521a;
import com.p683ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListViewModel;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;
import p064c.p065a.p069b.C1690c;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2648k.C52771j;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.e */
public final class C49498e extends C0649f implements C11872h, C49471a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f124206a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49498e.class), "mMobParams", "getMMobParams()Lcom/ss/android/ugc/gamora/editor/sticker/donation/DonationStickerMobParams;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49498e.class), "mAdapter", "getMAdapter()Lcom/ss/android/ugc/gamora/editor/sticker/donation/adapter/OrganizationListAdapter;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49498e.class), "mViewModel", "getMViewModel()Lcom/ss/android/ugc/gamora/editor/sticker/donation/viewmodel/OrganizationListViewModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49498e.class), "mTiltifyClickableSpan", "getMTiltifyClickableSpan()Lcom/ss/android/ugc/gamora/editor/sticker/donation/TiltifyClickableSpan;"))};

    /* renamed from: c */
    public static final C49499a f124207c = new C49499a(null);

    /* renamed from: b */
    public C49512i f124208b;

    /* renamed from: d */
    private boolean f124209d;

    /* renamed from: e */
    private final C52668f f124210e = C52732g.m112285a(new C49505g(this));

    /* renamed from: f */
    private final C52668f f124211f = C52732g.m112285a(new C49504f(this));

    /* renamed from: g */
    private final C52668f f124212g = C52732g.m112285a(new C49507i(this));

    /* renamed from: h */
    private final C52668f f124213h = C52732g.m112285a(new C49506h(this));

    /* renamed from: i */
    private C49481b f124214i;

    /* renamed from: j */
    private HashMap f124215j;

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.e$a */
    public static final class C49499a {
        private C49499a() {
        }

        public /* synthetic */ C49499a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.e$b */
    static final class C49500b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49498e f124216a;

        C49500b(C49498e eVar) {
            this.f124216a = eVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f124216a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.e$c */
    static final class C49501c implements C26846a {

        /* renamed from: a */
        final /* synthetic */ C49498e f124217a;

        C49501c(C49498e eVar) {
            this.f124217a = eVar;
        }

        public final void ar_() {
            OrganizationListViewModel e = this.f124217a.mo97428e();
            if (e.f124232e == 1) {
                e.mo97442a(true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.e$d */
    static final class C49502d extends C52712l implements C52682m<C11866f, C49521a, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49498e f124218a;

        C49502d(C49498e eVar) {
            this.f124218a = eVar;
            super(2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0090, code lost:
            if (r3 == null) goto L_0x0092;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x009a, code lost:
            if (r0 == null) goto L_0x009f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r13, java.lang.Object r14) {
            /*
                r12 = this;
                com.bytedance.jedi.arch.f r13 = (com.bytedance.jedi.arch.C11866f) r13
                com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.a r14 = (com.p683ss.android.ugc.gamora.editor.sticker.donation.viewmodel.C49521a) r14
                java.lang.String r0 = "$receiver"
                p2628d.p2639f.p2641b.C52711k.m112240b(r13, r0)
                if (r14 == 0) goto L_0x0143
                boolean r13 = r14.f124247d
                r0 = 2132018701(0x7f14060d, float:1.9675716E38)
                if (r13 == 0) goto L_0x002b
                boolean r13 = r14.f124249f
                if (r13 == 0) goto L_0x0020
                com.ss.android.ugc.gamora.editor.sticker.donation.e r13 = r12.f124218a
                com.ss.android.ugc.gamora.editor.sticker.donation.a.c r13 = r13.mo97427b()
                r13.am_()
                goto L_0x002b
            L_0x0020:
                com.ss.android.ugc.gamora.editor.sticker.donation.e r13 = r12.f124218a
                android.view.View r13 = r13.mo97425a(r0)
                com.bytedance.ies.dmt.ui.widget.DmtStatusView r13 = (com.bytedance.ies.dmt.p664ui.widget.DmtStatusView) r13
                r13.mo19212f()
            L_0x002b:
                boolean r13 = r14.f124248e
                if (r13 == 0) goto L_0x0122
                com.ss.android.ugc.gamora.editor.sticker.donation.e r13 = r12.f124218a
                android.view.View r13 = r13.mo97425a(r0)
                com.bytedance.ies.dmt.ui.widget.DmtStatusView r13 = (com.bytedance.ies.dmt.p664ui.widget.DmtStatusView) r13
                r13.mo19209d()
                boolean r13 = r14.f124249f
                if (r13 == 0) goto L_0x004a
                com.ss.android.ugc.gamora.editor.sticker.donation.e r13 = r12.f124218a
                com.ss.android.ugc.gamora.editor.sticker.donation.a.c r13 = r13.mo97427b()
                java.util.List<com.ss.android.ugc.gamora.editor.sticker.donation.b.b> r0 = r14.f124244a
                r13.mo50304b(r0)
                goto L_0x0055
            L_0x004a:
                com.ss.android.ugc.gamora.editor.sticker.donation.e r13 = r12.f124218a
                com.ss.android.ugc.gamora.editor.sticker.donation.a.c r13 = r13.mo97427b()
                java.util.List<com.ss.android.ugc.gamora.editor.sticker.donation.b.b> r0 = r14.f124244a
                r13.mo50303a(r0)
            L_0x0055:
                com.ss.android.ugc.gamora.editor.sticker.donation.e r13 = r12.f124218a
                boolean r0 = r14.f124250g
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x0065
                com.ss.android.ugc.gamora.editor.sticker.donation.a.c r13 = r13.mo97427b()
                r13.mo54798c(r2)
                goto L_0x0073
            L_0x0065:
                com.ss.android.ugc.gamora.editor.sticker.donation.a.c r0 = r13.mo97427b()
                r0.mo54798c(r1)
                com.ss.android.ugc.gamora.editor.sticker.donation.a.c r13 = r13.mo97427b()
                r13.ao_()
            L_0x0073:
                com.ss.android.ugc.gamora.editor.sticker.donation.e r13 = r12.f124218a
                r0 = 2132024010(0x7f141aca, float:1.9686484E38)
                android.view.View r13 = r13.mo97425a(r0)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r13 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r13
                java.lang.String r0 = "tv_powered_by"
                p2628d.p2639f.p2641b.C52711k.m112236a(r13, r0)
                r13.setVisibility(r2)
                com.ss.android.ugc.gamora.editor.sticker.donation.e r13 = r12.f124218a
                com.ss.android.ugc.gamora.editor.sticker.donation.b.a r0 = r14.f124246c
                if (r0 == 0) goto L_0x0092
                java.lang.String r3 = r0.getMatchDonateText()
                if (r3 != 0) goto L_0x0094
            L_0x0092:
                java.lang.String r3 = ""
            L_0x0094:
                if (r0 == 0) goto L_0x009f
                java.lang.String r0 = r0.getMatchDonationHighlightText()
                if (r0 != 0) goto L_0x009d
                goto L_0x009f
            L_0x009d:
                r5 = r0
                goto L_0x00a2
            L_0x009f:
                java.lang.String r0 = ""
                goto L_0x009d
            L_0x00a2:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                r0.append(r5)
                java.lang.String r0 = r0.toString()
                r4 = r0
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                boolean r3 = android.text.TextUtils.isEmpty(r4)
                r10 = 2132020811(0x7f140e4b, float:1.9679996E38)
                if (r3 != 0) goto L_0x0112
                android.text.SpannableString r3 = new android.text.SpannableString
                r3.<init>(r4)
                r6 = r5
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                boolean r6 = android.text.TextUtils.isEmpty(r6)
                if (r6 != 0) goto L_0x00e1
                android.text.style.StyleSpan r11 = new android.text.style.StyleSpan
                r11.<init>(r1)
                r6 = 0
                r7 = 0
                r8 = 6
                r9 = 0
                int r1 = p2628d.p2650m.C52830p.m112419a(r4, r5, r6, r7, r8, r9)
                int r0 = r0.length()
                r4 = 17
                r3.setSpan(r11, r1, r0, r4)
            L_0x00e1:
                android.view.View r0 = r13.mo97425a(r10)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                java.lang.String r1 = "ll_match_donate_info"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                r0.setVisibility(r2)
                r0 = 2132023915(0x7f141a6b, float:1.9686291E38)
                android.view.View r0 = r13.mo97425a(r0)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r0
                java.lang.String r1 = "tv_match_donate_text"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r0.setText(r3)
                r0 = 2132020243(0x7f140c13, float:1.9678844E38)
                android.view.View r13 = r13.mo97425a(r0)
                com.ss.android.ugc.aweme.base.ui.RemoteImageView r13 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r13
                r0 = 2131951841(0x7f1300e1, float:1.9540108E38)
                r13.setImageResource(r0)
                goto L_0x0122
            L_0x0112:
                android.view.View r13 = r13.mo97425a(r10)
                android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
                java.lang.String r0 = "ll_match_donate_info"
                p2628d.p2639f.p2641b.C52711k.m112236a(r13, r0)
                r0 = 8
                r13.setVisibility(r0)
            L_0x0122:
                boolean r13 = r14.f124249f
                if (r13 == 0) goto L_0x0137
                boolean r13 = r14.f124247d
                if (r13 != 0) goto L_0x0137
                boolean r13 = r14.f124248e
                if (r13 != 0) goto L_0x0137
                com.ss.android.ugc.gamora.editor.sticker.donation.e r13 = r12.f124218a
                com.ss.android.ugc.gamora.editor.sticker.donation.a.c r13 = r13.mo97427b()
                r13.mo54793i()
            L_0x0137:
                com.ss.android.ugc.gamora.editor.sticker.donation.e r13 = r12.f124218a
                com.ss.android.ugc.gamora.editor.sticker.donation.j r13 = r13.mo97429g()
                if (r13 == 0) goto L_0x0143
                java.lang.String r14 = r14.f124245b
                r13.f124226a = r14
            L_0x0143:
                d.x r13 = p2628d.C52860x.f131107a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.sticker.donation.C49498e.C49502d.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.e$e */
    static final class C49503e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49498e f124219a;

        C49503e(C49498e eVar) {
            this.f124219a = eVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f124219a.mo97430j();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.e$f */
    static final class C49504f extends C52712l implements C52670a<C49475c> {

        /* renamed from: a */
        final /* synthetic */ C49498e f124220a;

        C49504f(C49498e eVar) {
            this.f124220a = eVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C49475c(this.f124220a, this.f124220a.mo97426a());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.e$g */
    static final class C49505g extends C52712l implements C52670a<C49479b> {

        /* renamed from: a */
        final /* synthetic */ C49498e f124221a;

        C49505g(C49498e eVar) {
            this.f124221a = eVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Serializable serializable;
            Bundle arguments = this.f124221a.getArguments();
            if (arguments != null) {
                serializable = arguments.getSerializable("mob_params");
            } else {
                serializable = null;
            }
            if (!(serializable instanceof C49479b)) {
                serializable = null;
            }
            return (C49479b) serializable;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.e$h */
    static final class C49506h extends C52712l implements C52670a<C49513j> {

        /* renamed from: a */
        final /* synthetic */ C49498e f124222a;

        C49506h(C49498e eVar) {
            this.f124222a = eVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            String str;
            Context context = this.f124222a.getContext();
            String str2 = null;
            if (context == null) {
                return null;
            }
            C52711k.m112236a((Object) context, "this");
            C49479b a = this.f124222a.mo97426a();
            if (a != null) {
                str = a.getShootWay();
            } else {
                str = null;
            }
            C49479b a2 = this.f124222a.mo97426a();
            if (a2 != null) {
                str2 = a2.getCreationId();
            }
            return new C49513j(context, str, str2);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.e$i */
    static final class C49507i extends C52712l implements C52670a<OrganizationListViewModel> {

        /* renamed from: a */
        final /* synthetic */ C49498e f124223a;

        C49507i(C49498e eVar) {
            this.f124223a = eVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (OrganizationListViewModel) C48927d.m105736a(this.f124223a.requireActivity()).mo96760a(OrganizationListViewModel.class);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.e$j */
    static final class C49508j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C49498e f124224a;

        C49508j(C49498e eVar) {
            this.f124224a = eVar;
        }

        public final void run() {
            Dialog dialog = this.f124224a.getDialog();
            if (dialog != null) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.setWindowAnimations(R.style.sn);
                }
            }
        }
    }

    /* renamed from: a */
    public final View mo97425a(int i) {
        if (this.f124215j == null) {
            this.f124215j = new HashMap();
        }
        View view = (View) this.f124215j.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f124215j.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public final C49479b mo97426a() {
        return (C49479b) this.f124210e.getValue();
    }

    /* renamed from: b */
    public final C49475c mo97427b() {
        return (C49475c) this.f124211f.getValue();
    }

    /* renamed from: e */
    public final OrganizationListViewModel mo97428e() {
        return (OrganizationListViewModel) this.f124212g.getValue();
    }

    /* renamed from: g */
    public final C49513j mo97429g() {
        return (C49513j) this.f124213h.getValue();
    }

    /* renamed from: a */
    public final void mo97351a(C49481b bVar) {
        C52711k.m112240b(bVar, "selectedOrg");
        C49512i iVar = this.f124208b;
        if (iVar != null) {
            iVar.mo97423a(bVar);
        }
        dismiss();
    }

    /* renamed from: c */
    public final C11910j mo22553c() {
        return C11873a.m24226a(this);
    }

    /* renamed from: d */
    public final C11931r<C11866f> mo22554d() {
        return C11873a.m24228b(this);
    }

    /* renamed from: f */
    public final boolean mo22555f() {
        return C11873a.m24231e(this);
    }

    /* renamed from: h */
    public final C0184k mo22626h() {
        return C11873a.m24229c(this);
    }

    /* renamed from: i */
    public final /* synthetic */ C11796d mo22645i() {
        return C11873a.m24230d(this);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f124215j != null) {
            this.f124215j.clear();
        }
    }

    public final void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            view.postDelayed(new C49508j(this), 50);
        }
    }

    public final void onStop() {
        if (!this.f124209d) {
            Dialog dialog = getDialog();
            if (dialog != null) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.setWindowAnimations(0);
                }
            }
        }
        super.onStop();
    }

    /* renamed from: j */
    public final void mo97430j() {
        Context context = getContext();
        if (context != null) {
            if (C49509f.m106808a(context)) {
                mo97428e().mo97443e();
            } else {
                ((DmtStatusView) mo97425a((int) R.id.e6a)).mo19214h();
            }
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f124209d = true;
        C49512i iVar = this.f124208b;
        if (iVar != null) {
            iVar.mo97424b();
        }
        super.onDismiss(dialogInterface);
    }

    /* renamed from: b */
    public final void mo97352b(C49481b bVar) {
        C52711k.m112240b(bVar, "selectedOrg");
        this.f124214i = bVar;
        Bundle bundle = new Bundle();
        bundle.putString("url", bVar.getDetailUrl());
        bundle.putString("title", getString(R.string.g9a));
        bundle.putString("enter_from", "org_detail_page");
        startActivityForResult(SmartRouter.buildRoute(getContext(), "aweme://donation/web/page").withParam(bundle).buildIntent(), 12580);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.a5n);
        mo22547a(mo97428e(), C49510g.f124225a, C11896i.m24255a(), new C49502d(this));
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C52711k.m112236a((Object) onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        C49512i iVar = this.f124208b;
        if (iVar != null) {
            iVar.mo97422a();
        }
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.sn);
        }
        onCreateDialog.setCanceledOnTouchOutside(false);
        return onCreateDialog;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null) {
            C52711k.m112236a((Object) context, "this");
            ((DmtTextView) mo97425a((int) R.id.dhb)).setFontType(C10751d.f28903b);
            RecyclerView recyclerView = (RecyclerView) mo97425a((int) R.id.caf);
            C52711k.m112236a((Object) recyclerView, "recycler_view");
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
            mo97427b().mo54798c(true);
            RecyclerView recyclerView2 = (RecyclerView) mo97425a((int) R.id.caf);
            C52711k.m112236a((Object) recyclerView2, "recycler_view");
            recyclerView2.setAdapter(mo97427b());
            String string = getString(R.string.g9w);
            C52711k.m112236a((Object) string, "getString(R.string.donat…iltify_attribution2_link)");
            String string2 = getString(R.string.g9v, string);
            C52711k.m112236a((Object) string2, "getString(R.string.donat…fy_attribution1, tiltify)");
            CharSequence charSequence = string2;
            SpannableString spannableString = new SpannableString(charSequence);
            if (C52830p.m112419a(charSequence, string, 0, false, 6, (Object) null) != -1) {
                spannableString.setSpan(mo97429g(), C52830p.m112419a(charSequence, string, 0, false, 6, (Object) null), string2.length(), 18);
            }
            DmtTextView dmtTextView = (DmtTextView) mo97425a((int) R.id.f3y);
            C52711k.m112236a((Object) dmtTextView, "tv_powered_by");
            dmtTextView.setMovementMethod(LinkMovementMethod.getInstance());
            DmtTextView dmtTextView2 = (DmtTextView) mo97425a((int) R.id.f3y);
            C52711k.m112236a((Object) dmtTextView2, "tv_powered_by");
            dmtTextView2.setText(spannableString);
            DmtTextView dmtTextView3 = (DmtTextView) mo97425a((int) R.id.f3y);
            C52711k.m112236a((Object) dmtTextView3, "tv_powered_by");
            dmtTextView3.setHighlightColor(0);
            DmtTextView dmtTextView4 = (DmtTextView) mo97425a((int) R.id.f3y);
            C52711k.m112236a((Object) dmtTextView4, "tv_powered_by");
            dmtTextView4.setVisibility(8);
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C52711k.m112234a();
            }
            MtEmptyView a = MtEmptyView.m21697a((Context) activity);
            FragmentActivity activity2 = getActivity();
            if (activity2 == null) {
                C52711k.m112234a();
            }
            a.setStatus(new C10723a(activity2).f28711a);
            ((DmtStatusView) mo97425a((int) R.id.e6a)).setBuilder(C10719a.m21676a((Context) getActivity()).mo19223a().mo19226a(R.drawable.b0q, R.string.f5o, R.string.f5k, R.string.f5u, new C49503e(this)).mo19231b((View) a));
            ((RemoteImageView) mo97425a((int) R.id.az9)).setOnClickListener(new C49500b(this));
            mo97427b().mo54788a((C26846a) new C49501c(this));
            mo97430j();
        }
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C11873a.m24227a(this, vm1, bVar);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.b9w, viewGroup, false);
    }

    /* renamed from: a */
    public final <S extends C11932s> C1690c mo22546a(JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super C11866f, ? super S, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribe");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C11873a.m24220a(this, jediViewModel, uVar, mVar);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        String str2;
        String str3;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 12580) {
            C49481b bVar = this.f124214i;
            if (bVar != null) {
                dismiss();
                C49512i iVar = this.f124208b;
                if (iVar != null) {
                    iVar.mo97423a(bVar);
                }
                C49464a aVar = C49464a.f124115b;
                C49479b a = mo97426a();
                String str4 = null;
                if (a != null) {
                    str = a.getShootWay();
                } else {
                    str = null;
                }
                C49479b a2 = mo97426a();
                if (a2 != null) {
                    str2 = a2.getCreationId();
                } else {
                    str2 = null;
                }
                String name = bVar.getName();
                C49479b a3 = mo97426a();
                if (a3 != null) {
                    str3 = a3.getContentSource();
                } else {
                    str3 = null;
                }
                C49479b a4 = mo97426a();
                if (a4 != null) {
                    str4 = a4.getContentType();
                }
                String str5 = str4;
                JSONObject jSONObject = new JSONObject();
                C49466b bVar2 = new C49466b(str, str2, name, str3, str5);
                C49464a.m106725a(jSONObject, bVar2);
                C47702b.f120193a.mo94985a("add_donation_sticker", jSONObject);
            }
        }
    }

    /* renamed from: a */
    public final <S extends C11932s, A> C1690c mo22547a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C11866f, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C11873a.m24221a(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B> C1690c mo22549a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C11934u<C11938y<A, B>> uVar, C52686q<? super C11866f, ? super A, ? super B, C52860x> qVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(qVar, "subscriber");
        return C11873a.m24223a(this, jediViewModel, jVar, jVar2, uVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, T> C1690c mo22548a(JediViewModel<S> jediViewModel, C52771j<S, ? extends C11787a<? extends T>> jVar, C11934u<C11937x<C11787a<T>>> uVar, C52682m<? super C11866f, ? super Throwable, C52860x> mVar, C52671b<? super C11866f, C52860x> bVar, C52682m<? super C11866f, ? super T, C52860x> mVar2) {
        C52711k.m112240b(jediViewModel, "$this$asyncSubscribe");
        C52711k.m112240b(jVar, "prop");
        C52711k.m112240b(uVar, "config");
        return C11873a.m24222a((C11872h) this, jediViewModel, jVar, uVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C> C1690c mo22550a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C11934u<C11939z<A, B, C>> uVar, C52687r<? super C11866f, ? super A, ? super B, ? super C, C52860x> rVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(rVar, "subscriber");
        return C11873a.m24224a((C11872h) this, jediViewModel, jVar, jVar2, jVar3, uVar, rVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C, D> C1690c mo22551a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C52771j<S, ? extends D> jVar4, C11934u<C11788aa<A, B, C, D>> uVar, C52688s<? super C11866f, ? super A, ? super B, ? super C, ? super D, C52860x> sVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(jVar4, "prop4");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(sVar, "subscriber");
        return C11873a.m24225a(this, jediViewModel, jVar, jVar2, jVar3, jVar4, uVar, sVar);
    }
}
