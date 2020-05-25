package com.p683ss.android.ugc.aweme.shortvideo.cut;

import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p683ss.android.vesdk.VEVideoEncodeSettings.ENCODE_BITRATE_MODE;
import com.p683ss.android.vesdk.VEVideoEncodeSettings.ENCODE_PROFILE;
import com.p683ss.android.vesdk.VEVideoEncodeSettings.ENCODE_STANDARD;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.c */
public final class C42626c {

    /* renamed from: a */
    public final List<VideoSegment> f107823a;

    /* renamed from: b */
    public final String f107824b;

    /* renamed from: c */
    public final String f107825c;

    /* renamed from: d */
    public final int f107826d;

    /* renamed from: e */
    public final int f107827e;

    /* renamed from: f */
    public final int f107828f;

    /* renamed from: g */
    public final boolean f107829g;

    /* renamed from: h */
    public final ENCODE_STANDARD f107830h;

    /* renamed from: i */
    public final ENCODE_PROFILE f107831i;

    /* renamed from: j */
    public final ENCODE_BITRATE_MODE f107832j;

    /* renamed from: k */
    public final int f107833k;

    /* renamed from: l */
    public final int f107834l;

    /* renamed from: m */
    public final int f107835m;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42626c) {
                C42626c cVar = (C42626c) obj;
                if (C52711k.m112239a((Object) this.f107823a, (Object) cVar.f107823a) && C52711k.m112239a((Object) this.f107824b, (Object) cVar.f107824b) && C52711k.m112239a((Object) this.f107825c, (Object) cVar.f107825c)) {
                    if (this.f107826d == cVar.f107826d) {
                        if (this.f107827e == cVar.f107827e) {
                            if (this.f107828f == cVar.f107828f) {
                                if ((this.f107829g == cVar.f107829g) && C52711k.m112239a((Object) this.f107830h, (Object) cVar.f107830h) && C52711k.m112239a((Object) this.f107831i, (Object) cVar.f107831i) && C52711k.m112239a((Object) this.f107832j, (Object) cVar.f107832j)) {
                                    if (this.f107833k == cVar.f107833k) {
                                        if (this.f107834l == cVar.f107834l) {
                                            if (this.f107835m == cVar.f107835m) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List<VideoSegment> list = this.f107823a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f107824b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f107825c;
        int hashCode3 = (((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f107826d) * 31) + this.f107827e) * 31) + this.f107828f) * 31;
        boolean z = this.f107829g;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        ENCODE_STANDARD encode_standard = this.f107830h;
        int hashCode4 = (i2 + (encode_standard != null ? encode_standard.hashCode() : 0)) * 31;
        ENCODE_PROFILE encode_profile = this.f107831i;
        int hashCode5 = (hashCode4 + (encode_profile != null ? encode_profile.hashCode() : 0)) * 31;
        ENCODE_BITRATE_MODE encode_bitrate_mode = this.f107832j;
        if (encode_bitrate_mode != null) {
            i = encode_bitrate_mode.hashCode();
        }
        return ((((((hashCode5 + i) * 31) + this.f107833k) * 31) + this.f107834l) * 31) + this.f107835m;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CutVideoCompileSettings(segments=");
        sb.append(this.f107823a);
        sb.append(", videoOutputPath=");
        sb.append(this.f107824b);
        sb.append(", audioOutputPath=");
        sb.append(this.f107825c);
        sb.append(", videoWidth=");
        sb.append(this.f107826d);
        sb.append(", videoHeight=");
        sb.append(this.f107827e);
        sb.append(", fps=");
        sb.append(this.f107828f);
        sb.append(", isHWEncode=");
        sb.append(this.f107829g);
        sb.append(", encodeStandard=");
        sb.append(this.f107830h);
        sb.append(", encodeProfile=");
        sb.append(this.f107831i);
        sb.append(", videoEncodeBitrateMode=");
        sb.append(this.f107832j);
        sb.append(", videoBitrate=");
        sb.append(this.f107833k);
        sb.append(", resizeMode=");
        sb.append(this.f107834l);
        sb.append(", rotate=");
        sb.append(this.f107835m);
        sb.append(")");
        return sb.toString();
    }

    private C42626c(List<? extends VideoSegment> list, String str, String str2, int i, int i2, int i3, boolean z, ENCODE_STANDARD encode_standard, ENCODE_PROFILE encode_profile, ENCODE_BITRATE_MODE encode_bitrate_mode, int i4, int i5, int i6) {
        C52711k.m112240b(list, "segments");
        C52711k.m112240b(str, "videoOutputPath");
        C52711k.m112240b(encode_standard, "encodeStandard");
        C52711k.m112240b(encode_profile, "encodeProfile");
        C52711k.m112240b(encode_bitrate_mode, "videoEncodeBitrateMode");
        this.f107823a = list;
        this.f107824b = str;
        this.f107825c = str2;
        this.f107826d = i;
        this.f107827e = i2;
        this.f107828f = i3;
        this.f107829g = z;
        this.f107830h = encode_standard;
        this.f107831i = encode_profile;
        this.f107832j = encode_bitrate_mode;
        this.f107833k = i4;
        this.f107834l = i5;
        this.f107835m = i6;
    }

    public /* synthetic */ C42626c(List list, String str, String str2, int i, int i2, int i3, boolean z, ENCODE_STANDARD encode_standard, ENCODE_PROFILE encode_profile, ENCODE_BITRATE_MODE encode_bitrate_mode, int i4, int i5, int i6, int i7, C52707g gVar) {
        int i8;
        int i9;
        int i10;
        ENCODE_STANDARD encode_standard2;
        ENCODE_PROFILE encode_profile2;
        ENCODE_BITRATE_MODE encode_bitrate_mode2;
        int i11;
        int i12;
        int i13 = i7;
        if ((i13 & 8) != 0) {
            i8 = 720;
        } else {
            i8 = i;
        }
        if ((i13 & 16) != 0) {
            i9 = 1280;
        } else {
            i9 = i2;
        }
        if ((i13 & 32) != 0) {
            i10 = 30;
        } else {
            i10 = i3;
        }
        if ((i13 & 128) != 0) {
            encode_standard2 = ENCODE_STANDARD.ENCODE_STANDARD_H264;
        } else {
            encode_standard2 = encode_standard;
        }
        if ((i13 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0) {
            encode_profile2 = ENCODE_PROFILE.ENCODE_PROFILE_BASELINE;
        } else {
            encode_profile2 = encode_profile;
        }
        if ((i13 & UnReadVideoExperiment.LIKE_USER_LIST) != 0) {
            encode_bitrate_mode2 = ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF;
        } else {
            encode_bitrate_mode2 = encode_bitrate_mode;
        }
        if ((i13 & PreloadTask.BYTE_UNIT_NUMBER) != 0) {
            i11 = 15;
        } else {
            i11 = i4;
        }
        if ((i13 & 2048) != 0) {
            i12 = 1;
        } else {
            i12 = i5;
        }
        this(list, str, str2, i8, i9, i10, false, encode_standard2, encode_profile2, encode_bitrate_mode2, i11, i12, 0);
    }
}
