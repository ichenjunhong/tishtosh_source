package com.bytedance.bdlocation;

import android.os.Looper;
import com.bytedance.bdlocation.client.BDLocationClient.Callback;
import com.bytedance.bdlocation.client.BDPoint;
import com.bytedance.bdlocation.client.LocationOption;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Locale;

public interface ILocate {

    @Retention(RetentionPolicy.SOURCE)
    public @interface PointMode {
    }

    BDPoint convertGCJ02(BDPoint bDPoint);

    BDLocation geocode(BDPoint bDPoint, String str);

    String getLocateName();

    List<Object> getPoiSync(BDPoint bDPoint, String str);

    void setLocale(Locale locale);

    void startLocation(Callback callback, LocationOption locationOption, Looper looper);

    void stopLocation();
}
