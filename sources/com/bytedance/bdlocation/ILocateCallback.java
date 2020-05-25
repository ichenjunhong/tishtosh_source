package com.bytedance.bdlocation;

import com.bytedance.bdlocation.client.BDLocationException;

public interface ILocateCallback {
    void onLocateChange(String str, BDLocation bDLocation);

    void onLocateError(String str, BDLocationException bDLocationException);

    void onLocateStart(String str);

    void onLocateStop(String str);
}
