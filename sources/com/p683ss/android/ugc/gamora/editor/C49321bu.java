package com.p683ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.p030v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
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
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43434az;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43458e;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43458e.C43459a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43469f;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43471g;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.utils.C47687av;
import com.p683ss.android.ugc.aweme.utils.C47858ep;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
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

/* renamed from: com.ss.android.ugc.gamora.editor.bu */
public final class C49321bu extends C12924i implements C49548a {

    /* renamed from: p */
    public static final C49322a f123851p = new C49322a(null);

    /* renamed from: i */
    public ConstraintLayout f123852i;

    /* renamed from: j */
    public EditViewModel f123853j;

    /* renamed from: k */
    public ImageView f123854k;

    /* renamed from: l */
    public TextView f123855l;

    /* renamed from: m */
    public ViewGroup f123856m;

    /* renamed from: n */
    public final Map<Integer, View> f123857n = new LinkedHashMap();

    /* renamed from: o */
    public C43471g f123858o;

    /* renamed from: q */
    private EditToolbarViewModel f123859q;

    /* renamed from: r */
    private VideoPublishEditModel f123860r;

    /* renamed from: s */
    private EditAutoEnhanceViewModel f123861s;

    /* renamed from: t */
    private C49340ca f123862t;

    /* renamed from: com.ss.android.ugc.gamora.editor.bu$a */
    public static final class C49322a {
        private C49322a() {
        }

        public /* synthetic */ C49322a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bu$b */
    static final class C49323b extends C52712l implements C52682m<C49548a, Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49321bu f123863a;

        C49323b(C49321bu buVar) {
            this.f123863a = buVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            int intValue = ((Number) obj2).intValue();
            C52711k.m112240b(aVar, "$receiver");
            LayoutParams layoutParams = C49321bu.m106401c(this.f123863a).getLayoutParams();
            if (!(layoutParams instanceof MarginLayoutParams)) {
                layoutParams = null;
            }
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = intValue;
                C49321bu.m106401c(this.f123863a).setLayoutParams(marginLayoutParams);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bu$c */
    static final class C49324c extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49321bu f123864a;

        C49324c(C49321bu buVar) {
            this.f123864a = buVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i;
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            ImageView imageView = this.f123864a.f123854k;
            if (imageView == null) {
                C52711k.m112237a("mBackImageView");
            }
            if (booleanValue) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bu$d */
    static final class C49325d extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49321bu f123865a;

        C49325d(C49321bu buVar) {
            this.f123865a = buVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i;
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            TextView textView = this.f123865a.f123855l;
            if (textView == null) {
                C52711k.m112237a("mTvBackTip");
            }
            if (booleanValue) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bu$e */
    static final class C49326e extends C52712l implements C52682m<C49548a, List<? extends C49359cf>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49321bu f123866a;

        /* renamed from: com.ss.android.ugc.gamora.editor.bu$e$a */
        public static final class C49327a implements C43469f {

            /* renamed from: a */
            final /* synthetic */ C49326e f123867a;

            /* renamed from: a */
            public final void mo88401a() {
                C26890h.m65011a("click_more_icon", C23089d.m56640a().mo47829a("creation_id", C49321bu.m106399a(this.f123867a.f123866a).mo97035e().creationId).mo47829a("enter_from", "video_edit_page").mo47829a("shoot_way", C49321bu.m106399a(this.f123867a.f123866a).mo97035e().mShootWay).mo47829a("content_type", C43434az.m95202a(C49321bu.m106399a(this.f123867a.f123866a).mo97035e())).mo47829a("content_source", C43434az.m95207b(C49321bu.m106399a(this.f123867a.f123866a).mo97035e())).f61491a);
            }

            C49327a(C49326e eVar) {
                this.f123867a = eVar;
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.bu$e$b */
        public static final class C49328b extends C47687av {

            /* renamed from: a */
            final /* synthetic */ C49359cf f123868a;

            /* renamed from: b */
            final /* synthetic */ C49326e f123869b;

            /* renamed from: c */
            final /* synthetic */ List f123870c;

            /* renamed from: d */
            final /* synthetic */ Map f123871d;

            /* renamed from: a */
            public final void mo59929a(View view) {
                C49321bu.m106399a(this.f123869b.f123866a).mo97031a(this.f123868a.f123922a);
            }

            C49328b(C49359cf cfVar, C49326e eVar, List list, Map map) {
                this.f123868a = cfVar;
                this.f123869b = eVar;
                this.f123870c = list;
                this.f123871d = map;
            }
        }

        C49326e(C49321bu buVar) {
            this.f123866a = buVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            List<C49359cf> list = (List) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(list, "items");
            List arrayList = new ArrayList();
            Map linkedHashMap = new LinkedHashMap();
            for (C49359cf cfVar : list) {
                Activity activity = this.f123866a.f33840g_;
                if (activity == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) activity, "activity!!");
                View a = C43459a.m95265a(activity, cfVar.f123924c, cfVar.f123923b);
                arrayList.add(a);
                linkedHashMap.put(Integer.valueOf(cfVar.f123922a), a);
                a.setOnClickListener(new C49328b(cfVar, this, arrayList, linkedHashMap));
            }
            this.f123866a.f123857n.clear();
            this.f123866a.f123857n.putAll(linkedHashMap);
            C49321bu.m106400b(this.f123866a).removeAllViews();
            C43471g gVar = this.f123866a.f123858o;
            if (gVar != null) {
                gVar.mo88423b();
            }
            C49321bu buVar = this.f123866a;
            ViewGroup b = C49321bu.m106400b(this.f123866a);
            Activity activity2 = this.f123866a.f33840g_;
            if (activity2 == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) activity2, "activity!!");
            C43471g gVar2 = new C43471g(b, arrayList, activity2);
            gVar2.mo88421a();
            gVar2.f109873a = new C49327a(this);
            buVar.f123858o = gVar2;
            this.f123866a.mo97281F();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bu$f */
    static final class C49329f extends C52712l implements C52682m<C49548a, C52860x, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49321bu f123872a;

        C49329f(C49321bu buVar) {
            this.f123872a = buVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52860x xVar = (C52860x) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(xVar, "it");
            C43471g gVar = this.f123872a.f123858o;
            if (gVar != null) {
                gVar.mo88423b();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bu$g */
    static final class C49330g<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49321bu f123873a;

        C49330g(C49321bu buVar) {
            this.f123873a = buVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                ViewGroup b = C49321bu.m106400b(this.f123873a);
                if (bool.booleanValue()) {
                    i = 0;
                } else {
                    i = 8;
                }
                b.setVisibility(i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bu$h */
    public static final class C49331h extends C47687av {

        /* renamed from: a */
        final /* synthetic */ C49321bu f123874a;

        C49331h(C49321bu buVar) {
            this.f123874a = buVar;
        }

        /* renamed from: a */
        public final void mo59929a(View view) {
            C52711k.m112240b(view, "v");
            C49321bu.m106399a(this.f123874a).mo97041k();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bu$i */
    public static final class C49332i extends C47687av {

        /* renamed from: a */
        final /* synthetic */ C49321bu f123875a;

        C49332i(C49321bu buVar) {
            this.f123875a = buVar;
        }

        /* renamed from: a */
        public final void mo59929a(View view) {
            C52711k.m112240b(view, "v");
            C47858ep.m103507a("camera_start");
            C49321bu.m106399a(this.f123875a).mo97041k();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0258, code lost:
        if (r12.mo97051v() != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x028e, code lost:
        if (r12.mo97052w() != false) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0450, code lost:
        if (r11.isStickPointMode == false) goto L_0x0454;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03b0  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0429  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0460  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0471  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0482  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x049e  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x04a9  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x04cc  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x04dc  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x04e8  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x04ee  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x04fb  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0501  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0201  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24463a(android.view.View r11, android.os.Bundle r12) {
        /*
            r10 = this;
            java.lang.String r0 = "view"
            p2628d.p2639f.p2641b.C52711k.m112240b(r11, r0)
            super.mo24463a(r11, r12)
            r11 = 2132017556(0x7f140194, float:1.9673394E38)
            android.view.View r11 = r10.mo24467j_(r11)
            java.lang.String r12 = "requireViewById(R.id.back)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r12)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r10.f123854k = r11
            android.widget.ImageView r11 = r10.f123854k
            if (r11 != 0) goto L_0x0021
            java.lang.String r12 = "mBackImageView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x0021:
            com.ss.android.ugc.gamora.editor.bu$h r12 = new com.ss.android.ugc.gamora.editor.bu$h
            r12.<init>(r10)
            android.view.View$OnClickListener r12 = (android.view.View.OnClickListener) r12
            r11.setOnClickListener(r12)
            r11 = 2132023661(0x7f14196d, float:1.9685776E38)
            android.view.View r11 = r10.mo24467j_(r11)
            java.lang.String r12 = "requireViewById(R.id.tv_back_tip)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r12)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r10.f123855l = r11
            android.widget.TextView r11 = r10.f123855l
            if (r11 != 0) goto L_0x0044
            java.lang.String r12 = "mTvBackTip"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x0044:
            com.ss.android.ugc.gamora.editor.bu$i r12 = new com.ss.android.ugc.gamora.editor.bu$i
            r12.<init>(r10)
            android.view.View$OnClickListener r12 = (android.view.View.OnClickListener) r12
            r11.setOnClickListener(r12)
            r11 = 2132020539(0x7f140d3b, float:1.9679444E38)
            android.view.View r11 = r10.mo24467j_(r11)
            java.lang.String r12 = "requireViewById(R.id.layout_tool_container)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r12)
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            r10.f123856m = r11
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r11 = r10.f123859q
            if (r11 != 0) goto L_0x0067
            java.lang.String r12 = "editToolbarViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x0067:
            r1 = r11
            com.bytedance.jedi.arch.JediViewModel r1 = (com.bytedance.jedi.arch.JediViewModel) r1
            d.k.j r2 = com.p683ss.android.ugc.gamora.editor.C49333bv.f123876a
            r3 = 0
            com.ss.android.ugc.gamora.editor.bu$c r11 = new com.ss.android.ugc.gamora.editor.bu$c
            r11.<init>(r10)
            r4 = r11
            d.f.a.m r4 = (p2628d.p2639f.p2640a.C52682m) r4
            r5 = 2
            r6 = 0
            r0 = r10
            r0.mo49443b(r1, r2, new com.bytedance.jedi.arch.C11934u(), r4)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r11 = r10.f123859q
            if (r11 != 0) goto L_0x0084
            java.lang.String r12 = "editToolbarViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x0084:
            r1 = r11
            com.bytedance.jedi.arch.JediViewModel r1 = (com.bytedance.jedi.arch.JediViewModel) r1
            d.k.j r2 = com.p683ss.android.ugc.gamora.editor.C49335bx.f123878a
            r3 = 0
            com.ss.android.ugc.gamora.editor.bu$d r11 = new com.ss.android.ugc.gamora.editor.bu$d
            r11.<init>(r10)
            r4 = r11
            d.f.a.m r4 = (p2628d.p2639f.p2640a.C52682m) r4
            r5 = 2
            r6 = 0
            r0 = r10
            r0.mo49443b(r1, r2, new com.bytedance.jedi.arch.C11934u(), r4)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r11 = r10.f123859q
            if (r11 != 0) goto L_0x00a1
            java.lang.String r12 = "editToolbarViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x00a1:
            r1 = r11
            com.bytedance.jedi.arch.JediViewModel r1 = (com.bytedance.jedi.arch.JediViewModel) r1
            d.k.j r2 = com.p683ss.android.ugc.gamora.editor.C49336by.f123879a
            r3 = 0
            com.ss.android.ugc.gamora.editor.bu$e r11 = new com.ss.android.ugc.gamora.editor.bu$e
            r11.<init>(r10)
            r4 = r11
            d.f.a.m r4 = (p2628d.p2639f.p2640a.C52682m) r4
            r5 = 2
            r6 = 0
            r0 = r10
            r0.mo49443b(r1, r2, new com.bytedance.jedi.arch.C11934u(), r4)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r11 = r10.f123859q
            if (r11 != 0) goto L_0x00be
            java.lang.String r12 = "editToolbarViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x00be:
            r1 = r11
            com.bytedance.jedi.arch.JediViewModel r1 = (com.bytedance.jedi.arch.JediViewModel) r1
            d.k.j r2 = com.p683ss.android.ugc.gamora.editor.C49337bz.f123880a
            r3 = 0
            com.ss.android.ugc.gamora.editor.bu$f r11 = new com.ss.android.ugc.gamora.editor.bu$f
            r11.<init>(r10)
            r4 = r11
            d.f.a.m r4 = (p2628d.p2639f.p2640a.C52682m) r4
            r5 = 2
            r6 = 0
            r0 = r10
            r0.mo49444c(r1, r2, new com.bytedance.jedi.arch.C11934u(), r4)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r11 = r10.f123859q
            if (r11 != 0) goto L_0x00db
            java.lang.String r12 = "editToolbarViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x00db:
            android.arch.lifecycle.r r11 = r11.mo97020f()
            android.app.Activity r12 = r10.f33840g_
            if (r12 == 0) goto L_0x0509
            android.support.v4.app.FragmentActivity r12 = (android.support.p030v4.app.FragmentActivity) r12
            android.arch.lifecycle.k r12 = (android.arch.lifecycle.C0184k) r12
            com.ss.android.ugc.gamora.editor.bu$g r0 = new com.ss.android.ugc.gamora.editor.bu$g
            r0.<init>(r10)
            android.arch.lifecycle.s r0 = (android.arch.lifecycle.C0199s) r0
            r11.observe(r12, r0)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r11 = r10.f123859q
            if (r11 != 0) goto L_0x00fa
            java.lang.String r12 = "editToolbarViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x00fa:
            r1 = r11
            com.bytedance.jedi.arch.JediViewModel r1 = (com.bytedance.jedi.arch.JediViewModel) r1
            d.k.j r2 = com.p683ss.android.ugc.gamora.editor.C49334bw.f123877a
            r3 = 0
            com.ss.android.ugc.gamora.editor.bu$b r11 = new com.ss.android.ugc.gamora.editor.bu$b
            r11.<init>(r10)
            r4 = r11
            d.f.a.m r4 = (p2628d.p2639f.p2640a.C52682m) r4
            r5 = 2
            r6 = 0
            r0 = r10
            r0.mo49443b(r1, r2, new com.bytedance.jedi.arch.C11934u(), r4)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.List r11 = (java.util.List) r11
            com.ss.android.ugc.gamora.editor.EditViewModel r12 = r10.f123853j
            if (r12 != 0) goto L_0x011e
            java.lang.String r0 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x011e:
            boolean r12 = r12.mo97047q()
            com.ss.android.ugc.gamora.editor.cf r0 = new com.ss.android.ugc.gamora.editor.cf
            r1 = 5
            r2 = 2131953633(0x7f1307e1, float:1.9543743E38)
            r3 = 2132544680(0x7f1c0ca8, float:2.0742528E38)
            r0.<init>(r1, r2, r3)
            r11.add(r0)
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r10.f123853j
            if (r0 != 0) goto L_0x013a
            java.lang.String r1 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x013a:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r0.f123232e
            if (r1 != 0) goto L_0x0143
            java.lang.String r2 = "publishEditModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0143:
            boolean r1 = r1.isMultiVideoEditFeature()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0162
            boolean r1 = r0.mo97052w()
            if (r1 != 0) goto L_0x0162
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.f123232e
            if (r0 != 0) goto L_0x015a
            java.lang.String r1 = "publishEditModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x015a:
            boolean r0 = r0.isCutSameVideoType()
            if (r0 != 0) goto L_0x0162
            r0 = 1
            goto L_0x0163
        L_0x0162:
            r0 = 0
        L_0x0163:
            if (r0 == 0) goto L_0x0175
            com.ss.android.ugc.gamora.editor.cf r0 = new com.ss.android.ugc.gamora.editor.cf
            r1 = 13
            r4 = 2131953176(0x7f130618, float:1.9542816E38)
            r5 = 2132544276(0x7f1c0b14, float:2.0741709E38)
            r0.<init>(r1, r4, r5)
            r11.add(r0)
        L_0x0175:
            boolean r0 = com.p683ss.android.ugc.aweme.shortvideo.edit.p2190b.C43440a.C43441a.m95215b()
            r1 = 2131951799(0x7f1300b7, float:1.9540023E38)
            if (r0 == 0) goto L_0x018d
            if (r12 != 0) goto L_0x018d
            com.ss.android.ugc.gamora.editor.cf r12 = new com.ss.android.ugc.gamora.editor.cf
            r0 = 9
            r4 = 2132542166(0x7f1c02d6, float:2.073743E38)
            r12.<init>(r0, r1, r4)
            r11.add(r12)
        L_0x018d:
            com.ss.android.ugc.gamora.editor.EditViewModel r12 = r10.f123853j
            if (r12 != 0) goto L_0x0196
            java.lang.String r0 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0196:
            boolean r12 = r12.mo97021A()
            r0 = 6
            if (r12 == 0) goto L_0x01ab
            com.ss.android.ugc.gamora.editor.cf r12 = new com.ss.android.ugc.gamora.editor.cf
            r4 = 2131953657(0x7f1307f9, float:1.9543791E38)
            r5 = 2132542219(0x7f1c030b, float:2.0737537E38)
            r12.<init>(r0, r4, r5)
            r11.add(r12)
        L_0x01ab:
            com.ss.android.ugc.gamora.editor.EditViewModel r12 = r10.f123853j
            if (r12 != 0) goto L_0x01b4
            java.lang.String r4 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x01b4:
            boolean r12 = r12.mo97024F()
            if (r12 == 0) goto L_0x01ca
            com.ss.android.ugc.gamora.editor.cf r12 = new com.ss.android.ugc.gamora.editor.cf
            r4 = 11
            r5 = 2131953651(0x7f1307f3, float:1.954378E38)
            r6 = 2132542137(0x7f1c02b9, float:2.073737E38)
            r12.<init>(r4, r5, r6)
            r11.add(r12)
        L_0x01ca:
            com.ss.android.ugc.gamora.editor.EditViewModel r12 = r10.f123853j
            if (r12 != 0) goto L_0x01d3
            java.lang.String r4 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x01d3:
            boolean r12 = r12.mo97023C()
            if (r12 == 0) goto L_0x01e9
            com.ss.android.ugc.gamora.editor.cf r12 = new com.ss.android.ugc.gamora.editor.cf
            r4 = 10
            r5 = 2131953641(0x7f1307e9, float:1.9543759E38)
            r6 = 2132543534(0x7f1c082e, float:2.0740204E38)
            r12.<init>(r4, r5, r6)
            r11.add(r12)
        L_0x01e9:
            com.ss.android.ugc.gamora.editor.EditViewModel r12 = r10.f123853j
            if (r12 != 0) goto L_0x01f2
            java.lang.String r12 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x01f2:
            boolean r12 = com.p683ss.android.ugc.gamora.editor.EditViewModel.m105818D()
            r4 = 2132549237(0x7f1c1e75, float:2.075177E38)
            r5 = 2131953658(0x7f1307fa, float:1.9543793E38)
            r6 = 8
            r7 = 7
            if (r12 != 0) goto L_0x0263
            com.ss.android.ugc.gamora.editor.EditViewModel r12 = r10.f123853j
            if (r12 != 0) goto L_0x020a
            java.lang.String r8 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r8)
        L_0x020a:
            boolean r12 = r12.mo97049t()
            if (r12 != 0) goto L_0x023c
            com.ss.android.ugc.gamora.editor.EditViewModel r12 = r10.f123853j
            if (r12 != 0) goto L_0x0219
            java.lang.String r8 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r8)
        L_0x0219:
            boolean r12 = r12.mo97050u()
            if (r12 != 0) goto L_0x023c
            com.ss.android.ugc.gamora.editor.EditViewModel r12 = r10.f123853j
            if (r12 != 0) goto L_0x0228
            java.lang.String r8 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r8)
        L_0x0228:
            boolean r12 = r12.mo97052w()
            if (r12 != 0) goto L_0x023c
            com.ss.android.ugc.gamora.editor.cf r12 = new com.ss.android.ugc.gamora.editor.cf
            r8 = 2131953625(0x7f1307d9, float:1.9543726E38)
            r9 = 2132543707(0x7f1c08db, float:2.0740555E38)
            r12.<init>(r6, r8, r9)
            r11.add(r12)
        L_0x023c:
            com.ss.android.ugc.gamora.editor.EditViewModel r12 = r10.f123853j
            if (r12 != 0) goto L_0x0245
            java.lang.String r8 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r8)
        L_0x0245:
            boolean r12 = r12.mo97049t()
            if (r12 == 0) goto L_0x025a
            com.ss.android.ugc.gamora.editor.EditViewModel r12 = r10.f123853j
            if (r12 != 0) goto L_0x0254
            java.lang.String r8 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r8)
        L_0x0254:
            boolean r12 = r12.mo97051v()
            if (r12 == 0) goto L_0x0298
        L_0x025a:
            com.ss.android.ugc.gamora.editor.cf r12 = new com.ss.android.ugc.gamora.editor.cf
            r12.<init>(r7, r5, r4)
            r11.add(r12)
            goto L_0x0298
        L_0x0263:
            com.ss.android.ugc.gamora.editor.EditViewModel r12 = r10.f123853j
            if (r12 != 0) goto L_0x026c
            java.lang.String r8 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r8)
        L_0x026c:
            boolean r12 = r12.mo97050u()
            if (r12 != 0) goto L_0x0290
            com.ss.android.ugc.gamora.editor.EditViewModel r12 = r10.f123853j
            if (r12 != 0) goto L_0x027b
            java.lang.String r8 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r8)
        L_0x027b:
            boolean r12 = r12.mo97051v()
            if (r12 != 0) goto L_0x0290
            com.ss.android.ugc.gamora.editor.EditViewModel r12 = r10.f123853j
            if (r12 != 0) goto L_0x028a
            java.lang.String r8 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r8)
        L_0x028a:
            boolean r12 = r12.mo97052w()
            if (r12 == 0) goto L_0x0298
        L_0x0290:
            com.ss.android.ugc.gamora.editor.cf r12 = new com.ss.android.ugc.gamora.editor.cf
            r12.<init>(r7, r5, r4)
            r11.add(r12)
        L_0x0298:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r12 = r10.f123859q
            if (r12 != 0) goto L_0x02a1
            java.lang.String r4 = "editToolbarViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x02a1:
            java.lang.String r4 = "value"
            p2628d.p2639f.p2641b.C52711k.m112240b(r11, r4)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel$k r4 = new com.ss.android.ugc.gamora.editor.EditToolbarViewModel$k
            r4.<init>(r11)
            d.f.a.b r4 = (p2628d.p2639f.p2640a.C52671b) r4
            r12.mo22530c(r4)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r11 = r10.f123860r
            if (r11 != 0) goto L_0x02b9
            java.lang.String r12 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x02b9:
            boolean r11 = r11.mIsFromDraft
            if (r11 == 0) goto L_0x0355
            com.ss.android.ugc.gamora.editor.EditViewModel r11 = r10.f123853j
            if (r11 != 0) goto L_0x02c6
            java.lang.String r12 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x02c6:
            boolean r11 = r11.mo97049t()
            if (r11 != 0) goto L_0x0349
            com.ss.android.ugc.gamora.editor.EditViewModel r11 = r10.f123853j
            if (r11 != 0) goto L_0x02d5
            java.lang.String r12 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x02d5:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r11 = r11.f123232e
            if (r11 != 0) goto L_0x02de
            java.lang.String r12 = "publishEditModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x02de:
            int r11 = r11.mOrigin
            if (r11 != 0) goto L_0x02e4
            r11 = 1
            goto L_0x02e5
        L_0x02e4:
            r11 = 0
        L_0x02e5:
            if (r11 != 0) goto L_0x0349
            com.ss.android.ugc.gamora.editor.EditViewModel r11 = r10.f123853j
            if (r11 != 0) goto L_0x02f0
            java.lang.String r12 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x02f0:
            boolean r11 = r11.mo97050u()
            if (r11 != 0) goto L_0x0349
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r11 = r10.f123860r
            if (r11 != 0) goto L_0x02ff
            java.lang.String r12 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x02ff:
            boolean r11 = r11.isMvThemeVideoType()
            if (r11 != 0) goto L_0x0349
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r11 = r10.f123860r
            if (r11 != 0) goto L_0x030e
            java.lang.String r12 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x030e:
            boolean r11 = r11.isStatusVideoType()
            if (r11 != 0) goto L_0x0349
            com.ss.android.ugc.gamora.editor.EditViewModel r11 = r10.f123853j
            if (r11 != 0) goto L_0x031d
            java.lang.String r12 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x031d:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r11 = r11.f123232e
            if (r11 != 0) goto L_0x0326
            java.lang.String r12 = "publishEditModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x0326:
            boolean r11 = r11.publishFromLive()
            if (r11 != 0) goto L_0x0349
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r11 = r10.f123860r
            if (r11 != 0) goto L_0x0335
            java.lang.String r12 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x0335:
            boolean r11 = r11.isCutSameVideoType()
            if (r11 == 0) goto L_0x033c
            goto L_0x0349
        L_0x033c:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r11 = r10.f123859q
            if (r11 != 0) goto L_0x0345
            java.lang.String r12 = "editToolbarViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x0345:
            r11.mo97010a(r2)
            goto L_0x0355
        L_0x0349:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r11 = r10.f123859q
            if (r11 != 0) goto L_0x0352
            java.lang.String r12 = "editToolbarViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x0352:
            r11.mo97010a(r3)
        L_0x0355:
            boolean r11 = com.p683ss.android.ugc.aweme.shortvideo.edit.p2190b.C43440a.C43441a.m95215b()
            if (r11 == 0) goto L_0x03a1
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r11 = r10.f123859q
            if (r11 != 0) goto L_0x0364
            java.lang.String r12 = "editToolbarViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x0364:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f123860r
            if (r12 != 0) goto L_0x036d
            java.lang.String r4 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x036d:
            boolean r12 = r12.autoEnhanceOn
            if (r12 == 0) goto L_0x0387
            android.app.Activity r12 = r10.f33840g_
            if (r12 != 0) goto L_0x0378
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0378:
            android.content.Context r12 = (android.content.Context) r12
            r1 = 2131951801(0x7f1300b9, float:1.9540027E38)
            android.graphics.drawable.Drawable r12 = android.support.p030v4.content.C0726c.m2091a(r12, r1)
            if (r12 != 0) goto L_0x0399
            p2628d.p2639f.p2641b.C52711k.m112234a()
            goto L_0x0399
        L_0x0387:
            android.app.Activity r12 = r10.f33840g_
            if (r12 != 0) goto L_0x038e
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x038e:
            android.content.Context r12 = (android.content.Context) r12
            android.graphics.drawable.Drawable r12 = android.support.p030v4.content.C0726c.m2091a(r12, r1)
            if (r12 != 0) goto L_0x0399
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0399:
            java.lang.String r1 = "if (mModel.autoEnhanceOn…c_auto_enhance_off_new)!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r1)
            r11.mo97013b(r12)
        L_0x03a1:
            com.ss.android.ugc.gamora.editor.EditViewModel r11 = r10.f123853j
            if (r11 != 0) goto L_0x03aa
            java.lang.String r12 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x03aa:
            boolean r11 = r11.mo97054y()
            if (r11 == 0) goto L_0x03d4
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r11 = r10.f123859q
            if (r11 != 0) goto L_0x03b9
            java.lang.String r12 = "editToolbarViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x03b9:
            r11.mo97017d(r6, r3)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r11 = r10.f123859q
            if (r11 != 0) goto L_0x03c5
            java.lang.String r12 = "editToolbarViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x03c5:
            r11.mo97017d(r7, r3)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r11 = r10.f123859q
            if (r11 != 0) goto L_0x03d1
            java.lang.String r12 = "editToolbarViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x03d1:
            r11.mo97008a(r7, r3)
        L_0x03d4:
            com.ss.android.ugc.gamora.editor.EditViewModel r11 = r10.f123853j
            if (r11 != 0) goto L_0x03dd
            java.lang.String r12 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x03dd:
            boolean r11 = r11.mo97022B()
            if (r11 == 0) goto L_0x041a
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r11 = r10.f123860r
            if (r11 != 0) goto L_0x03ec
            java.lang.String r12 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x03ec:
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r11 = r11.veAudioRecorderParam
            if (r11 == 0) goto L_0x040e
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r11 = r10.f123860r
            if (r11 != 0) goto L_0x03f9
            java.lang.String r12 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x03f9:
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r11 = r11.veAudioRecorderParam
            boolean r11 = r11.hasRecord()
            if (r11 == 0) goto L_0x040e
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r11 = r10.f123859q
            if (r11 != 0) goto L_0x040a
            java.lang.String r12 = "editToolbarViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x040a:
            r11.mo97017d(r0, r2)
            goto L_0x041a
        L_0x040e:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r11 = r10.f123859q
            if (r11 != 0) goto L_0x0417
            java.lang.String r12 = "editToolbarViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x0417:
            r11.mo97017d(r0, r3)
        L_0x041a:
            com.ss.android.ugc.gamora.editor.EditViewModel r11 = r10.f123853j
            if (r11 != 0) goto L_0x0423
            java.lang.String r12 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x0423:
            boolean r11 = r11.mo97049t()
            if (r11 != 0) goto L_0x0453
            com.ss.android.ugc.gamora.editor.EditViewModel r11 = r10.f123853j
            if (r11 != 0) goto L_0x0432
            java.lang.String r12 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x0432:
            boolean r11 = r11.mo97050u()
            if (r11 != 0) goto L_0x0453
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r11 = r10.f123860r
            if (r11 != 0) goto L_0x0441
            java.lang.String r12 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x0441:
            java.lang.String r11 = r11.mMusicPath
            if (r11 == 0) goto L_0x0453
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r11 = r10.f123860r
            if (r11 != 0) goto L_0x044e
            java.lang.String r12 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x044e:
            boolean r11 = r11.isStickPointMode
            if (r11 != 0) goto L_0x0453
            goto L_0x0454
        L_0x0453:
            r2 = 0
        L_0x0454:
            com.ss.android.ugc.aweme.shortvideo.dh r11 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r11 = r11.mo50201b()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f123860r
            if (r12 != 0) goto L_0x0465
            java.lang.String r0 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0465:
            boolean r12 = r12.isMvThemeVideoType()
            if (r12 == 0) goto L_0x049a
            if (r11 == 0) goto L_0x049a
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f123860r
            if (r12 != 0) goto L_0x0476
            java.lang.String r0 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0476:
            com.ss.android.ugc.aweme.at.b r12 = r12.mvCreateVideoData
            java.util.List<java.lang.String> r12 = r12.musicIds
            java.util.Collection r12 = (java.util.Collection) r12
            boolean r12 = com.p683ss.android.ugc.aweme.base.utils.C23715d.m58202a(r12)
            if (r12 != 0) goto L_0x049a
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f123860r
            if (r12 != 0) goto L_0x048b
            java.lang.String r0 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x048b:
            com.ss.android.ugc.aweme.at.b r12 = r12.mvCreateVideoData
            java.util.List<java.lang.String> r12 = r12.musicIds
            java.lang.String r11 = r11.getMusicId()
            boolean r11 = r12.contains(r11)
            if (r11 == 0) goto L_0x049a
            r2 = 0
        L_0x049a:
            com.ss.android.ugc.gamora.editor.EditViewModel r11 = r10.f123853j
            if (r11 != 0) goto L_0x04a3
            java.lang.String r11 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r11)
        L_0x04a3:
            boolean r11 = com.p683ss.android.ugc.gamora.editor.EditViewModel.m105818D()
            if (r11 == 0) goto L_0x04cc
            android.app.Activity r11 = r10.f33840g_
            if (r11 == 0) goto L_0x04c4
            android.support.v4.app.FragmentActivity r11 = (android.support.p030v4.app.FragmentActivity) r11
            com.ss.android.ugc.gamora.b.c r11 = com.p683ss.android.ugc.gamora.p2458b.C48927d.m105736a(r11)
            java.lang.Class<com.ss.android.ugc.gamora.editor.EditMusicViewModel> r12 = com.p683ss.android.ugc.gamora.editor.EditMusicViewModel.class
            com.bytedance.jedi.arch.JediViewModel r11 = r11.mo96760a(r12)
            java.lang.String r12 = "JediViewModelProviders.o…sicViewModel::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r12)
            com.ss.android.ugc.gamora.editor.EditMusicViewModel r11 = (com.p683ss.android.ugc.gamora.editor.EditMusicViewModel) r11
            r11.mo96902a(r2)
            goto L_0x04d8
        L_0x04c4:
            d.u r11 = new d.u
            java.lang.String r12 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r11.<init>(r12)
            throw r11
        L_0x04cc:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r11 = r10.f123859q
            if (r11 != 0) goto L_0x04d5
            java.lang.String r12 = "editToolbarViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x04d5:
            r11.mo97008a(r6, r2)
        L_0x04d8:
            com.ss.android.ugc.gamora.editor.EditViewModel r11 = r10.f123853j
            if (r11 != 0) goto L_0x04e1
            java.lang.String r12 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x04e1:
            boolean r11 = r11.mo97021A()
            r12 = -1
            if (r11 != 0) goto L_0x04ee
            java.lang.String r11 = "voice"
            com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96179a(r11, r12)
            goto L_0x04f5
        L_0x04ee:
            java.lang.String r11 = "voice"
            int r0 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.f110823i
            com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96179a(r11, r0)
        L_0x04f5:
            boolean r11 = com.p683ss.android.ugc.aweme.shortvideo.edit.p2190b.C43440a.C43441a.m95215b()
            if (r11 != 0) goto L_0x0501
            java.lang.String r11 = "auto_enhance"
            com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96179a(r11, r12)
            return
        L_0x0501:
            java.lang.String r11 = "auto_enhance"
            int r12 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.f110818d
            com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96179a(r11, r12)
            return
        L_0x0509:
            d.u r11 = new d.u
            java.lang.String r12 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.C49321bu.mo24463a(android.view.View, android.os.Bundle):void");
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
        C49340ca caVar = this.f123862t;
        if (caVar != null) {
            caVar.mo97282a();
        }
    }

    /* renamed from: F */
    public final void mo97281F() {
        C49340ca caVar = this.f123862t;
        if (caVar != null) {
            caVar.mo97282a();
        }
        Activity activity = this.f33840g_;
        if (activity != null) {
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            EditViewModel editViewModel = this.f123853j;
            if (editViewModel == null) {
                C52711k.m112237a("editViewModel");
            }
            EditToolbarViewModel editToolbarViewModel = this.f123859q;
            if (editToolbarViewModel == null) {
                C52711k.m112237a("editToolbarViewModel");
            }
            C12924i iVar = this.f33835c;
            if (iVar != null) {
                C49340ca caVar2 = new C49340ca(fragmentActivity, editViewModel, editToolbarViewModel, (C12896b) iVar);
                caVar2.mo97286a(this.f123857n);
                caVar2.mo97290b(this.f123857n);
                caVar2.mo97292c(this.f123857n);
                caVar2.mo97287a(this.f123857n, 80);
                View view = (View) this.f123857n.get(Integer.valueOf(1));
                if (view != null) {
                    if (view != null) {
                        caVar2.mo97289b((C43458e) view);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.EditToolBarItem");
                    }
                }
                View view2 = (View) this.f123857n.get(Integer.valueOf(9));
                if (view2 != null) {
                    if (view2 != null) {
                        caVar2.mo97285a((C43458e) view2);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.EditToolBarItem");
                    }
                }
                this.f123862t = caVar2;
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public static final /* synthetic */ EditViewModel m106399a(C49321bu buVar) {
        EditViewModel editViewModel = buVar.f123853j;
        if (editViewModel == null) {
            C52711k.m112237a("editViewModel");
        }
        return editViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ ViewGroup m106400b(C49321bu buVar) {
        ViewGroup viewGroup = buVar.f123856m;
        if (viewGroup == null) {
            C52711k.m112237a("mToolbarContainer");
        }
        return viewGroup;
    }

    /* renamed from: c */
    public static final /* synthetic */ ConstraintLayout m106401c(C49321bu buVar) {
        ConstraintLayout constraintLayout = buVar.f123852i;
        if (constraintLayout == null) {
            C52711k.m112237a("titleLayout");
        }
        return constraintLayout;
    }

    /* renamed from: d */
    public final void mo24408d(Bundle bundle) {
        super.mo24408d(bundle);
        Activity activity = this.f33840g_;
        if (activity != null) {
            JediViewModel a = C48927d.m105736a((FragmentActivity) activity).mo96760a(EditViewModel.class);
            C52711k.m112236a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java]");
            this.f123853j = (EditViewModel) a;
            EditViewModel editViewModel = this.f123853j;
            if (editViewModel == null) {
                C52711k.m112237a("editViewModel");
            }
            this.f123860r = editViewModel.mo97035e();
            Activity activity2 = this.f33840g_;
            if (activity2 != null) {
                JediViewModel a2 = C48927d.m105736a((FragmentActivity) activity2).mo96760a(EditToolbarViewModel.class);
                C52711k.m112236a((Object) a2, "JediViewModelProviders.o…barViewModel::class.java]");
                this.f123859q = (EditToolbarViewModel) a2;
                Activity activity3 = this.f33840g_;
                if (activity3 != null) {
                    JediViewModel a3 = C48927d.m105736a((FragmentActivity) activity3).mo96760a(EditAutoEnhanceViewModel.class);
                    C52711k.m112236a((Object) a3, "JediViewModelProviders.o…nceViewModel::class.java)");
                    this.f123861s = (EditAutoEnhanceViewModel) a3;
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
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
        View inflate = layoutInflater.inflate(R.layout.aeb, viewGroup, false);
        if (inflate != null) {
            this.f123852i = (ConstraintLayout) inflate;
            ConstraintLayout constraintLayout = this.f123852i;
            if (constraintLayout == null) {
                C52711k.m112237a("titleLayout");
            }
            return constraintLayout;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.constraint.ConstraintLayout");
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
