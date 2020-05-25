package com.bytedance.android.live.broadcast.effect.p205b.p206a;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.android.live.broadcast.api.p195b.C3040c;
import com.bytedance.android.live.broadcast.effect.C3203b;
import com.bytedance.android.live.broadcast.effect.C3366v.C3367a;
import com.bytedance.android.live.broadcast.effect.C3366v.C3369c;
import com.bytedance.android.live.broadcast.effect.p205b.p206a.C3206a.C3208b;
import com.bytedance.android.live.broadcast.effect.p208d.C3248a;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.core.p229f.C3846a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView.C4239a;
import com.bytedance.android.livesdk.chatroom.p325ui.C6164eu;
import com.bytedance.android.livesdk.chatroom.p325ui.C6164eu.C6169a;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p385j.p386a.C7704a;
import com.bytedance.android.livesdk.widget.AdjustPercentBar;
import com.bytedance.android.livesdk.widget.AdjustPercentBar.C8452b;
import com.bytedance.android.livesdkapi.depend.model.C8688c;
import com.bytedance.android.livesdkapi.depend.model.C8688c.C8689a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.bytedance.android.live.broadcast.effect.b.a.c */
public final class C3216c extends C3846a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f9313a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C3216c.class), "beautyAdapter", "getBeautyAdapter()Lcom/bytedance/android/live/broadcast/effect/beauty/smallitem/LiveSmallItemBeautyAdapter;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C3216c.class), "smallItemBeautySeekBar", "getSmallItemBeautySeekBar()Lcom/bytedance/android/livesdk/widget/AdjustPercentBar;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C3216c.class), "smallItemBeautyResetView", "getSmallItemBeautyResetView()Landroid/view/View;"))};

    /* renamed from: i */
    public static final C3217a f9314i = new C3217a(null);

    /* renamed from: b */
    public C8688c f9315b;

    /* renamed from: c */
    C6164eu f9316c;

    /* renamed from: d */
    public View f9317d;

    /* renamed from: e */
    public AdjustPercentBar f9318e;

    /* renamed from: f */
    public int f9319f = R.layout.alj;

    /* renamed from: g */
    public int f9320g = R.layout.ald;

    /* renamed from: h */
    public final C3219c f9321h = new C3219c(this);

    /* renamed from: j */
    private final C52668f f9322j = C52732g.m112285a(new C3218b(this));

    /* renamed from: k */
    private final C52668f f9323k = C52732g.m112285a(new C3227k(this));

    /* renamed from: l */
    private final C52668f f9324l = C52732g.m112285a(new C3226j(this));

    /* renamed from: m */
    private HashMap f9325m;

    /* renamed from: com.bytedance.android.live.broadcast.effect.b.a.c$a */
    public static final class C3217a {
        private C3217a() {
        }

        public /* synthetic */ C3217a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C3216c m8861a(C3248a aVar) {
            C52711k.m112240b(aVar, "beautyTemplate");
            C3216c cVar = new C3216c();
            cVar.f9317d = aVar.f9380a;
            cVar.f9318e = aVar.f9381b;
            cVar.f9319f = aVar.f9382c;
            cVar.f9320g = aVar.f9383d;
            return cVar;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.b.a.c$b */
    static final class C3218b extends C52712l implements C52670a<C3206a> {

        /* renamed from: a */
        final /* synthetic */ C3216c f9326a;

        C3218b(C3216c cVar) {
            this.f9326a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C3216c cVar = this.f9326a;
            C3206a aVar = new C3206a(cVar.f9319f, cVar.f9320g);
            C3208b dVar = new C3220d(cVar);
            C52711k.m112240b(dVar, "listener");
            aVar.f9288c = dVar;
            return aVar;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.b.a.c$c */
    public static final class C3219c implements C3369c {

        /* renamed from: a */
        final /* synthetic */ C3216c f9327a;

        /* renamed from: a */
        public final void mo8566a() {
            LoadingStatusView loadingStatusView = (LoadingStatusView) this.f9327a.mo8561a((int) R.id.cpk);
            if (loadingStatusView != null) {
                loadingStatusView.mo9845d();
            }
        }

        C3219c(C3216c cVar) {
            this.f9327a = cVar;
        }

        /* renamed from: a */
        public final void mo8567a(List<? extends C8688c> list) {
            C52711k.m112240b(list, "stickerList");
            C3206a a = this.f9327a.mo8562a();
            C52711k.m112240b(list, "list");
            a.f9286a = list;
            a.notifyDataSetChanged();
            if (this.f9327a.f9315b == null) {
                this.f9327a.f9315b = (C8688c) list.get(0);
            }
            if (((LoadingStatusView) this.f9327a.mo8561a((int) R.id.cpk)) != null) {
                LoadingStatusView loadingStatusView = (LoadingStatusView) this.f9327a.mo8561a((int) R.id.cpk);
                C52711k.m112236a((Object) loadingStatusView, "small_item_beauty_loading_view");
                loadingStatusView.setVisibility(8);
            }
            this.f9327a.mo8565d();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.b.a.c$d */
    public static final class C3220d implements C3208b {

        /* renamed from: a */
        final /* synthetic */ C3216c f9328a;

        C3220d(C3216c cVar) {
            this.f9328a = cVar;
        }

        /* renamed from: a */
        public final void mo8556a(C8688c cVar) {
            C52711k.m112240b(cVar, "sticker");
            this.f9328a.f9315b = cVar;
            this.f9328a.mo8565d();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.b.a.c$e */
    static final class C3221e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3216c f9329a;

        C3221e(C3216c cVar) {
            this.f9329a = cVar;
        }

        public final void onClick(View view) {
            C3203b b = C3395f.m9156f().mo8741b();
            C52711k.m112236a((Object) b, "LiveInternalService.inst().liveEffectService()");
            b.mo8553b().mo8733a((Fragment) this.f9329a, (C3369c) this.f9329a.f9321h);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.b.a.c$f */
    public static final class C3222f implements C8452b {

        /* renamed from: a */
        final /* synthetic */ C3216c f9330a;

        C3222f(C3216c cVar) {
            this.f9330a = cVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0023  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo8569a(int r4) {
            /*
                r3 = this;
                com.bytedance.android.live.broadcast.effect.b.a.c r0 = r3.f9330a
                com.bytedance.android.livesdkapi.depend.model.c r0 = r0.f9315b
                if (r0 != 0) goto L_0x0007
                return
            L_0x0007:
                com.bytedance.android.live.broadcast.f.c r0 = com.bytedance.android.live.broadcast.p211f.C3395f.m9156f()
                com.bytedance.android.live.broadcast.api.b.c r0 = r0.mo8740a()
                com.bytedance.android.live.broadcast.effect.b.a.c r1 = r3.f9330a
                com.bytedance.android.livesdkapi.depend.model.c r1 = r1.f9315b
                if (r1 == 0) goto L_0x001c
                com.bytedance.android.livesdkapi.depend.model.c$a r1 = r1.f23749j
                if (r1 == 0) goto L_0x001c
                java.lang.String r1 = r1.f23764b
                goto L_0x001d
            L_0x001c:
                r1 = 0
            L_0x001d:
                com.bytedance.android.live.broadcast.effect.b.a.c r2 = r3.f9330a
                com.bytedance.android.livesdkapi.depend.model.c r2 = r2.f9315b
                if (r2 != 0) goto L_0x0026
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0026:
                float r4 = com.bytedance.android.live.broadcast.effect.C3366v.C3367a.m9122a(r2, r4)
                r0.mo8267a(r1, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.effect.p205b.p206a.C3216c.C3222f.mo8569a(int):void");
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.b.a.c$g */
    static final class C3223g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3216c f9331a;

        C3223g(C3216c cVar) {
            this.f9331a = cVar;
        }

        public final void onClick(View view) {
            C3216c cVar = this.f9331a;
            cVar.f9316c = new C6169a(cVar.getContext(), 2).mo12210a(false).mo12214b(C3922z.m9903a((int) R.string.eeg), new C3224h(cVar)).mo12209a(C3922z.m9903a((int) R.string.ess), C3225i.f9333a).mo12213b((CharSequence) C3922z.m9903a((int) R.string.eeh)).mo12208a((CharSequence) C3922z.m9903a((int) R.string.eei)).mo12211a();
            C6164eu euVar = cVar.f9316c;
            if (euVar != null) {
                euVar.show();
            }
            C3216c.m8855a("live_beauty_reset");
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.b.a.c$h */
    static final class C3224h implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3216c f9332a;

        C3224h(C3216c cVar) {
            this.f9332a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            String str;
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            C3216c cVar = this.f9332a;
            C3203b b = C3395f.m9156f().mo8741b();
            C52711k.m112236a((Object) b, "LiveInternalService.inst().liveEffectService()");
            Iterator it = b.mo8553b().f9665a.iterator();
            while (it.hasNext()) {
                C8688c cVar2 = (C8688c) it.next();
                C3040c a = C3395f.m9156f().mo8740a();
                C52711k.m112236a((Object) cVar2, "value");
                C8689a aVar = cVar2.f23749j;
                if (aVar == null) {
                    C52711k.m112234a();
                }
                String str2 = aVar.f23764b;
                C8689a aVar2 = cVar2.f23749j;
                if (aVar2 == null) {
                    C52711k.m112234a();
                }
                a.mo8265a(cVar2, str2, C3367a.m9122a(cVar2, aVar2.f23763a), false);
                String str3 = cVar2.f23753n;
                C8688c cVar3 = cVar.f9315b;
                if (cVar3 != null) {
                    str = cVar3.f23753n;
                } else {
                    str = null;
                }
                if (C52711k.m112239a((Object) str3, (Object) str)) {
                    AdjustPercentBar b2 = cVar.mo8563b();
                    C8689a aVar3 = cVar2.f23749j;
                    if (aVar3 == null) {
                        C52711k.m112234a();
                    }
                    b2.setPercent(aVar3.f23763a);
                }
            }
            C3216c.m8855a("live_beauty_reset_confirm");
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.b.a.c$i */
    static final class C3225i implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final C3225i f9333a = new C3225i();

        C3225i() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.b.a.c$j */
    static final class C3226j extends C52712l implements C52670a<View> {

        /* renamed from: a */
        final /* synthetic */ C3216c f9334a;

        C3226j(C3216c cVar) {
            this.f9334a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view;
            if (this.f9334a.f9317d != null) {
                view = this.f9334a.f9317d;
                if (view == null) {
                    C52711k.m112234a();
                    return view;
                }
            } else {
                view = LayoutInflater.from(this.f9334a.getContext()).inflate(R.layout.bxg, null);
            }
            return view;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.b.a.c$k */
    static final class C3227k extends C52712l implements C52670a<AdjustPercentBar> {

        /* renamed from: a */
        final /* synthetic */ C3216c f9335a;

        C3227k(C3216c cVar) {
            this.f9335a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            AdjustPercentBar adjustPercentBar;
            if (this.f9335a.f9318e != null) {
                adjustPercentBar = this.f9335a.f9318e;
                if (adjustPercentBar == null) {
                    C52711k.m112234a();
                    return adjustPercentBar;
                }
            } else {
                View inflate = LayoutInflater.from(this.f9335a.getContext()).inflate(R.layout.bxh, null);
                if (inflate != null) {
                    adjustPercentBar = (AdjustPercentBar) inflate;
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.bytedance.android.livesdk.widget.AdjustPercentBar");
                }
            }
            return adjustPercentBar;
        }
    }

    /* renamed from: a */
    public final View mo8561a(int i) {
        if (this.f9325m == null) {
            this.f9325m = new HashMap();
        }
        View view = (View) this.f9325m.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f9325m.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public final C3206a mo8562a() {
        return (C3206a) this.f9322j.getValue();
    }

    /* renamed from: b */
    public final AdjustPercentBar mo8563b() {
        return (AdjustPercentBar) this.f9323k.getValue();
    }

    /* renamed from: c */
    public final View mo8564c() {
        return (View) this.f9324l.getValue();
    }

    public final void onPause() {
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f9325m != null) {
            this.f9325m.clear();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007f  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8565d() {
        /*
            r4 = this;
            com.bytedance.android.livesdk.widget.AdjustPercentBar r0 = r4.mo8563b()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            com.bytedance.android.livesdkapi.depend.model.c r0 = r4.f9315b
            r1 = 0
            if (r0 == 0) goto L_0x000f
            com.bytedance.android.livesdkapi.depend.model.c$a r0 = r0.f23749j
            goto L_0x0010
        L_0x000f:
            r0 = r1
        L_0x0010:
            if (r0 != 0) goto L_0x001c
            com.bytedance.android.livesdk.widget.AdjustPercentBar r0 = r4.mo8563b()
            r1 = 8
            r0.setVisibility(r1)
            return
        L_0x001c:
            com.bytedance.android.livesdk.widget.AdjustPercentBar r0 = r4.mo8563b()
            r2 = 0
            r0.setVisibility(r2)
            com.bytedance.android.live.broadcast.f.c r0 = com.bytedance.android.live.broadcast.p211f.C3395f.m9156f()
            com.bytedance.android.live.broadcast.api.b.c r0 = r0.mo8740a()
            com.bytedance.android.livesdkapi.depend.model.c r3 = r4.f9315b
            if (r3 == 0) goto L_0x0037
            com.bytedance.android.livesdkapi.depend.model.c$a r3 = r3.f23749j
            if (r3 == 0) goto L_0x0037
            java.lang.String r3 = r3.f23764b
            goto L_0x0038
        L_0x0037:
            r3 = r1
        L_0x0038:
            java.lang.Float r0 = r0.mo8275c(r3)
            if (r0 != 0) goto L_0x0064
            com.bytedance.android.livesdkapi.depend.model.c r0 = r4.f9315b
            if (r0 != 0) goto L_0x0045
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0045:
            com.bytedance.android.livesdkapi.depend.model.c r3 = r4.f9315b
            if (r3 == 0) goto L_0x0053
            com.bytedance.android.livesdkapi.depend.model.c$a r3 = r3.f23749j
            if (r3 == 0) goto L_0x0053
            int r1 = r3.f23763a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x0053:
            if (r1 != 0) goto L_0x0058
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0058:
            int r1 = r1.intValue()
            float r0 = com.bytedance.android.live.broadcast.effect.C3366v.C3367a.m9122a(r0, r1)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x0064:
            com.bytedance.android.livesdk.widget.AdjustPercentBar r1 = r4.mo8563b()
            com.bytedance.android.livesdkapi.depend.model.c r3 = r4.f9315b
            if (r3 != 0) goto L_0x006f
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x006f:
            float r0 = r0.floatValue()
            int r0 = com.bytedance.android.live.broadcast.effect.C3366v.C3367a.m9123a(r3, r0)
            r1.setPercent(r0)
            com.bytedance.android.livesdkapi.depend.model.c r0 = r4.f9315b
            r1 = 1
            if (r0 == 0) goto L_0x0093
            com.bytedance.android.livesdkapi.depend.model.c$a r0 = r0.f23749j
            if (r0 == 0) goto L_0x0093
            boolean r0 = r0.f23767e
            if (r0 != r1) goto L_0x0093
            com.bytedance.android.livesdk.widget.AdjustPercentBar r0 = r4.mo8563b()
            r1 = 50
            r3 = -50
            r0.mo14664a(r1, r3, r2, r2)
            goto L_0x009c
        L_0x0093:
            com.bytedance.android.livesdk.widget.AdjustPercentBar r0 = r4.mo8563b()
            r3 = 100
            r0.mo14664a(r3, r2, r2, r1)
        L_0x009c:
            com.bytedance.android.live.broadcast.f.c r0 = com.bytedance.android.live.broadcast.p211f.C3395f.m9156f()
            com.bytedance.android.live.broadcast.api.b.c r0 = r0.mo8740a()
            java.lang.String r1 = com.bytedance.android.live.broadcast.api.C3037b.f8916d
            com.bytedance.android.livesdkapi.depend.model.c r2 = r4.f9315b
            r0.mo8268a(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.effect.p205b.p206a.C3216c.mo8565d():void");
    }

    /* renamed from: a */
    static void m8855a(String str) {
        C4495a.m10823a().mo10301a((Object) new C7704a(str));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.a_3, null);
        inflate.setOnClickListener(new C3221e(this));
        ((LoadingStatusView) mo8561a((int) R.id.cpk)).setBuilder(C4239a.m10480a(getContext()).mo9852c(inflate).mo9847a(getResources().getDimensionPixelSize(R.dimen.o4)));
        ((LoadingStatusView) mo8561a((int) R.id.cpk)).mo9843b();
        mo8563b().setOnLevelChangeListener(new C3222f(this));
        RecyclerView recyclerView = (RecyclerView) mo8561a((int) R.id.cpl);
        C52711k.m112236a((Object) recyclerView, "small_item_beauty_recycle_view");
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        RecyclerView recyclerView2 = (RecyclerView) mo8561a((int) R.id.cpl);
        C52711k.m112236a((Object) recyclerView2, "small_item_beauty_recycle_view");
        recyclerView2.setAdapter(mo8562a());
        ((RecyclerView) mo8561a((int) R.id.cpl)).mo4798a((C1331h) new C3228d());
        mo8564c().setOnClickListener(new C3223g(this));
        mo8565d();
        C3203b b = C3395f.m9156f().mo8741b();
        C52711k.m112236a((Object) b, "LiveInternalService.inst().liveEffectService()");
        b.mo8553b().mo8733a((Fragment) this, (C3369c) this.f9321h);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.bwf, viewGroup, false);
    }
}
