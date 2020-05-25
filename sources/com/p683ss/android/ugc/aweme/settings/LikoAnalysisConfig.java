package com.p683ss.android.ugc.aweme.settings;

import android.support.annotation.Keep;
import com.google.gson.p1076a.C17952c;

@Keep
/* renamed from: com.ss.android.ugc.aweme.settings.LikoAnalysisConfig */
public class LikoAnalysisConfig {
    @C17952c(mo34828a = "bigObjectFilterSystem")
    public boolean bigObjectFilterSystem = true;
    @C17952c(mo34828a = "bigObjectLatitude")
    public int bigObjectLatitude = 3;
    @C17952c(mo34828a = "bitmapLatitude")
    public int bitmapLatitude = 204800;
    @C17952c(mo34828a = "objectInstanceFilterSystem")
    public boolean objectInstanceFilterSystem = true;
    @C17952c(mo34828a = "objectInstanceLatitude")
    public int objectInstanceLatitude = 10;
    @C17952c(mo34828a = "supportBigObjectAnalysis")
    public boolean supportBigObjectAnalysis = true;
    @C17952c(mo34828a = "supportBitmapAnalysis")
    public boolean supportBitmapAnalysis = true;
    @C17952c(mo34828a = "supportObjectInstanceAnalysis")
    public boolean supportObjectInstanceAnalysis = true;

    public int getBigObjectLatitude() {
        return this.bigObjectLatitude;
    }

    public int getBitmapLatitude() {
        return this.bitmapLatitude;
    }

    public int getObjectInstanceLatitude() {
        return this.objectInstanceLatitude;
    }

    public boolean isBigObjectFilterSystem() {
        return this.bigObjectFilterSystem;
    }

    public boolean isObjectInstanceFilterSystem() {
        return this.objectInstanceFilterSystem;
    }

    public boolean isSupportBigObjectAnalysis() {
        return this.supportBigObjectAnalysis;
    }

    public boolean isSupportBitmapAnalysis() {
        return this.supportBitmapAnalysis;
    }

    public boolean isSupportObjectInstanceAnalysis() {
        return this.supportObjectInstanceAnalysis;
    }

    public void setBigObjectFilterSystem(boolean z) {
        this.bigObjectFilterSystem = z;
    }

    public void setBigObjectLatitude(int i) {
        this.bigObjectLatitude = i;
    }

    public void setBitmapLatitude(int i) {
        this.bitmapLatitude = i;
    }

    public void setObjectInstanceFilterSystem(boolean z) {
        this.objectInstanceFilterSystem = z;
    }

    public void setObjectInstanceLatitude(int i) {
        this.objectInstanceLatitude = i;
    }

    public void setSupportBigObjectAnalysis(boolean z) {
        this.supportBigObjectAnalysis = z;
    }

    public void setSupportBitmapAnalysis(boolean z) {
        this.supportBitmapAnalysis = z;
    }

    public void setSupportObjectInstanceAnalysis(boolean z) {
        this.supportObjectInstanceAnalysis = z;
    }
}
