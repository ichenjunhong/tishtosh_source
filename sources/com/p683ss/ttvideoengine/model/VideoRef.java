package com.p683ss.ttvideoengine.model;

import android.text.TextUtils;
import com.p683ss.ttvideoengine.Resolution;
import com.p683ss.ttvideoengine.utils.TTHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.model.VideoRef */
public class VideoRef {
    public static int TYPE_AUDIO = 1;
    public static int TYPE_VIDEO;
    private VideoAdaptiveInfo mAdptiveInfoVer2;
    private Resolution[] mAllResolutions;
    private ArrayList<Resolution> mAllResolutionsArray = new ArrayList<>();
    private HashMap<String, Resolution> mAudioResolutionMap = TTHelper.defaultAudioResolutionMap();
    public String mAutoDefinition;
    public String mBackupURL;
    private String[] mCodecArray = null;
    private boolean mCodecHasH264 = false;
    private boolean mCodecHasH265 = false;
    private JSONObject mDnsInfo;
    private long mDnsTime;
    private String mDynamicType = "";
    public List<VideoInfo> mDynamicVideoList;
    public boolean mEnableSSL;
    public String mFallbackApi;
    private String mFormat = "mp4";
    private boolean mFormatHasDASH = false;
    private boolean mFormatHasMP4 = false;
    private boolean mFormatHasMPD = false;
    public String mKeyseed;
    public String mMainURL;
    public String mMediaType;
    public int mMediaTypeInt = TYPE_VIDEO;
    private int mMediaTypeIntVer2 = TYPE_VIDEO;
    private String mMediaTypeVer2;
    private String mPosterUrlVer2;
    private String mRefString = "";
    public VideoSeekTs mSeekTs;
    private VideoSeekTs mSeekTsVer2;
    public int mStatus;
    private int mStatusVer2;
    public List<VideoThumbInfo> mThumbInfoList;
    private List<VideoThumbInfo> mThumbInfoListVer2;
    private int mTotalCountVer2;
    private boolean mURLEncrypted = false;
    public String[] mURLs;
    public String mUserId;
    public String mValidate;
    private int mVersion = 1;
    public int mVideoDuration;
    private int mVideoDurationVer2;
    public String mVideoId;
    private String mVideoIdVer2;
    public List<VideoInfo> mVideoList;
    private List<VideoInfo> mVideoListVer2 = null;
    public String mVideoName;
    private HashMap<String, Resolution> mVideoResolutionMap = TTHelper.defaultVideoResolutionMap();

    public JSONObject getDnsInfo() {
        return this.mDnsInfo;
    }

    public Resolution[] getSupportResolutions() {
        return this.mAllResolutions;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public VideoSeekTs getSeekTs() {
        if (this.mVersion == 2) {
            return this.mSeekTsVer2;
        }
        return this.mSeekTs;
    }

    public List<VideoThumbInfo> getThumbInfoList() {
        if (this.mVersion == 2) {
            return this.mThumbInfoListVer2;
        }
        return this.mThumbInfoList;
    }

    public List<VideoInfo> getVideoInfoList() {
        if (this.mVersion == 2) {
            return this.mVideoListVer2;
        }
        List<VideoInfo> list = null;
        if (this.mVideoList != null && this.mVideoList.size() > 0) {
            list = this.mVideoList;
        }
        if (this.mDynamicVideoList != null && this.mDynamicVideoList.size() > 0) {
            list = this.mDynamicVideoList;
        }
        return list;
    }

    public String[] getCodecs() {
        if (this.mCodecArray == null) {
            List<VideoInfo> videoInfoList = getVideoInfoList();
            ArrayList arrayList = new ArrayList();
            if (videoInfoList != null && videoInfoList.size() > 0) {
                for (VideoInfo videoInfo : videoInfoList) {
                    if (videoInfo != null) {
                        String valueStr = videoInfo.getValueStr(8);
                        if (!TextUtils.isEmpty(valueStr) && !arrayList.contains(valueStr)) {
                            arrayList.add(valueStr);
                        }
                    }
                }
            }
            this.mCodecArray = new String[arrayList.size()];
            arrayList.toArray(this.mCodecArray);
        }
        return this.mCodecArray;
    }

    public void setVersion(int i) {
        this.mVersion = i;
    }

    public long getValueLong(int i) {
        if (i != 216) {
            return 0;
        }
        return this.mDnsTime;
    }

    public String resolutionToString(Resolution resolution) {
        return resolutionToString(resolution, getValueInt(7));
    }

    public List<VideoInfo> getValueList(int i) {
        if (this.mVersion == 2) {
            if (i != 5) {
                return null;
            }
            return this.mVideoListVer2;
        } else if (i == 5) {
            return this.mVideoList;
        } else {
            if (i != 210) {
                return null;
            }
            return this.mDynamicVideoList;
        }
    }

    public String getResolutionStr(VideoInfo videoInfo) {
        if (videoInfo == null) {
            return resolutionToString(Resolution.Standard);
        }
        int mediatype = videoInfo.getMediatype();
        if (mediatype == TYPE_AUDIO) {
            String valueStr = videoInfo.getValueStr(18);
            if (valueStr != null) {
                return valueStr;
            }
            return resolutionToString(Resolution.Standard, mediatype);
        } else if (mediatype != TYPE_VIDEO) {
            return resolutionToString(Resolution.Standard);
        } else {
            String valueStr2 = videoInfo.getValueStr(7);
            if (valueStr2 != null) {
                return valueStr2;
            }
            return resolutionToString(Resolution.Standard, mediatype);
        }
    }

    public int getValueInt(int i) {
        if (this.mVersion == 2) {
            if (i == 7) {
                return this.mMediaTypeIntVer2;
            }
            if (i == 209) {
                return this.mTotalCountVer2;
            }
            switch (i) {
                case 3:
                    return this.mVideoDurationVer2;
                case 4:
                    return this.mStatusVer2;
                default:
                    return 0;
            }
        } else if (i == 7) {
            return this.mMediaTypeInt;
        } else {
            switch (i) {
                case 3:
                    return this.mVideoDuration;
                case 4:
                    return this.mStatus;
                default:
                    return 0;
            }
        }
    }

    public Boolean getValueBool(int i) {
        if (this.mVersion == 1 && i == 106) {
            return Boolean.valueOf(this.mEnableSSL);
        }
        switch (i) {
            case 203:
                return Boolean.valueOf(this.mCodecHasH264);
            case 204:
                return Boolean.valueOf(this.mCodecHasH265);
            case 205:
                return Boolean.valueOf(this.mFormatHasDASH);
            case 206:
                return Boolean.valueOf(this.mFormatHasMP4);
            case 207:
                return Boolean.valueOf(this.mFormatHasMPD);
            default:
                return Boolean.valueOf(false);
        }
    }

    public String getValueStr(int i) {
        if (i == 211) {
            return this.mFormat;
        }
        if (i == 215) {
            return this.mDynamicType;
        }
        if (i == 8) {
            return this.mRefString;
        }
        if (this.mVersion != 2) {
            switch (i) {
                case 1:
                    return this.mUserId;
                case 2:
                    return this.mVideoId;
                case 7:
                    return this.mMediaType;
                case 104:
                    return this.mVideoName;
                case 105:
                    return this.mValidate;
                case 107:
                    return this.mAutoDefinition;
                case 108:
                    return this.mMainURL;
                case 109:
                    return this.mBackupURL;
                case 217:
                    return this.mFallbackApi;
                case 218:
                    return this.mKeyseed;
                default:
                    return "";
            }
        } else if (i == 2) {
            return this.mVideoIdVer2;
        } else {
            if (i == 7) {
                return this.mMediaTypeVer2;
            }
            if (i != 201) {
                return "";
            }
            return this.mPosterUrlVer2;
        }
    }

    public VideoInfo getVideoInfoWithClarity(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List videoInfoList = getVideoInfoList();
        if (videoInfoList == null || videoInfoList.size() == 0) {
            return null;
        }
        for (int i = 0; i < videoInfoList.size(); i++) {
            if (videoInfoList.get(i) != null && getResolutionStr((VideoInfo) videoInfoList.get(i)).equals(str)) {
                return (VideoInfo) videoInfoList.get(i);
            }
        }
        return (VideoInfo) videoInfoList.get(0);
    }

    public void setUpResolution(HashMap<String, Resolution> hashMap) {
        int valueInt = getValueInt(7);
        if (hashMap == null || hashMap.size() <= 0) {
            if (valueInt == TYPE_AUDIO) {
                hashMap = this.mAudioResolutionMap;
            } else {
                hashMap = this.mVideoResolutionMap;
            }
        } else if (valueInt == TYPE_AUDIO) {
            this.mAudioResolutionMap = hashMap;
        } else {
            this.mVideoResolutionMap = hashMap;
        }
        List videoInfoList = getVideoInfoList();
        if (videoInfoList != null) {
            for (int i = 0; i < videoInfoList.size(); i++) {
                VideoInfo videoInfo = (VideoInfo) videoInfoList.get(i);
                if (videoInfo != null && videoInfo.getMediatype() == valueInt) {
                    videoInfo.setResolutionBaseMap(hashMap);
                    Resolution resolution = videoInfo.getResolution();
                    if (!this.mAllResolutionsArray.contains(resolution)) {
                        this.mAllResolutionsArray.add(resolution);
                    }
                }
            }
        }
        this.mAllResolutions = new Resolution[this.mAllResolutionsArray.size()];
        this.mAllResolutionsArray.toArray(this.mAllResolutions);
    }

    public VideoInfo getVideoInfo(Map<Integer, String> map) {
        List<VideoInfo> videoInfoList = getVideoInfoList();
        if (videoInfoList == null || videoInfoList.size() == 0) {
            return null;
        }
        for (VideoInfo videoInfo : videoInfoList) {
            if (videoInfo != null) {
                if (map == null || map.size() == 0) {
                    return videoInfo;
                }
                boolean z = false;
                Iterator it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Entry entry = (Entry) it.next();
                    int intValue = ((Integer) entry.getKey()).intValue();
                    if (videoInfo.getValueStr(intValue).equals((String) entry.getValue())) {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return videoInfo;
                }
            }
        }
        return null;
    }

    public void extractFields(JSONObject jSONObject) throws Throwable {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        if (jSONObject != null) {
            JSONArray optJSONArray = jSONObject.optJSONArray("PlayInfoList");
            if ((optJSONArray != null && optJSONArray.length() > 0) || !TextUtils.isEmpty(jSONObject.optString("VideoID"))) {
                this.mVersion = 2;
            } else if (!TextUtils.isEmpty(jSONObject.optString("video_id"))) {
                this.mVersion = 1;
            }
            int i = 0;
            if (this.mVersion == 1) {
                JSONObject optJSONObject = jSONObject.optJSONObject("video_list");
                this.mVideoDuration = jSONObject.optInt("video_duration");
                this.mStatus = jSONObject.optInt("status");
                this.mValidate = jSONObject.optString("validate");
                this.mAutoDefinition = jSONObject.optString("auto_definition");
                this.mEnableSSL = jSONObject.optBoolean("enable_ssl");
                this.mUserId = jSONObject.optString("user_id");
                this.mVideoId = jSONObject.optString("video_id");
                this.mVideoName = jSONObject.optString("video_name");
                this.mMediaType = jSONObject.optString("media_type");
                if (TextUtils.isEmpty(this.mKeyseed)) {
                    this.mKeyseed = jSONObject.optString("key_seed");
                }
                this.mFallbackApi = jSONObject.optString("fallback_api");
                if (this.mMediaType.equals("video")) {
                    this.mMediaTypeInt = TYPE_VIDEO;
                } else if (this.mMediaType.equals("audio")) {
                    this.mMediaTypeInt = TYPE_AUDIO;
                }
                if (optJSONObject != null) {
                    try {
                        this.mVideoList = new ArrayList();
                        if (optJSONObject.has("video_1")) {
                            JSONObject jSONObject2 = optJSONObject.getJSONObject("video_1");
                            int i2 = this.mMediaTypeInt;
                            if (this.mURLEncrypted) {
                                str13 = this.mKeyseed;
                            } else {
                                str13 = null;
                            }
                            VideoInfo _generateVideoInfo = _generateVideoInfo(jSONObject2, i2, str13);
                            _generateVideoInfo.mVideoDuration = this.mVideoDuration;
                            this.mVideoList.add(_generateVideoInfo);
                        }
                        if (optJSONObject.has("video_2")) {
                            JSONObject jSONObject3 = optJSONObject.getJSONObject("video_2");
                            int i3 = this.mMediaTypeInt;
                            if (this.mURLEncrypted) {
                                str12 = this.mKeyseed;
                            } else {
                                str12 = null;
                            }
                            VideoInfo _generateVideoInfo2 = _generateVideoInfo(jSONObject3, i3, str12);
                            _generateVideoInfo2.mVideoDuration = this.mVideoDuration;
                            this.mVideoList.add(_generateVideoInfo2);
                        }
                        if (optJSONObject.has("video_3")) {
                            JSONObject jSONObject4 = optJSONObject.getJSONObject("video_3");
                            int i4 = this.mMediaTypeInt;
                            if (this.mURLEncrypted) {
                                str11 = this.mKeyseed;
                            } else {
                                str11 = null;
                            }
                            VideoInfo _generateVideoInfo3 = _generateVideoInfo(jSONObject4, i4, str11);
                            _generateVideoInfo3.mVideoDuration = this.mVideoDuration;
                            this.mVideoList.add(_generateVideoInfo3);
                        }
                        if (optJSONObject.has("video_4")) {
                            JSONObject jSONObject5 = optJSONObject.getJSONObject("video_4");
                            int i5 = this.mMediaTypeInt;
                            if (this.mURLEncrypted) {
                                str10 = this.mKeyseed;
                            } else {
                                str10 = null;
                            }
                            VideoInfo _generateVideoInfo4 = _generateVideoInfo(jSONObject5, i5, str10);
                            _generateVideoInfo4.mVideoDuration = this.mVideoDuration;
                            this.mVideoList.add(_generateVideoInfo4);
                        }
                        if (optJSONObject.has("video_5")) {
                            JSONObject jSONObject6 = optJSONObject.getJSONObject("video_5");
                            int i6 = this.mMediaTypeInt;
                            if (this.mURLEncrypted) {
                                str9 = this.mKeyseed;
                            } else {
                                str9 = null;
                            }
                            VideoInfo _generateVideoInfo5 = _generateVideoInfo(jSONObject6, i6, str9);
                            _generateVideoInfo5.mVideoDuration = this.mVideoDuration;
                            this.mVideoList.add(_generateVideoInfo5);
                        }
                        if (optJSONObject.has("video_6")) {
                            JSONObject jSONObject7 = optJSONObject.getJSONObject("video_6");
                            int i7 = this.mMediaTypeInt;
                            if (this.mURLEncrypted) {
                                str8 = this.mKeyseed;
                            } else {
                                str8 = null;
                            }
                            VideoInfo _generateVideoInfo6 = _generateVideoInfo(jSONObject7, i7, str8);
                            _generateVideoInfo6.mVideoDuration = this.mVideoDuration;
                            this.mVideoList.add(_generateVideoInfo6);
                        }
                        if (optJSONObject.has("video_7")) {
                            JSONObject jSONObject8 = optJSONObject.getJSONObject("video_7");
                            int i8 = this.mMediaTypeInt;
                            if (this.mURLEncrypted) {
                                str7 = this.mKeyseed;
                            } else {
                                str7 = null;
                            }
                            VideoInfo _generateVideoInfo7 = _generateVideoInfo(jSONObject8, i8, str7);
                            _generateVideoInfo7.mVideoDuration = this.mVideoDuration;
                            this.mVideoList.add(_generateVideoInfo7);
                        }
                        if (optJSONObject.has("video_8")) {
                            JSONObject jSONObject9 = optJSONObject.getJSONObject("video_8");
                            int i9 = this.mMediaTypeInt;
                            if (this.mURLEncrypted) {
                                str6 = this.mKeyseed;
                            } else {
                                str6 = null;
                            }
                            VideoInfo _generateVideoInfo8 = _generateVideoInfo(jSONObject9, i9, str6);
                            _generateVideoInfo8.mVideoDuration = this.mVideoDuration;
                            this.mVideoList.add(_generateVideoInfo8);
                        }
                    } catch (Exception e) {
                        throw e;
                    } catch (Exception e2) {
                        throw e2;
                    } catch (Exception e3) {
                        throw e3;
                    } catch (JSONException e4) {
                        throw e4;
                    }
                }
                this.mDnsInfo = jSONObject.optJSONObject("dns_info");
                this.mDnsTime = jSONObject.optLong("dns_time");
                JSONObject optJSONObject2 = jSONObject.optJSONObject("dynamic_video");
                if (optJSONObject2 != null) {
                    String optString = optJSONObject2.optString("main_url");
                    if (!TextUtils.isEmpty(optString)) {
                        if (this.mURLEncrypted) {
                            str5 = this.mKeyseed;
                        } else {
                            str5 = null;
                        }
                        this.mMainURL = TTHelper.base64Decode(optString, str5);
                    }
                    String optString2 = optJSONObject2.optString("backup_url_1");
                    if (!TextUtils.isEmpty(optString2)) {
                        if (this.mURLEncrypted) {
                            str4 = this.mKeyseed;
                        } else {
                            str4 = null;
                        }
                        this.mBackupURL = TTHelper.base64Decode(optString2, str4);
                    }
                    this.mDynamicType = optJSONObject2.optString("dynamic_type");
                    this.mDynamicVideoList = new ArrayList();
                    JSONArray optJSONArray2 = optJSONObject2.optJSONArray("dynamic_video_list");
                    if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                        for (int i10 = 0; i10 < optJSONArray2.length(); i10++) {
                            JSONObject jSONObject10 = optJSONArray2.getJSONObject(i10);
                            int i11 = TYPE_VIDEO;
                            if (this.mURLEncrypted) {
                                str3 = this.mKeyseed;
                            } else {
                                str3 = null;
                            }
                            this.mDynamicVideoList.add(_generateVideoInfo(jSONObject10, i11, str3));
                        }
                    }
                    JSONArray optJSONArray3 = optJSONObject2.optJSONArray("dynamic_audio_list");
                    if (optJSONArray3 != null && optJSONArray3.length() > 0) {
                        for (int i12 = 0; i12 < optJSONArray3.length(); i12++) {
                            JSONObject jSONObject11 = optJSONArray3.getJSONObject(i12);
                            int i13 = TYPE_AUDIO;
                            if (this.mURLEncrypted) {
                                str2 = this.mKeyseed;
                            } else {
                                str2 = null;
                            }
                            this.mDynamicVideoList.add(_generateVideoInfo(jSONObject11, i13, str2));
                        }
                    }
                    if (this.mDynamicVideoList.size() > 0) {
                        ArrayList arrayList = new ArrayList();
                        if (!TextUtils.isEmpty(this.mMainURL)) {
                            arrayList.add(this.mMainURL);
                        }
                        if (!TextUtils.isEmpty(this.mBackupURL)) {
                            arrayList.add(this.mBackupURL);
                        }
                        this.mURLs = new String[arrayList.size()];
                        arrayList.toArray(this.mURLs);
                    }
                }
                if (jSONObject.has("seek_ts")) {
                    this.mSeekTs = new VideoSeekTs();
                    this.mSeekTs.extractFields(jSONObject.getJSONObject("seek_ts"));
                }
                if (jSONObject.has("big_thumbs")) {
                    JSONArray optJSONArray4 = jSONObject.optJSONArray("big_thumbs");
                    if (optJSONArray4 != null && optJSONArray4.length() > 0) {
                        this.mThumbInfoList = new ArrayList();
                        while (i < optJSONArray4.length()) {
                            VideoThumbInfo videoThumbInfo = new VideoThumbInfo();
                            videoThumbInfo.setVersion(this.mVersion);
                            videoThumbInfo.extractFields(optJSONArray4.getJSONObject(i));
                            this.mThumbInfoList.add(videoThumbInfo);
                            i++;
                        }
                    }
                }
            } else if (this.mVersion == 2) {
                try {
                    this.mStatusVer2 = jSONObject.optInt("Status");
                    this.mVideoIdVer2 = jSONObject.optString("VideoID");
                    this.mPosterUrlVer2 = jSONObject.optString("CoverUrl");
                    this.mVideoDurationVer2 = jSONObject.optInt("Duration");
                    this.mMediaTypeVer2 = jSONObject.optString("MediaType");
                    this.mTotalCountVer2 = jSONObject.optInt("TotalCount");
                    if (this.mMediaTypeVer2.equals("video")) {
                        this.mMediaTypeIntVer2 = TYPE_VIDEO;
                    } else if (this.mMediaTypeVer2.equals("audio")) {
                        this.mMediaTypeIntVer2 = TYPE_AUDIO;
                    }
                    if (jSONObject.has("Seekts")) {
                        this.mSeekTsVer2 = new VideoSeekTs();
                        this.mSeekTsVer2.extractFields(jSONObject.getJSONObject("Seekts"));
                    }
                    if (jSONObject.has("BigThumbs")) {
                        JSONArray optJSONArray5 = jSONObject.optJSONArray("BigThumbs");
                        if (optJSONArray5 != null && optJSONArray5.length() > 0) {
                            this.mThumbInfoListVer2 = new ArrayList();
                            for (int i14 = 0; i14 < optJSONArray5.length(); i14++) {
                                try {
                                    VideoThumbInfo videoThumbInfo2 = new VideoThumbInfo();
                                    videoThumbInfo2.setVersion(this.mVersion);
                                    videoThumbInfo2.extractFields(optJSONArray5.getJSONObject(i14));
                                    this.mThumbInfoListVer2.add(videoThumbInfo2);
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                    if (optJSONArray != null) {
                        if (optJSONArray.length() > 0) {
                            this.mVideoListVer2 = new ArrayList();
                            while (i < optJSONArray.length()) {
                                JSONObject jSONObject12 = optJSONArray.getJSONObject(i);
                                int i15 = this.mMediaTypeIntVer2;
                                if (this.mURLEncrypted) {
                                    str = this.mKeyseed;
                                } else {
                                    str = null;
                                }
                                this.mVideoListVer2.add(_generateVideoInfo(jSONObject12, i15, str));
                                i++;
                            }
                        }
                    }
                    if (jSONObject.has("AdaptiveInfo")) {
                        JSONObject optJSONObject3 = jSONObject.optJSONObject("AdaptiveInfo");
                        if (optJSONObject3 != null) {
                            this.mAdptiveInfoVer2 = new VideoAdaptiveInfo();
                            this.mAdptiveInfoVer2.extractFields(optJSONObject3);
                            this.mDynamicType = this.mAdptiveInfoVer2.getValueStr(215);
                            this.mMainURL = this.mAdptiveInfoVer2.getValueStr(108);
                            this.mBackupURL = this.mAdptiveInfoVer2.getValueStr(109);
                            ArrayList arrayList2 = new ArrayList();
                            if (!TextUtils.isEmpty(this.mMainURL)) {
                                arrayList2.add(this.mMainURL);
                            }
                            if (!TextUtils.isEmpty(this.mBackupURL)) {
                                arrayList2.add(this.mBackupURL);
                            }
                            this.mURLs = new String[arrayList2.size()];
                            arrayList2.toArray(this.mURLs);
                        }
                    }
                } catch (Exception e5) {
                    throw e5;
                }
            }
            List videoInfoList = getVideoInfoList();
            if (videoInfoList != null && videoInfoList.size() > 0) {
                Iterator it = videoInfoList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    VideoInfo videoInfo = (VideoInfo) it.next();
                    if (videoInfo.getMediatype() == TYPE_VIDEO) {
                        int i16 = TYPE_VIDEO;
                        this.mMediaTypeIntVer2 = i16;
                        this.mMediaTypeInt = i16;
                        break;
                    } else if (videoInfo.getMediatype() == TYPE_AUDIO) {
                        int i17 = TYPE_AUDIO;
                        this.mMediaTypeIntVer2 = i17;
                        this.mMediaTypeInt = i17;
                    }
                }
            }
            this.mRefString = jSONObject.toString();
            this.mAllResolutions = new Resolution[this.mAllResolutionsArray.size()];
            this.mAllResolutionsArray.toArray(this.mAllResolutions);
        }
    }

    public void setValue(int i, boolean z) {
        if (i == 106) {
            this.mEnableSSL = z;
        }
    }

    public void setValueBool(int i, boolean z) {
        if (i == 219) {
            this.mURLEncrypted = z;
        }
    }

    public void setValueStr(int i, String str) {
        if (i == 218) {
            this.mKeyseed = str;
        }
    }

    public VideoInfo getVideoInfo(Resolution resolution, Map<Integer, String> map) {
        return getVideoInfo(resolution, getValueInt(7), map);
    }

    public void setValue(int i, VideoSeekTs videoSeekTs) {
        if (i == 214) {
            this.mSeekTs = videoSeekTs;
            this.mSeekTsVer2 = videoSeekTs;
        }
    }

    public String[] allVideoURLs(Resolution resolution, Map<Integer, String> map) {
        if (this.mURLs != null && this.mURLs.length > 0) {
            return this.mURLs;
        }
        VideoInfo videoInfo = getVideoInfo(resolution, map);
        if (videoInfo == null) {
            return new String[0];
        }
        return videoInfo.getValueStrArr(16);
    }

    public void setValue(int i, List list) {
        if (i == 5) {
            this.mVideoList = list;
            this.mVideoListVer2 = list;
        } else if (i == 210) {
            this.mDynamicVideoList = list;
        } else if (i == 212) {
            this.mThumbInfoListVer2 = list;
            this.mThumbInfoList = list;
        }
    }

    public String resolutionToString(Resolution resolution, int i) {
        HashMap<String, Resolution> hashMap;
        if (i == TYPE_AUDIO) {
            hashMap = this.mAudioResolutionMap;
        } else {
            hashMap = this.mVideoResolutionMap;
        }
        String str = null;
        Iterator it = hashMap.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            if (((Resolution) hashMap.get(str2)).getIndex() == resolution.getIndex()) {
                str = str2;
                break;
            }
        }
        if (TextUtils.isEmpty(str)) {
            return resolution.toString(i);
        }
        return str;
    }

    public void setValue(int i, int i2) {
        if (i == 7) {
            this.mMediaTypeInt = i2;
            this.mMediaTypeIntVer2 = i2;
        } else if (i != 209) {
            switch (i) {
                case 3:
                    this.mVideoDuration = i2;
                    this.mVideoDurationVer2 = i2;
                    return;
                case 4:
                    this.mStatus = i2;
                    this.mStatusVer2 = i2;
                    return;
                default:
                    return;
            }
        } else {
            this.mTotalCountVer2 = i2;
        }
    }

    public void setValue(int i, String str) {
        switch (i) {
            case 1:
                this.mUserId = str;
                return;
            case 2:
                this.mVideoId = str;
                this.mVideoIdVer2 = str;
                return;
            case 7:
                this.mMediaTypeVer2 = str;
                this.mMediaType = str;
                return;
            case 104:
                this.mVideoName = str;
                return;
            case 105:
                this.mValidate = str;
                return;
            case 107:
                this.mAutoDefinition = str;
                return;
            case 108:
                this.mMainURL = str;
                return;
            case 109:
                this.mBackupURL = str;
                return;
            case 201:
                this.mPosterUrlVer2 = str;
                return;
            default:
                return;
        }
    }

    public void setValue(int i, String[] strArr) {
        if (i == 213) {
            this.mURLs = strArr;
        }
    }

    public VideoInfo getVideoInfo(Resolution resolution, int i, Map<Integer, String> map) {
        List<VideoInfo> videoInfoList = getVideoInfoList();
        if (videoInfoList == null || videoInfoList.size() == 0) {
            return null;
        }
        for (VideoInfo videoInfo : videoInfoList) {
            if (videoInfo != null && resolution == videoInfo.getResolution() && i == videoInfo.getMediatype()) {
                if (map == null || map.size() == 0) {
                    return videoInfo;
                }
                boolean z = true;
                Iterator it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Entry entry = (Entry) it.next();
                    int intValue = ((Integer) entry.getKey()).intValue();
                    if (!videoInfo.getValueStr(intValue).equals((String) entry.getValue())) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    return videoInfo;
                }
            }
        }
        return null;
    }

    private VideoInfo _generateVideoInfo(JSONObject jSONObject, int i, String str) {
        String str2;
        VideoInfo videoInfo = new VideoInfo(str);
        videoInfo.setVersion(this.mVersion);
        videoInfo.setMediatype(i);
        videoInfo.extractFields(jSONObject);
        Resolution resolution = Resolution.Standard;
        int mediatype = videoInfo.getMediatype();
        if (mediatype == TYPE_AUDIO) {
            str2 = videoInfo.getValueStr(18);
        } else if (mediatype == TYPE_VIDEO) {
            str2 = videoInfo.getValueStr(7);
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (str2.equals(Resolution.L_Standard.toString(mediatype))) {
                resolution = Resolution.L_Standard;
            } else if (str2.equals(Resolution.Standard.toString(mediatype))) {
                resolution = Resolution.Standard;
            } else if (str2.equals(Resolution.High.toString(mediatype))) {
                resolution = Resolution.High;
            } else if (str2.equals(Resolution.H_High.toString(mediatype))) {
                resolution = Resolution.H_High;
            } else if (str2.equals(Resolution.SuperHigh.toString(mediatype))) {
                resolution = Resolution.SuperHigh;
            } else if (str2.equals(Resolution.ExtremelyHigh.toString(mediatype))) {
                resolution = Resolution.ExtremelyHigh;
            } else if (str2.equals(Resolution.TwoK.toString(mediatype))) {
                resolution = Resolution.TwoK;
            } else if (str2.equals(Resolution.FourK.toString(mediatype))) {
                resolution = Resolution.FourK;
            } else if (str2.equals(Resolution.HDR.toString(mediatype))) {
                resolution = Resolution.HDR;
            }
        }
        videoInfo.setResolution(resolution);
        videoInfo.setValue(26, str2);
        String valueStr = videoInfo.getValueStr(6);
        if (!TextUtils.isEmpty(valueStr)) {
            this.mFormat = valueStr;
        }
        if (!this.mFormatHasMPD && this.mFormat.equals("mpd")) {
            this.mFormatHasMPD = true;
        } else if (!this.mFormatHasDASH && this.mFormat.equals("dash")) {
            this.mFormatHasDASH = true;
        } else if (!this.mFormatHasMP4 && this.mFormat.equals("mp4")) {
            this.mFormatHasMP4 = true;
        }
        String valueStr2 = videoInfo.getValueStr(8);
        if (!this.mCodecHasH264 && valueStr2.equals("h264")) {
            this.mCodecHasH264 = true;
        } else if (!this.mCodecHasH265 && valueStr2.equals("h265")) {
            this.mCodecHasH265 = true;
        }
        return videoInfo;
    }
}
