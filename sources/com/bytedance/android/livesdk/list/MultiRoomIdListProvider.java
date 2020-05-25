package com.bytedance.android.livesdk.list;

import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.os.Bundle;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.livesdk.chatroom.p306bl.C5014i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p450h.C8750a;
import com.bytedance.android.livesdkapi.p450h.C8758h;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.p522b.C9376b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;

public class MultiRoomIdListProvider extends C8758h implements C0183j {

    /* renamed from: a */
    List<Long> f21276a = new ArrayList();

    /* renamed from: b */
    List<Room> f21277b;

    /* renamed from: c */
    Bundle f21278c;

    /* renamed from: d */
    private final List<Bundle> f21279d = new ArrayList();

    /* renamed from: e */
    private C1690c f21280e;

    /* renamed from: f */
    private List<Room> f21281f = new ArrayList();

    /* renamed from: a */
    public final List<Room> mo14085a() {
        return this.f21281f;
    }

    /* renamed from: a */
    public final void mo13139a(int i, FeedItem feedItem) {
    }

    /* renamed from: b */
    public final void mo13143b(int i) {
    }

    /* renamed from: b */
    public final int mo13141b() {
        return this.f21276a.size();
    }

    /* renamed from: d */
    public final List<Room> mo13146d() {
        return new ArrayList();
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        if (this.f21280e != null) {
            this.f21280e.dispose();
            this.f21280e = null;
        }
    }

    /* renamed from: a */
    public final int mo13137a(Bundle bundle) {
        return this.f21276a.indexOf(Long.valueOf(bundle.getLong("live.intent.extra.ROOM_ID")));
    }

    /* renamed from: b */
    public final void mo14087b(List<Room> list) {
        if (!C9414h.m18630a(list)) {
            if (this.f21281f == null) {
                this.f21281f = new ArrayList();
            }
            this.f21281f.clear();
            this.f21281f.addAll(list);
        }
    }

    /* renamed from: a */
    public final void mo13140a(long j) {
        Iterator it = this.f21276a.iterator();
        while (it.hasNext()) {
            if (((Long) it.next()).longValue() == j) {
                it.remove();
                return;
            }
        }
    }

    /* renamed from: a */
    public final Bundle mo13138a(int i) {
        if (!C9376b.m18558a((Collection<T>) this.f21279d) && this.f21279d.size() > i) {
            return (Bundle) this.f21279d.get(i);
        }
        Bundle bundle = new Bundle();
        if (this.f21278c != null) {
            long j = this.f21278c.getLong("live.intent.extra.ROOM_ID");
            if (j > 0 && j == ((Long) this.f21276a.get(i)).longValue()) {
                bundle = new Bundle(this.f21278c);
            }
        }
        if (i >= 0 && i < this.f21276a.size()) {
            bundle.putLong("live.intent.extra.ROOM_ID", ((Long) this.f21276a.get(i)).longValue());
        }
        return bundle;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo14086a(List<Room> list) {
        this.f21279d.clear();
        if (!C9414h.m18630a(list)) {
            for (Room a : list) {
                this.f21279d.add(C8750a.m17218a(a));
            }
        }
    }

    public MultiRoomIdListProvider(C0176h hVar, long[] jArr, Bundle bundle) {
        this.f21278c = bundle;
        for (long valueOf : jArr) {
            this.f21276a.add(Long.valueOf(valueOf));
        }
        hVar.mo324a(this);
        if (jArr != null) {
            this.f21280e = C5014i.m11507a(jArr).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C7739a<Object>(this), C7740b.f21283a);
        }
    }
}
