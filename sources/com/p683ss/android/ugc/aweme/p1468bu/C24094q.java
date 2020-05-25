package com.p683ss.android.ugc.aweme.p1468bu;

import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import com.taobao.android.dexposed.ClassUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.util.concurrent.FutureTask;

/* renamed from: com.ss.android.ugc.aweme.bu.q */
class C24094q {

    /* renamed from: a */
    private static volatile Field f63953a;

    /* renamed from: b */
    private static volatile Field f63954b;

    C24094q() {
    }

    /* renamed from: b */
    static boolean m58941b(Object obj) {
        return obj instanceof FutureTask;
    }

    /* renamed from: a */
    static String m58938a(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            C17840a.m43751a(th, printWriter);
            return stringWriter.toString();
        } finally {
            printWriter.close();
        }
    }

    /* renamed from: c */
    static Object m58942c(Object obj) {
        try {
            if (f63953a == null) {
                synchronized (C24094q.class) {
                    if (f63953a == null) {
                        Field declaredField = obj.getClass().getDeclaredField("callable");
                        f63953a = declaredField;
                        declaredField.setAccessible(true);
                    }
                }
            }
            return f63953a.get(obj);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Object m58943d(Object obj) {
        try {
            if (f63954b == null) {
                synchronized (C24094q.class) {
                    if (f63954b == null) {
                        Field declaredField = obj.getClass().getDeclaredField("task");
                        f63954b = declaredField;
                        declaredField.setAccessible(true);
                    }
                }
            }
            return f63954b.get(obj);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m58940a(Class cls) {
        String name = cls.getName();
        if ("java.lang.Integer".equals(name) || "java.lang.Boolean".equals(name) || "java.lang.Long".equals(name) || "java.lang.Float".equals(name) || "java.lang.Double".equals(name) || "java.lang.String".equals(name) || "sun.misc.Unsafe".equals(name) || "bolts.TaskCompletionSource".equals(name) || "java.util.ArrayList".equals(name) || name.contains("android.os.Handler") || name.contains("com.bytedance.common.utility.collection.WeakHandler") || name.contains("java.util.concurrent.Executors$RunnableAdapter") || name.contains("bolts.Task") || cls.isPrimitive()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static String m58937a(Object obj) {
        Field[] declaredFields;
        if (m58941b(obj)) {
            Object c = m58942c(obj);
            if (c != null) {
                obj = c;
            }
        }
        if ("java.util.concurrent.Executors$RunnableAdapter".equals(obj.getClass().getName())) {
            Object d = m58943d(obj);
            if (d != null) {
                obj = d;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (!m58940a(obj.getClass())) {
            String obj2 = obj.toString();
            int indexOf = obj2.indexOf("@");
            if (indexOf > 0) {
                obj2 = obj2.substring(0, indexOf);
            }
            sb.append(obj2);
            sb.append(",");
        }
        try {
            for (Field field : obj.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                Object obj3 = field.get(obj);
                if (obj3 != null) {
                    Class cls = obj3.getClass();
                    if (!m58940a(cls)) {
                        String name = cls.getName();
                        int indexOf2 = name.indexOf("@");
                        if (indexOf2 > 0) {
                            name = name.substring(0, indexOf2);
                        }
                        sb.append(name);
                        sb.append(",");
                    }
                }
            }
        } catch (Exception unused) {
        }
        return sb.toString().replaceAll("class ", "");
    }

    /* renamed from: a */
    static String m58939a(StackTraceElement[] stackTraceElementArr) throws IllegalArgumentException {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            boolean z = true;
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                if (!className.contains("libcore.io") && !className.contains("com.tencent.matrix.iocanary") && !className.contains("java.io") && !className.contains("android.database.sqlite") && !className.contains("android.database.AbstractCursor") && !className.contains("dalvik.system") && !className.contains("android.os") && !className.contains("com.ss.android.ugc.conan") && !className.contains("com.lody.whale")) {
                    String methodName = stackTraceElement.getMethodName();
                    if (!methodName.equals("getThreadStackTrace") && !methodName.equals("getStackTrace")) {
                        z = false;
                    }
                }
            }
            if (!z) {
                sb.append("\tat ");
                sb.append(stackTraceElement.getClassName());
                sb.append(ClassUtils.PACKAGE_SEPARATOR);
                sb.append(stackTraceElement.getMethodName());
                sb.append("(");
                sb.append(stackTraceElement.getFileName());
                sb.append(":");
                sb.append(stackTraceElement.getLineNumber());
                sb.append(")\n");
            }
        }
        return sb.toString();
    }
}
