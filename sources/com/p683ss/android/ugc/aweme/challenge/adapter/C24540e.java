package com.p683ss.android.ugc.aweme.challenge.adapter;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.detail.base.C27322b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.challenge.adapter.e */
public class C24540e extends C24534a {

    /* renamed from: a */
    protected Context f64970a;

    /* renamed from: b */
    protected String f64971b;

    /* renamed from: c */
    protected RemoteImageView f64972c;

    /* renamed from: d */
    protected TextView f64973d;

    /* renamed from: e */
    protected TextView f64974e;

    /* renamed from: f */
    protected TextView f64975f;

    /* renamed from: g */
    protected TextView f64976g;

    /* renamed from: h */
    protected View f64977h;

    /* renamed from: o */
    private DmtTextView f64978o;

    /* renamed from: b */
    public final int[] mo50307b() {
        return C47788ct.m103417a(200);
    }

    /* renamed from: a */
    public final void mo50301a() {
        if (this.f70665k != null) {
            Video video = ((Aweme) this.f70665k).getVideo();
            if (video != null) {
                if (mo54753a(video, "DetailAwemeViewHolder")) {
                    this.f70667m = true;
                    return;
                }
                mo54752a(video.getCover(), "DetailAwemeViewHolder");
            }
        }
    }

    /* renamed from: c */
    public final void mo50308c() {
        if (this.f70665k != null) {
            Video video = ((Aweme) this.f70665k).getVideo();
            if (video != null) {
                if (mo54753a(video, "DetailAwemeViewHolder")) {
                    this.f70667m = true;
                    return;
                }
                mo54752a(video.getCover(), "DetailAwemeViewHolder");
            }
        }
    }

    /* renamed from: a */
    public final void mo50305a(Aweme aweme) {
        this.f64978o.setVisibility(0);
        if (aweme.getStatistics() != null) {
            String a = C33095b.m76068a(aweme.getStatistics().getDiggCount());
            this.f64978o.setText(a);
            this.f64978o.setContentDescription(this.f64970a.getString(R.string.cyr, new Object[]{a}));
        }
    }

    /* renamed from: a */
    protected static void m59955a(TextView textView, AwemeTextLabelModel awemeTextLabelModel) {
        if (TextUtils.isEmpty(awemeTextLabelModel.getLabelName())) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(awemeTextLabelModel.getLabelName());
        textView.setTextSize(0, (float) C23728o.m58241a(12.0d));
        textView.setTextColor(Color.parseColor(awemeTextLabelModel.getTextColor()));
        textView.setBackground(C23729p.m58249a(Color.parseColor(awemeTextLabelModel.getBgColor()), (float) C23728o.m58241a(2.0d)));
        textView.setSingleLine();
    }

    /* renamed from: a */
    public final void mo50302a(Aweme aweme, int i, boolean z) {
        mo50306b(aweme, i, z);
    }

    public C24540e(View view, String str, final C24579d dVar) {
        super(view);
        this.f64970a = view.getContext();
        this.f64971b = str;
        this.f70666l = (SmartImageView) view.findViewById(R.id.a22);
        this.f64972c = (RemoteImageView) view.findViewById(R.id.azw);
        this.f64976g = (TextView) view.findViewById(R.id.ez9);
        this.f64974e = (TextView) view.findViewById(R.id.b4a);
        this.f64975f = (TextView) view.findViewById(R.id.b4c);
        this.f64973d = (TextView) view.findViewById(R.id.b4u);
        this.f64978o = (DmtTextView) view.findViewById(R.id.baj);
        this.f64978o.setVisibility(8);
        this.f64977h = view.findViewById(R.id.f6n);
        this.f64977h.setVisibility(8);
        this.f70666l.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (((Aweme) C24540e.this.f70665k).getStatus() == null || !((Aweme) C24540e.this.f70665k).getStatus().isDelete()) {
                    if (dVar != null) {
                        dVar.mo50347a(view, (Aweme) C24540e.this.f70665k, C24540e.this.f64971b);
                    }
                    return;
                }
                C10691a.m21548c(C24540e.this.f64970a, (int) R.string.fax).mo19066a();
            }
        });
        this.f70666l.setAnimationListener(this.f70660j);
    }

    /* renamed from: b */
    public void mo50306b(Aweme aweme, int i, boolean z) {
        super.mo54774a(aweme, i);
        this.f70666l.setContentDescription(this.f64970a.getString(R.string.faz, new Object[]{Integer.valueOf(i + 1)}));
        if (aweme != null) {
            this.f70665k = aweme;
            if (z) {
                mo50301a();
            }
            this.f64972c.setVisibility(4);
            this.f64973d.setVisibility(8);
            this.f64974e.setVisibility(8);
            this.f64975f.setVisibility(8);
            C27322b.m65849a(this.f64977h, mo54754d());
            this.f64976g.setVisibility(8);
            C27322b.m65849a(this.f64976g, aweme);
        }
    }
}
