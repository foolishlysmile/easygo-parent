package cn.easygo.mall.basic.util;

/***
 * @ClassName: AjaxResult
 * @Description: 返回ajax请求的数据
 * @Auther: glw
 * @Date: 2019/01/27 09:18:20
 * @version : V1.0
 */

public class AjaxResult {

    private Boolean success;

    private String message;

    private Object returnData;

    public Boolean getSuccess() {
        return success;
    }

    public AjaxResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getReturnData() {
        return returnData;
    }

    public AjaxResult setReturnData(Object returnData) {
        this.returnData = returnData;
        return this;
    }

    public static AjaxResult getInstance(){
        return new AjaxResult();
    }

}
