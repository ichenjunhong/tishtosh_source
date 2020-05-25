package com.p683ss.android.ugc.aweme.app;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12704f;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12718t;
import com.facebook.internal.C14338p;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.common.util.NetworkUtils.C18907d;
import com.p683ss.android.newmedia.C19530a;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.CommandDispatcher */
public final class CommandDispatcher implements C18907d {

    /* renamed from: a */
    public static final String f61142a = C19530a.m45940a("/command/feedback/");

    /* renamed from: b */
    public static AtomicBoolean f61143b = new AtomicBoolean(false);

    /* renamed from: c */
    public LinkedHashSet<Long> f61144c;

    /* renamed from: d */
    private ArrayList<Object> f61145d;

    /* renamed from: e */
    private volatile List<Object> f61146e;

    /* renamed from: f */
    private HandlerThread f61147f;

    /* renamed from: g */
    private Handler f61148g;

    /* renamed from: com.ss.android.ugc.aweme.app.CommandDispatcher$CommandDispatcherApi */
    interface CommandDispatcherApi {
        @C12718t
        @C12705g
        C17832m<String> doPost(@C12699af String str, @C12704f Map<String, String> map);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.CommandDispatcher$a */
    public static class C22821a {

        /* renamed from: a */
        public static final CommandDispatcher f61149a = new CommandDispatcher();
    }

    /* renamed from: com.ss.android.ugc.aweme.app.CommandDispatcher$b */
    public class C22822b extends Thread {
        public final void run() {
            long lastActiveTime = AppLog.getLastActiveTime();
            while (System.currentTimeMillis() - lastActiveTime < 60000 && m56208a()) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException unused) {
                }
            }
            CommandDispatcher.f61143b.set(false);
        }

        /* renamed from: a */
        private boolean m56208a() {
            boolean z;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (CommandDispatcher.this.f61144c) {
                linkedHashSet.addAll(CommandDispatcher.this.f61144c);
            }
            if (linkedHashSet.isEmpty()) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                if (longValue > 0) {
                    sb.append(longValue);
                    sb.append(",");
                }
            }
            if (sb.length() == 0) {
                return false;
            }
            try {
                z = m56207a(sb.substring(0, sb.length() - 1)).booleanValue();
            } catch (Exception unused) {
                z = false;
            }
            if (!z) {
                return false;
            }
            synchronized (CommandDispatcher.this.f61144c) {
                CommandDispatcher.this.f61144c.removeAll(linkedHashSet);
            }
            return true;
        }

        public C22822b() {
        }

        /* renamed from: a */
        private static Boolean m56207a(String str) throws Exception {
            if (C9431p.m18664a(str)) {
                return Boolean.valueOf(false);
            }
            CommandDispatcherApi commandDispatcherApi = (CommandDispatcherApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(C18845b.f52040e).mo19925a().mo19930a(CommandDispatcherApi.class);
            HashMap hashMap = new HashMap();
            hashMap.put("command_ids", str);
            try {
                String str2 = (String) commandDispatcherApi.doPost(CommandDispatcher.f61142a, hashMap).get();
                if (str2 == null || str2.length() == 0) {
                    return Boolean.valueOf(false);
                }
                return Boolean.valueOf("success".equals(new JSONObject(str2).getString("message")));
            } catch (ExecutionException e) {
                throw ((Exception) e.getCause());
            }
        }
    }

    /* renamed from: a */
    public final String mo38764a() {
        return "X-SS-Command";
    }

    private CommandDispatcher() {
        this.f61144c = new LinkedHashSet<>();
        this.f61145d = new ArrayList<>();
    }

    /* renamed from: b */
    private synchronized Handler m56203b() {
        if (this.f61147f == null) {
            this.f61147f = new HandlerThread("AppData-AsyncOp");
            this.f61147f.start();
            this.f61148g = new C9381g(this.f61147f.getLooper(), new C23182u(this));
            C32458a.m75147a("command_dispatcher_handler", null);
        }
        return this.f61148g;
    }

    /* renamed from: a */
    private void m56202a(LinkedHashSet<Long> linkedHashSet) {
        if (!linkedHashSet.isEmpty()) {
            synchronized (this.f61144c) {
                linkedHashSet.addAll(this.f61144c);
            }
            int i = 0;
            int size = linkedHashSet.size() - 100;
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                Long l = (Long) it.next();
                if (i > size) {
                    break;
                }
                linkedHashSet.remove(l);
                i++;
            }
            synchronized (this.f61144c) {
                this.f61144c.addAll(linkedHashSet);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo47299a(Message message) {
        try {
            if (message.what == 104) {
                try {
                    JSONObject jSONObject = (JSONObject) message.obj;
                    jSONObject.optLong("i");
                    jSONObject.optString("t");
                    List<Object> list = this.f61146e;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            it.next();
                            jSONObject.optJSONObject(C14338p.f37308a);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
        }
    }

    /* renamed from: a */
    public final void mo38765a(List<String> list) {
        for (String str : list) {
            if (str != null && !C9431p.m18664a(str)) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        long optLong = jSONObject.optLong("i");
                        if (optLong > 0) {
                            linkedHashSet.add(Long.valueOf(optLong));
                            m56203b().sendMessage(m56203b().obtainMessage(104, jSONObject));
                        }
                    }
                    if (!linkedHashSet.isEmpty()) {
                        m56202a(linkedHashSet);
                        if (f61143b.compareAndSet(false, true)) {
                            new C22822b().start();
                        }
                    }
                } catch (JSONException unused) {
                }
            }
        }
    }
}
