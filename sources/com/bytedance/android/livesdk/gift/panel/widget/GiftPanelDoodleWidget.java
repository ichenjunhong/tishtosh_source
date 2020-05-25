package com.bytedance.android.livesdk.gift.panel.widget;

import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.gift.C7648t;
import com.bytedance.android.livesdk.gift.DoodleCanvasView;
import com.bytedance.android.livesdk.gift.DoodleCanvasView.C7188a;
import com.bytedance.android.livesdk.gift.effect.doodle.view.DoodleGiftView;
import com.bytedance.android.livesdk.gift.panel.p380a.C7525b;
import com.bytedance.ies.sdk.widgets.Widget;
import com.ss.android.ugc.trill.R;
import java.util.List;

public class GiftPanelDoodleWidget extends Widget {

    /* renamed from: a */
    View f20827a;

    /* renamed from: b */
    View f20828b;

    /* renamed from: c */
    View f20829c;

    /* renamed from: d */
    View f20830d;

    /* renamed from: e */
    TextView f20831e;

    /* renamed from: f */
    DoodleCanvasView f20832f;

    /* renamed from: g */
    public GiftDialogViewModel f20833g;

    /* renamed from: h */
    private View f20834h;

    /* renamed from: i */
    private DoodleGiftView f20835i;

    public int getLayoutId() {
        return R.layout.ai5;
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f20833g != null) {
            this.f20833g.mo13948a(this);
        }
    }

    public void onCreate() {
        super.onCreate();
        if (this.dataCenter != null) {
            this.f20833g = (GiftDialogViewModel) this.dataCenter.get("data_gift_dialog_view_model");
            if (this.f20833g != null) {
                this.f20827a = this.contentView.findViewById(R.id.akt);
                this.f20828b = this.contentView.findViewById(R.id.dl_);
                this.f20829c = this.contentView.findViewById(R.id.tu);
                this.f20834h = this.contentView.findViewById(R.id.ul);
                this.f20830d = this.contentView.findViewById(R.id.a6z);
                this.f20831e = (TextView) this.contentView.findViewById(R.id.cl7);
                this.f20832f = (DoodleCanvasView) this.contentView.findViewById(R.id.akv);
                this.f20835i = (DoodleGiftView) this.contentView.findViewById(R.id.a8r);
                this.f20827a.setVisibility(8);
                this.f20832f.setDrawDoodleGiftView(this.f20835i);
                this.f20832f.setDoodleCanvasListener(new C7188a() {
                    /* renamed from: a */
                    public final void mo13352a(List<C7648t> list, int i, int i2, int i3) {
                        if (GiftPanelDoodleWidget.this.f20833g != null) {
                            if (list == null || list.isEmpty()) {
                                GiftPanelDoodleWidget.this.f20833g.f20786s.postValue(null);
                                return;
                            }
                            GiftPanelDoodleWidget.this.f20833g.f20786s.postValue(new C7525b(list, i, i2, i3));
                        }
                    }
                });
                this.f20828b.setOnClickListener(new C7611q(this));
                this.f20829c.setOnClickListener(new C7612r(this));
                this.f20834h.setOnClickListener(new C7613s(this));
                this.f20833g.f20786s.observe(this, new C7607m(this));
                this.f20833g.f20785r.observe(this, new C7608n(this));
                this.f20833g.f20787t.observe(this, new C7609o(this));
                this.f20833g.f20780m.observe(this, new C7610p(this));
            }
        }
    }
}
