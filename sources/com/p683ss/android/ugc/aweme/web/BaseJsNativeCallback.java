package com.p683ss.android.ugc.aweme.web;

import android.arch.lifecycle.C0184k;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.p030v4.p038f.C0801o;
import com.p683ss.android.ugc.aweme.web.IJsCallback;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.ugc.aweme.web.BaseJsNativeCallback */
public abstract class BaseJsNativeCallback<CALLBACK extends IJsCallback> extends BaseLifeCycleObserver {

    /* renamed from: a */
    public CALLBACK f121460a;

    /* renamed from: b */
    C0801o<Method> f121461b;

    /* renamed from: c */
    public ResultReceiver f121462c;

    /* renamed from: d */
    private C0184k f121463d;

    /* renamed from: com.ss.android.ugc.aweme.web.BaseJsNativeCallback$1 */
    class C482631 extends ResultReceiver {

        /* renamed from: a */
        final /* synthetic */ BaseJsNativeCallback f121464a;

        /* access modifiers changed from: protected */
        public void onReceiveResult(int i, Bundle bundle) {
            BaseJsNativeCallback baseJsNativeCallback = this.f121464a;
            if (baseJsNativeCallback.f121461b == null) {
                Method[] methods = baseJsNativeCallback.f121460a.getClass().getMethods();
                baseJsNativeCallback.f121461b = new C0801o<>();
                for (Method method : methods) {
                    C48375n nVar = (C48375n) method.getAnnotation(C48375n.class);
                    if (nVar != null) {
                        baseJsNativeCallback.f121461b.mo2595b(nVar.mo95828a(), method);
                    }
                }
            }
            try {
                Method method2 = (Method) baseJsNativeCallback.f121461b.mo2591a(i);
                if (method2 != null) {
                    method2.invoke(baseJsNativeCallback.f121460a, new Object[]{bundle});
                }
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException unused2) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void onDestroy(C0184k kVar) {
        super.onDestroy(kVar);
        this.f121462c = null;
        this.f121463d.getLifecycle().mo325b(this);
    }
}
