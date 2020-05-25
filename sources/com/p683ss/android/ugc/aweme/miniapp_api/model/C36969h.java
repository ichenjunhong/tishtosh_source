package com.p683ss.android.ugc.aweme.miniapp_api.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.h */
public final class C36969h implements Serializable {
    @C17952c(mo34828a = "image_url")
    public String imageUrl;
    @C17952c(mo34828a = "text")
    public String text;
    @C17952c(mo34828a = "wait_time")
    public int waitTime;

    public C36969h() {
    }

    public static /* synthetic */ C36969h copy$default(C36969h hVar, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = hVar.imageUrl;
        }
        if ((i2 & 2) != 0) {
            str2 = hVar.text;
        }
        if ((i2 & 4) != 0) {
            i = hVar.waitTime;
        }
        return hVar.copy(str, str2, i);
    }

    public final String component1() {
        return this.imageUrl;
    }

    public final String component2() {
        return this.text;
    }

    public final int component3() {
        return this.waitTime;
    }

    public final C36969h copy(String str, String str2, int i) {
        C52711k.m112240b(str, "imageUrl");
        C52711k.m112240b(str2, "text");
        return new C36969h(str, str2, i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C36969h) {
                C36969h hVar = (C36969h) obj;
                if (C52711k.m112239a((Object) this.imageUrl, (Object) hVar.imageUrl) && C52711k.m112239a((Object) this.text, (Object) hVar.text)) {
                    if (this.waitTime == hVar.waitTime) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getText() {
        return this.text;
    }

    public final int getWaitTime() {
        return this.waitTime;
    }

    public final int hashCode() {
        String str = this.imageUrl;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.text;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + this.waitTime;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MiniAppCard(imageUrl=");
        sb.append(this.imageUrl);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", waitTime=");
        sb.append(this.waitTime);
        sb.append(")");
        return sb.toString();
    }

    public final void setWaitTime(int i) {
        this.waitTime = i;
    }

    public final void setImageUrl(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.imageUrl = str;
    }

    public final void setText(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.text = str;
    }

    public C36969h(String str, String str2, int i) {
        C52711k.m112240b(str, "imageUrl");
        C52711k.m112240b(str2, "text");
        this.imageUrl = str;
        this.text = str2;
        this.waitTime = i;
    }
}
