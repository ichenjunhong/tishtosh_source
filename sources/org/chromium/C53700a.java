package org.chromium;

import android.content.Context;
import com.ttnet.org.chromium.net.TTAppInfoProvider;
import com.ttnet.org.chromium.net.TTAppInfoProvider.AppInfo;
import java.util.Map;

/* renamed from: org.chromium.a */
public class C53700a extends TTAppInfoProvider {

    /* renamed from: a */
    private static C53700a f133246a;

    /* renamed from: b */
    private AppInfo f133247b;

    /* renamed from: c */
    private Context f133248c;

    public AppInfo getAppInfo() {
        try {
            synchronized (C53700a.class) {
                if (this.f133247b == null) {
                    this.f133247b = new AppInfo();
                }
            }
            this.f133247b.setAbClient(C53702c.m114289a().mo112164a("getAbClient"));
            this.f133247b.setAbFlag(C53702c.m114289a().mo112164a("getAbFlag"));
            this.f133247b.setAbVersion(C53702c.m114289a().mo112164a("getAbVersion"));
            this.f133247b.setAbFeature(C53702c.m114289a().mo112164a("getAbFeature"));
            this.f133247b.setAppId(C53702c.m114289a().mo112164a("getAppId"));
            this.f133247b.setAppName(C53702c.m114289a().mo112164a("getAppName"));
            this.f133247b.setSdkAppID(C53702c.m114289a().mo112164a("getSdkAppId"));
            this.f133247b.setSdkVersion(C53702c.m114289a().mo112164a("getSdkVersion"));
            this.f133247b.setChannel(C53702c.m114289a().mo112164a("getChannel"));
            this.f133247b.setCityName(C53702c.m114289a().mo112164a("getCityName"));
            this.f133247b.setDeviceId(C53702c.m114289a().mo112164a("getDeviceId"));
            if (C53705f.m114307a(this.f133248c)) {
                this.f133247b.setIsMainProcess("1");
            } else {
                this.f133247b.setIsMainProcess("0");
            }
            this.f133247b.setAbi(C53702c.m114289a().mo112164a("getAbi"));
            this.f133247b.setDevicePlatform(C53702c.m114289a().mo112164a("getDevicePlatform"));
            this.f133247b.setDeviceType(C53702c.m114289a().mo112164a("getDeviceType"));
            this.f133247b.setDeviceBrand(C53702c.m114289a().mo112164a("getDeviceBrand"));
            this.f133247b.setIId(C53702c.m114289a().mo112164a("getIId"));
            this.f133247b.setNetAccessType(C53702c.m114289a().mo112164a("getNetAccessType"));
            this.f133247b.setOpenUdid(C53702c.m114289a().mo112164a("getOpenUdid"));
            this.f133247b.setSSmix(C53702c.m114289a().mo112164a("getSsmix"));
            this.f133247b.setRticket(C53702c.m114289a().mo112164a("getRticket"));
            this.f133247b.setLanguage(C53702c.m114289a().mo112164a("getLanguage"));
            this.f133247b.setDPI(C53702c.m114289a().mo112164a("getDPI"));
            this.f133247b.setOSApi(C53702c.m114289a().mo112164a("getOSApi"));
            this.f133247b.setOSVersion(C53702c.m114289a().mo112164a("getOSVersion"));
            this.f133247b.setResolution(C53702c.m114289a().mo112164a("getResolution"));
            this.f133247b.setUserId(C53702c.m114289a().mo112164a("getUserId"));
            this.f133247b.setUUID(C53702c.m114289a().mo112164a("getUUID"));
            this.f133247b.setVersionCode(C53702c.m114289a().mo112164a("getVersionCode"));
            this.f133247b.setVersionName(C53702c.m114289a().mo112164a("getVersionName"));
            this.f133247b.setUpdateVersionCode(C53702c.m114289a().mo112164a("getUpdateVersionCode"));
            this.f133247b.setManifestVersionCode(C53702c.m114289a().mo112164a("getManifestVersionCode"));
            this.f133247b.setStoreIdc(C53702c.m114289a().mo112164a("getStoreIdc"));
            this.f133247b.setRegion(C53702c.m114289a().mo112164a("getRegion"));
            this.f133247b.setSysRegion(C53702c.m114289a().mo112164a("getSysRegion"));
            this.f133247b.setCarrierRegion(C53702c.m114289a().mo112164a("getCarrierRegion"));
            this.f133247b.setLiveSdkVersion("");
            this.f133247b.setOpenVersion("");
            Map b = C53702c.m114289a().mo112169b();
            if (b != null && !b.isEmpty()) {
                this.f133247b.setHostFirst((String) b.get("first"));
                this.f133247b.setHostSecond((String) b.get("second"));
                this.f133247b.setHostThird((String) b.get("third"));
                this.f133247b.setDomainBase((String) b.get("ib"));
                this.f133247b.setDomainChannel((String) b.get("ichannel"));
                this.f133247b.setDomainLog((String) b.get("log"));
                this.f133247b.setDomainMon((String) b.get("mon"));
                this.f133247b.setDomainSec((String) b.get("security"));
                this.f133247b.setDomainSub((String) b.get("isub"));
            }
            if (C53703d.m114300a().loggerDebug()) {
                StringBuilder sb = new StringBuilder("AppInfo{mIId='");
                sb.append(this.f133247b.getIId());
                sb.append('\'');
                sb.append(", mUserId='");
                sb.append(this.f133247b.getUserId());
                sb.append('\'');
                sb.append(", mAppId='");
                sb.append(this.f133247b.getAppId());
                sb.append('\'');
                sb.append(", mOSApi='");
                sb.append(this.f133247b.getOSApi());
                sb.append('\'');
                sb.append(", mAbFlag='");
                sb.append(this.f133247b.getAbFlag());
                sb.append('\'');
                sb.append(", mOpenVersion='");
                sb.append(this.f133247b.getOpenVersion());
                sb.append('\'');
                sb.append(", mDeviceId='");
                sb.append(this.f133247b.getDeviceId());
                sb.append('\'');
                sb.append(", mNetAccessType='");
                sb.append(this.f133247b.getNetAccessType());
                sb.append('\'');
                sb.append(", mVersionCode='");
                sb.append(this.f133247b.getVersionCode());
                sb.append('\'');
                sb.append(", mDeviceType='");
                sb.append(this.f133247b.getDeviceType());
                sb.append('\'');
                sb.append(", mAppName='");
                sb.append(this.f133247b.getAppName());
                sb.append('\'');
                sb.append(", mSdkAppID='");
                sb.append(this.f133247b.getSdkAppID());
                sb.append('\'');
                sb.append(", mSdkVersion='");
                sb.append(this.f133247b.getSdkVersion());
                sb.append('\'');
                sb.append(", mChannel='");
                sb.append(this.f133247b.getChannel());
                sb.append('\'');
                sb.append(", mCityName='");
                sb.append(this.f133247b.getCityName());
                sb.append('\'');
                sb.append(", mLiveSdkVersion='");
                sb.append(this.f133247b.getLiveSdkVersion());
                sb.append('\'');
                sb.append(", mOSVersion='");
                sb.append(this.f133247b.getOSVersion());
                sb.append('\'');
                sb.append(", mAbi='");
                sb.append(this.f133247b.getAbi());
                sb.append('\'');
                sb.append(", mDevicePlatform='");
                sb.append(this.f133247b.getDevicePlatform());
                sb.append('\'');
                sb.append(", mUUID='");
                sb.append(this.f133247b.getUUID());
                sb.append('\'');
                sb.append(", mOpenUdid='");
                sb.append(this.f133247b.getOpenUdid());
                sb.append('\'');
                sb.append(", mResolution='");
                sb.append(this.f133247b.getResolution());
                sb.append('\'');
                sb.append(", mAbVersion='");
                sb.append(this.f133247b.getAbVersion());
                sb.append('\'');
                sb.append(", mAbClient='");
                sb.append(this.f133247b.getAbClient());
                sb.append('\'');
                sb.append(", mAbFeature='");
                sb.append(this.f133247b.getAbFeature());
                sb.append('\'');
                sb.append(", mDeviceBrand='");
                sb.append(this.f133247b.getDeviceBrand());
                sb.append('\'');
                sb.append(", mLanguage='");
                sb.append(this.f133247b.getLanguage());
                sb.append('\'');
                sb.append(", mVersionName='");
                sb.append(this.f133247b.getVersionName());
                sb.append('\'');
                sb.append(", mSSmix='");
                sb.append(this.f133247b.getSSmix());
                sb.append('\'');
                sb.append(", mUpdateVersionCode='");
                sb.append(this.f133247b.getUpdateVersionCode());
                sb.append('\'');
                sb.append(", mManifestVersionCode='");
                sb.append(this.f133247b.getManifestVersionCode());
                sb.append('\'');
                sb.append(", mDPI='");
                sb.append(this.f133247b.getDPI());
                sb.append('\'');
                sb.append(", mRticket='");
                sb.append(this.f133247b.getRticket());
                sb.append('\'');
                sb.append(", mHostFirst='");
                sb.append(this.f133247b.getHostFirst());
                sb.append('\'');
                sb.append(", mHostSecond='");
                sb.append(this.f133247b.getHostSecond());
                sb.append('\'');
                sb.append(", mHostThird='");
                sb.append(this.f133247b.getHostThird());
                sb.append('\'');
                sb.append(", mDomainBase='");
                sb.append(this.f133247b.getDomainBase());
                sb.append('\'');
                sb.append(", mDomainLog='");
                sb.append(this.f133247b.getDomainLog());
                sb.append('\'');
                sb.append(", mDomainSub='");
                sb.append(this.f133247b.getDomainSub());
                sb.append('\'');
                sb.append(", mDomainChannel='");
                sb.append(this.f133247b.getDomainChannel());
                sb.append('\'');
                sb.append(", mDomainMon='");
                sb.append(this.f133247b.getDomainMon());
                sb.append('\'');
                sb.append(", mDomainSec='");
                sb.append(this.f133247b.getDomainSec());
                sb.append('\'');
                sb.append('}');
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder("get appinfo = ");
                sb3.append(sb2);
                C53703d.m114300a().loggerD("CronetAppInfoProvider", sb3.toString());
            }
        } catch (Throwable unused) {
        }
        return this.f133247b;
    }

    private C53700a(Context context) {
        this.f133248c = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C53700a m114287a(Context context) {
        if (f133246a == null) {
            synchronized (C53700a.class) {
                if (f133246a == null) {
                    f133246a = new C53700a(context);
                }
            }
        }
        return f133246a;
    }
}
