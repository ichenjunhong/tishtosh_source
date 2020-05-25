package com.p683ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice */
public class AnnouncementNotice {
    @C17952c(mo34828a = "challenge")
    Challenge challenge;
    @C17952c(mo34828a = "content")
    String content;
    @C17952c(mo34828a = "image_url")
    UrlModel imageUrl;
    @C17952c(mo34828a = "object_id")
    String objectId;
    @C17952c(mo34828a = "schema_url")
    String schemaUrl;
    @C17952c(mo34828a = "search")
    Search search;
    @C17952c(mo34828a = "task_id")
    long taskId;
    @C17952c(mo34828a = "title")
    String title;
    @C17952c(mo34828a = "type")
    int type;

    public Challenge getChallenge() {
        return this.challenge;
    }

    public String getContent() {
        return this.content;
    }

    public UrlModel getImageUrl() {
        return this.imageUrl;
    }

    public String getObjectId() {
        return this.objectId;
    }

    public String getSchemaUrl() {
        return this.schemaUrl;
    }

    public Search getSearch() {
        return this.search;
    }

    public long getTaskId() {
        return this.taskId;
    }

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public void setChallenge(Challenge challenge2) {
        this.challenge = challenge2;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setImageUrl(UrlModel urlModel) {
        this.imageUrl = urlModel;
    }

    public void setObjectId(String str) {
        this.objectId = str;
    }

    public void setSchemaUrl(String str) {
        this.schemaUrl = str;
    }

    public void setSearch(Search search2) {
        this.search = search2;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(int i) {
        this.type = i;
    }
}
