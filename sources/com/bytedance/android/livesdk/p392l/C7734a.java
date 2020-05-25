package com.bytedance.android.livesdk.p392l;

import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.p179a.C2941a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.bytedance.android.livesdk.l.a */
public abstract class C7734a {
    public C7734a mNextTask;
    public volatile int mStatus;

    /* access modifiers changed from: protected */
    public Callable asyncCallable() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract void run();

    public synchronized boolean isFinished() {
        boolean z;
        if (this.mStatus == 2) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public synchronized boolean isIDLE() {
        boolean z;
        if (this.mStatus == 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public synchronized boolean isRunning() {
        if (this.mStatus == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public List<Integer> preTasks() {
        return Arrays.asList(new Integer[]{Integer.valueOf(0)});
    }

    /* access modifiers changed from: protected */
    public void start() {
        if (this.mStatus != 2 && this.mStatus != 1) {
            this.mStatus = 1;
            try {
                run();
                this.mStatus = 2;
            } catch (Exception e) {
                this.mStatus = 3;
                throw e;
            }
        }
    }

    public final List<Integer> getPreTasks() {
        ArrayList arrayList = new ArrayList();
        if (preTasks() != null) {
            arrayList.add(Integer.valueOf(0));
            for (Integer num : preTasks()) {
                if (!arrayList.contains(num)) {
                    arrayList.add(num);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public int getTaskId() {
        try {
            return ((C2941a) getClass().getAnnotation(C2941a.class)).mo7578a();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getCanonicalName());
            sb.append(" task getTaskID exception");
            C3831a.m9716d("ttlive_sdk_launch_error", sb.toString());
            C3831a.m9706a(6, "ttlive_sdk_launch_error", e.getStackTrace());
            throw e;
        }
    }
}
