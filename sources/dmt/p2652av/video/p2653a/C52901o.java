package dmt.p2652av.video.p2653a;

import android.content.Context;
import android.text.TextUtils;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.asve.p1239c.C20348d;
import com.p683ss.android.ugc.asve.p1239c.C20351g;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p683ss.android.ugc.aweme.status.StatusCreateVideoData;
import dmt.p2652av.video.VEPreviewMusicParams;
import dmt.p2652av.video.VEPreviewParams;
import java.util.ArrayList;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: dmt.av.video.a.o */
public final class C52901o extends C52885a {

    /* renamed from: t */
    private int f131214t = -1;

    /* renamed from: u */
    private String f131215u;

    /* renamed from: a */
    public final boolean mo110494a(VEVolumeChangeOp vEVolumeChangeOp) {
        C52711k.m112240b(vEVolumeChangeOp, "op");
        if (vEVolumeChangeOp.mType == 0) {
            this.f131177f.mo43021a(0, 0, vEVolumeChangeOp.mVolume);
        } else if (vEVolumeChangeOp.mType == 1) {
            if (this.f131179h != -1) {
                this.f131177f.mo43021a(this.f131179h, 1, vEVolumeChangeOp.mVolume);
            } else {
                this.f131214t = this.f131177f.mo43054e();
                if (this.f131214t != -1) {
                    this.f131177f.mo43021a(this.f131214t, 1, vEVolumeChangeOp.mVolume);
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo110495a(VEPreviewMusicParams vEPreviewMusicParams) {
        C52711k.m112240b(vEPreviewMusicParams, "params");
        if (this.f131179h != -1) {
            this.f131177f.mo43049d(this.f131179h);
            this.f131179h = -1;
        }
        if (!TextUtils.isEmpty(vEPreviewMusicParams.f131134a) || !TextUtils.isEmpty(this.f131215u)) {
            this.f131214t = this.f131177f.mo43054e();
            if (this.f131214t != -1) {
                this.f131177f.mo43021a(this.f131214t, 1, 0.0f);
            }
            if (vEPreviewMusicParams.f131134a == null) {
                vEPreviewMusicParams.f131134a = this.f131215u;
                vEPreviewMusicParams.f131136c = 10000;
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
        } else if (vEPreviewMusicParams.mo110444a()) {
            this.f131177f.mo43021a(this.f131214t, 1, vEPreviewMusicParams.f131138e);
        } else {
            this.f131177f.mo43021a(0, 1, vEPreviewMusicParams.f131138e);
        }
        return false;
    }

    /* renamed from: a */
    public final int mo110482a(Context context, C20347c cVar, VEPreviewParams vEPreviewParams) {
        StatusCreateVideoData statusCreateVideoData;
        super.mo110482a(context, cVar, vEPreviewParams);
        if (vEPreviewParams != null) {
            statusCreateVideoData = vEPreviewParams.statusCreateVideoData;
        } else {
            statusCreateVideoData = null;
        }
        int i = 0;
        if (statusCreateVideoData != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (!TextUtils.isEmpty(statusCreateVideoData.getBgPath())) {
                arrayList.add(statusCreateVideoData.getBgPath());
                arrayList2.add("bgimg");
            }
            int size = arrayList.size();
            String[] strArr = new String[size];
            for (int i2 = 0; i2 < size; i2++) {
                strArr[i2] = (String) arrayList.get(i2);
            }
            int size2 = arrayList2.size();
            String[] strArr2 = new String[size2];
            while (i < size2) {
                strArr2[i] = (String) arrayList2.get(i);
                i++;
            }
            if (!TextUtils.isEmpty(statusCreateVideoData.getMusicPath())) {
                C20347c cVar2 = this.f131177f;
                C20351g gVar = new C20351g(statusCreateVideoData.getEffectPath(), strArr, strArr2, statusCreateVideoData.getMusicPath(), 0, 1000);
                i = cVar2.mo42990a((C20348d) gVar);
            } else {
                C20347c cVar3 = this.f131177f;
                C20351g gVar2 = new C20351g(statusCreateVideoData.getEffectPath(), strArr, strArr2, null, 0, 0, 56, null);
                i = cVar3.mo42990a((C20348d) gVar2);
            }
            this.f131184m = statusCreateVideoData.getMusicIds();
            this.f131215u = statusCreateVideoData.getMusicPath();
        }
        return i;
    }
}
