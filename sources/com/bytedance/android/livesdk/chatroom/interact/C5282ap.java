package com.bytedance.android.livesdk.chatroom.interact;

import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5324m.C5325a;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5600hd;
import com.bytedance.android.livesdk.chatroom.interact.p321j.C5630a;
import com.bytedance.android.livesdk.chatroom.interact.p321j.C5630a.C5631a;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5696e;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5697f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.ap */
public final class C5282ap implements C5631a {

    /* renamed from: a */
    private Room f14137a;

    /* renamed from: b */
    private C5630a f14138b;

    /* renamed from: c */
    private C5283a f14139c;

    /* renamed from: d */
    private List<C5325a> f14140d = new ArrayList();

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.ap$a */
    public interface C5283a {
        /* renamed from: a */
        void mo11127a(int i);
    }

    /* renamed from: a */
    public final void mo11123a(List<C5697f> list, long j) {
    }

    /* renamed from: a */
    public final void mo11121a() {
        this.f14138b.mo11515a((C5631a) this);
    }

    /* renamed from: b */
    public final void mo11124b() {
        this.f14138b.mo11523b((C5631a) this);
    }

    /* renamed from: b */
    public final void mo11126b(List<C5696e> list) {
        this.f14139c.mo11127a(list.size());
    }

    /* renamed from: a */
    public final void mo11092a(List<C5696e> list) {
        for (C5325a aVar : this.f14140d) {
            C5696e a = this.f14138b.mo11513a(aVar.mo11212c(), aVar.mo11213d());
            if (a != null) {
                aVar.mo11210a(a);
            }
        }
    }

    /* renamed from: c */
    private C5325a m11951c(long j, String str) {
        for (C5325a aVar : this.f14140d) {
            if (j <= 0 || aVar.mo11212c() != j) {
                if (TextUtils.equals(aVar.mo11213d(), str)) {
                }
            }
            return aVar;
        }
        return null;
    }

    /* renamed from: a */
    public final C5325a mo11120a(long j, String str) {
        C5696e b = this.f14138b.mo11521b(0, str);
        if (b == null) {
            this.f14138b.mo11519a(false);
        }
        C5325a c = m11951c(0, str);
        if (c == null) {
            C5600hd hdVar = new C5600hd(this.f14137a, 0, str, b);
            this.f14140d.add(hdVar);
            return hdVar;
        }
        c.mo11210a(b);
        return c;
    }

    /* renamed from: b */
    public final void mo11125b(long j, String str) {
        for (C5325a aVar : this.f14140d) {
            if (j <= 0 || aVar.mo11212c() != j) {
                if (TextUtils.equals(aVar.mo11213d(), str)) {
                }
            }
            this.f14140d.remove(aVar);
            return;
        }
    }

    /* renamed from: a */
    public final void mo11122a(long j, long j2) {
        if (j > 0) {
            for (C5325a aVar : this.f14140d) {
                if (aVar.mo11212c() == j) {
                    aVar.mo11209a(j2);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo11074a(long j, String str, boolean z) {
        C5325a c = m11951c(j, str);
        if (c != null) {
            c.mo11208a(z ^ true ? 1 : 0);
        }
    }

    public C5282ap(Room room, C5630a aVar, C5283a aVar2) {
        this.f14137a = room;
        this.f14139c = aVar2;
        this.f14138b = aVar;
    }
}
