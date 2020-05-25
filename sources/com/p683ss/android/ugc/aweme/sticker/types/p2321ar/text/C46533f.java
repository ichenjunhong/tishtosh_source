package com.p683ss.android.ugc.aweme.sticker.types.p2321ar.text;

import com.p683ss.android.medialib.FaceBeautyInvoker.OnARTextCountCallback;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.text.f */
final /* synthetic */ class C46533f implements OnARTextCountCallback {

    /* renamed from: a */
    private final C46531e f117408a;

    /* renamed from: b */
    private final int f117409b;

    /* renamed from: c */
    private final String f117410c;

    C46533f(C46531e eVar, int i, String str) {
        this.f117408a = eVar;
        this.f117409b = i;
        this.f117410c = str;
    }

    public final void onResult(int i) {
        this.f117408a.mo93313a(this.f117409b, this.f117410c, i);
    }
}
