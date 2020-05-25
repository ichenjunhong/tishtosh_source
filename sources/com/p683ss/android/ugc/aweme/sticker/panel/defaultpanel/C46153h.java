package com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p043v7.widget.RecyclerView.C1341n;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.p780m.C12361b;
import com.bytedance.p780m.C12366c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39527aa;
import com.p683ss.android.ugc.aweme.port.p2082in.C39527aa.C39528a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.sticker.p2275a.C45814b;
import com.p683ss.android.ugc.aweme.sticker.p2280d.C45859b;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2297f.p2298a.C46024a.C46025a;
import com.p683ss.android.ugc.aweme.sticker.panel.C46188h;
import com.p683ss.android.ugc.aweme.sticker.panel.p2302a.C46086b;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabItemView;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.defaultpanel.h */
public final class C46153h implements C46188h<AVDmtTabItemView, Fragment> {

    /* renamed from: a */
    public final C12361b f116469a;

    /* renamed from: b */
    public final Bundle f116470b;

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.defaultpanel.h$a */
    static final class C46154a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C46153h f116471a;

        /* renamed from: b */
        final /* synthetic */ EffectCategoryModel f116472b;

        /* renamed from: c */
        final /* synthetic */ Context f116473c;

        /* renamed from: d */
        final /* synthetic */ C52670a f116474d;

        C46154a(C46153h hVar, EffectCategoryModel effectCategoryModel, Context context, C52670a aVar) {
            this.f116471a = hVar;
            this.f116472b = effectCategoryModel;
            this.f116473c = context;
            this.f116474d = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C46025a.m100011a(this.f116472b) || C39629l.m88232a().mo58593x().mo74282b()) {
                this.f116474d.invoke();
                return;
            }
            C39527aa x = C39629l.m88232a().mo58593x();
            Context context = this.f116473c;
            if (context != null) {
                x.mo74276a((Activity) context, "", "click_my_prop", this.f116471a.f116470b, (C39528a) new C39528a(this) {

                    /* renamed from: a */
                    final /* synthetic */ C46154a f116475a;

                    /* renamed from: b */
                    public final void mo64372b() {
                    }

                    /* renamed from: a */
                    public final void mo64371a() {
                        ((C46354l) this.f116475a.f116471a.f116469a.mo23373a(C46354l.class, (String) null)).mo92990h();
                    }

                    {
                        this.f116475a = r1;
                    }
                });
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.app.Activity");
        }
    }

    public C46153h(C12361b bVar, Bundle bundle) {
        C52711k.m112240b(bVar, "objectContainer");
        this.f116469a = bVar;
        this.f116470b = bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        if (p2628d.C52860x.f131107a == null) goto L_0x0049;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo92848a(android.content.Context r6, com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryModel r7, p2628d.p2639f.p2640a.C52670a r8) {
        /*
            r5 = this;
            java.lang.String r0 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            java.lang.String r0 = "model"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            java.lang.String r0 = "onClick"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabItemView r0 = com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabLayout.C46784a.m101614a(r6)
            com.ss.android.ugc.effectmanager.effect.model.EffectCategoryIconsModel r1 = r7.getIcon()
            if (r1 == 0) goto L_0x0049
            java.lang.String r2 = r1.getUri()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3 = 1
            if (r2 == 0) goto L_0x002b
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r2 = 0
            goto L_0x002c
        L_0x002b:
            r2 = 1
        L_0x002c:
            r2 = r2 ^ r3
            r3 = 0
            if (r2 == 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r1 = r3
        L_0x0032:
            if (r1 == 0) goto L_0x0049
            com.bytedance.m.b r2 = r5.f116469a
            java.lang.Class<com.ss.android.ugc.aweme.sticker.a> r4 = com.p683ss.android.ugc.aweme.sticker.C45805a.class
            r2.mo23375b(r4, r3)
            java.lang.String r1 = r1.getUri()
            r2 = 2131953475(0x7f130743, float:1.9543422E38)
            r0.mo93987a(r1, r2)
            d.x r1 = p2628d.C52860x.f131107a
            if (r1 != 0) goto L_0x0050
        L_0x0049:
            java.lang.String r1 = r7.getName()
            r0.setText(r1)
        L_0x0050:
            com.ss.android.ugc.aweme.sticker.panel.defaultpanel.h$a r1 = new com.ss.android.ugc.aweme.sticker.panel.defaultpanel.h$a
            r1.<init>(r5, r7, r6, r8)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel.C46153h.mo92848a(android.content.Context, com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel, d.f.a.a):java.lang.Object");
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo92847a(int i, C46354l lVar, C45814b bVar, C1341n nVar) {
        C52711k.m112240b(lVar, "stickerDataManager");
        C52711k.m112240b(bVar, "stickerSelectedController");
        C52711k.m112240b(nVar, "viewPool");
        C12366c cVar = new C12366c(this.f116469a);
        C52711k.m112236a((Object) cVar.mo23380a(C1341n.class, (String) null, nVar), "this.registerInstance(T:…ass.java, null, instance)");
        C12361b a = cVar.mo23376a();
        C52711k.m112236a((Object) a, "ObjectContainerBuilder(o…ewPool)\n        }.build()");
        if (C45859b.m99698a(lVar, i)) {
            C46162m mVar = new C46162m();
            mVar.mo92854a(a, i);
            return mVar;
        }
        C46119a aVar = new C46119a();
        aVar.f116376a = (C46086b) a.mo23375b(C46086b.class, (String) null);
        aVar.mo92854a(a, i);
        return aVar;
    }
}
