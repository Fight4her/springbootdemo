package utils;

/**
 * 异常错误代码
 * Created by Rambo on 2016/8/22.
 */
public enum ErrorCode {
    // 系统级别错误
    SYS_1000("1000" , "更新数据失败,请检查SQL参数有效性"),

    // 业务级别错误
    BIS_2000("2000" , "验证签名失败"),
    BIS_2001("2001" , "接口暂不支持获取设备证书的信息"),
    BIS_2002("2002" , "接口暂不支持获取机构员工证书的信息"),
    BIS_2003("2003" , "没有查到任何记录"),
    BIS_2004("2004" , "请求参数不合法,请参考接口文档定义"),
    BIS_2005("2005" , "除申请业务,其它业务类型的OID不能为空"),
    BIZ_5001("5001","请求参数不合法！"),

    // 其他级别错误
    OTH_3000("3000" , "字符编码转换失败,请将报文转换为UTF-8编码格式"),
    OTH_3001("3001" , "请求参数为空"),

    ///////////////以上是旧系统的自带的错误码定义/////////////////


    //////////////////新系统的错误码定义如下//////////////////////
    //此处对应wiki上的文档路径为：https://www.tapd.cn/20108411/markdown_wikis/view/#1120108411001001122

    //1.系统级别
    SYS_BUSY("-1","系统繁忙，请稍候再试"),
    SYS_200("200","请求成功"),
    SYS_204("204","请求成功，无数据返回"),
    SYS_300("300","请求重定向"),

    //2.前端请求出错类型
    REQUEST_40001("40001","请求参数异常，请检查后重试"),
    REQUEST_40002("40002","请求的数字证书无效"),
    REQUEST_40003("40003","上传的文件大小超过最大值"),
    REQUEST_40004("40004","上传文件失败"),
    REQUEST_40005("40005","获取文件详情失败"),
    REQUEST_40006("40006","请求的订单不存在"),
    REQUEST_40007("40007","被红冲的发票不存在"),
    REQUEST_40008("40008","发票已存在"),
    REQUEST_40009("40009","发票未生成"),
    REQUEST_40010("40010","发票未上传"),
    REQUEST_40011("40011","支付订单金额不正确！"),
    REQUEST_40012("40012","支付订单收款商户不正确！"),
    REQUEST_40013("40013","订单未支付！"),
    REQUEST_40014("40014","请求的订单GDCA未受理续期成功！"),
    REQUEST_40015("40015","请求新办的ODC电子印章已存在！"),
    REQUEST_40016("40016","请求新办的电子印章无印模！"),
    REQUEST_40017("40017","验证签名失败！"),
    REQUEST_40018("40018","电子印章不存在！"),
    REQUEST_40019("40019","验证电子印章失败!"),
    REQUEST_40020("40020","证书不存在！"),
    REQUEST_40021("40021","电子印章已过期！"),
    REQUEST_40022("40022","签名证书序列号！"),



    //3.服务器内部业务逻辑出错类型
    SERVER_50001("50001","服务器异常"),
    SERVER_50002("50002","请求微信接口服务失败"),
    SERVER_50003("50003","请求GDCA接口服务失败"),
    SERVER_50004("50004","请求百望接口服务失败"),
    SERVER_50005("50005","GDCA续期回调失败！"),
    SERVER_50006("50006","服务器电子印章信息不完整！"),

    //4.GDCA客户端组件 KEY操作异常(调用客户端控件错误码)
    COMPONENT_1("1", "获取CSP容器失败"),
    COMPONENT_2("2", "获取加密/签名公钥长度失败"),
    COMPONENT_3("3", "获取加密/签名公钥失败"),
    COMPONENT_4("4", "获取导出秘钥句柄失败"),
    COMPONENT_5("5", "获取公钥CER证书长度失败"),
    COMPONENT_6("6", "获取CER证书失败"),
    COMPONENT_7("7", "开辟内存空间失败"),
    COMPONENT_8("8", "密码错误"),
    COMPONENT_9("9", "创建Hash失败"),
    COMPONENT_10("10", "进行Hash运算失败"),
    COMPONENT_11("11", "获取签名数据长度失败"),
    COMPONENT_12("12", "获取签名数据失败"),
    COMPONENT_13("13", "验证签名失败"),
    COMPONENT_14("14", "根证书验证失败"),
    COMPONENT_15("15", "吊销列表失败"),
    COMPONENT_16("16", "获取CERT证书信息失败"),

    COMPONENT_100("100", "没有插入KEY"),
    COMPONENT_101("101", "打开设备失败"),
    COMPONENT_102("102", "密码错误"),
    COMPONENT_103("103", "KEY被锁"),
    COMPONENT_104("104", "登陆设备失败"),
    COMPONENT_105("105", "写入文件失败"),
    COMPONENT_106("106", "读文件失败"),
    COMPONENT_107("107", "不是创业印章授权的KEY"),
    COMPONENT_108("108", "获取KEY序列号失败"),
    COMPONENT_109("109", "更改用户密码失败"),
    COMPONENT_110("110", "更改写文件密码失败"),
    COMPONENT_111("111", "更改管理员密码 "),

    COMPONENT_502("502", "关闭KEY失败"),
    COMPONENT_503("503", "BASE64失败"),
    COMPONENT_504("504", "解BASE64数据失败"),

    COMPONENT_1001("1001", "获取CSP容器失败"),
    COMPONENT_1002("1002", "获取加密/签名公钥长度失败"),
    COMPONENT_1003("1003", "获取加密/签名公钥失败"),
    COMPONENT_1004("1004", "获取导出秘钥句柄失败"),
    COMPONENT_1005("1005", "获取公钥CER证书长度失败"),
    COMPONENT_1006("1006", "获取CER证书失败"),
    COMPONENT_1007("1007", "开辟内存空间失败"),
    COMPONENT_1009("1009", "创建Hash失败"),
    COMPONENT_1010("1010", "进行Hash运算失败"),
    COMPONENT_1011("1011", "获取签名数据长度失败"),
    COMPONENT_1012("1012", "获取签名数据失败"),
    COMPONENT_1013("1013", "验证签名失败"),
    COMPONENT_1014("1014", "根证书验证失败"),
    COMPONENT_1015("1015", "吊销列表失败"),
    COMPONENT_1016("1016", "获取CERT证书信息失败"),
    COMPONENT_1017("1017", "获取时间戳失败"),
    COMPONENT_1018("1018", "验证时间戳失败"),
    COMPONENT_1019("1019", "获取时间戳时间失败"),
    COMPONENT_1020("1020", "创业证书容器失败"),
    COMPONENT_1021("1021", "导入公钥KEY失败");

    private String code;

    private String msg;

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    ErrorCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 根据代码获取枚举名称
     */
    public static String getMsgByCode(String code) {
        for (ErrorCode errorCode : ErrorCode.values()) {
            if (errorCode.getCode().equals(code)) {
                return errorCode.getMsg();
            }
        }
        return null;
    }

    /**
     * 根据名称获取枚举代码
     */
    public static String getCodeByMsg(String msg) {
        for (ErrorCode errorCode : ErrorCode.values()) {
            if (errorCode.getMsg().equals(msg)) {
                return errorCode.getCode();
            }
        }
        return null;
    }

    /**
     * 根据代码获取枚举对象
     */
    public static ErrorCode getErrorCodeEnumByCode(String code) {
        for (ErrorCode errorCode : ErrorCode.values()) {
            if (errorCode.getCode().equals(code)) {
                return errorCode;
            }
        }
        return null;
    }

    /**
     * 根据名称获取枚举对象
     */
    public static ErrorCode getErrorCodeEnumByMsg(String msg) {
        for (ErrorCode errorCode : ErrorCode.values()) {
            if (errorCode.getMsg().equals(msg)) {
                return errorCode;
            }
        }
        return null;
    }
}
