package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35466c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.CommandShareContent */
public class CommandShareContent extends BaseContent {
    @C17952c(mo34828a = "author_name")
    private String authorName;
    @C17952c(mo34828a = "cover_url")
    private UrlModel coverUrl;
    private boolean isSendMsg;
    @C17952c(mo34828a = "itemId")
    private String itemId;
    @C17952c(mo34828a = "title")
    private String title;

    public String getAuthorName() {
        return this.authorName;
    }

    public UrlModel getCoverUrl() {
        return this.coverUrl;
    }

    public String getItemId() {
        return this.itemId;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isSendMsg() {
        return this.isSendMsg;
    }

    public String getMsgHint() {
        if (this.isSendMsg) {
            return C11010c.m22280a().getString(R.string.bfz);
        }
        return C11010c.m22280a().getString(R.string.bfy);
    }

    public void setAuthorName(String str) {
        this.authorName = str;
    }

    public void setCoverUrl(UrlModel urlModel) {
        this.coverUrl = urlModel;
    }

    public void setItemId(String str) {
        this.itemId = str;
    }

    public void setSendMsg(boolean z) {
        this.isSendMsg = z;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public static CommandShareContent obtain(C35466c cVar) {
        CommandShareContent commandShareContent = new CommandShareContent();
        commandShareContent.setItemId(cVar.f91129a);
        commandShareContent.setTitle(cVar.f91131c);
        commandShareContent.setAuthorName(cVar.f91133e);
        commandShareContent.setCoverUrl(cVar.f91130b);
        return commandShareContent;
    }
}
