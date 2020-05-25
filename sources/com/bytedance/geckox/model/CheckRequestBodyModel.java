package com.bytedance.geckox.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31483a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckRequestBodyModel {
    @C17952c(mo34828a = "common")
    private Common common;
    @C17952c(mo34828a = "custom")
    private Map<String, Map<String, Object>> custom;
    @C17952c(mo34828a = "deployment")
    private Map<String, List<ChannelInfo>> deployment;
    @C17952c(mo34828a = "deployments")
    private Map<String, Object> deployments;
    @C17952c(mo34828a = "local")
    private Map<String, Map<String, LocalChannel>> local;

    public static class Channel {
        @C17952c(mo34828a = "c")
        String channelName;
        @C17952c(mo34828a = "l_v")
        public String localVersion;

        public Channel(String str) {
            this.channelName = str;
        }
    }

    public static class ChannelInfo {
        @C17952c(mo34828a = "channel")
        private String channel;
        @C17952c(mo34828a = "local_version")
        private long localVersion;

        public ChannelInfo(String str, long j) {
            this.channel = str;
            this.localVersion = j;
        }
    }

    public static class Channels {
        @C17952c(mo34828a = "channels")
        public List<Channel> channels = new ArrayList();
    }

    public static class Group {
        @C17952c(mo34828a = "group_name")
        public String groupName;
        @C17952c(mo34828a = "target_channels")
        public List<TargetChannel> targetChannels;
    }

    public enum GroupType {
        NORMAL(C31483a.f82385b),
        HIGHPRIORITY("high_priority");
        
        private String value;

        public final String getValue() {
            return this.value;
        }

        private GroupType(String str) {
            this.value = str;
        }
    }

    public static class LocalChannel {
        @C17952c(mo34828a = "l_v")
        public Long localVersion;
    }

    public static class ProcessorParams {
        @C17952c(mo34828a = "domain")
        public String domain;
    }

    public static class TargetChannel {
        @C17952c(mo34828a = "c")
        public String channelName;
        @C17952c(mo34828a = "t_v")
        public Long targetVersion;

        public TargetChannel() {
        }

        public TargetChannel(String str) {
            this.channelName = str;
        }

        public TargetChannel(String str, Long l) {
            this.channelName = str;
            this.targetVersion = l;
        }
    }

    public void setCommon(Common common2) {
        this.common = common2;
    }

    public void setCustom(Map<String, Map<String, Object>> map) {
        this.custom = map;
    }

    public void setDeployments(Map<String, Object> map) {
        this.deployments = map;
    }

    public void setLocal(Map<String, Map<String, LocalChannel>> map) {
        this.local = map;
    }

    public void putChannelInfo(String str, List<ChannelInfo> list) {
        if (this.deployment == null) {
            this.deployment = new HashMap();
        }
        this.deployment.put(str, list);
    }
}
