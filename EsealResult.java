package model;

import utils.ErrorCode;

/**
 * @author:liushuqiao
 * @title: EsealResutl
 * @description:安印电子管理平台的统一返回类
 * @date: 16:26 2017/6/30
 * @version: v1.0.0
 */
public class EsealResult {
    //请求的标识符，0为成功1为失败
    private int code = 0;
    //请求的消息
    private String msg;
    //需要返回的数据
    private Object data;

    //默认无参构造器
    public EsealResult() {
        this.setDefSuc();
    }

    //不带数据构造器
    public EsealResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    //带数据的构造器
    public EsealResult(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    //带ErrorCode的构造器
    public EsealResult(ErrorCode errorCode) {
        this.code = Integer.parseInt(errorCode.getCode());
        this.msg = errorCode.getMsg();
    }

    //设置默认请求成功
    public void setDefSuc() {
        this.code = 0;
        this.msg = "请求成功";
    }

    //设置默认请求失败
    public void setDefFail(String msg) {
        this.code = 1;
        this.msg = msg!=null?msg: "请求失败";
    }

    //设置ErroCode的请求失败
    public void setFailCode(ErrorCode errorCode) {
        this.code = Integer.parseInt(errorCode.getCode());
        this.msg = errorCode.getMsg();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "EsealResutl{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
