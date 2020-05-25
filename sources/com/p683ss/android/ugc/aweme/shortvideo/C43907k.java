package com.p683ss.android.ugc.aweme.shortvideo;

import android.graphics.Bitmap;
import android.support.p030v4.p040os.C0958a;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.shortvideo.model.VideoCreation;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.k */
public abstract class C43907k {

    /* renamed from: a */
    protected int f111184a;

    /* renamed from: b */
    protected int f111185b;

    /* renamed from: c */
    public int f111186c = -1;

    /* renamed from: d */
    public String f111187d;

    /* renamed from: e */
    public boolean f111188e;

    /* renamed from: a */
    public abstract C17832m<VideoCreation> mo78613a(Object obj, SynthetiseResult synthetiseResult);

    /* renamed from: a */
    public abstract C17832m<? extends C42421al> mo78614a(Object obj, VideoCreation videoCreation, SynthetiseResult synthetiseResult);

    /* renamed from: a */
    public abstract C43211de<SynthetiseResult> mo78615a(Object obj);

    /* renamed from: a */
    public abstract C43211de<VideoCreation> mo78616a(Object obj, VideoCreation videoCreation);

    /* renamed from: a */
    public abstract void mo78617a();

    /* renamed from: b */
    public abstract long mo78618b(Object obj);

    /* renamed from: c */
    public Bitmap mo78619c(Object obj) {
        return null;
    }

    /* renamed from: d */
    public boolean mo78774d(Object obj) {
        return false;
    }

    public C43907k(int i, int i2) {
        this.f111184a = i;
        this.f111185b = i2;
    }

    /* renamed from: a */
    public C43211de<SynthetiseResult> mo86491a(Object obj, C0958a aVar, boolean z) {
        return mo78615a(obj);
    }
}
