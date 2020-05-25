package com.bytedance.android.livesdk.message.p396a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.live.network.C4163i;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.chatroom.api.MessageApi;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.message.C7790d;
import com.bytedance.android.livesdk.message.model.C7835bj;
import com.bytedance.android.livesdk.message.model.C7859c;
import com.bytedance.android.livesdk.p279af.C4574am;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.android.livesdkapi.C8728e;
import com.bytedance.android.livesdkapi.host.C8777a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.message.C8846c;
import com.bytedance.android.livesdkapi.message.C8849f;
import com.bytedance.android.livesdkapi.message.C8849f.C8850a;
import com.bytedance.android.livesdkapi.p430b.C8607a;
import com.bytedance.android.livesdkapi.p455i.C8815e;
import com.bytedance.android.message.IMessageService;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2890d;
import com.bytedance.android.p173d.p174a.p175a.C2890d.C2892b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.common.utility.C9414h;
import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.C12799u;
import com.google.gson.C18082l;
import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import com.p683ss.ugc.live.sdk.message.data.ProtoApiResult;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageClient;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageClient.Callback;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.message.a.b */
public final class C7774b implements C8728e, IMessageClient {

    /* renamed from: b */
    private static final int f21365b = ((Integer) LiveSettingKeys.HOT_LIVE_MESSAGE_SIZE.mo9431a()).intValue();

    /* renamed from: a */
    public String f21366a;

    /* renamed from: c */
    private Callback f21367c;

    /* renamed from: d */
    private long f21368d;

    /* renamed from: e */
    private long f21369e;

    /* renamed from: f */
    private Context f21370f;

    /* renamed from: g */
    private MessageApi f21371g = ((MessageApi) C4157e.m10322a().mo9550a(MessageApi.class));

    /* renamed from: h */
    private long f21372h;

    /* renamed from: i */
    private String f21373i;

    /* renamed from: j */
    private String f21374j;

    /* renamed from: k */
    private long f21375k;

    /* renamed from: l */
    private long f21376l;

    /* renamed from: m */
    private long f21377m;

    /* renamed from: n */
    private boolean f21378n = true;

    /* renamed from: o */
    private boolean f21379o = true;

    /* renamed from: p */
    private C2895g f21380p = new C2895g();

    public final void connectToWebSocket() {
    }

    public final void disconnectFromWebSocket() {
    }

    /* renamed from: a */
    private void m15828a() {
        this.f21375k = -1;
        this.f21376l = 0;
        this.f21377m = 0;
    }

    public final long getUserId() {
        if (this.f21369e > 0) {
            return this.f21369e;
        }
        this.f21369e = ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b();
        return this.f21369e;
    }

    public final void setCallback(Callback callback) {
        this.f21367c = callback;
    }

    public C7774b(boolean z) {
        String str;
        if (z) {
            str = "anchor";
        } else {
            str = "audience";
        }
        this.f21373i = str;
    }

    /* renamed from: a */
    private ProtoApiResult m15827a(C2892b bVar) throws Exception {
        boolean z;
        C2888b protoDecoder = ((INetworkService) C4116c.m10249a(INetworkService.class)).getProtoDecoder(C8849f.class);
        if (protoDecoder != null) {
            C8849f fVar = (C8849f) protoDecoder.decode(this.f21380p.mo7515a(bVar));
            ProtoApiResult protoApiResult = new ProtoApiResult();
            protoApiResult.cursor = fVar.f24149b;
            protoApiResult.fetchInterval = fVar.f24150c;
            protoApiResult.now = fVar.f24151d;
            protoApiResult.messages = new LinkedList();
            this.f21374j = fVar.f24152e;
            long currentTimeMillis = System.currentTimeMillis();
            this.f21375k = currentTimeMillis - this.f21372h;
            C4574am.m10980c((fVar.f24151d + ((currentTimeMillis - this.f21372h) / 2)) - currentTimeMillis);
            if (C9414h.m18630a(fVar.f24148a)) {
                return protoApiResult;
            }
            if (fVar.f24148a.size() > f21365b) {
                z = true;
            } else {
                z = false;
            }
            for (C8850a aVar : fVar.f24148a) {
                if (!TextUtils.isEmpty(aVar.f24153a) && aVar.f24154b != null && aVar.f24154b.length > 0) {
                    C7859c cVar = null;
                    try {
                        Class messageClass = ((IMessageService) C4116c.m10249a(IMessageService.class)).getMessageClass(aVar.f24153a);
                        if (messageClass != null) {
                            C2888b protoDecoder2 = ((INetworkService) C4116c.m10249a(INetworkService.class)).getProtoDecoder(messageClass);
                            if (protoDecoder2 != null) {
                                cVar = (C7859c) protoDecoder2.decode(this.f21380p.mo7515a(C2890d.m8204a(aVar.f24154b)));
                            } else {
                                C7790d.m15851a(new Throwable("Failed to decode, message decoder is null!"), aVar.f24153a);
                            }
                            if (((Boolean) C4163i.f11354b.mo9431a()).booleanValue()) {
                                C8846c cVar2 = new C8846c(aVar.f24153a, C2942b.m8369a().mo34875a((Object) cVar).mo35009m());
                                INetworkService iNetworkService = (INetworkService) C4116c.m10249a(INetworkService.class);
                                StringBuilder sb = new StringBuilder("https://board.bytedance.net/api/json/message/");
                                sb.append(cVar.baseMessage.f24134e);
                                C8846c cVar3 = (C8846c) C2942b.m8369a().mo34884a(new String(((C8815e) iNetworkService.post(sb.toString(), new ArrayList(), "application/json", C2942b.m8369a().mo34889b(cVar2).getBytes()).mo15805a()).f24066e), C8846c.class);
                                cVar = (C7859c) C2942b.m8369a().mo34881a((C18082l) cVar3.f24142b, ((IMessageService) C4116c.m10249a(IMessageService.class)).getMessageClass(cVar3.f24141a));
                            }
                            if (cVar != null) {
                                cVar.timestamp = fVar.f24151d;
                                cVar.isTooMuchMsg = z;
                                ((C8777a) C4116c.m10249a(C8777a.class)).mo15488a().mo15412a();
                                if (this.f21378n) {
                                    this.f21378n = false;
                                    C7790d.m15849a("ON_FIRST_MSG_RECEIVED", aVar.f24153a, cVar.getMessageId());
                                }
                                if (this.f21379o && (cVar instanceof C7835bj) && ((C7835bj) cVar).f21634b != null && ((C7835bj) cVar).f21634b.getId() == ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b()) {
                                    this.f21379o = false;
                                    C7790d.m15849a("ON_SELF_ENTER_MSG_RECEIVED", "WebcastMemberMessage", cVar.getMessageId());
                                }
                            }
                            if (cVar != null) {
                                protoApiResult.messages.add(cVar);
                            }
                        }
                    } catch (Throwable th) {
                        C8064d.m16005b();
                        C8064d.m9718a(6, th.getStackTrace());
                        C7790d.m15851a(th, aVar.f24153a);
                    }
                }
            }
            this.f21376l = (long) fVar.f24148a.size();
            this.f21377m = (long) protoApiResult.messages.size();
            return protoApiResult;
        }
        throw new AssertionError("No ProtoDecoder found for ProtoMessageFetchResult??!");
    }

    public final void apiCall(Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("resp_content_type", "protobuf");
        if (C8607a.f23572a) {
            map.put("app_language", this.f21370f.getResources().getConfiguration().locale.getLanguage());
        }
        map.put("live_id", String.valueOf(((IHostContext) C4116c.m10249a(IHostContext.class)).liveId()));
        map.remove("fetch_time");
        map.remove("ack_ids");
        map.put("identity", this.f21373i);
        map.put("last_rtt", String.valueOf(this.f21375k));
        map.put("recv_cnt", String.valueOf(this.f21376l));
        map.put("parse_cnt", String.valueOf(this.f21377m));
        if (!TextUtils.isEmpty(this.f21374j)) {
            map.put("internal_ext", this.f21374j);
        }
        if (this.f21371g == null) {
            this.f21371g = (MessageApi) C4157e.m10322a().mo9550a(MessageApi.class);
        }
        this.f21366a = this.f21366a;
        C12690b fetchMessagePbByteArraySource = this.f21371g.fetchMessagePbByteArraySource(this.f21368d, map, this.f21366a);
        try {
            this.f21372h = System.currentTimeMillis();
            C12799u execute = fetchMessagePbByteArraySource.execute();
            if (execute.mo23960c()) {
                try {
                    if (this.f21367c != null) {
                        this.f21367c.onApiSuccess(m15827a((C2892b) execute.f33552b));
                    }
                } catch (Exception e) {
                    m15828a();
                    if (this.f21367c != null) {
                        this.f21367c.onApiError(e);
                    }
                    StringBuilder sb = new StringBuilder("Parse error, message:");
                    sb.append(e.getMessage());
                    C7790d.m15848a(sb.toString(), Log.getStackTraceString(e));
                }
            } else {
                m15828a();
                if (this.f21367c != null) {
                    this.f21367c.onApiError(new Exception(String.valueOf(execute.mo23958a())));
                }
                StringBuilder sb2 = new StringBuilder("Api error, error_code:");
                sb2.append(execute.mo23958a());
                C7790d.m15848a(sb2.toString(), (String) null);
            }
        } catch (Exception e2) {
            m15828a();
            if (this.f21367c != null) {
                this.f21367c.onApiError(e2);
            }
            StringWriter stringWriter = new StringWriter();
            C17840a.m43751a((Throwable) e2, new PrintWriter(stringWriter));
            C7790d.m15848a(e2.getMessage(), stringWriter.toString());
        }
    }

    /* renamed from: a */
    public final void mo14119a(long j, Context context) {
        this.f21368d = j;
        this.f21370f = context.getApplicationContext();
    }
}
