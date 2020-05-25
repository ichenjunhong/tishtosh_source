package com.bytedance.android.livesdk.chatroom.p325ui;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p230g.C3909r;
import com.bytedance.android.live.core.p230g.C3909r.C3910a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.fh */
public final class C6206fh extends C1322a<C6207a> {

    /* renamed from: a */
    public OnClickListener f16674a;

    /* renamed from: b */
    private List<ImageModel> f16675b;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.fh$a */
    public static class C6207a extends C1352v {

        /* renamed from: a */
        final int f16676a = C3922z.m9899a(16.0f);

        /* renamed from: b */
        ImageView f16677b = ((ImageView) this.itemView.findViewById(R.id.d5z));

        public C6207a(View view) {
            super(view);
        }
    }

    public final int getItemCount() {
        if (this.f16675b == null) {
            return 0;
        }
        return this.f16675b.size();
    }

    /* renamed from: a */
    public final void mo12248a(List<ImageModel> list) {
        if (!C9376b.m18558a((Collection<T>) list)) {
            if (this.f16675b == null) {
                this.f16675b = new ArrayList();
            }
            this.f16675b.clear();
            this.f16675b.addAll(list);
            notifyDataSetChanged();
        }
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C6207a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.aow, viewGroup, false));
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C6207a aVar = (C6207a) vVar;
        if (!C9376b.m18558a((Collection<T>) this.f16675b) && i < this.f16675b.size()) {
            ImageModel imageModel = (ImageModel) this.f16675b.get(i);
            OnClickListener onClickListener = this.f16674a;
            if (imageModel != null) {
                if (imageModel.getImageType() == 7 || imageModel.getImageType() == 5 || imageModel.getImageType() == 6) {
                    C9432q.m18691b((View) aVar.f16677b, 8);
                    return;
                }
                C3909r.m9880a(aVar.f16677b, imageModel, -1, -1, true, 0, new C3910a() {
                    /* renamed from: a */
                    public final void mo9270a(ImageModel imageModel) {
                    }

                    /* renamed from: a */
                    public final void mo9272a(ImageModel imageModel, Exception exc) {
                    }

                    /* renamed from: a */
                    public final void mo9271a(ImageModel imageModel, int i, int i2, boolean z) {
                        if (i2 > 0 && i > 0) {
                            LayoutParams layoutParams = C6207a.this.f16677b.getLayoutParams();
                            int i3 = C6207a.this.f16676a;
                            layoutParams.height = i3;
                            layoutParams.width = (i * i3) / i2;
                            C6207a.this.f16677b.setLayoutParams(layoutParams);
                        }
                    }
                });
                C9432q.m18683a(true, aVar.itemView, onClickListener);
                aVar.itemView.setTag(imageModel);
            }
        }
    }
}
