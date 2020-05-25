package com.bytedance.geckox.model;

import com.google.gson.p1076a.C17952c;
import java.util.List;

public class UpdatePackage {
    private String accessKey;
    @C17952c(mo34828a = "channel")
    private String channel;
    @C17952c(mo34828a = "channel_index")
    private int channelIndex;
    @C17952c(mo34828a = "content")
    private Content content;
    @C17952c(mo34828a = "group_name")
    private String groupName;
    private long localVersion;
    @C17952c(mo34828a = "package_type")
    private int packageType;
    @C17952c(mo34828a = "package_version")
    private long version;

    public static class Content {
        @C17952c(mo34828a = "package")
        public Package fullPackage;
        @C17952c(mo34828a = "patch")
        public Package patch;
        @C17952c(mo34828a = "strategies")
        public Strategy strategy;
    }

    public static final class FileType {
        public static final int COMPRESSED_FILE = 0;
        public static final int MY_ARCHIVE_FILE = 2;
        public static final int UNCOMPRESSED_FILE = 1;
    }

    public static class Package {
        @C17952c(mo34828a = "id")

        /* renamed from: id */
        long f27445id;
        @C17952c(mo34828a = "size")
        long length;
        @C17952c(mo34828a = "md5")
        String md5;
        String url;
        @C17952c(mo34828a = "url_list")
        List<String> urlList;

        public Package() {
        }

        public long getId() {
            return this.f27445id;
        }

        public long getLength() {
            return this.length;
        }

        public String getMd5() {
            return this.md5;
        }

        public String getUrl() {
            return this.url;
        }

        public List<String> getUrlList() {
            return this.urlList;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Package{url='");
            sb.append(this.url);
            sb.append('\'');
            sb.append(", md5='");
            sb.append(this.md5);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }

        public void setId(int i) {
            this.f27445id = (long) i;
        }

        public void setMd5(String str) {
            this.md5 = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public void setUrlList(List<String> list) {
            this.urlList = list;
        }

        public Package(int i, List<String> list, String str) {
            this.f27445id = (long) i;
            this.urlList = list;
            this.md5 = str;
        }
    }

    public static class Strategy {
        @C17952c(mo34828a = "del_if_download_failed")
        private boolean deleteIfFail;
        @C17952c(mo34828a = "del_old_pkg_before_download")
        private boolean deleteOldPackageBeforeDownload;
        @C17952c(mo34828a = "need_unzip")
        private boolean needUnzip;

        public boolean isDeleteIfFail() {
            return this.deleteIfFail;
        }

        public boolean isDeleteOldPackageBeforeDownload() {
            return this.deleteOldPackageBeforeDownload;
        }

        public boolean isNeedUnzip() {
            return this.needUnzip;
        }

        public void setDeleteIfFail(boolean z) {
            this.deleteIfFail = z;
        }

        public void setDeleteOldPackageBeforeDownload(boolean z) {
            this.deleteOldPackageBeforeDownload = z;
        }

        public void setNeedUnzip(boolean z) {
            this.needUnzip = z;
        }

        public Strategy(int i) {
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            this.deleteIfFail = z;
        }
    }

    public UpdatePackage() {
    }

    public String getAccessKey() {
        return this.accessKey;
    }

    public String getChannel() {
        return this.channel;
    }

    public int getChannelIndex() {
        return this.channelIndex;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public long getLocalVersion() {
        return this.localVersion;
    }

    public int getPackageType() {
        return this.packageType;
    }

    public long getVersion() {
        return this.version;
    }

    public Package getFullPackage() {
        return this.content.fullPackage;
    }

    public Package getPatch() {
        return this.content.patch;
    }

    public Strategy getStrategy() {
        return this.content.strategy;
    }

    public boolean isFullUpdate() {
        if (getFullPackage() == null || getFullPackage().getUrlList().size() <= 0) {
            return false;
        }
        return true;
    }

    public boolean isPatchUpdate() {
        if (getPatch() == null || getPatch().getUrlList().size() <= 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UpdatePackage{version=");
        sb.append(this.version);
        sb.append(", channel='");
        sb.append(this.channel);
        sb.append('\'');
        sb.append(", content=");
        sb.append(this.content);
        sb.append(", packageType=");
        sb.append(this.packageType);
        sb.append('}');
        return sb.toString();
    }

    public void setAccessKey(String str) {
        this.accessKey = str;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public void setChannelIndex(int i) {
        this.channelIndex = i;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setLocalVersion(long j) {
        this.localVersion = j;
    }

    public void setVersion(long j) {
        this.version = j;
    }

    public void setFullPackage(Package packageR) {
        this.content.fullPackage = packageR;
    }

    public void setPatch(Package packageR) {
        this.content.patch = packageR;
    }

    public void setStrategy(Strategy strategy) {
        this.content.strategy = strategy;
    }

    public UpdatePackage(long j, String str, Package packageR, Package packageR2) {
        this.version = j;
        this.channel = str;
        this.content = new Content();
        this.content.fullPackage = packageR;
        this.content.patch = packageR2;
    }
}
