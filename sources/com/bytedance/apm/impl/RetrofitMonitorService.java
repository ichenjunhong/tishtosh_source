package com.bytedance.apm.impl;

import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p831b.C12694aa;
import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12700b;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12710l;
import com.bytedance.retrofit2.p831b.C12718t;
import java.util.List;
import java.util.Map;

public interface RetrofitMonitorService {
    @C12706h
    C12690b<TypedInput> fetch(@C12699af String str, @C12694aa Map<String, String> map);

    @C12718t
    C12690b<TypedInput> report(@C12699af String str, @C12700b TypedOutput typedOutput, @C12710l List<C12685b> list);
}
