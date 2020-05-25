package com.p683ss.android.ugc.aweme.gesturelog;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.ss.android.ugc.aweme.gesturelog.GenericData */
public class GenericData {
    @C17952c(mo34828a = "apk_version")
    public int apkVersion;
    @C17952c(mo34828a = "brand")
    public String brand;
    @C17952c(mo34828a = "country")
    public String country;
    @C17952c(mo34828a = "model")
    public String model;
    @C17952c(mo34828a = "screen_height")
    public int screenHeight;
    @C17952c(mo34828a = "screen_width")
    public int screenWidth;
    @C17952c(mo34828a = "sdk_version_code")
    public int sdkVersionCode;
    @C17952c(mo34828a = "user_id")
    public String userId;
    @C17952c(mo34828a = "xdpi")
    public float xdpi;
    @C17952c(mo34828a = "ydpi")
    public float ydpi;

    public GenericData(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, float f2) {
        this.brand = str;
        this.model = str2;
        this.userId = str3;
        this.country = str4;
        this.sdkVersionCode = i;
        this.apkVersion = i2;
        this.screenWidth = i3;
        this.screenHeight = i4;
        this.xdpi = f;
        this.ydpi = f2;
    }
}
