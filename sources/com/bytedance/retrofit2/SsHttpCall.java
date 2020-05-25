package com.bytedance.retrofit2;

import android.os.SystemClock;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p830a.C12686c;
import com.bytedance.retrofit2.p833c.C12729b;
import java.io.IOException;
import java.util.LinkedList;
import java.util.concurrent.Executor;

public class SsHttpCall<T> implements C12690b<T>, C12758l, C12759m {
    public static C12672a sThrottleControl;
    private long appCallTime;
    public final Object[] args;
    private final CallServerInterceptor callServerInterceptor;
    public boolean isInDelayTimeRange;
    public C12686c originalRequest;
    public Throwable preBuildURLException;
    public final C12797t<T> serviceMethod;

    /* renamed from: com.bytedance.retrofit2.SsHttpCall$a */
    public interface C12672a {
        /* renamed from: e */
        boolean mo23847e(String str);

        /* renamed from: f */
        boolean mo23848f();

        /* renamed from: g */
        int mo23849g();
    }

    public C12796s getRetrofitMetrics() {
        return this.serviceMethod.f33507n;
    }

    public SsHttpCall<T> clone() {
        return new SsHttpCall<>(this.serviceMethod, this.args);
    }

    public void doCollect() {
        if (this.callServerInterceptor != null) {
            this.callServerInterceptor.doCollect();
        }
    }

    public Object getRequestInfo() {
        if (this.callServerInterceptor != null) {
            return this.callServerInterceptor.getRequestInfo();
        }
        return null;
    }

    public boolean isCanceled() {
        if (this.callServerInterceptor == null || !this.callServerInterceptor.f33272c) {
            return false;
        }
        return true;
    }

    public void cancel() {
        if (this.callServerInterceptor != null) {
            CallServerInterceptor callServerInterceptor2 = this.callServerInterceptor;
            callServerInterceptor2.f33272c = true;
            if (callServerInterceptor2.f33270a != null) {
                callServerInterceptor2.f33270a.mo9560b();
            }
        }
    }

    public synchronized boolean isExecuted() {
        boolean z;
        if (this.callServerInterceptor == null || !this.callServerInterceptor.mo23817a()) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public C12799u getResponseWithInterceptorChain() throws Exception {
        C12796s sVar = this.serviceMethod.f33507n;
        sVar.f33478k = SystemClock.uptimeMillis();
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(this.serviceMethod.f33498e);
        linkedList.add(this.callServerInterceptor);
        sVar.f33470c = this.appCallTime;
        sVar.f33471d = System.currentTimeMillis();
        this.originalRequest.f33332m = sVar;
        C12729b bVar = new C12729b(linkedList, 0, this.originalRequest, this, sVar);
        C12799u a = bVar.mo23900a(this.originalRequest);
        a.f33554d = sVar;
        return a;
    }

    public C12686c request() {
        if (this.callServerInterceptor != null) {
            C12686c cVar = this.callServerInterceptor.f33271b;
            if (cVar != null) {
                return cVar;
            }
        }
        if (this.originalRequest == null) {
            try {
                C12796s sVar = this.serviceMethod.f33507n;
                sVar.f33479l = SystemClock.uptimeMillis();
                this.originalRequest = this.serviceMethod.mo23949a(null, this.args);
                sVar.f33480m = SystemClock.uptimeMillis();
            } catch (RuntimeException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Unable to create request.", e2);
            }
        }
        return this.originalRequest;
    }

    public C12799u<T> execute() throws Exception {
        C12796s sVar = this.serviceMethod.f33507n;
        sVar.f33477j = SystemClock.uptimeMillis();
        this.appCallTime = System.currentTimeMillis();
        sVar.f33479l = SystemClock.uptimeMillis();
        this.originalRequest = this.serviceMethod.mo23949a(null, this.args);
        sVar.f33480m = SystemClock.uptimeMillis();
        if (sThrottleControl != null && sThrottleControl.mo23848f() && sThrottleControl.mo23847e(this.originalRequest.mo23860c())) {
            Thread.sleep((long) sThrottleControl.mo23849g());
        }
        return getResponseWithInterceptorChain();
    }

    public static void setThrottleControl(C12672a aVar) {
        sThrottleControl = aVar;
    }

    public T toResponseBody(TypedInput typedInput) throws IOException {
        return this.serviceMethod.mo23950a(typedInput);
    }

    public void enqueue(final C12743e<T> eVar) {
        final C12757k kVar;
        final C12796s sVar = this.serviceMethod.f33507n;
        sVar.f33476i = SystemClock.uptimeMillis();
        this.appCallTime = System.currentTimeMillis();
        if (eVar == null) {
            throw new NullPointerException("callback == null");
        } else if (this.callServerInterceptor == null || !this.callServerInterceptor.mo23817a()) {
            final Executor executor = this.serviceMethod.f33499f;
            if (eVar instanceof C12757k) {
                kVar = (C12757k) eVar;
            } else {
                kVar = null;
            }
            final C126701 r3 = new C12800v() {
                /* renamed from: a */
                public final int mo23842a() {
                    return SsHttpCall.this.serviceMethod.f33500g;
                }

                /* renamed from: b */
                public final boolean mo23843b() {
                    return SsHttpCall.this.serviceMethod.f33502i;
                }

                /* renamed from: c */
                public final int mo23844c() {
                    if (SsHttpCall.sThrottleControl != null) {
                        try {
                            if (SsHttpCall.this.isInDelayTimeRange && SsHttpCall.sThrottleControl.mo23847e(SsHttpCall.this.originalRequest.mo23860c())) {
                                return SsHttpCall.sThrottleControl.mo23849g();
                            }
                        } catch (Exception unused) {
                        }
                    }
                    return 0;
                }

                public final void run() {
                    try {
                        if (SsHttpCall.this.preBuildURLException == null) {
                            if (SsHttpCall.this.originalRequest == null) {
                                sVar.f33479l = SystemClock.uptimeMillis();
                                SsHttpCall.this.originalRequest = SsHttpCall.this.serviceMethod.mo23949a(kVar, SsHttpCall.this.args);
                                sVar.f33480m = SystemClock.uptimeMillis();
                            }
                            C12799u responseWithInterceptorChain = SsHttpCall.this.getResponseWithInterceptorChain();
                            try {
                                eVar.mo19942a((C12690b<T>) SsHttpCall.this, responseWithInterceptorChain);
                                if (kVar != null) {
                                    kVar.mo23905b(SsHttpCall.this, responseWithInterceptorChain);
                                }
                            } catch (Throwable unused) {
                            }
                        } else {
                            throw SsHttpCall.this.preBuildURLException;
                        }
                    } catch (Throwable unused2) {
                    }
                }
            };
            if (sThrottleControl == null || !sThrottleControl.mo23848f()) {
                executor.execute(r3);
            } else {
                executor.execute(new C12800v() {
                    /* renamed from: c */
                    public final int mo23844c() {
                        return 0;
                    }

                    /* renamed from: a */
                    public final int mo23842a() {
                        return SsHttpCall.this.serviceMethod.f33500g;
                    }

                    /* renamed from: b */
                    public final boolean mo23843b() {
                        return SsHttpCall.this.serviceMethod.f33502i;
                    }

                    public final void run() {
                        try {
                            if (SsHttpCall.this.originalRequest == null) {
                                C12796s sVar = SsHttpCall.this.serviceMethod.f33507n;
                                sVar.f33479l = SystemClock.uptimeMillis();
                                SsHttpCall.this.originalRequest = SsHttpCall.this.serviceMethod.mo23949a(kVar, SsHttpCall.this.args);
                                sVar.f33480m = SystemClock.uptimeMillis();
                            }
                            SsHttpCall.this.isInDelayTimeRange = true;
                        } catch (Throwable th) {
                            SsHttpCall.this.preBuildURLException = th;
                        }
                        executor.execute(r3);
                    }
                });
            }
        } else {
            throw new IllegalStateException("Already executed.");
        }
    }

    SsHttpCall(C12797t<T> tVar, Object[] objArr) {
        this.serviceMethod = tVar;
        this.args = objArr;
        this.callServerInterceptor = new CallServerInterceptor(tVar);
    }
}
