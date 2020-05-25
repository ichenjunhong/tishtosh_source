package com.p683ss.android.ugc.aweme.shortvideo.local;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimatedImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.p1361ap.C22817e;
import com.p683ss.android.ugc.aweme.p1361ap.p1362a.C22795c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.tools.p2504a.C50181a;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.local.UploadButton */
public class UploadButton extends FrameLayout implements C22817e {

    /* renamed from: a */
    AnimatedImageView f111293a;

    /* renamed from: b */
    private View f111294b;

    /* renamed from: c */
    private View f111295c;

    /* renamed from: d */
    private View f111296d;

    /* renamed from: e */
    private TextView f111297e;

    /* renamed from: f */
    private ViewGroup f111298f;

    /* renamed from: g */
    private Context f111299g;

    /* renamed from: a */
    public final boolean mo89520a() {
        if (C39618d.f101144H.mo58572c().mo49434a(this.f111299g) != 0) {
            return false;
        }
        C22795c.m56157a(C39618d.f101160a.getApplicationContext());
        C22795c.m56156a().mo47268a(1, 1, 0, this);
        return true;
    }

    public UploadButton(Context context) {
        this(context, null);
    }

    public UploadButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public UploadButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f111299g = context;
        this.f111294b = LayoutInflater.from(context).inflate(R.layout.aw2, this, true);
        this.f111293a = (AnimatedImageView) this.f111294b.findViewById(R.id.b56);
        this.f111297e = (TextView) this.f111294b.findViewById(R.id.di6);
        this.f111295c = this.f111294b.findViewById(R.id.dqv);
        this.f111296d = this.f111294b.findViewById(R.id.dqw);
        this.f111298f = (ViewGroup) this.f111294b.findViewById(R.id.ah4);
    }

    /* renamed from: a */
    public final void mo47292a(boolean z, int i, List<MediaModel> list) {
        if (z && i == 1) {
            StringBuilder sb = new StringBuilder("res://");
            sb.append(C39618d.f101160a.getPackageName());
            sb.append("/2131954348");
            String sb2 = sb.toString();
            if (list != null && list.size() > 0) {
                MediaModel mediaModel = (MediaModel) list.get(0);
                if (mediaModel != null) {
                    StringBuilder sb3 = new StringBuilder("file://");
                    sb3.append(mediaModel.f95383b);
                    sb2 = sb3.toString();
                }
            }
            int measuredWidth = this.f111293a.getMeasuredWidth();
            if (measuredWidth <= 0) {
                measuredWidth = C23728o.m58241a(32.0d);
            }
            C50181a.m108293a((SimpleDraweeView) this.f111293a, sb2, measuredWidth, measuredWidth);
        }
    }
}
