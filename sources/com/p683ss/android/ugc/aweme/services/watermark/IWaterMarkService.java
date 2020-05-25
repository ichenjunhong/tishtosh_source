package com.p683ss.android.ugc.aweme.services.watermark;

import com.p683ss.android.ugc.aweme.account.model.C22055c;
import com.p683ss.android.ugc.aweme.services.photo.IPhotoProcessService;
import com.p683ss.android.ugc.aweme.shortvideo.p2266z.C45635a;
import com.p683ss.android.ugc.aweme.watermark.C48250l;

/* renamed from: com.ss.android.ugc.aweme.services.watermark.IWaterMarkService */
public interface IWaterMarkService {

    /* renamed from: com.ss.android.ugc.aweme.services.watermark.IWaterMarkService$IWatermarkParam */
    public interface IWatermarkParam {
        Object getRaw();

        int getXOffset();

        int getYOffset();

        void setXOffset(int i);

        void setYOffset(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.services.watermark.IWaterMarkService$IWatermarkParamBuilderService */
    public interface IWatermarkParamBuilderService {

        /* renamed from: com.ss.android.ugc.aweme.services.watermark.IWaterMarkService$IWatermarkParamBuilderService$DefaultImpls */
        public static final class DefaultImpls {
            public static /* synthetic */ IWatermarkParam createWatermark$default(IWatermarkParamBuilderService iWatermarkParamBuilderService, int i, String str, C22055c cVar, int[] iArr, boolean z, String str2, boolean z2, int i2, Object obj) {
                boolean z3;
                String str3;
                boolean z4;
                if (obj == null) {
                    if ((i2 & 16) != 0) {
                        z3 = false;
                    } else {
                        z3 = z;
                    }
                    if ((i2 & 32) != 0) {
                        str3 = "";
                    } else {
                        str3 = str2;
                    }
                    if ((i2 & 64) != 0) {
                        z4 = false;
                    } else {
                        z4 = z2;
                    }
                    return iWatermarkParamBuilderService.createWatermark(i, str, cVar, iArr, z3, str3, z4);
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createWatermark");
            }
        }

        IWatermarkParam createWatermark(int i, String str, C22055c cVar, int[] iArr, boolean z, String str2, boolean z2);

        void getGifWatermarkImage(String str);
    }

    void cancelWaterMark();

    String[] createWaterMarkImages(int i, int i2, String str, String str2, String str3, boolean z, boolean z2, String str4, boolean z3);

    String[] createWaterMarkImages(String str, String str2, String str3, String str4, boolean z);

    IPhotoProcessService photoProcessService();

    void prepareDataForI18n(C48250l lVar);

    void waterMark(int i, String str, String str2, int[] iArr, C45635a aVar);

    void waterMark(C48250l lVar);

    IWatermarkParamBuilderService watermarkParamBuilderService();
}
