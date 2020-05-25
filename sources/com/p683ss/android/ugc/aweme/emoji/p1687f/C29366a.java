package com.p683ss.android.ugc.aweme.emoji.p1687f;

import android.text.TextUtils;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.emoji.f.a */
public class C29366a implements Serializable {
    @C17952c(mo34828a = "id")

    /* renamed from: a */
    private long f76919a;
    @C17952c(mo34828a = "animate_url")

    /* renamed from: b */
    private UrlModel f76920b;
    @C17952c(mo34828a = "static_url")

    /* renamed from: c */
    private UrlModel f76921c;
    @C17952c(mo34828a = "animate_type")

    /* renamed from: d */
    private String f76922d;
    @C17952c(mo34828a = "static_type")

    /* renamed from: e */
    private String f76923e;
    @C17952c(mo34828a = "width")

    /* renamed from: f */
    private int f76924f;
    @C17952c(mo34828a = "height")

    /* renamed from: g */
    private int f76925g;
    @C17952c(mo34828a = "display_name")

    /* renamed from: h */
    private String f76926h;
    @C17952c(mo34828a = "origin_package_id")

    /* renamed from: i */
    private long f76927i;
    @C17952c(mo34828a = "sticker_type")

    /* renamed from: j */
    private int f76928j;
    @C17952c(mo34828a = "version")

    /* renamed from: k */
    private String f76929k;
    @C17952c(mo34828a = "display_name_lang")

    /* renamed from: l */
    private HashMap<String, String> f76930l;
    @C17952c(mo34828a = "log_pb")

    /* renamed from: m */
    private LogPbBean f76931m;

    public String getAnimateType() {
        return this.f76922d;
    }

    public UrlModel getAnimateUrl() {
        return this.f76920b;
    }

    public String getDisplayName() {
        return this.f76926h;
    }

    public HashMap<String, String> getDisplayNameLangs() {
        return this.f76930l;
    }

    public int getHeight() {
        return this.f76925g;
    }

    public long getId() {
        return this.f76919a;
    }

    public LogPbBean getLogPb() {
        return this.f76931m;
    }

    public long getResourcesId() {
        return this.f76927i;
    }

    public String getStaticType() {
        return this.f76923e;
    }

    public UrlModel getStaticUrl() {
        return this.f76921c;
    }

    public int getStickerType() {
        return this.f76928j;
    }

    public String getVersion() {
        return this.f76929k;
    }

    public int getWidth() {
        return this.f76924f;
    }

    public int hashCode() {
        return String.valueOf(this.f76919a).hashCode();
    }

    public void setAnimateType(String str) {
        this.f76922d = str;
    }

    public void setAnimateUrl(UrlModel urlModel) {
        this.f76920b = urlModel;
    }

    public void setDisplayName(String str) {
        this.f76926h = str;
    }

    public void setDisplayNameLangs(HashMap<String, String> hashMap) {
        this.f76930l = hashMap;
    }

    public void setHeight(int i) {
        this.f76925g = i;
    }

    public void setId(long j) {
        this.f76919a = j;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.f76931m = logPbBean;
    }

    public void setResourcesId(long j) {
        this.f76927i = j;
    }

    public void setStaticType(String str) {
        this.f76923e = str;
    }

    public void setStaticUrl(UrlModel urlModel) {
        this.f76921c = urlModel;
    }

    public void setStickerType(int i) {
        this.f76928j = i;
    }

    public void setVersion(String str) {
        this.f76929k = str;
    }

    public void setWidth(int i) {
        this.f76924f = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C29366a)) {
            return false;
        }
        C29366a aVar = (C29366a) obj;
        if ((aVar.f76919a <= 0 || aVar.f76919a != this.f76919a) && (aVar.getAnimateUrl() == null || getAnimateUrl() == null || !TextUtils.equals(aVar.getAnimateUrl().getUri(), this.f76920b.getUri()))) {
            return false;
        }
        return true;
    }
}
