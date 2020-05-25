package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.content.Context;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.music.C37372e;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import p064c.p065a.p071d.C1710e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.ui.bn */
public final class C37554bn extends C37602e {

    /* renamed from: com.ss.android.ugc.aweme.music.ui.bn$a */
    public static final class C37555a implements C1710e<C37642r> {

        /* renamed from: a */
        final /* synthetic */ C37554bn f95806a;

        /* renamed from: b */
        private int f95807b;

        /* renamed from: c */
        private int f95808c;

        /* renamed from: d */
        private boolean f95809d;

        C37555a(C37554bn bnVar) {
            this.f95806a = bnVar;
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
                if (!this.f95809d) {
                    this.f95809d = true;
                    C37621k kVar = this.f95806a.f95901b;
                    if (kVar != null) {
                        kVar.mo77133a(effect);
                    }
                }
                return;
            }
            if (-100 == i2) {
                this.f95807b = i3;
            }
            if (-101 == i2) {
                this.f95808c = i3;
            }
            C37621k kVar2 = this.f95806a.f95901b;
            if (kVar2 != null) {
                if (TextUtils.isEmpty(this.f95806a.f95903d)) {
                    i = this.f95807b;
                } else {
                    i = (this.f95807b + this.f95808c) / 2;
                }
                kVar2.mo77131a(i, effect, Long.valueOf(j));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.bn$b */
    static final class C37556b<T> implements C1710e<C37643s> {

        /* renamed from: a */
        final /* synthetic */ C37554bn f95810a;

        C37556b(C37554bn bnVar) {
            this.f95810a = bnVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C37643s sVar = (C37643s) obj;
            String str = sVar.f95988a;
            Integer num = sVar.f95990c;
            if ((num != null && num.intValue() == -103) || TextUtils.isEmpty(str)) {
                C37621k kVar = this.f95810a.f95901b;
                if (kVar != null) {
                    C52711k.m112236a((Object) sVar, "result");
                    kVar.mo77134b(sVar);
                }
            } else {
                C37621k kVar2 = this.f95810a.f95901b;
                if (kVar2 != null) {
                    C52711k.m112236a((Object) sVar, "result");
                    kVar2.mo77132a(sVar);
                }
            }
        }
    }

    /* renamed from: c */
    public final C1710e<C37643s> mo77084c() {
        return new C37556b<>(this);
    }

    /* renamed from: d */
    public final C1710e<C37642r> mo77085d() {
        return new C37555a<>(this);
    }

    public C37554bn(Context context, String str, MusicModel musicModel, C37372e eVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(eVar, "musicFetcher");
        super(context, str, musicModel, eVar);
    }
}
