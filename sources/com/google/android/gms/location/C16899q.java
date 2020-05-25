package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;
import java.util.List;

/* renamed from: com.google.android.gms.location.q */
public final class C16899q implements Creator<ActivityRecognitionResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        long j = 0;
        long j2 = 0;
        List list = null;
        Bundle bundle = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    list = C15467a.m32151c(parcel, a, DetectedActivity.CREATOR);
                    break;
                case 2:
                    j = C15467a.m32156g(parcel, a);
                    break;
                case 3:
                    j2 = C15467a.m32156g(parcel, a);
                    break;
                case 4:
                    i = C15467a.m32154e(parcel, a);
                    break;
                case 5:
                    bundle = C15467a.m32165p(parcel, a);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        ActivityRecognitionResult activityRecognitionResult = new ActivityRecognitionResult(list, j, j2, i, bundle);
        return activityRecognitionResult;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityRecognitionResult[i];
    }
}
