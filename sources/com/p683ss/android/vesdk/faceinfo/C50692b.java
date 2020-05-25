package com.p683ss.android.vesdk.faceinfo;

import com.p683ss.android.medialib.model.FaceAttribute;
import com.p683ss.android.medialib.model.FaceAttributeInfo;

/* renamed from: com.ss.android.vesdk.faceinfo.b */
public final class C50692b {

    /* renamed from: a */
    public C50691a[] f127210a;

    /* renamed from: a */
    public static C50692b m109621a(FaceAttributeInfo faceAttributeInfo) {
        if (faceAttributeInfo == null) {
            return null;
        }
        C50692b bVar = new C50692b();
        FaceAttribute[] info = faceAttributeInfo.getInfo();
        int i = 0;
        if (info == null) {
            bVar.f127210a = new C50691a[0];
        } else {
            C50691a[] aVarArr = new C50691a[info.length];
            bVar.f127210a = aVarArr;
            int length = info.length;
            int i2 = 0;
            while (i < length) {
                FaceAttribute faceAttribute = info[i];
                C50691a aVar = new C50691a();
                int i3 = i2 + 1;
                aVarArr[i2] = aVar;
                if (faceAttribute != null) {
                    aVar.f127187a = faceAttribute.getAge();
                    aVar.f127200n = faceAttribute.getAngryScore();
                    aVar.f127194h = faceAttribute.getRacialProbs();
                    aVar.f127197k = faceAttribute.getArousal();
                    aVar.f127200n = faceAttribute.getAngryScore();
                    aVar.f127189c = faceAttribute.getAttractive();
                    aVar.f127208v = faceAttribute.getBlurScore();
                    aVar.f127188b = faceAttribute.getBoyProb();
                    aVar.f127192f = faceAttribute.getExpProbs();
                    aVar.f127191e = faceAttribute.getExpType();
                    aVar.f127190d = faceAttribute.getHappyScore();
                    aVar.f127209w = faceAttribute.getIllumination();
                    aVar.f127205s = faceAttribute.getLipstickProb();
                    aVar.f127202p = faceAttribute.getMaskProb();
                    aVar.f127204r = faceAttribute.getMustacheProb();
                    aVar.f127196j = faceAttribute.getQuality();
                    aVar.f127193g = faceAttribute.getRacialType();
                    aVar.f127195i = faceAttribute.getRealFaceProb();
                    aVar.f127199m = faceAttribute.getSadScore();
                    aVar.f127201o = faceAttribute.getSurpriseScore();
                    aVar.f127198l = faceAttribute.getValence();
                    aVar.f127206t = faceAttribute.getWearGlassProb();
                    aVar.f127203q = faceAttribute.getWearHatProb();
                    aVar.f127207u = faceAttribute.getWearSunglassProb();
                }
                i++;
                i2 = i3;
            }
        }
        return bVar;
    }
}
