package com.bytedance.p702im.core.internal.p718b.p719a;

import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.internal.utils.C11498k;
import com.bytedance.p702im.core.proto.IMCMD;
import com.bytedance.p702im.core.proto.ReportGetMessagesCursorRequestBody;
import com.bytedance.p702im.core.proto.RequestBody;
import com.bytedance.p702im.core.proto.RequestBody.Builder;

/* renamed from: com.bytedance.im.core.internal.b.a.ae */
final class C11342ae extends C11406q {

    /* renamed from: a */
    private int f30521a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20947a(C11447f fVar) {
        return true;
    }

    /* renamed from: b */
    public final void mo21034b() {
        long a = C11498k.m23543a().mo21119a(this.f30521a);
        if (a != C11498k.m23543a().mo21123b(this.f30521a)) {
            RequestBody build = new Builder().report_conversation_cursor_body(new ReportGetMessagesCursorRequestBody.Builder().cursor(Long.valueOf(a)).build()).build();
            mo21053a(this.f30521a, build, null, Long.valueOf(a));
        }
    }

    C11342ae(int i) {
        super(IMCMD.REPORT_GET_MESSAGES_CURSOR.getValue());
        this.f30521a = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20946a(C11447f fVar, Runnable runnable) {
        C11498k.m23543a().f30838a.edit().putLong(C11498k.m23544a(this.f30521a, "msg_by_user_report_cursor"), ((Long) fVar.f30730e[0]).longValue()).commit();
    }
}
