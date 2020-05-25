package com.p683ss.android.ugc.aweme.watermark;

import android.graphics.BitmapFactory;
import com.p683ss.android.ugc.aweme.account.model.C22055c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.services.watermark.IWaterMarkService.IWatermarkParam;
import com.p683ss.android.ugc.aweme.services.watermark.IWaterMarkService.IWatermarkParamBuilderService;
import com.p683ss.android.vesdk.VEWatermarkParam;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.watermark.t */
public final class C48260t implements IWatermarkParamBuilderService {

    /* renamed from: com.ss.android.ugc.aweme.watermark.t$a */
    public static final class C48261a implements IWatermarkParam {

        /* renamed from: a */
        final /* synthetic */ VEWatermarkParam f121457a;

        /* renamed from: b */
        private final VEWatermarkParam f121458b;

        public final Object getRaw() {
            return this.f121458b;
        }

        public final int getXOffset() {
            return this.f121458b.xOffset;
        }

        public final int getYOffset() {
            return this.f121458b.yOffset;
        }

        C48261a(VEWatermarkParam vEWatermarkParam) {
            this.f121457a = vEWatermarkParam;
            this.f121458b = vEWatermarkParam;
        }

        public final void setXOffset(int i) {
            this.f121458b.xOffset = i;
        }

        public final void setYOffset(int i) {
            this.f121458b.yOffset = i;
        }
    }

    public final void getGifWatermarkImage(String str) {
        C52711k.m112240b(str, "imagePath");
        C48234c cVar = new C48234c();
        cVar.f121380a = BitmapFactory.decodeResource(C39618d.f101160a.getResources(), R.drawable.ze);
        cVar.mo95726a(str);
    }

    public final IWatermarkParam createWatermark(int i, String str, C22055c cVar, int[] iArr, boolean z, String str2, boolean z2) {
        C48261a aVar;
        C52711k.m112240b(str, "videoPath");
        C52711k.m112240b(iArr, "videoSize");
        C52711k.m112240b(str2, "extFile");
        VEWatermarkParam a = C48247i.m104502a(i, str, cVar, iArr, z, str2, z2);
        if (a != null) {
            aVar = new C48261a(a);
        } else {
            aVar = null;
        }
        return aVar;
    }
}
