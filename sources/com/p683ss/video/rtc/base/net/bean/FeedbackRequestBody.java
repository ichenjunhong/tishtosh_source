package com.p683ss.video.rtc.base.net.bean;

import com.google.gson.C18085o;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.ss.video.rtc.base.net.bean.FeedbackRequestBody */
public class FeedbackRequestBody {
    @C17952c(mo34828a = "clientInfo")
    public ClientInfo clientInfo;
    @C17952c(mo34828a = "feedback")
    public C18085o feedback;
    @C17952c(mo34828a = "rtcInfo")
    public RtcInfo rtcInfo;
    @C17952c(mo34828a = "satisfied")
    public boolean satisfied;

    /* renamed from: com.ss.video.rtc.base.net.bean.FeedbackRequestBody$ClientInfo */
    public static class ClientInfo {
        @C17952c(mo34828a = "carrierName")
        public String carrierName;
        @C17952c(mo34828a = "deviceId")
        public String deviceId;
        @C17952c(mo34828a = "deviceModel")
        public String deviceModel;
        @C17952c(mo34828a = "manufacturer")
        public String manufacturer;
        @C17952c(mo34828a = "networkType")
        public String networkType;
        @C17952c(mo34828a = "osType")
        public String osType;
        @C17952c(mo34828a = "osVersion")
        public String osVersion;

        public ClientInfo setCarrierName(String str) {
            this.carrierName = str;
            return this;
        }

        public ClientInfo setDevice(String str) {
            this.deviceModel = str;
            return this;
        }

        public ClientInfo setDeviceId(String str) {
            this.deviceId = str;
            return this;
        }

        public ClientInfo setManufacturerInfo(String str) {
            this.manufacturer = str;
            return this;
        }

        public ClientInfo setNetworkType(String str) {
            this.networkType = str;
            return this;
        }

        public ClientInfo setOsType(String str) {
            this.osType = str;
            return this;
        }

        public ClientInfo setOsVersion(String str) {
            this.osVersion = str;
            return this;
        }
    }

    /* renamed from: com.ss.video.rtc.base.net.bean.FeedbackRequestBody$RtcInfo */
    public static class RtcInfo {
        @C17952c(mo34828a = "appId")
        public String appId;
        @C17952c(mo34828a = "roomId")
        public String roomId;
        @C17952c(mo34828a = "rtcProvider")
        public String rtcProvider;
        @C17952c(mo34828a = "sdkVersion")
        public String sdkVersion;
        @C17952c(mo34828a = "timestamp")
        public String timestamp;
        @C17952c(mo34828a = "userId")
        public String userId;

        public RtcInfo setAppId(String str) {
            this.appId = str;
            return this;
        }

        public RtcInfo setRoomId(String str) {
            this.roomId = str;
            return this;
        }

        public RtcInfo setSdkProvider(String str) {
            this.rtcProvider = str;
            return this;
        }

        public RtcInfo setSdkVersion(String str) {
            this.sdkVersion = str;
            return this;
        }

        public RtcInfo setTimestamp(String str) {
            this.timestamp = str;
            return this;
        }

        public RtcInfo setUserId(String str) {
            this.userId = str;
            return this;
        }
    }
}
