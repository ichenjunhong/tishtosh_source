package com.p683ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.p659c.C10617a;
import com.bytedance.ies.p659c.C10618b;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_im_sdk_abtest_ImCommerceConfig */
public final class com_ss_android_ugc_aweme_im_sdk_abtest_ImCommerceConfig extends Message<com_ss_android_ugc_aweme_im_sdk_abtest_ImCommerceConfig, Builder> {
    public static final DefaultValueProtoAdapter<com_ss_android_ugc_aweme_im_sdk_abtest_ImCommerceConfig> ADAPTER = new C32833x9c94b36c();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 104066873)
    public final List<String> domain_list;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_im_sdk_abtest_ImCommerceConfig$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<com_ss_android_ugc_aweme_im_sdk_abtest_ImCommerceConfig, Builder> {
        public List<String> domain_list = Internal.newMutableList();

        public final com_ss_android_ugc_aweme_im_sdk_abtest_ImCommerceConfig build() {
            return new com_ss_android_ugc_aweme_im_sdk_abtest_ImCommerceConfig(this.domain_list, super.buildUnknownFields());
        }

        public final Builder domain_list(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.domain_list = list;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_im_sdk_abtest_ImCommerceConfig$ProtoAdapter_com_ss_android_ugc_aweme_im_sdk_abtest_ImCommerceConfig */
    static final class C32833x9c94b36c extends DefaultValueProtoAdapter<com_ss_android_ugc_aweme_im_sdk_abtest_ImCommerceConfig> {
        public final com_ss_android_ugc_aweme_im_sdk_abtest_ImCommerceConfig redact(com_ss_android_ugc_aweme_im_sdk_abtest_ImCommerceConfig com_ss_android_ugc_aweme_im_sdk_abtest_imcommerceconfig) {
            return com_ss_android_ugc_aweme_im_sdk_abtest_imcommerceconfig;
        }

        public C32833x9c94b36c() {
            super(FieldEncoding.LENGTH_DELIMITED, com_ss_android_ugc_aweme_im_sdk_abtest_ImCommerceConfig.class);
        }

        public final com_ss_android_ugc_aweme_im_sdk_abtest_ImCommerceConfig decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (com_ss_android_ugc_aweme_im_sdk_abtest_ImCommerceConfig) null);
        }

        public final int encodedSize(com_ss_android_ugc_aweme_im_sdk_abtest_ImCommerceConfig com_ss_android_ugc_aweme_im_sdk_abtest_imcommerceconfig) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(104066873, com_ss_android_ugc_aweme_im_sdk_abtest_imcommerceconfig.domain_list) + com_ss_android_ugc_aweme_im_sdk_abtest_imcommerceconfig.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, com_ss_android_ugc_aweme_im_sdk_abtest_ImCommerceConfig com_ss_android_ugc_aweme_im_sdk_abtest_imcommerceconfig) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 104066873, com_ss_android_ugc_aweme_im_sdk_abtest_imcommerceconfig.domain_list);
            protoWriter.writeBytes(com_ss_android_ugc_aweme_im_sdk_abtest_imcommerceconfig.unknownFields());
        }

        public final com_ss_android_ugc_aweme_im_sdk_abtest_ImCommerceConfig decode(ProtoReader protoReader, com_ss_android_ugc_aweme_im_sdk_abtest_ImCommerceConfig com_ss_android_ugc_aweme_im_sdk_abtest_imcommerceconfig) throws IOException {
            Builder builder;
            com_ss_android_ugc_aweme_im_sdk_abtest_ImCommerceConfig com_ss_android_ugc_aweme_im_sdk_abtest_imcommerceconfig2 = (com_ss_android_ugc_aweme_im_sdk_abtest_ImCommerceConfig) C10617a.m21405a().mo18840a(com_ss_android_ugc_aweme_im_sdk_abtest_ImCommerceConfig.class, com_ss_android_ugc_aweme_im_sdk_abtest_imcommerceconfig);
            if (com_ss_android_ugc_aweme_im_sdk_abtest_imcommerceconfig2 != null) {
                builder = com_ss_android_ugc_aweme_im_sdk_abtest_imcommerceconfig2.newBuilder();
            } else {
                builder = new Builder();
            }
            List<String> newMutableList = Internal.newMutableList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder.domain_list = newMutableList;
                    }
                    return builder.build();
                } else if (nextTag != 104066873) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (C10618b e) {
                        if (com_ss_android_ugc_aweme_im_sdk_abtest_imcommerceconfig2 == null) {
                            throw e;
                        }
                    }
                } else {
                    newMutableList.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }
    }

    public final List<String> getDomainList() {
        return this.domain_list;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (unknownFields().hashCode() * 37) + this.domain_list.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.domain_list = Internal.copyOf("domain_list", this.domain_list);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.domain_list.isEmpty()) {
            sb.append(", domain_list=");
            sb.append(this.domain_list);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_ugc_aweme_im_sdk_abtest_ImCommerceConfig{");
        replace.append('}');
        return replace.toString();
    }

    public com_ss_android_ugc_aweme_im_sdk_abtest_ImCommerceConfig(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com_ss_android_ugc_aweme_im_sdk_abtest_ImCommerceConfig)) {
            return false;
        }
        com_ss_android_ugc_aweme_im_sdk_abtest_ImCommerceConfig com_ss_android_ugc_aweme_im_sdk_abtest_imcommerceconfig = (com_ss_android_ugc_aweme_im_sdk_abtest_ImCommerceConfig) obj;
        if (!unknownFields().equals(com_ss_android_ugc_aweme_im_sdk_abtest_imcommerceconfig.unknownFields()) || !this.domain_list.equals(com_ss_android_ugc_aweme_im_sdk_abtest_imcommerceconfig.domain_list)) {
            return false;
        }
        return true;
    }

    public com_ss_android_ugc_aweme_im_sdk_abtest_ImCommerceConfig(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.domain_list = Internal.immutableCopyOf("domain_list", list);
    }
}
