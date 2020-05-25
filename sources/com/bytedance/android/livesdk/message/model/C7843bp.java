package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.android.livesdkapi.message.C8845b;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.message.model.bp */
public class C7843bp extends C7859c {
    @C17952c(mo34828a = "type")

    /* renamed from: a */
    public int f21670a;
    @C17952c(mo34828a = "portal_id")

    /* renamed from: b */
    public long f21671b;
    @C17952c(mo34828a = "room_id")

    /* renamed from: c */
    public long f21672c;
    @C17952c(mo34828a = "portal_buy")

    /* renamed from: d */
    protected C7845b f21673d;
    @C17952c(mo34828a = "portal_invite")

    /* renamed from: e */
    protected C7847d f21674e;
    @C17952c(mo34828a = "portal_finish")

    /* renamed from: f */
    protected C7846c f21675f;
    @C17952c(mo34828a = "payload")

    /* renamed from: g */
    public C7844a f21676g;

    /* renamed from: com.bytedance.android.livesdk.message.model.bp$a */
    public interface C7844a {
    }

    /* renamed from: com.bytedance.android.livesdk.message.model.bp$b */
    public static class C7845b implements C7844a {
        @C17952c(mo34828a = "sugar_daddy")

        /* renamed from: a */
        public User f21677a;
    }

    /* renamed from: com.bytedance.android.livesdk.message.model.bp$c */
    public static class C7846c implements C7844a {
        @C17952c(mo34828a = "lucky_person")

        /* renamed from: a */
        public User f21678a;
    }

    /* renamed from: com.bytedance.android.livesdk.message.model.bp$d */
    public static class C7847d implements C7844a {
        @C17952c(mo34828a = "invite_count_down")

        /* renamed from: a */
        public long f21679a;
        @C17952c(mo34828a = "reward_count_down")

        /* renamed from: b */
        public long f21680b;
        @C17952c(mo34828a = "sugar_daddy")

        /* renamed from: c */
        public User f21681c;
        @C17952c(mo34828a = "anchor")

        /* renamed from: d */
        public User f21682d;
    }

    public boolean supportDisplayText() {
        return true;
    }

    public C7843bp() {
        this.type = C8629a.PORTAL_MESSAGE;
    }

    public boolean canText() {
        C8845b bVar = this.baseMessage;
        if (bVar == null || bVar.f24139j == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14154a() {
        switch (this.f21670a) {
            case 1:
                this.f21676g = this.f21673d;
                return;
            case 2:
                this.f21676g = this.f21674e;
                return;
            case 3:
                this.f21676g = this.f21675f;
                break;
        }
    }
}
