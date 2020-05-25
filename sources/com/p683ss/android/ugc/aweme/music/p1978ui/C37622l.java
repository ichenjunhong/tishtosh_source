package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.content.Context;
import com.p683ss.android.ugc.aweme.music.C37372e;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import p064c.p065a.p071d.C1710e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.ui.l */
public final class C37622l extends C37602e {

    /* renamed from: com.ss.android.ugc.aweme.music.ui.l$a */
    public static final class C37623a implements C1710e<C37642r> {

        /* renamed from: a */
        final /* synthetic */ C37622l f95945a;

        /* renamed from: b */
        private int f95946b;

        /* renamed from: c */
        private int f95947c;

        /* renamed from: d */
        private boolean f95948d;

        C37623a(C37622l lVar) {
            this.f95945a = lVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            int i;
            C37642r rVar = (C37642r) obj;
            C52711k.m112240b(rVar, "progressResult");
            int i2 = rVar.f95984a;
            int i3 = rVar.f95985b;
            Effect effect = rVar.f95986c;
            long j = rVar.f95987d;
            if (i3 == -102) {
                if (!this.f95948d) {
                    this.f95948d = true;
                    C37621k kVar = this.f95945a.f95901b;
                    if (kVar != null) {
                        kVar.mo77133a(effect);
                    }
                }
                return;
            }
            if (-100 == i2) {
                this.f95946b = i3;
            }
            if (-101 == i2) {
                this.f95947c = i3;
            }
            C37621k kVar2 = this.f95945a.f95901b;
            if (kVar2 != null) {
                if (this.f95945a.f95904e == null) {
                    i = this.f95947c;
                } else {
                    i = (this.f95946b + this.f95947c) / 2;
                }
                kVar2.mo77131a(i, effect, Long.valueOf(j));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.l$b */
    static final class C37624b<T> implements C1710e<C37643s> {

        /* renamed from: a */
        final /* synthetic */ C37622l f95949a;

        C37624b(C37622l lVar) {
            this.f95949a = lVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C37643s sVar = (C37643s) obj;
            Effect effect = sVar.f95992e;
            Integer num = sVar.f95993f;
            if ((num != null && num.intValue() == -103) || effect == null) {
                C37621k kVar = this.f95949a.f95901b;
                if (kVar != null) {
                    C52711k.m112236a((Object) sVar, "result");
                    kVar.mo77134b(sVar);
                }
            } else {
                C37621k kVar2 = this.f95949a.f95901b;
                if (kVar2 != null) {
                    C52711k.m112236a((Object) sVar, "result");
                    kVar2.mo77132a(sVar);
                }
            }
        }
    }

    /* renamed from: c */
    public final C1710e<C37643s> mo77084c() {
        return new C37624b<>(this);
    }

    /* renamed from: d */
    public final C1710e<C37642r> mo77085d() {
        return new C37623a<>(this);
    }

    public C37622l(Context context, String str, MusicModel musicModel) {
        C52711k.m112240b(context, "context");
        C37372e eVar = new C37372e(context, false, true, true, "prop_detail_page");
        super(context, str, musicModel, eVar);
    }
}
