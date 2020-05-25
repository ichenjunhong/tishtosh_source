package com.bytedance.sysoptimizer.safereg;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class LoadedApkHuaWei {
    private static final HuaWeiVerifier IMPL;

    static class BaseVerifierImpl implements HuaWeiVerifier {
        private BaseVerifierImpl() {
        }

        private Object getReceiverResourceObject(Context context) {
            try {
                Field declaredField = FieldUtils.getDeclaredField("android.app.LoadedApk", "mReceiverResource", true);
                if (declaredField != null) {
                    Field declaredField2 = FieldUtils.getDeclaredField("android.app.ContextImpl", "mPackageInfo", true);
                    if (declaredField2 != null) {
                        Object readField = FieldUtils.readField(declaredField2, (Object) context);
                        if (readField != null) {
                            return FieldUtils.readField(declaredField, readField, true);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            return null;
        }

        private Object getWhiteListObject(Object obj, String str) {
            if (obj != null) {
                try {
                    return FieldUtils.readField(obj, str);
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        public Object getWhiteListObject(Context context, String str) {
            return getWhiteListObject(getReceiverResourceObject(context), str);
        }

        public boolean verifier(Context context, TooManyBroadcastCallback tooManyBroadcastCallback) throws Throwable {
            Object receiverResourceObject = getReceiverResourceObject(context);
            Object whiteListObject = getWhiteListObject(receiverResourceObject, "mWhiteList");
            if (whiteListObject instanceof String[]) {
                String[] strArr = (String[]) whiteListObject;
                ArrayList arrayList = new ArrayList();
                arrayList.add(context.getPackageName());
                Collections.addAll(arrayList, strArr);
                FieldUtils.writeField(receiverResourceObject, "mWhiteList", (Object) arrayList.toArray(new String[arrayList.size()]));
                return true;
            }
            if (receiverResourceObject != null) {
                FieldUtils.writeField(receiverResourceObject, "mResourceConfig", (Object) null);
            }
            return false;
        }
    }

    interface HuaWeiVerifier {
        boolean verifier(Context context, TooManyBroadcastCallback tooManyBroadcastCallback) throws Throwable;
    }

    public interface TooManyBroadcastCallback {
        void tooManyBroadcast(int i, int i2);
    }

    static class V24VerifierImpl extends BaseVerifierImpl {
        private V24VerifierImpl() {
            super();
        }

        public boolean verifier(Context context, TooManyBroadcastCallback tooManyBroadcastCallback) throws Throwable {
            Object whiteListObject = getWhiteListObject(context, "mWhiteList");
            if (!(whiteListObject instanceof List)) {
                return false;
            }
            ((List) whiteListObject).add(context.getPackageName());
            return true;
        }
    }

    static class V26VerifierImpl extends BaseVerifierImpl {
        private V26VerifierImpl() {
            super();
        }

        public boolean verifier(Context context, TooManyBroadcastCallback tooManyBroadcastCallback) throws Throwable {
            Object whiteListObject = getWhiteListObject(context, "mWhiteListMap");
            if (!(whiteListObject instanceof Map)) {
                return false;
            }
            Map map = (Map) whiteListObject;
            List list = (List) map.get(Integer.valueOf(0));
            if (list == null) {
                list = new ArrayList();
                map.put(Integer.valueOf(0), list);
            }
            list.add(context.getPackageName());
            return true;
        }
    }

    static class V28VerifierImpl extends V26VerifierImpl {

        static class AmsInvocationHandler implements InvocationHandler {
            private TooManyBroadcastCallback mCallback;
            private volatile int mCurrentBroadcastCount;
            private Object mIActivityManagerObject;

            private AmsInvocationHandler(Object obj, TooManyBroadcastCallback tooManyBroadcastCallback) {
                this.mCallback = tooManyBroadcastCallback;
                this.mIActivityManagerObject = obj;
            }

            public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                int i;
                String name = method.getName();
                if (TextUtils.equals("registerReceiver", name)) {
                    if (this.mCurrentBroadcastCount >= 1000) {
                        if (this.mCallback != null) {
                            this.mCallback.tooManyBroadcast(this.mCurrentBroadcastCount, 1000);
                        }
                        return null;
                    }
                    this.mCurrentBroadcastCount++;
                    if (this.mCallback != null) {
                        this.mCallback.tooManyBroadcast(this.mCurrentBroadcastCount, 1000);
                    }
                } else if (TextUtils.equals("unregisterReceiver", name)) {
                    this.mCurrentBroadcastCount--;
                    if (this.mCurrentBroadcastCount < 0) {
                        i = 0;
                    } else {
                        i = this.mCurrentBroadcastCount;
                    }
                    this.mCurrentBroadcastCount = i;
                    if (this.mCallback != null) {
                        this.mCallback.tooManyBroadcast(this.mCurrentBroadcastCount, 1000);
                    }
                }
                return method.invoke(this.mIActivityManagerObject, objArr);
            }
        }

        private V28VerifierImpl() {
            super();
        }

        public boolean verifier(Context context, TooManyBroadcastCallback tooManyBroadcastCallback) throws Throwable {
            boolean verifier = super.verifier(context, tooManyBroadcastCallback);
            hookActivityManagerService(context.getClassLoader(), tooManyBroadcastCallback);
            return verifier;
        }

        private void hookActivityManagerService(ClassLoader classLoader, TooManyBroadcastCallback tooManyBroadcastCallback) {
            try {
                Object readStaticField = FieldUtils.readStaticField(ActivityManager.class.getName(), "IActivityManagerSingleton");
                if (readStaticField != null) {
                    Object readField = FieldUtils.readField(readStaticField, "mInstance");
                    if (readField != null) {
                        AmsInvocationHandler amsInvocationHandler = new AmsInvocationHandler(readField, tooManyBroadcastCallback);
                        String str = "mInstance";
                        FieldUtils.writeField(readStaticField, str, Proxy.newProxyInstance(classLoader, new Class[]{Class.forName("android.app.IActivityManager")}, amsInvocationHandler));
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 28) {
            IMPL = new V28VerifierImpl();
        } else if (i >= 26) {
            IMPL = new V26VerifierImpl();
        } else if (i >= 24) {
            IMPL = new V24VerifierImpl();
        } else {
            IMPL = new BaseVerifierImpl();
        }
    }

    public static void hookHuaWeiVerifier(Application application) {
        hookHuaWeiVerifier(application, null);
    }

    public static void hookHuaWeiVerifier(Application application, TooManyBroadcastCallback tooManyBroadcastCallback) {
        if (application != null) {
            try {
                IMPL.verifier(application.getBaseContext(), tooManyBroadcastCallback);
            } catch (Throwable unused) {
            }
        }
    }
}
