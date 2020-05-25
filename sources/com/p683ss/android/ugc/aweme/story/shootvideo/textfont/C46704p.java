package com.p683ss.android.ugc.aweme.story.shootvideo.textfont;

import android.arch.lifecycle.C0198r;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.C44545c;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.C46757l;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textfont.p */
final /* synthetic */ class C46704p implements Runnable {

    /* renamed from: a */
    private final C46688i f117832a;

    /* renamed from: b */
    private final C46757l f117833b;

    C46704p(C46688i iVar, C46757l lVar) {
        this.f117832a = iVar;
        this.f117833b = lVar;
    }

    public final void run() {
        C46688i iVar = this.f117832a;
        C46757l lVar = this.f117833b;
        C0198r b = iVar.f117800u.mo90442b();
        C44545c cVar = new C44545c((lVar.getHelpRect().width() / 2.0f) + lVar.getHelpRect().left, lVar.getHelpRect().top, R.string.ali, 1, false);
        b.postValue(cVar);
    }
}
