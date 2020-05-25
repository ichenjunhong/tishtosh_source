package com.bytedance.p502b.p503a.p506b.p508b;

import android.text.TextUtils;
import com.bytedance.apm.p484g.C9034b;
import com.bytedance.apm.p484g.C9037c;
import com.bytedance.apm.p501q.C9203s;
import com.bytedance.services.apm.api.C13218a;
import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.b.a.b.b.a */
public final class C9220a {
    /* renamed from: a */
    public static void m18310a(String str) {
        if (C13218a.m26604a() != null) {
            C13218a.m26605a(str);
        } else {
            m18317c(str);
        }
    }

    /* renamed from: b */
    public static void m18314b(String str) {
        if (!TextUtils.isEmpty(str)) {
            C9034b.m17916a(str);
        }
    }

    /* renamed from: c */
    private static void m18317c(String str) {
        m18308a(3, Thread.currentThread().getStackTrace(), str, true, null);
    }

    /* renamed from: a */
    public static void m18311a(Throwable th) {
        if (C13218a.m26604a() != null) {
            C13218a.m26606a(th);
        } else {
            m18318c(th);
        }
    }

    /* renamed from: c */
    private static void m18318c(Throwable th) {
        if (m18316b(th)) {
            m18309a(3, Thread.currentThread().getStackTrace(), th, null, true, true, null);
        }
    }

    /* renamed from: b */
    public static boolean m18316b(Throwable th) {
        C9034b.m17915a();
        if (!C9034b.m17917b() || !C9037c.m17922a(th)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static String m18319d(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        C17840a.m43751a(th, printWriter);
        Throwable cause = th.getCause();
        if (cause != null) {
            C17840a.m43751a(cause, printWriter);
            Throwable cause2 = cause.getCause();
            if (cause2 != null) {
                C17840a.m43751a(cause2, printWriter);
            }
        }
        String stringWriter2 = stringWriter.toString();
        printWriter.close();
        if (stringWriter2.length() > 1024) {
            return stringWriter2.substring(0, PreloadTask.BYTE_UNIT_NUMBER);
        }
        return stringWriter2;
    }

    /* renamed from: b */
    private static void m18315b(Throwable th, String str) {
        if (m18316b(th)) {
            m18309a(3, Thread.currentThread().getStackTrace(), th, str, true, true, null);
        }
    }

    /* renamed from: a */
    public static void m18312a(Throwable th, String str) {
        if (C13218a.m26604a() != null) {
            C13218a.m26607a(th, str);
        } else {
            m18315b(th, str);
        }
    }

    /* renamed from: a */
    private static void m18313a(Map<String, String> map, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (map != null) {
                for (String str : map.keySet()) {
                    jSONObject2.put(str, map.get(str));
                }
                jSONObject.put("custom", jSONObject2);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m18308a(int i, StackTraceElement[] stackTraceElementArr, String str, boolean z, Map<String, String> map) {
        if (stackTraceElementArr != null) {
            try {
                if (stackTraceElementArr.length > 4) {
                    StackTraceElement stackTraceElement = stackTraceElementArr[3];
                    if (stackTraceElement != null) {
                        String className = stackTraceElement.getClassName();
                        String methodName = stackTraceElement.getMethodName();
                        int lineNumber = stackTraceElement.getLineNumber();
                        String a = C9203s.m18287a(stackTraceElementArr);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("event_type", "exception");
                        jSONObject.put("timestamp", System.currentTimeMillis());
                        jSONObject.put("class_ref", className);
                        jSONObject.put("method", methodName);
                        jSONObject.put("line_num", lineNumber);
                        jSONObject.put("stack", a);
                        jSONObject.put("exception_type", 1);
                        jSONObject.put("is_core", 1);
                        if (!TextUtils.isEmpty(str)) {
                            if (str.length() > 1024) {
                                jSONObject.put("message", str.substring(0, PreloadTask.BYTE_UNIT_NUMBER));
                            } else {
                                jSONObject.put("message", str);
                            }
                        }
                        m18313a(null, jSONObject);
                        C9034b.m17915a().mo16368a("core_exception_monitor", jSONObject.toString(), str, true);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m18309a(int i, StackTraceElement[] stackTraceElementArr, Throwable th, String str, boolean z, boolean z2, Map<String, String> map) {
        if (th != null) {
            try {
                StackTraceElement stackTraceElement = stackTraceElementArr[3];
                String className = stackTraceElement.getClassName();
                String methodName = stackTraceElement.getMethodName();
                int lineNumber = stackTraceElement.getLineNumber();
                String d = m18319d(th);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event_type", "exception");
                jSONObject.put("timestamp", System.currentTimeMillis());
                jSONObject.put("class_ref", className);
                jSONObject.put("method", methodName);
                jSONObject.put("line_num", lineNumber);
                jSONObject.put("stack", d);
                jSONObject.put("exception_type", 0);
                if (z2) {
                    jSONObject.put("is_core", 1);
                } else {
                    jSONObject.put("is_core", 0);
                }
                if (!TextUtils.isEmpty(str)) {
                    if (str.length() > 1024) {
                        jSONObject.put("message", str.substring(0, PreloadTask.BYTE_UNIT_NUMBER));
                    } else {
                        jSONObject.put("message", str);
                    }
                }
                m18313a(map, jSONObject);
                C9034b.m17915a().mo16368a("core_exception_monitor", jSONObject.toString(), str, true);
            } catch (Throwable unused) {
            }
        }
    }
}
