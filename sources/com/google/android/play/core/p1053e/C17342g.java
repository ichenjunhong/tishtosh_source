package com.google.android.play.core.p1053e;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.play.core.e.g */
public abstract class C17342g {
    /* renamed from: a */
    public static C17342g m42462a(int i, int i2, int i3, long j, long j2, List<String> list, List<String> list2) {
        if (i2 != 8) {
            C17351p pVar = new C17351p(i, i2, i3, j, j2, list, list2, null, null);
            return pVar;
        }
        throw new IllegalArgumentException("REQUIRES_USER_CONFIRMATION state not supported.");
    }

    /* renamed from: a */
    public static C17342g m42463a(Bundle bundle) {
        C17351p pVar = new C17351p(bundle.getInt("session_id"), bundle.getInt("status"), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
        return pVar;
    }

    /* renamed from: a */
    public abstract int mo33633a();

    /* renamed from: b */
    public abstract int mo33634b();

    /* renamed from: c */
    public abstract int mo33635c();

    /* renamed from: d */
    public abstract long mo33636d();

    /* renamed from: e */
    public abstract long mo33637e();

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public abstract List<String> mo33638f();

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public abstract List<String> mo33639g();

    /* renamed from: h */
    public final List<String> mo33640h() {
        return mo33638f() != null ? new ArrayList(mo33638f()) : new ArrayList();
    }

    /* renamed from: i */
    public final List<String> mo33641i() {
        return mo33639g() != null ? new ArrayList(mo33639g()) : new ArrayList();
    }

    /* renamed from: j */
    public abstract PendingIntent mo33642j();

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public abstract List<Intent> mo33643k();
}
