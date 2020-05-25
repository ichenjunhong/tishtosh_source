package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.AudioContent;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.dd */
public class C33842dd extends C33805c<AudioContent> {

    /* renamed from: A */
    private final float f87794A = ((float) ((int) C9432q.m18687b(C11010c.m22280a(), 71.0f)));

    /* renamed from: B */
    private final int f87795B = ((int) C9432q.m18687b(C11010c.m22280a(), 3.0f));

    /* renamed from: C */
    private int f87796C = R.drawable.d5n;

    /* renamed from: D */
    private int f87797D = R.drawable.d9y;

    /* renamed from: u */
    protected ImageView f87798u;

    /* renamed from: v */
    protected TextView f87799v;

    /* renamed from: w */
    protected View f87800w;

    /* renamed from: x */
    protected C33820cn f87801x;

    /* renamed from: y */
    public String f87802y = "";

    /* renamed from: z */
    private final float f87803z = ((float) ((int) C9432q.m18687b(C11010c.m22280a(), 244.0f)));

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo71779a() {
        super.mo71779a();
        this.f87708j = (View) mo71845a((int) R.id.ze);
        this.f87798u = (ImageView) mo71845a((int) R.id.dsf);
        this.f87799v = (TextView) mo71845a((int) R.id.dsg);
        this.f87800w = (View) mo71845a((int) R.id.dsk);
        this.f87704f = (ImageView) mo71845a((int) R.id.css);
        this.f87801x = new C33820cn(this.f87704f);
        if (this.f87708j != null) {
            Drawable background = this.f87708j.getBackground();
            if (background != null && VERSION.SDK_INT >= 19) {
                background.setAutoMirrored(true);
            }
        }
    }

    /* renamed from: a */
    public void mo71783a(OnClickListener onClickListener) {
        super.mo71783a(onClickListener);
        this.f87708j.setOnClickListener(onClickListener);
        this.f87713o.mo73331a(this.f87708j);
        this.f87704f.setOnClickListener(onClickListener);
        this.f87713o.mo73331a(this.f87704f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo71875b(int i) {
        if (i > 0 && i <= 60) {
            LayoutParams layoutParams = (LayoutParams) this.f87708j.getLayoutParams();
            if (i <= 3) {
                layoutParams.width = (int) this.f87794A;
            } else {
                layoutParams.width = (int) (this.f87794A + ((float) (this.f87795B * (i - 3))));
            }
            if (((float) layoutParams.width) > this.f87803z) {
                layoutParams.width = (int) this.f87803z;
            }
            this.f87708j.setLayoutParams(layoutParams);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo71786a(C11207p pVar, int i) {
        if (pVar != null) {
            pVar.isSelf();
        }
    }

    public C33842dd(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo71780a(C11207p pVar, C11207p pVar2, AudioContent audioContent, int i) {
        super.mo71780a(pVar, pVar2, audioContent, i);
        this.f87801x.mo71862a(this.f87712n);
        int duration = ((int) audioContent.getDuration()) / 1000;
        if (pVar.getLocalExt().get("isPlayed") == null || !((String) pVar.getLocalExt().get("isPlayed")).equals("1")) {
            this.f87800w.setVisibility(0);
        } else {
            this.f87800w.setVisibility(8);
        }
        if (!TextUtils.equals(pVar.getUuid(), this.f87802y)) {
            if (this.f87798u.getBackground() instanceof AnimationDrawable) {
                ((AnimationDrawable) this.f87798u.getBackground()).stop();
            }
            this.f87798u.setBackgroundResource(this.f87797D);
        } else {
            this.f87798u.setBackgroundResource(this.f87796C);
            ((AnimationDrawable) this.f87798u.getBackground()).start();
        }
        mo71875b(duration);
        TextView textView = this.f87799v;
        StringBuilder sb = new StringBuilder();
        sb.append(duration);
        sb.append("''");
        textView.setText(sb.toString());
        this.f87708j.setTag(50331648, Integer.valueOf(19));
        this.f87708j.setTag(67108864, this.f87712n);
    }
}
