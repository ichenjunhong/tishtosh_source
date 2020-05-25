package com.bytedance.android.livesdkapi.depend.model.live;

import com.google.gson.p1076a.C17952c;
import java.util.List;

public class LiveCoreSDKData {
    @C17952c(mo34828a = "pull_data")
    PullData pullData;

    public static class Options {
        @C17952c(mo34828a = "default_quality")
        Quality defaultQuality;
        @C17952c(mo34828a = "qualities")
        List<Quality> qualityList;

        public Quality getDefaultQuality() {
            return this.defaultQuality;
        }

        public List<Quality> getQualityList() {
            return this.qualityList;
        }

        public void setDefaultQuality(Quality quality) {
            this.defaultQuality = quality;
        }

        public void setQualityList(List<Quality> list) {
            this.qualityList = list;
        }
    }

    public static class PullData {
        @C17952c(mo34828a = "options")
        Options options;
        @C17952c(mo34828a = "stream_data")
        String streamData;

        public Options getOptions() {
            return this.options;
        }

        public String getStreamData() {
            return this.streamData;
        }

        public void setOptions(Options options2) {
            this.options = options2;
        }

        public void setStreamData(String str) {
            this.streamData = str;
        }
    }

    public static class Quality {
        @C17952c(mo34828a = "name")
        public String name;
        @C17952c(mo34828a = "sdk_key")
        public String sdkKey;
    }

    public PullData getPullData() {
        return this.pullData;
    }

    public Quality getDefaultQuality() {
        if (this.pullData == null || this.pullData.getOptions() == null) {
            return null;
        }
        return this.pullData.getOptions().defaultQuality;
    }

    public List<Quality> getQualityList() {
        if (this.pullData == null || this.pullData.getOptions() == null) {
            return null;
        }
        return this.pullData.getOptions().getQualityList();
    }

    public void setPullData(PullData pullData2) {
        this.pullData = pullData2;
    }
}
