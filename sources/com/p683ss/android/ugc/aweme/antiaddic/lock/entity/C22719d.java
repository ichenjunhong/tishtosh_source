package com.p683ss.android.ugc.aweme.antiaddic.lock.entity;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.entity.d */
public final class C22719d {

    /* renamed from: a */
    public String f60921a;

    /* renamed from: b */
    public long f60922b;

    /* renamed from: c */
    public String f60923c;

    /* renamed from: d */
    public boolean f60924d = true;

    /* renamed from: e */
    public boolean f60925e;

    public final int hashCode() {
        if (this.f60921a != null) {
            return this.f60921a.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeLockUserSettingOld{userId='");
        sb.append(this.f60921a);
        sb.append('\'');
        sb.append(", lastSetTime=");
        sb.append(this.f60922b);
        sb.append(", password='");
        sb.append(this.f60923c);
        sb.append('\'');
        sb.append(", isTimeLockOn=");
        sb.append(this.f60924d);
        sb.append(", isContentFilterOn=");
        sb.append(this.f60925e);
        sb.append('}');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C22719d dVar = (C22719d) obj;
        if (this.f60921a != null) {
            return this.f60921a.equals(dVar.f60921a);
        }
        if (dVar.f60921a == null) {
            return true;
        }
        return false;
    }
}
