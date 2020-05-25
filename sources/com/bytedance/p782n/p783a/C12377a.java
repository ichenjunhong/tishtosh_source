package com.bytedance.p782n.p783a;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.n.a.a */
public final class C12377a extends Exception {

    /* renamed from: a */
    private List<Throwable> f32610a;

    public final List<Throwable> getThrowable() {
        return this.f32610a;
    }

    public C12377a(List<Throwable> list) {
        this.f32610a = list;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Throwable a : list) {
                m24921a(a, arrayList);
            }
            setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[arrayList.size()]));
        }
    }

    /* renamed from: a */
    private void m24921a(Throwable th, List<StackTraceElement> list) {
        while (th != null) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            for (int i = 0; i < length; i++) {
                StackTraceElement stackTraceElement = stackTrace[i];
                if (i == 0) {
                    String message = th.getMessage();
                    StringBuilder sb = new StringBuilder("\b\b\b\nCaused by:");
                    if (message == null) {
                        message = "";
                    }
                    sb.append(message);
                    sb.append("\n\t");
                    sb.append(stackTraceElement.getClassName());
                    list.add(new StackTraceElement(sb.toString(), stackTraceElement.getMethodName(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber()));
                } else {
                    list.add(stackTraceElement);
                }
            }
            th = th.getCause();
        }
    }
}
