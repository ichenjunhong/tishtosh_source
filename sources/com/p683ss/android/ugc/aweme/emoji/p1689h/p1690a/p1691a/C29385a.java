package com.p683ss.android.ugc.aweme.emoji.p1689h.p1690a.p1691a;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.emoji.h.a.a.a */
public final class C29385a implements Serializable {
    @C17952c(mo34828a = "uri")

    /* renamed from: a */
    private String f76961a = "";
    @C17952c(mo34828a = "display_name")

    /* renamed from: b */
    private String f76962b = "";
    @C17952c(mo34828a = "display_name_lang")

    /* renamed from: c */
    private HashMap<String, String> f76963c;
    @C17952c(mo34828a = "width")

    /* renamed from: d */
    private int f76964d;
    @C17952c(mo34828a = "height")

    /* renamed from: e */
    private int f76965e;
    @C17952c(mo34828a = "hide")

    /* renamed from: f */
    private int f76966f;

    public final String getDisplayName() {
        return this.f76962b;
    }

    public final HashMap<String, String> getDisplayNameLang() {
        return this.f76963c;
    }

    public final int getHeight() {
        return this.f76965e;
    }

    public final int getHide() {
        return this.f76966f;
    }

    public final String getUri() {
        return this.f76961a;
    }

    public final int getWidth() {
        return this.f76964d;
    }

    public final boolean showInPanel() {
        if (this.f76966f != 1) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnlineSmallEmoji={uri=");
        sb.append(this.f76961a);
        sb.append(", displayName=");
        sb.append(this.f76962b);
        sb.append(", displayNameLang=");
        sb.append(this.f76962b);
        sb.append(", hide=");
        sb.append(this.f76966f);
        sb.append('}');
        return sb.toString();
    }

    public final void setDisplayNameLang(HashMap<String, String> hashMap) {
        this.f76963c = hashMap;
    }

    public final void setHeight(int i) {
        this.f76965e = i;
    }

    public final void setHide(int i) {
        this.f76966f = i;
    }

    public final void setWidth(int i) {
        this.f76964d = i;
    }

    public final void setDisplayName(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f76962b = str;
    }

    public final void setUri(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f76961a = str;
    }
}
