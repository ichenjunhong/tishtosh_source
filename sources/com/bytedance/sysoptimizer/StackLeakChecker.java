package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.Iterator;

public class StackLeakChecker {
    private static String TAG = "SYSOPTIMIZER";
    private static boolean mAutoFix = false;
    private static boolean mCheckerEnabled = false;
    private static ArrayList<StackLeakItem> mLeakList = new ArrayList<>();
    private static int mLeakThreadThreshold = 10;
    private static ArrayList<StackLeakListener> mListeners = new ArrayList<>();
    private static long mStackCheckInterval = 60000000;

    public interface StackLeakListener {
        void onLeakReport(ArrayList<StackLeakItem> arrayList);
    }

    private StackLeakChecker() {
    }

    private static native boolean setEnable(boolean z, boolean z2, int i, int i2, long j);

    public static synchronized void disableChecker() {
        synchronized (StackLeakChecker.class) {
            if (mCheckerEnabled) {
                setEnable(false, mAutoFix, 0, 0, 0);
            }
        }
    }

    private static void reportLeak() {
        Iterator it = mListeners.iterator();
        while (it.hasNext()) {
            ((StackLeakListener) it.next()).onLeakReport(mLeakList);
        }
        mLeakList.clear();
    }

    public static synchronized void registerStackLeakListener(StackLeakListener stackLeakListener) {
        synchronized (StackLeakChecker.class) {
            if (stackLeakListener != null) {
                mListeners.add(stackLeakListener);
            }
        }
    }

    private static boolean loadOptimizerOnNeed(Context context) {
        if (VERSION.SDK_INT < 23 || VERSION.SDK_INT > 28) {
            return false;
        }
        return Optimizer.loadOptimizerLibrary(context);
    }

    public static synchronized boolean enableChecker(Context context, boolean z) {
        synchronized (StackLeakChecker.class) {
            if (mCheckerEnabled) {
                return true;
            }
            mAutoFix = z;
            if (!loadOptimizerOnNeed(context)) {
                return false;
            }
            try {
                boolean enable = setEnable(true, mAutoFix, VERSION.SDK_INT, mLeakThreadThreshold, mStackCheckInterval);
                mCheckerEnabled = enable;
                return enable;
            } catch (UnsatisfiedLinkError unused) {
                return false;
            }
        }
    }

    public static synchronized void setInterval(int i, long j) {
        synchronized (StackLeakChecker.class) {
            if (i <= 0) {
                i = 10;
            }
            mLeakThreadThreshold = i;
            long j2 = 10000000;
            if (j > 10000000) {
                j2 = 10000000 * (j / 10000000);
            }
            mStackCheckInterval = j2;
            if (mCheckerEnabled) {
                setEnable(true, mAutoFix, 0, mLeakThreadThreshold, mStackCheckInterval);
            }
        }
    }

    private static void addLeakItem(int i, long j, long j2, long j3, String str, String str2) {
        ArrayList<StackLeakItem> arrayList = mLeakList;
        StackLeakItem stackLeakItem = new StackLeakItem(i, j, j2, j3, str, str2);
        arrayList.add(stackLeakItem);
    }
}
