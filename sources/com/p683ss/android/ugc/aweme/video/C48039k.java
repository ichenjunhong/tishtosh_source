package com.p683ss.android.ugc.aweme.video;

import com.p683ss.android.ugc.aweme.feed.adapter.C30018ai;
import com.p683ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.video.k */
public class C48039k {

    /* renamed from: c */
    private static C48039k f120719c;

    /* renamed from: d */
    private static long f120720d;

    /* renamed from: a */
    public C30018ai f120721a;

    /* renamed from: b */
    public HashMap<String, RoomStruct> f120722b = new HashMap<>();

    private C48039k() {
    }

    /* renamed from: b */
    public final void mo95304b() {
        if (this.f120721a != null) {
            this.f120721a.mo60292a();
        }
    }

    /* renamed from: a */
    public static C48039k m104036a() {
        if (f120719c == null) {
            synchronized (C48039k.class) {
                if (f120719c == null) {
                    f120719c = new C48039k();
                }
            }
        }
        return f120719c;
    }

    /* renamed from: a */
    public static void m104037a(long j) {
        f120720d = j;
    }

    /* renamed from: a */
    public final void mo95302a(C30018ai aiVar) {
        this.f120721a = aiVar;
    }

    /* renamed from: a */
    public final void mo95303a(C38871j jVar) {
        if (this.f120721a != null) {
            this.f120721a.mo60292a();
        }
    }
}
