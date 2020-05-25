package com.bytedance.android.livesdk.gift.dialog.view.topbar;

import android.content.Context;
import android.support.constraint.ConstraintLayout.LayoutParams;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.gift.dialog.view.GradientStrokeView;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.GiftViewModel;
import com.bytedance.android.livesdk.gift.model.C7507f;
import com.bytedance.android.livesdk.gift.model.p379a.C7491b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;
import java.util.List;

public class LiveGiftGroupView extends FrameLayout {

    /* renamed from: a */
    public RecyclerView f19784a;

    /* renamed from: b */
    C7277a f19785b;

    /* renamed from: c */
    public List<C7507f> f19786c;

    /* renamed from: d */
    public View f19787d;

    /* renamed from: e */
    public View f19788e;

    /* renamed from: f */
    public C7491b f19789f;

    /* renamed from: g */
    public GiftViewModel f19790g;

    /* renamed from: h */
    public Room f19791h;

    /* renamed from: i */
    boolean f19792i;

    /* renamed from: com.bytedance.android.livesdk.gift.dialog.view.topbar.LiveGiftGroupView$a */
    class C7277a extends C1322a<C7278b> {
        public final int getItemCount() {
            if (LiveGiftGroupView.this.f19786c != null) {
                return LiveGiftGroupView.this.f19786c.size();
            }
            return 0;
        }

        private C7277a() {
        }

        public final int getItemViewType(int i) {
            if (LiveGiftGroupView.this.f19786c == null) {
                return 1;
            }
            if (i == 0) {
                return 0;
            }
            if (i == LiveGiftGroupView.this.f19786c.size() - 1) {
                return 2;
            }
            return 1;
        }

        public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
            C7278b bVar = (C7278b) vVar;
            if (LiveGiftGroupView.this.f19786c != null) {
                C7507f fVar = (C7507f) LiveGiftGroupView.this.f19786c.get(i);
                if (fVar != null) {
                    bVar.f19795a.setShowStroke(fVar.f20573c);
                    int i2 = 0;
                    bVar.f19796b.setText(LiveGiftGroupView.this.getContext().getString(R.string.ei8, new Object[]{Integer.valueOf(fVar.f20571a)}));
                    boolean z = !TextUtils.isEmpty(fVar.f20572b);
                    if (z) {
                        bVar.f19797c.setVisibility(0);
                        bVar.f19797c.setText(String.valueOf(fVar.f20572b));
                    } else {
                        bVar.f19797c.setVisibility(8);
                    }
                    if (bVar.f19796b.getLayoutParams() instanceof LayoutParams) {
                        LayoutParams layoutParams = (LayoutParams) bVar.f19796b.getLayoutParams();
                        layoutParams.f864h = 0;
                        if (z) {
                            i2 = -1;
                        }
                        layoutParams.f867k = i2;
                        bVar.f19796b.setLayoutParams(layoutParams);
                    }
                    bVar.itemView.setOnClickListener(new C7279a(bVar, fVar));
                }
            }
        }

        public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
            View inflate = LayoutInflater.from(LiveGiftGroupView.this.getContext()).inflate(R.layout.bvj, null);
            C7278b bVar = new C7278b(inflate);
            int b = (int) C9432q.m18687b(LiveGiftGroupView.this.getContext(), 114.0f);
            int b2 = (int) C9432q.m18687b(LiveGiftGroupView.this.getContext(), 106.0f);
            int b3 = (int) C9432q.m18687b(LiveGiftGroupView.this.getContext(), 34.0f);
            int b4 = (int) C9432q.m18687b(LiveGiftGroupView.this.getContext(), 16.0f);
            if (i != 1) {
                if (i == 0) {
                    bVar.itemView.setLayoutParams(new ViewGroup.LayoutParams(b2, b3));
                } else if (i == 2) {
                    bVar.itemView.setLayoutParams(new ViewGroup.LayoutParams(b, b3));
                }
                View findViewById = inflate.findViewById(R.id.e_i);
                if (findViewById.getLayoutParams() instanceof LayoutParams) {
                    LayoutParams layoutParams = (LayoutParams) findViewById.getLayoutParams();
                    if (i == 0) {
                        layoutParams.leftMargin = b4;
                        layoutParams.setMarginStart(b4);
                    } else if (i == 2) {
                        layoutParams.rightMargin = b4;
                        layoutParams.setMarginEnd(b4);
                    }
                    findViewById.setLayoutParams(layoutParams);
                }
            }
            return bVar;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.gift.dialog.view.topbar.LiveGiftGroupView$b */
    class C7278b extends C1352v {

        /* renamed from: a */
        GradientStrokeView f19795a;

        /* renamed from: b */
        TextView f19796b;

        /* renamed from: c */
        TextView f19797c;

        public C7278b(View view) {
            super(view);
            this.f19795a = (GradientStrokeView) view.findViewById(R.id.e_i);
            this.f19796b = (TextView) view.findViewById(R.id.e_k);
            this.f19797c = (TextView) view.findViewById(R.id.e_m);
        }
    }

    public LiveGiftGroupView(Context context) {
        this(context, null);
    }

    public LiveGiftGroupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveGiftGroupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(getContext()).inflate(R.layout.bxd, this);
        this.f19784a = (RecyclerView) findViewById(R.id.e_l);
        this.f19787d = findViewById(R.id.ewq);
        this.f19788e = findViewById(R.id.e7b);
        this.f19785b = new C7277a();
        boolean z = false;
        this.f19784a.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f19784a.setAdapter(this.f19785b);
        this.f19784a.mo4801a((C1340m) new C1340m() {
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                int i3;
                super.onScrolled(recyclerView, i, i2);
                if (LiveGiftGroupView.this.f19784a.getLayoutManager() instanceof LinearLayoutManager) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) LiveGiftGroupView.this.f19784a.getLayoutManager();
                    int k = linearLayoutManager.mo4750k();
                    int m = linearLayoutManager.mo4752m();
                    View view = LiveGiftGroupView.this.f19787d;
                    int i4 = 0;
                    if (k == 0) {
                        i3 = 8;
                    } else {
                        i3 = 0;
                    }
                    view.setVisibility(i3);
                    View view2 = LiveGiftGroupView.this.f19788e;
                    if (m == LiveGiftGroupView.this.f19786c.size() - 1) {
                        i4 = 8;
                    }
                    view2.setVisibility(i4);
                }
            }
        });
        if ((((Integer) LiveConfigSettingKeys.LIVE_GIFT_PANEL_FUNCTION.mo9431a()).intValue() & 2) == 2) {
            z = true;
        }
        this.f19792i = z;
    }
}
