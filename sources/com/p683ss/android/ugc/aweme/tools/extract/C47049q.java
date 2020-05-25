package com.p683ss.android.ugc.aweme.tools.extract;

import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.p683ss.android.ugc.aweme.tools.extract.C47038j.C47039a;
import com.p683ss.android.vesdk.VEUtils;
import java.io.File;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.q */
public final class C47049q extends C47027a {

    /* renamed from: e */
    private int f118812e;

    /* renamed from: f */
    private EditPreviewInfo f118813f;

    /* renamed from: a */
    public final void mo94316a() {
        super.mo94316a();
    }

    /* renamed from: f */
    public final String mo94328f() {
        return "extract_upload";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ Void mo94342g() throws Exception {
        if (this.f118813f == null || this.f118813f.getVideoList().isEmpty()) {
            return null;
        }
        String str = this.f118776c.f118792a;
        if (!str.endsWith(File.separator)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(File.separator);
            str = sb.toString();
        }
        int i = 0;
        for (EditVideoSegment editVideoSegment : this.f118813f.getVideoList()) {
            String videoPath = editVideoSegment.getVideoPath();
            int[] a = m102172a(editVideoSegment);
            int i2 = C47037i.f118791a[0];
            StringBuilder sb2 = new StringBuilder();
            int i3 = i + 1;
            sb2.append(i);
            sb2.append("extract_frame");
            VEUtils.saveVideoFrames(videoPath, a, i2, -1, false, str, sb2.toString(), 1);
            i = i3;
        }
        File[] listFiles = new File(str).listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (File absolutePath : listFiles) {
                this.f118774a.addFrameAtLastSegment(absolutePath.getAbsolutePath());
            }
        }
        return null;
    }

    public C47049q(EditPreviewInfo editPreviewInfo) {
        this.f118813f = editPreviewInfo;
    }

    /* renamed from: a */
    public final void mo94318a(C47039a aVar) {
        super.mo94318a(aVar);
        if (m102125b()) {
            C0013i.m16a((Callable<TResult>) new C47050r<TResult>(this)).mo19a((C0011g<TResult, TContinuationResult>) new C47051s<TResult,TContinuationResult>(this, aVar));
        }
    }

    /* renamed from: a */
    private int[] m102172a(EditVideoSegment editVideoSegment) {
        int[] iArr;
        int i = 0;
        if (editVideoSegment.getVideoCutInfo() != null) {
            VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
            this.f118812e = ((int) (videoCutInfo.getEnd() - videoCutInfo.getStart())) / 500;
            iArr = new int[this.f118812e];
            while (i < this.f118812e) {
                iArr[i] = (int) (videoCutInfo.getStart() + ((long) (i * 500)));
                i++;
            }
        } else {
            this.f118812e = (int) (editVideoSegment.getVideoFileInfo().getDuration() / 500);
            iArr = new int[this.f118812e];
            while (i < this.f118812e) {
                iArr[i] = i * 500;
                i++;
            }
        }
        return iArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo94341a(C47039a aVar, C0013i iVar) throws Exception {
        aVar.mo86668a(iVar.mo26b());
        mo94320a(true);
        mo94316a();
        return null;
    }
}
