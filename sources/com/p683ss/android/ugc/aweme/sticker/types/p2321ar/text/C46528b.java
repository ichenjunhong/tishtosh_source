package com.p683ss.android.ugc.aweme.sticker.types.p2321ar.text;

import com.p683ss.android.medialib.FaceBeautyInvoker.OnARTextCountCallback;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.text.b */
final /* synthetic */ class C46528b implements OnARTextCountCallback {

    /* renamed from: a */
    private final C46526a f117400a;

    /* renamed from: b */
    private final int f117401b;

    /* renamed from: c */
    private final String f117402c;

    C46528b(C46526a aVar, int i, String str) {
        this.f117400a = aVar;
        this.f117401b = i;
        this.f117402c = str;
    }

    public final void onResult(int i) {
        this.f117400a.mo93309a(this.f117401b, this.f117402c, i);
    }
}
