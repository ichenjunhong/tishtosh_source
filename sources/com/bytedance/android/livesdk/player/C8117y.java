package com.bytedance.android.livesdk.player;

import com.bytedance.android.live.C2942b;
import com.bytedance.android.livesdk.player.C8086g.C8087a;
import com.bytedance.android.livesdk.player.C8086g.C8088b;
import com.bytedance.android.livesdk.player.C8086g.C8089c;
import com.bytedance.android.livesdk.player.p405b.C8078a;
import com.google.gson.C17971f;
import com.p683ss.p2568f.p2569a.C51300a;
import com.p683ss.p2568f.p2569a.p2570a.C51301a;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.player.y */
public final class C8117y implements C51300a {

    /* renamed from: a */
    public C8087a f22173a;

    /* renamed from: b */
    public C8088b f22174b;

    /* renamed from: c */
    private C8078a f22175c;

    /* renamed from: b */
    public final void mo14309b() {
        m16181a(C8089c.BUFFERING_END, 0, "player end buffer");
    }

    /* renamed from: c */
    public final void mo14310c() {
        m16181a(C8089c.PLAY_COMPLETED, 0, "play complete");
    }

    /* renamed from: d */
    public final void mo14311d() {
        m16181a(C8089c.PREPARED, 0, "player is prepared");
    }

    /* renamed from: a */
    public final void mo14303a() {
        m16181a(C8089c.BUFFERING_START, 0, "player start buffer");
    }

    public C8117y(C8078a aVar) {
        this.f22175c = aVar;
    }

    /* renamed from: a */
    public final void mo14306a(String str) {
        m16181a(C8089c.SEI_UPDATE, 0, str);
    }

    /* renamed from: a */
    public final void mo14305a(C51301a aVar) {
        HashMap hashMap;
        C8089c cVar;
        if (aVar != null) {
            C17971f b = C2942b.m8370b();
            if (aVar.info == null) {
                hashMap = new HashMap(2);
            } else {
                hashMap = new HashMap(aVar.info);
            }
            hashMap.put("error_code", String.valueOf(aVar.code));
            if (aVar.code != 0) {
                cVar = C8089c.PREPARE_FAILED;
            } else {
                cVar = C8089c.MEDIA_ERROR;
            }
            hashMap.put("error_description", cVar.name());
            String b2 = b.mo34889b(hashMap);
            if (aVar.code != 0) {
                C8089c cVar2 = C8089c.PREPARE_FAILED;
                int i = aVar.code;
                StringBuilder sb = new StringBuilder("prepare failed.code:");
                sb.append(aVar.code);
                m16181a(cVar2, i, sb.toString());
            }
            m16181a(C8089c.MEDIA_ERROR, aVar.code, b2);
        }
    }

    /* renamed from: a */
    public final void mo14307a(JSONObject jSONObject) {
        boolean z;
        String str;
        StringBuilder sb = new StringBuilder("player==>liveLogSender==null is ");
        if (this.f22175c == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        StringBuilder sb2 = new StringBuilder("player==>player info ");
        if (jSONObject == null) {
            str = "event is null";
        } else {
            str = jSONObject.toString();
        }
        sb2.append(str);
        if (this.f22175c != null) {
            this.f22175c.mo14236a(jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo14308a(boolean z) {
        if (this.f22174b != null) {
            this.f22174b.mo14267f();
        }
        m16181a(C8089c.RENDERING_START, 0, "player start render");
    }

    /* renamed from: a */
    public final void mo14304a(int i, int i2) {
        C8089c cVar = C8089c.VIDEO_SIZE_CHANGED;
        int i3 = (i2 << 16) | i;
        StringBuilder sb = new StringBuilder("videoSizeChanged, width: ");
        sb.append(i);
        sb.append(", height: ");
        sb.append(i2);
        m16181a(cVar, i3, sb.toString());
    }

    /* renamed from: a */
    private void m16181a(C8089c cVar, int i, String str) {
        if (this.f22173a != null) {
            this.f22173a.mo14265a(cVar, i, str);
        }
    }
}
