package com.bytedance.android.livesdkapi.p450h;

import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p450h.C8755f.C8756a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.android.livesdkapi.h.h */
public abstract class C8758h implements C8755f {

    /* renamed from: a */
    private final Set<C8756a> f24027a = new HashSet();

    /* renamed from: a */
    public void mo13139a(int i, FeedItem feedItem) {
    }

    /* renamed from: a */
    public abstract void mo13140a(long j);

    /* renamed from: b */
    public abstract void mo13143b(int i);

    /* renamed from: b */
    public void mo14087b(List<Room> list) {
    }

    /* renamed from: d */
    public abstract List<Room> mo13146d();

    /* renamed from: a */
    public List<Room> mo14085a() {
        return new ArrayList();
    }

    /* renamed from: c */
    public void mo13144c() {
        this.f24027a.clear();
    }

    /* renamed from: f */
    public final void mo15419f() {
        for (C8756a c : this.f24027a) {
            c.mo10910c();
        }
    }

    /* renamed from: b */
    public final void mo15416b(C8756a aVar) {
        this.f24027a.remove(aVar);
    }

    /* renamed from: a */
    public final void mo15415a(C8756a aVar) {
        this.f24027a.add(aVar);
    }
}
