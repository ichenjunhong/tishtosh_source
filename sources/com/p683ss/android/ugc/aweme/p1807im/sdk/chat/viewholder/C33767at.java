package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.ChatRoomActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareAwemeConfig;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareAwemeContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1821f.C33454b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.p1829a.C33730a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1809a.C33213a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1809a.C33214b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35286u;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35286u.C35302a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.videofileplay.widget.KeepSurfaceTextureView;
import com.p683ss.android.ugc.aweme.p1807im.service.C35461k;
import com.p683ss.android.ugc.aweme.p1807im.service.C35474o;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import p064c.p065a.p071d.C1710e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.at */
public class C33767at extends C33805c<ShareAwemeContent> {

    /* renamed from: A */
    public C11207p f87583A;

    /* renamed from: B */
    public long f87584B;

    /* renamed from: C */
    boolean f87585C;

    /* renamed from: D */
    public Runnable f87586D = new C33772au(this);

    /* renamed from: E */
    private RemoteImageView f87587E;

    /* renamed from: F */
    private TextView f87588F;

    /* renamed from: G */
    private TextView f87589G;

    /* renamed from: H */
    private ImageView f87590H;

    /* renamed from: I */
    private TextView f87591I;

    /* renamed from: J */
    private ImageView f87592J;

    /* renamed from: K */
    private RemoteImageView f87593K;

    /* renamed from: L */
    private ImageView f87594L;

    /* renamed from: M */
    private View f87595M;

    /* renamed from: N */
    private ImageView f87596N;

    /* renamed from: O */
    private Animation f87597O = AnimationUtils.loadAnimation(this.itemView.getContext(), R.anim.eo);

    /* renamed from: P */
    private ArrayList<String> f87598P = new ArrayList<>();

    /* renamed from: Q */
    private C33850a f87599Q;

    /* renamed from: R */
    private C33730a f87600R;

    /* renamed from: u */
    public int f87601u = -1;

    /* renamed from: v */
    KeepSurfaceTextureView f87602v;

    /* renamed from: w */
    ImageView f87603w;

    /* renamed from: x */
    public C35461k f87604x;

    /* renamed from: y */
    public Aweme f87605y;

    /* renamed from: z */
    public ShareAwemeContent f87606z;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.at$a */
    class C33770a extends C33213a {

        /* renamed from: b */
        private int f87615b = -1;

        /* renamed from: c */
        private boolean f87616c;

        /* renamed from: a */
        public final void mo70460a() {
            if (C33767at.this.f87601u == this.f87615b) {
                C33767at.this.mo71818a(false);
                C33767at.this.mo71821c(false);
                C33767at.this.mo71819b(false);
            }
        }

        /* renamed from: b */
        public final void mo70462b() {
            if (C33767at.this.f87601u == this.f87615b) {
                if (C33454b.m76687a() != 6 && C33454b.m76687a() != 5) {
                    C33767at.this.mo71818a(false);
                    C33767at.this.mo71819b(true);
                    C33767at.this.mo71821c(true);
                    C33767at.this.f87604x.mo70353b(C33767at.this.f87605y, 7000);
                    if (C33767at.this.f87604x != null) {
                        C33767at.this.f87604x.mo70359g();
                    }
                } else if ((!TextUtils.isEmpty(C33767at.this.f87605y.getAid()) || !TextUtils.equals(((ShareAwemeContent) C33767at.this.f87709k).getItemId(), C33767at.this.f87605y.getAid())) && (C33767at.this.f87708j.getContext() instanceof ChatRoomActivity) && !this.f87616c) {
                    C33767at.this.f87604x.mo70353b(C33767at.this.f87605y, 7000);
                    this.f87616c = true;
                }
            }
        }

        /* renamed from: a */
        public final void mo70461a(String str) {
            if (C33767at.this.f87601u == this.f87615b) {
                C33767at.this.mo71817a(C33767at.this.itemView.getContext().getString(R.string.bpc), false);
            }
        }

        public C33770a(int i) {
            this.f87615b = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.at$b */
    class C33771b extends C33214b {
        private C33771b() {
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            return super.onSurfaceTextureDestroyed(surfaceTexture);
        }

        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            super.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            super.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }

    /* renamed from: i */
    private void m77327i() {
        int i;
        if (this.f87603w != null) {
            if (C33849j.m77600e().f87812a) {
                i = R.drawable.dc_;
            } else {
                i = R.drawable.dca;
            }
            this.f87603w.setImageResource(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo71782b() {
        super.mo71782b();
        this.f87602v.setSurfaceTextureListener(new C33771b());
        if (this.f87603w != null) {
            this.f87603w.setOnClickListener(new C33773av(this));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo71779a() {
        super.mo71779a();
        this.f87595M = this.itemView.findViewById(R.id.po);
        this.f87587E = (RemoteImageView) this.itemView.findViewById(R.id.zm);
        this.f87588F = (TextView) this.itemView.findViewById(R.id.zx);
        this.f87593K = (RemoteImageView) this.itemView.findViewById(R.id.zo);
        this.f87708j = this.itemView.findViewById(R.id.zr);
        this.f87589G = (TextView) this.itemView.findViewById(R.id.zv);
        this.f87590H = (ImageView) this.itemView.findViewById(R.id.zy);
        this.f87591I = (TextView) this.itemView.findViewById(R.id.a00);
        this.f87603w = (ImageView) this.itemView.findViewById(R.id.f6v);
        this.f87594L = (ImageView) this.itemView.findViewById(R.id.b38);
        this.f87602v = (KeepSurfaceTextureView) this.itemView.findViewById(R.id.dpf);
        this.f87592J = (ImageView) this.itemView.findViewById(R.id.f36);
        this.f87596N = (ImageView) this.itemView.findViewById(R.id.ep5);
        this.f87600R = new C33730a(this.itemView);
        View view = this.f87595M;
        if (view != null) {
            Drawable background = view.getBackground();
            if (background != null && VERSION.SDK_INT >= 19) {
                background.setAutoMirrored(true);
            }
        }
    }

    /* renamed from: g */
    public final void mo71823h() {
        if (this.f87606z == null || !mo71820b(this.f87583A)) {
            return;
        }
        if (this.f87596N == null || this.f87596N.getVisibility() != 0) {
            mo71821c(false);
            if (this.f87605y == null) {
                mo71818a(true);
            }
            m77327i();
            if (this.f87605y == null || TextUtils.isEmpty(this.f87605y.getAid()) || !TextUtils.equals(this.f87606z.getItemId(), this.f87605y.getAid())) {
                m77326a(this.f87606z, true);
                return;
            }
            if (this.f87604x == null && C34004b.m77717a().mo71949f() != null) {
                this.f87604x = C34004b.m77717a().mo71949f().getPlayerProxy();
            }
            int a = C33454b.m76687a();
            int i = 4;
            if (a == 6 || a == 5) {
                i = 8;
            }
            this.f87602v.setClipBorder((float) C23728o.m58241a((double) i));
            if (!(this.f87604x == null || this.f87602v == null || !this.f87602v.f90727c)) {
                this.f87604x.mo70348a(this.f87602v.getSurface(), (C35474o) new C33770a(this.f87601u));
            }
            if (!(this.f87604x == null || this.f87605y == null || this.f87605y.getVideo() == null)) {
                this.f87605y.getVideo().setSourceId(String.valueOf(this.f87583A.getIndex()));
                Video video = this.f87605y.getVideo();
                KeepSurfaceTextureView keepSurfaceTextureView = this.f87602v;
                if (keepSurfaceTextureView != null) {
                    if (video == null || video.getWidth() <= 0 || video.getHeight() <= 0) {
                        keepSurfaceTextureView.getLayoutParams().height = -1;
                        keepSurfaceTextureView.getLayoutParams().width = -1;
                        keepSurfaceTextureView.postInvalidate();
                    } else if (((double) ((((float) video.getWidth()) * 1.0f) / ((float) video.getHeight()))) > 0.625d) {
                        float width = ((float) keepSurfaceTextureView.getWidth()) / ((float) video.getWidth());
                        float height = ((float) keepSurfaceTextureView.getHeight()) / ((float) video.getHeight());
                        Matrix matrix = new Matrix();
                        float max = Math.max(width, height);
                        matrix.preTranslate((float) ((keepSurfaceTextureView.getWidth() - video.getWidth()) / 2), (float) ((keepSurfaceTextureView.getHeight() - video.getHeight()) / 2));
                        matrix.preScale(((float) video.getWidth()) / ((float) keepSurfaceTextureView.getWidth()), ((float) video.getHeight()) / ((float) keepSurfaceTextureView.getHeight()));
                        matrix.postScale(max, max, (float) (keepSurfaceTextureView.getWidth() / 2), (float) (keepSurfaceTextureView.getHeight() / 2));
                        keepSurfaceTextureView.setTransform(matrix);
                        keepSurfaceTextureView.postInvalidate();
                    } else {
                        float width2 = ((float) keepSurfaceTextureView.getWidth()) / ((float) video.getWidth());
                        float height2 = ((float) keepSurfaceTextureView.getHeight()) / ((float) video.getHeight());
                        Matrix matrix2 = new Matrix();
                        float max2 = Math.max(width2, height2);
                        matrix2.preTranslate((float) ((keepSurfaceTextureView.getWidth() - video.getWidth()) / 2), (float) ((keepSurfaceTextureView.getHeight() - video.getHeight()) / 2));
                        matrix2.preScale(((float) video.getWidth()) / ((float) keepSurfaceTextureView.getWidth()), ((float) video.getHeight()) / ((float) keepSurfaceTextureView.getHeight()));
                        matrix2.postScale(max2, max2, (float) (keepSurfaceTextureView.getWidth() / 2), (float) (keepSurfaceTextureView.getHeight() / 2));
                        keepSurfaceTextureView.setTransform(matrix2);
                        keepSurfaceTextureView.postInvalidate();
                    }
                }
                this.f87584B = System.currentTimeMillis();
                this.f87585C = false;
                this.f87604x.mo70351a(this.f87605y.getVideo());
                this.f87604x.mo70349a(this.f87605y, 7000);
                if (a == 6 || a == 5) {
                    this.f87604x.mo70352a(C33849j.m77600e().f87812a);
                } else {
                    this.f87604x.mo70352a(true);
                }
                if (a == 2) {
                    C33849j e = C33849j.m77600e();
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f87583A.getMsgId());
                    String sb2 = sb.toString();
                    if (e.f87814c != null) {
                        e.f87814c.add(sb2);
                    }
                }
            }
            return;
        }
        if (!this.f87598P.contains(((ShareAwemeContent) this.f87709k).getItemId())) {
            mo71817a(this.itemView.getContext().getString(R.string.bpc), false);
            this.f87598P.add(((ShareAwemeContent) this.f87709k).getItemId());
        }
    }

    /* renamed from: c */
    public final void mo71821c(boolean z) {
        int i;
        if (this.f87594L != null) {
            ImageView imageView = this.f87594L;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    /* renamed from: b */
    public final void mo71819b(boolean z) {
        int i;
        if (this.f87606z != null && this.f87593K != null) {
            RemoteImageView remoteImageView = this.f87593K;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            remoteImageView.setVisibility(i);
            C23515d.m57669a(this.f87593K, this.f87606z.getCoverUrl());
        }
    }

    /* renamed from: a */
    public void mo71783a(OnClickListener onClickListener) {
        super.mo71783a(onClickListener);
        this.f87587E.setOnClickListener(onClickListener);
        this.f87588F.setOnClickListener(onClickListener);
        this.f87715r = new C33774aw(this, onClickListener);
        this.f87708j.setOnClickListener(this.f87715r);
        this.f87713o.mo73331a(this.f87587E, this.f87588F, this.f87708j);
    }

    /* renamed from: b */
    public final boolean mo71820b(C11207p pVar) {
        boolean z;
        if (C33454b.m76687a() == 6 || C33454b.m76687a() == 5) {
            return true;
        }
        if (C33454b.m76687a() == 2) {
            if (pVar == null) {
                return false;
            }
            C33849j e = C33849j.m77600e();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f87583A.getMsgId());
            String sb2 = sb.toString();
            if (!C9376b.m18558a((Collection<T>) e.f87814c)) {
                z = e.f87814c.contains(sb2);
            } else {
                z = false;
            }
            if (!z) {
                return true;
            }
            return false;
        } else if (C33454b.m76687a() == 4) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo71818a(boolean z) {
        if (this.f87592J != null) {
            if (!z) {
                this.f87592J.clearAnimation();
                this.f87592J.setVisibility(8);
            } else if (this.f87592J.getVisibility() != 0) {
                this.f87592J.setVisibility(0);
                this.f87592J.startAnimation(this.f87597O);
            }
        }
    }

    /* renamed from: a */
    private void m77326a(final ShareAwemeContent shareAwemeContent, final boolean z) {
        final boolean z2 = !z;
        if (shareAwemeContent == null || TextUtils.isEmpty(shareAwemeContent.getItemId())) {
            mo71817a(this.itemView.getContext().getString(R.string.bpc), z2);
        } else {
            C35286u.m79877a(shareAwemeContent.getItemId(), "chat", (C35302a) new C35302a() {
                /* renamed from: a */
                public final void mo71736a(int i, Exception exc) {
                    C33767at.this.mo71817a(C33767at.this.itemView.getContext().getString(R.string.bpc), z2);
                }

                /* renamed from: a */
                public final void mo71737a(int i, Object obj) {
                    if (!(obj instanceof Aweme)) {
                        C33767at.this.mo71817a(C33767at.this.itemView.getContext().getString(R.string.bpc), z2);
                    }
                    C33767at.this.f87605y = (Aweme) obj;
                    if (TextUtils.isEmpty(C33767at.this.f87605y.getAid()) || !TextUtils.equals(shareAwemeContent.getItemId(), C33767at.this.f87605y.getAid())) {
                        C33767at.this.mo71817a(C33767at.this.itemView.getContext().getString(R.string.bpc), z2);
                    }
                    if (TextUtils.equals(shareAwemeContent.getItemId(), C33767at.this.f87606z.getItemId()) && C33767at.this.f87708j != null && z) {
                        C33767at.this.f87708j.post(C33767at.this.f87586D);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo71817a(String str, boolean z) {
        if (!z) {
            C10691a.m21546b(this.itemView.getContext(), C11010c.m22280a().getString(R.string.cpc), 0).mo19066a();
        }
        if (this.f87594L != null) {
            this.f87594L.setVisibility(8);
        }
        mo71818a(false);
        if (this.f87596N != null) {
            this.f87596N.setVisibility(0);
        }
    }

    public C33767at(View view, int i, ShareAwemeConfig shareAwemeConfig) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo71780a(C11207p pVar, C11207p pVar2, ShareAwemeContent shareAwemeContent, int i) {
        String str;
        super.mo71780a(pVar, pVar2, shareAwemeContent, i);
        int awemeType = shareAwemeContent.getAwemeType();
        this.f87606z = shareAwemeContent;
        this.f87709k = shareAwemeContent;
        this.f87601u = i;
        this.f87583A = pVar;
        C33730a aVar = this.f87600R;
        C52711k.m112240b(pVar, "msg");
        C52711k.m112240b(shareAwemeContent, C42311c.f106865i);
        if (awemeType == 0 || awemeType == 23) {
            if (this.f87590H != null) {
                this.f87590H.setVisibility(8);
            }
            if (awemeType == 23 && this.f87589G != null) {
                this.f87589G.setVisibility(0);
            }
        } else if (this.f87590H != null) {
            this.f87590H.setVisibility(0);
        }
        C23515d.m57669a(this.f87593K, shareAwemeContent.getCoverUrl());
        C23515d.m57669a(this.f87587E, shareAwemeContent.getContentThumb());
        this.f87588F.setText(shareAwemeContent.getContentName());
        if (this.f87591I != null) {
            String title = shareAwemeContent.getTitle();
            if (!TextUtils.isEmpty(title)) {
                this.f87591I.setText(title);
                this.f87591I.setVisibility(0);
            } else {
                this.f87591I.setVisibility(8);
            }
        }
        if (awemeType == 0) {
            this.f87708j.setTag(50331648, Integer.valueOf(2));
            this.f87708j.setTag(67108864, shareAwemeContent.getItemId());
        } else if (awemeType == 2) {
            this.f87708j.setTag(50331648, Integer.valueOf(8));
            this.f87708j.setTag(67108864, shareAwemeContent.getItemId());
        }
        this.f87708j.setTag(50331648, Integer.valueOf(2));
        this.f87708j.setTag(67108864, shareAwemeContent.getItemId());
        this.f87708j.setTag(134217728, pVar);
        this.f87587E.setTag(50331648, Integer.valueOf(4));
        this.f87587E.setTag(100663296, shareAwemeContent);
        this.f87588F.setTag(50331648, Integer.valueOf(4));
        this.f87588F.setTag(100663296, shareAwemeContent);
        this.f87714p.f87454a = this.f87712n.getConversationId();
        this.f87596N.setVisibility(8);
        if (this.f87606z != null) {
            if (mo71820b(this.f87583A)) {
                str = "1";
            } else {
                str = "0";
            }
            C35190af.m79528j(this.f87606z.getUser(), this.f87606z.getItemId(), str);
        }
        this.f87599Q = new C33850a(i) {

            /* renamed from: c */
            private boolean f87608c;

            /* renamed from: d */
            private boolean f87609d = true;

            /* renamed from: d */
            public final void mo71829d() {
                C33767at atVar = C33767at.this;
                atVar.mo71819b(true);
                atVar.mo71821c(true);
            }

            /* renamed from: b */
            public final void mo71826b() {
                this.f87608c = true;
                C33767at atVar = C33767at.this;
                if (atVar.f87604x != null && atVar.f87604x.mo70354b()) {
                    atVar.f87604x.mo70356d();
                }
                atVar.mo71819b(true);
                atVar.mo71821c(true);
            }

            /* renamed from: e */
            public final boolean mo71830e() {
                if (C33767at.this.f87604x == null || !C33767at.this.f87604x.mo70354b()) {
                    return false;
                }
                return true;
            }

            /* renamed from: c */
            public final void mo71828c() {
                if (C33767at.this.f87604x != null) {
                    if (this.f87608c) {
                        C33767at.this.mo71819b(false);
                        C33767at.this.f87604x.mo70357e();
                        this.f87608c = false;
                        return;
                    }
                    C33767at.this.f87604x.mo70350a(C33767at.this.f87605y, System.currentTimeMillis() - C33767at.this.f87584B);
                }
            }

            /* renamed from: f */
            public final void mo71831f() {
                if (C33767at.this.f87604x != null) {
                    C33767at.this.f87604x.mo70350a(C33767at.this.f87605y, System.currentTimeMillis() - C33767at.this.f87584B);
                    C33767at.this.f87604x.mo70359g();
                    this.f87608c = false;
                }
            }

            /* renamed from: a */
            public final void mo71824a() {
                C33767at atVar = C33767at.this;
                boolean z = this.f87609d;
                if (atVar.f87604x != null && atVar.f87604x.mo70354b()) {
                    atVar.f87604x.mo70358f();
                }
                if (atVar.f87604x != null && z) {
                    atVar.f87604x.mo70350a(atVar.f87605y, System.currentTimeMillis() - atVar.f87584B);
                    if (!atVar.f87585C) {
                        C35190af.m79460a(atVar.f87605y.getAid(), System.currentTimeMillis() - atVar.f87584B);
                    }
                }
                atVar.mo71819b(true);
                atVar.mo71821c(true);
                this.f87608c = false;
                this.f87609d = false;
            }

            /* renamed from: a */
            public final void mo71825a(int i) {
                this.f87609d = true;
                C33767at.this.mo71823h();
            }

            /* renamed from: b */
            public final void mo71827b(int i) {
                String str;
                if (C33767at.this.f87606z != null) {
                    if (C33767at.this.mo71820b(C33767at.this.f87583A)) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    C35190af.m79528j(C33767at.this.f87606z.getUser(), C33767at.this.f87606z.getItemId(), str);
                }
            }
        };
        C33849j e = C33849j.m77600e();
        C33850a aVar2 = this.f87599Q;
        if (e.f87817f == null) {
            e.f87817f = C11016e.m22309d().mo6545f((C1710e<? super T>) new C33851k<Object>(e));
        }
        if (!(e.f87813b == null || aVar2 == null)) {
            e.f87813b.put(Integer.valueOf(i), aVar2);
        }
        m77327i();
        m77326a(shareAwemeContent, false);
    }
}
