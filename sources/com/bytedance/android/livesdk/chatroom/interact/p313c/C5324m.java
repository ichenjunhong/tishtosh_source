package com.bytedance.android.livesdk.chatroom.interact.p313c;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5696e;
import com.bytedance.android.livesdk.p330f.C6771f;
import com.bytedance.android.livesdk.p330f.C6772g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.c.m */
public final class C5324m {

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.c.m$a */
    public static abstract class C5325a extends C6771f<C5326b> {
        /* renamed from: a */
        public abstract User mo11207a();

        /* renamed from: a */
        public abstract void mo11208a(int i);

        /* renamed from: a */
        public abstract void mo11209a(long j);

        /* renamed from: a */
        public abstract void mo11210a(C5696e eVar);

        /* renamed from: b */
        public abstract Room mo11211b();

        /* renamed from: c */
        public abstract long mo11212c();

        /* renamed from: d */
        public abstract String mo11213d();

        /* renamed from: d_ */
        public abstract boolean mo11214d_();

        /* renamed from: e */
        public abstract boolean mo11215e();

        /* renamed from: g */
        public abstract C5696e mo11216g();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.c.m$b */
    public interface C5326b extends C6772g {
        /* renamed from: a */
        void mo11217a(int i, boolean z);

        /* renamed from: a */
        void mo11218a(long j);

        /* renamed from: a */
        void mo11219a(User user);

        /* renamed from: a */
        void mo11220a(boolean z);

        /* renamed from: b */
        void mo11221b(boolean z);

        void setVisibility(boolean z);
    }
}
