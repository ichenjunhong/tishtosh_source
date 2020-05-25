package com.bytedance.jirafast.models;

import java.io.Serializable;

/* renamed from: com.bytedance.jirafast.models.g */
public final class C12057g implements Serializable {

    /* renamed from: a */
    private String f31881a;

    /* renamed from: b */
    private String f31882b;

    /* renamed from: c */
    private boolean f31883c;

    /* renamed from: d */
    private boolean f31884d;

    /* renamed from: e */
    private long f31885e;

    public final String getId() {
        return this.f31881a;
    }

    public final String getName() {
        return this.f31882b;
    }

    public final long getProjectId() {
        return this.f31885e;
    }

    public final boolean isArchived() {
        return this.f31883c;
    }

    public final boolean isReleased() {
        return this.f31884d;
    }

    public final String toString() {
        return this.f31882b;
    }

    public final int hashCode() {
        return this.f31882b.hashCode();
    }

    public final void setArchived(boolean z) {
        this.f31883c = z;
    }

    public final void setId(String str) {
        this.f31881a = str;
    }

    public final void setName(String str) {
        this.f31882b = str;
    }

    public final void setProjectId(long j) {
        this.f31885e = j;
    }

    public final void setReleased(boolean z) {
        this.f31884d = z;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C12057g)) {
            return false;
        }
        return this.f31882b.equals(((C12057g) obj).f31882b);
    }
}
