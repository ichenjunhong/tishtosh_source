package com.bytedance.android.livesdk.gift;

import android.os.SystemClock;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.livesdk.gift.domain.api.PropApi;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.p683ss.android.ugc.aweme.account.task.FbUploadTokenTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p064c.p065a.C1673aa;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.u */
public final class C7649u {

    /* renamed from: d */
    private static C7649u f21075d;

    /* renamed from: a */
    final List<Prop> f21076a = new ArrayList();

    /* renamed from: b */
    final List<C7650a> f21077b = new ArrayList();

    /* renamed from: c */
    boolean f21078c = false;

    /* renamed from: com.bytedance.android.livesdk.gift.u$a */
    public interface C7650a {
        /* renamed from: a */
        void mo13538a();

        /* renamed from: a */
        void mo13539a(List<Prop> list);
    }

    private C7649u() {
    }

    /* renamed from: a */
    public static synchronized C7649u m15656a() {
        C7649u uVar;
        synchronized (C7649u.class) {
            if (f21075d == null) {
                f21075d = new C7649u();
            }
            uVar = f21075d;
        }
        return uVar;
    }

    /* renamed from: c */
    public final boolean mo14016c() {
        Set set = (Set) C4525b.f12323S.mo10345a();
        for (Prop prop : this.f21076a) {
            if (prop.reddotTip && !set.contains(Long.valueOf(prop.f20511id))) {
                return true;
            }
        }
        return ((Boolean) C4525b.f12427by.mo10345a()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo14015b() {
        if ((System.currentTimeMillis() / FbUploadTokenTime.group0) - (((Long) C4525b.f12443q.mo10345a()).longValue() / FbUploadTokenTime.group0) < 1) {
            return false;
        }
        for (Prop prop : this.f21076a) {
            if (prop.nextExpire > 0 && prop.nextExpire - ((System.currentTimeMillis() / 1000) + prop.getNowTimeDiff()) < 86400) {
                C4525b.f12443q.mo10346a(Long.valueOf(System.currentTimeMillis()));
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final void mo14017d() {
        Set set = (Set) C4525b.f12323S.mo10345a();
        for (Prop prop : this.f21076a) {
            if (prop.reddotTip && !set.contains(Long.valueOf(prop.f20511id))) {
                set.add(Long.valueOf(prop.f20511id));
            }
        }
        C4525b.f12323S.mo10346a(set);
        C4525b.f12427by.mo10346a(Boolean.valueOf(false));
    }

    /* renamed from: a */
    public final void mo14011a(C7650a aVar) {
        if (aVar != null && !this.f21077b.contains(aVar)) {
            this.f21077b.add(aVar);
        }
    }

    /* renamed from: b */
    public final void mo14014b(C7650a aVar) {
        if (aVar != null && this.f21077b.contains(aVar)) {
            this.f21077b.remove(aVar);
        }
    }

    /* renamed from: a */
    public final Prop mo14010a(long j) {
        for (Prop prop : this.f21076a) {
            if (prop.f20511id == j) {
                return prop;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo14013b(long j) {
        if (!this.f21078c) {
            this.f21078c = true;
            ((PropApi) C4157e.m10322a().mo9550a(PropApi.class)).getPropList(j).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6506a((C1710e<? super T>) new C7651v<Object>(this, SystemClock.uptimeMillis()), (C1710e<? super Throwable>) new C7652w<Object>(this), (C1706a) new C7653x(this));
        }
    }

    /* renamed from: a */
    public final void mo14012a(List<Prop> list) {
        if (!list.isEmpty()) {
            for (Prop prop : list) {
                Prop a = mo14010a(prop.f20511id);
                if (a != null) {
                    this.f21076a.set(this.f21076a.indexOf(a), prop);
                }
            }
            for (C7650a a2 : this.f21077b) {
                a2.mo13539a(this.f21076a);
            }
        }
    }
}
