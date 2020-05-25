package com.bytedance.jirafast.models;

import java.io.Serializable;

/* renamed from: com.bytedance.jirafast.models.a */
public final class C12051a implements Serializable {

    /* renamed from: a */
    private String f31853a;

    /* renamed from: b */
    private String f31854b;

    /* renamed from: c */
    private boolean f31855c;

    public final String getKey() {
        return this.f31853a;
    }

    public final String getName() {
        return this.f31854b;
    }

    public final boolean isDone() {
        return this.f31855c;
    }

    public final String toString() {
        return this.f31854b;
    }

    public final int hashCode() {
        return this.f31853a.hashCode();
    }

    public final void setDone(boolean z) {
        this.f31855c = z;
    }

    public final void setKey(String str) {
        this.f31853a = str;
    }

    public final void setName(String str) {
        this.f31854b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C12051a)) {
            return false;
        }
        return this.f31853a.equals(((C12051a) obj).f31853a);
    }
}
