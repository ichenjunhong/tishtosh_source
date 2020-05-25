package com.bytedance.android.livesdk.feed.p340h;

import android.os.Bundle;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p450h.C8750a;
import com.bytedance.android.livesdkapi.p450h.C8758h;
import com.bytedance.android.livesdkapi.p450h.C8760j;
import com.bytedance.common.utility.C9414h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.feed.h.c */
public final class C6956c extends C8758h implements C8760j {

    /* renamed from: a */
    private final List<Bundle> f19035a = new ArrayList();

    /* renamed from: b */
    private final List<Room> f19036b = new ArrayList();

    /* renamed from: a */
    public final void mo13139a(int i, FeedItem feedItem) {
    }

    /* renamed from: b */
    public final void mo13143b(int i) {
    }

    /* renamed from: c */
    public final void mo13145c(long j) {
    }

    /* renamed from: d */
    public final List<Room> mo13146d() {
        return this.f19036b;
    }

    /* renamed from: b */
    public final int mo13141b() {
        return this.f19035a.size();
    }

    /* renamed from: c */
    public final void mo13144c() {
        super.mo13144c();
        this.f19035a.clear();
        this.f19036b.clear();
    }

    /* renamed from: a */
    public final int mo13137a(Bundle bundle) {
        return this.f19035a.indexOf(bundle);
    }

    /* renamed from: a */
    public final Bundle mo13138a(int i) {
        return (Bundle) this.f19035a.get(i);
    }

    public C6956c(List<Room> list) {
        m14558a(list);
    }

    /* renamed from: a */
    private void m14558a(List<Room> list) {
        this.f19035a.clear();
        this.f19036b.clear();
        if (!C9414h.m18630a(list)) {
            this.f19036b.addAll(list);
            for (Room a : list) {
                this.f19035a.add(C8750a.m17218a(a));
            }
        }
    }

    /* renamed from: a */
    public final void mo13140a(long j) {
        for (int i = 0; i < this.f19035a.size(); i++) {
            if (((Room) this.f19036b.get(i)).getId() == j) {
                this.f19035a.remove(i);
                this.f19036b.remove(i);
                mo15419f();
                return;
            }
        }
    }
}
