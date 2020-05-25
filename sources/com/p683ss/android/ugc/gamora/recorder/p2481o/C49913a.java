package com.p683ss.android.ugc.gamora.recorder.p2481o;

import android.app.Activity;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.als.C2759d;
import com.bytedance.als.C2764h;
import com.bytedance.p780m.C12356a;
import com.bytedance.p780m.C12361b;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.group.C12896b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p683ss.android.ugc.aweme.status.C45778e;
import com.p683ss.android.ugc.aweme.status.RecordStatusViewModel;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49596h;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.recorder.o.a */
public final class C49913a extends C2764h<C49916b> implements C12356a {

    /* renamed from: a */
    public final C49916b f125070a = new C49916b();

    /* renamed from: b */
    public SafeHandler f125071b;

    /* renamed from: c */
    public final C12896b f125072c;

    /* renamed from: d */
    private RecordStatusViewModel f125073d;

    /* renamed from: e */
    private final C12361b f125074e;

    /* renamed from: com.ss.android.ugc.gamora.recorder.o.a$a */
    static final class C49914a<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C12896b f125075a;

        /* renamed from: b */
        final /* synthetic */ C49913a f125076b;

        C49914a(C12896b bVar, C49913a aVar) {
            this.f125075a = bVar;
            this.f125076b = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            SafeHandler safeHandler = this.f125076b.f125071b;
            if (safeHandler == null) {
                C52711k.m112237a("safeHandler");
            }
            safeHandler.post(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C49914a f125077a;

                {
                    this.f125077a = r1;
                }

                public final void run() {
                    if (this.f125077a.f125075a.f33840g_ != null) {
                        C12896b bVar = this.f125077a.f125075a;
                        Activity activity = this.f125077a.f125075a.f33840g_;
                        if (activity != null) {
                            C12924i a = bVar.mo24388a(((FragmentActivity) activity).getString(R.string.h8p));
                            if (a == null) {
                                C52711k.m112234a();
                            }
                            C52711k.m112236a((Object) a, "findSceneByTag<RecordBot…ecord_mode_status_tag))!!");
                            C49596h hVar = (C49596h) a;
                            Activity activity2 = this.f125077a.f125075a.f33840g_;
                            if (activity2 != null) {
                                String string = ((FragmentActivity) activity2).getString(R.string.h8p);
                                C52711k.m112236a((Object) string, "(activity as FragmentAct…g.record_mode_status_tag)");
                                int a2 = hVar.mo97505a((Object) string);
                                if (a2 >= 0) {
                                    hVar.mo97506a(a2, false, true);
                                }
                                return;
                            }
                            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                        }
                        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                    }
                }
            });
        }
    }

    /* renamed from: j */
    public final C12361b mo23370j() {
        return this.f125074e;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2759d mo7353a() {
        return this.f125070a;
    }

    public final void bO_() {
        super.bO_();
        C12896b bVar = this.f125072c;
        Object a = bVar.mo24460E().mo24560a("safe_handler");
        if (a == null) {
            C52711k.m112234a();
        }
        this.f125071b = (SafeHandler) a;
        if (!TextUtils.isEmpty(C39618d.f101151O.mo83121e(C40796a.StatusTabKey))) {
            Activity activity = bVar.f33840g_;
            if (activity != null) {
                bVar.mo24389a((int) R.id.c_q, (C12924i) new C45778e((FragmentActivity) activity), "RecordStatusPendantScene");
            } else {
                throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
        }
        Activity activity2 = bVar.f33840g_;
        if (activity2 != null) {
            C0209x a2 = C0214z.m440a((FragmentActivity) activity2).mo359a(RecordStatusViewModel.class);
            C52711k.m112236a((Object) a2, "ViewModelProviders.of(ac…tusViewModel::class.java)");
            this.f125073d = (RecordStatusViewModel) a2;
            RecordStatusViewModel recordStatusViewModel = this.f125073d;
            if (recordStatusViewModel == null) {
                C52711k.m112237a("recordStatusViewModel");
            }
            C0198r k = recordStatusViewModel.mo92166k();
            Activity activity3 = bVar.f33840g_;
            if (activity3 != null) {
                k.observe((FragmentActivity) activity3, new C49914a(bVar, this));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    public C49913a(C12896b bVar, C12361b bVar2) {
        C52711k.m112240b(bVar, "parentScene");
        C52711k.m112240b(bVar2, "diContainer");
        this.f125072c = bVar;
        this.f125074e = bVar2;
    }
}
