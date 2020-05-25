package dmt.p2652av.video.p2653a;

import android.content.Context;
import android.text.TextUtils;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.asve.p1239c.C20348d;
import com.p683ss.android.ugc.asve.p1239c.C20351g;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.p1388at.C23289b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import dmt.p2652av.video.C53029x;
import dmt.p2652av.video.VEPreviewMusicParams;
import dmt.p2652av.video.VEPreviewParams;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: dmt.av.video.a.l */
public final class C52898l extends C52885a {
    /* renamed from: a */
    public final boolean mo110495a(VEPreviewMusicParams vEPreviewMusicParams) {
        C52711k.m112240b(vEPreviewMusicParams, "params");
        return false;
    }

    /* renamed from: a */
    public final boolean mo110494a(VEVolumeChangeOp vEVolumeChangeOp) {
        C52711k.m112240b(vEVolumeChangeOp, "op");
        return this.f131177f.mo43021a(this.f131177f.mo43054e(), 1, vEVolumeChangeOp.mVolume);
    }

    /* renamed from: a */
    public final boolean mo110498a(C53029x xVar) {
        C52711k.m112240b(xVar, "op");
        if (this.f131177f.mo42972a(this.f131177f.mo43054e(), xVar.f131505a, xVar.f131505a + xVar.f131506b, C39629l.m88232a().mo58583n().mo83103a(C40790a.RearMusicAutoLoop)) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final int mo110482a(Context context, C20347c cVar, VEPreviewParams vEPreviewParams) {
        C52711k.m112240b(cVar, "editor");
        C52711k.m112240b(vEPreviewParams, "params");
        super.mo110482a(context, cVar, vEPreviewParams);
        C23289b bVar = vEPreviewParams.mvCreateVideoData;
        int i = 0;
        if (bVar != null && C23715d.m58204b(bVar.selectMediaList) && !TextUtils.isEmpty(bVar.mvResUnzipPath)) {
            int size = bVar.selectMediaList.size();
            String[] strArr = new String[size];
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = bVar.selectMediaList.get(i2);
                C52711k.m112236a(obj, "data.selectMediaList[it]");
                strArr[i2] = (String) obj;
            }
            int size2 = bVar.selectMediaList.size();
            String[] strArr2 = new String[size2];
            for (int i3 = 0; i3 < size2; i3++) {
                strArr2[i3] = "img";
            }
            if (this.f131177f != null) {
                if (vEPreviewParams.mPageType == 3 || vEPreviewParams.mPageType == 2 || vEPreviewParams.mIsFromDraft) {
                    C20347c cVar2 = this.f131177f;
                    String str = bVar.mvResUnzipPath;
                    C52711k.m112236a((Object) str, "data.mvResUnzipPath");
                    C20351g gVar = new C20351g(str, strArr, strArr2, vEPreviewParams.mMusicPath, vEPreviewParams.mMusicInPoint, vEPreviewParams.mMusicOutPoint);
                    i = cVar2.mo42990a((C20348d) gVar);
                } else {
                    C20347c cVar3 = this.f131177f;
                    String str2 = bVar.mvResUnzipPath;
                    C52711k.m112236a((Object) str2, "data.mvResUnzipPath");
                    C20351g gVar2 = new C20351g(str2, strArr, strArr2, null, 0, 0, 56, null);
                    i = cVar3.mo42990a((C20348d) gVar2);
                }
            }
            this.f131184m = bVar.musicIds;
        }
        return i;
    }
}
