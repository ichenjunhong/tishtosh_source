package com.google.android.gms.location;

import java.util.Comparator;

/* renamed from: com.google.android.gms.location.t */
final class C16902t implements Comparator<ActivityTransition> {
    C16902t() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        ActivityTransition activityTransition = (ActivityTransition) obj;
        ActivityTransition activityTransition2 = (ActivityTransition) obj2;
        int i = activityTransition.f47603a;
        int i2 = activityTransition2.f47603a;
        if (i != i2) {
            return i < i2 ? -1 : 1;
        }
        int i3 = activityTransition.f47604b;
        int i4 = activityTransition2.f47604b;
        if (i3 == i4) {
            return 0;
        }
        return i3 < i4 ? -1 : 1;
    }
}
