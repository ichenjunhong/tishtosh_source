package com.p683ss.android.ugc.aweme.shortvideo.upload;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.z */
public final class C45324z {

    /* renamed from: a */
    private static final C45324z f114598a = new C45324z();

    /* renamed from: b */
    private ConcurrentLinkedQueue<String> f114599b = new ConcurrentLinkedQueue<>();

    /* renamed from: a */
    public static C45324z m98803a() {
        return f114598a;
    }

    /* renamed from: b */
    public final ArrayList<String> mo91603b() {
        ConcurrentLinkedQueue<String> concurrentLinkedQueue = this.f114599b;
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        sb.append(":report");
        concurrentLinkedQueue.offer(sb.toString());
        ArrayList<String> arrayList = new ArrayList<>(this.f114599b);
        this.f114599b.clear();
        return arrayList;
    }

    /* renamed from: a */
    public final void mo91602a(String str) {
        if (this.f114599b.size() >= 30) {
            this.f114599b.poll();
        }
        ConcurrentLinkedQueue<String> concurrentLinkedQueue = this.f114599b;
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        sb.append(":");
        sb.append(str);
        concurrentLinkedQueue.offer(sb.toString());
    }
}
