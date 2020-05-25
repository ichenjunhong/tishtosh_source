package com.bytedance.p702im.core.internal.p720c;

import android.os.SystemClock;
import com.bytedance.p702im.core.internal.p718b.p719a.C11406q;
import com.bytedance.p702im.core.internal.p718b.p719a.C11406q.C11408a;
import com.bytedance.p702im.core.internal.p718b.p719a.C11409r;
import com.bytedance.p702im.core.internal.p720c.p721a.C11439c;
import com.bytedance.p702im.core.internal.utils.C11466d;
import com.bytedance.p702im.core.internal.utils.C11498k;
import com.bytedance.p702im.core.p703a.C11165c;
import com.bytedance.p702im.core.p703a.C11169d.C11171b;
import com.bytedance.p702im.core.proto.IMCMD;
import com.bytedance.p702im.core.proto.MessagesPerUserRequestBody.Builder;
import com.bytedance.p702im.core.proto.Request;
import com.bytedance.p702im.core.proto.Response;

/* renamed from: com.bytedance.im.core.internal.c.f */
public final class C11447f implements Comparable<C11447f> {

    /* renamed from: a */
    public long f30726a;

    /* renamed from: b */
    public long f30727b;

    /* renamed from: c */
    public boolean f30728c;

    /* renamed from: d */
    public C11446e f30729d;

    /* renamed from: e */
    public Object[] f30730e;

    /* renamed from: f */
    public Request f30731f;

    /* renamed from: g */
    public Response f30732g;

    /* renamed from: h */
    public C11406q f30733h;

    /* renamed from: i */
    public int f30734i;

    /* renamed from: j */
    public long f30735j;

    /* renamed from: k */
    public long f30736k;

    /* renamed from: l */
    public int f30737l;

    /* renamed from: m */
    private int f30738m = C11165c.m22588a().mo20513b().f30149m;

    /* renamed from: o */
    private static C11447f m23386o() {
        return m23383a((C11446e) null);
    }

    /* renamed from: h */
    public final String mo21094h() {
        if (this.f30732g != null) {
            return this.f30732g.error_desc;
        }
        return "";
    }

    /* renamed from: m */
    public final String mo21099m() {
        if (this.f30732g == null) {
            return null;
        }
        return this.f30732g.log_id;
    }

    /* renamed from: d */
    public final int mo21090d() {
        if (this.f30731f != null) {
            return this.f30731f.cmd.intValue();
        }
        return IMCMD.IMCMD_NOT_USED.getValue();
    }

    /* renamed from: a */
    public final void mo21083a() {
        this.f30737l++;
    }

    /* renamed from: c */
    public final void mo21088c() {
        if (this.f30731f != null && this.f30737l > 0) {
            this.f30727b = C11408a.m23290a().mo21061b();
            this.f30731f = this.f30731f.newBuilder().sequence_id(Long.valueOf(this.f30727b)).build();
        }
    }

    /* renamed from: e */
    public final boolean mo21091e() {
        int i = C11165c.m22588a().mo20513b().f30147k;
        if (this.f30728c || i == 2 || (i == 0 && (this.f30737l >= this.f30738m || !C11165c.m22588a().f30108c.mo20501d()))) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo21092f() {
        if ((SystemClock.uptimeMillis() - this.f30736k < ((long) (this.f30738m * C11165c.m22588a().mo20513b().f30150n)) || mo21091e()) && SystemClock.uptimeMillis() - this.f30736k < ((long) C11165c.m22588a().mo20513b().f30151o)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final boolean mo21093g() {
        if (this.f30732g == null || this.f30732g.status_code == null || (this.f30732g.status_code.intValue() != C11171b.f30118a && this.f30732g.status_code.intValue() != 200)) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public final String mo21100n() {
        if (IMCMD.fromValue(this.f30731f.cmd.intValue()) != IMCMD.SEND_MESSAGE || this.f30731f.body == null || this.f30731f.body.send_message_body == null) {
            return "";
        }
        return this.f30731f.body.send_message_body.client_message_id;
    }

    /* renamed from: b */
    public final void mo21087b() {
        if (this.f30731f != null && this.f30731f.body != null && this.f30731f.body.messages_per_user_body != null && this.f30731f.cmd.intValue() == IMCMD.GET_MESSAGES_BY_USER.getValue()) {
            this.f30731f = this.f30731f.newBuilder().body(this.f30731f.body.newBuilder().messages_per_user_body(new Builder().cursor(Long.valueOf(C11498k.m23543a().mo21119a(this.f30731f.inbox_type.intValue()))).build()).build()).build();
        }
    }

    /* renamed from: i */
    public final int mo21095i() {
        try {
            IMCMD fromValue = IMCMD.fromValue(this.f30731f.cmd.intValue());
            if (fromValue == null) {
                return C11171b.f30118a;
            }
            if (fromValue == IMCMD.SEND_MESSAGE) {
                return this.f30732g.body.send_message_body.status.intValue();
            }
            if (fromValue == IMCMD.CREATE_CONVERSATION_V2) {
                return this.f30732g.body.create_conversation_v2_body.status.intValue();
            }
            if (fromValue == IMCMD.ADD_CONVERSATION_PARTICIPANTS) {
                return this.f30732g.body.conversation_add_participants_body.status.intValue();
            }
            if (fromValue == IMCMD.REMOVE_CONVERSATION_PARTICIPANTS) {
                return this.f30732g.body.conversation_remove_participants_body.status.intValue();
            }
            if (fromValue == IMCMD.UPDATE_CONVERSATION_PARTICIPANT) {
                return this.f30732g.body.update_conversation_participant_body.status.intValue();
            }
            if (fromValue == IMCMD.SET_CONVERSATION_CORE_INFO) {
                return this.f30732g.body.set_conversation_core_info_body.status.intValue();
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_CORE_EXT_INFO) {
                return this.f30732g.body.upsert_conversation_core_ext_info_body.status.intValue();
            }
            if (fromValue == IMCMD.SET_CONVERSATION_SETTING_INFO) {
                return this.f30732g.body.set_conversation_setting_info_body.status.intValue();
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_SETTING_EXT_INFO) {
                return this.f30732g.body.upsert_conversation_setting_ext_info_body.status.intValue();
            }
            return C11171b.f30118a;
        } catch (Exception unused) {
        }
    }

    /* renamed from: j */
    public final String mo21096j() {
        try {
            IMCMD fromValue = IMCMD.fromValue(this.f30731f.cmd.intValue());
            if (fromValue == null) {
                return "";
            }
            if (fromValue == IMCMD.SEND_MESSAGE) {
                return this.f30732g.body.send_message_body.extra_info;
            }
            if (fromValue == IMCMD.CREATE_CONVERSATION_V2) {
                return this.f30732g.body.create_conversation_v2_body.extra_info;
            }
            if (fromValue == IMCMD.ADD_CONVERSATION_PARTICIPANTS) {
                return this.f30732g.body.conversation_add_participants_body.extra_info;
            }
            if (fromValue == IMCMD.REMOVE_CONVERSATION_PARTICIPANTS) {
                return this.f30732g.body.conversation_remove_participants_body.extra_info;
            }
            if (fromValue == IMCMD.UPDATE_CONVERSATION_PARTICIPANT) {
                return this.f30732g.body.update_conversation_participant_body.extra_info;
            }
            if (fromValue == IMCMD.SET_CONVERSATION_CORE_INFO) {
                return this.f30732g.body.set_conversation_core_info_body.extra_info;
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_CORE_EXT_INFO) {
                return this.f30732g.body.upsert_conversation_core_ext_info_body.extra_info;
            }
            if (fromValue == IMCMD.SET_CONVERSATION_SETTING_INFO) {
                return this.f30732g.body.set_conversation_setting_info_body.extra_info;
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_SETTING_EXT_INFO) {
                return this.f30732g.body.upsert_conversation_setting_ext_info_body.extra_info;
            }
            return "";
        } catch (Exception unused) {
        }
    }

    /* renamed from: k */
    public final long mo21097k() {
        try {
            IMCMD fromValue = IMCMD.fromValue(this.f30731f.cmd.intValue());
            if (fromValue == null) {
                return -1000;
            }
            if (fromValue == IMCMD.SEND_MESSAGE) {
                return this.f30732g.body.send_message_body.check_code.longValue();
            }
            if (fromValue == IMCMD.CREATE_CONVERSATION_V2) {
                return this.f30732g.body.create_conversation_v2_body.check_code.longValue();
            }
            if (fromValue == IMCMD.ADD_CONVERSATION_PARTICIPANTS) {
                return this.f30732g.body.conversation_add_participants_body.check_code.longValue();
            }
            if (fromValue == IMCMD.REMOVE_CONVERSATION_PARTICIPANTS) {
                return this.f30732g.body.conversation_remove_participants_body.check_code.longValue();
            }
            if (fromValue == IMCMD.UPDATE_CONVERSATION_PARTICIPANT) {
                return this.f30732g.body.update_conversation_participant_body.check_code.longValue();
            }
            if (fromValue == IMCMD.SET_CONVERSATION_CORE_INFO) {
                return this.f30732g.body.set_conversation_core_info_body.check_code.longValue();
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_CORE_EXT_INFO) {
                return this.f30732g.body.upsert_conversation_core_ext_info_body.check_code.longValue();
            }
            if (fromValue == IMCMD.SET_CONVERSATION_SETTING_INFO) {
                return this.f30732g.body.set_conversation_setting_info_body.check_code.longValue();
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_SETTING_EXT_INFO) {
                return this.f30732g.body.upsert_conversation_setting_ext_info_body.check_code.longValue();
            }
            return -1000;
        } catch (Exception unused) {
        }
    }

    /* renamed from: l */
    public final String mo21098l() {
        try {
            IMCMD fromValue = IMCMD.fromValue(this.f30731f.cmd.intValue());
            if (fromValue == null) {
                return "";
            }
            if (fromValue == IMCMD.SEND_MESSAGE) {
                return this.f30732g.body.send_message_body.check_message;
            }
            if (fromValue == IMCMD.CREATE_CONVERSATION_V2) {
                return this.f30732g.body.create_conversation_v2_body.check_message;
            }
            if (fromValue == IMCMD.ADD_CONVERSATION_PARTICIPANTS) {
                return this.f30732g.body.conversation_add_participants_body.check_message;
            }
            if (fromValue == IMCMD.REMOVE_CONVERSATION_PARTICIPANTS) {
                return this.f30732g.body.conversation_remove_participants_body.check_message;
            }
            if (fromValue == IMCMD.UPDATE_CONVERSATION_PARTICIPANT) {
                return this.f30732g.body.update_conversation_participant_body.check_message;
            }
            if (fromValue == IMCMD.SET_CONVERSATION_CORE_INFO) {
                return this.f30732g.body.set_conversation_core_info_body.check_message;
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_CORE_EXT_INFO) {
                return this.f30732g.body.upsert_conversation_core_ext_info_body.check_message;
            }
            if (fromValue == IMCMD.SET_CONVERSATION_SETTING_INFO) {
                return this.f30732g.body.set_conversation_setting_info_body.check_message;
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_SETTING_EXT_INFO) {
                return this.f30732g.body.upsert_conversation_setting_ext_info_body.check_message;
            }
            return "";
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static C11447f m23381a(int i) {
        return m23382a(i, (C11446e) null);
    }

    /* renamed from: a */
    private static C11447f m23383a(C11446e eVar) {
        return m23384b(C11171b.f30118a, null);
    }

    /* renamed from: b */
    public static C11447f m23385b(Response response) {
        int i;
        if (response == null || response.cmd == null) {
            return null;
        }
        IMCMD fromValue = IMCMD.fromValue(response.cmd.intValue());
        if (fromValue == null) {
            return null;
        }
        C11447f o = m23386o();
        o.mo21086a(response);
        if (response.status_code != null) {
            i = response.status_code.intValue();
        } else {
            i = C11171b.f30124g;
        }
        o.f30734i = i;
        return C11409r.m23293a(fromValue, o);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        C11447f fVar = (C11447f) obj;
        if (!equals(fVar)) {
            int d = mo21090d();
            if (d != fVar.mo21090d()) {
                if (d == IMCMD.SEND_MESSAGE.getValue()) {
                    return -1;
                }
                if (fVar.mo21090d() == IMCMD.SEND_MESSAGE.getValue()) {
                    return 1;
                }
            }
            if (this.f30726a - fVar.f30726a > 0) {
                return 1;
            }
            if (this.f30726a - fVar.f30726a < 0) {
                return -1;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo21085a(C11439c cVar) {
        int i;
        if (this.f30731f != null) {
            if (cVar.mo21073a()) {
                try {
                    if (cVar.f30712d != null) {
                        this.f30732g = cVar.f30712d;
                    } else if (C11165c.m22588a().mo20513b().f30148l == 0) {
                        this.f30732g = (Response) Response.ADAPTER.decode(cVar.f30711c);
                    } else {
                        this.f30732g = (Response) C11466d.f30773a.mo34884a(new String(cVar.f30711c), Response.class);
                    }
                } catch (Exception unused) {
                }
            }
            if (this.f30732g == null) {
                Response.Builder sequence_id = new Response.Builder().cmd(this.f30731f.cmd).inbox_type(this.f30731f.inbox_type).error_desc(cVar.f30710b).sequence_id(Long.valueOf(this.f30726a));
                if (cVar.mo21073a()) {
                    i = 200;
                } else {
                    i = cVar.f30709a;
                }
                this.f30732g = sequence_id.status_code(Integer.valueOf(i)).build();
            }
            this.f30734i = cVar.f30709a;
        }
    }

    /* renamed from: a */
    public final void mo21086a(Response response) {
        int i;
        this.f30732g = response;
        if (response != null) {
            if (response.status_code != null) {
                i = response.status_code.intValue();
            } else {
                i = C11171b.f30124g;
            }
            this.f30734i = i;
        }
    }

    /* renamed from: a */
    private static C11447f m23382a(int i, C11446e eVar) {
        return m23384b(i, null);
    }

    public C11447f(long j, C11406q qVar) {
        this.f30727b = j;
        this.f30726a = j;
        this.f30733h = qVar;
    }

    /* renamed from: b */
    private static C11447f m23384b(int i, C11446e eVar) {
        C11447f fVar = new C11447f(-1, null);
        fVar.f30734i = i;
        fVar.f30729d = eVar;
        fVar.f30735j = SystemClock.uptimeMillis();
        return fVar;
    }

    /* renamed from: a */
    public final void mo21084a(int i, String str) {
        if (this.f30731f != null) {
            this.f30732g = new Response.Builder().cmd(this.f30731f.cmd).inbox_type(this.f30731f.inbox_type).error_desc(str).sequence_id(Long.valueOf(this.f30726a)).status_code(Integer.valueOf(-1000)).build();
            this.f30734i = -1000;
        }
    }
}
