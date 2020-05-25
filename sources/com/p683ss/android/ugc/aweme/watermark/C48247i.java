package com.p683ss.android.ugc.aweme.watermark;

import com.p683ss.android.ugc.aweme.account.model.C22055c;
import com.p683ss.android.ugc.aweme.photo.C38691o;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.property.C40797m;
import com.p683ss.android.ugc.aweme.shortvideo.p2176aa.C42399a;
import com.p683ss.android.ugc.aweme.shortvideo.p2266z.p2267a.C45636a;
import com.p683ss.android.ugc.aweme.shortvideo.p2266z.p2267a.C45640d;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.vesdk.VEVideoEncodeSettings;
import com.p683ss.android.vesdk.VEVideoEncodeSettings.C50585a;
import com.p683ss.android.vesdk.VEVideoEncodeSettings.ENCODE_BITRATE_MODE;
import com.p683ss.android.vesdk.VEVideoEncodeSettings.ENCODE_PRESET;
import com.p683ss.android.vesdk.VEWatermarkParam;
import com.p683ss.android.vesdk.VEWatermarkParam.VEWatermarkMask;
import dmt.p2652av.video.C52929b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.watermark.i */
public final class C48247i {

    /* renamed from: a */
    public static final C48247i f121403a = new C48247i();

    private C48247i() {
    }

    /* renamed from: b */
    public static final boolean m104507b(int i, int i2) {
        double d = (double) i;
        double d2 = (double) i2;
        Double.isNaN(d2);
        double d3 = d2 * 1.0d;
        Double.isNaN(d);
        if (Math.abs((d / d3) - 1.7777777777777777d) < 0.001d) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final VEVideoEncodeSettings m104501a(int i, int i2) {
        C50585a aVar = new C50585a(3);
        aVar.mo98716g(C52929b.m112618a(C40797m.m90259n())).mo98692a(i, i2);
        boolean b = C40797m.m90247b();
        StringBuilder sb = new StringBuilder("VEWatermarkParamBuilder VEVideoEncodeSettings hardEncode:");
        sb.append(b);
        C45407ay.m98968a(sb.toString());
        if (b) {
            aVar.mo98703a(true).mo98696a(ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR, C52929b.m112617a(C40797m.m90250e()));
        } else {
            aVar.mo98703a(false).mo98696a(ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF, C52929b.m112620b(C40797m.m90256k()));
        }
        ENCODE_PRESET c = C52929b.m112621c(C40797m.m90258m());
        if (c != null) {
            aVar.mo98697a(c);
        }
        aVar.mo98693a(C52929b.m112619a(C40797m.m90257l()));
        aVar.f126843a.enableRemuxVideo = false;
        aVar.mo98715f(1);
        VEVideoEncodeSettings a = aVar.mo98705a();
        C52711k.m112236a((Object) a, "settingsBuilder.build()");
        return a;
    }

    /* renamed from: a */
    public static final C45636a m104500a(int i, String str, int[] iArr) {
        C52711k.m112240b(str, "videoPath");
        C52711k.m112240b(iArr, "videoSize");
        if (4 == i) {
            return new C48246h(str, iArr[0], iArr[1]);
        }
        return new C48232a(str, iArr[0], iArr[1], i);
    }

    /* renamed from: a */
    private static VEWatermarkParam m104503a(C45636a aVar, C22055c cVar, boolean z, String str) {
        boolean z2;
        String[] b = aVar.mo92022b(true, cVar);
        C45640d a = aVar.mo92019a();
        if (b != null) {
            boolean z3 = false;
            if (b.length == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                VEWatermarkParam vEWatermarkParam = new VEWatermarkParam();
                vEWatermarkParam.images = b;
                vEWatermarkParam.interval = 2;
                vEWatermarkParam.xOffset = a.xOffset;
                vEWatermarkParam.yOffset = a.yOffset;
                int[] a2 = C38691o.m86047a(b[0]);
                vEWatermarkParam.width = a2[0];
                vEWatermarkParam.height = a2[1];
                vEWatermarkParam.position = a.position;
                if (z) {
                    if (str.length() > 0) {
                        z3 = true;
                    }
                    if (z3) {
                        vEWatermarkParam.needExtFile = true;
                        vEWatermarkParam.extFile = str;
                    }
                }
                return vEWatermarkParam;
            }
        }
        return null;
    }

    /* renamed from: b */
    private final VEWatermarkParam m104506b(C45636a aVar, C22055c cVar, int[] iArr, boolean z, String str, boolean z2) {
        return m104505a(aVar.mo92022b(true, cVar), aVar.mo92022b(false, cVar), iArr, aVar.mo92019a(), z, str, z2);
    }

    /* renamed from: a */
    public static final VEWatermarkParam m104504a(C45636a aVar, C22055c cVar, int[] iArr, boolean z, String str, boolean z2) {
        C52711k.m112240b(aVar, "provider");
        C52711k.m112240b(iArr, "videoSize");
        C52711k.m112240b(str, "extFile");
        if (aVar instanceof C48246h) {
            return m104503a(aVar, cVar, z, str);
        }
        if (aVar instanceof C48232a) {
            return f121403a.m104506b(aVar, cVar, iArr, z, str, z2);
        }
        return null;
    }

    /* renamed from: a */
    public static final VEWatermarkParam m104502a(int i, String str, C22055c cVar, int[] iArr, boolean z, String str2, boolean z2) {
        C52711k.m112240b(str, "videoPath");
        C52711k.m112240b(iArr, "videoSize");
        C52711k.m112240b(str2, "extFile");
        return m104504a(m104500a(i, str, iArr), cVar, iArr, z, str2, z2);
    }

    /* renamed from: a */
    private static VEWatermarkParam m104505a(String[] strArr, String[] strArr2, int[] iArr, C45640d dVar, boolean z, String str, boolean z2) {
        boolean z3;
        float f;
        boolean z4;
        if (strArr != null) {
            if (strArr.length == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3 && dVar != null) {
                VEWatermarkParam vEWatermarkParam = new VEWatermarkParam();
                vEWatermarkParam.images = strArr;
                vEWatermarkParam.secondHalfImages = strArr2;
                vEWatermarkParam.interval = 2;
                int[] a = C38691o.m86047a(strArr[0]);
                int i = a[0];
                int i2 = a[1];
                if (iArr[0] < iArr[1]) {
                    f = 0.08695652f;
                } else {
                    f = 0.13122173f;
                }
                float max = Math.max(((float) iArr[1]) * f, 58.0f);
                vEWatermarkParam.width = (int) ((((float) i) * max) / ((float) i2));
                vEWatermarkParam.height = (int) max;
                vEWatermarkParam.xOffset = dVar.xOffset;
                vEWatermarkParam.yOffset = dVar.yOffset;
                vEWatermarkParam.position = dVar.position;
                StringBuilder sb = new StringBuilder("WaterMarkPositionConfig2 config.xOffset:");
                sb.append(dVar.xOffset);
                sb.append(" config.yOffset:");
                sb.append(dVar.yOffset);
                sb.append("xOffset:");
                sb.append(vEWatermarkParam.xOffset);
                sb.append(" yOffset:");
                sb.append(vEWatermarkParam.yOffset);
                sb.append(" position:");
                sb.append(vEWatermarkParam.position);
                C45407ay.m98968a(sb.toString());
                if (z) {
                    if (str.length() > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        vEWatermarkParam.needExtFile = true;
                        vEWatermarkParam.extFile = str;
                    }
                }
                if (C39629l.m88232a().mo58574e().mo83117a(C40796a.EnableWaterBgMask) && !z2) {
                    VEWatermarkMask vEWatermarkMask = new VEWatermarkMask();
                    vEWatermarkMask.maskImage = C42399a.m93162a(!m104507b(iArr[1], iArr[0]));
                    vEWatermarkMask.xOffset = 0;
                    vEWatermarkMask.yOffset = 0;
                    vEWatermarkMask.width = iArr[0];
                    vEWatermarkMask.height = iArr[1];
                    if (m104507b(iArr[1], iArr[0])) {
                        double d = (double) iArr[0];
                        Double.isNaN(d);
                        vEWatermarkMask.yOffset += (((int) (d * 1.7777777777777777d)) - iArr[1]) / 2;
                    }
                    vEWatermarkParam.mask = vEWatermarkMask;
                }
                return vEWatermarkParam;
            }
        }
        return null;
    }
}
