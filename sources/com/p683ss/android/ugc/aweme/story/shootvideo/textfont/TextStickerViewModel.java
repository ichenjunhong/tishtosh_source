package com.p683ss.android.ugc.aweme.story.shootvideo.textfont;

import android.arch.lifecycle.C0198r;
import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.gamora.jedi.BaseJediViewModel;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textfont.TextStickerViewModel */
public final class TextStickerViewModel extends BaseJediViewModel<TextStickerViewState> {

    /* renamed from: d */
    public C0198r<Boolean> f117741d;

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textfont.TextStickerViewModel$a */
    static final class C46676a extends C52712l implements C52671b<TextStickerViewState, TextStickerViewState> {

        /* renamed from: a */
        final /* synthetic */ boolean f117742a;

        C46676a(boolean z) {
            this.f117742a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            TextStickerViewState textStickerViewState = (TextStickerViewState) obj;
            C52711k.m112240b(textStickerViewState, "$receiver");
            return textStickerViewState.copy(this.f117742a);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        return new TextStickerViewState(false, 1, null);
    }

    /* renamed from: a */
    public final void mo93612a(boolean z) {
        mo22530c(new C46676a(z));
        C0198r<Boolean> rVar = this.f117741d;
        if (rVar != null && (!C52711k.m112239a((Object) (Boolean) rVar.getValue(), (Object) Boolean.valueOf(z)))) {
            rVar.setValue(Boolean.valueOf(z));
        }
    }
}
