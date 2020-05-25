package com.bytedance.android.livesdk.chatroom.detail;

import android.content.Context;
import android.view.TextureView;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.android.livesdkapi.depend.model.live.C8725y.C8726a;
import com.bytedance.android.p160b.C2831a.C2832a;
import com.bytedance.android.p160b.C2833b;
import com.bytedance.android.p160b.C2833b.C2834a;
import com.bytedance.common.utility.C9431p;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/* renamed from: com.bytedance.android.livesdk.chatroom.detail.l */
public class C5078l {

    /* renamed from: c */
    private static volatile C5078l f13634c;

    /* renamed from: a */
    private Map<String, C2833b> f13635a = new HashMap();

    /* renamed from: b */
    private Queue<C2833b> f13636b = new LinkedList();

    /* renamed from: a */
    public static C5078l m11603a() {
        if (f13634c == null) {
            synchronized (C5078l.class) {
                if (f13634c == null) {
                    f13634c = new C5078l();
                }
            }
        }
        return f13634c;
    }

    /* renamed from: b */
    public static boolean m11606b() {
        Boolean bool = (Boolean) LiveSettingKeys.ENABLE_ENTER_ROOM_OPT_REUSE_ROOM_PLAYER.mo9431a();
        if (bool == null || bool.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public C2833b mo10972a(String str) {
        return (C2833b) this.f13635a.get(str);
    }

    /* renamed from: a */
    public final void mo10973a(C2833b bVar) {
        String playerTag = bVar.getPlayerTag();
        if (playerTag != null) {
            bVar.release();
            this.f13635a.remove(playerTag);
            this.f13636b.offer(bVar);
        }
    }

    /* renamed from: a */
    private static boolean m11605a(Context context, String str, String str2) {
        if (context == null) {
            return false;
        }
        if (!C9431p.m18664a(str) || !C9431p.m18664a(str2)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m11604a(C2833b bVar, Context context, TextureView textureView, C2832a aVar) {
        if (bVar != null) {
            bVar.attach(context, textureView, aVar);
        }
    }

    /* renamed from: a */
    public C2833b mo10971a(long j, Context context, String str, String str2, String str3, String str4, C8726a aVar, C8710m mVar) {
        if (!m11605a(context, str, str3)) {
            return null;
        }
        C2833b b = mo10974b(j, context, str, str2, str3, str4, aVar, mVar);
        b.warmUp();
        return b;
    }

    /* renamed from: b */
    public C2833b mo10974b(long j, Context context, String str, String str2, String str3, String str4, C8726a aVar, C8710m mVar) {
        C2833b bVar;
        C2834a a = C2834a.m8085a(context.getApplicationContext()).mo7467a(str3).mo7468b(str4).mo7469c(str).mo7470d(str2).mo7465a(mVar).mo7466a(aVar);
        if (this.f13636b.isEmpty()) {
            bVar = null;
        } else {
            bVar = (C2833b) this.f13636b.poll();
        }
        if (bVar == null) {
            bVar = new RoomPlayer2(j, a);
        } else {
            bVar.initialize(j, a);
        }
        this.f13635a.put(bVar.getPlayerTag(), bVar);
        return bVar;
    }
}
