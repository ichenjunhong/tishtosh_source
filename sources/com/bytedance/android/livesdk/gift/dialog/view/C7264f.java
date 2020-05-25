package com.bytedance.android.livesdk.gift.dialog.view;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Point;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p230g.C3899m;
import com.bytedance.android.live.core.p230g.C3909r.C3910a;
import com.bytedance.android.livesdk.gift.C7647s;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.GiftViewModel;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.p379a.C7491b;
import com.bytedance.android.livesdk.gift.model.p379a.C7497h;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.gift.dialog.view.f */
public final class C7264f extends C1322a<C7267i> {

    /* renamed from: a */
    final List<C7491b> f19753a = new ArrayList();

    /* renamed from: b */
    private final LayoutInflater f19754b;

    /* renamed from: c */
    private final GiftViewModel f19755c;

    public final int getItemCount() {
        return this.f19753a.size();
    }

    public final int getItemViewType(int i) {
        if (i < 0 || i >= this.f19753a.size()) {
            return super.getItemViewType(i);
        }
        C7491b bVar = (C7491b) this.f19753a.get(i);
        if (bVar != null) {
            return bVar.f20513a;
        }
        return super.getItemViewType(i);
    }

    public C7264f(Context context, GiftViewModel giftViewModel) {
        this.f19754b = LayoutInflater.from(context);
        this.f19755c = giftViewModel;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        int b;
        C7267i iVar = new C7267i(this.f19754b.inflate(R.layout.bvm, null), i, this.f19755c);
        Context context = iVar.itemView.getContext();
        if (context == null) {
            return iVar;
        }
        GiftViewModel giftViewModel = this.f19755c;
        boolean z = true;
        if (giftViewModel.f19826c != null) {
            z = ((Boolean) giftViewModel.f19826c.get("data_is_portrait", Boolean.valueOf(true))).booleanValue();
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        if (z) {
            b = point.x;
        } else {
            b = (int) C9432q.m18687b(context, 398.0f);
        }
        iVar.itemView.setLayoutParams(new LayoutParams(b / 4, (int) C9432q.m18687b(context, 110.0f)));
        return iVar;
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        boolean z;
        boolean z2;
        int i2;
        int i3;
        C7267i iVar = (C7267i) vVar;
        C7491b bVar = (C7491b) this.f19753a.get(i);
        if (bVar != null) {
            if (bVar.f20513a == 0) {
                iVar.itemView.setVisibility(4);
            }
            if (bVar != null) {
                iVar.f19768k = bVar;
                if (!(iVar.f19768k instanceof C7497h) || !(iVar.f19768k.f20516d instanceof Prop) || ((Prop) iVar.f19768k.f20516d).propType != 4) {
                    z = false;
                } else {
                    z = true;
                }
                C3899m.m9858a(iVar.f19760c, bVar.mo13918o(), (C3910a) new C3910a(bVar) {

                    /* renamed from: a */
                    final /* synthetic */ C7491b f19774a;

                    /* renamed from: a */
                    public final void mo9270a(ImageModel imageModel) {
                    }

                    {
                        this.f19774a = r2;
                    }

                    /* renamed from: a */
                    public final void mo9272a(ImageModel imageModel, Exception exc) {
                        if (this.f19774a.f20513a == 1) {
                            C7647s.m15651a(this.f19774a.mo13919p(), imageModel.getUri(), exc.getMessage());
                        }
                    }

                    /* renamed from: a */
                    public final void mo9271a(ImageModel imageModel, int i, int i2, boolean z) {
                        if (this.f19774a.f20513a == 1) {
                            C7647s.m15650a(this.f19774a.mo13919p(), imageModel.getUri());
                        }
                    }
                });
                if (iVar.f19759b == 5 || iVar.f19759b == 3) {
                    iVar.f19764g.setText(bVar.mo13915l());
                    return;
                }
                if (bVar.mo13920q() != null) {
                    iVar.f19762e.setVisibility(0);
                    C3899m.m9858a(iVar.f19762e, bVar.mo13920q(), (C3910a) new C3910a() {
                        /* renamed from: a */
                        public final void mo9270a(ImageModel imageModel) {
                        }

                        /* renamed from: a */
                        public final void mo9272a(ImageModel imageModel, Exception exc) {
                            C7267i.this.f19762e.setVisibility(8);
                        }

                        /* renamed from: a */
                        public final void mo9271a(ImageModel imageModel, int i, int i2, boolean z) {
                            LayoutParams layoutParams = C7267i.this.f19762e.getLayoutParams();
                            layoutParams.width = (int) (((float) layoutParams.height) * (((float) i) / ((float) i2)));
                            C7267i.this.f19762e.setLayoutParams(layoutParams);
                            C7267i.this.f19762e.setVisibility(0);
                        }
                    });
                } else {
                    iVar.f19762e.setVisibility(8);
                }
                iVar.f19764g.setText(bVar.mo13913j());
                Context context = iVar.itemView.getContext();
                if (context != null) {
                    if (bVar.f20516d instanceof C7505d) {
                        C7505d dVar = (C7505d) bVar.f20516d;
                        int i4 = dVar.f20545f;
                        boolean z3 = dVar.f20546g;
                        iVar.f19766i.setVisibility(8);
                        if (TextUtils.isEmpty(dVar.f20538G)) {
                            iVar.f19771n.setVisibility(8);
                        } else {
                            iVar.f19771n.setText(dVar.f20538G);
                            iVar.f19771n.setVisibility(0);
                        }
                        i2 = i4;
                        z2 = z3;
                    } else if (bVar.f20516d instanceof Prop) {
                        Prop prop = (Prop) bVar.f20516d;
                        if (prop.gift == null || !prop.gift.f20546g) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        iVar.mo13512a(prop, z);
                        i2 = prop.diamond;
                    } else {
                        i2 = 0;
                        z2 = false;
                    }
                    if (z2) {
                        i3 = iVar.f19758a.mo13527a() * i2;
                    } else {
                        i3 = i2;
                    }
                    if (i2 > 0) {
                        iVar.f19765h.setText(context.getString(R.string.hos, new Object[]{String.valueOf(i2)}));
                        iVar.f19765h.setTextColor(context.getResources().getColor(R.color.b2q));
                        iVar.f19767j.mo13506a(bVar.mo13918o(), context.getString(R.string.hos, new Object[]{String.valueOf(i3)}), context.getResources().getColor(R.color.b2q), context.getString(R.string.f0w));
                    } else if (z) {
                        String str = "";
                        int color = context.getResources().getColor(R.color.b2q);
                        if (bVar.f20516d instanceof Prop) {
                            Prop prop2 = (Prop) bVar.f20516d;
                            if (prop2.count <= 0) {
                                str = context.getString(R.string.hsp);
                                color = context.getResources().getColor(R.color.b4i);
                            } else {
                                str = prop2.description;
                                color = context.getResources().getColor(R.color.b2q);
                            }
                        }
                        iVar.f19765h.setText(str);
                        iVar.f19765h.setTextColor(color);
                        iVar.f19767j.mo13506a(bVar.mo13918o(), str, color, context.getString(R.string.hsw));
                    } else {
                        String string = context.getString(R.string.ehi);
                        iVar.f19765h.setText(string);
                        iVar.f19765h.setTextColor(context.getResources().getColor(R.color.b2q));
                        iVar.f19767j.mo13506a(bVar.mo13918o(), string, context.getResources().getColor(R.color.b2q), context.getString(R.string.f0w));
                    }
                    if (bVar.mo13917n() != null) {
                        iVar.f19761d.setVisibility(0);
                        iVar.f19763f.setVisibility(8);
                        C3899m.m9858a(iVar.f19761d, bVar.mo13917n(), (C3910a) new C3910a() {
                            /* renamed from: a */
                            public final void mo9270a(ImageModel imageModel) {
                            }

                            /* renamed from: a */
                            public final void mo9272a(ImageModel imageModel, Exception exc) {
                            }

                            /* renamed from: a */
                            public final void mo9271a(ImageModel imageModel, int i, int i2, boolean z) {
                                if (i != 0 && i2 != 0) {
                                    LayoutParams layoutParams = C7267i.this.f19761d.getLayoutParams();
                                    layoutParams.width = (int) (((float) i) * (C7267i.this.f19773p / ((float) i2)));
                                    C7267i.this.f19761d.setLayoutParams(layoutParams);
                                }
                            }
                        });
                    } else if (z2) {
                        iVar.f19761d.setVisibility(8);
                        iVar.f19763f.setVisibility(0);
                    } else {
                        iVar.f19761d.setVisibility(8);
                        iVar.f19763f.setVisibility(8);
                    }
                    boolean z4 = bVar.f20514b;
                    iVar.f19770m.mo13485a();
                    iVar.f19770m.setVisibility(8);
                    if (z4) {
                        iVar.f19767j.setVisibility(0);
                        LiveSendGiftAnimationView liveSendGiftAnimationView = iVar.f19767j;
                        if (liveSendGiftAnimationView.f19741a == null || liveSendGiftAnimationView.f19741a.second == null || liveSendGiftAnimationView.f19741a.first == null || ((Float) liveSendGiftAnimationView.f19741a.first).floatValue() != 1.08f) {
                            PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("scaleX", new float[]{1.0f, 1.08f, 1.0f});
                            PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("scaleY", new float[]{1.0f, 1.08f, 1.0f});
                            liveSendGiftAnimationView.f19741a = new Pair<>(Float.valueOf(1.08f), ObjectAnimator.ofPropertyValuesHolder(liveSendGiftAnimationView, new PropertyValuesHolder[]{ofFloat, ofFloat2}));
                            ((Animator) liveSendGiftAnimationView.f19741a.second).setDuration(200);
                        }
                        ((Animator) liveSendGiftAnimationView.f19741a.second).start();
                        iVar.f19769l.setVisibility(8);
                        return;
                    }
                    iVar.f19767j.setVisibility(8);
                    iVar.f19769l.setVisibility(0);
                }
            }
        }
    }
}
