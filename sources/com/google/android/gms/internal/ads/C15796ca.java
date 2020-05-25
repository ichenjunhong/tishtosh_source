package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Environment;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.ca */
public final class C15796ca {

    /* renamed from: a */
    BlockingQueue<C15806ck> f44734a = new ArrayBlockingQueue(100);

    /* renamed from: b */
    public LinkedHashMap<String, String> f44735b = new LinkedHashMap<>();

    /* renamed from: c */
    String f44736c;

    /* renamed from: d */
    Context f44737d;

    /* renamed from: e */
    String f44738e;

    /* renamed from: f */
    AtomicBoolean f44739f;

    /* renamed from: g */
    File f44740g;

    /* renamed from: h */
    private ExecutorService f44741h;

    /* renamed from: i */
    private Map<String, C15800ce> f44742i = new HashMap();

    /* renamed from: a */
    public final void mo30889a(Context context, String str, String str2, Map<String, String> map) {
        this.f44737d = context;
        this.f44738e = str;
        this.f44736c = str2;
        this.f44739f = new AtomicBoolean(false);
        this.f44739f.set(((Boolean) caf.m37099d().mo30717a(C15740bx.f44202P)).booleanValue());
        if (this.f44739f.get()) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory != null) {
                this.f44740g = new File(externalStorageDirectory, "sdk_csi_data.txt");
            }
        }
        for (Entry entry : map.entrySet()) {
            this.f44735b.put((String) entry.getKey(), (String) entry.getValue());
        }
        this.f44741h = C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(1).mo49847a());
        this.f44741h.execute(new C15797cb(this));
        this.f44742i.put("action", C15800ce.f44774b);
        this.f44742i.put("ad_format", C15800ce.f44774b);
        this.f44742i.put("e", C15800ce.f44775c);
    }

    /* renamed from: a */
    public final boolean mo30890a(C15806ck ckVar) {
        return this.f44734a.offer(ckVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Map<String, String> mo30888a(Map<String, String> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        for (Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) linkedHashMap.get(str);
            linkedHashMap.put(str, mo30887a(str).mo30895a(str2, (String) entry.getValue()));
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public final C15800ce mo30887a(String str) {
        C15800ce ceVar = (C15800ce) this.f44742i.get(str);
        if (ceVar != null) {
            return ceVar;
        }
        return C15800ce.f44773a;
    }
}
