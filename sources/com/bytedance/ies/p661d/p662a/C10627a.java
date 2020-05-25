package com.bytedance.ies.p661d.p662a;

import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.p661d.p662a.p663a.C10631c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.ies.d.a.a */
public abstract class C10627a implements Comparable<C10627a>, Runnable {
    private static C10631c sQueue = new C10631c();
    private static AtomicBoolean sQueueStarted = new AtomicBoolean(false);
    private static AtomicInteger sSequenceGenerator = new AtomicInteger();
    protected final AtomicBoolean mCanceled = new AtomicBoolean(false);
    public final String mName;
    public final C10628a mPriority;
    private int mSequence;
    protected final AtomicBoolean mStarted = new AtomicBoolean(false);

    /* renamed from: com.bytedance.ies.d.a.a$a */
    public enum C10628a {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public boolean needTryLocal() {
        return false;
    }

    public void run() {
    }

    public boolean run4Local() {
        return false;
    }

    public void cancel() {
        this.mCanceled.compareAndSet(false, true);
    }

    public boolean isCanceled() {
        return this.mCanceled.get();
    }

    public final void start() {
        if (this.mStarted.compareAndSet(false, true)) {
            this.mSequence = sSequenceGenerator.incrementAndGet();
            if (sQueueStarted.compareAndSet(false, true)) {
                sQueue.mo18872a();
            }
            sQueue.mo18873a(this);
        }
    }

    public int compareTo(C10627a aVar) {
        C10628a aVar2 = this.mPriority;
        C10628a aVar3 = aVar.mPriority;
        if (aVar2 == null) {
            aVar2 = C10628a.NORMAL;
        }
        if (aVar3 == null) {
            aVar3 = C10628a.NORMAL;
        }
        if (aVar2 == aVar3) {
            return this.mSequence - aVar.mSequence;
        }
        return aVar3.ordinal() - aVar2.ordinal();
    }

    protected C10627a(String str, C10628a aVar) {
        this.mPriority = aVar;
        if (C9431p.m18664a(str)) {
            str = getClass().getSimpleName();
        }
        this.mName = str;
    }
}
