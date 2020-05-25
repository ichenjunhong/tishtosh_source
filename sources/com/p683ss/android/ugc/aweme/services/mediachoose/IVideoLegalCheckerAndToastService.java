package com.p683ss.android.ugc.aweme.services.mediachoose;

import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52687r;

/* renamed from: com.ss.android.ugc.aweme.services.mediachoose.IVideoLegalCheckerAndToastService */
public interface IVideoLegalCheckerAndToastService {
    void isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, int i, int i2, C52682m<? super String, ? super Long, C52860x> mVar, C52687r<? super String, ? super Long, ? super Integer, ? super String, C52860x> rVar);

    void isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, int i, C52670a<C52860x> aVar);

    boolean isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z);

    boolean isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, int i, int i2, C52671b<? super Integer, C52860x> bVar);

    boolean isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, C52671b<? super Integer, C52860x> bVar);
}
