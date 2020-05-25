package com.bytedance.p702im.core.p705b;

import android.os.SystemClock;
import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.internal.utils.C11467e;
import com.bytedance.p702im.core.proto.IMCMD;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.im.core.b.d */
public final class C11176d {

    /* renamed from: a */
    public static C11174b f30167a;

    /* renamed from: a */
    public static void m22632a(Exception exc) {
        C11175c.m22624a().mo20526a("core").mo20528b("task_exception").mo20527a("error", exc.toString()).mo20527a("error_stack", m22638b(exc)).mo20530b();
    }

    /* renamed from: b */
    public static String m22638b(Exception exc) {
        if (exc == null) {
            return "";
        }
        StackTraceElement[] stackTrace = exc.getStackTrace();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (stackTrace != null && i < stackTrace.length) {
            if (i > 0) {
                sb.append("\n");
            }
            sb.append(stackTrace[i].getClassName());
            sb.append(":");
            sb.append(stackTrace[i].getMethodName());
            sb.append(":");
            sb.append(stackTrace[i].getLineNumber());
            i++;
        }
        if (sb.length() > 1000) {
            sb.substring(0, 999);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static C11175c m22630a(C11447f fVar, boolean z) {
        C11175c a = C11175c.m22624a().mo20527a("duration", Long.valueOf(SystemClock.uptimeMillis() - fVar.f30735j));
        IMCMD fromValue = IMCMD.fromValue(fVar.mo21090d());
        if (fromValue == null) {
            fromValue = IMCMD.IMCMD_NOT_USED;
        }
        switch (fromValue) {
            case ADD_CONVERSATION_PARTICIPANTS:
                a.mo20526a("conversation").mo20528b("add_participants");
                break;
            case CREATE_CONVERSATION_V2:
                a.mo20526a("core").mo20528b("create_conversation");
                break;
            case GET_CONVERSATION_INFO_V2:
                a.mo20526a("core").mo20528b("get_conversation_info");
                break;
            case GET_CONVERSATION_INFO_LIST_V2:
                a.mo20526a("core").mo20528b("get_conversation_info_list");
                break;
            case GET_CONVERSATION_INFO_LIST_BY_FAVORITE_V2:
                a.mo20526a("core").mo20528b("get_favorite_conversation_list");
                break;
            case GET_CONVERSATION_INFO_LIST_BY_TOP_V2:
                a.mo20526a("core").mo20528b("get_top_conversation_list");
                break;
            case GET_MESSAGES_BY_USER:
                a.mo20526a("core").mo20528b("get_msg_by_user");
                break;
            case GET_STRANGER_CONVERSATION_LIST:
                a.mo20526a("core").mo20528b("get_stranger_conversation_list");
                break;
            case GET_STRANGER_MESSAGES_IN_CONVERSATION:
                a.mo20526a("core").mo20528b("get_stranger_msg_list");
                break;
            case GET_MESSAGES_BY_USER_INIT_V2:
                a.mo20526a("core").mo20528b("install_init");
                break;
            case LEAVE_CONVERSATION:
                a.mo20526a("conversation").mo20528b("leave");
                break;
            case GET_MESSAGES_BY_CONVERSATION:
                a.mo20526a("core").mo20528b("load_history");
                break;
            case CONVERSATION_PARTICIPANTS_LIST:
                a.mo20526a("core").mo20528b("load_member");
                break;
            case REMOVE_CONVERSATION_PARTICIPANTS:
                a.mo20526a("conversation").mo20528b("remove_member");
                break;
            case SEND_MESSAGE:
                a.mo20526a("core").mo20528b("message_send");
                break;
            case SET_CONVERSATION_CORE_INFO:
                a.mo20526a("conversation").mo20528b("update_core");
                break;
            case SET_CONVERSATION_SETTING_INFO:
                a.mo20526a("conversation").mo20528b("update_setting");
                break;
            case UPDATE_CONVERSATION_PARTICIPANT:
                a.mo20526a("conversation").mo20528b("update_member");
                break;
            case UPSERT_CONVERSATION_CORE_EXT_INFO:
                a.mo20526a("conversation").mo20528b("update_core_ext");
                break;
            case UPSERT_CONVERSATION_SETTING_EXT_INFO:
                a.mo20526a("conversation").mo20528b("update_setting_ext");
                break;
            case DISSOLVE_CONVERSATION:
                a.mo20526a("conversation").mo20528b("dissolve");
                break;
            case SYNC_MESSAGE:
                a.mo20526a("core").mo20528b("property_msg_send");
                break;
            case SET_MESSAGE_PROPERTY:
                a.mo20526a("core").mo20528b("message_set_property_send");
                break;
            case GET_CONVERSATION_PARTICIPANTS_READ_INDEX_V3:
                a.mo20526a("conversation").mo20528b("get_conversation_participants_read_index");
                break;
            case GET_CONVERSATION_PARTICIPANTS_MIN_INDEX_V3:
                a.mo20526a("conversation").mo20528b("get_conversation_participants_min_index");
                break;
            default:
                a.mo20526a("unknown").mo20528b("not_use");
                break;
        }
        if (z) {
            a.mo20527a("success", Integer.valueOf(1));
        } else {
            a.mo20527a("error", Integer.valueOf(fVar.f30734i));
            a.mo20527a("success", Integer.valueOf(0));
            if (fVar.f30731f != null) {
                a.mo20529b("origin_request", fVar.f30731f);
            }
            if (fVar.f30732g != null) {
                a.mo20529b("origin_response", fVar.f30732g);
            }
        }
        return a;
    }

    /* renamed from: a */
    public static void m22634a(String str, String str2, Throwable th) {
        if (f30167a != null) {
            f30167a.mo20522a(str, str2, th);
        }
    }

    /* renamed from: a */
    public static void m22633a(String str, String str2, float f) {
        if (f30167a != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(str2, 1.0d);
                jSONObject.put("service", str);
            } catch (JSONException unused) {
            }
            f30167a.mo20524a("service_monitor", str, jSONObject);
        }
        StringBuilder sb = new StringBuilder("serviceName=");
        sb.append(str);
        sb.append(" key=");
        sb.append(str2);
        sb.append(" value=1.0");
        C11467e.m23463a("monitor", sb.toString());
    }

    /* renamed from: a */
    public static void m22636a(String str, String str2, JSONObject jSONObject) {
        if (f30167a != null) {
            f30167a.mo20524a(str, str2, jSONObject);
        }
        StringBuilder sb = new StringBuilder("log_type=");
        sb.append(str);
        sb.append(" serviceName=");
        sb.append(str2);
        sb.append(" logExtra=");
        sb.append(jSONObject);
        C11467e.m23463a("monitor", sb.toString());
    }

    /* renamed from: a */
    public static void m22637a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        if (f30167a != null) {
            f30167a.mo20525a(str, jSONObject, (JSONObject) null);
        }
        StringBuilder sb = new StringBuilder("serviceName=");
        sb.append(str);
        sb.append(" duration=");
        sb.append(jSONObject);
        sb.append(" logExtra=");
        sb.append(null);
        C11467e.m23463a("monitor", sb.toString());
    }

    /* renamed from: a */
    public static void m22635a(String str, String str2, Map<String, Object> map, Map<String, Object> map2) {
        if (f30167a != null) {
            f30167a.mo20523a(str, str2, map, map2);
        }
    }

    /* renamed from: a */
    public static void m22631a(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        StringBuilder sb = new StringBuilder("sendDuration=");
        sb.append(j);
        sb.append(" sendTime=");
        sb.append(j2);
        sb.append(" sendUrl=");
        sb.append(str);
        sb.append(" sendIp=");
        sb.append(str2);
        sb.append(" traceCode=");
        sb.append(str3);
        sb.append(" status=");
        sb.append(i);
        sb.append(" extJson=");
        sb.append(null);
        C11467e.m23463a("monitor", sb.toString());
    }

    /* renamed from: b */
    public static void m22639b(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        StringBuilder sb = new StringBuilder("duration=");
        sb.append(j);
        sb.append(" sendTime=");
        sb.append(j2);
        sb.append(" sendUrl=");
        sb.append(str);
        sb.append(" sendIp=");
        sb.append(str2);
        sb.append(" traceCode=");
        sb.append(str3);
        sb.append(" status=");
        sb.append(i);
        sb.append(" extJson=");
        sb.append(null);
        C11467e.m23463a("monitor", sb.toString());
    }
}
