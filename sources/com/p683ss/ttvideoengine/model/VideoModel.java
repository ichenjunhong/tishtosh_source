package com.p683ss.ttvideoengine.model;

import android.text.TextUtils;
import com.p683ss.ttvideoengine.Resolution;
import com.p683ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.model.VideoModel */
public class VideoModel {
    public LiveVideoRef liveVideoRef;
    private JSONObject mJsonInfo;
    private String mKeyseed;
    private HashMap<String, Resolution> mResolutionMap;
    private int mSourceType = 1;
    private boolean mURLEncrypted;
    private int mVersion = 1;
    public List<VideoAdRef> videoAdRefList;
    public VideoRef videoRef;
    private VideoRef vodVideoRef;

    public JSONObject getJsonInfo() {
        return this.mJsonInfo;
    }

    public int getSourceType() {
        return this.mSourceType;
    }

    public VideoRef getVideoRef() {
        return this.vodVideoRef;
    }

    public String[] getCodecs() {
        if (this.vodVideoRef != null) {
            return this.vodVideoRef.getCodecs();
        }
        return new String[0];
    }

    public JSONObject getDnsInfo() {
        if (this.vodVideoRef != null) {
            return this.vodVideoRef.getDnsInfo();
        }
        return null;
    }

    public String getDynamicType() {
        if (this.vodVideoRef != null) {
            return this.vodVideoRef.getValueStr(215);
        }
        return "";
    }

    public Resolution[] getSupportResolutions() {
        if (this.vodVideoRef != null) {
            return this.vodVideoRef.getSupportResolutions();
        }
        return new Resolution[0];
    }

    public List<VideoThumbInfo> getThumbInfoList() {
        if (this.vodVideoRef != null) {
            return this.vodVideoRef.mThumbInfoList;
        }
        return null;
    }

    public String getVType() {
        if (this.vodVideoRef != null) {
            return this.vodVideoRef.getValueStr(211);
        }
        return "mp4";
    }

    public VideoSeekTs getVideoSeekTS() {
        if (this.vodVideoRef != null) {
            return this.vodVideoRef.mSeekTs;
        }
        return null;
    }

    public boolean isLiveSource() {
        if (this.vodVideoRef != null || this.liveVideoRef == null) {
            return false;
        }
        return true;
    }

    public List<VideoInfo> getVideoInfoList() {
        if (this.vodVideoRef == null) {
            return new ArrayList();
        }
        return this.vodVideoRef.getVideoInfoList();
    }

    public String getSpadea() {
        if (this.vodVideoRef != null) {
            List<VideoInfo> videoInfoList = this.vodVideoRef.getVideoInfoList();
            if (!(videoInfoList == null || videoInfoList.size() == 0)) {
                for (VideoInfo valueStr : videoInfoList) {
                    String valueStr2 = valueStr.getValueStr(5);
                    if (!TextUtils.isEmpty(valueStr2)) {
                        return valueStr2;
                    }
                }
            }
        }
        return null;
    }

    public boolean isDashSource() {
        if (this.vodVideoRef == null) {
            return false;
        }
        if (this.vodVideoRef.getValueBool(205).booleanValue() || this.vodVideoRef.getValueBool(207).booleanValue()) {
            return true;
        }
        return false;
    }

    public String getCodec() {
        if (this.vodVideoRef != null) {
            if (this.mVersion == 2) {
                for (String equals : this.vodVideoRef.getCodecs()) {
                    if (equals.equals("h265")) {
                        return "h265";
                    }
                }
                return "h264";
            }
            List videoInfoList = this.vodVideoRef.getVideoInfoList();
            if (!(videoInfoList == null || videoInfoList.size() == 0)) {
                VideoInfo videoInfo = (VideoInfo) videoInfoList.get(0);
                if (videoInfo != null) {
                    String str = videoInfo.mCodecType;
                    if (!TextUtils.isEmpty(str)) {
                        return str;
                    }
                }
            }
        }
        return "h264";
    }

    public void setVideoRef(VideoRef videoRef2) {
        this.vodVideoRef = videoRef2;
        setUpResolution(this.mResolutionMap);
    }

    public VideoInfo getVideoInfo(Resolution resolution) {
        if (this.vodVideoRef != null) {
            return this.vodVideoRef.getVideoInfo(resolution, null);
        }
        return null;
    }

    public int getVideoRefInt(int i) {
        if (this.vodVideoRef != null) {
            return this.vodVideoRef.getValueInt(i);
        }
        return -1;
    }

    public long getVideoRefLong(int i) {
        if (this.vodVideoRef != null) {
            return this.vodVideoRef.getValueLong(i);
        }
        return 0;
    }

    public String getVideoRefStr(int i) {
        if (this.vodVideoRef != null) {
            return this.vodVideoRef.getValueStr(i);
        }
        return "";
    }

    public void setUpResolution(HashMap<String, Resolution> hashMap) {
        this.mResolutionMap = hashMap;
        if (this.vodVideoRef != null) {
            this.vodVideoRef.setUpResolution(hashMap);
        }
    }

    public String[] allVideoURLs(Resolution resolution) {
        if (this.vodVideoRef != null) {
            return this.vodVideoRef.allVideoURLs(resolution, null);
        }
        if (this.liveVideoRef != null) {
            LiveVideoInfo liveVideoInfo = this.liveVideoRef.getLiveVideoInfo();
            if (liveVideoInfo != null) {
                return liveVideoInfo.mURLs;
            }
        }
        return new String[0];
    }

    public int getPreloadInterval(Resolution resolution) {
        if (this.vodVideoRef != null) {
            VideoInfo videoInfo = this.vodVideoRef.getVideoInfo(resolution, null);
            if (videoInfo != null) {
                return videoInfo.getValueInt(13);
            }
        }
        return 0;
    }

    public boolean getVideoRefBool(int i) {
        if (this.vodVideoRef != null) {
            return this.vodVideoRef.getValueBool(i).booleanValue();
        }
        return false;
    }

    public void extractFields(JSONObject jSONObject) throws Throwable {
        if (jSONObject != null) {
            try {
                this.mJsonInfo = new JSONObject(jSONObject.toString());
            } catch (Throwable unused) {
                TTVideoEngineLog.m110646e("VideoModel", "generate mJsonInfo error");
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("video_info");
            if (optJSONObject != null && optJSONObject.length() > 0) {
                this.mVersion = 1;
                this.videoRef = new VideoRef();
                this.videoRef.setVersion(this.mVersion);
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("data");
                this.videoRef.setValueBool(219, this.mURLEncrypted);
                this.videoRef.setValueStr(218, this.mKeyseed);
                this.videoRef.extractFields(optJSONObject2);
                this.vodVideoRef = this.videoRef;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("video_ad_list");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                this.videoAdRefList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    try {
                        VideoAdRef videoAdRef = new VideoAdRef();
                        videoAdRef.extractFields(optJSONArray.getJSONObject(i));
                        this.videoAdRefList.add(videoAdRef);
                    } catch (Exception unused2) {
                    }
                }
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("live_info");
            if (optJSONObject3 != null) {
                this.mSourceType = 0;
                this.liveVideoRef = new LiveVideoRef();
                this.liveVideoRef.extractFields(optJSONObject3.optJSONObject("data"));
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("PlayInfoList");
            if ((optJSONArray2 != null && optJSONArray2.length() > 0) || !TextUtils.isEmpty(jSONObject.optString("VideoID"))) {
                this.mVersion = 2;
                this.vodVideoRef = new VideoRef();
                this.vodVideoRef.setVersion(this.mVersion);
                this.vodVideoRef.extractFields(jSONObject);
            }
            setUpResolution(this.mResolutionMap);
        }
    }

    public VideoInfo getVideoInfo(Map<Integer, String> map) {
        if (this.vodVideoRef != null) {
            return this.vodVideoRef.getVideoInfo(map);
        }
        return null;
    }

    public void setVideoRefBool(int i, boolean z) {
        if (i == 219) {
            this.mURLEncrypted = z;
        }
    }

    public void setVideoRefStr(int i, String str) {
        if (this.vodVideoRef != null) {
            this.vodVideoRef.setValueStr(i, str);
        }
        if (i == 218) {
            this.mKeyseed = str;
        }
    }

    public String[] allVideoURLs(Resolution resolution, Map<Integer, String> map) {
        if (this.vodVideoRef != null) {
            return this.vodVideoRef.allVideoURLs(resolution, map);
        }
        if (this.liveVideoRef != null) {
            LiveVideoInfo liveVideoInfo = this.liveVideoRef.getLiveVideoInfo();
            if (liveVideoInfo != null) {
                return liveVideoInfo.mURLs;
            }
        }
        return new String[0];
    }

    public int getPreloadInterval(Resolution resolution, Map<Integer, String> map) {
        if (this.vodVideoRef != null) {
            VideoInfo videoInfo = this.vodVideoRef.getVideoInfo(resolution, map);
            if (videoInfo != null) {
                videoInfo.getValueInt(13);
            }
        }
        return 0;
    }

    public VideoInfo getVideoInfo(Resolution resolution, Map<Integer, String> map) {
        if (this.vodVideoRef != null) {
            return this.vodVideoRef.getVideoInfo(resolution, map);
        }
        return null;
    }

    public VideoInfo getVideoInfo(Resolution resolution, boolean z) {
        if (this.vodVideoRef != null) {
            return getVideoInfo(resolution, this.vodVideoRef.getValueInt(7), null, z);
        }
        return null;
    }

    public VideoInfo getVideoInfo(Resolution resolution, int i, Map<Integer, String> map) {
        if (this.vodVideoRef != null) {
            return this.vodVideoRef.getVideoInfo(resolution, i, map);
        }
        return null;
    }

    public VideoInfo getVideoInfo(Resolution resolution, int i, boolean z) {
        if (this.vodVideoRef != null) {
            return getVideoInfo(resolution, i, null, z);
        }
        return null;
    }

    public VideoInfo getVideoInfo(Resolution resolution, Map<Integer, String> map, boolean z) {
        if (this.vodVideoRef != null) {
            return getVideoInfo(resolution, this.vodVideoRef.getValueInt(7), map, z);
        }
        return null;
    }

    public VideoInfo getVideoInfo(Resolution resolution, int i, Map<Integer, String> map, boolean z) {
        VideoInfo videoInfo = getVideoInfo(resolution, i, map);
        if (!z) {
            return videoInfo;
        }
        Resolution[] allResolutions = Resolution.getAllResolutions();
        if (allResolutions.length <= 0) {
            return videoInfo;
        }
        int length = allResolutions.length - 1;
        if (resolution != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= allResolutions.length) {
                    break;
                } else if (allResolutions[i2].getIndex() == resolution.getIndex()) {
                    length = i2;
                    break;
                } else {
                    i2++;
                }
            }
        }
        int i3 = length;
        while (videoInfo == null) {
            videoInfo = getVideoInfo(allResolutions[i3], i, null);
            if (videoInfo != null) {
                break;
            }
            i3 = ((i3 + allResolutions.length) - 1) % allResolutions.length;
            if (i3 == length) {
                break;
            }
        }
        return videoInfo;
    }
}
