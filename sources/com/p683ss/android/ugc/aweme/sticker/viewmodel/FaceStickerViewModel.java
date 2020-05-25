package com.p683ss.android.ugc.aweme.sticker.viewmodel;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import java.util.concurrent.Callable;
import p2628d.C52860x;

/* renamed from: com.ss.android.ugc.aweme.sticker.viewmodel.FaceStickerViewModel */
public final class FaceStickerViewModel extends C0209x {

    /* renamed from: a */
    public final C0198r<C46615b> f117608a = new C0198r<>();

    /* renamed from: b */
    public final C0198r<C46617d> f117609b = new C0198r<>();

    /* renamed from: com.ss.android.ugc.aweme.sticker.viewmodel.FaceStickerViewModel$a */
    public static final class C46613a<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ FaceStickerViewModel f117610a;

        /* renamed from: b */
        final /* synthetic */ int f117611b;

        /* renamed from: c */
        final /* synthetic */ int f117612c;

        /* renamed from: d */
        final /* synthetic */ int f117613d;

        /* renamed from: e */
        final /* synthetic */ String f117614e;

        public C46613a(FaceStickerViewModel faceStickerViewModel, int i, int i2, int i3, String str) {
            this.f117610a = faceStickerViewModel;
            this.f117611b = i;
            this.f117612c = i2;
            this.f117613d = i3;
            this.f117614e = str;
        }

        public final /* synthetic */ Object call() {
            this.f117610a.f117609b.setValue(new C46617d(this.f117611b, this.f117612c, this.f117613d, this.f117614e));
            return C52860x.f131107a;
        }
    }
}
