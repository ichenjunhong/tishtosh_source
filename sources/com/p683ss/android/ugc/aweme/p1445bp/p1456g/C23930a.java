package com.p683ss.android.ugc.aweme.p1445bp.p1456g;

import android.util.Log;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.p1445bp.p1448c.C23884a;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.C23908c;
import com.p683ss.android.ugc.aweme.p1445bp.p1457h.C23934b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import java.io.File;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bp.g.a */
public final class C23930a implements C23934b {

    /* renamed from: a */
    public static final C23931a f63591a = new C23931a(null);

    /* renamed from: com.ss.android.ugc.aweme.bp.g.a$a */
    public static final class C23931a {
        private C23931a() {
        }

        public /* synthetic */ C23931a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo49529a() {
        boolean a = C39629l.m88232a().mo58574e().mo83117a(C40796a.StorageMonitorLocalSwitch);
        IESSettingsProxy b = C32816h.m75716b();
        C52711k.m112236a((Object) b, "SettingsReader.get()");
        Boolean enableAvStorageMonitor = b.getEnableAvStorageMonitor();
        if (a) {
            C52711k.m112236a((Object) enableAvStorageMonitor, "settingsSwitch");
            if (enableAvStorageMonitor.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo49528a(boolean z) {
        C39629l.m88232a().mo58574e().mo83116a(C40796a.StorageMonitorLocalSwitch, z);
    }

    /* renamed from: b */
    public final void mo49530b(File file) {
        if (file == null || mo49529a()) {
        }
    }

    /* renamed from: a */
    public final void mo49525a(File file) {
        if (file == null || !mo49529a()) {
            return;
        }
        if (!C23908c.f63580a.mo49511b()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fileExist", file.exists());
            jSONObject.put("fileName", file.getName());
            jSONObject.put("filePath", file.getAbsolutePath());
            jSONObject.put("fileLength", file.length());
            C23569o.m57779a("av_storage_use_invalid_path", jSONObject);
            return;
        }
        throw new C23884a(file);
    }

    /* renamed from: a */
    public final void mo49526a(String str, long j) {
        C52711k.m112240b(str, "key");
        if (mo49529a()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("module", str);
            jSONObject.put("duration", j);
            C23569o.m57779a("av_storage_storage_size_count_time", jSONObject);
        }
    }

    /* renamed from: b */
    public final void mo49531b(String str, long j) {
        C52711k.m112240b(str, "key");
        if (mo49529a()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("module", str);
            jSONObject.put("duration", j);
            C23569o.m57779a("av_storage_storage_clean_time", jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo49527a(String str, Exception exc) {
        C52711k.m112240b(str, "key");
        C52711k.m112240b(exc, "error");
        if (mo49529a()) {
            if (!C23908c.f63580a.mo49511b()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("module", str);
                jSONObject.put("exception", Log.getStackTraceString(exc));
                C23569o.m57779a("av_storage_storage_clean_error", jSONObject);
                return;
            }
            throw exc;
        }
    }
}
