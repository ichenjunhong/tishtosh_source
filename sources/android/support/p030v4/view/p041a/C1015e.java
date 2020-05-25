package android.support.p030v4.view.p041a;

import android.view.accessibility.AccessibilityRecord;

/* renamed from: android.support.v4.view.a.e */
public final class C1015e {

    /* renamed from: a */
    public final AccessibilityRecord f3270a;

    /* renamed from: a */
    public static C1015e m2926a() {
        return new C1015e(AccessibilityRecord.obtain());
    }

    public final int hashCode() {
        if (this.f3270a == null) {
            return 0;
        }
        return this.f3270a.hashCode();
    }

    private C1015e(Object obj) {
        this.f3270a = (AccessibilityRecord) obj;
    }

    /* renamed from: a */
    public final void mo3174a(int i) {
        this.f3270a.setItemCount(i);
    }

    /* renamed from: b */
    public final void mo3176b(int i) {
        this.f3270a.setFromIndex(i);
    }

    /* renamed from: c */
    public final void mo3177c(int i) {
        this.f3270a.setToIndex(i);
    }

    /* renamed from: a */
    public final void mo3175a(boolean z) {
        this.f3270a.setScrollable(z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1015e eVar = (C1015e) obj;
        if (this.f3270a == null) {
            if (eVar.f3270a != null) {
                return false;
            }
        } else if (!this.f3270a.equals(eVar.f3270a)) {
            return false;
        }
        return true;
    }
}
