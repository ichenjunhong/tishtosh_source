package com.p683ss.android.ugc.aweme.shortvideo.festival;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.festival.i */
public final class C43821i implements C43820h {

    /* renamed from: a */
    private float f110973a;

    /* renamed from: b */
    private boolean f110974b;

    /* renamed from: c */
    private boolean f110975c;

    /* renamed from: a */
    private final int m96250a(C43824l lVar) {
        return (int) ((((float) lVar.getWeight()) / this.f110973a) * 100.0f);
    }

    public C43821i(boolean z, boolean z2) {
        if (z) {
            this.f110973a += (float) C43824l.VIDEO_DOWNLOAD_TYPE.getWeight();
        }
        if (z2) {
            this.f110973a += (float) C43824l.VIDEO_WATER_TYPE.getWeight();
        }
    }

    /* renamed from: a */
    public final int mo89342a(C43824l lVar, int i) {
        C52711k.m112240b(lVar, "videoProcess");
        switch (C43822j.f110976a[lVar.ordinal()]) {
            case 1:
                this.f110974b = true;
                break;
            case 2:
                this.f110975c = true;
                break;
        }
        float weight = (((float) lVar.getWeight()) / this.f110973a) * ((float) i);
        int i2 = 0;
        if (lVar != C43824l.VIDEO_DOWNLOAD_TYPE && this.f110974b) {
            i2 = 0 + m96250a(C43824l.VIDEO_DOWNLOAD_TYPE);
        }
        if (lVar != C43824l.VIDEO_WATER_TYPE && this.f110975c) {
            i2 += m96250a(C43824l.VIDEO_WATER_TYPE);
        }
        return (int) (weight + ((float) i2));
    }
}
