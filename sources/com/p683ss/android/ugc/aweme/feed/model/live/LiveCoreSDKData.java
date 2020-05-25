package com.p683ss.android.ugc.aweme.feed.model.live;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.LiveCoreSDKData */
public class LiveCoreSDKData implements Serializable {
    @C17952c(mo34828a = "pull_data")
    PullData pullData;

    /* renamed from: com.ss.android.ugc.aweme.feed.model.live.LiveCoreSDKData$Options */
    public static class Options implements Serializable {
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

        public String toString() {
            StringBuilder sb = new StringBuilder("Options{defaultQuality=");
            sb.append(this.defaultQuality);
            sb.append(", qualityList=");
            sb.append(this.qualityList);
            sb.append('}');
            return sb.toString();
        }

        public void setDefaultQuality(Quality quality) {
            this.defaultQuality = quality;
        }

        public void setQualityList(List<Quality> list) {
            this.qualityList = list;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.model.live.LiveCoreSDKData$PullData */
    public static class PullData implements Serializable {
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

        public String toString() {
            StringBuilder sb = new StringBuilder("PullData{options=");
            sb.append(this.options);
            sb.append(", streamData='");
            sb.append(this.streamData);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }

        public void setOptions(Options options2) {
            this.options = options2;
        }

        public void setStreamData(String str) {
            this.streamData = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.model.live.LiveCoreSDKData$Quality */
    public static class Quality implements Serializable {
        @C17952c(mo34828a = "name")
        public String name;
        @C17952c(mo34828a = "sdk_key")
        public String sdkKey;

        public String toString() {
            StringBuilder sb = new StringBuilder("Quality{name='");
            sb.append(this.name);
            sb.append('\'');
            sb.append(", sdkKey='");
            sb.append(this.sdkKey);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }
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

    public String toString() {
        StringBuilder sb = new StringBuilder("LiveCoreSDKData{pullData=");
        sb.append(this.pullData);
        sb.append('}');
        return sb.toString();
    }

    public void setPullData(PullData pullData2) {
        this.pullData = pullData2;
    }
}
