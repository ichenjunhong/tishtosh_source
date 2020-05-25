package com.p683ss.android.ugc.aweme.poi.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.model.av */
public final class C39116av extends BaseResponse {
    @C17952c(mo34828a = "poi_list")

    /* renamed from: a */
    public List<PoiStruct> f99784a;
    @C17952c(mo34828a = "has_more")

    /* renamed from: b */
    public boolean f99785b;
    @C17952c(mo34828a = "page")

    /* renamed from: c */
    public int f99786c;
    @C17952c(mo34828a = "current_loc")

    /* renamed from: d */
    public PoiStruct f99787d;
    @C17952c(mo34828a = "log_pb")

    /* renamed from: e */
    public LogPbBean f99788e;
    @C17952c(mo34828a = "poi_activity")

    /* renamed from: f */
    public C39121e f99789f;
    @C17952c(mo34828a = "enable_global_search")

    /* renamed from: g */
    public boolean f99790g;
    @C17952c(mo34828a = "is_oversea")

    /* renamed from: h */
    public boolean f99791h;

    /* renamed from: a */
    public static C39116av m86940a(C39116av avVar) {
        C39116av avVar2 = new C39116av();
        avVar2.f99784a = avVar.f99784a;
        avVar2.f99785b = avVar.f99785b;
        avVar2.f99786c = avVar.f99786c;
        avVar2.f99787d = avVar.f99787d;
        avVar2.f99788e = avVar.f99788e;
        avVar2.f99789f = avVar.f99789f;
        avVar2.f99790g = avVar.f99790g;
        avVar2.f99791h = avVar.f99791h;
        return avVar2;
    }
}
