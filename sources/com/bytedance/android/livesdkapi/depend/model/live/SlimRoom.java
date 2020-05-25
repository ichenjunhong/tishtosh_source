package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.livesdkapi.p458l.p459a.C8839e;
import com.google.gson.p1076a.C17952c;

public class SlimRoom {
    @C17952c(mo34828a = "client_version")
    String clientVersion;
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    long f23772id;
    @C17952c(mo34828a = "live_type_screenshot")
    public boolean isScreenshot;
    @C17952c(mo34828a = "live_type_third_party")
    public boolean isThirdParty;
    @C17952c(mo34828a = "common_label_list")
    String labels;
    @C17952c(mo34828a = "layout")
    public long layout;
    @C17952c(mo34828a = "live_type_audio")
    boolean liveTypeAudio;
    @C17952c(mo34828a = "orientation")
    int orientation;
    @C17952c(mo34828a = "owner_user_id")
    long ownerUserId;
    @C17952c(mo34828a = "os_type")
    int platform;
    @C17952c(mo34828a = "private_info")
    String privateInfo;
    @C17952c(mo34828a = "stream_url")
    StreamUrl streamUrl;

    public String getClientVersion() {
        return this.clientVersion;
    }

    public long getId() {
        return this.f23772id;
    }

    public String getLabels() {
        return this.labels;
    }

    public long getLayout() {
        return this.layout;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public long getOwnerUserId() {
        return this.ownerUserId;
    }

    public int getPlatform() {
        return this.platform;
    }

    public String getPrivateInfo() {
        return this.privateInfo;
    }

    public StreamUrl getStreamUrl() {
        return this.streamUrl;
    }

    public String buildPullUrl() {
        if (this.streamUrl == null) {
            return null;
        }
        return buildPullUrl(this.streamUrl.f23790r);
    }

    public String getSdkParams() {
        if (this.streamUrl == null) {
            return null;
        }
        return getSdkParams(this.streamUrl.f23790r);
    }

    public C8725y getStreamUrlExtra() {
        if (this.streamUrl == null) {
            return null;
        }
        return this.streamUrl.f23784l;
    }

    public C8725y getStreamUrlExtraSafely() {
        C8725y streamUrlExtra = getStreamUrlExtra();
        if (streamUrlExtra == null) {
            return new C8725y();
        }
        return streamUrlExtra;
    }

    public void init() {
        if (this.streamUrl != null) {
            this.streamUrl.mo15382b();
            if (this.streamUrl.f23787o != null) {
                this.streamUrl.mo15383c();
            }
        }
    }

    public String getMultiStreamData() {
        if (this.streamUrl == null || this.streamUrl.f23787o == null || this.streamUrl.f23787o.getPullData() == null) {
            return null;
        }
        return this.streamUrl.f23787o.getPullData().getStreamData();
    }

    public String getMultiStreamDefaultQualitySdkKey() {
        if (this.streamUrl == null || this.streamUrl.f23787o == null || this.streamUrl.f23787o.getDefaultQuality() == null) {
            return null;
        }
        return this.streamUrl.f23787o.getDefaultQuality().sdkKey;
    }

    public C8710m getStreamType() {
        if (this.layout == 1) {
            return C8710m.OFFICIAL_ACTIVITY;
        }
        if (this.isScreenshot) {
            return C8710m.SCREEN_RECORD;
        }
        if (this.isThirdParty) {
            return C8710m.THIRD_PARTY;
        }
        if (this.liveTypeAudio) {
            return C8710m.AUDIO;
        }
        return C8710m.VIDEO;
    }

    public void setClientVersion(String str) {
        this.clientVersion = str;
    }

    public void setId(long j) {
        this.f23772id = j;
    }

    public void setLabels(String str) {
        this.labels = str;
    }

    public void setLayout(long j) {
        this.layout = j;
    }

    public void setOrientation(int i) {
        this.orientation = i;
    }

    public void setOwnerUserId(long j) {
        this.ownerUserId = j;
    }

    public void setPlatform(int i) {
        this.platform = i;
    }

    public void setPrivateInfo(String str) {
        this.privateInfo = str;
    }

    public void setStreamUrl(StreamUrl streamUrl2) {
        this.streamUrl = streamUrl2;
    }

    public String getSdkParams(String str) {
        if (this.streamUrl == null) {
            return null;
        }
        return (String) this.streamUrl.sdkParamsMap.get(str);
    }

    public String buildPullUrl(String str) {
        if (this.streamUrl == null) {
            return null;
        }
        String str2 = (String) this.streamUrl.qualityMap.get(str);
        if (str2 == null) {
            return null;
        }
        C8839e eVar = new C8839e(str2);
        eVar.mo15825a("anchor_device_platform", this.platform);
        eVar.mo15827a("anchor_version", this.clientVersion);
        eVar.mo15826a("room_id", this.f23772id);
        eVar.mo15826a("anchor_id", this.ownerUserId);
        return eVar.mo15824a();
    }
}
