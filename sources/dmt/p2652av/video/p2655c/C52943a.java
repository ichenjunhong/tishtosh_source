package dmt.p2652av.video.p2655c;

import com.p683ss.android.ugc.asve.recorder.C20504f;
import com.p683ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import java.io.File;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: dmt.av.video.c.a */
public final class C52943a implements C20504f {

    /* renamed from: a */
    private final File f131316a;

    /* renamed from: b */
    private final File f131317b;

    /* renamed from: c */
    private final File f131318c;

    /* renamed from: d */
    private final File f131319d;

    /* renamed from: e */
    private final File f131320e = new File(mo43186a(), "photo");

    /* renamed from: a */
    public final File mo43186a() {
        return this.f131316a;
    }

    /* renamed from: b */
    public final File mo43188b() {
        return this.f131317b;
    }

    /* renamed from: c */
    public final File mo43190c() {
        return this.f131318c;
    }

    /* renamed from: d */
    public final File mo43191d() {
        return this.f131319d;
    }

    /* renamed from: e */
    public final File mo43192e() {
        return this.f131320e;
    }

    /* renamed from: a */
    public final String mo43187a(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(File.separator);
        sb.append(i);
        sb.append(".mp4");
        return sb.toString();
    }

    /* renamed from: b */
    public final String mo43189b(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(File.separator);
        sb.append(i);
        sb.append(".wav");
        return sb.toString();
    }

    public C52943a(Workspace workspace) {
        C52711k.m112240b(workspace, "workspaceIMP");
        File g = workspace.mo86460g();
        g.mkdirs();
        this.f131316a = g;
        this.f131317b = workspace.mo86460g();
        this.f131318c = workspace.mo86455c();
        this.f131319d = workspace.mo86456d();
    }
}
