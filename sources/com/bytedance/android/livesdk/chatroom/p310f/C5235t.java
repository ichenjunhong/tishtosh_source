package com.bytedance.android.livesdk.chatroom.p310f;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build.VERSION;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.uikit.p257c.C4206c;
import com.bytedance.android.livesdkapi.p455i.C8815e;
import com.bytedance.common.utility.C9414h;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.chatroom.f.t */
public final class C5235t {

    /* renamed from: a */
    public static final C5235t f13963a = new C5235t();

    /* renamed from: com.bytedance.android.livesdk.chatroom.f.t$a */
    static final class C5236a<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        final /* synthetic */ String f13964a;

        C5236a(String str) {
            this.f13964a = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Bitmap apply(Integer num) {
            C52711k.m112240b(num, "it");
            try {
                C8815e eVar = (C8815e) ((INetworkService) C4116c.m10249a(INetworkService.class)).downloadFile(false, Integer.MAX_VALUE, this.f13964a, new ArrayList(), null).mo15805a();
                C52711k.m112236a((Object) eVar, "response");
                return BitmapFactory.decodeStream(new ByteArrayInputStream(eVar.f24066e));
            } catch (Exception e) {
                C3831a.m9706a(6, "NinePatchUtil", e.getStackTrace());
                return null;
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.f.t$b */
    static final class C5237b<T> implements C1710e<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ boolean f13965a;

        /* renamed from: b */
        final /* synthetic */ View f13966b;

        /* renamed from: c */
        final /* synthetic */ Runnable f13967c;

        C5237b(boolean z, View view, Runnable runnable) {
            this.f13965a = z;
            this.f13966b = view;
            this.f13967c = runnable;
        }

        public final /* synthetic */ void accept(Object obj) {
            byte[] bArr;
            Bitmap bitmap = (Bitmap) obj;
            Rect rect = null;
            if (bitmap != null) {
                bArr = bitmap.getNinePatchChunk();
            } else {
                bArr = null;
            }
            if (bArr != null) {
                ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.nativeOrder());
                if (order.get() != 0) {
                    order.get();
                    order.get();
                    order.get();
                    C52711k.m112236a((Object) order, "byteBuffer");
                    order.getInt();
                    order.getInt();
                    rect = new Rect();
                    rect.left = order.getInt();
                    rect.right = order.getInt();
                    rect.top = order.getInt();
                    rect.bottom = order.getInt();
                }
            }
            if (bitmap != null && bitmap.getNinePatchChunk() != null && rect != null) {
                NinePatchDrawable ninePatchDrawable = new NinePatchDrawable(C3922z.m9901a(), bitmap, bitmap.getNinePatchChunk(), rect, null);
                if (VERSION.SDK_INT >= 19) {
                    ninePatchDrawable.setAutoMirrored(this.f13965a);
                }
                this.f13966b.setBackground(ninePatchDrawable);
                if (!this.f13965a || !C4206c.m10426a(C3922z.m9915e())) {
                    this.f13966b.setPadding(rect.left, rect.top, rect.right, rect.bottom);
                } else {
                    this.f13966b.setPadding(rect.right, rect.top, rect.left, rect.bottom);
                }
                Runnable runnable = this.f13967c;
                if (runnable != null) {
                    runnable.run();
                }
            } else if (bitmap != null) {
                C3831a.m9716d("NinePatchUtil", "downloaded bitmap is null.");
            } else {
                C3831a.m9716d("NinePatchUtil", "no ninepatch chunk found in bitmap.");
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.f.t$c */
    static final class C5238c<T> implements C1710e<Throwable> {

        /* renamed from: a */
        public static final C5238c f13968a = new C5238c();

        C5238c() {
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C52711k.m112236a((Object) th, "throwable");
            C3831a.m9706a(6, "NinePatchUtil", th.getStackTrace());
        }
    }

    private C5235t() {
    }

    /* renamed from: a */
    public static void m11853a(ImageModel imageModel, View view, boolean z, Runnable runnable) {
        String str;
        C52711k.m112240b(imageModel, "imageModel");
        C52711k.m112240b(view, "view");
        if (!C9414h.m18630a(imageModel.getUrls())) {
            List urls = imageModel.getUrls();
            if (urls != null) {
                str = (String) urls.get(0);
            } else {
                str = null;
            }
            C2201v.m6614b(Integer.valueOf(0)).mo6529b(C2168a.m6521b()).mo6541d((C1711f<? super T, ? extends R>) new C5236a<Object,Object>(str)).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C5237b<Object>(z, view, runnable), (C1710e<? super Throwable>) C5238c.f13968a);
        }
    }
}
