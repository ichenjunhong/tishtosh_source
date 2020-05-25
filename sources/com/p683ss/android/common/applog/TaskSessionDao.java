package com.p683ss.android.common.applog;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.p683ss.android.common.applog.p1142a.C18880d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.common.applog.TaskSessionDao */
public class TaskSessionDao {
    private static volatile TaskSessionDao inst;
    private Context context;

    public static String genSessionId() {
        return AppLog.genSession();
    }

    public static long genTeaEventIndex() {
        return AppLog.genEventIndex();
    }

    private TaskSessionDao(Context context2) {
        this.context = context2.getApplicationContext();
    }

    public static TaskSessionDao inst(Context context2) {
        if (inst == null) {
            synchronized (TaskSessionDao.class) {
                if (inst == null) {
                    inst = new TaskSessionDao(context2);
                }
            }
        }
        return inst;
    }

    public void saveTaskSession(C18880d dVar) {
        C18880d dVar2;
        if (dVar == null) {
            dVar2 = null;
        } else {
            C18880d dVar3 = new C18880d();
            dVar3.f52079a = dVar.f52079a;
            dVar3.f52080b = dVar.f52080b;
            dVar3.f52081c = dVar.f52081c;
            dVar3.f52082d = dVar.f52082d;
            dVar3.f52083e = dVar.f52083e;
            dVar3.f52084f = dVar.f52084f;
            dVar3.f52085g = dVar.f52085g;
            dVar3.f52086h = dVar.f52086h;
            dVar3.f52087i = dVar.f52087i;
            dVar2 = dVar3;
        }
        if (dVar2 != null) {
            LogQueueSaveAndSendTaskSession logQueueSaveAndSendTaskSession = new LogQueueSaveAndSendTaskSession();
            logQueueSaveAndSendTaskSession.taskSession = dVar2;
            AppLog instance = AppLog.getInstance(this.context);
            if (instance != null) {
                instance.enqueue((LogQueueItem) logQueueSaveAndSendTaskSession);
            }
        }
    }

    public Pair<Long, String> saveTaskSession(C18880d dVar, JSONObject jSONObject) {
        C18880d dVar2 = dVar;
        if (dVar2 == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("magic_tag", "ss_app_log");
            jSONObject2.put("header", jSONObject);
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("datetime", AppLog.formatDate(dVar2.f52079a));
            jSONObject3.put("local_time_ms", System.currentTimeMillis());
            jSONObject3.put("session_id", dVar2.f52080b);
            int i = 1;
            jSONObject3.put("bg_session", 1);
            if (!TextUtils.isEmpty(dVar2.f52082d)) {
                jSONObject3.put("from_session", dVar2.f52082d);
            }
            if (!TextUtils.isEmpty(dVar2.f52084f)) {
                jSONObject3.put("to_session", dVar2.f52084f);
            }
            jSONObject3.put("duration", Math.max(1, Math.max(0, (dVar2.f52085g - dVar2.f52079a) - dVar2.f52086h) / 1000));
            String str = "session_type";
            boolean z = dVar2.f52081c;
            boolean z2 = dVar2.f52083e;
            if (z || z2) {
                if (z && !z2) {
                    i = 2;
                } else if (z || !z2) {
                    i = 4;
                } else {
                    i = 3;
                }
            }
            jSONObject3.put(str, i);
            jSONObject3.put("is_background", false);
            AppLog.tryPutEventIndex(jSONObject3);
            jSONArray.put(jSONObject3);
            jSONObject2.put("terminate", jSONArray);
            new StringBuilder("save task session to db : ").append(dVar.toString());
            String jSONObject4 = jSONObject2.toString();
            try {
                return Pair.create(Long.valueOf(DBHelper.getInstance(this.context).insertLog(jSONObject4, 0)), jSONObject4);
            } catch (JSONException unused) {
                return null;
            }
        } catch (JSONException unused2) {
            return null;
        }
    }
}
