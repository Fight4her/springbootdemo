package controller;

import exception.ServiceException;
import model.EsealResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import utils.ErrorCode;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author liushuqiao
 * @version v1.0.0
 * @title: BaseController
 * @description: 控制层的父类，用于处理控制层公共的事务
 * @date 2017/4/10 17:40
 */
@ControllerAdvice
public class BaseController {

    protected static final Logger log = LoggerFactory.getLogger(BaseController.class);

    protected EsealResult result;

    /**
     * 这里用来统一处理参数异常，防止restful风格注解时的参数解析出错
     *
     * @param ex
     * @param req
     * @return eseal
     * @author liushuqiao
     * @date 2017-04-10
     */
    @ExceptionHandler(Exception.class)
    public
    @ResponseBody
    EsealResult handleParameterException(final Exception ex, final WebRequest req) {

        result = new EsealResult();
        log.error(" BaseController handleParameterException error: {}", ex.getLocalizedMessage());
        ex.printStackTrace();
        //把请求参数出错用自定义提示返回给前端！
        if (ex.getClass().getName().equals(MaxUploadSizeExceededException.class.getName()))
            this.result.setFailCode(ErrorCode.REQUEST_40003);
        else
            this.result.setFailCode(ErrorCode.REQUEST_40001);
        return this.result;
    }

    /**
     * 处理异常
     *
     * @param e
     */
    protected void handleError(Exception e) {
        result = new EsealResult();
        log.error("服务器出错，出错原因为：{}", e.getMessage());
        if (e instanceof ServiceException && (((ServiceException) e).getErrorCode() != null)) {
            result.setFailCode(((ServiceException) e).getErrorCode());
        } else {
            //其他ErrorCode未定义的异常，都统一称为服务器异常，不把详尽信息报给接口调用者，错误信息写日志
            result.setFailCode(ErrorCode.SERVER_50001);
        }
    }

    /**
     * 处理异常,可以指定errorCode
     *
     * @param errorCode
     */
    protected void handleError(ErrorCode errorCode) {
        result = new EsealResult();
        log.error("服务器出错，出错原因为：{}", errorCode.toString());
        result.setFailCode(errorCode);
    }

    /**
     * 处理正常返回数据
     *
     * @param object
     */
    protected void handleSuc(Object object) {
        result = new EsealResult();
        result.setData(object);
    }

    /**
     * 数据绑定重新定义：String格式日期自动转Date格式
     *
     * @param binder
     */
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

}

