package org.webrtc;

import java.lang.ref.WeakReference;
import org.webrtc.EglBase.EglContextChecker;

public class EglBaseCheckerHelper {
    protected static WeakReference<EglContextChecker> eglContextChecker;

    public static void EglContextDestoryEnd() {
        if (eglContextChecker != null && eglContextChecker.get() != null) {
            ((EglContextChecker) eglContextChecker.get()).EglContextDestoryEnd();
        }
    }

    public static void EglContextDestoryStart() {
        if (eglContextChecker != null && eglContextChecker.get() != null) {
            ((EglContextChecker) eglContextChecker.get()).EglContextDestoryStart();
        }
    }

    public static void setEglContextChecker(EglContextChecker eglContextChecker2) {
        eglContextChecker = new WeakReference<>(eglContextChecker2);
    }
}
