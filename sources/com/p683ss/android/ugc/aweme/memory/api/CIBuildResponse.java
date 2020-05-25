package com.p683ss.android.ugc.aweme.memory.api;

import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.memory.api.CIBuildResponse */
public final class CIBuildResponse {
    @C17952c(mo34828a = "app")
    private String app = "";
    @C17952c(mo34828a = "app_id")
    private String appId = "";
    @C17952c(mo34828a = "build_type")
    private String buildType = "";
    @C17952c(mo34828a = "channel")
    private String channel = "";
    @C17952c(mo34828a = "commit_id")
    private String commitId = "";
    @C17952c(mo34828a = "dependencies_url")
    private String dependenciesUrl = "";
    @C17952c(mo34828a = "is_release")
    private final boolean isRelease;
    @C17952c(mo34828a = "jenkins_url")
    private String jenkinsUrl = "";
    @C17952c(mo34828a = "mapping_url")
    private String mappingUrl = "";
    @C17952c(mo34828a = "merge_request_id")
    private String mergeRequestId = "";
    @C17952c(mo34828a = "package_size")
    private long packageSize;
    @C17952c(mo34828a = "package_url")
    private String packageUrl = "";
    @C17952c(mo34828a = "previous_root_node_commit_id")
    private String previousRootNodeCommitId = "";
    @C17952c(mo34828a = "update_version")
    private String updateVersion = "";
    @C17952c(mo34828a = "version")
    private String version = "";

    public final String getApp() {
        return this.app;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getBuildType() {
        return this.buildType;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final String getCommitId() {
        return this.commitId;
    }

    public final String getDependenciesUrl() {
        return this.dependenciesUrl;
    }

    public final String getJenkinsUrl() {
        return this.jenkinsUrl;
    }

    public final String getMappingUrl() {
        return this.mappingUrl;
    }

    public final String getMergeRequestId() {
        return this.mergeRequestId;
    }

    public final long getPackageSize() {
        return this.packageSize;
    }

    public final String getPackageUrl() {
        return this.packageUrl;
    }

    public final String getPreviousRootNodeCommitId() {
        return this.previousRootNodeCommitId;
    }

    public final String getUpdateVersion() {
        return this.updateVersion;
    }

    public final String getVersion() {
        return this.version;
    }

    public final boolean isRelease() {
        return this.isRelease;
    }

    public final void setPackageSize(long j) {
        this.packageSize = j;
    }

    public final void setApp(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.app = str;
    }

    public final void setAppId(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.appId = str;
    }

    public final void setBuildType(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.buildType = str;
    }

    public final void setChannel(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.channel = str;
    }

    public final void setCommitId(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.commitId = str;
    }

    public final void setDependenciesUrl(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.dependenciesUrl = str;
    }

    public final void setJenkinsUrl(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.jenkinsUrl = str;
    }

    public final void setMappingUrl(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.mappingUrl = str;
    }

    public final void setMergeRequestId(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.mergeRequestId = str;
    }

    public final void setPackageUrl(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.packageUrl = str;
    }

    public final void setPreviousRootNodeCommitId(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.previousRootNodeCommitId = str;
    }

    public final void setUpdateVersion(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.updateVersion = str;
    }

    public final void setVersion(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.version = str;
    }
}
