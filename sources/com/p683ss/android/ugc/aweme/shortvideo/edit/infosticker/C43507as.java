package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker;

import com.bytedance.keva.Keva;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.as */
public final class C43507as {

    /* renamed from: b */
    public static final C43508a f110028b = new C43508a(null);

    /* renamed from: a */
    public final Keva f110029a;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.as$a */
    public static final class C43508a {
        private C43508a() {
        }

        public /* synthetic */ C43508a(C52707g gVar) {
            this();
        }
    }

    public C43507as() {
        Keva repo = Keva.getRepo("text_sticker_keva");
        C52711k.m112236a((Object) repo, "Keva.getRepo(REPO_NAME)");
        this.f110029a = repo;
    }

    /* renamed from: a */
    public final boolean mo88525a() {
        return this.f110029a.getBoolean("info_sticker_hint_set", false);
    }

    /* renamed from: b */
    public final void mo88526b(boolean z) {
        this.f110029a.storeBoolean("lyric_sticker_hint_set", z);
    }

    /* renamed from: a */
    public final void mo88524a(boolean z) {
        this.f110029a.storeBoolean("info_sticker_hint_set", true);
    }
}
