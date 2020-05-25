package com.bytedance.jirafast.models;

import java.io.Serializable;

/* renamed from: com.bytedance.jirafast.models.f */
public final class C12056f implements Serializable {

    /* renamed from: a */
    private String f31878a;

    /* renamed from: b */
    private String f31879b;

    /* renamed from: c */
    private String f31880c;

    public final String getDisplayName() {
        return this.f31880c;
    }

    public final String getEmailAddress() {
        return this.f31879b;
    }

    public final String getName() {
        return this.f31878a;
    }

    public final String toString() {
        return this.f31878a;
    }

    public final int hashCode() {
        return this.f31878a.hashCode();
    }

    public final void setDisplayName(String str) {
        this.f31880c = str;
    }

    public final void setEmailAddress(String str) {
        this.f31879b = str;
    }

    public final void setName(String str) {
        this.f31878a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C12056f)) {
            return false;
        }
        return this.f31878a.equals(((C12056f) obj).f31878a);
    }

    public C12056f(String str, String str2, String str3) {
        this.f31878a = str;
        this.f31879b = str2;
        this.f31880c = str3;
    }
}
