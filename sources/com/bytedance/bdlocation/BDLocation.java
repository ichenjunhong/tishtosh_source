package com.bytedance.bdlocation;

import android.location.Location;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.bdlocation.client.BDPoint;
import com.bytedance.bdlocation.netwok.p511a.C9234c;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class BDLocation extends Location {
    public static final int CACHE = 5;
    private transient boolean isCache;
    private String mAddress;
    private String mAdministrativeArea;
    private String mAoi;
    private C9234c mBdLBSResult;
    private String mCity;
    private String mCityCode;
    private String mCountry;
    private String mCountryCode;
    private String mDistrict;
    private String mFloor;
    private BDPoint mGCJ02;
    private String mGeoNameID;
    private String mGeocodeSDKName;
    private double mLatitude;
    private String mLocalID;
    private long mLocationMs;
    private String mLocationSDKName;
    private int mLocationType;
    private double mLongitude;
    private String mPoi;
    private String mStreet;
    private String mStreetNum;
    private String mSubAdministrativeArea;
    private transient Location mThirdPartLocation;

    @Retention(RetentionPolicy.SOURCE)
    public @interface LocationType {
    }

    public String getAddress() {
        return this.mAddress;
    }

    public String getAdministrativeArea() {
        return this.mAdministrativeArea;
    }

    public String getAoi() {
        return this.mAoi;
    }

    public C9234c getBdLBSResult() {
        return this.mBdLBSResult;
    }

    public String getCity() {
        return this.mCity;
    }

    public String getCityCode() {
        return this.mCityCode;
    }

    public String getCountry() {
        return this.mCountry;
    }

    public String getCountryCode() {
        return this.mCountryCode;
    }

    public String getDistrict() {
        return this.mDistrict;
    }

    public String getFloor() {
        return this.mFloor;
    }

    public BDPoint getGCJ02() {
        return this.mGCJ02;
    }

    public String getGeoNameID() {
        return this.mGeoNameID;
    }

    public String getGeocodeSDKName() {
        return this.mGeocodeSDKName;
    }

    public double getLatitude() {
        return this.mLatitude;
    }

    public String getLocalID() {
        return this.mLocalID;
    }

    public long getLocationMs() {
        return this.mLocationMs;
    }

    public String getLocationSDKName() {
        return this.mLocationSDKName;
    }

    public int getLocationType() {
        return this.mLocationType;
    }

    public double getLongitude() {
        return this.mLongitude;
    }

    public String getPoi() {
        return this.mPoi;
    }

    public String getStreet() {
        return this.mStreet;
    }

    public String getStreetNum() {
        return this.mStreetNum;
    }

    public String getSubAdministrativeArea() {
        return this.mSubAdministrativeArea;
    }

    public Location getThirdPartLocation() {
        return this.mThirdPartLocation;
    }

    public boolean isCache() {
        return this.isCache;
    }

    public boolean hasLBSResult() {
        if (this.mBdLBSResult != null) {
            return true;
        }
        return false;
    }

    public boolean hasAddress() {
        if (!TextUtils.isEmpty(this.mAddress) || !TextUtils.isEmpty(this.mCountry) || !TextUtils.isEmpty(this.mAdministrativeArea) || !TextUtils.isEmpty(this.mSubAdministrativeArea) || !TextUtils.isEmpty(this.mCity) || !TextUtils.isEmpty(this.mDistrict)) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (Double.compare(this.mLatitude, ProfileUiInitOptimizeEnterThreshold.DEFAULT) != 0 || Double.compare(this.mLongitude, ProfileUiInitOptimizeEnterThreshold.DEFAULT) != 0 || !TextUtils.isEmpty(this.mAddress) || !TextUtils.isEmpty(this.mCountry) || !TextUtils.isEmpty(this.mAdministrativeArea) || !TextUtils.isEmpty(this.mSubAdministrativeArea) || !TextUtils.isEmpty(this.mCity) || !TextUtils.isEmpty(this.mDistrict)) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BDLocation{mAddress='");
        sb.append(this.mAddress);
        sb.append('\'');
        sb.append(", mCountry='");
        sb.append(this.mCountry);
        sb.append('\'');
        sb.append(", mAdministrativeArea='");
        sb.append(this.mAdministrativeArea);
        sb.append('\'');
        sb.append(", mSubAdministrativeArea='");
        sb.append(this.mSubAdministrativeArea);
        sb.append('\'');
        sb.append(", mCity='");
        sb.append(this.mCity);
        sb.append('\'');
        sb.append(", mDistrict='");
        sb.append(this.mDistrict);
        sb.append('\'');
        sb.append(", mCityCode='");
        sb.append(this.mCityCode);
        sb.append('\'');
        sb.append(", mLatitude=");
        sb.append(this.mLatitude);
        sb.append(", mLongitude=");
        sb.append(this.mLongitude);
        sb.append(", mStreet='");
        sb.append(this.mStreet);
        sb.append('\'');
        sb.append(", mStreetNum='");
        sb.append(this.mStreetNum);
        sb.append('\'');
        sb.append(", mFloor='");
        sb.append(this.mFloor);
        sb.append('\'');
        sb.append(", mLocationMs=");
        sb.append(this.mLocationMs);
        sb.append(", mThirdPartLocation=");
        sb.append(this.mThirdPartLocation);
        sb.append(", mLocationSDKName='");
        sb.append(this.mLocationSDKName);
        sb.append('\'');
        sb.append(", mPoi='");
        sb.append(this.mPoi);
        sb.append('\'');
        sb.append(", mGCJ02=");
        sb.append(this.mGCJ02);
        sb.append(", mLocationType=");
        sb.append(this.mLocationType);
        sb.append(", isCache=");
        sb.append(this.isCache);
        sb.append(", mCountryCode=");
        sb.append(this.mCountryCode);
        sb.append(", mLocalID='");
        sb.append(this.mLocalID);
        sb.append('\'');
        sb.append(", mGeoNameID='");
        sb.append(this.mGeoNameID);
        sb.append('\'');
        sb.append(", mBdLBSResult=");
        sb.append(this.mBdLBSResult);
        sb.append(", mGeocodeSDKName='");
        sb.append(this.mGeocodeSDKName);
        sb.append('\'');
        sb.append(", mAoi='");
        sb.append(this.mAoi);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setAddress(String str) {
        this.mAddress = str;
    }

    public void setAdministrativeArea(String str) {
        this.mAdministrativeArea = str;
    }

    public void setAoi(String str) {
        this.mAoi = str;
    }

    public void setBdLBSResult(C9234c cVar) {
        this.mBdLBSResult = cVar;
    }

    public void setCache(boolean z) {
        this.isCache = z;
    }

    public void setCity(String str) {
        this.mCity = str;
    }

    public void setCityCode(String str) {
        this.mCityCode = str;
    }

    public void setCountry(String str) {
        this.mCountry = str;
    }

    public void setCountryCode(String str) {
        this.mCountryCode = str;
    }

    public void setDistrict(String str) {
        this.mDistrict = str;
    }

    public void setFloor(String str) {
        this.mFloor = str;
    }

    public void setGCJ02(BDPoint bDPoint) {
        this.mGCJ02 = bDPoint;
    }

    public void setGeoNameID(String str) {
        this.mGeoNameID = str;
    }

    public void setGeocodeSDKName(String str) {
        this.mGeocodeSDKName = str;
    }

    public void setLocalID(String str) {
        this.mLocalID = str;
    }

    public void setLocationMs(long j) {
        this.mLocationMs = j;
    }

    public void setLocationSDKName(String str) {
        this.mLocationSDKName = str;
    }

    public void setLocationType(int i) {
        this.mLocationType = i;
    }

    public void setPoi(String str) {
        this.mPoi = str;
    }

    public void setStreet(String str) {
        this.mStreet = str;
    }

    public void setStreetNum(String str) {
        this.mStreetNum = str;
    }

    public void setSubAdministrativeArea(String str) {
        this.mSubAdministrativeArea = str;
    }

    public void setThirdPartLocation(Location location) {
        this.mThirdPartLocation = location;
    }

    public void setLatitude(double d) {
        super.setLatitude(d);
        this.mLatitude = d;
    }

    public void setLongitude(double d) {
        super.setLongitude(d);
        this.mLongitude = d;
    }

    private int transProvider(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if ("gps".equalsIgnoreCase(str)) {
            return 1;
        }
        if (!"network".equalsIgnoreCase(str) && !"bd_lbs".equalsIgnoreCase(str) && !"lbs".equalsIgnoreCase(str)) {
            return 0;
        }
        return 4;
    }

    public BDLocation(BDLocation bDLocation) {
        super(bDLocation.getProvider());
        superLocation(bDLocation);
        this.mLocationMs = bDLocation.getTime();
        this.mThirdPartLocation = bDLocation.mThirdPartLocation;
        this.mAddress = bDLocation.mAddress;
        this.mCountry = bDLocation.mCountry;
        this.mAdministrativeArea = bDLocation.mAdministrativeArea;
        this.mSubAdministrativeArea = bDLocation.mSubAdministrativeArea;
        this.mCity = bDLocation.mCity;
        this.mDistrict = bDLocation.mDistrict;
        this.mCityCode = bDLocation.mCityCode;
        setLatitude(bDLocation.getLatitude());
        setLongitude(bDLocation.getLongitude());
        this.mLocationMs = bDLocation.getTime();
        this.mStreet = bDLocation.mStreet;
        this.mStreetNum = bDLocation.mStreetNum;
        this.mFloor = bDLocation.mFloor;
        this.mLocationSDKName = bDLocation.mLocationSDKName;
        this.mGCJ02 = bDLocation.mGCJ02;
        this.mPoi = bDLocation.mPoi;
        this.mLocationType = bDLocation.mLocationType;
        this.isCache = bDLocation.isCache;
        this.mCountryCode = bDLocation.mCountryCode;
        this.mLocalID = bDLocation.mLocalID;
        this.mGeoNameID = bDLocation.mGeoNameID;
        this.mBdLBSResult = bDLocation.mBdLBSResult;
        this.mGeocodeSDKName = bDLocation.mGeocodeSDKName;
        this.mAoi = bDLocation.mAoi;
    }

    private void superLocation(Location location) {
        setProvider(location.getProvider());
        setTime(location.getTime());
        if (VERSION.SDK_INT >= 17) {
            setElapsedRealtimeNanos(location.getElapsedRealtimeNanos());
        }
        setLatitude(location.getLatitude());
        setLongitude(location.getLongitude());
        setAltitude(location.getAltitude());
        setSpeed(location.getSpeed());
        setBearing(location.getBearing());
        setAccuracy(location.getAccuracy());
        if (VERSION.SDK_INT >= 26) {
            setVerticalAccuracyMeters(location.getVerticalAccuracyMeters());
        }
        if (VERSION.SDK_INT >= 26) {
            setSpeedAccuracyMetersPerSecond(location.getSpeedAccuracyMetersPerSecond());
        }
        if (VERSION.SDK_INT >= 26) {
            setBearingAccuracyDegrees(location.getBearingAccuracyDegrees());
        }
    }

    public BDLocation(String str, String str2) {
        super(str);
        this.mLocationSDKName = str2;
        this.mLocationType = transProvider(str);
    }

    public BDLocation(Location location, String str) {
        super(location.getProvider());
        superLocation(location);
        this.mLatitude = location.getLatitude();
        this.mLongitude = location.getLongitude();
        this.mLocationMs = location.getTime();
        this.mThirdPartLocation = location;
        this.mLocationSDKName = str;
        this.mLocationType = transProvider(location.getProvider());
    }
}
