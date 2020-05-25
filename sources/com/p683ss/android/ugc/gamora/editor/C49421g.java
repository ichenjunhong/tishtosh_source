package com.p683ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.C9432q;
import com.bytedance.jedi.arch.C11787a;
import com.bytedance.jedi.arch.C11788aa;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.C11910j;
import com.bytedance.jedi.arch.C11931r;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.C11934u;
import com.bytedance.jedi.arch.C11937x;
import com.bytedance.jedi.arch.C11938y;
import com.bytedance.jedi.arch.C11939z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.group.C12896b;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24440i;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43458e;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43458e.C43459a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.utils.C47687av;
import com.p683ss.android.ugc.aweme.utils.C47842ed;
import com.p683ss.android.ugc.gamora.editor.C49340ca.C49341a;
import com.p683ss.android.ugc.gamora.editor.p2459a.C49066a;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.ss.android.ugc.trill.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p064c.p065a.p069b.C1690c;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.editor.g */
public final class C49421g extends C12924i implements C49548a {

    /* renamed from: p */
    public static final C49422a f124032p = new C49422a(null);

    /* renamed from: i */
    public EditViewModel f124033i;

    /* renamed from: j */
    EditToolbarViewModel f124034j;

    /* renamed from: k */
    public RelativeLayout f124035k;

    /* renamed from: l */
    public View f124036l;

    /* renamed from: m */
    LinearLayout f124037m;

    /* renamed from: n */
    final Map<Integer, View> f124038n = new LinkedHashMap();

    /* renamed from: o */
    C49340ca f124039o;

    /* renamed from: com.ss.android.ugc.gamora.editor.g$a */
    public static final class C49422a {
        private C49422a() {
        }

        public /* synthetic */ C49422a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.g$b */
    public static final class C49423b extends C47687av {

        /* renamed from: a */
        final /* synthetic */ C49359cf f124040a;

        /* renamed from: b */
        final /* synthetic */ C49421g f124041b;

        /* renamed from: a */
        public final void mo59929a(View view) {
            C49421g.m106592a(this.f124041b).mo97031a(this.f124040a.f123922a);
        }

        C49423b(C49359cf cfVar, C49421g gVar) {
            this.f124040a = cfVar;
            this.f124041b = gVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.g$c */
    static final class C49424c extends C52712l implements C52682m<C49548a, List<? extends C49359cf>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49421g f124042a;

        C49424c(C49421g gVar) {
            this.f124042a = gVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            List<C49359cf> list = (List) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(list, "it");
            C49421g gVar = this.f124042a;
            LinearLayout linearLayout = gVar.f124037m;
            if (linearLayout == null) {
                C52711k.m112237a("bottomBarContainer");
            }
            linearLayout.removeAllViews();
            gVar.f124038n.clear();
            for (C49359cf cfVar : list) {
                Activity activity = gVar.f33840g_;
                if (activity == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) activity, "activity!!");
                View a = C43459a.m95265a(activity, cfVar.f123924c, cfVar.f123923b);
                LayoutParams layoutParams = new LayoutParams(-2, -2);
                layoutParams.leftMargin = (int) C9432q.m18687b(gVar.mo24473s(), 4.0f);
                LinearLayout linearLayout2 = gVar.f124037m;
                if (linearLayout2 == null) {
                    C52711k.m112237a("bottomBarContainer");
                }
                linearLayout2.addView(a, layoutParams);
                gVar.f124038n.put(Integer.valueOf(cfVar.f123922a), a);
                a.setOnClickListener(new C49423b(cfVar, gVar));
            }
            C49340ca caVar = gVar.f124039o;
            if (caVar != null) {
                caVar.mo97282a();
            }
            Activity activity2 = gVar.f33840g_;
            if (activity2 != null) {
                FragmentActivity fragmentActivity = (FragmentActivity) activity2;
                EditViewModel editViewModel = gVar.f124033i;
                if (editViewModel == null) {
                    C52711k.m112237a("editViewModel");
                }
                EditToolbarViewModel editToolbarViewModel = gVar.f124034j;
                if (editToolbarViewModel == null) {
                    C52711k.m112237a("editToolbarViewModel");
                }
                C12924i iVar = gVar.f33835c;
                if (iVar != null) {
                    C49340ca caVar2 = new C49340ca(fragmentActivity, editViewModel, editToolbarViewModel, (C12896b) iVar);
                    caVar2.mo97286a(gVar.f124038n);
                    caVar2.mo97290b(gVar.f124038n);
                    caVar2.mo97292c(gVar.f124038n);
                    caVar2.mo97287a(gVar.f124038n, 48);
                    if (gVar.f124033i == null) {
                        C52711k.m112237a("editViewModel");
                    }
                    if (EditViewModel.m105818D()) {
                        EditToolbarViewModel editToolbarViewModel2 = gVar.f124034j;
                        if (editToolbarViewModel2 == null) {
                            C52711k.m112237a("editToolbarViewModel");
                        }
                        editToolbarViewModel2.f123208e.f123885e = C39629l.m88232a().mo58574e().mo83117a(C40796a.CombinedShootModeTipShown);
                        View view = (View) gVar.f124038n.get(Integer.valueOf(1));
                        if (!C39630m.m88234a().mo58604b().mo80583e()) {
                            C39630m.m88234a().mo58604b().mo80585g().mo80588a((C24440i) new C49341a(caVar2, view));
                        }
                    }
                    View view2 = (View) gVar.f124038n.get(Integer.valueOf(1));
                    if (view2 != null) {
                        if (view2 != null) {
                            caVar2.mo97289b((C43458e) view2);
                        } else {
                            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.EditToolBarItem");
                        }
                    }
                    gVar.f124039o = caVar2;
                    return C52860x.f131107a;
                }
                throw new C52857u("null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.g$d */
    static final class C49425d extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49421g f124043a;

        C49425d(C49421g gVar) {
            this.f124043a = gVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i;
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            View view = this.f124043a.f124036l;
            if (view == null) {
                C52711k.m112237a("nextStep");
            }
            if (booleanValue) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.g$e */
    static final class C49426e extends C52712l implements C52682m<C49548a, Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49421g f124044a;

        C49426e(C49421g gVar) {
            this.f124044a = gVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            int intValue = ((Number) obj2).intValue();
            C52711k.m112240b(aVar, "$receiver");
            ViewGroup.LayoutParams layoutParams = C49421g.m106593b(this.f124044a).getLayoutParams();
            if (!(layoutParams instanceof MarginLayoutParams)) {
                layoutParams = null;
            }
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.height = intValue;
                C49421g.m106593b(this.f124044a).setLayoutParams(marginLayoutParams);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.g$f */
    public static final class C49427f extends C47687av {

        /* renamed from: a */
        final /* synthetic */ C49421g f124045a;

        /* renamed from: a */
        public final void mo59929a(View view) {
            C45407ay.m98968a("VEVideoPublishEditActivity nextStep OnClick");
            C49421g.m106592a(this.f124045a).mo22530c(C49019j.f123254a);
        }

        C49427f(C49421g gVar, long j) {
            this.f124045a = gVar;
            super(600);
        }
    }

    /* renamed from: a */
    public final void mo24463a(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.mo24463a(view, bundle);
        View j_ = mo24467j_(R.id.b74);
        C52711k.m112236a((Object) j_, "requireViewById(R.id.layout_bottom_tool)");
        this.f124035k = (RelativeLayout) j_;
        View j_2 = mo24467j_(R.id.lp);
        C52711k.m112236a((Object) j_2, "requireViewById(R.id.bottom_bar_container)");
        this.f124037m = (LinearLayout) j_2;
        View j_3 = mo24467j_(R.id.bqp);
        C52711k.m112236a((Object) j_3, "requireViewById(R.id.next_step)");
        this.f124036l = j_3;
        View view2 = this.f124036l;
        if (view2 == null) {
            C52711k.m112237a("nextStep");
        }
        view2.setOnClickListener(new C49427f(this, 600));
        if (this.f33840g_ != null) {
            Activity activity = this.f33840g_;
            if (activity == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) activity, "activity!!");
            if (C49066a.m105887a(activity)) {
                Activity activity2 = this.f33840g_;
                if (activity2 == null) {
                    C52711k.m112234a();
                }
                if (C47842ed.m103485a(activity2)) {
                    View view3 = this.f124036l;
                    if (view3 == null) {
                        C52711k.m112237a("nextStep");
                    }
                    C52711k.m112236a((Object) activity2, "it");
                    view3.setBackground(activity2.getResources().getDrawable(R.drawable.ccc));
                    return;
                }
                View view4 = this.f124036l;
                if (view4 == null) {
                    C52711k.m112237a("nextStep");
                }
                C52711k.m112236a((Object) activity2, "it");
                view4.setBackground(activity2.getResources().getDrawable(R.drawable.ccb));
            }
        }
    }

    /* renamed from: c */
    public final C11910j mo22553c() {
        return C49549a.m106927b(this);
    }

    /* renamed from: d */
    public final C11931r<C11866f> mo22554d() {
        return C49549a.m106934d(this);
    }

    /* renamed from: f */
    public final boolean mo22555f() {
        return C49549a.m106935e(this);
    }

    /* renamed from: h */
    public final C0184k mo22626h() {
        return C49549a.m106918a(this);
    }

    /* renamed from: i */
    public final /* synthetic */ C11796d mo22645i() {
        return C49549a.m106930c(this);
    }

    /* renamed from: p */
    public final void mo24469p() {
        super.mo24469p();
        C49340ca caVar = this.f124039o;
        if (caVar != null) {
            caVar.mo97282a();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ EditViewModel m106592a(C49421g gVar) {
        EditViewModel editViewModel = gVar.f124033i;
        if (editViewModel == null) {
            C52711k.m112237a("editViewModel");
        }
        return editViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ RelativeLayout m106593b(C49421g gVar) {
        RelativeLayout relativeLayout = gVar.f124035k;
        if (relativeLayout == null) {
            C52711k.m112237a("bottomLayout");
        }
        return relativeLayout;
    }

    /* renamed from: d */
    public final void mo24408d(Bundle bundle) {
        super.mo24408d(bundle);
        Activity activity = this.f33840g_;
        if (activity != null) {
            JediViewModel a = C48927d.m105736a((FragmentActivity) activity).mo96760a(EditViewModel.class);
            C52711k.m112236a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java]");
            this.f124033i = (EditViewModel) a;
            Activity activity2 = this.f33840g_;
            if (activity2 != null) {
                JediViewModel a2 = C48927d.m105736a((FragmentActivity) activity2).mo96760a(EditToolbarViewModel.class);
                C52711k.m112236a((Object) a2, "JediViewModelProviders.o…barViewModel::class.java]");
                this.f124034j = (EditToolbarViewModel) a2;
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0126, code lost:
        if (r9.mo97052w() != false) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0150, code lost:
        if (r9.mo97055z() != false) goto L_0x0152;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24448e(android.os.Bundle r9) {
        /*
            r8 = this;
            super.mo24448e(r9)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r9 = r8.f124034j
            if (r9 != 0) goto L_0x000c
            java.lang.String r0 = "editToolbarViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x000c:
            r2 = r9
            com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
            d.k.j r3 = com.p683ss.android.ugc.gamora.editor.C49428h.f124046a
            r4 = 0
            com.ss.android.ugc.gamora.editor.g$c r9 = new com.ss.android.ugc.gamora.editor.g$c
            r9.<init>(r8)
            r5 = r9
            d.f.a.m r5 = (p2628d.p2639f.p2640a.C52682m) r5
            r6 = 2
            r7 = 0
            r1 = r8
            r1.mo49443b(r2, r3, new com.bytedance.jedi.arch.C11934u(), r5)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r9 = r8.f124034j
            if (r9 != 0) goto L_0x0029
            java.lang.String r0 = "editToolbarViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0029:
            r2 = r9
            com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
            d.k.j r3 = com.p683ss.android.ugc.gamora.editor.C49429i.f124047a
            r4 = 0
            com.ss.android.ugc.gamora.editor.g$d r9 = new com.ss.android.ugc.gamora.editor.g$d
            r9.<init>(r8)
            r5 = r9
            d.f.a.m r5 = (p2628d.p2639f.p2640a.C52682m) r5
            r6 = 2
            r7 = 0
            r1 = r8
            r1.mo49443b(r2, r3, new com.bytedance.jedi.arch.C11934u(), r5)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r9 = r8.f124034j
            if (r9 != 0) goto L_0x0046
            java.lang.String r0 = "editToolbarViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0046:
            r2 = r9
            com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
            d.k.j r3 = com.p683ss.android.ugc.gamora.editor.C49430j.f124048a
            r4 = 0
            com.ss.android.ugc.gamora.editor.g$e r9 = new com.ss.android.ugc.gamora.editor.g$e
            r9.<init>(r8)
            r5 = r9
            d.f.a.m r5 = (p2628d.p2639f.p2640a.C52682m) r5
            r6 = 2
            r7 = 0
            r1 = r8
            r1.mo49443b(r2, r3, new com.bytedance.jedi.arch.C11934u(), r5)
            java.util.Map<java.lang.Integer, android.view.View> r9 = r8.f124038n
            r0 = 9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r9 = r9.get(r0)
            android.view.View r9 = (android.view.View) r9
            if (r9 == 0) goto L_0x007e
            com.ss.android.ugc.gamora.editor.ca r0 = r8.f124039o
            if (r0 == 0) goto L_0x007e
            if (r9 == 0) goto L_0x0076
            com.ss.android.ugc.aweme.shortvideo.edit.e r9 = (com.p683ss.android.ugc.aweme.shortvideo.edit.C43458e) r9
            r0.mo97285a(r9)
            goto L_0x007e
        L_0x0076:
            d.u r9 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.EditToolBarItem"
            r9.<init>(r0)
            throw r9
        L_0x007e:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.List r9 = (java.util.List) r9
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r8.f124033i
            if (r0 != 0) goto L_0x008e
            java.lang.String r1 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x008e:
            boolean r0 = r0.mo97047q()
            if (r0 == 0) goto L_0x00a4
            com.ss.android.ugc.gamora.editor.cf r1 = new com.ss.android.ugc.gamora.editor.cf
            r2 = 12
            r3 = 2131953880(0x7f1308d8, float:1.9544243E38)
            r4 = 2132543536(0x7f1c0830, float:2.0740208E38)
            r1.<init>(r2, r3, r4)
            r9.add(r1)
        L_0x00a4:
            com.ss.android.ugc.gamora.editor.cf r1 = new com.ss.android.ugc.gamora.editor.cf
            r2 = 2132546845(0x7f1c151d, float:2.074692E38)
            r3 = 2131953359(0x7f1306cf, float:1.9543187E38)
            r4 = 1
            r1.<init>(r4, r3, r2)
            r9.add(r1)
            if (r0 != 0) goto L_0x00c4
            com.ss.android.ugc.gamora.editor.cf r0 = new com.ss.android.ugc.gamora.editor.cf
            r1 = 2
            r5 = 2131953632(0x7f1307e0, float:1.954374E38)
            r6 = 2132544341(0x7f1c0b55, float:2.074184E38)
            r0.<init>(r1, r5, r6)
            r9.add(r0)
        L_0x00c4:
            com.ss.android.ugc.gamora.editor.cf r0 = new com.ss.android.ugc.gamora.editor.cf
            r1 = 3
            r5 = 2131953652(0x7f1307f4, float:1.9543781E38)
            r6 = 2132552023(0x7f1c2957, float:2.0757422E38)
            r0.<init>(r1, r5, r6)
            r9.add(r0)
            com.ss.android.ugc.gamora.editor.cf r0 = new com.ss.android.ugc.gamora.editor.cf
            r1 = 4
            r5 = 2131953650(0x7f1307f2, float:1.9543777E38)
            r6 = 2132549468(0x7f1c1f5c, float:2.075224E38)
            r0.<init>(r1, r5, r6)
            r9.add(r0)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r0 = r8.f124034j
            if (r0 != 0) goto L_0x00eb
            java.lang.String r1 = "editToolbarViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00eb:
            java.lang.String r1 = "value"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r1)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel$f r1 = new com.ss.android.ugc.gamora.editor.EditToolbarViewModel$f
            r1.<init>(r9)
            d.f.a.b r1 = (p2628d.p2639f.p2640a.C52671b) r1
            r0.mo22530c(r1)
            com.ss.android.ugc.gamora.editor.EditViewModel r9 = r8.f124033i
            if (r9 != 0) goto L_0x0103
            java.lang.String r0 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0103:
            boolean r9 = r9.mo97049t()
            r0 = 0
            if (r9 != 0) goto L_0x0128
            com.ss.android.ugc.gamora.editor.EditViewModel r9 = r8.f124033i
            if (r9 != 0) goto L_0x0113
            java.lang.String r1 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0113:
            boolean r9 = r9.mo97050u()
            if (r9 != 0) goto L_0x0128
            com.ss.android.ugc.gamora.editor.EditViewModel r9 = r8.f124033i
            if (r9 != 0) goto L_0x0122
            java.lang.String r1 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0122:
            boolean r9 = r9.mo97052w()
            if (r9 == 0) goto L_0x0134
        L_0x0128:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r9 = r8.f124034j
            if (r9 != 0) goto L_0x0131
            java.lang.String r1 = "editToolbarViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0131:
            r9.mo97019e(r4, r0)
        L_0x0134:
            com.ss.android.ugc.gamora.editor.EditViewModel r9 = r8.f124033i
            if (r9 != 0) goto L_0x013d
            java.lang.String r1 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x013d:
            boolean r9 = r9.mo97054y()
            if (r9 != 0) goto L_0x0152
            com.ss.android.ugc.gamora.editor.EditViewModel r9 = r8.f124033i
            if (r9 != 0) goto L_0x014c
            java.lang.String r1 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x014c:
            boolean r9 = r9.mo97055z()
            if (r9 == 0) goto L_0x015e
        L_0x0152:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r9 = r8.f124034j
            if (r9 != 0) goto L_0x015b
            java.lang.String r1 = "editToolbarViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x015b:
            r9.mo97017d(r4, r0)
        L_0x015e:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r9 = r8.f124034j
            if (r9 != 0) goto L_0x0167
            java.lang.String r0 = "editToolbarViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0167:
            android.app.Activity r0 = r8.mo24477v()
            java.lang.String r0 = r0.getString(r2)
            java.lang.String r1 = "requireActivity().getStr…ent.getChooseMusicText())"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.String r1 = "value"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r1)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel$i r1 = new com.ss.android.ugc.gamora.editor.EditToolbarViewModel$i
            r1.<init>(r0)
            d.f.a.b r1 = (p2628d.p2639f.p2640a.C52671b) r1
            r9.mo22530c(r1)
            com.ss.android.ugc.gamora.editor.EditViewModel r9 = r8.f124033i
            if (r9 != 0) goto L_0x018c
            java.lang.String r0 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x018c:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r9 = r9.mo97035e()
            com.ss.android.ugc.aweme.shortvideo.dh r0 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r0 = r0.mo50201b()
            com.ss.android.ugc.gamora.editor.EditViewModel r1 = r8.f124033i
            if (r1 != 0) goto L_0x01a1
            java.lang.String r2 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x01a1:
            boolean r1 = r1.mo97055z()
            if (r1 != 0) goto L_0x01d8
            int r1 = r9.recordMode
            if (r1 != r4) goto L_0x01af
            boolean r1 = r9.mIsFromDraft
            if (r1 == 0) goto L_0x01b7
        L_0x01af:
            if (r0 != 0) goto L_0x01d8
            boolean r9 = r9.isStatusVideoType()
            if (r9 != 0) goto L_0x01d8
        L_0x01b7:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r9 = r8.f124034j
            if (r9 != 0) goto L_0x01c0
            java.lang.String r0 = "editToolbarViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x01c0:
            android.app.Activity r0 = r8.mo24477v()
            android.content.Context r0 = (android.content.Context) r0
            android.graphics.drawable.Drawable r0 = android.support.p030v4.content.C0726c.m2091a(r0, r3)
            if (r0 != 0) goto L_0x01cf
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x01cf:
            java.lang.String r1 = "ContextCompat.getDrawabl….drawable.ic_music_add)!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r9.mo97009a(r0)
            goto L_0x01fb
        L_0x01d8:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r9 = r8.f124034j
            if (r9 != 0) goto L_0x01e1
            java.lang.String r0 = "editToolbarViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x01e1:
            android.app.Activity r0 = r8.mo24477v()
            android.content.Context r0 = (android.content.Context) r0
            r1 = 2131953629(0x7f1307dd, float:1.9543734E38)
            android.graphics.drawable.Drawable r0 = android.support.p030v4.content.C0726c.m2091a(r0, r1)
            if (r0 != 0) goto L_0x01f3
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x01f3:
            java.lang.String r1 = "ContextCompat.getDrawabl…edit_addmusic_complete)!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r9.mo97009a(r0)
        L_0x01fb:
            com.ss.android.ugc.gamora.editor.EditViewModel r9 = r8.f124033i
            if (r9 != 0) goto L_0x0204
            java.lang.String r0 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0204:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r9 = r9.mo97035e()
            com.ss.android.ugc.aweme.shortvideo.dh r0 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r0 = r0.mo50201b()
            r1 = -1
            if (r0 != 0) goto L_0x022e
            boolean r0 = r9.isMvThemeVideoType()
            if (r0 == 0) goto L_0x0226
            com.ss.android.ugc.aweme.at.b r0 = r9.mvCreateVideoData
            java.util.List<java.lang.String> r0 = r0.musicIds
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = com.p683ss.android.ugc.aweme.base.utils.C23715d.m58202a(r0)
            if (r0 != 0) goto L_0x0226
            goto L_0x022e
        L_0x0226:
            java.lang.String r0 = "music"
            int r2 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.f110819e
            com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96179a(r0, r2)
            goto L_0x0233
        L_0x022e:
            java.lang.String r0 = "music"
            com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96179a(r0, r1)
        L_0x0233:
            java.lang.String r0 = "effect"
            int r2 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.f110822h
            com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96179a(r0, r2)
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r8.f124033i
            if (r0 != 0) goto L_0x0243
            java.lang.String r0 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0243:
            boolean r0 = com.p683ss.android.ugc.gamora.editor.EditViewModel.m105819E()
            if (r0 != 0) goto L_0x024f
            java.lang.String r9 = "sticker"
            com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96179a(r9, r1)
            goto L_0x028f
        L_0x024f:
            boolean r0 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96183a()
            if (r0 == 0) goto L_0x025d
            java.lang.String r9 = "sticker"
            int r0 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.f110816b
            com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96179a(r9, r0)
            goto L_0x028f
        L_0x025d:
            boolean r0 = r9.isReviewVideo()
            boolean r0 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96186b(r0)
            if (r0 != 0) goto L_0x0288
            boolean r9 = r9.isReviewVideo()
            boolean r9 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96187c(r9)
            if (r9 == 0) goto L_0x0272
            goto L_0x0288
        L_0x0272:
            java.lang.String r9 = "sticker"
            boolean r9 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96184a(r9)
            if (r9 == 0) goto L_0x0280
            java.lang.String r9 = "sticker"
            com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96179a(r9, r1)
            goto L_0x028f
        L_0x0280:
            java.lang.String r9 = "sticker"
            int r0 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.f110821g
            com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96179a(r9, r0)
            goto L_0x028f
        L_0x0288:
            java.lang.String r9 = "sticker"
            int r0 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.f110817c
            com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96179a(r9, r0)
        L_0x028f:
            com.ss.android.ugc.gamora.editor.EditViewModel r9 = r8.f124033i
            if (r9 != 0) goto L_0x0298
            java.lang.String r0 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0298:
            boolean r9 = r9.mo97047q()
            if (r9 == 0) goto L_0x02af
            java.lang.String r9 = "status_background"
            boolean r9 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96184a(r9)
            if (r9 == 0) goto L_0x02a7
            goto L_0x02af
        L_0x02a7:
            java.lang.String r9 = "status_background"
            int r0 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.f110815a
            com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96179a(r9, r0)
            goto L_0x02b4
        L_0x02af:
            java.lang.String r9 = "status_background"
            com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96179a(r9, r1)
        L_0x02b4:
            java.lang.String r9 = "text"
            boolean r9 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96184a(r9)
            if (r9 == 0) goto L_0x02c2
            java.lang.String r9 = "text"
            com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96179a(r9, r1)
            return
        L_0x02c2:
            java.lang.String r9 = "text"
            int r0 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.f110820f
            com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96179a(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.C49421g.mo24448e(android.os.Bundle):void");
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C49549a.m106924a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final <S extends C11932s> C1690c mo22546a(JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super C11866f, ? super S, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribe");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106919a(this, jediViewModel, uVar, mVar);
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        if (this.f33840g_ != null) {
            Activity activity = this.f33840g_;
            if (activity == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) activity, "activity!!");
            if (C49066a.m105887a(activity)) {
                View inflate = layoutInflater.inflate(R.layout.br6, viewGroup, false);
                C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…_small, container, false)");
                return inflate;
            }
        }
        View inflate2 = layoutInflater.inflate(R.layout.adz, viewGroup, false);
        C52711k.m112236a((Object) inflate2, "inflater.inflate(R.layou…om_bar, container, false)");
        return inflate2;
    }

    /* renamed from: b */
    public final <S extends C11932s, A> void mo49443b(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectNonNullSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106925a(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: c */
    public final <S extends C11932s, A> void mo49444c(JediViewModel<S> jediViewModel, C52771j<S, ? extends C49555b<? extends A>> jVar, C11934u<C11937x<C49555b<A>>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribeEvent");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106928b(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: d */
    public final <S extends C11932s, A> void mo49445d(JediViewModel<S> jediViewModel, C52771j<S, ? extends C49562i<? extends A>> jVar, C11934u<C11937x<C49562i<A>>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribeMultiEvent");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106931c(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A> C1690c mo22547a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C11866f, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106933d(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B> C1690c mo22549a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C11934u<C11938y<A, B>> uVar, C52686q<? super C11866f, ? super A, ? super B, C52860x> qVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(qVar, "subscriber");
        return C49549a.m106921a(this, jediViewModel, jVar, jVar2, uVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, T> C1690c mo22548a(JediViewModel<S> jediViewModel, C52771j<S, ? extends C11787a<? extends T>> jVar, C11934u<C11937x<C11787a<T>>> uVar, C52682m<? super C11866f, ? super Throwable, C52860x> mVar, C52671b<? super C11866f, C52860x> bVar, C52682m<? super C11866f, ? super T, C52860x> mVar2) {
        C52711k.m112240b(jediViewModel, "$this$asyncSubscribe");
        C52711k.m112240b(jVar, "prop");
        C52711k.m112240b(uVar, "config");
        return C49549a.m106920a((C49548a) this, jediViewModel, jVar, uVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C> C1690c mo22550a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C11934u<C11939z<A, B, C>> uVar, C52687r<? super C11866f, ? super A, ? super B, ? super C, C52860x> rVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(rVar, "subscriber");
        return C49549a.m106922a((C49548a) this, jediViewModel, jVar, jVar2, jVar3, uVar, rVar);
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
        return C49549a.m106923a(this, jediViewModel, jVar, jVar2, jVar3, jVar4, uVar, sVar);
    }
}
