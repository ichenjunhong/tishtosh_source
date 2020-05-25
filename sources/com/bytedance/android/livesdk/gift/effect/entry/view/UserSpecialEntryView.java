package com.bytedance.android.livesdk.gift.effect.entry.view;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.C3014m;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.p309e.C5115z;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.gift.effect.entry.p364b.C7374a.C7375a;
import com.bytedance.android.livesdk.gift.effect.entry.p367e.C7394a;
import com.bytedance.android.livesdk.message.model.C7835bj.C7836a;
import com.bytedance.android.livesdkapi.message.C8848e;
import com.bytedance.android.livesdkapi.message.C8851g;
import com.bytedance.android.livesdkapi.message.C8853i;
import com.bytedance.android.livesdkapi.message.C8857m;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.p936c.C13783a;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.p970j.C14045f;
import com.ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2643g.C52733a;

public final class UserSpecialEntryView extends FrameLayout {

    /* renamed from: d */
    public static final C7401a f20267d = new C7401a(null);

    /* renamed from: a */
    public final View f20268a;

    /* renamed from: b */
    public final View f20269b;

    /* renamed from: c */
    public int f20270c;

    /* renamed from: e */
    private final SimpleDraweeView f20271e;

    /* renamed from: f */
    private final TextView f20272f;

    /* renamed from: g */
    private final HSImageView f20273g;

    /* renamed from: h */
    private final C7402b f20274h;

    /* renamed from: com.bytedance.android.livesdk.gift.effect.entry.view.UserSpecialEntryView$a */
    public static final class C7401a {
        private C7401a() {
        }

        public /* synthetic */ C7401a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.gift.effect.entry.view.UserSpecialEntryView$b */
    public static final class C7402b implements C13791d<C14045f> {

        /* renamed from: a */
        final /* synthetic */ UserSpecialEntryView f20275a;

        public final void onFailure(String str, Throwable th) {
        }

        public final void onIntermediateImageFailed(String str, Throwable th) {
        }

        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, Object obj) {
        }

        public final void onRelease(String str) {
        }

        public final void onSubmit(String str, Object obj) {
        }

        C7402b(UserSpecialEntryView userSpecialEntryView) {
            this.f20275a = userSpecialEntryView;
        }

        public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
            int i;
            C14045f fVar = (C14045f) obj;
            int i2 = 0;
            if (fVar != null) {
                i2 = fVar.getWidth();
                i = fVar.getHeight();
            } else {
                i = 0;
            }
            if (i2 <= 0 || i <= 0) {
                StringBuilder sb = new StringBuilder("Invalid image info received: (w=");
                sb.append(i2);
                sb.append(",h=");
                sb.append(i);
                sb.append(')');
                C3831a.m9716d("UserSpecialEntryView", sb.toString());
                i2 = 540;
                i = 32;
            }
            float a = ((float) C3922z.m9899a(32.0f)) / ((float) i);
            View view = this.f20275a;
            int a2 = C52733a.m112277a(((float) i2) * a);
            if (view != null) {
                LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = a2;
                }
                view.requestLayout();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.gift.effect.entry.view.UserSpecialEntryView$c */
    static final class C7403c extends C52712l implements C52671b<C8853i, ImageModel> {

        /* renamed from: a */
        public static final C7403c f20276a = new C7403c();

        C7403c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C8853i iVar = (C8853i) obj;
            if (iVar != null) {
                C8857m mVar = iVar.f24165d;
                if (mVar != null) {
                    User user = mVar.f24174a;
                    if (user != null) {
                        C3014m userHonor = user.getUserHonor();
                        if (userHonor != null) {
                            return userHonor.mo8156k();
                        }
                    }
                }
            }
            return null;
        }
    }

    public UserSpecialEntryView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setupUi(C7394a aVar) {
        boolean z;
        CharSequence charSequence;
        boolean z2;
        C52711k.m112240b(aVar, "message");
        if (aVar.mo13658a()) {
            C7836a aVar2 = aVar.f20195m;
            C52711k.m112236a((Object) aVar2, "message.effectConfig");
            ImageModel imageModel = aVar2.f21651e;
            C52711k.m112236a((Object) imageModel, "message.effectConfig.textIcon");
            String a = C7375a.m15220a(imageModel);
            CharSequence charSequence2 = a;
            if (charSequence2 == null || charSequence2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C13783a c = ((C13773e) ((C13773e) C13771c.m27870a().mo25723a(a).mo25762c(true)).mo25751a((C13791d<? super INFO>) this.f20274h)).mo25763d();
                SimpleDraweeView simpleDraweeView = this.f20271e;
                if (simpleDraweeView != null) {
                    simpleDraweeView.setController(c);
                }
                C7836a aVar3 = aVar.f20195m;
                C52711k.m112236a((Object) aVar3, "message.effectConfig");
                C8851g gVar = aVar3.f21649c;
                C8853i iVar = null;
                if (gVar != null) {
                    charSequence = C5115z.m11758a(gVar.f24156b, gVar);
                } else {
                    charSequence = null;
                }
                TextView textView = this.f20272f;
                if (textView != null) {
                    textView.setText(charSequence);
                }
                C7836a aVar4 = aVar.f20195m;
                C52711k.m112236a((Object) aVar4, "message.effectConfig");
                this.f20270c = aVar4.f21652f;
                C52671b bVar = C7403c.f20276a;
                if (gVar != null) {
                    List<C8853i> list = gVar.f24158d;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            C8853i iVar2 = (C8853i) next;
                            C52711k.m112236a((Object) iVar2, "it");
                            if (iVar2.f24162a != C8848e.USER.getPieceType() || bVar.invoke(iVar2) == null) {
                                z2 = false;
                                continue;
                            } else {
                                z2 = true;
                                continue;
                            }
                            if (z2) {
                                iVar = next;
                                break;
                            }
                        }
                        iVar = iVar;
                    }
                }
                ImageModel imageModel2 = (ImageModel) bVar.invoke(iVar);
                if (imageModel2 != null) {
                    HSImageView hSImageView = this.f20273g;
                    if (hSImageView != null) {
                        C5213c.m11820a(hSImageView, imageModel2);
                    }
                } else {
                    HSImageView hSImageView2 = this.f20273g;
                    if (hSImageView2 != null) {
                        hSImageView2.setVisibility(8);
                    }
                }
            }
        }
    }

    public UserSpecialEntryView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.arz, this);
        this.f20271e = (SimpleDraweeView) findViewById(R.id.j3);
        this.f20268a = findViewById(R.id.j9);
        this.f20269b = findViewById(R.id.j5);
        this.f20272f = (TextView) findViewById(R.id.ja);
        this.f20273g = (HSImageView) findViewById(R.id.jb);
        this.f20274h = new C7402b(this);
    }

    public /* synthetic */ UserSpecialEntryView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
