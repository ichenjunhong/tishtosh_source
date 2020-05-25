package com.bytedance.p782n;

import com.bytedance.p782n.p783a.C12377a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.n.g */
public class C12386g<T> extends C12382d<List<T>, T> {

    /* renamed from: g */
    private Executor f32619g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18064a(Object... objArr) {
        super.mo18064a(objArr);
        if (objArr == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            this.f32619g = threadPoolExecutor;
        } else if (objArr.length != 1) {
            throw new IllegalArgumentException("ParallelInterceptor only need one param");
        } else if (objArr[0] instanceof Executor) {
            this.f32619g = objArr[0];
        } else {
            throw new IllegalArgumentException("ParallelInterceptor args must be instance of Executor");
        }
    }

    /* renamed from: a_ */
    public final /* synthetic */ Object mo18063a_(C12378b bVar, Object obj) throws Throwable {
        List list = (List) obj;
        CountDownLatch countDownLatch = new CountDownLatch(list.size());
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        for (final Object next : list) {
            Executor executor = this.f32619g;
            final C12378b bVar2 = bVar;
            final CopyOnWriteArrayList copyOnWriteArrayList3 = copyOnWriteArrayList;
            final CopyOnWriteArrayList copyOnWriteArrayList4 = copyOnWriteArrayList2;
            final CountDownLatch countDownLatch2 = countDownLatch;
            C123871 r0 = new Runnable() {
                public final void run() {
                    try {
                        copyOnWriteArrayList3.add(bVar2.mo23391a(next));
                    } catch (C12392a e) {
                        Throwable cause = e.getCause();
                        copyOnWriteArrayList4.add(cause);
                        C12386g.this.mo23396b(cause);
                    } catch (Throwable th) {
                        countDownLatch2.countDown();
                        throw th;
                    }
                    countDownLatch2.countDown();
                }
            };
            executor.execute(r0);
        }
        countDownLatch.await();
        if (copyOnWriteArrayList2.isEmpty()) {
            return copyOnWriteArrayList;
        }
        throw new C12377a(copyOnWriteArrayList2);
    }
}
