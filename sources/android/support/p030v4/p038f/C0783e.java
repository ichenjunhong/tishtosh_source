package android.support.p030v4.p038f;

import com.p683ss.android.ttve.nativePort.TEVideoRecorder;

/* renamed from: android.support.v4.f.e */
public final class C0783e {
    /* renamed from: a */
    public static void m2224a(Object obj, StringBuilder sb) {
        if (obj == null) {
            sb.append(TEVideoRecorder.FACE_BEAUTY_NULL);
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName == null || simpleName.length() <= 0) {
            simpleName = obj.getClass().getName();
            int lastIndexOf = simpleName.lastIndexOf(46);
            if (lastIndexOf > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }
}
