package com.bytedance.android.livesdk.message.p396a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.chatroom.api.MessageApi;
import com.bytedance.android.livesdk.message.model.C7859c;
import com.bytedance.android.livesdk.p279af.C4574am;
import com.bytedance.android.livesdkapi.C8728e;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.message.C8849f;
import com.bytedance.android.livesdkapi.message.C8849f.C8850a;
import com.bytedance.android.livesdkapi.p430b.C8607a;
import com.bytedance.android.message.IMessageService;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2890d;
import com.bytedance.android.p173d.p174a.p175a.C2890d.C2892b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.C12799u;
import com.p683ss.ugc.live.sdk.message.data.ProtoApiResult;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageClient;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageClient.Callback;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.message.a.a */
public class C7773a implements C8728e, IMessageClient {

    /* renamed from: a */
    private static final String f21352a = "a";

    /* renamed from: b */
    private Callback f21353b;

    /* renamed from: c */
    private long f21354c;

    /* renamed from: d */
    private long f21355d;

    /* renamed from: e */
    private Context f21356e;

    /* renamed from: f */
    private MessageApi f21357f = ((MessageApi) C4157e.m10322a().mo9550a(MessageApi.class));

    /* renamed from: g */
    private long f21358g;

    /* renamed from: h */
    private String f21359h;

    /* renamed from: i */
    private String f21360i;

    /* renamed from: j */
    private long f21361j;

    /* renamed from: k */
    private boolean f21362k;

    /* renamed from: l */
    private boolean f21363l;

    /* renamed from: m */
    private C2895g f21364m = new C2895g();

    public void connectToWebSocket() {
    }

    public void disconnectFromWebSocket() {
    }

    public long getUserId() {
        if (this.f21355d > 0) {
            return this.f21355d;
        }
        this.f21355d = ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b();
        return this.f21355d;
    }

    public void setCallback(Callback callback) {
        this.f21353b = callback;
    }

    public void apiCall(Map<String, String> map) {
        if (!this.f21362k) {
            map.put("get_history", "1");
            this.f21362k = true;
        }
        m15825a(map, this.f21357f.fetchMessagePbByteArraySource(this.f21354c, map, null));
    }

    public C7773a(boolean z) {
        String str;
        if (z) {
            str = "anchor";
        } else {
            str = "audience";
        }
        this.f21359h = str;
    }

    /* renamed from: a */
    private void m15824a(Map<String, String> map) {
        if (C8607a.f23572a) {
            map.put("app_language", this.f21356e.getResources().getConfiguration().locale.getLanguage());
        }
        map.put("live_id", String.valueOf(((IHostContext) C4116c.m10249a(IHostContext.class)).liveId()));
        map.remove("fetch_time");
        map.remove("ack_ids");
        map.put("identity", this.f21359h);
        map.put("last_rtt", String.valueOf(this.f21361j));
        if (!TextUtils.isEmpty(this.f21360i)) {
            map.put("internal_ext", this.f21360i);
        }
    }

    /* renamed from: a */
    private ProtoApiResult m15823a(C2892b bVar) throws Exception {
        C2888b protoDecoder = ((INetworkService) C4116c.m10249a(INetworkService.class)).getProtoDecoder(C8849f.class);
        if (protoDecoder != null) {
            C8849f fVar = (C8849f) protoDecoder.decode(this.f21364m.mo7515a(bVar));
            ProtoApiResult protoApiResult = new ProtoApiResult();
            protoApiResult.cursor = fVar.f24149b;
            protoApiResult.fetchInterval = fVar.f24150c;
            protoApiResult.now = fVar.f24151d;
            protoApiResult.messages = new LinkedList();
            this.f21360i = fVar.f24152e;
            if (!this.f21363l) {
                protoApiResult.cursor = "1";
                this.f21363l = true;
            } else {
                protoApiResult.cursor = fVar.f24149b;
            }
            protoApiResult.fetchInterval = fVar.f24150c;
            protoApiResult.now = fVar.f24151d;
            this.f21360i = fVar.f24152e;
            long currentTimeMillis = System.currentTimeMillis();
            this.f21361j = currentTimeMillis - this.f21358g;
            C4574am.m10980c((protoApiResult.now + ((currentTimeMillis - this.f21358g) / 2)) - currentTimeMillis);
            protoApiResult.messages = new ArrayList();
            if (fVar.f24148a == null || fVar.f24148a.isEmpty()) {
                return protoApiResult;
            }
            for (C8850a aVar : fVar.f24148a) {
                if (!TextUtils.isEmpty(aVar.f24153a) && aVar.f24154b != null && aVar.f24154b.length > 0) {
                    C7859c cVar = null;
                    try {
                        Class messageClass = ((IMessageService) C4116c.m10249a(IMessageService.class)).getMessageClass(aVar.f24153a);
                        if (messageClass != null) {
                            C2888b protoDecoder2 = ((INetworkService) C4116c.m10249a(INetworkService.class)).getProtoDecoder(messageClass);
                            if (protoDecoder2 != null) {
                                cVar = (C7859c) protoDecoder2.decode(this.f21364m.mo7515a(C2890d.m8204a(aVar.f24154b)));
                            }
                            if (cVar != null) {
                                protoApiResult.messages.add(cVar);
                            }
                        }
                    } catch (IOException unused) {
                    }
                }
            }
            return protoApiResult;
        }
        throw new AssertionError("No ProtoDecoder found for ProtoMessageFetchResult??!");
    }

    /* renamed from: a */
    public final void mo14113a(long j, Context context) {
        this.f21354c = j;
        this.f21356e = context.getApplicationContext();
    }

    /* renamed from: a */
    private void m15825a(Map<String, String> map, C12690b<C2892b> bVar) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("resp_content_type", "protobuf");
        m15824a(map);
        if (this.f21357f == null) {
            this.f21357f = (MessageApi) C4157e.m10322a().mo9550a(MessageApi.class);
        }
        try {
            this.f21358g = System.currentTimeMillis();
            C12799u execute = bVar.execute();
            if (!execute.mo23960c()) {
                this.f21361j = -1;
                if (this.f21353b != null) {
                    this.f21353b.onApiError(new Exception(String.valueOf(execute.mo23958a())));
                }
            } else if (this.f21353b != null) {
                try {
                    this.f21353b.onApiSuccess(m15823a((C2892b) execute.f33552b));
                } catch (Exception unused) {
                }
            }
        } catch (Exception e) {
            this.f21361j = -1;
            if (this.f21353b != null) {
                this.f21353b.onApiError(e);
            }
        }
    }
}
