package com.bytedance.android.livesdk.chatroom.interact.p313c;

import android.arch.lifecycle.C0176h.C0177a;
import android.view.View;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p229f.C3846a;
import com.bytedance.android.live.core.rxutils.C4056e;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.rxutils.autodispose.C3991a;
import com.bytedance.android.live.core.rxutils.autodispose.C4004ae;
import com.bytedance.android.live.core.rxutils.autodispose.C4021e;
import com.bytedance.android.live.core.rxutils.autodispose.C4034m;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5321l.C5323b;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.c.c */
public final class C5294c {

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.c.c$a */
    public static abstract class C5295a<V extends C5296b> {

        /* renamed from: a */
        final String f14143a = getClass().getSimpleName();

        /* renamed from: b */
        protected V f14144b;

        /* renamed from: c */
        protected final LinkCrossRoomDataHolder f14145c = LinkCrossRoomDataHolder.m11103a();

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final <S> C4034m<S> mo11146a() {
            return this.f14144b.mo11153f();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final <R> C4034m<R> mo11148b() {
            return this.f14144b.mo11154g();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo11147a(Throwable th) {
            C3831a.m9706a(6, this.f14143a, th.getStackTrace());
        }

        public C5295a(V v) {
            this.f14144b = v;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.c.c$b */
    public static abstract class C5296b<T extends C5295a> extends C3846a {

        /* renamed from: a */
        public C5323b f14146a;

        /* renamed from: b */
        public final String f14147b = getClass().getSimpleName();

        /* renamed from: c */
        public T f14148c;

        /* renamed from: d */
        protected final LinkCrossRoomDataHolder f14149d = LinkCrossRoomDataHolder.m11103a();

        /* renamed from: b */
        public abstract String mo11149b();

        /* renamed from: c */
        public abstract float mo11150c();

        /* renamed from: d */
        public View mo11151d() {
            return null;
        }

        /* renamed from: e */
        public View mo11152e() {
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public final <S> C4034m<S> mo11153f() {
            return C4021e.m10136a(this.f14146a.mo11098d());
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public final <R> C4034m<R> mo11154g() {
            return C4021e.m10142a((C4004ae) C3991a.m10107a(this.f14146a.mo11098d(), C0177a.ON_DESTROY), (C4056e<T>) C4064k.m10182a());
        }
    }
}
