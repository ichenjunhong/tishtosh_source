package com.p683ss.android.ugc.aweme.sticker.viewmodel;

import android.arch.lifecycle.C0209x;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;

/* renamed from: com.ss.android.ugc.aweme.sticker.viewmodel.StickerFetchViewModel */
public class StickerFetchViewModel extends C0209x {

    /* renamed from: a */
    private C29252f f117615a;

    public void onCleared() {
        super.onCleared();
        if (this.f117615a != null) {
            this.f117615a.destroy();
        }
    }
}
