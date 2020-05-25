package com.p683ss.android.ugc.aweme.poi;

import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.d */
public final class C39054d implements Serializable {
    public float accuracy;
    public String address;
    public String city;
    public String country;
    public String district;
    public boolean isGaode;
    public double latitude;
    public double longitude;
    public String province;
    public long time;

    public final boolean isValid() {
        if (this.latitude == ProfileUiInitOptimizeEnterThreshold.DEFAULT || this.longitude == ProfileUiInitOptimizeEnterThreshold.DEFAULT) {
            return false;
        }
        return true;
    }
}
