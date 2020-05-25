package com.p683ss.android.vesdk;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.text.TextUtils;
import com.p683ss.android.ttve.audio.C20069b;
import com.p683ss.android.ttve.audio.TEDubWriter;
import com.p683ss.android.ttve.monitor.C20110e;
import com.p683ss.android.ttve.nativePort.TEVideoUtils;
import com.p683ss.android.vesdk.p2534d.C50660a;
import com.p683ss.android.vesdk.runtime.C50772e;
import com.p683ss.android.vesdk.runtime.VERuntime;
import java.io.File;

/* renamed from: com.ss.android.vesdk.VEAudioRecorder */
public class VEAudioRecorder implements C0183j {

    /* renamed from: a */
    public long f126662a;

    /* renamed from: b */
    private VERuntime f126663b = VERuntime.m109853a();

    /* renamed from: c */
    private VEAudioEncodeSettings f126664c;

    /* renamed from: d */
    private String f126665d;

    /* renamed from: e */
    private boolean f126666e;

    /* renamed from: f */
    private C20069b f126667f = new C20069b(new TEDubWriter());

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void destory() {
        this.f126667f.mo42154a();
    }

    /* renamed from: b */
    public final String mo98469b() throws C50751p {
        if (!this.f126666e) {
            return this.f126665d;
        }
        throw new C50751p(-105, "audio is recording");
    }

    /* renamed from: a */
    public final long mo98468a() {
        if (!this.f126666e) {
            return -105;
        }
        this.f126662a = ((TEDubWriter) this.f126667f.f55167k).f55156b;
        this.f126667f.mo42157b();
        StringBuilder sb = new StringBuilder("Stop record ,current time is ");
        sb.append(this.f126662a);
        C50792y.m109909a("VEAudioRecorder", sb.toString());
        this.f126666e = false;
        C20110e.m49637a("iesve_veaudiorecorder_audio_record", 1, (C50660a) null);
        return this.f126662a;
    }

    /* renamed from: a */
    public final int mo98466a(String str, VEAudioEncodeSettings vEAudioEncodeSettings) {
        this.f126664c = vEAudioEncodeSettings;
        this.f126666e = false;
        this.f126665d = str;
        this.f126667f.mo42155a(1);
        return 0;
    }

    /* renamed from: a */
    public final int mo98465a(int i, int i2) {
        if (i >= i2 || i < 0) {
            return -100;
        }
        C20110e.m49637a("iesve_veaudiorecorder_audio_delete", 1, (C50660a) null);
        return TEVideoUtils.clearWavSeg(this.f126665d, i, i2);
    }

    /* renamed from: a */
    public final int mo98464a(float f, int i, int i2) {
        if (this.f126666e) {
            return -105;
        }
        this.f126667f.mo42156a(this.f126665d, (double) f, i, i2);
        this.f126666e = true;
        return 0;
    }

    /* renamed from: a */
    public final int mo98467a(String str, VEAudioEncodeSettings vEAudioEncodeSettings, int i) {
        this.f126664c = vEAudioEncodeSettings;
        this.f126666e = false;
        if (TextUtils.isEmpty(str)) {
            C50792y.m109909a("VEAudioRecorder", "Empty directory use default path");
            C50772e eVar = this.f126663b.f127476d;
            StringBuilder sb = new StringBuilder();
            File file = new File(eVar.f127570a, "audio");
            if (file.exists() || file.mkdirs()) {
                sb.append(file.getAbsolutePath());
                sb.append(File.separator);
                sb.append(System.currentTimeMillis());
                sb.append("_record");
                sb.append(".wav");
                this.f126665d = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder("mkdirs failed, workspace path: ");
                sb2.append(eVar.f127570a);
                throw new C50751p(-100, sb2.toString());
            }
        } else {
            StringBuilder sb3 = new StringBuilder("Use wav save path ");
            sb3.append(str);
            C50792y.m109909a("VEAudioRecorder", sb3.toString());
            this.f126665d = str;
        }
        this.f126667f.mo42155a(1);
        TEVideoUtils.generateMuteWav(this.f126665d, this.f126667f.f55162f, 2, i);
        return 0;
    }
}
