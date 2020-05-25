package com.bytedance.android.livesdk.chatroom.p310f;

import android.text.TextUtils;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.android.livesdk.app.dataholder.C4638d;
import com.bytedance.android.livesdk.chatroom.interact.data.p315a.C5354a;
import com.bytedance.android.livesdk.chatroom.interact.data.p315a.C5355b;
import com.bytedance.android.livesdk.chatroom.interact.data.p315a.C5356c;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.p279af.C4568ah;
import com.p683ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import com.p683ss.video.rtc.interact.model.Region;
import com.p683ss.video.rtc.interact.model.TalkingState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.chatroom.f.f */
public final class C5217f {

    /* renamed from: a */
    private long f13942a;

    /* renamed from: b */
    private C5218a f13943b;

    /* renamed from: com.bytedance.android.livesdk.chatroom.f.f$a */
    public interface C5218a {
        /* renamed from: a */
        void mo11056a(C5354a aVar);

        /* renamed from: b */
        boolean mo11057b(int i);
    }

    public C5217f(C5218a aVar) {
        this.f13943b = aVar;
    }

    /* renamed from: a */
    private static C5355b m11831a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C5355b bVar = new C5355b();
        bVar.f14269c = jSONObject.optInt("width");
        bVar.f14268b = jSONObject.optInt("height");
        bVar.f14267a = jSONObject.optString("background");
        return bVar;
    }

    /* renamed from: b */
    private C5354a m11834b(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        long optLong = jSONObject.optLong("timestamp");
        if (optLong == this.f13942a || !jSONObject.has("ver")) {
            return null;
        }
        int optInt = jSONObject.optInt("ver");
        if (!this.f13943b.mo11057b(optInt)) {
            return null;
        }
        this.f13942a = optLong;
        C5354a aVar = new C5354a();
        aVar.f14263c = optLong;
        aVar.f14262b = optInt;
        aVar.f14261a = jSONObject.optString("vendor");
        aVar.f14264d = jSONObject.optString("channel_id");
        aVar.f14265e = m11832a(new JSONArray(jSONObject.optString("grids")));
        aVar.f14266f = m11831a(jSONObject.optJSONObject("canvas"));
        return aVar;
    }

    /* renamed from: a */
    private static List<C5356c> m11832a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = (JSONObject) jSONArray.opt(i);
            C5356c cVar = new C5356c();
            cVar.f14270a = jSONObject.optInt("type");
            cVar.f14275f = jSONObject.optDouble("x");
            cVar.f14276g = jSONObject.optDouble("y");
            cVar.f14273d = jSONObject.optDouble("w");
            cVar.f14274e = jSONObject.optDouble("h");
            try {
                cVar.f14271b = jSONObject.optLong("account");
            } catch (Exception unused) {
                cVar.f14271b = 0;
            }
            if (jSONObject.has("uid")) {
                cVar.f14279j = jSONObject.opt("uid").toString();
            }
            if (jSONObject.has("uid_str")) {
                cVar.f14280k = jSONObject.optString("uid_str");
            }
            if (jSONObject.has("talk")) {
                cVar.f14281l = jSONObject.optInt("talk");
            }
            if (jSONObject.has("mute_audio")) {
                cVar.f14282m = jSONObject.optInt("mute_audio");
            }
            try {
                cVar.f14278i = jSONObject.optInt("stat");
            } catch (Exception unused2) {
                cVar.f14278i = 0;
            }
            arrayList.add(cVar);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo11055a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("info") && jSONObject.has("source") && TextUtils.equals(jSONObject.optString("source"), "zego")) {
                    jSONObject = (JSONObject) jSONObject.get("info");
                }
                if (jSONObject.has("app_data")) {
                    C5354a b = m11834b(jSONObject.getString("app_data").replaceAll("\\\\", ""));
                    if (b != null) {
                        this.f13943b.mo11056a(b);
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public static LayoutParams m11830a(int i, int i2, int i3, int i4, C5356c cVar) {
        LayoutParams layoutParams = new LayoutParams(0, 0);
        float f = (float) i;
        float f2 = (float) i3;
        float f3 = f / f2;
        float f4 = (float) i2;
        float f5 = (float) i4;
        float f6 = f4 / f5;
        if (f3 <= f6) {
            f3 = f6;
        }
        float f7 = f2 * f3;
        float f8 = f5 * f3;
        float f9 = (f7 - f) / 2.0f;
        float f10 = (f8 - f4) / 2.0f;
        double d = (double) f7;
        double d2 = cVar.f14275f;
        Double.isNaN(d);
        double d3 = (d2 * d) + 0.5d;
        double d4 = (double) f9;
        Double.isNaN(d4);
        int i5 = (int) (d3 - d4);
        double d5 = (double) f8;
        double d6 = cVar.f14276g;
        Double.isNaN(d5);
        double d7 = (d6 * d5) + 0.5d;
        double d8 = (double) f10;
        Double.isNaN(d8);
        int i6 = (int) (d7 - d8);
        double d9 = cVar.f14273d;
        Double.isNaN(d);
        int i7 = (int) ((d * d9) + 0.5d);
        double d10 = cVar.f14274e;
        Double.isNaN(d5);
        int i8 = (int) ((d5 * d10) + 0.5d);
        layoutParams.width = i7;
        layoutParams.height = i8;
        layoutParams.leftMargin = i5;
        layoutParams.topMargin = i6;
        return layoutParams;
    }

    /* renamed from: a */
    public static JSONObject m11833a(InteractConfig interactConfig, List<Region> list, int i, int i2, List<TalkingState> list2) {
        int i3;
        HashMap hashMap = new HashMap();
        if (list2 != null) {
            for (TalkingState talkingState : list2) {
                hashMap.put(talkingState.getInteractId(), Boolean.valueOf(talkingState.getTalkingState()));
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ver", interactConfig.getSeiVersion());
            jSONObject.put("vendor", interactConfig.getVendor());
            jSONObject.put("timestamp", System.currentTimeMillis());
            jSONObject.put("channel_id", interactConfig.getChannelName());
            JSONArray jSONArray = new JSONArray();
            for (Region region : list) {
                if (region.needWriteToSei()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("type", region.getMediaType());
                    int i4 = 1;
                    jSONObject2.put("alpha", 1);
                    jSONObject2.put("w", region.getWidth());
                    jSONObject2.put("h", region.getHeight());
                    jSONObject2.put("x", region.getX());
                    jSONObject2.put("y", region.getY());
                    if (((Boolean) LiveConfigSettingKeys.INTERACT_SEI_UID_ENABLE.mo9431a()).booleanValue()) {
                        jSONObject2.put("account", region.getUserId());
                    } else {
                        jSONObject2.put("account", 0);
                    }
                    if (interactConfig.isUseInteractVersionV2()) {
                        String str = "uid";
                        C4638d a = C4638d.m11114a();
                        Integer num = (Integer) a.f12669l.get(region.getInteractId());
                        if (num == null) {
                            i3 = 0;
                        } else {
                            i3 = num.intValue();
                        }
                        jSONObject2.put(str, i3);
                    } else {
                        jSONObject2.put("uid", C4568ah.m10969a(region.getInteractId()));
                    }
                    jSONObject2.put("uid_str", region.getInteractId());
                    jSONObject2.put("zorder", 0);
                    jSONObject2.put("stat", region.getStatus());
                    if (!hashMap.containsKey(region.getInteractId()) || !((Boolean) hashMap.get(region.getInteractId())).booleanValue()) {
                        i4 = 0;
                    }
                    jSONObject2.put("talk", i4);
                    jSONObject2.put("mute_audio", region.isMuteAudio() ? 1 : 0);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("grids", jSONArray);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("width", i);
            jSONObject3.put("height", i2);
            jSONObject3.put("background", "#161823");
            jSONObject.put("canvas", jSONObject3);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
