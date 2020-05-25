package com.bytedance.p702im.core.internal.p718b.p719a;

import com.bytedance.p702im.core.internal.C11261a;
import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.internal.utils.C11463b;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.proto.Config;
import com.bytedance.p702im.core.proto.GetConfigsRequestBody;
import com.bytedance.p702im.core.proto.IMCMD;
import com.bytedance.p702im.core.proto.RequestBody.Builder;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.b.a.i */
public final class C11386i extends C11406q<Void> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20952a() {
        return true;
    }

    public C11386i() {
        super(IMCMD.GET_CONFIGS.getValue());
    }

    /* renamed from: b */
    public final void mo21048b() {
        mo21053a(0, new Builder().get_configs_body(new GetConfigsRequestBody.Builder().build()).build(), null, new Object[0]);
    }

    public C11386i(C11162b<Void> bVar) {
        super(IMCMD.GET_CONFIGS.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20947a(C11447f fVar) {
        if (fVar == null || fVar.f30732g == null || fVar.f30732g.body == null || fVar.f30732g.body.get_configs_body == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20946a(C11447f fVar, Runnable runnable) {
        if (!fVar.mo21093g() || !mo20947a(fVar)) {
            mo21058b(fVar);
            return;
        }
        List<Config> list = fVar.f30732g.body.get_configs_body.configs;
        if (list != null && !list.isEmpty()) {
            for (Config config : list) {
                if (!(config == null || config.conf_name == null || config.conf_value == null)) {
                    String str = config.conf_name;
                    char c = 65535;
                    switch (str.hashCode()) {
                        case -1302860124:
                            if (str.equals("conversationMsgRepairCount")) {
                                c = 5;
                                break;
                            }
                            break;
                        case -1289425504:
                            if (str.equals("conversationMsgRepairRatio")) {
                                c = 6;
                                break;
                            }
                            break;
                        case -1287953929:
                            if (str.equals("conversationMsgRepairStart")) {
                                c = 4;
                                break;
                            }
                            break;
                        case -119092197:
                            if (str.equals("autoFetchMsgInterval")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 150002420:
                            if (str.equals("repairEnabled")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1000562987:
                            if (str.equals("autoFetchMsgEnabled")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1056039696:
                            if (str.equals("conversationMsgRepairInterval")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            C11261a.f30327a = C11463b.m23444a(config.conf_value, C11261a.f30327a);
                            break;
                        case 1:
                            C11261a.f30328b = C11463b.m23443a(config.conf_value, C11261a.f30328b);
                            break;
                        case 2:
                            C11261a.f30329c = C11463b.m23444a(config.conf_value, C11261a.f30329c);
                            break;
                        case 3:
                            C11261a.f30330d = C11463b.m23443a(config.conf_value, C11261a.f30330d);
                            break;
                        case 4:
                            C11261a.f30331e = C11463b.m23443a(config.conf_value, C11261a.f30331e);
                            break;
                        case 5:
                            C11261a.f30332f = C11463b.m23442a(config.conf_value, C11261a.f30332f);
                            break;
                        case 6:
                            C11261a.f30333g = C11463b.m23441a(config.conf_value, C11261a.f30333g);
                            break;
                    }
                }
            }
        }
        mo21055a(null);
    }
}
