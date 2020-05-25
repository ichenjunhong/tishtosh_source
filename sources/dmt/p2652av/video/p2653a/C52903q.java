package dmt.p2652av.video.p2653a;

import android.content.Context;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.asve.p1239c.C20348d;
import com.p683ss.android.ugc.asve.p1239c.C20349e;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.C43668b;
import com.p683ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.vesdk.C50720o.C50749j;
import com.p683ss.android.vesdk.filterparam.VEAudioVolumeFilterParam;
import com.p683ss.android.vesdk.filterparam.VEBaseFilterParam;
import dmt.p2652av.video.VEPreviewMusicParams;
import dmt.p2652av.video.VEPreviewParams;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: dmt.av.video.a.q */
public final class C52903q extends C52885a {

    /* renamed from: A */
    private int f131217A = -1;

    /* renamed from: B */
    private int f131218B = -1;

    /* renamed from: C */
    private int f131219C;

    /* renamed from: D */
    private int f131220D;

    /* renamed from: E */
    private int f131221E = -1;

    /* renamed from: t */
    private int f131222t;

    /* renamed from: u */
    private int f131223u;

    /* renamed from: v */
    private int f131224v = -1;

    /* renamed from: w */
    private int f131225w = -1;

    /* renamed from: x */
    private int f131226x = -1;

    /* renamed from: y */
    private int f131227y = -1;

    /* renamed from: z */
    private int f131228z = -1;

    /* renamed from: a */
    public final boolean mo110494a(VEVolumeChangeOp vEVolumeChangeOp) {
        C52711k.m112240b(vEVolumeChangeOp, "op");
        if (vEVolumeChangeOp.mStart < 0 || vEVolumeChangeOp.mEnd < 0 || vEVolumeChangeOp.mStart >= vEVolumeChangeOp.mEnd) {
            if (vEVolumeChangeOp.mType == 0) {
                this.f131177f.mo43021a(this.f131177f.mo43013a().f127518i, this.f131177f.mo43013a().f127519j, vEVolumeChangeOp.mVolume);
            } else if (vEVolumeChangeOp.mType == 1) {
                this.f131177f.mo43021a(this.f131179h, 1, vEVolumeChangeOp.mVolume);
            }
            return false;
        }
        C20347c cVar = this.f131177f;
        C52711k.m112236a((Object) cVar, "mVEEditor");
        m112571a(cVar, vEVolumeChangeOp);
        return false;
    }

    /* renamed from: a */
    public final boolean mo110495a(VEPreviewMusicParams vEPreviewMusicParams) {
        C52711k.m112240b(vEPreviewMusicParams, "params");
        if (this.f131179h != -1) {
            this.f131177f.mo43049d(this.f131179h);
        }
        if (vEPreviewMusicParams.f131134a == null) {
            return false;
        }
        if (vEPreviewMusicParams.f131137d <= 0 || Math.abs(vEPreviewMusicParams.f131136c - vEPreviewMusicParams.f131137d) < 1000) {
            C20347c cVar = this.f131177f;
            String str = vEPreviewMusicParams.f131134a;
            C52711k.m112236a((Object) str, "params.mPath");
            this.f131179h = cVar.mo43001a(str, vEPreviewMusicParams.f131135b, vEPreviewMusicParams.f131135b + vEPreviewMusicParams.f131136c, C39629l.m88232a().mo58583n().mo83103a(C40790a.RearMusicAutoLoop));
        } else {
            C20347c cVar2 = this.f131177f;
            String str2 = vEPreviewMusicParams.f131134a;
            C52711k.m112236a((Object) str2, "params.mPath");
            this.f131179h = cVar2.mo43001a(str2, vEPreviewMusicParams.f131135b, vEPreviewMusicParams.f131135b + vEPreviewMusicParams.f131137d, C39629l.m88232a().mo58583n().mo83103a(C40790a.RearMusicAutoLoop));
        }
        this.f131177f.mo43021a(this.f131179h, 1, vEPreviewMusicParams.f131138e);
        if (vEPreviewMusicParams.f131143j >= 0 && vEPreviewMusicParams.f131144k >= 0 && vEPreviewMusicParams.f131143j < vEPreviewMusicParams.f131144k) {
            VEAudioVolumeFilterParam vEAudioVolumeFilterParam = new VEAudioVolumeFilterParam();
            vEAudioVolumeFilterParam.volume = 0.0f;
            if (vEPreviewMusicParams.f131143j == this.f131222t && vEPreviewMusicParams.f131144k == this.f131223u && this.f131224v >= 0) {
                this.f131177f.mo42982a(this.f131224v, (VEBaseFilterParam) vEAudioVolumeFilterParam);
            } else {
                this.f131222t = vEPreviewMusicParams.f131143j;
                this.f131223u = vEPreviewMusicParams.f131144k;
                VEBaseFilterParam vEBaseFilterParam = vEAudioVolumeFilterParam;
                this.f131224v = this.f131177f.mo42975a(1, 0, vEBaseFilterParam, this.f131222t, this.f131223u + 100);
                this.f131177f.mo42982a(this.f131224v, vEBaseFilterParam);
            }
        }
        return false;
    }

    /* renamed from: a */
    private final void m112571a(C20347c cVar, VEVolumeChangeOp vEVolumeChangeOp) {
        VEAudioVolumeFilterParam vEAudioVolumeFilterParam = new VEAudioVolumeFilterParam();
        vEAudioVolumeFilterParam.volume = vEVolumeChangeOp.mVolume;
        switch (vEVolumeChangeOp.mVoiceType) {
            case 0:
                return;
            case 1:
                if (vEVolumeChangeOp.mStart == this.f131225w && vEVolumeChangeOp.mEnd == this.f131226x) {
                    cVar.mo42982a(this.f131227y, (VEBaseFilterParam) vEAudioVolumeFilterParam);
                    return;
                }
                this.f131225w = vEVolumeChangeOp.mStart;
                this.f131226x = vEVolumeChangeOp.mEnd;
                VEBaseFilterParam vEBaseFilterParam = vEAudioVolumeFilterParam;
                this.f131227y = cVar.mo42975a(1, 0, vEBaseFilterParam, this.f131225w, this.f131226x);
                cVar.mo42982a(this.f131227y, vEBaseFilterParam);
                return;
            case 2:
                if (vEVolumeChangeOp.mStart == this.f131228z && vEVolumeChangeOp.mEnd == this.f131217A) {
                    cVar.mo42982a(this.f131218B, (VEBaseFilterParam) vEAudioVolumeFilterParam);
                    return;
                }
                this.f131228z = vEVolumeChangeOp.mStart;
                this.f131217A = vEVolumeChangeOp.mEnd;
                VEBaseFilterParam vEBaseFilterParam2 = vEAudioVolumeFilterParam;
                this.f131218B = cVar.mo42975a(1, 0, vEBaseFilterParam2, this.f131228z, this.f131217A);
                cVar.mo42982a(this.f131218B, vEBaseFilterParam2);
                return;
            case 3:
                if (vEVolumeChangeOp.mStart != this.f131219C || vEVolumeChangeOp.mEnd != this.f131220D) {
                    this.f131219C = vEVolumeChangeOp.mStart;
                    this.f131220D = vEVolumeChangeOp.mEnd;
                    VEBaseFilterParam vEBaseFilterParam3 = vEAudioVolumeFilterParam;
                    this.f131221E = cVar.mo42975a(1, 0, vEBaseFilterParam3, this.f131219C, this.f131220D);
                    cVar.mo42982a(this.f131221E, vEBaseFilterParam3);
                    break;
                } else {
                    cVar.mo42982a(this.f131221E, (VEBaseFilterParam) vEAudioVolumeFilterParam);
                    return;
                }
                break;
        }
    }

    /* renamed from: a */
    public final int mo110482a(Context context, C20347c cVar, VEPreviewParams vEPreviewParams) {
        boolean z;
        C20347c cVar2 = cVar;
        VEPreviewParams vEPreviewParams2 = vEPreviewParams;
        C52711k.m112240b(cVar2, "editor");
        C52711k.m112240b(vEPreviewParams2, "params");
        super.mo110482a(context, cVar, vEPreviewParams);
        String[] strArr = vEPreviewParams2.mVideoPaths;
        C52711k.m112236a((Object) strArr, "params.mVideoPaths");
        C20349e eVar = new C20349e(strArr);
        eVar.mo43100a(C50749j.VIDEO_OUT_RATIO_ORIGINAL);
        eVar.f55849d = vEPreviewParams2.mAudioPaths;
        int a = this.f131177f.mo42990a((C20348d) eVar);
        if (vEPreviewParams2.stitchParams != null && (vEPreviewParams2.mPageType != 1 || vEPreviewParams2.mIsFromDraft)) {
            StitchParams stitchParams = vEPreviewParams2.stitchParams;
            float f = vEPreviewParams2.mVolume;
            float f2 = vEPreviewParams2.mMusicVolume;
            String musicPath = stitchParams.getMusicPath();
            if (musicPath == null) {
                musicPath = "";
            }
            String[] strArr2 = vEPreviewParams2.mVideoPaths;
            C52711k.m112236a((Object) strArr2, "params.mVideoPaths");
            long j = 0;
            for (String a2 : strArr2) {
                j += C43668b.m95933a(a2).getDuration();
            }
            int i = (int) j;
            long duration = stitchParams.getDuration();
            if (stitchParams.isPGCMusic() && stitchParams.getMusicStart() >= 0) {
                if (musicPath.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (C48016e.m103944b(musicPath)) {
                        if (this.f131179h != -1) {
                            this.f131177f.mo43049d(this.f131179h);
                        }
                        this.f131179h = cVar2.mo43001a(musicPath, stitchParams.getMusicStart(), stitchParams.getMusicStart() + i, false);
                        cVar2.mo43021a(this.f131179h, 1, f2);
                        cVar2.mo43021a(cVar.mo43013a().f127518i, cVar.mo43013a().f127519j, f);
                    }
                }
            }
            int i2 = (int) duration;
            VEVolumeChangeOp ofVoice = VEVolumeChangeOp.ofVoice(f2, 0, i2, 1);
            C52711k.m112236a((Object) ofVoice, "op1");
            m112571a(cVar2, ofVoice);
            int i3 = (int) (duration + 100);
            VEVolumeChangeOp ofVoice2 = VEVolumeChangeOp.ofVoice(f, i3, i, 2);
            C52711k.m112236a((Object) ofVoice2, "op2");
            m112571a(cVar2, ofVoice2);
            VEVolumeChangeOp ofVoice3 = VEVolumeChangeOp.ofVoice(0.0f, i2, i3, 3);
            C52711k.m112236a((Object) ofVoice3, "op3");
            m112571a(cVar2, ofVoice3);
        }
        return a;
    }
}
