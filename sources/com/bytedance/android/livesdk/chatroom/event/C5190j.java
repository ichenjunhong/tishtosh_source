package com.bytedance.android.livesdk.chatroom.event;

import com.bytedance.android.livesdk.gift.model.C7505d;

/* renamed from: com.bytedance.android.livesdk.chatroom.event.j */
public class C5190j {

    /* renamed from: a */
    public C7505d f13898a;

    /* renamed from: b */
    public int f13899b;

    /* renamed from: c */
    public boolean f13900c;

    public C5190j(C7505d dVar) {
        this.f13898a = dVar;
    }

    public C5190j(C7505d dVar, int i) {
        this(dVar, i, false);
    }

    public C5190j(C7505d dVar, int i, boolean z) {
        this.f13898a = dVar;
        this.f13899b = i;
        this.f13900c = z;
    }
}
