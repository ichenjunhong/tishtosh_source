package com.p683ss.android.vesdk;

import android.graphics.Bitmap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.vesdk.VEListener */
public class VEListener {

    /* renamed from: com.ss.android.vesdk.VEListener$VEEditorEffectListener */
    public interface VEEditorEffectListener {
    }

    /* renamed from: com.ss.android.vesdk.VEListener$VEInfoStickerBufferListener */
    public interface VEInfoStickerBufferListener {
        Bitmap onGetBuffer(int i);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$a */
    public interface C50537a {
        /* renamed from: a */
        void mo98572a(String str, int i, byte[] bArr);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$b */
    public interface C50538b {
        /* renamed from: a */
        void mo43742a(String str, JSONObject jSONObject, String str2, String str3, String str4);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$c */
    public interface C50539c {
    }

    /* renamed from: com.ss.android.vesdk.VEListener$d */
    public interface C50540d {
    }

    /* renamed from: com.ss.android.vesdk.VEListener$e */
    public interface C50541e {
        /* renamed from: a */
        void mo87414a(float f);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$f */
    public interface C50542f {
        /* renamed from: a */
        void mo43336a(int i);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$g */
    public interface C50543g extends C50544h {
        /* renamed from: a */
        void mo43395a(int i, int i2, String str);

        /* renamed from: a */
        void mo43396a(int i, String str);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$h */
    public interface C50544h {
        /* renamed from: a */
        void mo43393a();

        /* renamed from: a */
        void mo43394a(int i);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$i */
    public interface C50545i {
        /* renamed from: a */
        void mo97090a(int i, int i2, float f);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$j */
    public interface C50546j {
        /* renamed from: a */
        void mo43335a(int i, String str, String str2);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$k */
    public interface C50547k {
        void onCompileDone();

        void onCompileError(int i, int i2, float f, String str);

        void onCompileProgress(float f);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$l */
    public interface C50548l {
        /* renamed from: a */
        void mo89270a(int i);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$m */
    public interface C50549m {
        /* renamed from: a */
        void mo88399a(int i);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$n */
    public interface C50550n {
        /* renamed from: a */
        void mo91547a(byte[] bArr, int i, int i2, boolean z);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$o */
    public interface C50551o {
        /* renamed from: a */
        void mo43230a(Throwable th);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$p */
    public interface C50552p {
        /* renamed from: a */
        void mo43097a();
    }

    /* renamed from: com.ss.android.vesdk.VEListener$q */
    public interface C50553q {
        /* renamed from: a */
        int mo86779a(byte[] bArr, int i, int i2, int i3, float f);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$r */
    public interface C50554r {
    }

    /* renamed from: com.ss.android.vesdk.VEListener$s */
    public interface C50555s {
        /* renamed from: a */
        void mo98573a();
    }

    /* renamed from: com.ss.android.vesdk.VEListener$t */
    public interface C50556t {
        /* renamed from: a */
        void mo43741a(String str, JSONObject jSONObject);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$u */
    public interface C50557u {
        /* renamed from: a */
        VESize mo98574a(List<VESize> list, List<VESize> list2);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$v */
    public interface C50558v {
    }

    /* renamed from: com.ss.android.vesdk.VEListener$w */
    public interface C50559w extends C50560x {
        /* renamed from: a */
        void mo43264a(int i, int i2, String str);

        /* renamed from: b */
        void mo43267b(int i, String str);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$x */
    public interface C50560x {
        /* renamed from: a */
        void mo43265a(int i, String str);

        /* renamed from: a */
        void mo43266a(boolean z);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$y */
    public interface C50561y {
    }
}
