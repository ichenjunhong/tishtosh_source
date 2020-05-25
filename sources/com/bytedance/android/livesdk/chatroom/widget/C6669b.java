package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p230g.C3909r.C3910a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.p309e.C5115z;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.i18n.C7676b;
import com.bytedance.android.livesdk.message.model.C8004p;
import com.bytedance.android.livesdk.message.model.C8004p.C8005a;
import com.bytedance.android.livesdk.p330f.C6768c;
import com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel;
import com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C8391a;
import com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C8392b;
import com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C8396f;
import com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C8397g;
import com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C8398h;
import com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C8399i;
import com.bytedance.android.livesdkapi.message.C8851g;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.b */
public final class C6669b extends C6768c implements OnClickListener {

    /* renamed from: a */
    public final CommonGuideViewModel f18208a;

    /* renamed from: b */
    private C8004p f18209b;

    /* renamed from: c */
    private HSImageView f18210c;

    /* renamed from: d */
    private TextView f18211d;

    /* renamed from: e */
    private LinearLayout f18212e;

    /* renamed from: f */
    private TextView f18213f;

    /* renamed from: j */
    private HSImageView f18214j;

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.b$a */
    public static final class C6670a implements C3910a {

        /* renamed from: a */
        final /* synthetic */ ImageView f18215a;

        /* renamed from: a */
        public final void mo9270a(ImageModel imageModel) {
        }

        /* renamed from: a */
        public final void mo9272a(ImageModel imageModel, Exception exc) {
        }

        C6670a(ImageView imageView) {
            this.f18215a = imageView;
        }

        /* renamed from: a */
        public final void mo9271a(ImageModel imageModel, int i, int i2, boolean z) {
            LayoutParams layoutParams = this.f18215a.getLayoutParams();
            int d = C3922z.m9913d(R.dimen.a16);
            if (layoutParams != null) {
                layoutParams.height = d;
            }
            if (layoutParams != null) {
                layoutParams.width = (i / i2) * d;
            }
            this.f18215a.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    private static Spannable m14063a(C8851g gVar) {
        String str = null;
        if (gVar == null) {
            return null;
        }
        String str2 = gVar.f24156b;
        if (gVar.f24155a != null) {
            str = C7676b.m15696a().mo14036a(gVar.f24155a);
        }
        if (str == null) {
            str = str2;
        }
        return C5115z.m11758a(str, gVar);
    }

    public final void onClick(View view) {
        Integer num;
        CommonGuideViewModel commonGuideViewModel = this.f18208a;
        if (commonGuideViewModel != null) {
            String str = null;
            if (view != null) {
                num = Integer.valueOf(view.getId());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == R.id.ea_) {
                commonGuideViewModel.f22828a.mo14606a((C8398h) new C8391a());
            } else {
                if (num != null && num.intValue() == R.id.ea9) {
                    C8396f fVar = commonGuideViewModel.f22828a;
                    C8004p pVar = this.f18209b;
                    if (pVar != null) {
                        str = pVar.f21888f;
                    }
                    fVar.mo14606a((C8398h) new C8392b(str));
                }
            }
        }
    }

    /* renamed from: a */
    private final void m14064a(List<? extends C8005a> list) {
        if (list != null) {
            for (C8005a aVar : list) {
                String str = aVar.f21891a;
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != -842613072) {
                        if (hashCode == 104387 && str.equals("img")) {
                            ImageModel imageModel = aVar.f21896f;
                            ImageView imageView = new ImageView(getContext());
                            C5213c.m11819a(imageView, imageModel, (C3910a) new C6670a(imageView));
                            LinearLayout linearLayout = this.f18212e;
                            if (linearLayout != null) {
                                linearLayout.addView(imageView, linearLayout.getChildCount());
                            }
                        }
                    } else if (str.equals("rich_text")) {
                        String str2 = aVar.f21893c;
                        int i = aVar.f21894d;
                        String str3 = aVar.f21892b;
                        TextView textView = new TextView(getContext());
                        textView.setText(str3);
                        try {
                            textView.setTextColor(Color.parseColor(str2));
                        } catch (IllegalArgumentException unused) {
                        }
                        textView.setTextSize((float) i);
                        textView.setMaxLines(1);
                        textView.setEllipsize(TruncateAt.END);
                        LinearLayout linearLayout2 = this.f18212e;
                        if (linearLayout2 != null) {
                            linearLayout2.addView(textView, linearLayout2.getChildCount(), new LinearLayout.LayoutParams(-2, -2));
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.bvx);
        this.f18210c = (HSImageView) findViewById(R.id.eab);
        this.f18211d = (TextView) findViewById(R.id.ead);
        this.f18212e = (LinearLayout) findViewById(R.id.eac);
        this.f18213f = (TextView) findViewById(R.id.ea9);
        this.f18214j = (HSImageView) findViewById(R.id.ea8);
        View findViewById = findViewById(R.id.ea_);
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
        TextView textView = this.f18213f;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        CommonGuideViewModel commonGuideViewModel = this.f18208a;
        if (commonGuideViewModel != null) {
            C8399i iVar = commonGuideViewModel.f22828a.f22835a;
            if (iVar instanceof C8397g) {
                this.f18209b = ((C8397g) iVar).f22837a;
                C8004p pVar = this.f18209b;
                if (pVar != null) {
                    C5213c.m11820a(this.f18210c, pVar.f21886d);
                    Spannable a = m14063a(pVar.f21884b);
                    if (a != null) {
                        TextView textView2 = this.f18211d;
                        if (textView2 != null) {
                            textView2.setText(a);
                        }
                    }
                    m14064a(pVar.f21885c);
                    C8851g gVar = pVar.f21887e;
                    ImageModel imageModel = pVar.f21889g;
                    TextView textView3 = this.f18213f;
                    if (textView3 != null) {
                        textView3.setText(m14063a(gVar));
                    }
                    C5213c.m11820a(this.f18214j, imageModel);
                }
            } else {
                dismiss();
            }
        }
    }

    public C6669b(Context context, CommonGuideViewModel commonGuideViewModel) {
        super(context, true);
        this.f18208a = commonGuideViewModel;
    }
}
