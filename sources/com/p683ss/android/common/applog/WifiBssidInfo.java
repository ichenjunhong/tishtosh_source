package com.p683ss.android.common.applog;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.bytedance.common.utility.C9425l;
import com.bytedance.common.utility.p525e.C9402b;
import com.p683ss.android.deviceregister.p1154a.C19002a;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.ss.android.common.applog.WifiBssidInfo */
public class WifiBssidInfo {
    private boolean mBssidChanged;
    private Context mContext;
    private String mLastBssid;
    private long mLastCheckBssidTime;
    private String mTempBssid;
    private long mTempCheckTime;

    public String getBssid() {
        return null;
    }

    public boolean needUploadBssid() {
        if (this.mContext == null) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.mLastCheckBssidTime < 1800000 || !C9425l.m18651b(this.mContext)) {
            return false;
        }
        String bssid = getBssid();
        if (TextUtils.isEmpty(bssid) || bssid.equals(this.mLastBssid)) {
            return false;
        }
        this.mBssidChanged = true;
        this.mTempBssid = bssid;
        this.mTempCheckTime = currentTimeMillis;
        return true;
    }

    public void uploadSuccess() {
        if (this.mBssidChanged) {
            this.mBssidChanged = false;
            this.mLastBssid = this.mTempBssid;
            this.mLastCheckBssidTime = this.mTempCheckTime;
            Editor edit = C35807d.m80935a(this.mContext, C19002a.m46175a(), 0).edit();
            edit.putString("last_wifi_bssid", this.mLastBssid);
            edit.putLong("last_check_bssid_time", this.mLastCheckBssidTime);
            C9402b.m18594a(edit);
        }
    }

    public WifiBssidInfo(Context context) {
        this.mContext = context.getApplicationContext();
        SharedPreferences a = C35807d.m80935a(this.mContext, C19002a.m46175a(), 0);
        this.mLastBssid = a.getString("last_wifi_bssid", null);
        this.mLastCheckBssidTime = a.getLong("last_check_bssid_time", 0);
    }
}
