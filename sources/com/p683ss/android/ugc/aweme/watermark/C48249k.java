package com.p683ss.android.ugc.aweme.watermark;

import com.p683ss.android.vesdk.C50720o.C50749j;
import com.p683ss.android.vesdk.VEVideoEncodeSettings;
import com.p683ss.android.vesdk.VEWatermarkParam;
import java.io.File;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.watermark.k */
public final class C48249k extends C48259s {

    /* renamed from: a */
    public C48248j f121409a;

    /* renamed from: b */
    public C48233b f121410b;

    /* renamed from: c */
    public C50749j f121411c;

    /* renamed from: d */
    public int f121412d;

    /* renamed from: e */
    public final VEWatermarkParam f121413e;

    /* renamed from: f */
    public VEVideoEncodeSettings f121414f;

    /* renamed from: a */
    public final void mo95737a(C48248j jVar) {
        if (jVar != null) {
            String str = jVar.f121404a;
            if (!new File(str).exists()) {
                str = null;
            }
            if (str != null) {
                this.f121409a = jVar;
            }
        }
    }

    public C48249k(String str, String str2, VEWatermarkParam vEWatermarkParam, VEVideoEncodeSettings vEVideoEncodeSettings, C48233b bVar) {
        C52711k.m112240b(str, "inputMediaPath");
        C52711k.m112240b(str2, "outputMediaPath");
        C52711k.m112240b(vEVideoEncodeSettings, "encodeSettings");
        super(str, str2, null);
        this.f121413e = vEWatermarkParam;
        this.f121414f = vEVideoEncodeSettings;
        this.f121410b = bVar;
        this.f121411c = C50749j.VIDEO_OUT_RATIO_ORIGINAL;
        this.f121412d = -16777216;
    }

    public /* synthetic */ C48249k(String str, String str2, VEWatermarkParam vEWatermarkParam, VEVideoEncodeSettings vEVideoEncodeSettings, C48233b bVar, int i, C52707g gVar) {
        this(str, str2, vEWatermarkParam, vEVideoEncodeSettings, null);
    }
}
