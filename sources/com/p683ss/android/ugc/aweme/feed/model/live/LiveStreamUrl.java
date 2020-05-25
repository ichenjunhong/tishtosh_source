package com.p683ss.android.ugc.aweme.feed.model.live;

import android.text.TextUtils;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.feed.model.live.LiveCoreSDKData.Quality;
import com.p683ss.android.ugc.aweme.utils.C47917gi;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.LiveStreamUrl */
public class LiveStreamUrl implements Serializable {
    public static final int PROVIDER_CHINANETCENTER = 2;
    public static final int PROVIDER_KINGSOFT = 1;
    private String bindNodeRtmpUrl;
    @C17952c(mo34828a = "candidate_resolution")
    public ArrayList<String> candidateResolution;
    @C17952c(mo34828a = "rtmp_pull_url_params")
    String defaultPullSdkParams;
    String defaultQualityName = null;
    @C17952c(mo34828a = "default_resolution")
    public String defaultResolution;
    @C17952c(mo34828a = "extra")
    LiveStreamUrlExtra extra;
    @C17952c(mo34828a = "flv_pull_url")
    HashMap<String, String> flvPullUrl;
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    public long f79735id;
    @C17952c(mo34828a = "id_str")
    String idStr;
    @C17952c(mo34828a = "live_core_sdk_data")
    LiveCoreSDKData liveCoreSDKData;
    private String lowestQualityName = null;
    Quality multiDefaultQuality = null;
    private Quality multiLowestQuality = null;
    private String ngbRTMPUrl;
    @C17952c(mo34828a = "provider")
    public int provider;
    @C17952c(mo34828a = "flv_pull_url_params")
    Map<String, String> pullSdkParams;
    @C17952c(mo34828a = "rtmp_push_url_params")
    String pushSdkParams;
    @C17952c(mo34828a = "push_urls")
    List<String> pushUrlList;
    final LinkedList<Quality> qualityList = new LinkedList<>();
    final LinkedHashMap<String, String> qualityMap = new LinkedHashMap<>();
    @C17952c(mo34828a = "resolution_name")
    Map<String, String> resolutionName;
    @C17952c(mo34828a = "rtmp_pull_url")
    public String rtmp_pull_url;
    @C17952c(mo34828a = "rtmp_push_url")
    public String rtmp_push_url;
    final LinkedHashMap<String, String> sdkParamsMap = new LinkedHashMap<>();

    public String getBindNodeRtmpUrl() {
        return this.bindNodeRtmpUrl;
    }

    public String getDefaultQuality() {
        return this.defaultQualityName;
    }

    public LiveStreamUrlExtra getExtra() {
        return this.extra;
    }

    public long getId() {
        return this.f79735id;
    }

    public String getIdStr() {
        return this.idStr;
    }

    public LiveCoreSDKData getLiveCoreSDKData() {
        return this.liveCoreSDKData;
    }

    public String getLowestQuality() {
        return this.lowestQualityName;
    }

    public int getProvider() {
        return this.provider;
    }

    public String getPushSdkParams() {
        return this.pushSdkParams;
    }

    public List<String> getPushUrlList() {
        return this.pushUrlList;
    }

    public List<Quality> getQualityList() {
        return this.qualityList;
    }

    public String getRtmpPullUrl() {
        return this.rtmp_pull_url;
    }

    public Set<String> getQualities() {
        return this.qualityMap.keySet();
    }

    public String getMultiStreamDefaultQualityName() {
        if (this.multiDefaultQuality == null) {
            return "";
        }
        return this.multiDefaultQuality.name;
    }

    public String getMultiStreamLowestQualityName() {
        if (this.multiLowestQuality == null) {
            return "";
        }
        return this.multiLowestQuality.name;
    }

    public String getRtmpPushUrl() {
        if (C47917gi.m103680a(this.ngbRTMPUrl)) {
            return this.rtmp_push_url;
        }
        return this.ngbRTMPUrl;
    }

    /* access modifiers changed from: 0000 */
    public boolean isPullUrlValid() {
        validatePullUrl();
        if (!this.qualityMap.isEmpty()) {
            return true;
        }
        return false;
    }

    public String getMultiStreamData() {
        if (this.liveCoreSDKData == null || this.liveCoreSDKData.getPullData() == null) {
            return null;
        }
        return this.liveCoreSDKData.getPullData().getStreamData();
    }

    public String getMultiStreamDefaultQualitySdkKey() {
        if (this.liveCoreSDKData == null || this.liveCoreSDKData.getDefaultQuality() == null) {
            return null;
        }
        return this.liveCoreSDKData.getDefaultQuality().sdkKey;
    }

    public String getPullSdkParams() {
        if (this.pullSdkParams != null) {
            return (String) this.pullSdkParams.get("ORIGIN");
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public boolean isMultiPullDataValid() {
        if (this.liveCoreSDKData == null) {
            return false;
        }
        validateMultiPullData();
        if (!this.qualityList.isEmpty()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void validateMultiPullData() {
        this.multiDefaultQuality = null;
        this.multiLowestQuality = null;
        this.qualityList.clear();
        if (this.liveCoreSDKData != null) {
            if (!C47917gi.m103681a((Collection<? extends T>) this.liveCoreSDKData.getQualityList())) {
                for (Quality quality : this.liveCoreSDKData.getQualityList()) {
                    this.qualityList.add(quality);
                    if (this.multiLowestQuality == null) {
                        this.multiLowestQuality = quality;
                    }
                }
            }
            this.multiDefaultQuality = this.liveCoreSDKData.getDefaultQuality();
            if (this.qualityList.isEmpty()) {
                this.multiLowestQuality = this.multiDefaultQuality;
                this.qualityList.add(this.multiDefaultQuality);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void validatePullUrl() {
        Object obj;
        this.qualityMap.clear();
        this.sdkParamsMap.clear();
        this.defaultQualityName = null;
        this.lowestQualityName = null;
        if (!(this.candidateResolution == null || this.resolutionName == null || this.flvPullUrl == null)) {
            Iterator it = this.candidateResolution.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                String str2 = (String) this.resolutionName.get(str);
                if (str2 != null) {
                    String str3 = (String) this.flvPullUrl.get(str);
                    if (str3 != null) {
                        if (this.pullSdkParams == null) {
                            obj = null;
                        } else {
                            obj = (String) this.pullSdkParams.get(str);
                        }
                        this.qualityMap.put(str2, str3);
                        this.sdkParamsMap.put(str2, obj);
                        if (str.equals(this.defaultResolution)) {
                            this.defaultQualityName = str2;
                        } else if (this.defaultQualityName == null) {
                            this.defaultQualityName = str2;
                        }
                        if (this.lowestQualityName == null) {
                            this.lowestQualityName = str2;
                        }
                    }
                }
            }
        }
        if (this.qualityMap.isEmpty() && !TextUtils.isEmpty(this.rtmp_pull_url)) {
            this.defaultQualityName = "default";
            this.lowestQualityName = this.defaultQualityName;
            this.qualityMap.put(this.defaultQualityName, this.rtmp_pull_url);
            this.sdkParamsMap.put(this.defaultQualityName, this.defaultPullSdkParams);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LiveStreamUrl{id=");
        sb.append(this.f79735id);
        sb.append(", idStr='");
        sb.append(this.idStr);
        sb.append('\'');
        sb.append(", provider=");
        sb.append(this.provider);
        sb.append(", rtmpPushUrl='");
        sb.append(this.rtmp_push_url);
        sb.append('\'');
        sb.append(", pushUrlList=");
        sb.append(this.pushUrlList);
        sb.append(", rtmp_pull_url='");
        sb.append(this.rtmp_pull_url);
        sb.append('\'');
        sb.append(", flvPullUrl=");
        sb.append(this.flvPullUrl);
        sb.append(", resolutionName=");
        sb.append(this.resolutionName);
        sb.append(", pullSdkParams=");
        sb.append(this.pullSdkParams);
        sb.append(", candidateResolution=");
        sb.append(this.candidateResolution);
        sb.append(", defaultResolution='");
        sb.append(this.defaultResolution);
        sb.append('\'');
        sb.append(", extra=");
        sb.append(this.extra);
        sb.append(", defaultPullSdkParams='");
        sb.append(this.defaultPullSdkParams);
        sb.append('\'');
        sb.append(", pushSdkParams='");
        sb.append(this.pushSdkParams);
        sb.append('\'');
        sb.append(", liveCoreSDKData=");
        sb.append(this.liveCoreSDKData);
        sb.append(", ngbRTMPUrl='");
        sb.append(this.ngbRTMPUrl);
        sb.append('\'');
        sb.append(", bindNodeRtmpUrl='");
        sb.append(this.bindNodeRtmpUrl);
        sb.append('\'');
        sb.append(", qualityMap=");
        sb.append(this.qualityMap);
        sb.append(", sdkParamsMap=");
        sb.append(this.sdkParamsMap);
        sb.append(", qualityList=");
        sb.append(this.qualityList);
        sb.append(", defaultQualityName='");
        sb.append(this.defaultQualityName);
        sb.append('\'');
        sb.append(", lowestQualityName='");
        sb.append(this.lowestQualityName);
        sb.append('\'');
        sb.append(", multiDefaultQuality=");
        sb.append(this.multiDefaultQuality);
        sb.append(", multiLowestQuality=");
        sb.append(this.multiLowestQuality);
        sb.append('}');
        return sb.toString();
    }

    public void setBindNodeRtmpUrl(String str) {
        this.bindNodeRtmpUrl = str;
    }

    public void setCandidateResolution(ArrayList<String> arrayList) {
        this.candidateResolution = arrayList;
    }

    public void setDefaultResolution(String str) {
        this.defaultResolution = str;
    }

    public void setExtra(LiveStreamUrlExtra liveStreamUrlExtra) {
        this.extra = liveStreamUrlExtra;
    }

    public void setFlvPullUrl(HashMap<String, String> hashMap) {
        this.flvPullUrl = hashMap;
    }

    public void setId(long j) {
        this.f79735id = j;
    }

    public void setIdStr(String str) {
        this.idStr = str;
    }

    @C17952c(mo34828a = "live_core_sdk_data")
    public void setLiveCoreSDKData(LiveCoreSDKData liveCoreSDKData2) {
        this.liveCoreSDKData = liveCoreSDKData2;
    }

    public void setNgbRTMPUrl(String str) {
        this.ngbRTMPUrl = str;
    }

    public void setProvider(int i) {
        this.provider = i;
    }

    @C17952c(mo34828a = "rtmp_push_url_params")
    public void setPushSdkParams(String str) {
        this.pushSdkParams = str;
    }

    @C17952c(mo34828a = "push_urls")
    public void setPushUrlList(List<String> list) {
        this.pushUrlList = list;
    }

    public void setResolutionName(Map<String, String> map) {
        this.resolutionName = map;
    }

    public void setRtmpPullUrl(String str) {
        this.rtmp_pull_url = str;
    }

    public void setRtmpPushUrl(String str) {
        this.rtmp_push_url = str;
    }
}
