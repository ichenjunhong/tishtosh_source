package com.p683ss.android.ugc.aweme.p1807im.sdk.chat;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.CommonLifeCycleObserver */
public interface CommonLifeCycleObserver extends C0183j {

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.CommonLifeCycleObserver$a */
    public static final class C33325a {
        @C0200t(mo345a = C0177a.ON_CREATE)
        public static void onCreate(CommonLifeCycleObserver commonLifeCycleObserver) {
        }

        @C0200t(mo345a = C0177a.ON_DESTROY)
        public static void onDestroy(CommonLifeCycleObserver commonLifeCycleObserver) {
        }

        @C0200t(mo345a = C0177a.ON_PAUSE)
        public static void onPause(CommonLifeCycleObserver commonLifeCycleObserver) {
        }

        @C0200t(mo345a = C0177a.ON_RESUME)
        public static void onResume(CommonLifeCycleObserver commonLifeCycleObserver) {
        }

        @C0200t(mo345a = C0177a.ON_START)
        public static void onStart(CommonLifeCycleObserver commonLifeCycleObserver) {
        }

        @C0200t(mo345a = C0177a.ON_STOP)
        public static void onStop(CommonLifeCycleObserver commonLifeCycleObserver) {
        }
    }

    @C0200t(mo345a = C0177a.ON_CREATE)
    void onCreate();

    @C0200t(mo345a = C0177a.ON_DESTROY)
    void onDestroy();

    @C0200t(mo345a = C0177a.ON_PAUSE)
    void onPause();

    @C0200t(mo345a = C0177a.ON_RESUME)
    void onResume();

    @C0200t(mo345a = C0177a.ON_START)
    void onStart();

    @C0200t(mo345a = C0177a.ON_STOP)
    void onStop();
}
