package com.p683ss.ttvideoengine.model;

import com.p683ss.ttvideoengine.utils.TTVideoEngineLog;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.model.VideoThumbInfo */
public class VideoThumbInfo {
    public double mDuration;
    private double mDurationVer2;
    public String mFext;
    private String mFextVer2;
    public int mImgNum;
    private int mImgNumVer2;
    public String mImgUrl;
    private String mImgUrlVer2;
    public int mImgXlen;
    private int mImgXlenVer2;
    public int mImgXsize;
    private int mImgXsizeVer2;
    public int mImgYlen;
    private int mImgYlenVer2;
    public int mImgYsize;
    private int mImgYsizeVer2;
    public double mInterval;
    private double mIntervalVer2;
    public String mUri;
    private String mUriVer2;
    private int mVersion = 1;

    public void setVersion(int i) {
        this.mVersion = i;
    }

    public double getValueDouble(int i) {
        if (this.mVersion == 1) {
            switch (i) {
                case 7:
                    return this.mDuration;
                case 8:
                    return this.mInterval;
                default:
                    return -1.0d;
            }
        } else {
            switch (i) {
                case 7:
                    return this.mDurationVer2;
                case 8:
                    return this.mIntervalVer2;
                default:
                    return -1.0d;
            }
        }
    }

    public String getValueStr(int i) {
        if (this.mVersion == 1) {
            if (i == 9) {
                return this.mFext;
            }
            switch (i) {
                case 1:
                    return this.mUri;
                case 2:
                    return this.mImgUrl;
                default:
                    return "";
            }
        } else if (i == 9) {
            return this.mFextVer2;
        } else {
            switch (i) {
                case 1:
                    return this.mUriVer2;
                case 2:
                    return this.mImgUrlVer2;
                default:
                    return "";
            }
        }
    }

    public int getValueInt(int i) {
        if (this.mVersion == 1) {
            if (i == 0) {
                return this.mImgNum;
            }
            switch (i) {
                case 3:
                    return this.mImgXsize;
                case 4:
                    return this.mImgYsize;
                case 5:
                    return this.mImgXlen;
                case 6:
                    return this.mImgYlen;
                default:
                    return -1;
            }
        } else if (i == 0) {
            return this.mImgNumVer2;
        } else {
            switch (i) {
                case 3:
                    return this.mImgXsizeVer2;
                case 4:
                    return this.mImgYsizeVer2;
                case 5:
                    return this.mImgXlenVer2;
                case 6:
                    return this.mImgYlenVer2;
                default:
                    return -1;
            }
        }
    }

    public void extractFields(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (jSONObject.has("img_url")) {
                this.mVersion = 1;
            } else if (jSONObject.has("ImgUrl")) {
                this.mVersion = 2;
            }
            if (this.mVersion == 1) {
                try {
                    this.mImgNum = jSONObject.getInt("img_num");
                    this.mUri = jSONObject.getString("uri");
                    this.mImgUrl = jSONObject.getString("img_url");
                    this.mImgXsize = jSONObject.getInt("img_x_size");
                    this.mImgYsize = jSONObject.getInt("img_y_size");
                    this.mImgXlen = jSONObject.getInt("img_x_len");
                    this.mImgYlen = jSONObject.getInt("img_y_len");
                    this.mDuration = jSONObject.getDouble("duration");
                    this.mInterval = jSONObject.getDouble("interval");
                    this.mFext = jSONObject.getString("fext");
                } catch (JSONException e) {
                    TTVideoEngineLog.m110645d(e);
                }
            } else {
                try {
                    this.mImgNumVer2 = jSONObject.getInt("ImgNum");
                    this.mUriVer2 = jSONObject.getString("Uri");
                    this.mImgUrlVer2 = jSONObject.getString("ImgUrl");
                    this.mImgXsizeVer2 = jSONObject.getInt("ImgXSize");
                    this.mImgYsizeVer2 = jSONObject.getInt("ImgYSize");
                    this.mImgXlenVer2 = jSONObject.getInt("ImgXLen");
                    this.mImgYlenVer2 = jSONObject.getInt("ImgYLen");
                    this.mDurationVer2 = jSONObject.getDouble("Duration");
                    this.mIntervalVer2 = jSONObject.getDouble("Interval");
                    this.mFextVer2 = jSONObject.getString("Fext");
                } catch (JSONException e2) {
                    TTVideoEngineLog.m110645d(e2);
                }
            }
        }
    }
}
