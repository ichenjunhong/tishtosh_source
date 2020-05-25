package com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2327e;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.os.Handler;
import android.support.p043v7.widget.C1440au;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1327f;
import android.support.p043v7.widget.ViewStubCompat;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.port.p2082in.C39587ba;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2323a.C46477a;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2324b.C46487b;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2326d.C46502b;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.tools.utils.C50201e;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.e.d */
public final class C46508d {

    /* renamed from: f */
    public static final C46510a f117347f = new C46510a(null);

    /* renamed from: a */
    public final View f117348a;

    /* renamed from: b */
    public final C46477a f117349b;

    /* renamed from: c */
    public C46505b f117350c;

    /* renamed from: d */
    public boolean f117351d = true;

    /* renamed from: e */
    public final Activity f117352e;

    /* renamed from: g */
    private final RecyclerView f117353g;

    /* renamed from: h */
    private final View f117354h;

    /* renamed from: i */
    private final boolean f117355i;

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.e.d$a */
    public static final class C46510a {
        private C46510a() {
        }

        public /* synthetic */ C46510a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.e.d$b */
    public static final class C46511b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C46508d f117357a;

        public C46511b(C46508d dVar) {
            this.f117357a = dVar;
        }

        public final void run() {
            if (this.f117357a.f117352e != null && !this.f117357a.f117352e.isFinishing() && this.f117357a.f117351d) {
                try {
                    C46505b bVar = this.f117357a.f117350c;
                    if (bVar == null) {
                        C52711k.m112234a();
                    }
                    bVar.show();
                    this.f117357a.f117351d = false;
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo93253b() {
        this.f117348a.setVisibility(0);
    }

    /* renamed from: c */
    public final void mo93254c() {
        this.f117348a.setVisibility(8);
    }

    /* renamed from: a */
    public final int mo93248a() {
        C46477a aVar = this.f117349b;
        if (aVar == null) {
            C52711k.m112234a();
        }
        return aVar.mo93215a();
    }

    /* renamed from: d */
    public final void mo93255d() {
        C46477a aVar = this.f117349b;
        if (aVar == null) {
            C52711k.m112234a();
        }
        aVar.mo93218b();
    }

    /* renamed from: f */
    public final void mo93257f() {
        if (this.f117349b != null) {
            this.f117349b.mo93220d();
            this.f117349b.notifyDataSetChanged();
        }
    }

    /* renamed from: g */
    public final void mo93258g() {
        C46477a aVar = this.f117349b;
        if (aVar == null) {
            C52711k.m112234a();
        }
        aVar.mo93221e();
        this.f117349b.notifyDataSetChanged();
    }

    /* renamed from: i */
    public final boolean mo93260i() {
        if (this.f117352e == null || this.f117352e.isFinishing()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final void mo93256e() {
        if (this.f117349b != null) {
            this.f117349b.mo93219c();
            this.f117349b.notifyItemRemoved(this.f117349b.getItemCount());
        }
    }

    /* renamed from: h */
    public final void mo93259h() {
        this.f117351d = true;
        if (this.f117350c != null) {
            C46505b bVar = this.f117350c;
            if (bVar == null) {
                C52711k.m112234a();
            }
            if (bVar.isShowing()) {
                C46505b bVar2 = this.f117350c;
                if (bVar2 == null) {
                    C52711k.m112234a();
                }
                bVar2.dismiss();
            }
        }
    }

    /* renamed from: a */
    public final void mo93249a(int i) {
        this.f117353g.mo4814b(0);
    }

    /* renamed from: a */
    public final void mo93250a(String str) {
        C46477a aVar = this.f117349b;
        if (aVar == null) {
            C52711k.m112234a();
        }
        aVar.mo93216a(str);
    }

    /* renamed from: a */
    public final void mo93251a(List<C46487b> list) {
        C52711k.m112240b(list, "dataList");
        if (!C50201e.m108355a(list)) {
            C46477a aVar = this.f117349b;
            if (aVar == null) {
                C52711k.m112234a();
            }
            aVar.mo93217a(list);
        }
    }

    /* renamed from: a */
    public final boolean mo93252a(Effect effect, OnDismissListener onDismissListener, Handler handler) {
        C52711k.m112240b(effect, "faceStickerBean");
        C52711k.m112240b(onDismissListener, "onDismissListener");
        C52711k.m112240b(handler, "handler");
        if (!mo93260i()) {
            return false;
        }
        C39587ba F = C39629l.m88232a().mo58568F();
        Activity activity = this.f117352e;
        if (activity == null) {
            C52711k.m112234a();
        }
        Dialog a = F.mo49451a(effect, onDismissListener, handler, activity);
        if (a != null && mo93260i()) {
            try {
                a.show();
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public C46508d(ViewStubCompat viewStubCompat, Activity activity, boolean z, final C46502b bVar) {
        C52711k.m112240b(viewStubCompat, "faceViewStub");
        this.f117352e = activity;
        this.f117355i = z;
        View a = viewStubCompat.mo5425a();
        C52711k.m112236a((Object) a, "faceViewStub.inflate()");
        this.f117348a = a;
        View findViewById = this.f117348a.findViewById(R.id.b9g);
        C52711k.m112236a((Object) findViewById, "rootView.findViewById(R.id.layout_rv_face_matting)");
        this.f117353g = (RecyclerView) findViewById;
        this.f117353g.setLayoutManager(new LinearLayoutManager(this.f117353g.getContext(), 0, false));
        View findViewById2 = this.f117348a.findViewById(R.id.b41);
        C52711k.m112236a((Object) findViewById2, "rootView.findViewById(R.id.iv_select)");
        this.f117354h = findViewById2;
        this.f117354h.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C46502b bVar = bVar;
                if (bVar != null) {
                    bVar.mo93182a();
                }
            }
        });
        Context context = viewStubCompat.getContext();
        C52711k.m112236a((Object) context, "faceViewStub.context");
        this.f117349b = new C46477a(context, this.f117355i, bVar);
        this.f117353g.setAdapter(this.f117349b);
        C1327f itemAnimator = this.f117353g.getItemAnimator();
        if (itemAnimator != null) {
            ((C1440au) itemAnimator).f5184m = false;
            this.f117348a.setVisibility(8);
            if (mo93260i()) {
                Activity activity2 = this.f117352e;
                if (activity2 == null) {
                    C52711k.m112234a();
                }
                this.f117350c = new C46505b(activity2);
            }
            ((ImageView) this.f117348a.findViewById(R.id.ckk)).setColorFilter(-1);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.SimpleItemAnimator");
    }
}
