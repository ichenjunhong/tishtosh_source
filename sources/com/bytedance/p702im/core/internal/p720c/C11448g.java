package com.bytedance.p702im.core.internal.p720c;

import android.util.Pair;
import com.bytedance.p702im.core.internal.utils.C11467e;
import com.bytedance.p702im.core.p703a.C11165c;
import com.bytedance.p702im.core.p703a.C11172e;
import com.bytedance.p702im.core.proto.IMCMD;
import com.bytedance.p702im.core.proto.Request;
import com.bytedance.p702im.core.proto.Response;
import net.jpountz.lz4.LZ4Factory;

/* renamed from: com.bytedance.im.core.internal.c.g */
public final class C11448g {
    /* renamed from: a */
    public static Pair<String, byte[]> m23404a(Request request) throws C11434a {
        if (request == null || request.cmd.intValue() <= IMCMD.IMCMD_NOT_USED.getValue()) {
            throw new C11434a(-2002);
        }
        C11172e b = C11165c.m22588a().mo20513b();
        byte[] encode = request.encode();
        float length = (float) encode.length;
        if (b == null) {
            throw new C11434a(-2001);
        } else if (encode.length <= b.f30145i) {
            return new Pair<>("pb", encode);
        } else {
            byte[] compress = LZ4Factory.fastestInstance().fastCompressor().compress(encode);
            StringBuilder sb = new StringBuilder("compress rate = ");
            sb.append(((float) compress.length) / length);
            C11467e.m23462a(sb.toString());
            if (compress.length <= b.f30144h) {
                return new Pair<>("__lz4", compress);
            }
            throw new C11434a(-2004);
        }
    }

    /* renamed from: a */
    public static Response m23405a(String str, byte[] bArr) throws C11434a {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            if ("__lz4".equals(str)) {
                bArr = LZ4Factory.fastestInstance().safeDecompressor().decompress(bArr, bArr.length * 3);
            }
            return (Response) Response.ADAPTER.decode(bArr);
        } catch (Exception unused) {
            throw new C11434a(-2003);
        }
    }
}
