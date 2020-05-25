package com.p683ss.android.ugc.aweme.tools;

import android.support.p030v4.p038f.C0795l.C0797b;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.TimeSpeedModelExtension;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.tools.r */
public final class C47337r extends C46933c {

    /* renamed from: a */
    public static final C0797b<C47337r> f119492a = new C0797b<>(1);

    /* renamed from: b */
    public List<TimeSpeedModelExtension> f119493b;

    /* renamed from: c */
    public long f119494c;

    /* renamed from: d */
    public TimeSpeedModelExtension f119495d;

    /* renamed from: e */
    public boolean f119496e;

    private C47337r() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecordingProgressUpdateEvent{timeSpeedModels=");
        sb.append(this.f119493b);
        sb.append(", elapsedTimeInMicros=");
        sb.append(this.f119494c);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public static C47337r m102705a(List<TimeSpeedModelExtension> list, long j) {
        return m102707a(list, j, false);
    }

    /* renamed from: a */
    public static C47337r m102706a(List<TimeSpeedModelExtension> list, long j, TimeSpeedModelExtension timeSpeedModelExtension) {
        C47337r a = m102705a(list, j);
        a.f119495d = timeSpeedModelExtension;
        return a;
    }

    /* renamed from: a */
    public static C47337r m102707a(List<TimeSpeedModelExtension> list, long j, boolean z) {
        C47337r rVar = (C47337r) f119492a.acquire();
        if (rVar == null) {
            rVar = new C47337r();
        }
        rVar.f119495d = null;
        rVar.f119493b = list;
        rVar.f119494c = j;
        rVar.f119496e = z;
        return rVar;
    }
}
