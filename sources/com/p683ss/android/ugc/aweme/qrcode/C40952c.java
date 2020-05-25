package com.p683ss.android.ugc.aweme.qrcode;

import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.qrcode.c */
public final class C40952c implements Serializable {
    public String describe;
    public String enterFrom;
    public String hashTagName;
    public boolean isEnterprisePoi;
    public boolean isEnterpriseUser;
    public boolean isHashTag;
    public String objectId;
    public String title;
    public int type;
    public String webDes;
    public String webImage;
    public String webUrl;

    /* renamed from: com.ss.android.ugc.aweme.qrcode.c$a */
    public static class C40954a {

        /* renamed from: a */
        public C40952c f104177a = new C40952c();

        /* renamed from: a */
        public final C40954a mo83448a(String str, String str2) {
            this.f104177a.title = str;
            this.f104177a.describe = str2;
            return this;
        }

        /* renamed from: a */
        public final C40954a mo83446a(int i, String str, String str2) {
            return mo83447a(i, str, false, "", str2);
        }

        /* renamed from: a */
        public final C40954a mo83449a(String str, String str2, boolean z) {
            this.f104177a.title = str;
            this.f104177a.describe = str2;
            this.f104177a.isEnterpriseUser = z;
            return this;
        }

        /* renamed from: a */
        public final C40954a mo83447a(int i, String str, boolean z, String str2, String str3) {
            this.f104177a.type = i;
            this.f104177a.objectId = str;
            this.f104177a.isHashTag = z;
            this.f104177a.hashTagName = str2;
            this.f104177a.enterFrom = str3;
            return this;
        }
    }

    private C40952c() {
    }

    public final String getWebDes() {
        return this.webDes;
    }

    public final String getWebImage() {
        return this.webImage;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public final void setWebDes(String str) {
        this.webDes = str;
    }

    public final void setWebImage(String str) {
        this.webImage = str;
    }

    public final void setWebUrl(String str) {
        this.webUrl = str;
    }

    public C40952c(int i, String str, String str2) {
        this.type = i;
        this.objectId = str;
        this.hashTagName = "";
        this.enterFrom = str2;
    }

    public C40952c(int i, String str, boolean z, String str2, String str3) {
        this.type = i;
        this.objectId = str;
        this.isHashTag = z;
        this.hashTagName = str2;
        this.enterFrom = str3;
    }
}
