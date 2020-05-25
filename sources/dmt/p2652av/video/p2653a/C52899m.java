package dmt.p2652av.video.p2653a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.asve.p1239c.C20348d;
import com.p683ss.android.ugc.asve.p1239c.C20351g;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.p1388at.C23288a;
import com.p683ss.android.ugc.aweme.p1388at.C23289b;
import com.p683ss.android.ugc.aweme.p1388at.C23290c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.vesdk.VEListener.C50555s;
import com.p683ss.android.vesdk.VEMVAlgorithmConfig.MV_REESULT_IN_TYPE;
import dmt.p2652av.video.VEPreviewMusicParams;
import dmt.p2652av.video.VEPreviewParams;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import p2628d.C52847n;

/* renamed from: dmt.av.video.a.m */
public final class C52899m extends C52885a {

    /* renamed from: t */
    private int f131211t = -1;

    /* renamed from: a */
    public final boolean mo110494a(VEVolumeChangeOp vEVolumeChangeOp) {
        if (vEVolumeChangeOp.mType == 0) {
            this.f131177f.mo43021a(0, 0, vEVolumeChangeOp.mVolume);
        } else if (vEVolumeChangeOp.mType == 1) {
            if (this.f131179h != -1) {
                this.f131177f.mo43021a(this.f131179h, 1, vEVolumeChangeOp.mVolume);
            } else {
                this.f131211t = this.f131177f.mo43054e();
                if (this.f131211t != -1) {
                    this.f131177f.mo43021a(this.f131211t, 1, vEVolumeChangeOp.mVolume);
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo110506a(C23289b bVar) {
        if (!C9376b.m18558a((Collection<T>) bVar.newMaskFileData)) {
            Iterator it = bVar.newMaskFileData.iterator();
            while (it.hasNext()) {
                C23290c cVar = (C23290c) it.next();
                if (!TextUtils.isEmpty(cVar.getFilePath())) {
                    if (cVar.getFilePath().endsWith(".mp4")) {
                        this.f131177f.mo43005a(cVar.getPhotonPath(), cVar.getAlgorithm(), cVar.getFilePath(), MV_REESULT_IN_TYPE.MV_REESULT_IN_TYPE_VIDEO);
                    } else {
                        this.f131177f.mo43005a(cVar.getPhotonPath(), cVar.getAlgorithm(), cVar.getFilePath(), MV_REESULT_IN_TYPE.MV_REESULT_IN_TYPE_IMAGE);
                    }
                }
                if (!TextUtils.isEmpty(cVar.getJsonParams())) {
                    this.f131177f.mo43005a(cVar.getPhotonPath(), cVar.getAlgorithm(), cVar.getJsonParams(), MV_REESULT_IN_TYPE.MV_REESULT_IN_TYPE_JSON);
                }
            }
            return;
        }
        if (!C9376b.m18558a((Collection<T>) bVar.maskFileData)) {
            Iterator it2 = bVar.maskFileData.iterator();
            while (it2.hasNext()) {
                C23288a aVar = (C23288a) it2.next();
                if (!C9376b.m18558a((Collection<T>) aVar.getMaskFiles())) {
                    for (C52847n nVar : aVar.getMaskFiles()) {
                        this.f131177f.mo43005a(aVar.getPhotonPath(), (String) nVar.component1(), (String) nVar.component2(), MV_REESULT_IN_TYPE.MV_REESULT_IN_TYPE_IMAGE);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo110495a(VEPreviewMusicParams vEPreviewMusicParams) {
        boolean z;
        if (this.f131179h != -1) {
            this.f131177f.mo43049d(this.f131179h);
            this.f131179h = -1;
        }
        String str = vEPreviewMusicParams.f131139f;
        if (!TextUtils.isEmpty(str) && !C23715d.m58202a((Collection<T>) this.f131184m)) {
            z = this.f131184m.contains(str);
        } else {
            z = false;
        }
        if (!z) {
            this.f131211t = this.f131177f.mo43054e();
            if (this.f131211t != -1) {
                this.f131177f.mo43021a(this.f131211t, 1, 0.0f);
            }
            if (vEPreviewMusicParams.f131134a == null) {
                return false;
            }
            if (vEPreviewMusicParams.f131137d <= 0 || Math.abs(vEPreviewMusicParams.f131136c - vEPreviewMusicParams.f131137d) < 1000) {
                this.f131179h = this.f131177f.mo43001a(vEPreviewMusicParams.f131134a, vEPreviewMusicParams.f131135b, vEPreviewMusicParams.f131135b + vEPreviewMusicParams.f131136c, C39629l.m88232a().mo58583n().mo83103a(C40790a.RearMusicAutoLoop));
            } else {
                this.f131179h = this.f131177f.mo43001a(vEPreviewMusicParams.f131134a, vEPreviewMusicParams.f131135b, vEPreviewMusicParams.f131135b + vEPreviewMusicParams.f131137d, C39629l.m88232a().mo58583n().mo83103a(C40790a.RearMusicAutoLoop));
            }
            this.f131177f.mo43021a(this.f131179h, 1, vEPreviewMusicParams.f131138e);
        } else if (vEPreviewMusicParams.mo110444a()) {
            this.f131177f.mo43021a(this.f131211t, 1, vEPreviewMusicParams.f131138e);
        } else {
            this.f131177f.mo43021a(0, 1, vEPreviewMusicParams.f131138e);
        }
        return false;
    }

    /* renamed from: a */
    public final int mo110482a(Context context, C20347c cVar, VEPreviewParams vEPreviewParams) {
        super.mo110482a(context, cVar, vEPreviewParams);
        C23289b bVar = vEPreviewParams.mvCreateVideoData;
        int i = 0;
        if (bVar != null && !C23715d.m58202a((Collection<T>) bVar.selectMediaList) && !TextUtils.isEmpty(bVar.mvResUnzipPath)) {
            String[] strArr = new String[bVar.selectMediaList.size()];
            String[] strArr2 = new String[bVar.selectMediaList.size()];
            for (int i2 = 0; i2 < bVar.selectMediaList.size(); i2++) {
                strArr[i2] = (String) bVar.selectMediaList.get(i2);
                strArr2[i2] = "img";
            }
            if (this.f131177f != null) {
                StringBuilder sb = new StringBuilder("MVRes: InitMV: path: ");
                sb.append(bVar.mvResUnzipPath);
                sb.append(" file count ");
                File[] listFiles = new File(bVar.mvResUnzipPath).listFiles();
                if (listFiles != null) {
                    i = listFiles.length;
                }
                sb.append(i);
                C45407ay.m98968a(sb.toString());
                this.f131177f.mo43017a((C50555s) new C52900n(this, bVar));
                i = this.f131177f.mo42990a((C20348d) new C20351g(bVar.mvResUnzipPath, strArr, strArr2));
            }
            this.f131184m = bVar.musicIds;
        }
        return i;
    }
}
