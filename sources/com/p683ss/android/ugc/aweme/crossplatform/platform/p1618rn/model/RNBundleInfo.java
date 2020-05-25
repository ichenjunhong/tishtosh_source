package com.p683ss.android.ugc.aweme.crossplatform.platform.p1618rn.model;

import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.model.RNBundleInfo */
public class RNBundleInfo {
    @C17952c(mo34828a = "base_version")
    String baseVersion;
    @C17952c(mo34828a = "modules")
    List<String> modules;
    @C17952c(mo34828a = "version")
    String version;

    public String getBaseVersion() {
        return this.baseVersion;
    }

    public List<String> getModules() {
        return this.modules;
    }

    public String getVersion() {
        return this.version;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\nmodules: ");
        sb.append(this.modules);
        sb.append("\nversion: ");
        sb.append(this.version);
        sb.append("\nbase_version: ");
        sb.append(this.baseVersion);
        return sb.toString();
    }

    public void setBaseVersion(String str) {
        this.baseVersion = str;
    }

    public void setModules(List<String> list) {
        this.modules = list;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}
