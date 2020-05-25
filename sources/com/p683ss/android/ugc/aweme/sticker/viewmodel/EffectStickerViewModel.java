package com.p683ss.android.ugc.aweme.sticker.viewmodel;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.LiveData;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.sticker.C45893i;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sticker.viewmodel.EffectStickerViewModel */
public class EffectStickerViewModel extends C0209x {

    /* renamed from: a */
    public C45893i f117604a;

    /* renamed from: com.ss.android.ugc.aweme.sticker.viewmodel.EffectStickerViewModel$a */
    static class C46612a implements C45893i {

        /* renamed from: a */
        private LiveData<Boolean> f117605a;

        /* renamed from: b */
        private LiveData<Boolean> f117606b;

        /* renamed from: c */
        private LiveData<Double> f117607c;

        /* renamed from: a */
        public final LiveData<Boolean> mo91260a() {
            return this.f117605a;
        }

        /* renamed from: a */
        public final void mo91261a(List<String> list) {
        }

        /* renamed from: b */
        public final boolean mo91262b() {
            return false;
        }

        /* renamed from: c */
        public final LiveData<Boolean> mo91263c() {
            return this.f117606b;
        }

        /* renamed from: d */
        public final ShortVideoContext mo91264d() {
            return null;
        }

        /* renamed from: e */
        public final boolean mo91265e() {
            return false;
        }

        /* renamed from: f */
        public final C42482c mo91266f() {
            return null;
        }

        /* renamed from: g */
        public final LiveData<Double> mo91267g() {
            return this.f117607c;
        }

        private C46612a() {
            this.f117605a = new C0198r();
            this.f117606b = new C0198r();
            this.f117607c = new C0198r();
        }
    }

    /* renamed from: a */
    public final C45893i mo93416a() {
        if (this.f117604a == null) {
            this.f117604a = new C46612a();
        }
        return this.f117604a;
    }
}
