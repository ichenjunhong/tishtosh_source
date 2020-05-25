package com.p683ss.android.ugc.asve.recorder;

import com.p683ss.android.vesdk.runtime.C50771d;
import java.io.File;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.recorder.m */
public final class C20530m extends C50771d {

    /* renamed from: a */
    private final C20504f f56240a;

    /* renamed from: b */
    public final String mo43566b() {
        String absolutePath = this.f56240a.mo43190c().getAbsolutePath();
        C52711k.m112236a((Object) absolutePath, "workspaceProvider.concat…entVideoPath.absolutePath");
        return absolutePath;
    }

    /* renamed from: c */
    public final String mo43568c() {
        String absolutePath = this.f56240a.mo43191d().getAbsolutePath();
        C52711k.m112236a((Object) absolutePath, "workspaceProvider.concat…entAudioPath.absolutePath");
        return absolutePath;
    }

    /* renamed from: a */
    public final String mo43564a() {
        String absolutePath = this.f56240a.mo43188b().getAbsolutePath();
        new File(absolutePath).mkdirs();
        C52711k.m112236a((Object) absolutePath, LeakCanaryFileProvider.f132050j);
        return absolutePath;
    }

    public C20530m(C20504f fVar) {
        C52711k.m112240b(fVar, "workspaceProvider");
        super(fVar.mo43186a().getAbsolutePath());
        this.f56240a = fVar;
    }

    /* renamed from: b */
    public final String mo43567b(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(mo43564a());
        sb.append(File.separator);
        sb.append(this.f56240a.mo43189b(i));
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo43565a(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(mo43564a());
        sb.append(File.separator);
        sb.append(this.f56240a.mo43187a(i));
        return sb.toString();
    }
}
