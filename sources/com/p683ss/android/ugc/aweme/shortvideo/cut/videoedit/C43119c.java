package com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.graphics.Bitmap;
import android.support.p030v4.p038f.C0794k;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.p970j.C14041b;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.C42658a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.c */
final /* synthetic */ class C43119c implements C42658a {

    /* renamed from: a */
    private final C43114a f108953a;

    /* renamed from: b */
    private final C43114a f108954b;

    /* renamed from: c */
    private final String f108955c;

    /* renamed from: d */
    private final int f108956d;

    /* renamed from: e */
    private final C0794k f108957e;

    /* renamed from: f */
    private final String f108958f;

    C43119c(C43114a aVar, C43114a aVar2, String str, int i, C0794k kVar, String str2) {
        this.f108953a = aVar;
        this.f108954b = aVar2;
        this.f108955c = str;
        this.f108956d = i;
        this.f108957e = kVar;
        this.f108958f = str2;
    }

    /* renamed from: a */
    public final void mo86959a(C13715a aVar) {
        C43114a aVar2 = this.f108953a;
        C43114a aVar3 = this.f108954b;
        String str = this.f108955c;
        int i = this.f108956d;
        C0794k kVar = this.f108957e;
        String str2 = this.f108958f;
        if (aVar3.f108946a != null && aVar3.f108946a.getTag().equals(str)) {
            Bitmap d = ((C14041b) aVar.mo25630a()).mo26257d();
            if (!(d == null || d.isRecycled() || aVar2.f108946a == null)) {
                aVar2.mo87650a();
                aVar2.f108947b = aVar;
                aVar2.f108946a.setImageBitmap(d);
            }
        }
        if (i == ((Integer) kVar.f2712b).intValue()) {
            C43113a.this.f108934e.mo86832a(str2);
        }
    }
}
