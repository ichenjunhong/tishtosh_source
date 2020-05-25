package com.google.android.play.core.splitcompat;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.play.core.splitcompat.e */
final class C17387e implements ThreadFactory {
    C17387e() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "SplitCompatBackgroundThread");
    }
}
