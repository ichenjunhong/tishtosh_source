package com.google.android.gms.location;

import java.util.Comparator;

/* renamed from: com.google.android.gms.location.w */
final class C16905w implements Comparator<DetectedActivity> {
    C16905w() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        DetectedActivity detectedActivity = (DetectedActivity) obj;
        DetectedActivity detectedActivity2 = (DetectedActivity) obj2;
        int compareTo = Integer.valueOf(detectedActivity2.f47617a).compareTo(Integer.valueOf(detectedActivity.f47617a));
        return compareTo == 0 ? Integer.valueOf(detectedActivity.mo32552a()).compareTo(Integer.valueOf(detectedActivity2.mo32552a())) : compareTo;
    }
}
