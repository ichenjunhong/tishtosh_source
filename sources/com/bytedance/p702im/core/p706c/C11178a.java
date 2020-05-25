package com.bytedance.p702im.core.p706c;

import android.net.Uri;
import com.bytedance.p702im.core.internal.utils.C11464c;
import java.io.File;
import java.io.Serializable;
import java.util.Map;

/* renamed from: com.bytedance.im.core.c.a */
public final class C11178a implements Serializable {
    private String displayType;
    private Map<String, String> ext;
    private String hash;
    private int index;
    private long length;
    private String localPath;
    private String mimeType;
    private String msgUuid;
    private String remoteUrl;
    private int status;
    private String type;
    private int uploadProgress;

    public final String getDisplayType() {
        return this.displayType;
    }

    public final Map<String, String> getExt() {
        return this.ext;
    }

    public final String getHash() {
        return this.hash;
    }

    public final int getIndex() {
        return this.index;
    }

    public final long getLength() {
        return this.length;
    }

    public final String getLocalPath() {
        return this.localPath;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getMsgUuid() {
        return this.msgUuid;
    }

    public final String getRemoteUrl() {
        return this.remoteUrl;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getType() {
        return this.type;
    }

    public final int getUploadProgress() {
        return this.uploadProgress;
    }

    public final String getExtStr() {
        return C11464c.m23455a(this.ext);
    }

    public final Uri getLocalUri() {
        return Uri.fromFile(new File(this.localPath));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Attachment{msgUuid='");
        sb.append(this.msgUuid);
        sb.append('\'');
        sb.append(", localPath='");
        sb.append(this.localPath);
        sb.append('\'');
        sb.append(", remoteUrl='");
        sb.append(this.remoteUrl);
        sb.append('\'');
        sb.append(", length=");
        sb.append(this.length);
        sb.append(", type='");
        sb.append(this.type);
        sb.append('\'');
        sb.append(", index=");
        sb.append(this.index);
        sb.append(", uploadProgress=");
        sb.append(this.uploadProgress);
        sb.append(", ext=");
        sb.append(this.ext);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", hash='");
        sb.append(this.hash);
        sb.append('\'');
        sb.append(", displayType='");
        sb.append(this.displayType);
        sb.append('\'');
        sb.append(", mimeType='");
        sb.append(this.mimeType);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public final void setDisplayType(String str) {
        this.displayType = str;
    }

    public final void setExt(Map<String, String> map) {
        this.ext = map;
    }

    public final void setHash(String str) {
        this.hash = str;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setLength(long j) {
        this.length = j;
    }

    public final void setLocalPath(String str) {
        this.localPath = str;
    }

    public final void setMimeType(String str) {
        this.mimeType = str;
    }

    public final void setMsgUuid(String str) {
        this.msgUuid = str;
    }

    public final void setRemoteUrl(String str) {
        this.remoteUrl = str;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setUploadProgress(int i) {
        this.uploadProgress = i;
    }

    public final void setExtStr(String str) {
        this.ext = C11464c.m23458a(str);
    }

    public final void setLocalUri(Uri uri) {
        String str;
        if (uri != null) {
            str = uri.getPath();
        } else {
            str = "";
        }
        this.localPath = str;
    }
}
