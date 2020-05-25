package com.p683ss.android.ugc.aweme.infoSticker;

import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9414h;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.C46747d;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.C46747d.C46749a;
import com.p683ss.android.ugc.tools.view.widget.AVStatusView;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.ap */
public final class C35574ap {

    /* renamed from: a */
    TextView f91427a;

    /* renamed from: b */
    FrameLayout f91428b;

    /* renamed from: c */
    EditText f91429c;

    /* renamed from: d */
    ImageButton f91430d;

    /* renamed from: e */
    FrameLayout f91431e;

    /* renamed from: f */
    public AVStatusView f91432f;

    /* renamed from: g */
    RelativeLayout f91433g;

    /* renamed from: h */
    C35560ag f91434h;

    /* renamed from: i */
    FragmentActivity f91435i;

    /* renamed from: j */
    C0654k f91436j;

    /* renamed from: k */
    TextWatcher f91437k;

    /* renamed from: l */
    SearchInfoStickerPresenter f91438l;

    /* renamed from: m */
    View f91439m;

    /* renamed from: n */
    boolean f91440n = true;

    /* renamed from: o */
    C46747d f91441o;

    /* renamed from: p */
    C46749a f91442p;

    /* renamed from: a */
    public final void mo73965a() {
        this.f91429c.setText("");
        this.f91430d.setVisibility(8);
    }

    /* renamed from: c */
    private void m80367c() {
        if (this.f91435i != null && this.f91435i.findViewById(R.id.ciz) == null) {
            m80368d();
        }
    }

    /* renamed from: b */
    public final String mo73968b() {
        if (this.f91429c == null) {
            return "";
        }
        return this.f91429c.getText().toString();
    }

    /* renamed from: d */
    private static void m80368d() {
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            sb.append(stackTraceElement.toString());
            sb.append("\n");
        }
    }

    /* renamed from: b */
    public final void mo73969b(int i) {
        this.f91434h.mo73959a(i);
    }

    /* renamed from: a */
    public final void mo73966a(int i) {
        if (i != -1) {
            switch (i) {
                case 1:
                    this.f91433g.setVisibility(4);
                    this.f91432f.mo98097c();
                    return;
                case 2:
                    this.f91433g.setVisibility(4);
                    this.f91432f.mo98098d();
                    break;
            }
            return;
        }
        this.f91433g.setVisibility(0);
        this.f91432f.mo98093a();
    }

    /* renamed from: a */
    public final void mo73967a(List<C35558ae> list, boolean z) {
        if (C9414h.m18630a(list)) {
            this.f91432f.mo98097c();
            return;
        }
        if (this.f91440n) {
            m80367c();
            this.f91436j.mo2225a().mo2175a((int) R.id.ciz, (Fragment) this.f91434h).mo2189b();
            this.f91440n = false;
        }
        if (z) {
            this.f91434h.mo73962b(list);
        } else {
            this.f91434h.mo73960a(list);
        }
        this.f91434h.f91398b = new C35577ar(this);
    }

    C35574ap(View view, FragmentActivity fragmentActivity, TextWatcher textWatcher) {
        this.f91437k = textWatcher;
        this.f91435i = fragmentActivity;
        this.f91439m = view;
    }
}
