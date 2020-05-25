package com.p683ss.android.ugc.aweme.effectplatform;

import android.util.Pair;
import com.bytedance.frameworks.baselib.network.http.p574e.C9917l;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.mime.TypedInput;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.effectmanager.common.C48605b;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48640a;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.z */
public final class C29280z implements C48640a {
    /* renamed from: a */
    public final InputStream mo59200a(C48605b bVar) {
        C12799u uVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InputStream inputStream = null;
        try {
            Pair a = C9917l.m19876a(bVar.f122197a, (Map<String, String>) linkedHashMap);
            String str = (String) a.first;
            String str2 = (String) a.second;
            EffectNetworkAPI effectNetworkAPI = (EffectNetworkAPI) C39629l.m88232a().mo58595z().retrofitCreate(str, EffectNetworkAPI.class);
            linkedHashMap.put("game_version", "1.0");
            if ("POST".equals(bVar.f122198b)) {
                uVar = effectNetworkAPI.doPost(true, Integer.MAX_VALUE, str2, bVar.f122201e).execute();
            } else {
                uVar = effectNetworkAPI.doGet(true, Integer.MAX_VALUE, str2, linkedHashMap).execute();
            }
            if (!uVar.mo23960c()) {
                return null;
            }
            InputStream in = ((TypedInput) uVar.f33552b).mo9554in();
            try {
                bVar.f122199c = ((TypedInput) uVar.f33552b).length();
                return in;
            } catch (IOException e) {
                e = e;
                inputStream = in;
                bVar.f122203g = e.getMessage();
                return inputStream;
            } catch (Exception e2) {
                e = e2;
                inputStream = in;
                bVar.f122203g = e.getMessage();
                return inputStream;
            }
        } catch (IOException e3) {
            e = e3;
            bVar.f122203g = e.getMessage();
            return inputStream;
        } catch (Exception e4) {
            e = e4;
            bVar.f122203g = e.getMessage();
            return inputStream;
        }
    }
}
