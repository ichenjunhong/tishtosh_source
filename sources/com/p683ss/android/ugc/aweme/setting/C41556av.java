package com.p683ss.android.ugc.aweme.setting;

import android.util.SparseArray;
import com.p683ss.android.ugc.aweme.setting.model.RetryPolicyItem;

/* renamed from: com.ss.android.ugc.aweme.setting.av */
public final class C41556av {

    /* renamed from: a */
    public static int f105263a = 10800000;

    /* renamed from: c */
    private static C41556av f105264c = new C41556av();

    /* renamed from: b */
    public SparseArray<RetryPolicyItem> f105265b = new SparseArray<>(4);

    /* renamed from: com.ss.android.ugc.aweme.setting.av$a */
    public interface C41557a {
        /* renamed from: b */
        void mo85342b();
    }

    /* renamed from: a */
    public static C41556av m91389a() {
        return f105264c;
    }

    private C41556av() {
    }

    /* renamed from: b */
    public final void mo85341b() {
        for (int i = 0; i < this.f105265b.size(); i++) {
            RetryPolicyItem retryPolicyItem = (RetryPolicyItem) this.f105265b.valueAt(i);
            if (retryPolicyItem != null && System.currentTimeMillis() - retryPolicyItem.lastResponseTime > ((long) f105263a)) {
                retryPolicyItem.retryListener.mo85342b();
            }
        }
    }

    /* renamed from: a */
    public final void mo85339a(int i, C41557a aVar) {
        this.f105265b.put(i, new RetryPolicyItem(true, System.currentTimeMillis(), aVar));
    }

    /* renamed from: a */
    public final void mo85340a(int i, boolean z) {
        if (this.f105265b.get(i) != null) {
            ((RetryPolicyItem) this.f105265b.get(i)).lastResponseTime = System.currentTimeMillis();
            ((RetryPolicyItem) this.f105265b.get(i)).isLoadSuccess = z;
            if (z) {
                ((RetryPolicyItem) this.f105265b.get(i)).retryCount = 0;
            }
        }
    }
}
