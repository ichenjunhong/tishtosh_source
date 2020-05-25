package com.bytedance.android.livesdk.list;

import android.os.Bundle;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p450h.C8758h;
import com.bytedance.common.utility.C9414h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.list.c */
public final class C7741c extends C8758h {

    /* renamed from: a */
    private Bundle f21284a;

    /* renamed from: b */
    private List<Room> f21285b = new ArrayList();

    /* renamed from: a */
    public final int mo13137a(Bundle bundle) {
        return 0;
    }

    /* renamed from: a */
    public final void mo13139a(int i, FeedItem feedItem) {
    }

    /* renamed from: a */
    public final void mo13140a(long j) {
    }

    /* renamed from: b */
    public final int mo13141b() {
        return 1;
    }

    /* renamed from: b */
    public final void mo13143b(int i) {
    }

    /* renamed from: d */
    public final List<Room> mo13146d() {
        return Collections.EMPTY_LIST;
    }

    /* renamed from: a */
    public final List<Room> mo14085a() {
        return this.f21285b;
    }

    /* renamed from: a */
    public final Bundle mo13138a(int i) {
        return this.f21284a;
    }

    public C7741c(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f21284a = bundle;
    }

    /* renamed from: b */
    public final void mo14087b(List<Room> list) {
        if (!C9414h.m18630a(list)) {
            if (this.f21285b == null) {
                this.f21285b = new ArrayList();
            }
            this.f21285b.clear();
            this.f21285b.add(list.get(0));
        }
    }
}
