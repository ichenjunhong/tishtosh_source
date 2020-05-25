package com.bytedance.android.livesdk.schema;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.p289c.C4704c;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.p270ab.C4507h.C4510b;
import com.bytedance.android.livesdk.p270ab.C4507h.C4510b.C4511a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.schema.interfaces.C8260a;
import com.bytedance.android.livesdk.schema.interfaces.C8261b.C8262a;
import com.bytedance.android.livesdk.schema.interfaces.C8263c;
import com.bytedance.android.livesdkapi.depend.model.report.ReportCommitData;
import com.bytedance.common.utility.C9415i;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p093k.C2168a;

public class LiveActionHandlerImpl implements C8260a {
    private RoomActionHandler roomActionHandler = new RoomActionHandler();
    private List<C8263c> schemaHandlers = new ArrayList();
    private C8266k userProfileActionHandler = new C8266k();

    /* renamed from: com.bytedance.android.livesdk.schema.LiveActionHandlerImpl$a */
    public static final class C8249a implements C4510b<C8260a> {
        /* renamed from: a */
        public final C4511a<C8260a> mo10307a(C4511a<C8260a> aVar) {
            return aVar.mo10337a(new LiveActionHandlerImpl()).mo10336a();
        }
    }

    public LiveActionHandlerImpl() {
        this.schemaHandlers.add(this.roomActionHandler);
        this.schemaHandlers.add(this.userProfileActionHandler);
        this.schemaHandlers.add(new C8267l());
        this.schemaHandlers.add(new C8255e());
        C4116c.m10251a(C8260a.class, this);
    }

    public boolean showUserProfile(long j) {
        return C8266k.m16380a(j, null, null);
    }

    static final /* synthetic */ void lambda$postReportReason$0$LiveActionHandlerImpl(C4177d dVar) throws Exception {
        if (dVar != null && dVar.data != null && !TextUtils.isEmpty(((ReportCommitData) dVar.data).desc)) {
            C4575an.m10987a(((ReportCommitData) dVar.data).desc);
        }
    }

    static final /* synthetic */ void lambda$postReportReason$1$LiveActionHandlerImpl(Throwable th) throws Exception {
        if (th instanceof C2949a) {
            C4575an.m10987a(((C2949a) th).getErrorMsg());
            C9415i.m18634a(th);
        }
    }

    public boolean canHandle(Uri uri) {
        for (C8263c canHandle : this.schemaHandlers) {
            if (canHandle.canHandle(uri)) {
                return true;
            }
        }
        return false;
    }

    public C8263c getHandler(Uri uri) {
        for (C8263c cVar : this.schemaHandlers) {
            if (cVar.canHandle(uri)) {
                return cVar;
            }
        }
        return null;
    }

    public boolean handle(Context context, Uri uri) {
        return handleSchema(context, uri, true);
    }

    public boolean openRoom(Context context, C8262a aVar) {
        return this.roomActionHandler.handleEnterRoom(context, aVar);
    }

    public boolean handle(Context context, String str) {
        return handleSchema(context, Uri.parse(str), true);
    }

    public boolean handleWithoutHost(Context context, String str) {
        return handleSchema(context, Uri.parse(str), false);
    }

    public boolean showUserProfile(long j, String str, Map<String, String> map) {
        return C8266k.m16380a(j, str, map);
    }

    private boolean handleSchema(Context context, Uri uri, boolean z) {
        if ((TextUtils.equals(uri.getScheme(), WebKitApi.SCHEME_HTTP) || TextUtils.equals(uri.getScheme(), WebKitApi.SCHEME_HTTPS)) && z) {
            C4514j.m10883j().mo10322c().mo10490a(context, C4704c.m11227b(uri.toString()));
            return true;
        }
        C8263c handler = getHandler(uri);
        if (handler != null) {
            return handler.handle(context, uri);
        }
        if (!z || !TTLiveSDKContext.getHostService().mo10313f().mo14429a(context, uri.toString())) {
            return false;
        }
        return true;
    }

    public void postReportReason(long j, long j2, long j3, String str) {
        ((RoomRetrofitApi) C4514j.m10883j().mo10321b().mo9550a(RoomRetrofitApi.class)).postReportReasons(j, j2, j3, str).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a(C8253c.f22568a, C8254d.f22569a);
    }
}
