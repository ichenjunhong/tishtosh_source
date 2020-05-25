package com.p683ss.android.vesdk.faceinfo;

import com.p683ss.android.medialib.model.FaceDetect;
import com.p683ss.android.medialib.model.FaceDetectInfo;
import com.p683ss.android.vesdk.faceinfo.C50693c.C50694a;

/* renamed from: com.ss.android.vesdk.faceinfo.d */
public final class C50695d {

    /* renamed from: a */
    public C50693c[] f127233a;

    /* renamed from: a */
    public static C50695d m109622a(FaceDetectInfo faceDetectInfo) {
        if (faceDetectInfo == null || faceDetectInfo.getInfo() == null) {
            return null;
        }
        C50695d dVar = new C50695d();
        C50693c[] cVarArr = new C50693c[faceDetectInfo.getInfo().length];
        FaceDetect[] info = faceDetectInfo.getInfo();
        int length = info.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            FaceDetect faceDetect = info[i];
            C50693c cVar = new C50693c();
            cVar.f127211a = faceDetect.getRect();
            cVar.f127213c = faceDetect.getPoints();
            cVar.f127220j = faceDetect.getAction();
            cVar.f127218h = faceDetect.getEyeDistance();
            if (faceDetect.getFaceExtInfo() != null) {
                C50694a aVar = new C50694a();
                aVar.f127224b = faceDetect.getFaceExtInfo().eyebrowCount;
                aVar.f127229g = faceDetect.getFaceExtInfo().eyeBrowLeftPoints;
                aVar.f127230h = faceDetect.getFaceExtInfo().eyeBrowRightPoints;
                aVar.f127223a = faceDetect.getFaceExtInfo().eyeCount;
                aVar.f127227e = faceDetect.getFaceExtInfo().eyeLeftPoints;
                aVar.f127228f = faceDetect.getFaceExtInfo().eyeRightPoints;
                aVar.f127225c = faceDetect.getFaceExtInfo().lipCount;
                aVar.f127231i = faceDetect.getFaceExtInfo().irisLeftPoints;
                aVar.f127232j = faceDetect.getFaceExtInfo().irisRightPoints;
                aVar.f127226d = faceDetect.getFaceExtInfo().irisCount;
                cVar.f127222l = aVar;
            }
            cVar.f127219i = faceDetect.getFaceID();
            cVar.f127216f = faceDetect.getPitch();
            cVar.f127214d = faceDetect.getPointVisibility();
            cVar.f127217g = faceDetect.getRoll();
            cVar.f127215e = faceDetect.getYaw();
            cVar.f127212b = faceDetect.getScore();
            cVar.f127221k = faceDetect.getTrackCount();
            int i3 = i2 + 1;
            cVarArr[i2] = cVar;
            i++;
            i2 = i3;
        }
        dVar.f127233a = cVarArr;
        return dVar;
    }
}
