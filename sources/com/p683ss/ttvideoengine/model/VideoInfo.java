package com.p683ss.ttvideoengine.model;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.ttvideoengine.Resolution;
import com.p683ss.ttvideoengine.utils.TTHelper;
import com.p683ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.model.VideoInfo */
public class VideoInfo {
    public boolean isAutoDefinition = false;
    public String mBackupUrl1;
    private String mBackupUrl1Ver2 = null;
    public String mBackupUrl2;
    public String mBackupUrl3;
    public int mBitrate;
    private int mBitrateVer2;
    private String mCheckInfo;
    private String mCheckInfoVer2 = null;
    public String mCodecType;
    private String mCodecTypeVer2 = null;
    public String mDefinition;
    private String mDefinitionVer2;
    public boolean mEncrypt = false;
    public String mFileHash;
    private String mFileHashVer2;
    private String mFileId = null;
    public int mGbr;
    private String mKeyseed = null;
    private String mLogoType;
    private String mLogoTypeVer2 = null;
    public String mMainUrl;
    private String mMainUrlVer2;
    private int mMediatype = 0;
    private String mP2pVerifyUrl = null;
    public String mQuality;
    private String mQualityVer2 = null;
    private Resolution mResolution = Resolution.Standard;
    private String mResolutonStr = Resolution.Standard.toString(VideoRef.TYPE_VIDEO);
    public long mSize = 0;
    private long mSizeVer2 = 0;
    private int mSocketBuffer = 0;
    public String mSpadea = null;
    private String mSpadeaVer2 = null;
    public String mStorePath;
    public String[] mURLs;
    private String[] mURLsVer2 = null;
    private long mUrlExpiredT = 0;
    public int mVHeight;
    private int mVHeightVer2;
    public String mVType;
    private String mVTypeVer2;
    public int mVWidth;
    private int mVWidthVer2;
    private int mVersion = 1;
    public int mVideoDuration = 0;
    public int playLoadMaxStep;
    public int playLoadMinStep;
    private int preLoadIntervalVer2 = 0;
    private int preLoadMaxStepVer2;
    private int preLoadMinStepVer2;
    private int preLoadSizeVer2;
    public int preloadInterval = 0;
    public int preloadSize;
    public int useVideoProxy = 1;

    public int getMediatype() {
        return this.mMediatype;
    }

    public Resolution getResolution() {
        return this.mResolution;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public int getPreloadInterval() {
        if (this.mVersion == 2) {
            return this.preLoadIntervalVer2;
        }
        return this.preloadInterval;
    }

    public int getSocketBuffer() {
        if (this.mVersion == 2) {
            return 0;
        }
        return this.mSocketBuffer;
    }

    public boolean isUseVideoProxy() {
        if (this.mVersion != 2 && this.useVideoProxy == 1) {
            return true;
        }
        return false;
    }

    public VideoInfo copyInfo() {
        VideoInfo videoInfo = new VideoInfo(this.mKeyseed);
        videoInfo.mVersion = this.mVersion;
        videoInfo.mURLs = this.mURLs;
        videoInfo.mMainUrl = this.mMainUrl;
        videoInfo.mBackupUrl1 = this.mBackupUrl1;
        videoInfo.mBackupUrl2 = this.mBackupUrl2;
        videoInfo.mBackupUrl3 = this.mBackupUrl3;
        videoInfo.mVWidth = this.mVWidth;
        videoInfo.mVHeight = this.mVHeight;
        videoInfo.mEncrypt = this.mEncrypt;
        videoInfo.mSpadea = this.mSpadea;
        videoInfo.mGbr = this.mGbr;
        videoInfo.mStorePath = this.mStorePath;
        videoInfo.mVType = this.mVType;
        videoInfo.mCodecType = this.mCodecType;
        videoInfo.mFileHash = this.mFileHash;
        videoInfo.mDefinition = this.mDefinition;
        videoInfo.preloadSize = this.preloadSize;
        videoInfo.playLoadMinStep = this.playLoadMinStep;
        videoInfo.playLoadMaxStep = this.playLoadMaxStep;
        videoInfo.mSize = this.mSize;
        videoInfo.mVideoDuration = this.mVideoDuration;
        videoInfo.preloadInterval = this.preloadInterval;
        videoInfo.useVideoProxy = this.useVideoProxy;
        videoInfo.mSocketBuffer = this.mSocketBuffer;
        videoInfo.isAutoDefinition = this.isAutoDefinition;
        videoInfo.mQuality = this.mQuality;
        videoInfo.mLogoType = this.mLogoType;
        videoInfo.mFileHash = this.mFileHash;
        videoInfo.mCheckInfo = this.mCheckInfo;
        videoInfo.mURLsVer2 = this.mURLsVer2;
        videoInfo.mMainUrlVer2 = this.mMainUrlVer2;
        videoInfo.mVWidthVer2 = this.mVWidthVer2;
        videoInfo.mVHeightVer2 = this.mVHeightVer2;
        videoInfo.mSpadeaVer2 = this.mSpadeaVer2;
        videoInfo.mVTypeVer2 = this.mVTypeVer2;
        videoInfo.mCodecTypeVer2 = this.mCodecTypeVer2;
        videoInfo.mDefinitionVer2 = this.mDefinitionVer2;
        videoInfo.preLoadSizeVer2 = this.preLoadSizeVer2;
        videoInfo.preLoadMinStepVer2 = this.preLoadMinStepVer2;
        videoInfo.preLoadMaxStepVer2 = this.preLoadMaxStepVer2;
        videoInfo.mSizeVer2 = this.mSizeVer2;
        videoInfo.preLoadIntervalVer2 = this.preLoadIntervalVer2;
        videoInfo.mLogoTypeVer2 = this.mLogoTypeVer2;
        videoInfo.mFileId = this.mFileId;
        videoInfo.mP2pVerifyUrl = this.mP2pVerifyUrl;
        videoInfo.mMediatype = this.mMediatype;
        videoInfo.mFileHashVer2 = this.mFileHashVer2;
        videoInfo.mCheckInfoVer2 = this.mCheckInfoVer2;
        return videoInfo;
    }

    public void setMediatype(int i) {
        this.mMediatype = i;
    }

    public void setResolution(Resolution resolution) {
        this.mResolution = resolution;
    }

    public void setVersion(int i) {
        this.mVersion = i;
    }

    public Boolean getValueBool(int i) {
        if (this.mVersion != 1) {
            return Boolean.valueOf(false);
        }
        if (i != 4) {
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(this.mEncrypt);
    }

    public long getValueLong(int i) {
        if (this.mVersion == 2) {
            if (i != 12) {
                return -1;
            }
            return this.mSizeVer2;
        } else if (i == 12) {
            return this.mSize;
        } else {
            if (i != 30) {
                return -1;
            }
            return this.mUrlExpiredT;
        }
    }

    public String[] getValueStrArr(int i) {
        if (this.mVersion == 2) {
            if (i != 16) {
                return new String[0];
            }
            return this.mURLsVer2;
        } else if (i != 16) {
            return new String[0];
        } else {
            return this.mURLs;
        }
    }

    public VideoInfo(String str) {
        this.mKeyseed = str;
    }

    public void setResolutionBaseMap(HashMap<String, Resolution> hashMap) {
        if (hashMap != null && hashMap.size() > 0) {
            String str = null;
            if (this.mMediatype == VideoRef.TYPE_AUDIO) {
                str = getValueStr(18);
                if (TextUtils.isEmpty(str)) {
                    str = Resolution.Standard.toString(this.mMediatype);
                }
            } else if (this.mMediatype == VideoRef.TYPE_VIDEO) {
                str = getValueStr(7);
                if (TextUtils.isEmpty(str)) {
                    str = Resolution.Standard.toString(this.mMediatype);
                }
            }
            this.mResolution = (Resolution) hashMap.get(str);
            if (this.mResolution == null) {
                this.mResolution = Resolution.Standard;
            }
        }
    }

    public int getValueInt(int i) {
        if (this.mVersion == 2) {
            if (i == 13) {
                return this.preLoadIntervalVer2;
            }
            switch (i) {
                case 1:
                    return this.mVWidthVer2;
                case 2:
                    return this.mVHeightVer2;
                case 3:
                    return this.mBitrateVer2;
                default:
                    switch (i) {
                        case 9:
                            return this.preLoadSizeVer2;
                        case 10:
                            return this.preLoadMinStepVer2;
                        case 11:
                            return this.preLoadMaxStepVer2;
                        default:
                            return -1;
                    }
            }
        } else if (i == 13) {
            return this.preloadInterval;
        } else {
            if (i == 27) {
                return this.mVideoDuration;
            }
            switch (i) {
                case 1:
                    return this.mVWidth;
                case 2:
                    return this.mVHeight;
                case 3:
                    return this.mBitrate;
                default:
                    switch (i) {
                        case 9:
                            return this.preloadSize;
                        case 10:
                            return this.playLoadMinStep;
                        case 11:
                            return this.playLoadMaxStep;
                        default:
                            switch (i) {
                                case 20:
                                    return this.mGbr;
                                case 21:
                                    return this.useVideoProxy;
                                case 22:
                                    return this.mSocketBuffer;
                                default:
                                    return -1;
                            }
                    }
            }
        }
    }

    public String getValueStr(int i) {
        if (i == 26) {
            return this.mResolutonStr;
        }
        if (i == 28) {
            return this.mFileId;
        }
        if (i == 29) {
            return this.mP2pVerifyUrl;
        }
        if (this.mVersion == 2) {
            if (i == 0) {
                return this.mMainUrlVer2;
            }
            if (i == 15) {
                return this.mFileHashVer2;
            }
            if (i == 31) {
                return this.mCheckInfoVer2;
            }
            switch (i) {
                case 5:
                    return this.mSpadeaVer2;
                case 6:
                    return this.mVTypeVer2;
                case 7:
                    return this.mDefinitionVer2;
                case 8:
                    return this.mCodecTypeVer2;
                default:
                    switch (i) {
                        case 17:
                            return this.mBackupUrl1Ver2;
                        case 18:
                            return this.mQualityVer2;
                        case 19:
                            return this.mLogoTypeVer2;
                        default:
                            return "";
                    }
            }
        } else if (i == 0) {
            return this.mMainUrl;
        } else {
            if (i == 15) {
                return this.mFileHash;
            }
            if (i == 31) {
                return this.mCheckInfo;
            }
            switch (i) {
                case 5:
                    return this.mSpadea;
                case 6:
                    return this.mVType;
                case 7:
                    return this.mDefinition;
                case 8:
                    return this.mCodecType;
                default:
                    switch (i) {
                        case 17:
                            return this.mBackupUrl1;
                        case 18:
                            return this.mQuality;
                        case 19:
                            return this.mLogoType;
                        default:
                            switch (i) {
                                case 23:
                                    return this.mBackupUrl2;
                                case 24:
                                    return this.mBackupUrl3;
                                case 25:
                                    return this.mStorePath;
                                default:
                                    return "";
                            }
                    }
            }
        }
    }

    public void extractFields(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (!TextUtils.isEmpty(jSONObject.optString("main_url"))) {
                this.mVersion = 1;
            } else if (!TextUtils.isEmpty(jSONObject.optString("MainPlayUrl"))) {
                this.mVersion = 2;
            }
            if (this.mVersion == 1) {
                ArrayList arrayList = new ArrayList();
                this.mMainUrl = jSONObject.optString("main_url");
                this.mBackupUrl1 = jSONObject.optString("backup_url_1");
                this.mBackupUrl2 = jSONObject.optString("backup_url_2");
                this.mBackupUrl3 = jSONObject.optString("backup_url_3");
                if (!TextUtils.isEmpty(this.mMainUrl)) {
                    String base64Decode = TTHelper.base64Decode(this.mMainUrl, this.mKeyseed);
                    arrayList.add(base64Decode);
                    try {
                        jSONObject.put("main_url", base64Decode);
                    } catch (Exception e) {
                        TTVideoEngineLog.m110645d(e);
                    }
                }
                if (!TextUtils.isEmpty(this.mBackupUrl1)) {
                    String base64Decode2 = TTHelper.base64Decode(this.mBackupUrl1, this.mKeyseed);
                    arrayList.add(base64Decode2);
                    try {
                        jSONObject.put("backup_url_1", base64Decode2);
                    } catch (Exception e2) {
                        TTVideoEngineLog.m110645d(e2);
                    }
                }
                if (!TextUtils.isEmpty(this.mBackupUrl2)) {
                    arrayList.add(TTHelper.base64Decode(this.mBackupUrl2, this.mKeyseed));
                }
                if (!TextUtils.isEmpty(this.mBackupUrl3)) {
                    arrayList.add(TTHelper.base64Decode(this.mBackupUrl3, this.mKeyseed));
                }
                this.mURLs = new String[arrayList.size()];
                arrayList.toArray(this.mURLs);
                try {
                    this.mVWidth = Integer.valueOf(jSONObject.optString("vwidth")).intValue();
                } catch (NumberFormatException unused) {
                    this.mVWidth = 0;
                }
                try {
                    this.mVHeight = Integer.valueOf(jSONObject.optString("vheight")).intValue();
                } catch (NumberFormatException unused2) {
                    this.mVHeight = 0;
                }
                try {
                    this.mBitrate = jSONObject.optInt("bitrate");
                } catch (Exception unused3) {
                    this.mBitrate = 0;
                }
                this.mEncrypt = jSONObject.optBoolean("encrypt");
                this.mSpadea = jSONObject.optString("spade_a");
                this.mGbr = jSONObject.optInt("gbr");
                this.mStorePath = jSONObject.optString("storePath");
                this.mVType = jSONObject.optString("vtype");
                this.mDefinition = jSONObject.optString("definition");
                this.mCodecType = jSONObject.optString("codec_type");
                try {
                    this.mSize = jSONObject.optLong("size", 0);
                } catch (Exception unused4) {
                    this.mSize = 0;
                }
                this.preloadSize = jSONObject.optInt("preload_size");
                this.playLoadMinStep = jSONObject.optInt("play_load_min_step");
                this.playLoadMaxStep = jSONObject.optInt("play_load_max_step");
                this.preloadInterval = jSONObject.optInt("preload_interval", -1);
                this.useVideoProxy = jSONObject.optInt("use_video_proxy", 1);
                this.mSocketBuffer = jSONObject.optInt("socket_buffer", 0);
                this.mFileHash = jSONObject.optString("file_hash");
                this.mQuality = jSONObject.optString("quality");
                this.mLogoType = jSONObject.optString("logo_type");
                this.mFileId = jSONObject.optString("file_id");
                this.mP2pVerifyUrl = TTHelper.base64Decode(jSONObject.optString("p2p_verify_url"));
                this.mUrlExpiredT = jSONObject.optLong("url_expire");
                this.mCheckInfo = jSONObject.optString("check_info");
                return;
            }
            if (this.mVersion == 2) {
                this.mBitrateVer2 = jSONObject.optInt("Bitrate");
                this.mFileHashVer2 = jSONObject.optString("FileHash");
                this.mSizeVer2 = jSONObject.optLong("Size");
                this.mVHeightVer2 = jSONObject.optInt("Height");
                this.mVWidthVer2 = jSONObject.optInt("Width");
                this.mVTypeVer2 = jSONObject.optString("Format");
                this.mCodecTypeVer2 = jSONObject.optString("Codec");
                this.mLogoTypeVer2 = jSONObject.optString("Logo");
                this.mDefinitionVer2 = jSONObject.optString("Definition");
                this.mQualityVer2 = jSONObject.optString("Quality");
                this.mSpadeaVer2 = jSONObject.optString("PlayAuth");
                this.mMainUrlVer2 = jSONObject.optString("MainPlayUrl");
                this.mBackupUrl1Ver2 = jSONObject.optString("BackupPlayUrl");
                String optString = jSONObject.optString("MediaType");
                if (!TextUtils.isEmpty(optString)) {
                    if (optString.equals("video")) {
                        this.mMediatype = VideoRef.TYPE_VIDEO;
                    } else if (optString.equals("audio")) {
                        this.mMediatype = VideoRef.TYPE_AUDIO;
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                if (!TextUtils.isEmpty(this.mMainUrlVer2)) {
                    arrayList2.add(this.mMainUrlVer2);
                }
                if (!TextUtils.isEmpty(this.mBackupUrl1Ver2)) {
                    arrayList2.add(this.mBackupUrl1Ver2);
                }
                this.mURLsVer2 = new String[arrayList2.size()];
                arrayList2.toArray(this.mURLsVer2);
                this.preLoadIntervalVer2 = jSONObject.optInt("PreloadInterval", -1);
                this.preLoadMinStepVer2 = jSONObject.optInt("PreloadMinStep");
                this.preLoadMaxStepVer2 = jSONObject.optInt("PreloadMaxStep");
                this.preLoadSizeVer2 = jSONObject.optInt("PreloadSize");
                this.mFileId = jSONObject.optString("FileID");
                this.mP2pVerifyUrl = jSONObject.optString("P2pVerifyURL");
                this.mCheckInfoVer2 = jSONObject.optString("CheckInfo");
            }
        }
    }

    public void setValue(int i, boolean z) {
        if (i == 4) {
            this.mEncrypt = z;
        }
    }

    public void setValue(int i, long j) {
        if (i == 12) {
            this.mSize = j;
            this.mSizeVer2 = j;
        }
    }

    public void setValue(int i, String[] strArr) {
        if (i == 16) {
            this.mURLs = strArr;
            this.mURLsVer2 = strArr;
        }
    }

    public void setValue(int i, int i2) {
        if (i == 13) {
            this.preloadInterval = i2;
            this.preLoadIntervalVer2 = i2;
        } else if (i != 27) {
            switch (i) {
                case 1:
                    this.mVWidth = i2;
                    this.mVWidthVer2 = i2;
                    return;
                case 2:
                    this.mVHeight = i2;
                    this.mVHeightVer2 = i2;
                    return;
                case 3:
                    this.mBitrate = i2;
                    this.mBitrateVer2 = i2;
                    return;
                default:
                    switch (i) {
                        case 9:
                            this.preloadSize = i2;
                            this.preLoadSizeVer2 = i2;
                            return;
                        case 10:
                            this.playLoadMinStep = i2;
                            return;
                        case 11:
                            this.playLoadMaxStep = i2;
                            return;
                        default:
                            switch (i) {
                                case 20:
                                    this.mGbr = i2;
                                    return;
                                case 21:
                                    this.useVideoProxy = i2;
                                    return;
                                case 22:
                                    this.mSocketBuffer = i2;
                                    return;
                                default:
                                    return;
                            }
                    }
            }
        } else {
            this.mVideoDuration = i2;
        }
    }

    public void setValue(int i, String str) {
        if (i == 0) {
            this.mMainUrlVer2 = str;
            this.mMainUrl = str;
        } else if (i != 15) {
            switch (i) {
                case 5:
                    this.mSpadeaVer2 = str;
                    this.mSpadea = str;
                    return;
                case 6:
                    this.mVTypeVer2 = str;
                    this.mVType = str;
                    return;
                case 7:
                    this.mDefinitionVer2 = str;
                    this.mDefinition = str;
                    return;
                case 8:
                    this.mCodecTypeVer2 = str;
                    this.mCodecType = str;
                    return;
                default:
                    switch (i) {
                        case 17:
                            this.mBackupUrl1Ver2 = str;
                            this.mBackupUrl1 = str;
                            return;
                        case 18:
                            this.mQualityVer2 = str;
                            this.mQuality = str;
                            return;
                        case 19:
                            this.mLogoTypeVer2 = str;
                            this.mLogoType = str;
                            return;
                        default:
                            switch (i) {
                                case 23:
                                    this.mBackupUrl2 = str;
                                    return;
                                case 24:
                                    this.mBackupUrl3 = str;
                                    return;
                                case 25:
                                    this.mStorePath = str;
                                    return;
                                case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                                    this.mResolutonStr = str;
                                    return;
                                default:
                                    return;
                            }
                    }
            }
        } else {
            this.mFileHashVer2 = str;
            this.mFileHash = str;
        }
    }
}
