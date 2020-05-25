package com.p683ss.android.agilelogger;

import com.p683ss.android.agilelogger.C18778a.C18780b;

/* renamed from: com.ss.android.agilelogger.AgileDelegate */
public class AgileDelegate {

    /* renamed from: a */
    public long f51913a;

    private native long getFlushFuncAddr();

    private static native long init(String str, int i, String str2, String str3, int i2, boolean z, boolean z2, int i3, int i4);

    private native int initState(long j);

    public native void asyncFlush(long j);

    /* access modifiers changed from: 0000 */
    public native void changeLogPath(long j, boolean z);

    /* access modifiers changed from: 0000 */
    public native long getAlogFuncAddr();

    /* access modifiers changed from: 0000 */
    public native long getFlushV2FuncAddr();

    /* access modifiers changed from: 0000 */
    public native long getLogStoreDirFuncAddr();

    public native void release(long j);

    public native void write(long j, String str);

    /* renamed from: a */
    public final C18780b mo38384a() {
        if (this.f51913a == 0) {
            return C18780b.NOT_INIT;
        }
        try {
            if (initState(this.f51913a) == 1) {
                return C18780b.USING_MMAP;
            }
            return C18780b.USING_CACHE;
        } catch (Throwable unused) {
            return C18780b.FATAL_ERROR;
        }
    }

    public AgileDelegate(String str, int i, String str2, String str3, int i2, boolean z, boolean z2, int i3, int i4) {
        try {
            this.f51913a = init(str, i, str2, str3, i2, z, z2, i3, i4);
        } catch (Throwable unused) {
        }
    }
}
