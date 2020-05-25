package com.bytedance.android.livesdk.chatroom.viewmodule.p326a.p327a;

import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6597a;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a.a.d */
public final class C6434d extends C6597a {

    /* renamed from: a */
    public final int f17715a;

    /* renamed from: b */
    public final int f17716b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6434d) {
                C6434d dVar = (C6434d) obj;
                if (this.f17715a == dVar.f17715a) {
                    if (this.f17716b == dVar.f17716b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.f17715a) * 31) + Integer.hashCode(this.f17716b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowMvpPunishCommand(currentCount=");
        sb.append(this.f17715a);
        sb.append(", targetCount=");
        sb.append(this.f17716b);
        sb.append(")");
        return sb.toString();
    }
}
