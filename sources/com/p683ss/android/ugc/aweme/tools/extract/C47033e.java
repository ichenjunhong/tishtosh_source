package com.p683ss.android.ugc.aweme.tools.extract;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C44300e;
import com.p683ss.android.ugc.aweme.tools.extract.C47038j.C47039a;
import com.p683ss.android.ugc.tools.utils.C50199c;
import com.p683ss.android.ugc.tools.utils.C50201e;
import com.p683ss.android.vesdk.VEUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.e */
public final class C47033e extends C47027a {

    /* renamed from: e */
    private int f118786e;

    /* renamed from: f */
    private List<EditVideoSegment> f118787f;

    /* renamed from: a */
    public final void mo94316a() {
        super.mo94316a();
    }

    /* renamed from: f */
    public final String mo94328f() {
        return "extract_movie";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ Void mo94331g() throws Exception {
        if (C50201e.m108355a(this.f118787f)) {
            return null;
        }
        ArrayList<EditVideoSegment> arrayList = new ArrayList<>();
        ArrayList<EditVideoSegment> arrayList2 = new ArrayList<>();
        for (EditVideoSegment editVideoSegment : this.f118787f) {
            if (C44300e.m97039a(editVideoSegment.getVideoPath())) {
                arrayList.add(editVideoSegment);
            } else {
                arrayList2.add(editVideoSegment);
            }
        }
        HashSet hashSet = new HashSet();
        for (EditVideoSegment videoPath : arrayList) {
            Bitmap a = C50199c.m108334a(videoPath.getVideoPath(), C47037i.f118791a);
            if (a != null) {
                String a2 = this.f118776c.mo78585a();
                C50199c.m108337a(a, new File(a2), 70, CompressFormat.JPEG);
                hashSet.add(a2);
            }
        }
        String str = this.f118776c.f118792a;
        if (!str.endsWith(File.separator)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(File.separator);
            str = sb.toString();
        }
        int i = 0;
        for (EditVideoSegment editVideoSegment2 : arrayList2) {
            String videoPath2 = editVideoSegment2.getVideoPath();
            int[] a3 = m102140a(editVideoSegment2);
            int i2 = C47037i.f118791a[0];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i);
            sb2.append("extract_frame");
            VEUtils.saveVideoFrames(videoPath2, a3, i2, -1, false, str, sb2.toString(), 1);
            i++;
        }
        File[] listFiles = new File(str).listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (File absolutePath : listFiles) {
                hashSet.add(absolutePath.getAbsolutePath());
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList3.add((String) it.next());
        }
        this.f118774a.clearAllFrames();
        this.f118774a.addFrameSegment(arrayList3);
        return null;
    }

    public C47033e(List<EditVideoSegment> list) {
        this.f118787f = list;
    }

    /* renamed from: a */
    public final void mo94320a(boolean z) {
        super.mo94320a(z);
    }

    /* renamed from: a */
    public final void mo94318a(C47039a aVar) {
        super.mo94318a(aVar);
        if (m102125b()) {
            C0013i.m16a((Callable<TResult>) new C47034f<TResult>(this)).mo19a((C0011g<TResult, TContinuationResult>) new C47035g<TResult,TContinuationResult>(this, aVar));
        }
    }

    /* renamed from: a */
    private int[] m102140a(EditVideoSegment editVideoSegment) {
        int[] iArr;
        int i = 0;
        if (editVideoSegment.getVideoCutInfo() != null) {
            VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
            this.f118786e = ((int) (videoCutInfo.getEnd() - videoCutInfo.getStart())) / 500;
            iArr = new int[this.f118786e];
            while (i < this.f118786e) {
                iArr[i] = (int) (videoCutInfo.getStart() + ((long) (i * 500)));
                i++;
            }
        } else {
            this.f118786e = (int) (editVideoSegment.getVideoFileInfo().getDuration() / 500);
            iArr = new int[this.f118786e];
            while (i < this.f118786e) {
                iArr[i] = i * 500;
                i++;
            }
        }
        return iArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo94330a(C47039a aVar, C0013i iVar) throws Exception {
        aVar.mo86668a(iVar.mo26b());
        mo94320a(true);
        mo94316a();
        return null;
    }
}
