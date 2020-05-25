package dmt.p2652av.video;

import android.arch.lifecycle.C0199s;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;

/* renamed from: dmt.av.video.d */
public class C52953d<T> implements C0199s<T> {

    /* renamed from: a */
    static boolean f131362a;

    public void onChanged(T t) {
        String str;
        if (!f131362a) {
            if (t == null) {
                str = TEVideoRecorder.FACE_BEAUTY_NULL;
            } else {
                str = t.toString();
            }
            C32458a.m75150b("LogObserver", str);
        }
    }
}
