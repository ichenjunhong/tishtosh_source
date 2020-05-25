package com.p683ss.android.agilelogger.p1125b.p1132d;

/* renamed from: com.ss.android.agilelogger.b.d.a */
public final class C18800a implements C18801b {

    /* renamed from: a */
    private final String f51948a = "Thread: ";

    /* renamed from: a */
    public final /* synthetic */ String mo38395a(Object obj) {
        Thread thread = (Thread) obj;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Thread: ");
        stringBuffer.append(thread.getName());
        return stringBuffer.toString();
    }
}
