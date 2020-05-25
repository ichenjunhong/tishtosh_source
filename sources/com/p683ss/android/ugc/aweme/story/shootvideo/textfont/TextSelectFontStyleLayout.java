package com.p683ss.android.ugc.aweme.story.shootvideo.textfont;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9432q;
import com.bytedance.p582g.p583a.p593e.C10022a;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.DmtAutoCenterScrollView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textfont.TextSelectFontStyleLayout */
public class TextSelectFontStyleLayout extends FrameLayout {

    /* renamed from: a */
    public String f117733a;

    /* renamed from: b */
    private List<C46678b> f117734b = new ArrayList();

    /* renamed from: c */
    private C46675a f117735c;

    /* renamed from: d */
    private List<TextFontTypeLayout> f117736d = new ArrayList();

    /* renamed from: e */
    private DmtAutoCenterScrollView f117737e;

    /* renamed from: f */
    private LinearLayout f117738f;

    /* renamed from: g */
    private int f117739g;

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textfont.TextSelectFontStyleLayout$a */
    public interface C46675a {
        /* renamed from: a */
        void mo93611a(C46678b bVar);
    }

    /* renamed from: a */
    public final void mo93607a() {
        for (TextFontTypeLayout textFontTypeLayout : this.f117736d) {
            String b = C46679c.m101291a().mo93628b(this.f117739g);
            if (TextUtils.isEmpty(b) || !b.equals(textFontTypeLayout.getTag())) {
                textFontTypeLayout.setBackground(0);
            } else if (textFontTypeLayout.mo93598a()) {
                textFontTypeLayout.setBackground(1);
                textFontTypeLayout.mo93599b();
                this.f117737e.mo93811a(textFontTypeLayout);
            }
        }
    }

    public void setClickFontStyleListener(C46675a aVar) {
        this.f117735c = aVar;
    }

    /* renamed from: a */
    public final void mo93608a(C46678b bVar) {
        if (this.f117735c != null) {
            this.f117735c.mo93611a(bVar);
        }
        mo93607a();
    }

    /* renamed from: a */
    public final void mo93609a(List<C46678b> list) {
        if (C10022a.m20170a(this.f117734b)) {
            if (C10022a.m20170a(list)) {
                C46679c.m101291a().mo93624a(getContext());
                return;
            }
            this.f117734b = list;
            for (int i = 0; i < this.f117734b.size(); i++) {
                if (this.f117734b.get(i) != null) {
                    C46678b bVar = (C46678b) this.f117734b.get(i);
                    TextFontTypeLayout textFontTypeLayout = new TextFontTypeLayout(getContext());
                    if (bVar != null) {
                        textFontTypeLayout.setFontData(bVar);
                        textFontTypeLayout.mo93601d();
                        textFontTypeLayout.mo93599b();
                    }
                    textFontTypeLayout.setBackground(0);
                    if (!"default".equals(C46679c.m101291a().mo93628b(this.f117739g))) {
                        String b = C46679c.m101291a().mo93628b(this.f117739g);
                        if (!TextUtils.isEmpty(b) && b.equals(bVar.f117747e) && textFontTypeLayout.mo93598a()) {
                            textFontTypeLayout.setBackground(1);
                        }
                    } else if (i == 0 && bVar != null && textFontTypeLayout.mo93598a()) {
                        C46679c.m101291a().mo93625a(bVar.f117747e, this.f117739g);
                        textFontTypeLayout.setBackground(1);
                    }
                    textFontTypeLayout.setTag(bVar.f117747e);
                    textFontTypeLayout.setOnClickListener(new C46687h(this, textFontTypeLayout));
                    textFontTypeLayout.setDownloadCallback(new C46677a() {
                        /* renamed from: a */
                        public final void mo93597a(boolean z) {
                        }

                        /* renamed from: a */
                        public final void mo93596a(C46678b bVar, boolean z, boolean z2) {
                            if (z && bVar != null && !TextUtils.isEmpty(bVar.f117747e) && bVar.f117747e.equals(TextSelectFontStyleLayout.this.f117733a)) {
                                TextSelectFontStyleLayout.this.mo93608a(bVar);
                            }
                        }
                    });
                    this.f117736d.add(textFontTypeLayout);
                    this.f117738f.addView(textFontTypeLayout);
                }
            }
        }
    }

    public TextSelectFontStyleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f117739g = i;
        this.f117738f = new LinearLayout(getContext());
        this.f117737e = new DmtAutoCenterScrollView(getContext(), null);
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        this.f117738f.setPadding((int) C9432q.m18687b(getContext(), 12.0f), 0, 0, 0);
        this.f117737e.addView(this.f117738f, layoutParams);
        this.f117737e.setHorizontalScrollBarEnabled(false);
        addView(this.f117737e, new LayoutParams(-1, -1));
    }
}
