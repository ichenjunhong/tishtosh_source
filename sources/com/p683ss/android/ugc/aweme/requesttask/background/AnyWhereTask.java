package com.p683ss.android.ugc.aweme.requesttask.background;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.geckox.C10026a;
import com.bytedance.geckox.C10044b.C10047a;
import com.bytedance.geckox.model.CheckRequestBodyModel.GroupType;
import com.bytedance.geckox.model.CheckRequestBodyModel.TargetChannel;
import com.bytedance.geckox.p607f.C10105a;
import com.bytedance.geckox.p612j.C10120b;
import com.bytedance.ies.geckoclient.C10885e;
import com.bytedance.ies.geckoclient.C10885e.C10895a;
import com.bytedance.ies.geckoclient.C10897g;
import com.bytedance.ies.geckoclient.model.C10957d;
import com.bytedance.ies.geckoclient.p679a.C10865a.C10867a;
import com.bytedance.ies.geckoclient.p679a.C10868b;
import com.bytedance.ies.geckoclient.p682d.C10882b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.anywheredoor_api.C18837a;
import com.p683ss.android.common.applog.TeaAgent;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.commerce.p1529a.C25484a;
import com.p683ss.android.ugc.aweme.gecko.C32803b;
import com.p683ss.android.ugc.aweme.gecko.GeckoXNetImpl;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.utils.C47731bq;
import com.p683ss.android.ugc.aweme.utils.p2389c.C47744a;
import com.p683ss.android.ugc.aweme.web.C48275e;
import com.p683ss.android.ugc.aweme.web.C48380q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.requesttask.background.AnyWhereTask */
public class AnyWhereTask implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BACKGROUND;
    }

    private static Set<String> getAnyWhereChannel() {
        HashSet hashSet = new HashSet();
        List<C18837a> geckoChannels = C25484a.m61998a().getGeckoChannels();
        if (!geckoChannels.isEmpty()) {
            for (C18837a aVar : geckoChannels) {
                if (aVar != null) {
                    hashSet.add(aVar.getChannelName());
                }
            }
        }
        return hashSet;
    }

    private C10026a initAnyWhereGeckoXClient() {
        String serverDeviceId = TeaAgent.getServerDeviceId();
        if (TextUtils.isEmpty(serverDeviceId)) {
            serverDeviceId = "0";
        }
        try {
            return C10026a.m20173a(new C10047a(C11010c.m22280a()).mo18024a((C10120b) new GeckoXNetImpl(C11010c.m22280a())).mo18031c(C48380q.m104676k()).mo18026a(C11010c.m22294o()).mo18023a((long) C11010c.m22289j()).mo18030b(C48380q.m104672e().mo95835l()).mo18029b(serverDeviceId).mo18025a(C48380q.m104672e().mo95834j()).mo18028a());
        } catch (Exception unused) {
            return null;
        }
    }

    private C10026a initAnyWhereGeckoXMultiClient() {
        String serverDeviceId = TeaAgent.getServerDeviceId();
        if (TextUtils.isEmpty(serverDeviceId)) {
            serverDeviceId = "0";
        }
        try {
            return C10026a.m20173a(new C10047a(C11010c.m22280a()).mo18024a((C10120b) new GeckoXNetImpl(C11010c.m22280a())).mo18031c(C48380q.m104676k()).mo18026a(C11010c.m22294o()).mo18023a((long) C11010c.m22289j()).mo18027a(C48380q.m104672e().mo95835l()).mo18030b(C48380q.m104672e().mo95835l()).mo18029b(serverDeviceId).mo18025a(C48380q.m104672e().mo95834j()).mo18028a());
        } catch (Exception unused) {
            return null;
        }
    }

    private static C10885e initAnyWhereGeckoClient() {
        String serverDeviceId = TeaAgent.getServerDeviceId();
        if (TextUtils.isEmpty(serverDeviceId)) {
            serverDeviceId = "0";
        }
        String str = serverDeviceId;
        String l = C48380q.m104672e().mo95835l();
        Set<String> anyWhereChannel = getAnyWhereChannel();
        try {
            C10895a a = C10885e.m22071a(C11010c.m22280a(), l, C11010c.m22288i(), str, C48380q.m104672e().mo95833g(), "live_gecko", C11010c.m22289j()).mo19691a(C48380q.m104676k()).mo19689a((C10897g) new C48275e()).mo19687a((C10882b) new C32803b()).mo19692a(C47731bq.m103338b()).mo19686a(new C10867a().mo19639a(C10868b.f29174a).mo19640a());
            for (String dVar : anyWhereChannel) {
                a.mo19690a(new C10957d(dVar));
            }
            return a.mo19693a();
        } catch (Exception unused) {
            return null;
        }
    }

    private static List<TargetChannel> getTargetChannels(Set<String> set) {
        ArrayList arrayList = new ArrayList();
        if (!C23715d.m58202a((Collection<T>) set)) {
            for (String str : set) {
                TargetChannel targetChannel = new TargetChannel();
                targetChannel.channelName = str;
                arrayList.add(targetChannel);
            }
        }
        return arrayList;
    }

    public void run(Context context) {
        if (!C47744a.m103372a()) {
            C10885e initAnyWhereGeckoClient = initAnyWhereGeckoClient();
            if (initAnyWhereGeckoClient != null) {
                initAnyWhereGeckoClient.mo19662a(new String[0]);
            }
        } else if (C47731bq.m103354g()) {
            C10026a initAnyWhereGeckoXMultiClient = initAnyWhereGeckoXMultiClient();
            if (initAnyWhereGeckoXMultiClient != null) {
                HashMap hashMap = new HashMap();
                hashMap.put(C48380q.m104672e().mo95835l(), getTargetChannels(getAnyWhereChannel()));
                initAnyWhereGeckoXMultiClient.mo18001a(GroupType.NORMAL.getValue(), null, hashMap, null);
            }
        } else {
            C10026a initAnyWhereGeckoXClient = initAnyWhereGeckoXClient();
            if (initAnyWhereGeckoXClient != null) {
                initAnyWhereGeckoXClient.mo18003a((List<String>) new ArrayList<String>(getAnyWhereChannel()), (C10105a) null);
            }
        }
    }
}
