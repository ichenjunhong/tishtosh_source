package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.text.TextUtils;
import com.bytedance.apm.p501q.C9190h;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43036f;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p2216a.C44284a;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p2216a.C44293g;
import com.p683ss.android.ugc.aweme.tools.p2348b.C46813b;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.tools.utils.C50199c;
import com.p683ss.android.ugc.tools.utils.C50200d;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e */
public final class C44300e {

    /* renamed from: a */
    public static int f112161a = 35;

    /* renamed from: b */
    public static final C44300e f112162b = new C44300e();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e$a */
    static final class C44301a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ List f112163a;

        C44301a(List list) {
            this.f112163a = list;
        }

        public final /* synthetic */ Object call() {
            int i;
            List<MediaModel> list = this.f112163a;
            if (list == null) {
                C52711k.m112234a();
            }
            for (MediaModel mediaModel : list) {
                String str = mediaModel.f95383b;
                C52711k.m112236a((Object) str, "mediaModel.filePath");
                if (!C44300e.m97039a(str)) {
                    if (mediaModel.f95390i <= 0 || mediaModel.f95391j <= 0) {
                        int[] iArr = new int[10];
                        String str2 = mediaModel.f95383b;
                        C52711k.m112236a((Object) str2, "mediaModel.filePath");
                        if (C46813b.m101656a(str2, iArr) == 0) {
                            mediaModel.f95390i = iArr[0];
                            mediaModel.f95391j = iArr[1];
                        }
                    }
                    if (mediaModel.f95390i > mediaModel.f95391j) {
                        i = mediaModel.f95391j;
                    } else {
                        i = mediaModel.f95390i;
                    }
                    if (i > 1100) {
                        return mediaModel.f95383b;
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e$b */
    static final class C44302b<TTaskResult, TContinuationResult> implements C0011g<String, Object> {

        /* renamed from: a */
        final /* synthetic */ C44284a f112164a;

        C44302b(C44284a aVar) {
            this.f112164a = aVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            if (iVar == null || iVar.mo34e() == null) {
                C44284a aVar = this.f112164a;
                if (aVar != null) {
                    aVar.mo90009a(null, false);
                }
            } else {
                C44284a aVar2 = this.f112164a;
                if (aVar2 != null) {
                    aVar2.mo90009a((String) iVar.mo34e(), true);
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e$c */
    static final class C44303c<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C44303c f112165a = new C44303c();

        C44303c() {
        }

        public final /* synthetic */ Object call() {
            if (C48016e.m103944b(C44300e.m97040b())) {
                C44300e.f112162b.mo90193a(new File(C44300e.m97040b()));
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e$d */
    static final class C44304d<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ List f112166a;

        C44304d(List list) {
            this.f112166a = list;
        }

        public final /* synthetic */ Object call() {
            if (!new File(C44300e.m97040b()).exists()) {
                new File(C44300e.m97040b()).mkdirs();
            }
            for (MediaModel mediaModel : this.f112166a) {
                String str = mediaModel.f95383b;
                C52711k.m112236a((Object) str, "model.filePath");
                if (C44300e.m97039a(str)) {
                    Bitmap a = C44294b.f112119a.mo90185a(mediaModel.f95383b, 720, 1280);
                    if (a != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(C44300e.m97040b());
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
                        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
                        C52711k.m112236a((Object) instance, "calendar");
                        Date time = instance.getTime();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(simpleDateFormat.format(time));
                        sb2.append(".png");
                        sb.append(sb2.toString());
                        String sb3 = sb.toString();
                        C50199c.m108337a(a, new File(sb3), 50, CompressFormat.PNG);
                        C44294b.m97013a(a);
                        mediaModel.f95383b = sb3;
                    }
                }
            }
            return Integer.valueOf(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e$e */
    static final class C44305e<TTaskResult, TContinuationResult> implements C0011g<Integer, Object> {

        /* renamed from: a */
        final /* synthetic */ C44293g f112167a;

        C44305e(C44293g gVar) {
            this.f112167a = gVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C44293g gVar = this.f112167a;
            if (gVar != null) {
                gVar.mo90014a(true);
            }
            return null;
        }
    }

    private C44300e() {
    }

    /* renamed from: a */
    public final int mo90190a() {
        if (m97041c()) {
            return f112161a;
        }
        return 12;
    }

    /* renamed from: c */
    public static boolean m97041c() {
        if (!C43036f.m94312e()) {
            return false;
        }
        return C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableVideoImageMixed);
    }

    /* renamed from: d */
    public static boolean m97042d() {
        if (!C43036f.m94312e() || !C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableAllTabWhenUpload)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m97043e() {
        if (!C43036f.m94312e() || !C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableStickPointWhenSelectMultiPhotos)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static String m97040b() {
        StringBuilder sb = new StringBuilder();
        Application b = C39629l.m88233b();
        C52711k.m112236a((Object) b, "CameraClient.getApplication()");
        File filesDir = b.getFilesDir();
        C52711k.m112236a((Object) filesDir, "CameraClient.getApplication().filesDir");
        sb.append(filesDir.getAbsolutePath());
        sb.append(File.separator);
        sb.append("videoimage_mixed_resize");
        sb.append(File.separator);
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m97039a(String str) {
        C52711k.m112240b(str, "imagePath");
        if (!C50200d.m108346a(str)) {
            return false;
        }
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        String str2 = options.outMimeType;
        CharSequence charSequence = str2;
        if (!TextUtils.isEmpty(charSequence)) {
            C52711k.m112236a((Object) str2, "type");
            if (C52830p.m112456b(charSequence, (CharSequence) "png", false, 2, (Object) null) || C52830p.m112456b(charSequence, (CharSequence) "webp", false, 2, (Object) null) || C52830p.m112456b(charSequence, (CharSequence) "bmp", false, 2, (Object) null) || C52830p.m112456b(charSequence, (CharSequence) "jpg", false, 2, (Object) null) || C52830p.m112456b(charSequence, (CharSequence) "jpeg", false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0013  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo90191a(android.content.Context r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0010
            android.content.res.Resources r5 = r5.getResources()
            if (r5 == 0) goto L_0x0010
            r0 = 2132543658(0x7f1c08aa, float:2.0740455E38)
            java.lang.String r5 = r5.getString(r0)
            goto L_0x0011
        L_0x0010:
            r5 = 0
        L_0x0011:
            if (r5 != 0) goto L_0x0016
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0016:
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            int r3 = r4.mo90190a()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r5 = com.C2240a.m6772a(r5, r0)
            java.lang.String r0 = "java.lang.String.format(format, *args)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C44300e.mo90191a(android.content.Context):java.lang.String");
    }

    /* renamed from: a */
    public final boolean mo90192a(int i) {
        if (i == 6) {
            return true;
        }
        if (i == 2 && C39630m.m88234a().mo58606d().mo80661a().mo80668d()) {
            return true;
        }
        if (!m97041c() || i == 3 || i == 4 || i == 5 || i == 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo90193a(File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            for (File a : file.listFiles()) {
                mo90193a(a);
            }
        }
        return file.delete();
    }

    /* renamed from: a */
    public static void m97037a(List<? extends MediaModel> list, C44284a aVar) {
        if (C9190h.m18253a(list)) {
            aVar.mo90009a(null, false);
        } else {
            C0013i.m16a((Callable<TResult>) new C44301a<TResult>(list)).mo20a((C0011g<TResult, TContinuationResult>) new C44302b<TResult,TContinuationResult>(aVar), C0013i.f25b);
        }
    }

    /* renamed from: a */
    public static void m97038a(List<? extends MediaModel> list, C44293g gVar) {
        C52711k.m112240b(list, "mediaModelList");
        if (C9190h.m18253a(list)) {
            gVar.mo90014a(true);
        } else {
            C0013i.m16a((Callable<TResult>) new C44304d<TResult>(list)).mo20a((C0011g<TResult, TContinuationResult>) new C44305e<TResult,TContinuationResult>(gVar), C0013i.f25b);
        }
    }
}
