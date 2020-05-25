package com.bytedance.android.live.broadcast.effect;

import com.bytedance.android.live.broadcast.p213h.p214a.C3413a;
import com.bytedance.android.live.broadcast.p213h.p214a.p215a.C3414a;
import com.bytedance.android.live.broadcast.p213h.p214a.p215a.C3418e;
import com.bytedance.android.livesdk.chatroom.event.C5154aa;
import com.bytedance.android.livesdk.chatroom.event.C5154aa.C5155a;

/* renamed from: com.bytedance.android.live.broadcast.effect.w */
public final class C3381w {

    /* renamed from: a */
    private C3418e f9684a = new C3418e();

    public C3381w(C3413a aVar) {
        aVar.mo8758a((C3414a) this.f9684a);
    }

    public final void onEvent(C5154aa aaVar) {
        if (aaVar != null) {
            int i = aaVar.f13815a;
            C5155a aVar = aaVar.f13816b;
            switch (i) {
                case 201:
                    float f = aVar.f13818b;
                    float f2 = aVar.f13819c;
                    int i2 = aVar.f13817a;
                    if (this.f9684a != null) {
                        C3418e eVar = this.f9684a;
                        if (eVar.f9727a != null) {
                            eVar.f9727a.mo8777a(f, f2, i2);
                        } else {
                            throw new IllegalStateException("Effect is not bind");
                        }
                    }
                    return;
                case 202:
                    float f3 = aVar.f13818b;
                    float f4 = aVar.f13819c;
                    int i3 = aVar.f13817a;
                    if (this.f9684a != null) {
                        C3418e eVar2 = this.f9684a;
                        if (eVar2.f9727a != null) {
                            eVar2.f9727a.mo8785b(f3, f4, i3);
                        } else {
                            throw new IllegalStateException("Effect is not bind");
                        }
                    }
                    return;
                case 203:
                    float f5 = aVar.f13818b;
                    float f6 = aVar.f13819c;
                    float f7 = aVar.f13820d;
                    float f8 = aVar.f13821e;
                    float f9 = aVar.f13822f;
                    if (this.f9684a != null) {
                        C3418e eVar3 = this.f9684a;
                        if (eVar3.f9727a != null) {
                            eVar3.f9727a.mo8776a(f5, f6, f7, f8, f9);
                        } else {
                            throw new IllegalStateException("Effect is not bind");
                        }
                    }
                    return;
                case 204:
                    float f10 = aVar.f13818b;
                    float f11 = aVar.f13819c;
                    if (this.f9684a != null) {
                        C3418e eVar4 = this.f9684a;
                        if (eVar4.f9727a != null) {
                            eVar4.f9727a.mo8784b(f10, f11);
                        } else {
                            throw new IllegalStateException("Effect is not bind");
                        }
                    }
                    return;
                case 205:
                    float f12 = aVar.f13823g;
                    float f13 = aVar.f13822f;
                    if (this.f9684a != null) {
                        C3418e eVar5 = this.f9684a;
                        if (eVar5.f9727a != null) {
                            eVar5.f9727a.mo8786c(f12, f13);
                        } else {
                            throw new IllegalStateException("Effect is not bind");
                        }
                    }
                    return;
                case 206:
                    float f14 = aVar.f13818b;
                    float f15 = aVar.f13819c;
                    if (this.f9684a != null) {
                        C3418e eVar6 = this.f9684a;
                        if (eVar6.f9727a != null) {
                            eVar6.f9727a.mo8775a(f14, f15);
                            break;
                        } else {
                            throw new IllegalStateException("Effect is not bind");
                        }
                    }
                    break;
            }
        }
    }
}
