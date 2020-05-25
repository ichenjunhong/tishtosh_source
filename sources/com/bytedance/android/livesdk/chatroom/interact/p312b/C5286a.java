package com.bytedance.android.livesdk.chatroom.interact.p312b;

import com.bytedance.android.livesdk.app.dataholder.C4638d;
import com.bytedance.android.livesdk.chatroom.interact.data.C5358c;
import com.p683ss.avframework.livestreamv2.core.LiveCore.InteractConfig;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.b.a */
public final class C5286a {
    /* renamed from: c */
    private static long m11967c() {
        return 4120036982L;
    }

    /* renamed from: a */
    private static String m11964a() {
        return C5358c.m12166a();
    }

    /* renamed from: b */
    private static String m11966b() {
        return C5358c.m12167b();
    }

    /* renamed from: d */
    private static byte[] m11968d() {
        return C5358c.m12168c();
    }

    /* renamed from: e */
    private static String m11969e() {
        return C4638d.m11114a().f12664g;
    }

    /* renamed from: a */
    public static void m11965a(InteractConfig interactConfig) {
        interactConfig.setAgoraAppId(m11964a()).setAgoraAppKey(m11969e()).setZegoAppId(m11967c()).setZegoSignature(m11968d()).setZegoThirdPartyToken(m11969e()).setByteAppId(m11966b()).setByteToken(m11969e());
    }
}
