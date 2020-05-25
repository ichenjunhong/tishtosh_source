package com.p683ss.android.ugc.aweme.emoji.emojichoose.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.model.c */
public class C29358c implements Serializable {
    @C17952c(mo34828a = "id")

    /* renamed from: a */
    private long f76899a;
    @C17952c(mo34828a = "display_name")

    /* renamed from: b */
    private String f76900b;
    @C17952c(mo34828a = "icon_url")

    /* renamed from: c */
    private String f76901c;
    @C17952c(mo34828a = "version")

    /* renamed from: d */
    private String f76902d;
    @C17952c(mo34828a = "resource_url")

    /* renamed from: e */
    private String f76903e;

    /* renamed from: f */
    private int f76904f;

    /* renamed from: g */
    private String f76905g;

    public String getDisplayName() {
        return this.f76900b;
    }

    public String getIconUrl() {
        return this.f76901c;
    }

    public long getId() {
        return this.f76899a;
    }

    public int getOptional() {
        return this.f76904f;
    }

    public String getResourceUrl() {
        return this.f76903e;
    }

    public String getType() {
        return this.f76905g;
    }

    public String getVersion() {
        return this.f76902d;
    }

    public int hashCode() {
        return String.valueOf(this.f76899a).hashCode();
    }

    public void setDisplayName(String str) {
        this.f76900b = str;
    }

    public void setIconUrl(String str) {
        this.f76901c = str;
    }

    public void setId(long j) {
        this.f76899a = j;
    }

    public void setOptional(int i) {
        this.f76904f = i;
    }

    public void setResourceUrl(String str) {
        this.f76903e = str;
    }

    public void setType(String str) {
        this.f76905g = str;
    }

    public void setVersion(String str) {
        this.f76902d = str;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C29358c) && this.f76899a == ((C29358c) obj).getId()) {
            return true;
        }
        return false;
    }
}
