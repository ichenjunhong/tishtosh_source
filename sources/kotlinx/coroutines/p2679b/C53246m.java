package kotlinx.coroutines.p2679b;

import com.bytedance.liko.leakdetector.LeakDetectorInstaller;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.C53333v;
import p2628d.p2647j.C52753d;

/* renamed from: kotlinx.coroutines.b.m */
public final class C53246m {

    /* renamed from: a */
    public static final long f131861a = C53333v.m113365a("kotlinx.coroutines.scheduler.resolution.ns", LeakDetectorInstaller.MAX_POLL_TIME, 1, Long.MAX_VALUE);

    /* renamed from: b */
    public static final int f131862b = C53333v.m113364a("kotlinx.coroutines.scheduler.offload.threshold", 96, 0, 128, 4, (Object) null);

    /* renamed from: c */
    public static final int f131863c = C53333v.m113364a("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, (Object) null);

    /* renamed from: d */
    public static final int f131864d = C53333v.m113364a("kotlinx.coroutines.scheduler.core.pool.size", C52753d.m112321c(C53333v.m113363a(), 2), 1, 0, 8, (Object) null);

    /* renamed from: e */
    public static final int f131865e = C53333v.m113364a("kotlinx.coroutines.scheduler.max.pool.size", C52753d.m112315a(C53333v.m113363a() * 128, f131864d, 2097150), 0, 2097150, 4, (Object) null);

    /* renamed from: f */
    public static final long f131866f = TimeUnit.SECONDS.toNanos(C53333v.m113365a("kotlinx.coroutines.scheduler.keep.alive.sec", 5, 1, Long.MAX_VALUE));

    /* renamed from: g */
    public static C53247n f131867g = C53240g.f131854a;
}
