package com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.vesdk.clipparam.VEAlgorithmPath;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b */
public final class C42998b {

    /* renamed from: a */
    public C42999a f108580a = new C42999a(this) {

        /* renamed from: a */
        final /* synthetic */ C43051l f108680a;

        {
            this.f108680a = r1;
        }

        /* renamed from: a */
        public final int mo87389a(String str, int i, int i2, VEAlgorithmPath vEAlgorithmPath) {
            C52711k.m112240b(str, "audioPath");
            C52711k.m112240b(vEAlgorithmPath, "veAlgorithmPath");
            if (this.f108680a.f108673a == null) {
                return -1;
            }
            C20347c cVar = this.f108680a.f108673a;
            if (cVar == null) {
                C52711k.m112234a();
            }
            int a = cVar.mo43000a(str, i, i2, vEAlgorithmPath);
            C20347c cVar2 = this.f108680a.f108673a;
            if (cVar2 == null) {
                C52711k.m112234a();
            }
            cVar2.mo43021a(0, 1, 0.5f);
            return a;
        }
    };

    /* renamed from: b */
    public C42482c f108581b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b$a */
    public interface C42999a {
        /* renamed from: a */
        int mo87389a(String str, int i, int i2, VEAlgorithmPath vEAlgorithmPath);
    }

    /* renamed from: a */
    static VEAlgorithmPath m94242a(VEAlgorithmPath vEAlgorithmPath) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        VEAlgorithmPath vEAlgorithmPath2 = new VEAlgorithmPath();
        Integer num = null;
        if (vEAlgorithmPath != null) {
            str = vEAlgorithmPath.getVeBeatsPath();
        } else {
            str = null;
        }
        vEAlgorithmPath2.setVeBeatsPath(str);
        if (vEAlgorithmPath != null) {
            str2 = vEAlgorithmPath.getDownBeatsPath();
        } else {
            str2 = null;
        }
        vEAlgorithmPath2.setDownBeatsPath(str2);
        if (vEAlgorithmPath != null) {
            str3 = vEAlgorithmPath.getNoStrengthBeatsPath();
        } else {
            str3 = null;
        }
        vEAlgorithmPath2.setNoStrengthBeatsPath(str3);
        if (vEAlgorithmPath != null) {
            str4 = vEAlgorithmPath.getManMadePath();
        } else {
            str4 = null;
        }
        vEAlgorithmPath2.setManMadePath(str4);
        if (vEAlgorithmPath != null) {
            str5 = vEAlgorithmPath.getOnlineBeatsPath();
        } else {
            str5 = null;
        }
        vEAlgorithmPath2.setOnlineBeatsPath(str5);
        if (vEAlgorithmPath != null) {
            num = Integer.valueOf(vEAlgorithmPath.getMode());
        }
        if (num == null) {
            C52711k.m112234a();
        }
        vEAlgorithmPath2.setMode(num.intValue());
        vEAlgorithmPath2.setType(vEAlgorithmPath.getType());
        return vEAlgorithmPath2;
    }

    /* renamed from: a */
    public static VEAlgorithmPath m94241a(C42482c cVar) {
        int i;
        if (cVar == null) {
            C52711k.m112234a();
            return null;
        }
        String b = C43036f.m94306b(cVar);
        String veBeatsPath = cVar.getStickPointMusicAlg().getVeBeatsPath();
        String downBeatsPath = cVar.getStickPointMusicAlg().getDownBeatsPath();
        String noStrengthBeatsPath = cVar.getStickPointMusicAlg().getNoStrengthBeatsPath();
        String manModeBeatsPath = cVar.getStickPointMusicAlg().getManModeBeatsPath();
        if (!C48016e.m103944b(veBeatsPath)) {
            veBeatsPath = null;
        }
        if (!C48016e.m103944b(downBeatsPath)) {
            downBeatsPath = null;
        }
        if (!C48016e.m103944b(noStrengthBeatsPath)) {
            noStrengthBeatsPath = null;
        }
        if (!C48016e.m103944b(manModeBeatsPath)) {
            manModeBeatsPath = null;
        }
        if (cVar.getStickPointMusicAlg().isSuccessivelyAlgType() && !cVar.getStickPointMusicAlg().existSuccessivelyAlgFile()) {
            cVar.getStickPointMusicAlg().setAlgType(VEAlgorithmPath.BEATES_FILE_DEFAULT);
        }
        VEAlgorithmPath vEAlgorithmPath = new VEAlgorithmPath();
        vEAlgorithmPath.setVeBeatsPath(veBeatsPath);
        vEAlgorithmPath.setDownBeatsPath(downBeatsPath);
        if (!cVar.getStickPointMusicAlg().isSuccessivelyAlgType()) {
            if (C48016e.m103944b(downBeatsPath)) {
                vEAlgorithmPath.setNoStrengthBeatsPath(null);
            } else {
                vEAlgorithmPath.setNoStrengthBeatsPath(noStrengthBeatsPath);
            }
        }
        vEAlgorithmPath.setManMadePath(manModeBeatsPath);
        vEAlgorithmPath.setOnlineBeatsPath(b);
        vEAlgorithmPath.setType(cVar.getStickPointMusicAlg().getAlgType());
        if (cVar.getStickPointMusicAlg().isSuccessivelyAlgType()) {
            i = VEAlgorithmPath.MODE_SUCCESSIVELY;
        } else {
            i = VEAlgorithmPath.INTMODE_ONSET;
        }
        vEAlgorithmPath.setMode(i);
        return vEAlgorithmPath;
    }
}
