package com.bytedance.android.livesdk.chatroom.p325ui;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.support.p043v7.widget.LinearLayoutCompat.LayoutParams;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.model.C5727ap;
import com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget;
import com.bytedance.android.livesdkapi.depend.model.live.C8721u;
import com.bytedance.android.livesdkapi.host.C8794c.C8795a;
import com.bytedance.android.livesdkapi.host.C8794c.C8797c;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ev */
public final class C6173ev extends C1322a<C6175a<C8721u>> {

    /* renamed from: a */
    List<C8721u> f16584a = new ArrayList();

    /* renamed from: b */
    public C6176b f16585b;

    /* renamed from: c */
    private int f16586c = -1;

    /* renamed from: d */
    private int f16587d = -1;

    /* renamed from: e */
    private OnClickListener f16588e = new OnClickListener() {
        public final void onClick(View view) {
            if (view.getTag() != null && C6173ev.this.f16585b != null) {
                C8721u uVar = (C8721u) view.getTag();
                if (uVar.f23947h != DecorationWrapperWidget.m13476f() && uVar.f23947h != DecorationWrapperWidget.m13474e()) {
                    C6173ev.this.f16585b.mo12219a(uVar);
                }
            }
        }
    };

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.ev$a */
    static abstract class C6175a<T> extends C1352v {
        /* renamed from: a */
        public abstract void mo12218a(T t);

        C6175a(View view) {
            super(view);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.ev$b */
    interface C6176b {
        /* renamed from: a */
        void mo12219a(C8721u uVar);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.ev$c */
    static class C6177c extends C6175a<C8721u> {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo12218a(Object obj) {
        }

        C6177c(View view) {
            super(view);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.ev$d */
    static class C6178d extends C6175a<C8721u> {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo12218a(Object obj) {
        }

        C6178d(View view) {
            super(view);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.ev$e */
    static class C6179e extends C6175a<C8721u> {

        /* renamed from: a */
        ImageView f16590a;

        /* renamed from: b */
        OnClickListener f16591b;

        /* renamed from: a */
        public final /* synthetic */ void mo12218a(Object obj) {
            boolean z;
            float f;
            C8721u uVar = (C8721u) obj;
            if (uVar != null) {
                this.itemView.setTag(uVar);
                if (!(uVar.f23940a == null || uVar.f23940a.getUrls() == null || uVar.f23940a.getUrls().size() <= 0)) {
                    TTLiveSDKContext.getHostService().mo10319l().mo15490a(uVar.f23940a, (C8797c) new C8797c() {
                        /* renamed from: a */
                        public final void mo9146a(C8795a aVar) {
                        }

                        /* renamed from: a */
                        public final void mo9145a(Bitmap bitmap) {
                            if (bitmap != null) {
                                C6179e.this.f16590a.setImageBitmap(bitmap.copy(Config.ARGB_8888, false));
                                C6179e.this.itemView.setOnClickListener(C6179e.this.f16591b);
                            }
                        }
                    });
                }
                if (uVar.f23947h == DecorationWrapperWidget.m13474e()) {
                    z = true;
                } else {
                    z = false;
                }
                ImageView imageView = this.f16590a;
                if (z) {
                    f = 0.3f;
                } else {
                    f = 1.0f;
                }
                imageView.setAlpha(f);
            }
        }

        C6179e(View view, OnClickListener onClickListener) {
            super(view);
            this.f16590a = (ImageView) view.findViewById(R.id.a3t);
            this.f16591b = onClickListener;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.ev$f */
    static class C6181f extends C6175a<C8721u> {

        /* renamed from: a */
        ImageView f16593a;

        /* renamed from: b */
        OnClickListener f16594b;

        /* renamed from: a */
        public final /* synthetic */ void mo12218a(Object obj) {
            boolean z;
            float f;
            C8721u uVar = (C8721u) obj;
            if (uVar != null) {
                this.itemView.setTag(uVar);
                if (!(uVar.f23940a == null || uVar.f23940a.getUrls() == null || uVar.f23940a.getUrls().size() <= 0)) {
                    TTLiveSDKContext.getHostService().mo10319l().mo15490a(uVar.f23940a, (C8797c) new C8797c() {
                        /* renamed from: a */
                        public final void mo9146a(C8795a aVar) {
                        }

                        /* renamed from: a */
                        public final void mo9145a(Bitmap bitmap) {
                            if (bitmap != null) {
                                C6181f.this.f16593a.setImageBitmap(bitmap.copy(Config.ARGB_8888, false));
                                C6181f.this.itemView.setOnClickListener(C6181f.this.f16594b);
                            }
                        }
                    });
                }
                if (uVar.f23947h == DecorationWrapperWidget.m13476f()) {
                    z = true;
                } else {
                    z = false;
                }
                ImageView imageView = this.f16593a;
                if (z) {
                    f = 0.3f;
                } else {
                    f = 1.0f;
                }
                imageView.setAlpha(f);
            }
        }

        C6181f(View view, OnClickListener onClickListener) {
            super(view);
            this.f16593a = (ImageView) view.findViewById(R.id.a3s);
            this.f16594b = onClickListener;
        }
    }

    public final int getItemCount() {
        return this.f16584a.size();
    }

    public final int getItemViewType(int i) {
        if (i == this.f16586c) {
            return 1;
        }
        if (i > this.f16586c && i < this.f16587d) {
            return 3;
        }
        if (i == this.f16587d) {
            return 2;
        }
        return 4;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12216a(C5727ap apVar) {
        if (apVar != null) {
            if (apVar.f15079b != null && apVar.f15079b.size() > 0) {
                this.f16584a.add(null);
                this.f16584a.addAll(apVar.f15079b);
                this.f16586c = (this.f16584a.size() - apVar.f15079b.size()) - 1;
            }
            if (apVar.f15078a != null && apVar.f15078a.size() > 0) {
                this.f16584a.add(null);
                this.f16584a.addAll(apVar.f15078a);
                this.f16587d = (this.f16584a.size() - apVar.f15078a.size()) - 1;
            }
        }
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        ((C6175a) vVar).mo12218a(this.f16584a.get(i));
    }

    public C6173ev(C5727ap apVar, C6176b bVar) {
        mo12216a(apVar);
        this.f16585b = bVar;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        switch (i) {
            case 1:
                return new C6178d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.al3, viewGroup, false));
            case 2:
                return new C6177c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.al2, viewGroup, false));
            case 3:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ah7, viewGroup, false);
                inflate.setLayoutParams(new LayoutParams(-1, -2));
                return new C6179e(inflate, this.f16588e);
            case 4:
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ah5, viewGroup, false);
                if (C3922z.m9916f()) {
                    i2 = C3922z.m9910c();
                } else {
                    i2 = C3922z.m9899a(376.0f);
                }
                int i3 = i2 / 3;
                inflate2.setLayoutParams(new LayoutParams(i3, i3));
                return new C6181f(inflate2, this.f16588e);
            default:
                return null;
        }
    }
}
